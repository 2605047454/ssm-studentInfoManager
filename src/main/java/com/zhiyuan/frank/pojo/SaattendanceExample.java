package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SaattendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaattendanceExample() {
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

        public Criteria andSaIdIsNull() {
            addCriterion("sa_id is null");
            return (Criteria) this;
        }

        public Criteria andSaIdIsNotNull() {
            addCriterion("sa_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaIdEqualTo(Integer value) {
            addCriterion("sa_id =", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotEqualTo(Integer value) {
            addCriterion("sa_id <>", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThan(Integer value) {
            addCriterion("sa_id >", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_id >=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThan(Integer value) {
            addCriterion("sa_id <", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThanOrEqualTo(Integer value) {
            addCriterion("sa_id <=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdIn(List<Integer> values) {
            addCriterion("sa_id in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotIn(List<Integer> values) {
            addCriterion("sa_id not in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdBetween(Integer value1, Integer value2) {
            addCriterion("sa_id between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_id not between", value1, value2, "saId");
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

        public Criteria andSaLateIsNull() {
            addCriterion("sa_late is null");
            return (Criteria) this;
        }

        public Criteria andSaLateIsNotNull() {
            addCriterion("sa_late is not null");
            return (Criteria) this;
        }

        public Criteria andSaLateEqualTo(Integer value) {
            addCriterion("sa_late =", value, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateNotEqualTo(Integer value) {
            addCriterion("sa_late <>", value, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateGreaterThan(Integer value) {
            addCriterion("sa_late >", value, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_late >=", value, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateLessThan(Integer value) {
            addCriterion("sa_late <", value, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateLessThanOrEqualTo(Integer value) {
            addCriterion("sa_late <=", value, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateIn(List<Integer> values) {
            addCriterion("sa_late in", values, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateNotIn(List<Integer> values) {
            addCriterion("sa_late not in", values, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateBetween(Integer value1, Integer value2) {
            addCriterion("sa_late between", value1, value2, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaLateNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_late not between", value1, value2, "saLate");
            return (Criteria) this;
        }

        public Criteria andSaTruantIsNull() {
            addCriterion("sa_truant is null");
            return (Criteria) this;
        }

        public Criteria andSaTruantIsNotNull() {
            addCriterion("sa_truant is not null");
            return (Criteria) this;
        }

        public Criteria andSaTruantEqualTo(Integer value) {
            addCriterion("sa_truant =", value, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantNotEqualTo(Integer value) {
            addCriterion("sa_truant <>", value, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantGreaterThan(Integer value) {
            addCriterion("sa_truant >", value, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_truant >=", value, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantLessThan(Integer value) {
            addCriterion("sa_truant <", value, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantLessThanOrEqualTo(Integer value) {
            addCriterion("sa_truant <=", value, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantIn(List<Integer> values) {
            addCriterion("sa_truant in", values, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantNotIn(List<Integer> values) {
            addCriterion("sa_truant not in", values, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantBetween(Integer value1, Integer value2) {
            addCriterion("sa_truant between", value1, value2, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaTruantNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_truant not between", value1, value2, "saTruant");
            return (Criteria) this;
        }

        public Criteria andSaLeaveIsNull() {
            addCriterion("sa_leave is null");
            return (Criteria) this;
        }

        public Criteria andSaLeaveIsNotNull() {
            addCriterion("sa_leave is not null");
            return (Criteria) this;
        }

        public Criteria andSaLeaveEqualTo(Integer value) {
            addCriterion("sa_leave =", value, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveNotEqualTo(Integer value) {
            addCriterion("sa_leave <>", value, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveGreaterThan(Integer value) {
            addCriterion("sa_leave >", value, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_leave >=", value, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveLessThan(Integer value) {
            addCriterion("sa_leave <", value, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveLessThanOrEqualTo(Integer value) {
            addCriterion("sa_leave <=", value, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveIn(List<Integer> values) {
            addCriterion("sa_leave in", values, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveNotIn(List<Integer> values) {
            addCriterion("sa_leave not in", values, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveBetween(Integer value1, Integer value2) {
            addCriterion("sa_leave between", value1, value2, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaLeaveNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_leave not between", value1, value2, "saLeave");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassIsNull() {
            addCriterion("sa_skipclass is null");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassIsNotNull() {
            addCriterion("sa_skipclass is not null");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassEqualTo(Integer value) {
            addCriterion("sa_skipclass =", value, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassNotEqualTo(Integer value) {
            addCriterion("sa_skipclass <>", value, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassGreaterThan(Integer value) {
            addCriterion("sa_skipclass >", value, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_skipclass >=", value, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassLessThan(Integer value) {
            addCriterion("sa_skipclass <", value, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassLessThanOrEqualTo(Integer value) {
            addCriterion("sa_skipclass <=", value, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassIn(List<Integer> values) {
            addCriterion("sa_skipclass in", values, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassNotIn(List<Integer> values) {
            addCriterion("sa_skipclass not in", values, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassBetween(Integer value1, Integer value2) {
            addCriterion("sa_skipclass between", value1, value2, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaSkipclassNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_skipclass not between", value1, value2, "saSkipclass");
            return (Criteria) this;
        }

        public Criteria andSaWorkIsNull() {
            addCriterion("sa_work is null");
            return (Criteria) this;
        }

        public Criteria andSaWorkIsNotNull() {
            addCriterion("sa_work is not null");
            return (Criteria) this;
        }

        public Criteria andSaWorkEqualTo(Integer value) {
            addCriterion("sa_work =", value, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkNotEqualTo(Integer value) {
            addCriterion("sa_work <>", value, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkGreaterThan(Integer value) {
            addCriterion("sa_work >", value, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_work >=", value, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkLessThan(Integer value) {
            addCriterion("sa_work <", value, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkLessThanOrEqualTo(Integer value) {
            addCriterion("sa_work <=", value, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkIn(List<Integer> values) {
            addCriterion("sa_work in", values, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkNotIn(List<Integer> values) {
            addCriterion("sa_work not in", values, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkBetween(Integer value1, Integer value2) {
            addCriterion("sa_work between", value1, value2, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_work not between", value1, value2, "saWork");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeIsNull() {
            addCriterion("sa_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeIsNotNull() {
            addCriterion("sa_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeEqualTo(String value) {
            addCriterion("sa_recordtime =", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeNotEqualTo(String value) {
            addCriterion("sa_recordtime <>", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeGreaterThan(String value) {
            addCriterion("sa_recordtime >", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sa_recordtime >=", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeLessThan(String value) {
            addCriterion("sa_recordtime <", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("sa_recordtime <=", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeLike(String value) {
            addCriterion("sa_recordtime like", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeNotLike(String value) {
            addCriterion("sa_recordtime not like", value, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeIn(List<String> values) {
            addCriterion("sa_recordtime in", values, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeNotIn(List<String> values) {
            addCriterion("sa_recordtime not in", values, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeBetween(String value1, String value2) {
            addCriterion("sa_recordtime between", value1, value2, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaRecordtimeNotBetween(String value1, String value2) {
            addCriterion("sa_recordtime not between", value1, value2, "saRecordtime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeIsNull() {
            addCriterion("sa_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeIsNotNull() {
            addCriterion("sa_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeEqualTo(String value) {
            addCriterion("sa_lasttime =", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeNotEqualTo(String value) {
            addCriterion("sa_lasttime <>", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeGreaterThan(String value) {
            addCriterion("sa_lasttime >", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sa_lasttime >=", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeLessThan(String value) {
            addCriterion("sa_lasttime <", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeLessThanOrEqualTo(String value) {
            addCriterion("sa_lasttime <=", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeLike(String value) {
            addCriterion("sa_lasttime like", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeNotLike(String value) {
            addCriterion("sa_lasttime not like", value, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeIn(List<String> values) {
            addCriterion("sa_lasttime in", values, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeNotIn(List<String> values) {
            addCriterion("sa_lasttime not in", values, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeBetween(String value1, String value2) {
            addCriterion("sa_lasttime between", value1, value2, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaLasttimeNotBetween(String value1, String value2) {
            addCriterion("sa_lasttime not between", value1, value2, "saLasttime");
            return (Criteria) this;
        }

        public Criteria andSaGradeIsNull() {
            addCriterion("sa_grade is null");
            return (Criteria) this;
        }

        public Criteria andSaGradeIsNotNull() {
            addCriterion("sa_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSaGradeEqualTo(Integer value) {
            addCriterion("sa_grade =", value, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeNotEqualTo(Integer value) {
            addCriterion("sa_grade <>", value, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeGreaterThan(Integer value) {
            addCriterion("sa_grade >", value, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_grade >=", value, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeLessThan(Integer value) {
            addCriterion("sa_grade <", value, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeLessThanOrEqualTo(Integer value) {
            addCriterion("sa_grade <=", value, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeIn(List<Integer> values) {
            addCriterion("sa_grade in", values, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeNotIn(List<Integer> values) {
            addCriterion("sa_grade not in", values, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeBetween(Integer value1, Integer value2) {
            addCriterion("sa_grade between", value1, value2, "saGrade");
            return (Criteria) this;
        }

        public Criteria andSaGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_grade not between", value1, value2, "saGrade");
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