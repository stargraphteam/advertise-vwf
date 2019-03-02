package com.sunlands.advertise.service;

import com.sunlands.advertise.dto.IllegalTextInfo;

import java.util.List;

/**
 *
 */
public interface TextIllegalService {
    String getHashCode(String text);

    void generateTextHashCode();

    List<IllegalTextInfo> listAllIllegalText();
}
