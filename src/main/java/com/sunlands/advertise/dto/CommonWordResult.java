package com.sunlands.advertise.dto;

/**
 *
 */
public class CommonWordResult {
    private String comparedText;
    private String commonWord;
    private Integer commonValue;
    private Double similarity;

    public String getComparedText() {
        return comparedText;
    }

    public void setComparedText(String comparedText) {
        this.comparedText = comparedText;
    }

    public String getCommonWord() {
        return commonWord;
    }

    public void setCommonWord(String commonWord) {
        this.commonWord = commonWord;
    }

    public Integer getCommonValue() {
        return commonValue;
    }

    public void setCommonValue(Integer commonValue) {
        this.commonValue = commonValue;
    }

    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }
}
