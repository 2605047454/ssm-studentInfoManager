package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SloginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SloginExample() {
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

        public Criteria andSlIdIsNull() {
            addCriterion("sl_id is null");
            return (Criteria) this;
        }

        public Criteria andSlIdIsNotNull() {
            addCriterion("sl_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlIdEqualTo(Integer value) {
            addCriterion("sl_id =", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotEqualTo(Integer value) {
            addCriterion("sl_id <>", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThan(Integer value) {
            addCriterion("sl_id >", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl_id >=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThan(Integer value) {
            addCriterion("sl_id <", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThanOrEqualTo(Integer value) {
            addCriterion("sl_id <=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdIn(List<Integer> values) {
            addCriterion("sl_id in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotIn(List<Integer> values) {
            addCriterion("sl_id not in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdBetween(Integer value1, Integer value2) {
            addCriterion("sl_id between", value1, value2, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sl_id not between", value1, value2, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdcardIsNull() {
            addCriterion("sl_idcard is null");
            return (Criteria) this;
        }

        public Criteria andSlIdcardIsNotNull() {
            addCriterion("sl_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andSlIdcardEqualTo(String value) {
            addCriterion("sl_idcard =", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardNotEqualTo(String value) {
            addCriterion("sl_idcard <>", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardGreaterThan(String value) {
            addCriterion("sl_idcard >", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("sl_idcard >=", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardLessThan(String value) {
            addCriterion("sl_idcard <", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardLessThanOrEqualTo(String value) {
            addCriterion("sl_idcard <=", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardLike(String value) {
            addCriterion("sl_idcard like", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardNotLike(String value) {
            addCriterion("sl_idcard not like", value, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardIn(List<String> values) {
            addCriterion("sl_idcard in", values, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardNotIn(List<String> values) {
            addCriterion("sl_idcard not in", values, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardBetween(String value1, String value2) {
            addCriterion("sl_idcard between", value1, value2, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlIdcardNotBetween(String value1, String value2) {
            addCriterion("sl_idcard not between", value1, value2, "slIdcard");
            return (Criteria) this;
        }

        public Criteria andSlStatusIsNull() {
            addCriterion("sl_status is null");
            return (Criteria) this;
        }

        public Criteria andSlStatusIsNotNull() {
            addCriterion("sl_status is not null");
            return (Criteria) this;
        }

        public Criteria andSlStatusEqualTo(Integer value) {
            addCriterion("sl_status =", value, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusNotEqualTo(Integer value) {
            addCriterion("sl_status <>", value, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusGreaterThan(Integer value) {
            addCriterion("sl_status >", value, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl_status >=", value, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusLessThan(Integer value) {
            addCriterion("sl_status <", value, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sl_status <=", value, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusIn(List<Integer> values) {
            addCriterion("sl_status in", values, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusNotIn(List<Integer> values) {
            addCriterion("sl_status not in", values, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusBetween(Integer value1, Integer value2) {
            addCriterion("sl_status between", value1, value2, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sl_status not between", value1, value2, "slStatus");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeIsNull() {
            addCriterion("sl_beforetime is null");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeIsNotNull() {
            addCriterion("sl_beforetime is not null");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeEqualTo(String value) {
            addCriterion("sl_beforetime =", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeNotEqualTo(String value) {
            addCriterion("sl_beforetime <>", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeGreaterThan(String value) {
            addCriterion("sl_beforetime >", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeGreaterThanOrEqualTo(String value) {
            addCriterion("sl_beforetime >=", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeLessThan(String value) {
            addCriterion("sl_beforetime <", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeLessThanOrEqualTo(String value) {
            addCriterion("sl_beforetime <=", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeLike(String value) {
            addCriterion("sl_beforetime like", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeNotLike(String value) {
            addCriterion("sl_beforetime not like", value, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeIn(List<String> values) {
            addCriterion("sl_beforetime in", values, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeNotIn(List<String> values) {
            addCriterion("sl_beforetime not in", values, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeBetween(String value1, String value2) {
            addCriterion("sl_beforetime between", value1, value2, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlBeforetimeNotBetween(String value1, String value2) {
            addCriterion("sl_beforetime not between", value1, value2, "slBeforetime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeIsNull() {
            addCriterion("sl_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeIsNotNull() {
            addCriterion("sl_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeEqualTo(String value) {
            addCriterion("sl_lasttime =", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeNotEqualTo(String value) {
            addCriterion("sl_lasttime <>", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeGreaterThan(String value) {
            addCriterion("sl_lasttime >", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sl_lasttime >=", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeLessThan(String value) {
            addCriterion("sl_lasttime <", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeLessThanOrEqualTo(String value) {
            addCriterion("sl_lasttime <=", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeLike(String value) {
            addCriterion("sl_lasttime like", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeNotLike(String value) {
            addCriterion("sl_lasttime not like", value, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeIn(List<String> values) {
            addCriterion("sl_lasttime in", values, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeNotIn(List<String> values) {
            addCriterion("sl_lasttime not in", values, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeBetween(String value1, String value2) {
            addCriterion("sl_lasttime between", value1, value2, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlLasttimeNotBetween(String value1, String value2) {
            addCriterion("sl_lasttime not between", value1, value2, "slLasttime");
            return (Criteria) this;
        }

        public Criteria andSlTypeIsNull() {
            addCriterion("sl_type is null");
            return (Criteria) this;
        }

        public Criteria andSlTypeIsNotNull() {
            addCriterion("sl_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlTypeEqualTo(Integer value) {
            addCriterion("sl_type =", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeNotEqualTo(Integer value) {
            addCriterion("sl_type <>", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeGreaterThan(Integer value) {
            addCriterion("sl_type >", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl_type >=", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeLessThan(Integer value) {
            addCriterion("sl_type <", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sl_type <=", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeIn(List<Integer> values) {
            addCriterion("sl_type in", values, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeNotIn(List<Integer> values) {
            addCriterion("sl_type not in", values, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeBetween(Integer value1, Integer value2) {
            addCriterion("sl_type between", value1, value2, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sl_type not between", value1, value2, "slType");
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