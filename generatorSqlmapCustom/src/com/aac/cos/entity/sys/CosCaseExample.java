package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CosCaseExample {
    /**
     * cos_case
     */
    protected String orderByClause;

    /**
     * cos_case
     */
    protected boolean distinct;

    /**
     * cos_case
     */
    protected List<Criteria> oredCriteria;

    public CosCaseExample() {
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

    /**
     * cos_case 2016-07-13
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCaseCodeIsNull() {
            addCriterion("case_code is null");
            return (Criteria) this;
        }

        public Criteria andCaseCodeIsNotNull() {
            addCriterion("case_code is not null");
            return (Criteria) this;
        }

        public Criteria andCaseCodeEqualTo(String value) {
            addCriterion("case_code =", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeNotEqualTo(String value) {
            addCriterion("case_code <>", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeGreaterThan(String value) {
            addCriterion("case_code >", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("case_code >=", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeLessThan(String value) {
            addCriterion("case_code <", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeLessThanOrEqualTo(String value) {
            addCriterion("case_code <=", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeLike(String value) {
            addCriterion("case_code like", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeNotLike(String value) {
            addCriterion("case_code not like", value, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeIn(List<String> values) {
            addCriterion("case_code in", values, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeNotIn(List<String> values) {
            addCriterion("case_code not in", values, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeBetween(String value1, String value2) {
            addCriterion("case_code between", value1, value2, "caseCode");
            return (Criteria) this;
        }

        public Criteria andCaseCodeNotBetween(String value1, String value2) {
            addCriterion("case_code not between", value1, value2, "caseCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("state_code is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("state_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(Byte value) {
            addCriterion("state_code =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(Byte value) {
            addCriterion("state_code <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(Byte value) {
            addCriterion("state_code >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("state_code >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(Byte value) {
            addCriterion("state_code <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(Byte value) {
            addCriterion("state_code <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<Byte> values) {
            addCriterion("state_code in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<Byte> values) {
            addCriterion("state_code not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(Byte value1, Byte value2) {
            addCriterion("state_code between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("state_code not between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNull() {
            addCriterion("cus_id is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("cus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(Long value) {
            addCriterion("cus_id =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(Long value) {
            addCriterion("cus_id <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(Long value) {
            addCriterion("cus_id >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_id >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(Long value) {
            addCriterion("cus_id <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(Long value) {
            addCriterion("cus_id <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<Long> values) {
            addCriterion("cus_id in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<Long> values) {
            addCriterion("cus_id not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(Long value1, Long value2) {
            addCriterion("cus_id between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(Long value1, Long value2) {
            addCriterion("cus_id not between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andConlinIdIsNull() {
            addCriterion("conlin_id is null");
            return (Criteria) this;
        }

        public Criteria andConlinIdIsNotNull() {
            addCriterion("conlin_id is not null");
            return (Criteria) this;
        }

        public Criteria andConlinIdEqualTo(Long value) {
            addCriterion("conlin_id =", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdNotEqualTo(Long value) {
            addCriterion("conlin_id <>", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdGreaterThan(Long value) {
            addCriterion("conlin_id >", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdGreaterThanOrEqualTo(Long value) {
            addCriterion("conlin_id >=", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdLessThan(Long value) {
            addCriterion("conlin_id <", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdLessThanOrEqualTo(Long value) {
            addCriterion("conlin_id <=", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdIn(List<Long> values) {
            addCriterion("conlin_id in", values, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdNotIn(List<Long> values) {
            addCriterion("conlin_id not in", values, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdBetween(Long value1, Long value2) {
            addCriterion("conlin_id between", value1, value2, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdNotBetween(Long value1, Long value2) {
            addCriterion("conlin_id not between", value1, value2, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinNameIsNull() {
            addCriterion("conlin_name is null");
            return (Criteria) this;
        }

        public Criteria andConlinNameIsNotNull() {
            addCriterion("conlin_name is not null");
            return (Criteria) this;
        }

        public Criteria andConlinNameEqualTo(String value) {
            addCriterion("conlin_name =", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameNotEqualTo(String value) {
            addCriterion("conlin_name <>", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameGreaterThan(String value) {
            addCriterion("conlin_name >", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameGreaterThanOrEqualTo(String value) {
            addCriterion("conlin_name >=", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameLessThan(String value) {
            addCriterion("conlin_name <", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameLessThanOrEqualTo(String value) {
            addCriterion("conlin_name <=", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameLike(String value) {
            addCriterion("conlin_name like", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameNotLike(String value) {
            addCriterion("conlin_name not like", value, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameIn(List<String> values) {
            addCriterion("conlin_name in", values, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameNotIn(List<String> values) {
            addCriterion("conlin_name not in", values, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameBetween(String value1, String value2) {
            addCriterion("conlin_name between", value1, value2, "conlinName");
            return (Criteria) this;
        }

        public Criteria andConlinNameNotBetween(String value1, String value2) {
            addCriterion("conlin_name not between", value1, value2, "conlinName");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIsNull() {
            addCriterion("cus_phone is null");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIsNotNull() {
            addCriterion("cus_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCusPhoneEqualTo(String value) {
            addCriterion("cus_phone =", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotEqualTo(String value) {
            addCriterion("cus_phone <>", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneGreaterThan(String value) {
            addCriterion("cus_phone >", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cus_phone >=", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLessThan(String value) {
            addCriterion("cus_phone <", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLessThanOrEqualTo(String value) {
            addCriterion("cus_phone <=", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLike(String value) {
            addCriterion("cus_phone like", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotLike(String value) {
            addCriterion("cus_phone not like", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIn(List<String> values) {
            addCriterion("cus_phone in", values, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotIn(List<String> values) {
            addCriterion("cus_phone not in", values, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneBetween(String value1, String value2) {
            addCriterion("cus_phone between", value1, value2, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotBetween(String value1, String value2) {
            addCriterion("cus_phone not between", value1, value2, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andSidePhoneIsNull() {
            addCriterion("side_phone is null");
            return (Criteria) this;
        }

        public Criteria andSidePhoneIsNotNull() {
            addCriterion("side_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSidePhoneEqualTo(String value) {
            addCriterion("side_phone =", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneNotEqualTo(String value) {
            addCriterion("side_phone <>", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneGreaterThan(String value) {
            addCriterion("side_phone >", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("side_phone >=", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneLessThan(String value) {
            addCriterion("side_phone <", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneLessThanOrEqualTo(String value) {
            addCriterion("side_phone <=", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneLike(String value) {
            addCriterion("side_phone like", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneNotLike(String value) {
            addCriterion("side_phone not like", value, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneIn(List<String> values) {
            addCriterion("side_phone in", values, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneNotIn(List<String> values) {
            addCriterion("side_phone not in", values, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneBetween(String value1, String value2) {
            addCriterion("side_phone between", value1, value2, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andSidePhoneNotBetween(String value1, String value2) {
            addCriterion("side_phone not between", value1, value2, "sidePhone");
            return (Criteria) this;
        }

        public Criteria andBdPlaceIsNull() {
            addCriterion("bd_place is null");
            return (Criteria) this;
        }

        public Criteria andBdPlaceIsNotNull() {
            addCriterion("bd_place is not null");
            return (Criteria) this;
        }

        public Criteria andBdPlaceEqualTo(String value) {
            addCriterion("bd_place =", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotEqualTo(String value) {
            addCriterion("bd_place <>", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceGreaterThan(String value) {
            addCriterion("bd_place >", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("bd_place >=", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceLessThan(String value) {
            addCriterion("bd_place <", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceLessThanOrEqualTo(String value) {
            addCriterion("bd_place <=", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceLike(String value) {
            addCriterion("bd_place like", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotLike(String value) {
            addCriterion("bd_place not like", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceIn(List<String> values) {
            addCriterion("bd_place in", values, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotIn(List<String> values) {
            addCriterion("bd_place not in", values, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceBetween(String value1, String value2) {
            addCriterion("bd_place between", value1, value2, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotBetween(String value1, String value2) {
            addCriterion("bd_place not between", value1, value2, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdLongIsNull() {
            addCriterion("bd_long is null");
            return (Criteria) this;
        }

        public Criteria andBdLongIsNotNull() {
            addCriterion("bd_long is not null");
            return (Criteria) this;
        }

        public Criteria andBdLongEqualTo(Double value) {
            addCriterion("bd_long =", value, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongNotEqualTo(Double value) {
            addCriterion("bd_long <>", value, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongGreaterThan(Double value) {
            addCriterion("bd_long >", value, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongGreaterThanOrEqualTo(Double value) {
            addCriterion("bd_long >=", value, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongLessThan(Double value) {
            addCriterion("bd_long <", value, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongLessThanOrEqualTo(Double value) {
            addCriterion("bd_long <=", value, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongIn(List<Double> values) {
            addCriterion("bd_long in", values, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongNotIn(List<Double> values) {
            addCriterion("bd_long not in", values, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongBetween(Double value1, Double value2) {
            addCriterion("bd_long between", value1, value2, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLongNotBetween(Double value1, Double value2) {
            addCriterion("bd_long not between", value1, value2, "bdLong");
            return (Criteria) this;
        }

        public Criteria andBdLatIsNull() {
            addCriterion("bd_lat is null");
            return (Criteria) this;
        }

        public Criteria andBdLatIsNotNull() {
            addCriterion("bd_lat is not null");
            return (Criteria) this;
        }

        public Criteria andBdLatEqualTo(Double value) {
            addCriterion("bd_lat =", value, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatNotEqualTo(Double value) {
            addCriterion("bd_lat <>", value, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatGreaterThan(Double value) {
            addCriterion("bd_lat >", value, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatGreaterThanOrEqualTo(Double value) {
            addCriterion("bd_lat >=", value, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatLessThan(Double value) {
            addCriterion("bd_lat <", value, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatLessThanOrEqualTo(Double value) {
            addCriterion("bd_lat <=", value, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatIn(List<Double> values) {
            addCriterion("bd_lat in", values, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatNotIn(List<Double> values) {
            addCriterion("bd_lat not in", values, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatBetween(Double value1, Double value2) {
            addCriterion("bd_lat between", value1, value2, "bdLat");
            return (Criteria) this;
        }

        public Criteria andBdLatNotBetween(Double value1, Double value2) {
            addCriterion("bd_lat not between", value1, value2, "bdLat");
            return (Criteria) this;
        }

        public Criteria andRdPlaceIsNull() {
            addCriterion("rd_place is null");
            return (Criteria) this;
        }

        public Criteria andRdPlaceIsNotNull() {
            addCriterion("rd_place is not null");
            return (Criteria) this;
        }

        public Criteria andRdPlaceEqualTo(String value) {
            addCriterion("rd_place =", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceNotEqualTo(String value) {
            addCriterion("rd_place <>", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceGreaterThan(String value) {
            addCriterion("rd_place >", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("rd_place >=", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceLessThan(String value) {
            addCriterion("rd_place <", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceLessThanOrEqualTo(String value) {
            addCriterion("rd_place <=", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceLike(String value) {
            addCriterion("rd_place like", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceNotLike(String value) {
            addCriterion("rd_place not like", value, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceIn(List<String> values) {
            addCriterion("rd_place in", values, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceNotIn(List<String> values) {
            addCriterion("rd_place not in", values, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceBetween(String value1, String value2) {
            addCriterion("rd_place between", value1, value2, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdPlaceNotBetween(String value1, String value2) {
            addCriterion("rd_place not between", value1, value2, "rdPlace");
            return (Criteria) this;
        }

        public Criteria andRdLongIsNull() {
            addCriterion("rd_long is null");
            return (Criteria) this;
        }

        public Criteria andRdLongIsNotNull() {
            addCriterion("rd_long is not null");
            return (Criteria) this;
        }

        public Criteria andRdLongEqualTo(Double value) {
            addCriterion("rd_long =", value, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongNotEqualTo(Double value) {
            addCriterion("rd_long <>", value, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongGreaterThan(Double value) {
            addCriterion("rd_long >", value, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongGreaterThanOrEqualTo(Double value) {
            addCriterion("rd_long >=", value, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongLessThan(Double value) {
            addCriterion("rd_long <", value, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongLessThanOrEqualTo(Double value) {
            addCriterion("rd_long <=", value, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongIn(List<Double> values) {
            addCriterion("rd_long in", values, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongNotIn(List<Double> values) {
            addCriterion("rd_long not in", values, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongBetween(Double value1, Double value2) {
            addCriterion("rd_long between", value1, value2, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLongNotBetween(Double value1, Double value2) {
            addCriterion("rd_long not between", value1, value2, "rdLong");
            return (Criteria) this;
        }

        public Criteria andRdLatIsNull() {
            addCriterion("rd_lat is null");
            return (Criteria) this;
        }

        public Criteria andRdLatIsNotNull() {
            addCriterion("rd_lat is not null");
            return (Criteria) this;
        }

        public Criteria andRdLatEqualTo(Double value) {
            addCriterion("rd_lat =", value, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatNotEqualTo(Double value) {
            addCriterion("rd_lat <>", value, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatGreaterThan(Double value) {
            addCriterion("rd_lat >", value, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatGreaterThanOrEqualTo(Double value) {
            addCriterion("rd_lat >=", value, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatLessThan(Double value) {
            addCriterion("rd_lat <", value, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatLessThanOrEqualTo(Double value) {
            addCriterion("rd_lat <=", value, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatIn(List<Double> values) {
            addCriterion("rd_lat in", values, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatNotIn(List<Double> values) {
            addCriterion("rd_lat not in", values, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatBetween(Double value1, Double value2) {
            addCriterion("rd_lat between", value1, value2, "rdLat");
            return (Criteria) this;
        }

        public Criteria andRdLatNotBetween(Double value1, Double value2) {
            addCriterion("rd_lat not between", value1, value2, "rdLat");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNull() {
            addCriterion("work_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("work_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(Long value) {
            addCriterion("work_id =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(Long value) {
            addCriterion("work_id <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(Long value) {
            addCriterion("work_id >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("work_id >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(Long value) {
            addCriterion("work_id <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(Long value) {
            addCriterion("work_id <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<Long> values) {
            addCriterion("work_id in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<Long> values) {
            addCriterion("work_id not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(Long value1, Long value2) {
            addCriterion("work_id between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(Long value1, Long value2) {
            addCriterion("work_id not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNull() {
            addCriterion("work_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNotNull() {
            addCriterion("work_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNameEqualTo(String value) {
            addCriterion("work_name =", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotEqualTo(String value) {
            addCriterion("work_name <>", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThan(String value) {
            addCriterion("work_name >", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_name >=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThan(String value) {
            addCriterion("work_name <", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThanOrEqualTo(String value) {
            addCriterion("work_name <=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLike(String value) {
            addCriterion("work_name like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotLike(String value) {
            addCriterion("work_name not like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIn(List<String> values) {
            addCriterion("work_name in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotIn(List<String> values) {
            addCriterion("work_name not in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameBetween(String value1, String value2) {
            addCriterion("work_name between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotBetween(String value1, String value2) {
            addCriterion("work_name not between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNull() {
            addCriterion("work_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNotNull() {
            addCriterion("work_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDateEqualTo(Date value) {
            addCriterion("work_date =", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotEqualTo(Date value) {
            addCriterion("work_date <>", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThan(Date value) {
            addCriterion("work_date >", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("work_date >=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThan(Date value) {
            addCriterion("work_date <", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThanOrEqualTo(Date value) {
            addCriterion("work_date <=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIn(List<Date> values) {
            addCriterion("work_date in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotIn(List<Date> values) {
            addCriterion("work_date not in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateBetween(Date value1, Date value2) {
            addCriterion("work_date between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotBetween(Date value1, Date value2) {
            addCriterion("work_date not between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIsNull() {
            addCriterion("accident_type is null");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIsNotNull() {
            addCriterion("accident_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeEqualTo(Byte value) {
            addCriterion("accident_type =", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotEqualTo(Byte value) {
            addCriterion("accident_type <>", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeGreaterThan(Byte value) {
            addCriterion("accident_type >", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("accident_type >=", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeLessThan(Byte value) {
            addCriterion("accident_type <", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("accident_type <=", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIn(List<Byte> values) {
            addCriterion("accident_type in", values, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotIn(List<Byte> values) {
            addCriterion("accident_type not in", values, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeBetween(Byte value1, Byte value2) {
            addCriterion("accident_type between", value1, value2, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("accident_type not between", value1, value2, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeIsNull() {
            addCriterion("accident_info_type is null");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeIsNotNull() {
            addCriterion("accident_info_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeEqualTo(Byte value) {
            addCriterion("accident_info_type =", value, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeNotEqualTo(Byte value) {
            addCriterion("accident_info_type <>", value, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeGreaterThan(Byte value) {
            addCriterion("accident_info_type >", value, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("accident_info_type >=", value, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeLessThan(Byte value) {
            addCriterion("accident_info_type <", value, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeLessThanOrEqualTo(Byte value) {
            addCriterion("accident_info_type <=", value, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeIn(List<Byte> values) {
            addCriterion("accident_info_type in", values, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeNotIn(List<Byte> values) {
            addCriterion("accident_info_type not in", values, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeBetween(Byte value1, Byte value2) {
            addCriterion("accident_info_type between", value1, value2, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andAccidentInfoTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("accident_info_type not between", value1, value2, "accidentInfoType");
            return (Criteria) this;
        }

        public Criteria andIsMyCostIsNull() {
            addCriterion("is_my_cost is null");
            return (Criteria) this;
        }

        public Criteria andIsMyCostIsNotNull() {
            addCriterion("is_my_cost is not null");
            return (Criteria) this;
        }

        public Criteria andIsMyCostEqualTo(Byte value) {
            addCriterion("is_my_cost =", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostNotEqualTo(Byte value) {
            addCriterion("is_my_cost <>", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostGreaterThan(Byte value) {
            addCriterion("is_my_cost >", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_my_cost >=", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostLessThan(Byte value) {
            addCriterion("is_my_cost <", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostLessThanOrEqualTo(Byte value) {
            addCriterion("is_my_cost <=", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostIn(List<Byte> values) {
            addCriterion("is_my_cost in", values, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostNotIn(List<Byte> values) {
            addCriterion("is_my_cost not in", values, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostBetween(Byte value1, Byte value2) {
            addCriterion("is_my_cost between", value1, value2, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostNotBetween(Byte value1, Byte value2) {
            addCriterion("is_my_cost not between", value1, value2, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }
    }

    /**
     * cos_case
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * cos_case 2016-07-13
     */
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