package com.sunlands.advertise.controller;

import com.sunlands.advertise.core.ADResponse;
import com.sunlands.advertise.dto.BlackWordSuggestWords;
import com.sunlands.advertise.mapper.MasterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/blackWord")
public class BlackWordController {

    @Autowired
    MasterDao masterDao;

    @RequestMapping("/generateTextHashCode")
    public ADResponse generateTextHashCode() {
        ADResponse response = new ADResponse();
        List<BlackWordSuggestWords> list = masterDao.listBlackWord();
        response.setCode(0);
        response.setMessage("");
        response.setData(list);
        return response;
    }
}
