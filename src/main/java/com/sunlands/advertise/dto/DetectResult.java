package com.sunlands.advertise.dto;

/**
 *
 */
public class DetectResult {

    private String targetText;

    private String resultType;

    private Double averageScore;


    // 中文文字相似
    private Double charCommonScore;

    private String charCommonSimiBaseText;

    private String charCommonSimiCommonText;

    // 中文词语相似
    private Double wordCommonScore;

    private String wordCommonSimiBaseText;

    private String wordCommonSimiCommonText;

    // 公共子串相似

    private Double subCommonScore;

    private String subCommonSimiBaseText;

    private String subCommonSimiCommonText;

    // 哈希相似

    private Double hashCommonScore;

    private String hashCommonSimiBaseText;

    private String hashCommonSimiCommonText;

    //
    private String realResult;

    public String getTargetText() {
        return targetText;
    }

    public void setTargetText(String targetText) {
        this.targetText = targetText;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public Double getCharCommonScore() {
        return charCommonScore;
    }

    public void setCharCommonScore(Double charCommonScore) {
        this.charCommonScore = charCommonScore;
    }

    public String getCharCommonSimiBaseText() {
        return charCommonSimiBaseText;
    }

    public void setCharCommonSimiBaseText(String charCommonSimiBaseText) {
        this.charCommonSimiBaseText = charCommonSimiBaseText;
    }

    public String getCharCommonSimiCommonText() {
        return charCommonSimiCommonText;
    }

    public void setCharCommonSimiCommonText(String charCommonSimiCommonText) {
        this.charCommonSimiCommonText = charCommonSimiCommonText;
    }

    public Double getWordCommonScore() {
        return wordCommonScore;
    }

    public void setWordCommonScore(Double wordCommonScore) {
        this.wordCommonScore = wordCommonScore;
    }

    public String getWordCommonSimiBaseText() {
        return wordCommonSimiBaseText;
    }

    public void setWordCommonSimiBaseText(String wordCommonSimiBaseText) {
        this.wordCommonSimiBaseText = wordCommonSimiBaseText;
    }

    public String getWordCommonSimiCommonText() {
        return wordCommonSimiCommonText;
    }

    public void setWordCommonSimiCommonText(String wordCommonSimiCommonText) {
        this.wordCommonSimiCommonText = wordCommonSimiCommonText;
    }

    public Double getSubCommonScore() {
        return subCommonScore;
    }

    public void setSubCommonScore(Double subCommonScore) {
        this.subCommonScore = subCommonScore;
    }

    public String getSubCommonSimiBaseText() {
        return subCommonSimiBaseText;
    }

    public void setSubCommonSimiBaseText(String subCommonSimiBaseText) {
        this.subCommonSimiBaseText = subCommonSimiBaseText;
    }

    public String getSubCommonSimiCommonText() {
        return subCommonSimiCommonText;
    }

    public void setSubCommonSimiCommonText(String subCommonSimiCommonText) {
        this.subCommonSimiCommonText = subCommonSimiCommonText;
    }

    public Double getHashCommonScore() {
        return hashCommonScore;
    }

    public void setHashCommonScore(Double hashCommonScore) {
        this.hashCommonScore = hashCommonScore;
    }

    public String getHashCommonSimiBaseText() {
        return hashCommonSimiBaseText;
    }

    public void setHashCommonSimiBaseText(String hashCommonSimiBaseText) {
        this.hashCommonSimiBaseText = hashCommonSimiBaseText;
    }

    public String getHashCommonSimiCommonText() {
        return hashCommonSimiCommonText;
    }

    public void setHashCommonSimiCommonText(String hashCommonSimiCommonText) {
        this.hashCommonSimiCommonText = hashCommonSimiCommonText;
    }

    public String getRealResult() {
        return realResult;
    }

    public void setRealResult(String realResult) {
        this.realResult = realResult;
    }
}
