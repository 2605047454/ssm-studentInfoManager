package com.zhiyuan.frank.pojo;

public class Sclass {
    private Integer sclId;

    private String sclName;

    public Integer getSclId() {
        return sclId;
    }

    public void setSclId(Integer sclId) {
        this.sclId = sclId;
    }

    public String getSclName() {
        return sclName;
    }

    public void setSclName(String sclName) {
        this.sclName = sclName == null ? null : sclName.trim();
    }
}