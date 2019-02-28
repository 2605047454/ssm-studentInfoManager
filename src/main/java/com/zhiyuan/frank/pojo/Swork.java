package com.zhiyuan.frank.pojo;

public class Swork {
    private Integer swId;

    private Integer sNumber;

    private String swType;

    private Integer swStatus;

    private String swApproval;

    private String swRecordtime;

    private String swLasttime;

    public Integer getSwId() {
        return swId;
    }

    public void setSwId(Integer swId) {
        this.swId = swId;
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public String getSwType() {
        return swType;
    }

    public void setSwType(String swType) {
        this.swType = swType == null ? null : swType.trim();
    }

    public Integer getSwStatus() {
        return swStatus;
    }

    public void setSwStatus(Integer swStatus) {
        this.swStatus = swStatus;
    }

    public String getSwApproval() {
        return swApproval;
    }

    public void setSwApproval(String swApproval) {
        this.swApproval = swApproval == null ? null : swApproval.trim();
    }

    public String getSwRecordtime() {
        return swRecordtime;
    }

    public void setSwRecordtime(String swRecordtime) {
        this.swRecordtime = swRecordtime == null ? null : swRecordtime.trim();
    }

    public String getSwLasttime() {
        return swLasttime;
    }

    public void setSwLasttime(String swLasttime) {
        this.swLasttime = swLasttime == null ? null : swLasttime.trim();
    }
}