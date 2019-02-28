package com.zhiyuan.frank.pojo;

public class Sreg {
    private Integer swId;

    private String srName;

    private String srIdcard;

    private Integer srNumber;

    private String srQuestion;

    private String srAnswer;

    private String srPw;

    private String srTime;

    public Integer getSwId() {
        return swId;
    }

    public void setSwId(Integer swId) {
        this.swId = swId;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName == null ? null : srName.trim();
    }

    public String getSrIdcard() {
        return srIdcard;
    }

    public void setSrIdcard(String srIdcard) {
        this.srIdcard = srIdcard == null ? null : srIdcard.trim();
    }

    public Integer getSrNumber() {
        return srNumber;
    }

    public void setSrNumber(Integer srNumber) {
        this.srNumber = srNumber;
    }

    public String getSrQuestion() {
        return srQuestion;
    }

    public void setSrQuestion(String srQuestion) {
        this.srQuestion = srQuestion == null ? null : srQuestion.trim();
    }

    public String getSrAnswer() {
        return srAnswer;
    }

    public void setSrAnswer(String srAnswer) {
        this.srAnswer = srAnswer == null ? null : srAnswer.trim();
    }

    public String getSrPw() {
        return srPw;
    }

    public void setSrPw(String srPw) {
        this.srPw = srPw == null ? null : srPw.trim();
    }

    public String getSrTime() {
        return srTime;
    }

    public void setSrTime(String srTime) {
        this.srTime = srTime == null ? null : srTime.trim();
    }
}