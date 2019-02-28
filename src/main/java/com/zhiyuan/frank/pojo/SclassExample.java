package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SclassExample() {
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
            addCriterion("Scl_id is null");
            return (Criteria) this;
        }

        public Criteria andSclIdIsNotNull() {
            addCriterion("Scl_id is not null");
            return (Criteria) this;
        }

        public Criteria andSclIdEqualTo(Integer value) {
            addCriterion("Scl_id =", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdNotEqualTo(Integer value) {
            addCriterion("Scl_id <>", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdGreaterThan(Integer value) {
            addCriterion("Scl_id >", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scl_id >=", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdLessThan(Integer value) {
            addCriterion("Scl_id <", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scl_id <=", value, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdIn(List<Integer> values) {
            addCriterion("Scl_id in", values, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdNotIn(List<Integer> values) {
            addCriterion("Scl_id not in", values, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdBetween(Integer value1, Integer value2) {
            addCriterion("Scl_id between", value1, value2, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scl_id not between", value1, value2, "sclId");
            return (Criteria) this;
        }

        public Criteria andSclNameIsNull() {
            addCriterion("Scl_name is null");
            return (Criteria) this;
        }

        public Criteria andSclNameIsNotNull() {
            addCriterion("Scl_name is not null");
            return (Criteria) this;
        }

        public Criteria andSclNameEqualTo(String value) {
            addCriterion("Scl_name =", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameNotEqualTo(String value) {
            addCriterion("Scl_name <>", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameGreaterThan(String value) {
            addCriterion("Scl_name >", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameGreaterThanOrEqualTo(String value) {
            addCriterion("Scl_name >=", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameLessThan(String value) {
            addCriterion("Scl_name <", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameLessThanOrEqualTo(String value) {
            addCriterion("Scl_name <=", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameLike(String value) {
            addCriterion("Scl_name like", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameNotLike(String value) {
            addCriterion("Scl_name not like", value, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameIn(List<String> values) {
            addCriterion("Scl_name in", values, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameNotIn(List<String> values) {
            addCriterion("Scl_name not in", values, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameBetween(String value1, String value2) {
            addCriterion("Scl_name between", value1, value2, "sclName");
            return (Criteria) this;
        }

        public Criteria andSclNameNotBetween(String value1, String value2) {
            addCriterion("Scl_name not between", value1, value2, "sclName");
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