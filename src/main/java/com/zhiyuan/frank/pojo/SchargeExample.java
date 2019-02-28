package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SchargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchargeExample() {
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
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

        public Criteria andScHouseIsNull() {
            addCriterion("sc_house is null");
            return (Criteria) this;
        }

        public Criteria andScHouseIsNotNull() {
            addCriterion("sc_house is not null");
            return (Criteria) this;
        }

        public Criteria andScHouseEqualTo(Integer value) {
            addCriterion("sc_house =", value, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseNotEqualTo(Integer value) {
            addCriterion("sc_house <>", value, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseGreaterThan(Integer value) {
            addCriterion("sc_house >", value, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_house >=", value, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseLessThan(Integer value) {
            addCriterion("sc_house <", value, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseLessThanOrEqualTo(Integer value) {
            addCriterion("sc_house <=", value, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseIn(List<Integer> values) {
            addCriterion("sc_house in", values, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseNotIn(List<Integer> values) {
            addCriterion("sc_house not in", values, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseBetween(Integer value1, Integer value2) {
            addCriterion("sc_house between", value1, value2, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScHouseNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_house not between", value1, value2, "scHouse");
            return (Criteria) this;
        }

        public Criteria andScLearnIsNull() {
            addCriterion("sc_learn is null");
            return (Criteria) this;
        }

        public Criteria andScLearnIsNotNull() {
            addCriterion("sc_learn is not null");
            return (Criteria) this;
        }

        public Criteria andScLearnEqualTo(Integer value) {
            addCriterion("sc_learn =", value, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnNotEqualTo(Integer value) {
            addCriterion("sc_learn <>", value, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnGreaterThan(Integer value) {
            addCriterion("sc_learn >", value, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_learn >=", value, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnLessThan(Integer value) {
            addCriterion("sc_learn <", value, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnLessThanOrEqualTo(Integer value) {
            addCriterion("sc_learn <=", value, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnIn(List<Integer> values) {
            addCriterion("sc_learn in", values, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnNotIn(List<Integer> values) {
            addCriterion("sc_learn not in", values, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnBetween(Integer value1, Integer value2) {
            addCriterion("sc_learn between", value1, value2, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScLearnNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_learn not between", value1, value2, "scLearn");
            return (Criteria) this;
        }

        public Criteria andScClassIsNull() {
            addCriterion("sc_class is null");
            return (Criteria) this;
        }

        public Criteria andScClassIsNotNull() {
            addCriterion("sc_class is not null");
            return (Criteria) this;
        }

        public Criteria andScClassEqualTo(Integer value) {
            addCriterion("sc_class =", value, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassNotEqualTo(Integer value) {
            addCriterion("sc_class <>", value, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassGreaterThan(Integer value) {
            addCriterion("sc_class >", value, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_class >=", value, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassLessThan(Integer value) {
            addCriterion("sc_class <", value, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassLessThanOrEqualTo(Integer value) {
            addCriterion("sc_class <=", value, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassIn(List<Integer> values) {
            addCriterion("sc_class in", values, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassNotIn(List<Integer> values) {
            addCriterion("sc_class not in", values, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassBetween(Integer value1, Integer value2) {
            addCriterion("sc_class between", value1, value2, "scClass");
            return (Criteria) this;
        }

        public Criteria andScClassNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_class not between", value1, value2, "scClass");
            return (Criteria) this;
        }

        public Criteria andScWaterIsNull() {
            addCriterion("sc_water is null");
            return (Criteria) this;
        }

        public Criteria andScWaterIsNotNull() {
            addCriterion("sc_water is not null");
            return (Criteria) this;
        }

        public Criteria andScWaterEqualTo(Integer value) {
            addCriterion("sc_water =", value, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterNotEqualTo(Integer value) {
            addCriterion("sc_water <>", value, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterGreaterThan(Integer value) {
            addCriterion("sc_water >", value, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_water >=", value, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterLessThan(Integer value) {
            addCriterion("sc_water <", value, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterLessThanOrEqualTo(Integer value) {
            addCriterion("sc_water <=", value, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterIn(List<Integer> values) {
            addCriterion("sc_water in", values, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterNotIn(List<Integer> values) {
            addCriterion("sc_water not in", values, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterBetween(Integer value1, Integer value2) {
            addCriterion("sc_water between", value1, value2, "scWater");
            return (Criteria) this;
        }

        public Criteria andScWaterNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_water not between", value1, value2, "scWater");
            return (Criteria) this;
        }

        public Criteria andScMilitaryIsNull() {
            addCriterion("sc_military is null");
            return (Criteria) this;
        }

        public Criteria andScMilitaryIsNotNull() {
            addCriterion("sc_military is not null");
            return (Criteria) this;
        }

        public Criteria andScMilitaryEqualTo(Integer value) {
            addCriterion("sc_military =", value, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryNotEqualTo(Integer value) {
            addCriterion("sc_military <>", value, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryGreaterThan(Integer value) {
            addCriterion("sc_military >", value, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_military >=", value, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryLessThan(Integer value) {
            addCriterion("sc_military <", value, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryLessThanOrEqualTo(Integer value) {
            addCriterion("sc_military <=", value, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryIn(List<Integer> values) {
            addCriterion("sc_military in", values, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryNotIn(List<Integer> values) {
            addCriterion("sc_military not in", values, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryBetween(Integer value1, Integer value2) {
            addCriterion("sc_military between", value1, value2, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScMilitaryNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_military not between", value1, value2, "scMilitary");
            return (Criteria) this;
        }

        public Criteria andScOtherIsNull() {
            addCriterion("sc_other is null");
            return (Criteria) this;
        }

        public Criteria andScOtherIsNotNull() {
            addCriterion("sc_other is not null");
            return (Criteria) this;
        }

        public Criteria andScOtherEqualTo(String value) {
            addCriterion("sc_other =", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherNotEqualTo(String value) {
            addCriterion("sc_other <>", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherGreaterThan(String value) {
            addCriterion("sc_other >", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherGreaterThanOrEqualTo(String value) {
            addCriterion("sc_other >=", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherLessThan(String value) {
            addCriterion("sc_other <", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherLessThanOrEqualTo(String value) {
            addCriterion("sc_other <=", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherLike(String value) {
            addCriterion("sc_other like", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherNotLike(String value) {
            addCriterion("sc_other not like", value, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherIn(List<String> values) {
            addCriterion("sc_other in", values, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherNotIn(List<String> values) {
            addCriterion("sc_other not in", values, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherBetween(String value1, String value2) {
            addCriterion("sc_other between", value1, value2, "scOther");
            return (Criteria) this;
        }

        public Criteria andScOtherNotBetween(String value1, String value2) {
            addCriterion("sc_other not between", value1, value2, "scOther");
            return (Criteria) this;
        }

        public Criteria andScStatusIsNull() {
            addCriterion("sc_status is null");
            return (Criteria) this;
        }

        public Criteria andScStatusIsNotNull() {
            addCriterion("sc_status is not null");
            return (Criteria) this;
        }

        public Criteria andScStatusEqualTo(Integer value) {
            addCriterion("sc_status =", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusNotEqualTo(Integer value) {
            addCriterion("sc_status <>", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusGreaterThan(Integer value) {
            addCriterion("sc_status >", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_status >=", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusLessThan(Integer value) {
            addCriterion("sc_status <", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sc_status <=", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusIn(List<Integer> values) {
            addCriterion("sc_status in", values, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusNotIn(List<Integer> values) {
            addCriterion("sc_status not in", values, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusBetween(Integer value1, Integer value2) {
            addCriterion("sc_status between", value1, value2, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_status not between", value1, value2, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeIsNull() {
            addCriterion("sc_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeIsNotNull() {
            addCriterion("sc_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeEqualTo(String value) {
            addCriterion("sc_recordtime =", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeNotEqualTo(String value) {
            addCriterion("sc_recordtime <>", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeGreaterThan(String value) {
            addCriterion("sc_recordtime >", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sc_recordtime >=", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeLessThan(String value) {
            addCriterion("sc_recordtime <", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("sc_recordtime <=", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeLike(String value) {
            addCriterion("sc_recordtime like", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeNotLike(String value) {
            addCriterion("sc_recordtime not like", value, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeIn(List<String> values) {
            addCriterion("sc_recordtime in", values, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeNotIn(List<String> values) {
            addCriterion("sc_recordtime not in", values, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeBetween(String value1, String value2) {
            addCriterion("sc_recordtime between", value1, value2, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScRecordtimeNotBetween(String value1, String value2) {
            addCriterion("sc_recordtime not between", value1, value2, "scRecordtime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeIsNull() {
            addCriterion("sc_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andScLasttimeIsNotNull() {
            addCriterion("sc_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andScLasttimeEqualTo(String value) {
            addCriterion("sc_lasttime =", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeNotEqualTo(String value) {
            addCriterion("sc_lasttime <>", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeGreaterThan(String value) {
            addCriterion("sc_lasttime >", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sc_lasttime >=", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeLessThan(String value) {
            addCriterion("sc_lasttime <", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeLessThanOrEqualTo(String value) {
            addCriterion("sc_lasttime <=", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeLike(String value) {
            addCriterion("sc_lasttime like", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeNotLike(String value) {
            addCriterion("sc_lasttime not like", value, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeIn(List<String> values) {
            addCriterion("sc_lasttime in", values, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeNotIn(List<String> values) {
            addCriterion("sc_lasttime not in", values, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeBetween(String value1, String value2) {
            addCriterion("sc_lasttime between", value1, value2, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScLasttimeNotBetween(String value1, String value2) {
            addCriterion("sc_lasttime not between", value1, value2, "scLasttime");
            return (Criteria) this;
        }

        public Criteria andScDegreeIsNull() {
            addCriterion("sc_degree is null");
            return (Criteria) this;
        }

        public Criteria andScDegreeIsNotNull() {
            addCriterion("sc_degree is not null");
            return (Criteria) this;
        }

        public Criteria andScDegreeEqualTo(Integer value) {
            addCriterion("sc_degree =", value, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeNotEqualTo(Integer value) {
            addCriterion("sc_degree <>", value, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeGreaterThan(Integer value) {
            addCriterion("sc_degree >", value, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_degree >=", value, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeLessThan(Integer value) {
            addCriterion("sc_degree <", value, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("sc_degree <=", value, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeIn(List<Integer> values) {
            addCriterion("sc_degree in", values, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeNotIn(List<Integer> values) {
            addCriterion("sc_degree not in", values, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeBetween(Integer value1, Integer value2) {
            addCriterion("sc_degree between", value1, value2, "scDegree");
            return (Criteria) this;
        }

        public Criteria andScDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_degree not between", value1, value2, "scDegree");
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