package com.sunlands.advertise.dto;

/**
 *
 */
public class BlackWordSuggestWords {
    private Long blackWordId;

    private String blackWord;

    private String suggestWords;

    public Long getBlackWordId() {
        return blackWordId;
    }

    public void setBlackWordId(Long blackWordId) {
        this.blackWordId = blackWordId;
    }

    public String getBlackWord() {
        return blackWord;
    }

    public void setBlackWord(String blackWord) {
        this.blackWord = blackWord;
    }

    public String getSuggestWords() {
        return suggestWords;
    }

    public void setSuggestWords(String suggestWords) {
        this.suggestWords = suggestWords;
    }
}
