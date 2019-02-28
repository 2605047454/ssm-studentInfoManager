package com.zhiyuan.frank.pojo;

public class Sprofession {
    private Integer sprId;

    private String sprName;

    public Integer getSprId() {
        return sprId;
    }

    public void setSprId(Integer sprId) {
        this.sprId = sprId;
    }

    public String getSprName() {
        return sprName;
    }

    public void setSprName(String sprName) {
        this.sprName = sprName == null ? null : sprName.trim();
    }
}