package com.sunlands.advertise.dto;

public class WordVerifyDTO {
    private Long id;
    private String text;    // 词语或句子
    private String hit;     // 违规词
    private String type;    // 违规类型：违规、不违规、待定
    private Double score;   // 评分

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
