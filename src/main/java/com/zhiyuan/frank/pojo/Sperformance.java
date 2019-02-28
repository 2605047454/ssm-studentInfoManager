package com.zhiyuan.frank.pojo;

public class Sperformance {
    private Integer spPid;

    private Integer spNumber;

    private Integer spZh;

    private Integer spMath;

    private Integer spEn;

    private Integer spMusic;

    private Integer spSport;

    private Integer spArt;

    private Integer spProfession;

    private Integer spPtype;

    private String spRecordtime;

    private String spLasttime;

    public Integer getSpPid() {
        return spPid;
    }

    public void setSpPid(Integer spPid) {
        this.spPid = spPid;
    }

    public Integer getSpNumber() {
        return spNumber;
    }

    public void setSpNumber(Integer spNumber) {
        this.spNumber = spNumber;
    }

    public Integer getSpZh() {
        return spZh;
    }

    public void setSpZh(Integer spZh) {
        this.spZh = spZh;
    }

    public Integer getSpMath() {
        return spMath;
    }

    public void setSpMath(Integer spMath) {
        this.spMath = spMath;
    }

    public Integer getSpEn() {
        return spEn;
    }

    public void setSpEn(Integer spEn) {
        this.spEn = spEn;
    }

    public Integer getSpMusic() {
        return spMusic;
    }

    public void setSpMusic(Integer spMusic) {
        this.spMusic = spMusic;
    }

    public Integer getSpSport() {
        return spSport;
    }

    public void setSpSport(Integer spSport) {
        this.spSport = spSport;
    }

    public Integer getSpArt() {
        return spArt;
    }

    public void setSpArt(Integer spArt) {
        this.spArt = spArt;
    }

    public Integer getSpProfession() {
        return spProfession;
    }

    public void setSpProfession(Integer spProfession) {
        this.spProfession = spProfession;
    }

    public Integer getSpPtype() {
        return spPtype;
    }

    public void setSpPtype(Integer spPtype) {
        this.spPtype = spPtype;
    }

    public String getSpRecordtime() {
        return spRecordtime;
    }

    public void setSpRecordtime(String spRecordtime) {
        this.spRecordtime = spRecordtime == null ? null : spRecordtime.trim();
    }

    public String getSpLasttime() {
        return spLasttime;
    }

    public void setSpLasttime(String spLasttime) {
        this.spLasttime = spLasttime == null ? null : spLasttime.trim();
    }
}