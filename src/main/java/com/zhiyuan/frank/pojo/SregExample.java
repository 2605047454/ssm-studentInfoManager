package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SregExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SregExample() {
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

        public Criteria andSrNameIsNull() {
            addCriterion("sr_name is null");
            return (Criteria) this;
        }

        public Criteria andSrNameIsNotNull() {
            addCriterion("sr_name is not null");
            return (Criteria) this;
        }

        public Criteria andSrNameEqualTo(String value) {
            addCriterion("sr_name =", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotEqualTo(String value) {
            addCriterion("sr_name <>", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameGreaterThan(String value) {
            addCriterion("sr_name >", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameGreaterThanOrEqualTo(String value) {
            addCriterion("sr_name >=", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameLessThan(String value) {
            addCriterion("sr_name <", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameLessThanOrEqualTo(String value) {
            addCriterion("sr_name <=", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameLike(String value) {
            addCriterion("sr_name like", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotLike(String value) {
            addCriterion("sr_name not like", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameIn(List<String> values) {
            addCriterion("sr_name in", values, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotIn(List<String> values) {
            addCriterion("sr_name not in", values, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameBetween(String value1, String value2) {
            addCriterion("sr_name between", value1, value2, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotBetween(String value1, String value2) {
            addCriterion("sr_name not between", value1, value2, "srName");
            return (Criteria) this;
        }

        public Criteria andSrIdcardIsNull() {
            addCriterion("sr_idcard is null");
            return (Criteria) this;
        }

        public Criteria andSrIdcardIsNotNull() {
            addCriterion("sr_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andSrIdcardEqualTo(String value) {
            addCriterion("sr_idcard =", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardNotEqualTo(String value) {
            addCriterion("sr_idcard <>", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardGreaterThan(String value) {
            addCriterion("sr_idcard >", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("sr_idcard >=", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardLessThan(String value) {
            addCriterion("sr_idcard <", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardLessThanOrEqualTo(String value) {
            addCriterion("sr_idcard <=", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardLike(String value) {
            addCriterion("sr_idcard like", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardNotLike(String value) {
            addCriterion("sr_idcard not like", value, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardIn(List<String> values) {
            addCriterion("sr_idcard in", values, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardNotIn(List<String> values) {
            addCriterion("sr_idcard not in", values, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardBetween(String value1, String value2) {
            addCriterion("sr_idcard between", value1, value2, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrIdcardNotBetween(String value1, String value2) {
            addCriterion("sr_idcard not between", value1, value2, "srIdcard");
            return (Criteria) this;
        }

        public Criteria andSrNumberIsNull() {
            addCriterion("sr_number is null");
            return (Criteria) this;
        }

        public Criteria andSrNumberIsNotNull() {
            addCriterion("sr_number is not null");
            return (Criteria) this;
        }

        public Criteria andSrNumberEqualTo(Integer value) {
            addCriterion("sr_number =", value, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberNotEqualTo(Integer value) {
            addCriterion("sr_number <>", value, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberGreaterThan(Integer value) {
            addCriterion("sr_number >", value, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sr_number >=", value, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberLessThan(Integer value) {
            addCriterion("sr_number <", value, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sr_number <=", value, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberIn(List<Integer> values) {
            addCriterion("sr_number in", values, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberNotIn(List<Integer> values) {
            addCriterion("sr_number not in", values, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberBetween(Integer value1, Integer value2) {
            addCriterion("sr_number between", value1, value2, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sr_number not between", value1, value2, "srNumber");
            return (Criteria) this;
        }

        public Criteria andSrQuestionIsNull() {
            addCriterion("sr_question is null");
            return (Criteria) this;
        }

        public Criteria andSrQuestionIsNotNull() {
            addCriterion("sr_question is not null");
            return (Criteria) this;
        }

        public Criteria andSrQuestionEqualTo(String value) {
            addCriterion("sr_question =", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionNotEqualTo(String value) {
            addCriterion("sr_question <>", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionGreaterThan(String value) {
            addCriterion("sr_question >", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("sr_question >=", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionLessThan(String value) {
            addCriterion("sr_question <", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionLessThanOrEqualTo(String value) {
            addCriterion("sr_question <=", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionLike(String value) {
            addCriterion("sr_question like", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionNotLike(String value) {
            addCriterion("sr_question not like", value, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionIn(List<String> values) {
            addCriterion("sr_question in", values, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionNotIn(List<String> values) {
            addCriterion("sr_question not in", values, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionBetween(String value1, String value2) {
            addCriterion("sr_question between", value1, value2, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrQuestionNotBetween(String value1, String value2) {
            addCriterion("sr_question not between", value1, value2, "srQuestion");
            return (Criteria) this;
        }

        public Criteria andSrAnswerIsNull() {
            addCriterion("sr_answer is null");
            return (Criteria) this;
        }

        public Criteria andSrAnswerIsNotNull() {
            addCriterion("sr_answer is not null");
            return (Criteria) this;
        }

        public Criteria andSrAnswerEqualTo(String value) {
            addCriterion("sr_answer =", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerNotEqualTo(String value) {
            addCriterion("sr_answer <>", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerGreaterThan(String value) {
            addCriterion("sr_answer >", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("sr_answer >=", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerLessThan(String value) {
            addCriterion("sr_answer <", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerLessThanOrEqualTo(String value) {
            addCriterion("sr_answer <=", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerLike(String value) {
            addCriterion("sr_answer like", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerNotLike(String value) {
            addCriterion("sr_answer not like", value, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerIn(List<String> values) {
            addCriterion("sr_answer in", values, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerNotIn(List<String> values) {
            addCriterion("sr_answer not in", values, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerBetween(String value1, String value2) {
            addCriterion("sr_answer between", value1, value2, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrAnswerNotBetween(String value1, String value2) {
            addCriterion("sr_answer not between", value1, value2, "srAnswer");
            return (Criteria) this;
        }

        public Criteria andSrPwIsNull() {
            addCriterion("sr_pw is null");
            return (Criteria) this;
        }

        public Criteria andSrPwIsNotNull() {
            addCriterion("sr_pw is not null");
            return (Criteria) this;
        }

        public Criteria andSrPwEqualTo(String value) {
            addCriterion("sr_pw =", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwNotEqualTo(String value) {
            addCriterion("sr_pw <>", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwGreaterThan(String value) {
            addCriterion("sr_pw >", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwGreaterThanOrEqualTo(String value) {
            addCriterion("sr_pw >=", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwLessThan(String value) {
            addCriterion("sr_pw <", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwLessThanOrEqualTo(String value) {
            addCriterion("sr_pw <=", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwLike(String value) {
            addCriterion("sr_pw like", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwNotLike(String value) {
            addCriterion("sr_pw not like", value, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwIn(List<String> values) {
            addCriterion("sr_pw in", values, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwNotIn(List<String> values) {
            addCriterion("sr_pw not in", values, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwBetween(String value1, String value2) {
            addCriterion("sr_pw between", value1, value2, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrPwNotBetween(String value1, String value2) {
            addCriterion("sr_pw not between", value1, value2, "srPw");
            return (Criteria) this;
        }

        public Criteria andSrTimeIsNull() {
            addCriterion("sr_time is null");
            return (Criteria) this;
        }

        public Criteria andSrTimeIsNotNull() {
            addCriterion("sr_time is not null");
            return (Criteria) this;
        }

        public Criteria andSrTimeEqualTo(String value) {
            addCriterion("sr_time =", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeNotEqualTo(String value) {
            addCriterion("sr_time <>", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeGreaterThan(String value) {
            addCriterion("sr_time >", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sr_time >=", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeLessThan(String value) {
            addCriterion("sr_time <", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeLessThanOrEqualTo(String value) {
            addCriterion("sr_time <=", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeLike(String value) {
            addCriterion("sr_time like", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeNotLike(String value) {
            addCriterion("sr_time not like", value, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeIn(List<String> values) {
            addCriterion("sr_time in", values, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeNotIn(List<String> values) {
            addCriterion("sr_time not in", values, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeBetween(String value1, String value2) {
            addCriterion("sr_time between", value1, value2, "srTime");
            return (Criteria) this;
        }

        public Criteria andSrTimeNotBetween(String value1, String value2) {
            addCriterion("sr_time not between", value1, value2, "srTime");
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