package com.sunlands.advertise.dto;

import java.math.BigDecimal;

/**
 *
 */
public class SimilarTextResult {

    private String mostSimilarText;

    private BigDecimal different;

    private Long mostSimilarTextId;

    public String getMostSimilarText() {
        return mostSimilarText;
    }

    public void setMostSimilarText(String mostSimilarText) {
        this.mostSimilarText = mostSimilarText;
    }

    public BigDecimal getDifferent() {
        return different;
    }

    public void setDifferent(BigDecimal different) {
        this.different = different;
    }

    public Long getMostSimilarTextId() {
        return mostSimilarTextId;
    }

    public void setMostSimilarTextId(Long mostSimilarTextId) {
        this.mostSimilarTextId = mostSimilarTextId;
    }
}
