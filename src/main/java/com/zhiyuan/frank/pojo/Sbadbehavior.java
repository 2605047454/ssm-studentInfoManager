package com.zhiyuan.frank.pojo;

public class Sbadbehavior {
    private Integer sbId;

    private Integer sNumber;

    private String sbDescript;

    private String sbApproval;

    private String sbAppendtime;

    private String sbResult;

    private String sbAccessory;

    private String sbRecordtime;

    private String sbLasttime;

    public Integer getSbId() {
        return sbId;
    }

    public void setSbId(Integer sbId) {
        this.sbId = sbId;
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public String getSbDescript() {
        return sbDescript;
    }

    public void setSbDescript(String sbDescript) {
        this.sbDescript = sbDescript == null ? null : sbDescript.trim();
    }

    public String getSbApproval() {
        return sbApproval;
    }

    public void setSbApproval(String sbApproval) {
        this.sbApproval = sbApproval == null ? null : sbApproval.trim();
    }

    public String getSbAppendtime() {
        return sbAppendtime;
    }

    public void setSbAppendtime(String sbAppendtime) {
        this.sbAppendtime = sbAppendtime == null ? null : sbAppendtime.trim();
    }

    public String getSbResult() {
        return sbResult;
    }

    public void setSbResult(String sbResult) {
        this.sbResult = sbResult == null ? null : sbResult.trim();
    }

    public String getSbAccessory() {
        return sbAccessory;
    }

    public void setSbAccessory(String sbAccessory) {
        this.sbAccessory = sbAccessory == null ? null : sbAccessory.trim();
    }

    public String getSbRecordtime() {
        return sbRecordtime;
    }

    public void setSbRecordtime(String sbRecordtime) {
        this.sbRecordtime = sbRecordtime == null ? null : sbRecordtime.trim();
    }

    public String getSbLasttime() {
        return sbLasttime;
    }

    public void setSbLasttime(String sbLasttime) {
        this.sbLasttime = sbLasttime == null ? null : sbLasttime.trim();
    }
}