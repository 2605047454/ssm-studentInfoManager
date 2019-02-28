package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SbasicmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbasicmessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSBidIsNull() {
            addCriterion("s_bid is null");
            return (Criteria) this;
        }

        public Criteria andSBidIsNotNull() {
            addCriterion("s_bid is not null");
            return (Criteria) this;
        }

        public Criteria andSBidEqualTo(Integer value) {
            addCriterion("s_bid =", value, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidNotEqualTo(Integer value) {
            addCriterion("s_bid <>", value, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidGreaterThan(Integer value) {
            addCriterion("s_bid >", value, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_bid >=", value, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidLessThan(Integer value) {
            addCriterion("s_bid <", value, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidLessThanOrEqualTo(Integer value) {
            addCriterion("s_bid <=", value, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidIn(List<Integer> values) {
            addCriterion("s_bid in", values, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidNotIn(List<Integer> values) {
            addCriterion("s_bid not in", values, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidBetween(Integer value1, Integer value2) {
            addCriterion("s_bid between", value1, value2, "sBid");
            return (Criteria) this;
        }

        public Criteria andSBidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_bid not between", value1, value2, "sBid");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(Integer value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(Integer value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(Integer value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(Integer value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(Integer value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<Integer> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<Integer> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(Integer value1, Integer value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(Integer value1, Integer value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIsNull() {
            addCriterion("s_birthday is null");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIsNotNull() {
            addCriterion("s_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andSBirthdayEqualTo(String value) {
            addCriterion("s_birthday =", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotEqualTo(String value) {
            addCriterion("s_birthday <>", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayGreaterThan(String value) {
            addCriterion("s_birthday >", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("s_birthday >=", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLessThan(String value) {
            addCriterion("s_birthday <", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLessThanOrEqualTo(String value) {
            addCriterion("s_birthday <=", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLike(String value) {
            addCriterion("s_birthday like", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotLike(String value) {
            addCriterion("s_birthday not like", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIn(List<String> values) {
            addCriterion("s_birthday in", values, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotIn(List<String> values) {
            addCriterion("s_birthday not in", values, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayBetween(String value1, String value2) {
            addCriterion("s_birthday between", value1, value2, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotBetween(String value1, String value2) {
            addCriterion("s_birthday not between", value1, value2, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSAddrIsNull() {
            addCriterion("s_addr is null");
            return (Criteria) this;
        }

        public Criteria andSAddrIsNotNull() {
            addCriterion("s_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSAddrEqualTo(String value) {
            addCriterion("s_addr =", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotEqualTo(String value) {
            addCriterion("s_addr <>", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrGreaterThan(String value) {
            addCriterion("s_addr >", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrGreaterThanOrEqualTo(String value) {
            addCriterion("s_addr >=", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLessThan(String value) {
            addCriterion("s_addr <", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLessThanOrEqualTo(String value) {
            addCriterion("s_addr <=", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLike(String value) {
            addCriterion("s_addr like", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotLike(String value) {
            addCriterion("s_addr not like", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrIn(List<String> values) {
            addCriterion("s_addr in", values, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotIn(List<String> values) {
            addCriterion("s_addr not in", values, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrBetween(String value1, String value2) {
            addCriterion("s_addr between", value1, value2, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotBetween(String value1, String value2) {
            addCriterion("s_addr not between", value1, value2, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNull() {
            addCriterion("s_phone is null");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNotNull() {
            addCriterion("s_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSPhoneEqualTo(String value) {
            addCriterion("s_phone =", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotEqualTo(String value) {
            addCriterion("s_phone <>", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThan(String value) {
            addCriterion("s_phone >", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_phone >=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThan(String value) {
            addCriterion("s_phone <", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThanOrEqualTo(String value) {
            addCriterion("s_phone <=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLike(String value) {
            addCriterion("s_phone like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotLike(String value) {
            addCriterion("s_phone not like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneIn(List<String> values) {
            addCriterion("s_phone in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotIn(List<String> values) {
            addCriterion("s_phone not in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneBetween(String value1, String value2) {
            addCriterion("s_phone between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotBetween(String value1, String value2) {
            addCriterion("s_phone not between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSQqIsNull() {
            addCriterion("s_qq is null");
            return (Criteria) this;
        }

        public Criteria andSQqIsNotNull() {
            addCriterion("s_qq is not null");
            return (Criteria) this;
        }

        public Criteria andSQqEqualTo(Integer value) {
            addCriterion("s_qq =", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqNotEqualTo(Integer value) {
            addCriterion("s_qq <>", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqGreaterThan(Integer value) {
            addCriterion("s_qq >", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_qq >=", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqLessThan(Integer value) {
            addCriterion("s_qq <", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqLessThanOrEqualTo(Integer value) {
            addCriterion("s_qq <=", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqIn(List<Integer> values) {
            addCriterion("s_qq in", values, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqNotIn(List<Integer> values) {
            addCriterion("s_qq not in", values, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqBetween(Integer value1, Integer value2) {
            addCriterion("s_qq between", value1, value2, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqNotBetween(Integer value1, Integer value2) {
            addCriterion("s_qq not between", value1, value2, "sQq");
            return (Criteria) this;
        }

        public Criteria andSWeixinIsNull() {
            addCriterion("s_weixin is null");
            return (Criteria) this;
        }

        public Criteria andSWeixinIsNotNull() {
            addCriterion("s_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andSWeixinEqualTo(String value) {
            addCriterion("s_weixin =", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotEqualTo(String value) {
            addCriterion("s_weixin <>", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinGreaterThan(String value) {
            addCriterion("s_weixin >", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("s_weixin >=", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinLessThan(String value) {
            addCriterion("s_weixin <", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinLessThanOrEqualTo(String value) {
            addCriterion("s_weixin <=", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinLike(String value) {
            addCriterion("s_weixin like", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotLike(String value) {
            addCriterion("s_weixin not like", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinIn(List<String> values) {
            addCriterion("s_weixin in", values, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotIn(List<String> values) {
            addCriterion("s_weixin not in", values, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinBetween(String value1, String value2) {
            addCriterion("s_weixin between", value1, value2, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotBetween(String value1, String value2) {
            addCriterion("s_weixin not between", value1, value2, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSFphoneIsNull() {
            addCriterion("s_fphone is null");
            return (Criteria) this;
        }

        public Criteria andSFphoneIsNotNull() {
            addCriterion("s_fphone is not null");
            return (Criteria) this;
        }

        public Criteria andSFphoneEqualTo(String value) {
            addCriterion("s_fphone =", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneNotEqualTo(String value) {
            addCriterion("s_fphone <>", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneGreaterThan(String value) {
            addCriterion("s_fphone >", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_fphone >=", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneLessThan(String value) {
            addCriterion("s_fphone <", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneLessThanOrEqualTo(String value) {
            addCriterion("s_fphone <=", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneLike(String value) {
            addCriterion("s_fphone like", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneNotLike(String value) {
            addCriterion("s_fphone not like", value, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneIn(List<String> values) {
            addCriterion("s_fphone in", values, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneNotIn(List<String> values) {
            addCriterion("s_fphone not in", values, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneBetween(String value1, String value2) {
            addCriterion("s_fphone between", value1, value2, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFphoneNotBetween(String value1, String value2) {
            addCriterion("s_fphone not between", value1, value2, "sFphone");
            return (Criteria) this;
        }

        public Criteria andSFnameIsNull() {
            addCriterion("s_fname is null");
            return (Criteria) this;
        }

        public Criteria andSFnameIsNotNull() {
            addCriterion("s_fname is not null");
            return (Criteria) this;
        }

        public Criteria andSFnameEqualTo(String value) {
            addCriterion("s_fname =", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameNotEqualTo(String value) {
            addCriterion("s_fname <>", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameGreaterThan(String value) {
            addCriterion("s_fname >", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameGreaterThanOrEqualTo(String value) {
            addCriterion("s_fname >=", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameLessThan(String value) {
            addCriterion("s_fname <", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameLessThanOrEqualTo(String value) {
            addCriterion("s_fname <=", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameLike(String value) {
            addCriterion("s_fname like", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameNotLike(String value) {
            addCriterion("s_fname not like", value, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameIn(List<String> values) {
            addCriterion("s_fname in", values, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameNotIn(List<String> values) {
            addCriterion("s_fname not in", values, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameBetween(String value1, String value2) {
            addCriterion("s_fname between", value1, value2, "sFname");
            return (Criteria) this;
        }

        public Criteria andSFnameNotBetween(String value1, String value2) {
            addCriterion("s_fname not between", value1, value2, "sFname");
            return (Criteria) this;
        }

        public Criteria andSIdcardIsNull() {
            addCriterion("s_idcard is null");
            return (Criteria) this;
        }

        public Criteria andSIdcardIsNotNull() {
            addCriterion("s_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andSIdcardEqualTo(String value) {
            addCriterion("s_idcard =", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotEqualTo(String value) {
            addCriterion("s_idcard <>", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardGreaterThan(String value) {
            addCriterion("s_idcard >", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("s_idcard >=", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLessThan(String value) {
            addCriterion("s_idcard <", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLessThanOrEqualTo(String value) {
            addCriterion("s_idcard <=", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLike(String value) {
            addCriterion("s_idcard like", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotLike(String value) {
            addCriterion("s_idcard not like", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardIn(List<String> values) {
            addCriterion("s_idcard in", values, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotIn(List<String> values) {
            addCriterion("s_idcard not in", values, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardBetween(String value1, String value2) {
            addCriterion("s_idcard between", value1, value2, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotBetween(String value1, String value2) {
            addCriterion("s_idcard not between", value1, value2, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIsspeIsNull() {
            addCriterion("s_isspe is null");
            return (Criteria) this;
        }

        public Criteria andSIsspeIsNotNull() {
            addCriterion("s_isspe is not null");
            return (Criteria) this;
        }

        public Criteria andSIsspeEqualTo(Integer value) {
            addCriterion("s_isspe =", value, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeNotEqualTo(Integer value) {
            addCriterion("s_isspe <>", value, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeGreaterThan(Integer value) {
            addCriterion("s_isspe >", value, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_isspe >=", value, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeLessThan(Integer value) {
            addCriterion("s_isspe <", value, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeLessThanOrEqualTo(Integer value) {
            addCriterion("s_isspe <=", value, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeIn(List<Integer> values) {
            addCriterion("s_isspe in", values, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeNotIn(List<Integer> values) {
            addCriterion("s_isspe not in", values, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeBetween(Integer value1, Integer value2) {
            addCriterion("s_isspe between", value1, value2, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSIsspeNotBetween(Integer value1, Integer value2) {
            addCriterion("s_isspe not between", value1, value2, "sIsspe");
            return (Criteria) this;
        }

        public Criteria andSGschoolIsNull() {
            addCriterion("s_gschool is null");
            return (Criteria) this;
        }

        public Criteria andSGschoolIsNotNull() {
            addCriterion("s_gschool is not null");
            return (Criteria) this;
        }

        public Criteria andSGschoolEqualTo(String value) {
            addCriterion("s_gschool =", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolNotEqualTo(String value) {
            addCriterion("s_gschool <>", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolGreaterThan(String value) {
            addCriterion("s_gschool >", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolGreaterThanOrEqualTo(String value) {
            addCriterion("s_gschool >=", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolLessThan(String value) {
            addCriterion("s_gschool <", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolLessThanOrEqualTo(String value) {
            addCriterion("s_gschool <=", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolLike(String value) {
            addCriterion("s_gschool like", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolNotLike(String value) {
            addCriterion("s_gschool not like", value, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolIn(List<String> values) {
            addCriterion("s_gschool in", values, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolNotIn(List<String> values) {
            addCriterion("s_gschool not in", values, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolBetween(String value1, String value2) {
            addCriterion("s_gschool between", value1, value2, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSGschoolNotBetween(String value1, String value2) {
            addCriterion("s_gschool not between", value1, value2, "sGschool");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgIsNull() {
            addCriterion("s_isfreshg is null");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgIsNotNull() {
            addCriterion("s_isfreshg is not null");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgEqualTo(Integer value) {
            addCriterion("s_isfreshg =", value, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgNotEqualTo(Integer value) {
            addCriterion("s_isfreshg <>", value, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgGreaterThan(Integer value) {
            addCriterion("s_isfreshg >", value, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_isfreshg >=", value, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgLessThan(Integer value) {
            addCriterion("s_isfreshg <", value, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgLessThanOrEqualTo(Integer value) {
            addCriterion("s_isfreshg <=", value, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgIn(List<Integer> values) {
            addCriterion("s_isfreshg in", values, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgNotIn(List<Integer> values) {
            addCriterion("s_isfreshg not in", values, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgBetween(Integer value1, Integer value2) {
            addCriterion("s_isfreshg between", value1, value2, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSIsfreshgNotBetween(Integer value1, Integer value2) {
            addCriterion("s_isfreshg not between", value1, value2, "sIsfreshg");
            return (Criteria) this;
        }

        public Criteria andSClassIsNull() {
            addCriterion("s_class is null");
            return (Criteria) this;
        }

        public Criteria andSClassIsNotNull() {
            addCriterion("s_class is not null");
            return (Criteria) this;
        }

        public Criteria andSClassEqualTo(String value) {
            addCriterion("s_class =", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotEqualTo(String value) {
            addCriterion("s_class <>", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassGreaterThan(String value) {
            addCriterion("s_class >", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassGreaterThanOrEqualTo(String value) {
            addCriterion("s_class >=", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLessThan(String value) {
            addCriterion("s_class <", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLessThanOrEqualTo(String value) {
            addCriterion("s_class <=", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLike(String value) {
            addCriterion("s_class like", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotLike(String value) {
            addCriterion("s_class not like", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassIn(List<String> values) {
            addCriterion("s_class in", values, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotIn(List<String> values) {
            addCriterion("s_class not in", values, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassBetween(String value1, String value2) {
            addCriterion("s_class between", value1, value2, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotBetween(String value1, String value2) {
            addCriterion("s_class not between", value1, value2, "sClass");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNull() {
            addCriterion("s_number is null");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNotNull() {
            addCriterion("s_number is not null");
            return (Criteria) this;
        }

        public Criteria andSNumberEqualTo(Integer value) {
            addCriterion("s_number =", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotEqualTo(Integer value) {
            addCriterion("s_number <>", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThan(Integer value) {
            addCriterion("s_number >", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_number >=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThan(Integer value) {
            addCriterion("s_number <", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThanOrEqualTo(Integer value) {
            addCriterion("s_number <=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberIn(List<Integer> values) {
            addCriterion("s_number in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotIn(List<Integer> values) {
            addCriterion("s_number not in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberBetween(Integer value1, Integer value2) {
            addCriterion("s_number between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("s_number not between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSIndateIsNull() {
            addCriterion("s_indate is null");
            return (Criteria) this;
        }

        public Criteria andSIndateIsNotNull() {
            addCriterion("s_indate is not null");
            return (Criteria) this;
        }

        public Criteria andSIndateEqualTo(String value) {
            addCriterion("s_indate =", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateNotEqualTo(String value) {
            addCriterion("s_indate <>", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateGreaterThan(String value) {
            addCriterion("s_indate >", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateGreaterThanOrEqualTo(String value) {
            addCriterion("s_indate >=", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateLessThan(String value) {
            addCriterion("s_indate <", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateLessThanOrEqualTo(String value) {
            addCriterion("s_indate <=", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateLike(String value) {
            addCriterion("s_indate like", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateNotLike(String value) {
            addCriterion("s_indate not like", value, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateIn(List<String> values) {
            addCriterion("s_indate in", values, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateNotIn(List<String> values) {
            addCriterion("s_indate not in", values, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateBetween(String value1, String value2) {
            addCriterion("s_indate between", value1, value2, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSIndateNotBetween(String value1, String value2) {
            addCriterion("s_indate not between", value1, value2, "sIndate");
            return (Criteria) this;
        }

        public Criteria andSOutdateIsNull() {
            addCriterion("s_outdate is null");
            return (Criteria) this;
        }

        public Criteria andSOutdateIsNotNull() {
            addCriterion("s_outdate is not null");
            return (Criteria) this;
        }

        public Criteria andSOutdateEqualTo(String value) {
            addCriterion("s_outdate =", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateNotEqualTo(String value) {
            addCriterion("s_outdate <>", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateGreaterThan(String value) {
            addCriterion("s_outdate >", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateGreaterThanOrEqualTo(String value) {
            addCriterion("s_outdate >=", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateLessThan(String value) {
            addCriterion("s_outdate <", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateLessThanOrEqualTo(String value) {
            addCriterion("s_outdate <=", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateLike(String value) {
            addCriterion("s_outdate like", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateNotLike(String value) {
            addCriterion("s_outdate not like", value, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateIn(List<String> values) {
            addCriterion("s_outdate in", values, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateNotIn(List<String> values) {
            addCriterion("s_outdate not in", values, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateBetween(String value1, String value2) {
            addCriterion("s_outdate between", value1, value2, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSOutdateNotBetween(String value1, String value2) {
            addCriterion("s_outdate not between", value1, value2, "sOutdate");
            return (Criteria) this;
        }

        public Criteria andSProfessionIsNull() {
            addCriterion("s_profession is null");
            return (Criteria) this;
        }

        public Criteria andSProfessionIsNotNull() {
            addCriterion("s_profession is not null");
            return (Criteria) this;
        }

        public Criteria andSProfessionEqualTo(String value) {
            addCriterion("s_profession =", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionNotEqualTo(String value) {
            addCriterion("s_profession <>", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionGreaterThan(String value) {
            addCriterion("s_profession >", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("s_profession >=", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionLessThan(String value) {
            addCriterion("s_profession <", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionLessThanOrEqualTo(String value) {
            addCriterion("s_profession <=", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionLike(String value) {
            addCriterion("s_profession like", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionNotLike(String value) {
            addCriterion("s_profession not like", value, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionIn(List<String> values) {
            addCriterion("s_profession in", values, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionNotIn(List<String> values) {
            addCriterion("s_profession not in", values, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionBetween(String value1, String value2) {
            addCriterion("s_profession between", value1, value2, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSProfessionNotBetween(String value1, String value2) {
            addCriterion("s_profession not between", value1, value2, "sProfession");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeIsNull() {
            addCriterion("s_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeIsNotNull() {
            addCriterion("s_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeEqualTo(String value) {
            addCriterion("s_recordtime =", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeNotEqualTo(String value) {
            addCriterion("s_recordtime <>", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeGreaterThan(String value) {
            addCriterion("s_recordtime >", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("s_recordtime >=", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeLessThan(String value) {
            addCriterion("s_recordtime <", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("s_recordtime <=", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeLike(String value) {
            addCriterion("s_recordtime like", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeNotLike(String value) {
            addCriterion("s_recordtime not like", value, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeIn(List<String> values) {
            addCriterion("s_recordtime in", values, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeNotIn(List<String> values) {
            addCriterion("s_recordtime not in", values, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeBetween(String value1, String value2) {
            addCriterion("s_recordtime between", value1, value2, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSRecordtimeNotBetween(String value1, String value2) {
            addCriterion("s_recordtime not between", value1, value2, "sRecordtime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeIsNull() {
            addCriterion("s_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSLasttimeIsNotNull() {
            addCriterion("s_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSLasttimeEqualTo(String value) {
            addCriterion("s_lasttime =", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeNotEqualTo(String value) {
            addCriterion("s_lasttime <>", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeGreaterThan(String value) {
            addCriterion("s_lasttime >", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("s_lasttime >=", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeLessThan(String value) {
            addCriterion("s_lasttime <", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeLessThanOrEqualTo(String value) {
            addCriterion("s_lasttime <=", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeLike(String value) {
            addCriterion("s_lasttime like", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeNotLike(String value) {
            addCriterion("s_lasttime not like", value, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeIn(List<String> values) {
            addCriterion("s_lasttime in", values, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeNotIn(List<String> values) {
            addCriterion("s_lasttime not in", values, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeBetween(String value1, String value2) {
            addCriterion("s_lasttime between", value1, value2, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSLasttimeNotBetween(String value1, String value2) {
            addCriterion("s_lasttime not between", value1, value2, "sLasttime");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNull() {
            addCriterion("s_status is null");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNotNull() {
            addCriterion("s_status is not null");
            return (Criteria) this;
        }

        public Criteria andSStatusEqualTo(Integer value) {
            addCriterion("s_status =", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotEqualTo(Integer value) {
            addCriterion("s_status <>", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThan(Integer value) {
            addCriterion("s_status >", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_status >=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThan(Integer value) {
            addCriterion("s_status <", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThanOrEqualTo(Integer value) {
            addCriterion("s_status <=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusIn(List<Integer> values) {
            addCriterion("s_status in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotIn(List<Integer> values) {
            addCriterion("s_status not in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusBetween(Integer value1, Integer value2) {
            addCriterion("s_status between", value1, value2, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("s_status not between", value1, value2, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeIsNull() {
            addCriterion("s_isdegree is null");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeIsNotNull() {
            addCriterion("s_isdegree is not null");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeEqualTo(Integer value) {
            addCriterion("s_isdegree =", value, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeNotEqualTo(Integer value) {
            addCriterion("s_isdegree <>", value, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeGreaterThan(Integer value) {
            addCriterion("s_isdegree >", value, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_isdegree >=", value, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeLessThan(Integer value) {
            addCriterion("s_isdegree <", value, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeLessThanOrEqualTo(Integer value) {
            addCriterion("s_isdegree <=", value, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeIn(List<Integer> values) {
            addCriterion("s_isdegree in", values, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeNotIn(List<Integer> values) {
            addCriterion("s_isdegree not in", values, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeBetween(Integer value1, Integer value2) {
            addCriterion("s_isdegree between", value1, value2, "sIsdegree");
            return (Criteria) this;
        }

        public Criteria andSIsdegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("s_isdegree not between", value1, value2, "sIsdegree");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}