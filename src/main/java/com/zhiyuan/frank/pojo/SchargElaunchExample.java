package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SchargElaunchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchargElaunchExample() {
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

        public Criteria andSclIdIsNull() {
            addCriterion("scl_id is null");
            return (Criteria) this;
        }

        public Criteria andSclIdIsNotNull() {
            addCriterion("scl_id is not null");
            return (Criteria) this;
        }

        public Criteria andSclIdEqualTo(Integer value) {
            addCriterion("scl_id =", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdNotEqualTo(Integer value) {
            addCriterion("scl_id <>", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdGreaterThan(Integer value) {
            addCriterion("scl_id >", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scl_id >=", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdLessThan(Integer value) {
            addCriterion("scl_id <", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdLessThanOrEqualTo(Integer value) {
            addCriterion("scl_id <=", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdIn(List<Integer> values) {
            addCriterion("scl_id in", values, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdNotIn(List<Integer> values) {
            addCriterion("scl_id not in", values, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdBetween(Integer value1, Integer value2) {
            addCriterion("scl_id between", value1, value2, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scl_id not between", value1, value2, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclNumberIsNull() {
            addCriterion("scl_number is null");
            return (Criteria) this;
        }

        public Criteria andSclNumberIsNotNull() {
            addCriterion("scl_number is not null");
            return (Criteria) this;
        }

        public Criteria andSclNumberEqualTo(Integer value) {
            addCriterion("scl_number =", value, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberNotEqualTo(Integer value) {
            addCriterion("scl_number <>", value, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberGreaterThan(Integer value) {
            addCriterion("scl_number >", value, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("scl_number >=", value, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberLessThan(Integer value) {
            addCriterion("scl_number <", value, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberLessThanOrEqualTo(Integer value) {
            addCriterion("scl_number <=", value, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberIn(List<Integer> values) {
            addCriterion("scl_number in", values, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberNotIn(List<Integer> values) {
            addCriterion("scl_number not in", values, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberBetween(Integer value1, Integer value2) {
            addCriterion("scl_number between", value1, value2, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("scl_number not between", value1, value2, "sclNumber");
            return (Criteria) this;
        }

        public Criteria andSclMonthIsNull() {
            addCriterion("scl_month is null");
            return (Criteria) this;
        }

        public Criteria andSclMonthIsNotNull() {
            addCriterion("scl_month is not null");
            return (Criteria) this;
        }

        public Criteria andSclMonthEqualTo(Integer value) {
            addCriterion("scl_month =", value, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthNotEqualTo(Integer value) {
            addCriterion("scl_month <>", value, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthGreaterThan(Integer value) {
            addCriterion("scl_month >", value, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("scl_month >=", value, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthLessThan(Integer value) {
            addCriterion("scl_month <", value, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthLessThanOrEqualTo(Integer value) {
            addCriterion("scl_month <=", value, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthIn(List<Integer> values) {
            addCriterion("scl_month in", values, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthNotIn(List<Integer> values) {
            addCriterion("scl_month not in", values, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthBetween(Integer value1, Integer value2) {
            addCriterion("scl_month between", value1, value2, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("scl_month not between", value1, value2, "sclMonth");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeIsNull() {
            addCriterion("scl_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeIsNotNull() {
            addCriterion("scl_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeEqualTo(String value) {
            addCriterion("scl_recordtime =", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeNotEqualTo(String value) {
            addCriterion("scl_recordtime <>", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeGreaterThan(String value) {
            addCriterion("scl_recordtime >", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("scl_recordtime >=", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeLessThan(String value) {
            addCriterion("scl_recordtime <", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("scl_recordtime <=", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeLike(String value) {
            addCriterion("scl_recordtime like", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeNotLike(String value) {
            addCriterion("scl_recordtime not like", value, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeIn(List<String> values) {
            addCriterion("scl_recordtime in", values, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeNotIn(List<String> values) {
            addCriterion("scl_recordtime not in", values, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeBetween(String value1, String value2) {
            addCriterion("scl_recordtime between", value1, value2, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclRecordtimeNotBetween(String value1, String value2) {
            addCriterion("scl_recordtime not between", value1, value2, "sclRecordtime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeIsNull() {
            addCriterion("scl_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeIsNotNull() {
            addCriterion("scl_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeEqualTo(String value) {
            addCriterion("scl_lasttime =", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeNotEqualTo(String value) {
            addCriterion("scl_lasttime <>", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeGreaterThan(String value) {
            addCriterion("scl_lasttime >", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("scl_lasttime >=", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeLessThan(String value) {
            addCriterion("scl_lasttime <", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeLessThanOrEqualTo(String value) {
            addCriterion("scl_lasttime <=", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeLike(String value) {
            addCriterion("scl_lasttime like", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeNotLike(String value) {
            addCriterion("scl_lasttime not like", value, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeIn(List<String> values) {
            addCriterion("scl_lasttime in", values, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeNotIn(List<String> values) {
            addCriterion("scl_lasttime not in", values, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeBetween(String value1, String value2) {
            addCriterion("scl_lasttime between", value1, value2, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclLasttimeNotBetween(String value1, String value2) {
            addCriterion("scl_lasttime not between", value1, value2, "sclLasttime");
            return (Criteria) this;
        }

        public Criteria andSclStatusIsNull() {
            addCriterion("scl_status is null");
            return (Criteria) this;
        }

        public Criteria andSclStatusIsNotNull() {
            addCriterion("scl_status is not null");
            return (Criteria) this;
        }

        public Criteria andSclStatusEqualTo(Integer value) {
            addCriterion("scl_status =", value, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusNotEqualTo(Integer value) {
            addCriterion("scl_status <>", value, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusGreaterThan(Integer value) {
            addCriterion("scl_status >", value, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("scl_status >=", value, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusLessThan(Integer value) {
            addCriterion("scl_status <", value, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusLessThanOrEqualTo(Integer value) {
            addCriterion("scl_status <=", value, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusIn(List<Integer> values) {
            addCriterion("scl_status in", values, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusNotIn(List<Integer> values) {
            addCriterion("scl_status not in", values, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusBetween(Integer value1, Integer value2) {
            addCriterion("scl_status between", value1, value2, "sclStatus");
            return (Criteria) this;
        }

        public Criteria andSclStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("scl_status not between", value1, value2, "sclStatus");
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