package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SbadbehaviorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbadbehaviorExample() {
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

        public Criteria andSbIdIsNull() {
            addCriterion("sb_id is null");
            return (Criteria) this;
        }

        public Criteria andSbIdIsNotNull() {
            addCriterion("sb_id is not null");
            return (Criteria) this;
        }

        public Criteria andSbIdEqualTo(Integer value) {
            addCriterion("sb_id =", value, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdNotEqualTo(Integer value) {
            addCriterion("sb_id <>", value, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdGreaterThan(Integer value) {
            addCriterion("sb_id >", value, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sb_id >=", value, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdLessThan(Integer value) {
            addCriterion("sb_id <", value, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdLessThanOrEqualTo(Integer value) {
            addCriterion("sb_id <=", value, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdIn(List<Integer> values) {
            addCriterion("sb_id in", values, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdNotIn(List<Integer> values) {
            addCriterion("sb_id not in", values, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdBetween(Integer value1, Integer value2) {
            addCriterion("sb_id between", value1, value2, "sbId");
            return (Criteria) this;
        }

        public Criteria andSbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sb_id not between", value1, value2, "sbId");
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

        public Criteria andSbDescriptIsNull() {
            addCriterion("sb_descript is null");
            return (Criteria) this;
        }

        public Criteria andSbDescriptIsNotNull() {
            addCriterion("sb_descript is not null");
            return (Criteria) this;
        }

        public Criteria andSbDescriptEqualTo(String value) {
            addCriterion("sb_descript =", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptNotEqualTo(String value) {
            addCriterion("sb_descript <>", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptGreaterThan(String value) {
            addCriterion("sb_descript >", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("sb_descript >=", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptLessThan(String value) {
            addCriterion("sb_descript <", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptLessThanOrEqualTo(String value) {
            addCriterion("sb_descript <=", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptLike(String value) {
            addCriterion("sb_descript like", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptNotLike(String value) {
            addCriterion("sb_descript not like", value, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptIn(List<String> values) {
            addCriterion("sb_descript in", values, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptNotIn(List<String> values) {
            addCriterion("sb_descript not in", values, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptBetween(String value1, String value2) {
            addCriterion("sb_descript between", value1, value2, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbDescriptNotBetween(String value1, String value2) {
            addCriterion("sb_descript not between", value1, value2, "sbDescript");
            return (Criteria) this;
        }

        public Criteria andSbApprovalIsNull() {
            addCriterion("\"sb_ Approval\" is null");
            return (Criteria) this;
        }

        public Criteria andSbApprovalIsNotNull() {
            addCriterion("\"sb_ Approval\" is not null");
            return (Criteria) this;
        }

        public Criteria andSbApprovalEqualTo(String value) {
            addCriterion("\"sb_ Approval\" =", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalNotEqualTo(String value) {
            addCriterion("\"sb_ Approval\" <>", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalGreaterThan(String value) {
            addCriterion("\"sb_ Approval\" >", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("\"sb_ Approval\" >=", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalLessThan(String value) {
            addCriterion("\"sb_ Approval\" <", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalLessThanOrEqualTo(String value) {
            addCriterion("\"sb_ Approval\" <=", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalLike(String value) {
            addCriterion("\"sb_ Approval\" like", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalNotLike(String value) {
            addCriterion("\"sb_ Approval\" not like", value, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalIn(List<String> values) {
            addCriterion("\"sb_ Approval\" in", values, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalNotIn(List<String> values) {
            addCriterion("\"sb_ Approval\" not in", values, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalBetween(String value1, String value2) {
            addCriterion("\"sb_ Approval\" between", value1, value2, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbApprovalNotBetween(String value1, String value2) {
            addCriterion("\"sb_ Approval\" not between", value1, value2, "sbApproval");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeIsNull() {
            addCriterion("sb_appendtime is null");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeIsNotNull() {
            addCriterion("sb_appendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeEqualTo(String value) {
            addCriterion("sb_appendtime =", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeNotEqualTo(String value) {
            addCriterion("sb_appendtime <>", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeGreaterThan(String value) {
            addCriterion("sb_appendtime >", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sb_appendtime >=", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeLessThan(String value) {
            addCriterion("sb_appendtime <", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeLessThanOrEqualTo(String value) {
            addCriterion("sb_appendtime <=", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeLike(String value) {
            addCriterion("sb_appendtime like", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeNotLike(String value) {
            addCriterion("sb_appendtime not like", value, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeIn(List<String> values) {
            addCriterion("sb_appendtime in", values, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeNotIn(List<String> values) {
            addCriterion("sb_appendtime not in", values, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeBetween(String value1, String value2) {
            addCriterion("sb_appendtime between", value1, value2, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbAppendtimeNotBetween(String value1, String value2) {
            addCriterion("sb_appendtime not between", value1, value2, "sbAppendtime");
            return (Criteria) this;
        }

        public Criteria andSbResultIsNull() {
            addCriterion("sb_result is null");
            return (Criteria) this;
        }

        public Criteria andSbResultIsNotNull() {
            addCriterion("sb_result is not null");
            return (Criteria) this;
        }

        public Criteria andSbResultEqualTo(String value) {
            addCriterion("sb_result =", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultNotEqualTo(String value) {
            addCriterion("sb_result <>", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultGreaterThan(String value) {
            addCriterion("sb_result >", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultGreaterThanOrEqualTo(String value) {
            addCriterion("sb_result >=", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultLessThan(String value) {
            addCriterion("sb_result <", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultLessThanOrEqualTo(String value) {
            addCriterion("sb_result <=", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultLike(String value) {
            addCriterion("sb_result like", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultNotLike(String value) {
            addCriterion("sb_result not like", value, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultIn(List<String> values) {
            addCriterion("sb_result in", values, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultNotIn(List<String> values) {
            addCriterion("sb_result not in", values, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultBetween(String value1, String value2) {
            addCriterion("sb_result between", value1, value2, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbResultNotBetween(String value1, String value2) {
            addCriterion("sb_result not between", value1, value2, "sbResult");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryIsNull() {
            addCriterion("\"sb_ accessory\" is null");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryIsNotNull() {
            addCriterion("\"sb_ accessory\" is not null");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryEqualTo(String value) {
            addCriterion("\"sb_ accessory\" =", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryNotEqualTo(String value) {
            addCriterion("\"sb_ accessory\" <>", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryGreaterThan(String value) {
            addCriterion("\"sb_ accessory\" >", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("\"sb_ accessory\" >=", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryLessThan(String value) {
            addCriterion("\"sb_ accessory\" <", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryLessThanOrEqualTo(String value) {
            addCriterion("\"sb_ accessory\" <=", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryLike(String value) {
            addCriterion("\"sb_ accessory\" like", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryNotLike(String value) {
            addCriterion("\"sb_ accessory\" not like", value, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryIn(List<String> values) {
            addCriterion("\"sb_ accessory\" in", values, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryNotIn(List<String> values) {
            addCriterion("\"sb_ accessory\" not in", values, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryBetween(String value1, String value2) {
            addCriterion("\"sb_ accessory\" between", value1, value2, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbAccessoryNotBetween(String value1, String value2) {
            addCriterion("\"sb_ accessory\" not between", value1, value2, "sbAccessory");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeIsNull() {
            addCriterion("sb_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeIsNotNull() {
            addCriterion("sb_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeEqualTo(String value) {
            addCriterion("sb_recordtime =", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeNotEqualTo(String value) {
            addCriterion("sb_recordtime <>", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeGreaterThan(String value) {
            addCriterion("sb_recordtime >", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sb_recordtime >=", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeLessThan(String value) {
            addCriterion("sb_recordtime <", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("sb_recordtime <=", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeLike(String value) {
            addCriterion("sb_recordtime like", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeNotLike(String value) {
            addCriterion("sb_recordtime not like", value, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeIn(List<String> values) {
            addCriterion("sb_recordtime in", values, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeNotIn(List<String> values) {
            addCriterion("sb_recordtime not in", values, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeBetween(String value1, String value2) {
            addCriterion("sb_recordtime between", value1, value2, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbRecordtimeNotBetween(String value1, String value2) {
            addCriterion("sb_recordtime not between", value1, value2, "sbRecordtime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeIsNull() {
            addCriterion("sb_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeIsNotNull() {
            addCriterion("sb_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeEqualTo(String value) {
            addCriterion("sb_lasttime =", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeNotEqualTo(String value) {
            addCriterion("sb_lasttime <>", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeGreaterThan(String value) {
            addCriterion("sb_lasttime >", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sb_lasttime >=", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeLessThan(String value) {
            addCriterion("sb_lasttime <", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeLessThanOrEqualTo(String value) {
            addCriterion("sb_lasttime <=", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeLike(String value) {
            addCriterion("sb_lasttime like", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeNotLike(String value) {
            addCriterion("sb_lasttime not like", value, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeIn(List<String> values) {
            addCriterion("sb_lasttime in", values, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeNotIn(List<String> values) {
            addCriterion("sb_lasttime not in", values, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeBetween(String value1, String value2) {
            addCriterion("sb_lasttime between", value1, value2, "sbLasttime");
            return (Criteria) this;
        }

        public Criteria andSbLasttimeNotBetween(String value1, String value2) {
            addCriterion("sb_lasttime not between", value1, value2, "sbLasttime");
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