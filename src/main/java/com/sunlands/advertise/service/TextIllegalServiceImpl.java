package com.sunlands.advertise.service;

import com.sunlands.advertise.dto.IllegalTextInfo;
import com.sunlands.advertise.mapper.MasterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *
 */
@Service
public class TextIllegalServiceImpl implements TextIllegalService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    MasterDao masterDao;

    @Override
    public String getHashCode(String text) {
        HttpHeaders headers = new HttpHeaders();
        String uri = "http://172.16.4.70:11201/?s=" + text;
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String body = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();
        return body;
    }

    @Override
    public void generateTextHashCode() {
        List<IllegalTextInfo> illegalTextInfos = masterDao.listIllegalText();
        for (IllegalTextInfo textInfo : illegalTextInfos) {
            String textContent = textInfo.getTextContent();
            Long textId = textInfo.getTextId();
            String hashCode = getHashCode(textContent);
            masterDao.updateTextHashCode(textId, hashCode);
        }
    }

    @Override
    public List<IllegalTextInfo> listAllIllegalText() {
        return masterDao.listAllIllegalText();
    }


}
