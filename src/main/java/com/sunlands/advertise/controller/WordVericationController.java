package com.sunlands.advertise.controller;

import com.sunlands.advertise.core.ADResponse;
import com.sunlands.advertise.dto.WordVerifyDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/word")
public class WordVericationController {

    @RequestMapping("/verify")
    public ADResponse verify(){
        ADResponse response = new ADResponse();
        List<WordVerifyDTO> list = new ArrayList<>();
        initList(list);
        response.setCount(list.size());
        response.setADResponse(0,"").setADResponseData(list);
        return response;
    }

    private void initList(List<WordVerifyDTO> list){
        for (int i = 1; i <= 100; i ++){
            WordVerifyDTO wvdto = new WordVerifyDTO();
            wvdto.setId(Long.valueOf(i));
            wvdto.setText("lkdalsks45djsdjaasdajkss54d6s" + i);
            double d = Math.random();
            BigDecimal bg = new BigDecimal(d);
            d = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            if(d >= 0.9){
                wvdto.setType("审核通过");
            } else if(d < 0.9 && d > 0.7){
                wvdto.setType("待定");
                wvdto.setHit("lkdalsk");
            } else{
                wvdto.setType("违规");
                wvdto.setHit("lkdalsk,jsdja,asdajks");
            }
            wvdto.setScore(d);
            list.add(wvdto);
        }
    }
}
