package com.zhiyuan.frank.pojo;

public class Shonour {
    private Integer shId;

    private Integer sNumber;

    private String shName;

    private String shTiem;

    private String shDescript;

    private String shRecordtime;

    private String shLasttime;

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public String getShName() {
        return shName;
    }

    public void setShName(String shName) {
        this.shName = shName == null ? null : shName.trim();
    }

    public String getShTiem() {
        return shTiem;
    }

    public void setShTiem(String shTiem) {
        this.shTiem = shTiem == null ? null : shTiem.trim();
    }

    public String getShDescript() {
        return shDescript;
    }

    public void setShDescript(String shDescript) {
        this.shDescript = shDescript == null ? null : shDescript.trim();
    }

    public String getShRecordtime() {
        return shRecordtime;
    }

    public void setShRecordtime(String shRecordtime) {
        this.shRecordtime = shRecordtime == null ? null : shRecordtime.trim();
    }

    public String getShLasttime() {
        return shLasttime;
    }

    public void setShLasttime(String shLasttime) {
        this.shLasttime = shLasttime == null ? null : shLasttime.trim();
    }
}