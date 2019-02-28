package com.zhiyuan.frank.pojo;

public class Scharge {
    private Integer scId;

    private Integer sNumber;

    private Integer scHouse;

    private Integer scLearn;

    private Integer scClass;

    private Integer scWater;

    private Integer scMilitary;

    private String scOther;

    private Integer scStatus;

    private String scRecordtime;

    private String scLasttime;

    private Integer scDegree;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public Integer getScHouse() {
        return scHouse;
    }

    public void setScHouse(Integer scHouse) {
        this.scHouse = scHouse;
    }

    public Integer getScLearn() {
        return scLearn;
    }

    public void setScLearn(Integer scLearn) {
        this.scLearn = scLearn;
    }

    public Integer getScClass() {
        return scClass;
    }

    public void setScClass(Integer scClass) {
        this.scClass = scClass;
    }

    public Integer getScWater() {
        return scWater;
    }

    public void setScWater(Integer scWater) {
        this.scWater = scWater;
    }

    public Integer getScMilitary() {
        return scMilitary;
    }

    public void setScMilitary(Integer scMilitary) {
        this.scMilitary = scMilitary;
    }

    public String getScOther() {
        return scOther;
    }

    public void setScOther(String scOther) {
        this.scOther = scOther == null ? null : scOther.trim();
    }

    public Integer getScStatus() {
        return scStatus;
    }

    public void setScStatus(Integer scStatus) {
        this.scStatus = scStatus;
    }

    public String getScRecordtime() {
        return scRecordtime;
    }

    public void setScRecordtime(String scRecordtime) {
        this.scRecordtime = scRecordtime == null ? null : scRecordtime.trim();
    }

    public String getScLasttime() {
        return scLasttime;
    }

    public void setScLasttime(String scLasttime) {
        this.scLasttime = scLasttime == null ? null : scLasttime.trim();
    }

    public Integer getScDegree() {
        return scDegree;
    }

    public void setScDegree(Integer scDegree) {
        this.scDegree = scDegree;
    }
}