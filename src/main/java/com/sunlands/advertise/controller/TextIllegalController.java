package com.sunlands.advertise.controller;

import com.sunlands.advertise.core.ADResponse;
import com.sunlands.advertise.dto.CommonWordResult;
import com.sunlands.advertise.dto.DetectResult;
import com.sunlands.advertise.dto.IllegalTextInfo;
import com.sunlands.advertise.dto.SimilarTextResult;
import com.sunlands.advertise.service.TextIllegalService;
import com.sunlands.advertise.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 */
@RestController
@RequestMapping("/text")
public class TextIllegalController {

    @Autowired
    TextIllegalService textIllegalService;

    @RequestMapping("/getIllegalValue/{text}")
    public ADResponse getIllegalValue(@PathVariable(name = "text") String text) {
        ADResponse response = new ADResponse();
        String targetHashCode = textIllegalService.getHashCode(text);
        BigDecimal targetHashValue = new BigDecimal(targetHashCode);
        List<IllegalTextInfo> textInfoList = textIllegalService.listAllIllegalText();
        List<SimilarTextResult> similarTextResultList = new ArrayList<>();
        for (IllegalTextInfo textCodeInfo : textInfoList) {
            String hashCode = textCodeInfo.getHashCode();
            BigDecimal hashValue = new BigDecimal(hashCode);
            String textContent = textCodeInfo.getTextContent();
            Long textId = textCodeInfo.getTextId();
            SimilarTextResult similarTextResult = new SimilarTextResult();
            similarTextResult.setMostSimilarText(textContent);
            similarTextResult.setMostSimilarTextId(textId);
            similarTextResult.setDifferent(targetHashValue.subtract(hashValue).abs());
            similarTextResultList.add(similarTextResult);
        }
        similarTextResultList.sort(new Comparator<SimilarTextResult>() {
            @Override
            public int compare(SimilarTextResult o1, SimilarTextResult o2) {
                return o1.getDifferent().compareTo(o2.getDifferent());
            }
        });


        response.setData(similarTextResultList);
        return response;
    }

    @RequestMapping("/generateTextHashCode")
    public ADResponse generateTextHashCode() {
        ADResponse response = new ADResponse();
        textIllegalService.generateTextHashCode();
        return response;
    }

    @RequestMapping("/getSimilarCommonWord/{text}")
    public ADResponse getSimilarCommonWord(@PathVariable(name = "text") String text) {
        ADResponse response = new ADResponse();
        List<CommonWordResult> similarTextResultList = new ArrayList<>();
        List<IllegalTextInfo> illegalTextInfos = textIllegalService.listAllIllegalText();
        for (IllegalTextInfo textCodeInfo : illegalTextInfos) {
            String textContent = textCodeInfo.getTextContent();
            Long textId = textCodeInfo.getTextId();
            String commonWord = StringUtil.getAllCommonWord(text, textContent);
            CommonWordResult result = new CommonWordResult();
            result.setComparedText(textContent);
            result.setCommonWord(commonWord);
            result.setCommonValue(commonWord.length());
            result.setSimilarity((double)commonWord.length() / (double) text.length());
            similarTextResultList.add(result);

        }
        similarTextResultList = similarTextResultList.stream().
                sorted(Comparator.comparing(CommonWordResult::getCommonValue).reversed()).collect(Collectors.toList());
        response.setData(similarTextResultList);
        return response;
    }

    @RequestMapping("/getDetectResult")
    public ADResponse getDetectResult() {
        ADResponse response = new ADResponse();
        List<DetectResult> results = new ArrayList<>();
        DetectResult result = new DetectResult();
        result.setTargetText("3小时");
        result.setResultType("违规");
        result.setAverageScore(1.0D);
        result.setCharCommonScore(1.0D);
        result.setCharCommonSimiBaseText("备战自考 3小时 学会中国近现代史");
        result.setCharCommonSimiCommonText("3小时");
        result.setWordCommonScore(1.0D);
        result.setWordCommonSimiBaseText("备战自考 3小时 学会中国近现代史");
        result.setWordCommonSimiCommonText("3小时");
        result.setSubCommonScore(1.0D);
        result.setSubCommonSimiBaseText("备战自考 3小时 学会中国近现代史");
        result.setSubCommonSimiCommonText("3小时");
        result.setHashCommonScore(1.0D);
        result.setHashCommonSimiBaseText("备战自考 3小时 学会中国近现代史");
        result.setHashCommonSimiCommonText("");
        result.setRealResult("");
        results.add(result);
        response.setCode(0);
        response.setMessage("");
        response.setData(results);
        return response;
    }




}
