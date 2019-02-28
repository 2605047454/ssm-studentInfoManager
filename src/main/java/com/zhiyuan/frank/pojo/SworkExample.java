package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SworkExample() {
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

        public Criteria andSwIdIsNull() {
            addCriterion("sw_id is null");
            return (Criteria) this;
        }

        public Criteria andSwIdIsNotNull() {
            addCriterion("sw_id is not null");
            return (Criteria) this;
        }

        public Criteria andSwIdEqualTo(Integer value) {
            addCriterion("sw_id =", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotEqualTo(Integer value) {
            addCriterion("sw_id <>", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdGreaterThan(Integer value) {
            addCriterion("sw_id >", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sw_id >=", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdLessThan(Integer value) {
            addCriterion("sw_id <", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdLessThanOrEqualTo(Integer value) {
            addCriterion("sw_id <=", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdIn(List<Integer> values) {
            addCriterion("sw_id in", values, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotIn(List<Integer> values) {
            addCriterion("sw_id not in", values, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdBetween(Integer value1, Integer value2) {
            addCriterion("sw_id between", value1, value2, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sw_id not between", value1, value2, "swId");
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

        public Criteria andSwTypeIsNull() {
            addCriterion("sw_type is null");
            return (Criteria) this;
        }

        public Criteria andSwTypeIsNotNull() {
            addCriterion("sw_type is not null");
            return (Criteria) this;
        }

        public Criteria andSwTypeEqualTo(String value) {
            addCriterion("sw_type =", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotEqualTo(String value) {
            addCriterion("sw_type <>", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeGreaterThan(String value) {
            addCriterion("sw_type >", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sw_type >=", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeLessThan(String value) {
            addCriterion("sw_type <", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeLessThanOrEqualTo(String value) {
            addCriterion("sw_type <=", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeLike(String value) {
            addCriterion("sw_type like", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotLike(String value) {
            addCriterion("sw_type not like", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeIn(List<String> values) {
            addCriterion("sw_type in", values, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotIn(List<String> values) {
            addCriterion("sw_type not in", values, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeBetween(String value1, String value2) {
            addCriterion("sw_type between", value1, value2, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotBetween(String value1, String value2) {
            addCriterion("sw_type not between", value1, value2, "swType");
            return (Criteria) this;
        }

        public Criteria andSwStatusIsNull() {
            addCriterion("sw_status is null");
            return (Criteria) this;
        }

        public Criteria andSwStatusIsNotNull() {
            addCriterion("sw_status is not null");
            return (Criteria) this;
        }

        public Criteria andSwStatusEqualTo(Integer value) {
            addCriterion("sw_status =", value, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusNotEqualTo(Integer value) {
            addCriterion("sw_status <>", value, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusGreaterThan(Integer value) {
            addCriterion("sw_status >", value, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sw_status >=", value, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusLessThan(Integer value) {
            addCriterion("sw_status <", value, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sw_status <=", value, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusIn(List<Integer> values) {
            addCriterion("sw_status in", values, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusNotIn(List<Integer> values) {
            addCriterion("sw_status not in", values, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusBetween(Integer value1, Integer value2) {
            addCriterion("sw_status between", value1, value2, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sw_status not between", value1, value2, "swStatus");
            return (Criteria) this;
        }

        public Criteria andSwApprovalIsNull() {
            addCriterion("sw_approval is null");
            return (Criteria) this;
        }

        public Criteria andSwApprovalIsNotNull() {
            addCriterion("sw_approval is not null");
            return (Criteria) this;
        }

        public Criteria andSwApprovalEqualTo(String value) {
            addCriterion("sw_approval =", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalNotEqualTo(String value) {
            addCriterion("sw_approval <>", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalGreaterThan(String value) {
            addCriterion("sw_approval >", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("sw_approval >=", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalLessThan(String value) {
            addCriterion("sw_approval <", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalLessThanOrEqualTo(String value) {
            addCriterion("sw_approval <=", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalLike(String value) {
            addCriterion("sw_approval like", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalNotLike(String value) {
            addCriterion("sw_approval not like", value, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalIn(List<String> values) {
            addCriterion("sw_approval in", values, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalNotIn(List<String> values) {
            addCriterion("sw_approval not in", values, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalBetween(String value1, String value2) {
            addCriterion("sw_approval between", value1, value2, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwApprovalNotBetween(String value1, String value2) {
            addCriterion("sw_approval not between", value1, value2, "swApproval");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeIsNull() {
            addCriterion("sw_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeIsNotNull() {
            addCriterion("sw_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeEqualTo(String value) {
            addCriterion("sw_recordtime =", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeNotEqualTo(String value) {
            addCriterion("sw_recordtime <>", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeGreaterThan(String value) {
            addCriterion("sw_recordtime >", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sw_recordtime >=", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeLessThan(String value) {
            addCriterion("sw_recordtime <", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("sw_recordtime <=", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeLike(String value) {
            addCriterion("sw_recordtime like", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeNotLike(String value) {
            addCriterion("sw_recordtime not like", value, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeIn(List<String> values) {
            addCriterion("sw_recordtime in", values, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeNotIn(List<String> values) {
            addCriterion("sw_recordtime not in", values, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeBetween(String value1, String value2) {
            addCriterion("sw_recordtime between", value1, value2, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwRecordtimeNotBetween(String value1, String value2) {
            addCriterion("sw_recordtime not between", value1, value2, "swRecordtime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeIsNull() {
            addCriterion("sw_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeIsNotNull() {
            addCriterion("sw_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeEqualTo(String value) {
            addCriterion("sw_lasttime =", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeNotEqualTo(String value) {
            addCriterion("sw_lasttime <>", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeGreaterThan(String value) {
            addCriterion("sw_lasttime >", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sw_lasttime >=", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeLessThan(String value) {
            addCriterion("sw_lasttime <", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeLessThanOrEqualTo(String value) {
            addCriterion("sw_lasttime <=", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeLike(String value) {
            addCriterion("sw_lasttime like", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeNotLike(String value) {
            addCriterion("sw_lasttime not like", value, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeIn(List<String> values) {
            addCriterion("sw_lasttime in", values, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeNotIn(List<String> values) {
            addCriterion("sw_lasttime not in", values, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeBetween(String value1, String value2) {
            addCriterion("sw_lasttime between", value1, value2, "swLasttime");
            return (Criteria) this;
        }

        public Criteria andSwLasttimeNotBetween(String value1, String value2) {
            addCriterion("sw_lasttime not between", value1, value2, "swLasttime");
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