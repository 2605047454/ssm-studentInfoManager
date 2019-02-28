package com.zhiyuan.frank.pojo;

import javax.validation.constraints.Pattern;

public class Sbasicmessage {
    private Integer sBid;

    @Pattern(regexp="(^[A-Za-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})"
    		,message="用户名可以是2-5位中文或者6-16位英文和数字的组合")
    private String sName;

    private Integer sSex;

    private String sBirthday;

    private String sAddr;

    @Pattern(regexp="^[0-9]{11}$"
    		,message="电话只能由11位的数字组成")
    private String sPhone;

    private Integer sQq;

    private String sWeixin;

    @Pattern(regexp="^[0-9]{11}$"
    		,message="电话只能由11位的数字组成")
    private String sFphone;

    @Pattern(regexp="(^[A-Za-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})"
    		,message="用户名可以是2-5位中文或者6-16位英文和数字的组合")
    private String sFname;

    @Pattern(regexp="(^[X0-9]{16}$)|(^[0-9]{16})"
    		,message="身份证号可以是X和15位数字或者16位数字组成")
    private String sIdcard;

    private Integer sIsspe;

    private String sGschool;

    private Integer sIsfreshg;

    private String sClass;

    private Integer sNumber;

    private String sIndate;

    private String sOutdate;

    private String sProfession;

    private String sRecordtime;

    private String sLasttime;

    private Integer sStatus;

    private Integer sIsdegree;

    public Integer getsBid() {
        return sBid;
    }

    public void setsBid(Integer sBid) {
        this.sBid = sBid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsSex() {
        return sSex;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }

    public String getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(String sBirthday) {
        this.sBirthday = sBirthday == null ? null : sBirthday.trim();
    }

    public String getsAddr() {
        return sAddr;
    }

    public void setsAddr(String sAddr) {
        this.sAddr = sAddr == null ? null : sAddr.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public Integer getsQq() {
        return sQq;
    }

    public void setsQq(Integer sQq) {
        this.sQq = sQq;
    }

    public String getsWeixin() {
        return sWeixin;
    }

    public void setsWeixin(String sWeixin) {
        this.sWeixin = sWeixin == null ? null : sWeixin.trim();
    }

    public String getsFphone() {
        return sFphone;
    }

    public void setsFphone(String sFphone) {
        this.sFphone = sFphone == null ? null : sFphone.trim();
    }

    public String getsFname() {
        return sFname;
    }

    public void setsFname(String sFname) {
        this.sFname = sFname == null ? null : sFname.trim();
    }

    public String getsIdcard() {
        return sIdcard;
    }

    public void setsIdcard(String sIdcard) {
        this.sIdcard = sIdcard == null ? null : sIdcard.trim();
    }

    public Integer getsIsspe() {
        return sIsspe;
    }

    public void setsIsspe(Integer sIsspe) {
        this.sIsspe = sIsspe;
    }

    public String getsGschool() {
        return sGschool;
    }

    public void setsGschool(String sGschool) {
        this.sGschool = sGschool == null ? null : sGschool.trim();
    }

    public Integer getsIsfreshg() {
        return sIsfreshg;
    }

    public void setsIsfreshg(Integer sIsfreshg) {
        this.sIsfreshg = sIsfreshg;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass == null ? null : sClass.trim();
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public String getsIndate() {
        return sIndate;
    }

    public void setsIndate(String sIndate) {
        this.sIndate = sIndate == null ? null : sIndate.trim();
    }

    public String getsOutdate() {
        return sOutdate;
    }

    public void setsOutdate(String sOutdate) {
        this.sOutdate = sOutdate == null ? null : sOutdate.trim();
    }

    public String getsProfession() {
        return sProfession;
    }

    public void setsProfession(String sProfession) {
        this.sProfession = sProfession == null ? null : sProfession.trim();
    }

    public String getsRecordtime() {
        return sRecordtime;
    }

    public void setsRecordtime(String sRecordtime) {
        this.sRecordtime = sRecordtime == null ? null : sRecordtime.trim();
    }

    public String getsLasttime() {
        return sLasttime;
    }

    public void setsLasttime(String sLasttime) {
        this.sLasttime = sLasttime == null ? null : sLasttime.trim();
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

    public Integer getsIsdegree() {
        return sIsdegree;
    }

    public void setsIsdegree(Integer sIsdegree) {
        this.sIsdegree = sIsdegree;
    }
}