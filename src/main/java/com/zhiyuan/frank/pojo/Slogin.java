package com.zhiyuan.frank.pojo;

public class Slogin {
    private Integer slId;

    private String slIdcard;

    private Integer slStatus;

    private String slBeforetime;

    private String slLasttime;

    private Integer slType;

    public Integer getSlId() {
        return slId;
    }

    public void setSlId(Integer slId) {
        this.slId = slId;
    }

    public String getSlIdcard() {
        return slIdcard;
    }

    public void setSlIdcard(String slIdcard) {
        this.slIdcard = slIdcard == null ? null : slIdcard.trim();
    }

    public Integer getSlStatus() {
        return slStatus;
    }

    public void setSlStatus(Integer slStatus) {
        this.slStatus = slStatus;
    }

    public String getSlBeforetime() {
        return slBeforetime;
    }

    public void setSlBeforetime(String slBeforetime) {
        this.slBeforetime = slBeforetime == null ? null : slBeforetime.trim();
    }

    public String getSlLasttime() {
        return slLasttime;
    }

    public void setSlLasttime(String slLasttime) {
        this.slLasttime = slLasttime == null ? null : slLasttime.trim();
    }

    public Integer getSlType() {
        return slType;
    }

    public void setSlType(Integer slType) {
        this.slType = slType;
    }
}