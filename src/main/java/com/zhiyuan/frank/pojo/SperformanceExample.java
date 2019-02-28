package com.zhiyuan.frank.pojo;

import java.util.ArrayList;
import java.util.List;

public class SperformanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SperformanceExample() {
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

        public Criteria andSpPidIsNull() {
            addCriterion("sp_pid is null");
            return (Criteria) this;
        }

        public Criteria andSpPidIsNotNull() {
            addCriterion("sp_pid is not null");
            return (Criteria) this;
        }

        public Criteria andSpPidEqualTo(Integer value) {
            addCriterion("sp_pid =", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidNotEqualTo(Integer value) {
            addCriterion("sp_pid <>", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidGreaterThan(Integer value) {
            addCriterion("sp_pid >", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_pid >=", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidLessThan(Integer value) {
            addCriterion("sp_pid <", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_pid <=", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidIn(List<Integer> values) {
            addCriterion("sp_pid in", values, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidNotIn(List<Integer> values) {
            addCriterion("sp_pid not in", values, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidBetween(Integer value1, Integer value2) {
            addCriterion("sp_pid between", value1, value2, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_pid not between", value1, value2, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpNumberIsNull() {
            addCriterion("sp_number is null");
            return (Criteria) this;
        }

        public Criteria andSpNumberIsNotNull() {
            addCriterion("sp_number is not null");
            return (Criteria) this;
        }

        public Criteria andSpNumberEqualTo(Integer value) {
            addCriterion("sp_number =", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberNotEqualTo(Integer value) {
            addCriterion("sp_number <>", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberGreaterThan(Integer value) {
            addCriterion("sp_number >", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_number >=", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberLessThan(Integer value) {
            addCriterion("sp_number <", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sp_number <=", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberIn(List<Integer> values) {
            addCriterion("sp_number in", values, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberNotIn(List<Integer> values) {
            addCriterion("sp_number not in", values, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberBetween(Integer value1, Integer value2) {
            addCriterion("sp_number between", value1, value2, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_number not between", value1, value2, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpZhIsNull() {
            addCriterion("sp_zh is null");
            return (Criteria) this;
        }

        public Criteria andSpZhIsNotNull() {
            addCriterion("sp_zh is not null");
            return (Criteria) this;
        }

        public Criteria andSpZhEqualTo(Integer value) {
            addCriterion("sp_zh =", value, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhNotEqualTo(Integer value) {
            addCriterion("sp_zh <>", value, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhGreaterThan(Integer value) {
            addCriterion("sp_zh >", value, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_zh >=", value, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhLessThan(Integer value) {
            addCriterion("sp_zh <", value, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhLessThanOrEqualTo(Integer value) {
            addCriterion("sp_zh <=", value, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhIn(List<Integer> values) {
            addCriterion("sp_zh in", values, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhNotIn(List<Integer> values) {
            addCriterion("sp_zh not in", values, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhBetween(Integer value1, Integer value2) {
            addCriterion("sp_zh between", value1, value2, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpZhNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_zh not between", value1, value2, "spZh");
            return (Criteria) this;
        }

        public Criteria andSpMathIsNull() {
            addCriterion("sp_math is null");
            return (Criteria) this;
        }

        public Criteria andSpMathIsNotNull() {
            addCriterion("sp_math is not null");
            return (Criteria) this;
        }

        public Criteria andSpMathEqualTo(Integer value) {
            addCriterion("sp_math =", value, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathNotEqualTo(Integer value) {
            addCriterion("sp_math <>", value, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathGreaterThan(Integer value) {
            addCriterion("sp_math >", value, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_math >=", value, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathLessThan(Integer value) {
            addCriterion("sp_math <", value, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathLessThanOrEqualTo(Integer value) {
            addCriterion("sp_math <=", value, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathIn(List<Integer> values) {
            addCriterion("sp_math in", values, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathNotIn(List<Integer> values) {
            addCriterion("sp_math not in", values, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathBetween(Integer value1, Integer value2) {
            addCriterion("sp_math between", value1, value2, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpMathNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_math not between", value1, value2, "spMath");
            return (Criteria) this;
        }

        public Criteria andSpEnIsNull() {
            addCriterion("sp_en is null");
            return (Criteria) this;
        }

        public Criteria andSpEnIsNotNull() {
            addCriterion("sp_en is not null");
            return (Criteria) this;
        }

        public Criteria andSpEnEqualTo(Integer value) {
            addCriterion("sp_en =", value, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnNotEqualTo(Integer value) {
            addCriterion("sp_en <>", value, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnGreaterThan(Integer value) {
            addCriterion("sp_en >", value, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_en >=", value, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnLessThan(Integer value) {
            addCriterion("sp_en <", value, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnLessThanOrEqualTo(Integer value) {
            addCriterion("sp_en <=", value, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnIn(List<Integer> values) {
            addCriterion("sp_en in", values, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnNotIn(List<Integer> values) {
            addCriterion("sp_en not in", values, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnBetween(Integer value1, Integer value2) {
            addCriterion("sp_en between", value1, value2, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpEnNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_en not between", value1, value2, "spEn");
            return (Criteria) this;
        }

        public Criteria andSpMusicIsNull() {
            addCriterion("sp_music is null");
            return (Criteria) this;
        }

        public Criteria andSpMusicIsNotNull() {
            addCriterion("sp_music is not null");
            return (Criteria) this;
        }

        public Criteria andSpMusicEqualTo(Integer value) {
            addCriterion("sp_music =", value, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicNotEqualTo(Integer value) {
            addCriterion("sp_music <>", value, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicGreaterThan(Integer value) {
            addCriterion("sp_music >", value, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_music >=", value, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicLessThan(Integer value) {
            addCriterion("sp_music <", value, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicLessThanOrEqualTo(Integer value) {
            addCriterion("sp_music <=", value, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicIn(List<Integer> values) {
            addCriterion("sp_music in", values, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicNotIn(List<Integer> values) {
            addCriterion("sp_music not in", values, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicBetween(Integer value1, Integer value2) {
            addCriterion("sp_music between", value1, value2, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpMusicNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_music not between", value1, value2, "spMusic");
            return (Criteria) this;
        }

        public Criteria andSpSportIsNull() {
            addCriterion("sp_sport is null");
            return (Criteria) this;
        }

        public Criteria andSpSportIsNotNull() {
            addCriterion("sp_sport is not null");
            return (Criteria) this;
        }

        public Criteria andSpSportEqualTo(Integer value) {
            addCriterion("sp_sport =", value, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportNotEqualTo(Integer value) {
            addCriterion("sp_sport <>", value, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportGreaterThan(Integer value) {
            addCriterion("sp_sport >", value, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_sport >=", value, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportLessThan(Integer value) {
            addCriterion("sp_sport <", value, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportLessThanOrEqualTo(Integer value) {
            addCriterion("sp_sport <=", value, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportIn(List<Integer> values) {
            addCriterion("sp_sport in", values, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportNotIn(List<Integer> values) {
            addCriterion("sp_sport not in", values, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportBetween(Integer value1, Integer value2) {
            addCriterion("sp_sport between", value1, value2, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpSportNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_sport not between", value1, value2, "spSport");
            return (Criteria) this;
        }

        public Criteria andSpArtIsNull() {
            addCriterion("sp_art is null");
            return (Criteria) this;
        }

        public Criteria andSpArtIsNotNull() {
            addCriterion("sp_art is not null");
            return (Criteria) this;
        }

        public Criteria andSpArtEqualTo(Integer value) {
            addCriterion("sp_art =", value, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtNotEqualTo(Integer value) {
            addCriterion("sp_art <>", value, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtGreaterThan(Integer value) {
            addCriterion("sp_art >", value, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_art >=", value, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtLessThan(Integer value) {
            addCriterion("sp_art <", value, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtLessThanOrEqualTo(Integer value) {
            addCriterion("sp_art <=", value, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtIn(List<Integer> values) {
            addCriterion("sp_art in", values, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtNotIn(List<Integer> values) {
            addCriterion("sp_art not in", values, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtBetween(Integer value1, Integer value2) {
            addCriterion("sp_art between", value1, value2, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpArtNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_art not between", value1, value2, "spArt");
            return (Criteria) this;
        }

        public Criteria andSpProfessionIsNull() {
            addCriterion("sp_profession is null");
            return (Criteria) this;
        }

        public Criteria andSpProfessionIsNotNull() {
            addCriterion("sp_profession is not null");
            return (Criteria) this;
        }

        public Criteria andSpProfessionEqualTo(Integer value) {
            addCriterion("sp_profession =", value, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionNotEqualTo(Integer value) {
            addCriterion("sp_profession <>", value, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionGreaterThan(Integer value) {
            addCriterion("sp_profession >", value, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_profession >=", value, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionLessThan(Integer value) {
            addCriterion("sp_profession <", value, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionLessThanOrEqualTo(Integer value) {
            addCriterion("sp_profession <=", value, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionIn(List<Integer> values) {
            addCriterion("sp_profession in", values, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionNotIn(List<Integer> values) {
            addCriterion("sp_profession not in", values, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionBetween(Integer value1, Integer value2) {
            addCriterion("sp_profession between", value1, value2, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpProfessionNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_profession not between", value1, value2, "spProfession");
            return (Criteria) this;
        }

        public Criteria andSpPtypeIsNull() {
            addCriterion("sp_ptype is null");
            return (Criteria) this;
        }

        public Criteria andSpPtypeIsNotNull() {
            addCriterion("sp_ptype is not null");
            return (Criteria) this;
        }

        public Criteria andSpPtypeEqualTo(Integer value) {
            addCriterion("sp_ptype =", value, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeNotEqualTo(Integer value) {
            addCriterion("sp_ptype <>", value, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeGreaterThan(Integer value) {
            addCriterion("sp_ptype >", value, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ptype >=", value, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeLessThan(Integer value) {
            addCriterion("sp_ptype <", value, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ptype <=", value, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeIn(List<Integer> values) {
            addCriterion("sp_ptype in", values, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeNotIn(List<Integer> values) {
            addCriterion("sp_ptype not in", values, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeBetween(Integer value1, Integer value2) {
            addCriterion("sp_ptype between", value1, value2, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpPtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ptype not between", value1, value2, "spPtype");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeIsNull() {
            addCriterion("sp_recordtime is null");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeIsNotNull() {
            addCriterion("sp_recordtime is not null");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeEqualTo(String value) {
            addCriterion("sp_recordtime =", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeNotEqualTo(String value) {
            addCriterion("sp_recordtime <>", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeGreaterThan(String value) {
            addCriterion("sp_recordtime >", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_recordtime >=", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeLessThan(String value) {
            addCriterion("sp_recordtime <", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeLessThanOrEqualTo(String value) {
            addCriterion("sp_recordtime <=", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeLike(String value) {
            addCriterion("sp_recordtime like", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeNotLike(String value) {
            addCriterion("sp_recordtime not like", value, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeIn(List<String> values) {
            addCriterion("sp_recordtime in", values, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeNotIn(List<String> values) {
            addCriterion("sp_recordtime not in", values, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeBetween(String value1, String value2) {
            addCriterion("sp_recordtime between", value1, value2, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpRecordtimeNotBetween(String value1, String value2) {
            addCriterion("sp_recordtime not between", value1, value2, "spRecordtime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeIsNull() {
            addCriterion("sp_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeIsNotNull() {
            addCriterion("sp_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeEqualTo(String value) {
            addCriterion("sp_lasttime =", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeNotEqualTo(String value) {
            addCriterion("sp_lasttime <>", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeGreaterThan(String value) {
            addCriterion("sp_lasttime >", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_lasttime >=", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeLessThan(String value) {
            addCriterion("sp_lasttime <", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeLessThanOrEqualTo(String value) {
            addCriterion("sp_lasttime <=", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeLike(String value) {
            addCriterion("sp_lasttime like", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeNotLike(String value) {
            addCriterion("sp_lasttime not like", value, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeIn(List<String> values) {
            addCriterion("sp_lasttime in", values, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeNotIn(List<String> values) {
            addCriterion("sp_lasttime not in", values, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeBetween(String value1, String value2) {
            addCriterion("sp_lasttime between", value1, value2, "spLasttime");
            return (Criteria) this;
        }

        public Criteria andSpLasttimeNotBetween(String value1, String value2) {
            addCriterion("sp_lasttime not between", value1, value2, "spLasttime");
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