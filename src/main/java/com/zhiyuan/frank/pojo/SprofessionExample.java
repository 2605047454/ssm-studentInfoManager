package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SprofessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprofessionExample() {
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

        public Criteria andSprIdIsNull() {
            addCriterion("Spr_id is null");
            return (Criteria) this;
        }

        public Criteria andSprIdIsNotNull() {
            addCriterion("Spr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprIdEqualTo(Integer value) {
            addCriterion("Spr_id =", value, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdNotEqualTo(Integer value) {
            addCriterion("Spr_id <>", value, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdGreaterThan(Integer value) {
            addCriterion("Spr_id >", value, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Spr_id >=", value, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdLessThan(Integer value) {
            addCriterion("Spr_id <", value, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdLessThanOrEqualTo(Integer value) {
            addCriterion("Spr_id <=", value, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdIn(List<Integer> values) {
            addCriterion("Spr_id in", values, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdNotIn(List<Integer> values) {
            addCriterion("Spr_id not in", values, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdBetween(Integer value1, Integer value2) {
            addCriterion("Spr_id between", value1, value2, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Spr_id not between", value1, value2, "sprId");
            return (Criteria) this;
        }

        public Criteria andSprNameIsNull() {
            addCriterion("Spr_name is null");
            return (Criteria) this;
        }

        public Criteria andSprNameIsNotNull() {
            addCriterion("Spr_name is not null");
            return (Criteria) this;
        }

        public Criteria andSprNameEqualTo(String value) {
            addCriterion("Spr_name =", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameNotEqualTo(String value) {
            addCriterion("Spr_name <>", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameGreaterThan(String value) {
            addCriterion("Spr_name >", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameGreaterThanOrEqualTo(String value) {
            addCriterion("Spr_name >=", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameLessThan(String value) {
            addCriterion("Spr_name <", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameLessThanOrEqualTo(String value) {
            addCriterion("Spr_name <=", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameLike(String value) {
            addCriterion("Spr_name like", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameNotLike(String value) {
            addCriterion("Spr_name not like", value, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameIn(List<String> values) {
            addCriterion("Spr_name in", values, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameNotIn(List<String> values) {
            addCriterion("Spr_name not in", values, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameBetween(String value1, String value2) {
            addCriterion("Spr_name between", value1, value2, "sprName");
            return (Criteria) this;
        }

        public Criteria andSprNameNotBetween(String value1, String value2) {
            addCriterion("Spr_name not between", value1, value2, "sprName");
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