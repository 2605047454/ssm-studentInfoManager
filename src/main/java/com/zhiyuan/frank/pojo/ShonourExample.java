package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShonourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShonourExample() {
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

        public Criteria andShIdIsNull() {
            addCriterion("sh_id is null");
            return (Criteria) this;
        }

        public Criteria andShIdIsNotNull() {
            addCriterion("sh_id is not null");
            return (Criteria) this;
        }

        public Criteria andShIdEqualTo(Integer value) {
            addCriterion("sh_id =", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotEqualTo(Integer value) {
            addCriterion("sh_id <>", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThan(Integer value) {
            addCriterion("sh_id >", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sh_id >=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThan(Integer value) {
            addCriterion("sh_id <", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThanOrEqualTo(Integer value) {
            addCriterion("sh_id <=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdIn(List<Integer> values) {
            addCriterion("sh_id in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotIn(List<Integer> values) {
            addCriterion("sh_id not in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdBetween(Integer value1, Integer value2) {
            addCriterion("sh_id between", value1, value2, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sh_id not between", value1, value2, "shId");
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

        public Criteria andShNameIsNull() {
            addCriterion("sh_name is null");
            return (Criteria) this;
        }

        public Criteria andShNameIsNotNull() {
            addCriterion("sh_name is not null");
            return (Criteria) this;
        }

        public Criteria andShNameEqualTo(String value) {
            addCriterion("sh_name =", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotEqualTo(String value) {
            addCriterion("sh_name <>", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameGreaterThan(String value) {
            addCriterion("sh_name >", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameGreaterThanOrEqualTo(String value) {
            addCriterion("sh_name >=", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLessThan(String value) {
            addCriterion("sh_name <", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLessThanOrEqualTo(String value) {
            addCriterion("sh_name <=", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLike(String value) {
            addCriterion("sh_name like", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotLike(String value) {
            addCriterion("sh_name not like", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameIn(List<String> values) {
            addCriterion("sh_name in", values, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotIn(List<String> values) {
            addCriterion("sh_name not in", values, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameBetween(String value1, String value2) {
            addCriterion("sh_name between", value1, value2, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotBetween(String value1, String value2) {
            addCriterion("sh_name not between", value1, value2, "shName");
            return (Criteria) this;
        }

        public Criteria andShTiemIsNull() {
            addCriterion("sh_tiem is null");
            return (Criteria) this;
        }

        public Criteria andShTiemIsNotNull() {
            addCriterion("sh_tiem is not null");
            return (Criteria) this;
        }

        public Criteria andShTiemEqualTo(String value) {
            addCriterion("sh_tiem =", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemNotEqualTo(String value) {
            addCriterion("sh_tiem <>", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemGreaterThan(String value) {
            addCriterion("sh_tiem >", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemGreaterThanOrEqualTo(String value) {
            addCriterion("sh_tiem >=", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemLessThan(String value) {
            addCriterion("sh_tiem <", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemLessThanOrEqualTo(String value) {
            addCriterion("sh_tiem <=", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemLike(String value) {
            addCriterion("sh_tiem like", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemNotLike(String value) {
            addCriterion("sh_tiem not like", value, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemIn(List<String> values) {
            addCriterion("sh_tiem in", values, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemNotIn(List<String> values) {
            addCriterion("sh_tiem not in", values, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemBetween(String value1, String value2) {
            addCriterion("sh_tiem between", value1, value2, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShTiemNotBetween(String value1, String value2) {
            addCriterion("sh_tiem not between", value1, value2, "shTiem");
            return (Criteria) this;
        }

        public Criteria andShDescriptIsNull() {
            addCriterion("sh_descript is null");
            return (Criteria) this;
        }

        public Criteria andShDescriptIsNotNull() {
            addCriterion("sh_descript is not null");
            return (Criteria) this;
        }

        public Criteria andShDescriptEqualTo(String value) {
            addCriterion("sh_descript =", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptNotEqualTo(String value) {
            addCriterion("sh_descript <>", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptGreaterThan(String value) {
            addCriterion("sh_descript >", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("sh_descript >=", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptLessThan(String value) {
            addCriterion("sh_descript <", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptLessThanOrEqualTo(String value) {
            addCriterion("sh_descript <=", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptLike(String value) {
            addCriterion("sh_descript like", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptNotLike(String value) {
            addCriterion("sh_descript not like", value, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptIn(List<String> values) {
            addCriterion("sh_descript in", values, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptNotIn(List<String> values) {
            addCriterion("sh_descript not in", values, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptBetween(String value1, String value2) {
            addCriterion("sh_descript between", value1, value2, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShDescriptNotBetween(String value1, String value2) {
            addCriterion("sh_descript not between", value1, value2, "shDescript");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeIsNull() {
            addCriterion("sh_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeIsNotNull() {
            addCriterion("sh_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeEqualTo(String value) {
            addCriterion("sh_recordtime =", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeNotEqualTo(String value) {
            addCriterion("sh_recordtime <>", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeGreaterThan(String value) {
            addCriterion("sh_recordtime >", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sh_recordtime >=", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeLessThan(String value) {
            addCriterion("sh_recordtime <", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("sh_recordtime <=", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeLike(String value) {
            addCriterion("sh_recordtime like", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeNotLike(String value) {
            addCriterion("sh_recordtime not like", value, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeIn(List<String> values) {
            addCriterion("sh_recordtime in", values, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeNotIn(List<String> values) {
            addCriterion("sh_recordtime not in", values, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeBetween(String value1, String value2) {
            addCriterion("sh_recordtime between", value1, value2, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShRecordtimeNotBetween(String value1, String value2) {
            addCriterion("sh_recordtime not between", value1, value2, "shRecordtime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeIsNull() {
            addCriterion("sh_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andShLasttimeIsNotNull() {
            addCriterion("sh_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andShLasttimeEqualTo(String value) {
            addCriterion("sh_lasttime =", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeNotEqualTo(String value) {
            addCriterion("sh_lasttime <>", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeGreaterThan(String value) {
            addCriterion("sh_lasttime >", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sh_lasttime >=", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeLessThan(String value) {
            addCriterion("sh_lasttime <", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeLessThanOrEqualTo(String value) {
            addCriterion("sh_lasttime <=", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeLike(String value) {
            addCriterion("sh_lasttime like", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeNotLike(String value) {
            addCriterion("sh_lasttime not like", value, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeIn(List<String> values) {
            addCriterion("sh_lasttime in", values, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeNotIn(List<String> values) {
            addCriterion("sh_lasttime not in", values, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeBetween(String value1, String value2) {
            addCriterion("sh_lasttime between", value1, value2, "shLasttime");
            return (Criteria) this;
        }

        public Criteria andShLasttimeNotBetween(String value1, String value2) {
            addCriterion("sh_lasttime not between", value1, value2, "shLasttime");
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