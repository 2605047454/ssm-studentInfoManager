package com.zhiyuan.frank.pojo;

public class Saattendance {
    private Integer saId;

    private Integer sNumber;

    private Integer saLate;

    private Integer saTruant;

    private Integer saLeave;

    private Integer saSkipclass;

    private Integer saWork;

    private String saRecordtime;

    private String saLasttime;

    private Integer saGrade;

    public Integer getSaId() {
        return saId;
    }

    public void setSaId(Integer saId) {
        this.saId = saId;
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public Integer getSaLate() {
        return saLate;
    }

    public void setSaLate(Integer saLate) {
        this.saLate = saLate;
    }

    public Integer getSaTruant() {
        return saTruant;
    }

    public void setSaTruant(Integer saTruant) {
        this.saTruant = saTruant;
    }

    public Integer getSaLeave() {
        return saLeave;
    }

    public void setSaLeave(Integer saLeave) {
        this.saLeave = saLeave;
    }

    public Integer getSaSkipclass() {
        return saSkipclass;
    }

    public void setSaSkipclass(Integer saSkipclass) {
        this.saSkipclass = saSkipclass;
    }

    public Integer getSaWork() {
        return saWork;
    }

    public void setSaWork(Integer saWork) {
        this.saWork = saWork;
    }

    public String getSaRecordtime() {
        return saRecordtime;
    }

    public void setSaRecordtime(String saRecordtime) {
        this.saRecordtime = saRecordtime == null ? null : saRecordtime.trim();
    }

    public String getSaLasttime() {
        return saLasttime;
    }

    public void setSaLasttime(String saLasttime) {
        this.saLasttime = saLasttime == null ? null : saLasttime.trim();
    }

    public Integer getSaGrade() {
        return saGrade;
    }

    public void setSaGrade(Integer saGrade) {
        this.saGrade = saGrade;
    }
}