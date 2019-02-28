package com.zhiyuan.frank.pojo;

public class SchargElaunch {
    private Integer sclId;

    private Integer sclNumber;

    private Integer sclMonth;

    private String sclRecordtime;

    private String sclLasttime;

    private Integer sclStatus;

    public Integer getSclId() {
        return sclId;
    }

    public void setSclId(Integer sclId) {
        this.sclId = sclId;
    }

    public Integer getSclNumber() {
        return sclNumber;
    }

    public void setSclNumber(Integer sclNumber) {
        this.sclNumber = sclNumber;
    }

    public Integer getSclMonth() {
        return sclMonth;
    }

    public void setSclMonth(Integer sclMonth) {
        this.sclMonth = sclMonth;
    }

    public String getSclRecordtime() {
        return sclRecordtime;
    }

    public void setSclRecordtime(String sclRecordtime) {
        this.sclRecordtime = sclRecordtime == null ? null : sclRecordtime.trim();
    }

    public String getSclLasttime() {
        return sclLasttime;
    }

    public void setSclLasttime(String sclLasttime) {
        this.sclLasttime = sclLasttime == null ? null : sclLasttime.trim();
    }

    public Integer getSclStatus() {
        return sclStatus;
    }

    public void setSclStatus(Integer sclStatus) {
        this.sclStatus = sclStatus;
    }
}