package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CosCaseTaskExample {
    /**
     * cos_case_task
     */
    protected String orderByClause;

    /**
     * cos_case_task
     */
    protected boolean distinct;

    /**
     * cos_case_task
     */
    protected List<Criteria> oredCriteria;

    public CosCaseTaskExample() {
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
     * cos_case_task 2016-07-13
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

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Long value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Long value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Long value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Long value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Long> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Long> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Long value1, Long value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("task_code =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("task_code <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("task_code >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_code >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("task_code <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("task_code <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("task_code like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("task_code not like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("task_code in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("task_code not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
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

        public Criteria andRescueItemIsNull() {
            addCriterion("rescue_item is null");
            return (Criteria) this;
        }

        public Criteria andRescueItemIsNotNull() {
            addCriterion("rescue_item is not null");
            return (Criteria) this;
        }

        public Criteria andRescueItemEqualTo(Byte value) {
            addCriterion("rescue_item =", value, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemNotEqualTo(Byte value) {
            addCriterion("rescue_item <>", value, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemGreaterThan(Byte value) {
            addCriterion("rescue_item >", value, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemGreaterThanOrEqualTo(Byte value) {
            addCriterion("rescue_item >=", value, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemLessThan(Byte value) {
            addCriterion("rescue_item <", value, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemLessThanOrEqualTo(Byte value) {
            addCriterion("rescue_item <=", value, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemIn(List<Byte> values) {
            addCriterion("rescue_item in", values, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemNotIn(List<Byte> values) {
            addCriterion("rescue_item not in", values, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemBetween(Byte value1, Byte value2) {
            addCriterion("rescue_item between", value1, value2, "rescueItem");
            return (Criteria) this;
        }

        public Criteria andRescueItemNotBetween(Byte value1, Byte value2) {
            addCriterion("rescue_item not between", value1, value2, "rescueItem");
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

        public Criteria andTaskCreateDateIsNull() {
            addCriterion("task_create_date is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateIsNotNull() {
            addCriterion("task_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateEqualTo(Date value) {
            addCriterion("task_create_date =", value, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateNotEqualTo(Date value) {
            addCriterion("task_create_date <>", value, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateGreaterThan(Date value) {
            addCriterion("task_create_date >", value, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("task_create_date >=", value, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateLessThan(Date value) {
            addCriterion("task_create_date <", value, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("task_create_date <=", value, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateIn(List<Date> values) {
            addCriterion("task_create_date in", values, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateNotIn(List<Date> values) {
            addCriterion("task_create_date not in", values, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateBetween(Date value1, Date value2) {
            addCriterion("task_create_date between", value1, value2, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andTaskCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("task_create_date not between", value1, value2, "taskCreateDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateIsNull() {
            addCriterion("distribution_date is null");
            return (Criteria) this;
        }

        public Criteria andDistributionDateIsNotNull() {
            addCriterion("distribution_date is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionDateEqualTo(Date value) {
            addCriterion("distribution_date =", value, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateNotEqualTo(Date value) {
            addCriterion("distribution_date <>", value, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateGreaterThan(Date value) {
            addCriterion("distribution_date >", value, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_date >=", value, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateLessThan(Date value) {
            addCriterion("distribution_date <", value, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateLessThanOrEqualTo(Date value) {
            addCriterion("distribution_date <=", value, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateIn(List<Date> values) {
            addCriterion("distribution_date in", values, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateNotIn(List<Date> values) {
            addCriterion("distribution_date not in", values, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateBetween(Date value1, Date value2) {
            addCriterion("distribution_date between", value1, value2, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionDateNotBetween(Date value1, Date value2) {
            addCriterion("distribution_date not between", value1, value2, "distributionDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateIsNull() {
            addCriterion("distribution_success_date is null");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateIsNotNull() {
            addCriterion("distribution_success_date is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateEqualTo(Date value) {
            addCriterion("distribution_success_date =", value, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateNotEqualTo(Date value) {
            addCriterion("distribution_success_date <>", value, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateGreaterThan(Date value) {
            addCriterion("distribution_success_date >", value, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_success_date >=", value, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateLessThan(Date value) {
            addCriterion("distribution_success_date <", value, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateLessThanOrEqualTo(Date value) {
            addCriterion("distribution_success_date <=", value, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateIn(List<Date> values) {
            addCriterion("distribution_success_date in", values, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateNotIn(List<Date> values) {
            addCriterion("distribution_success_date not in", values, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateBetween(Date value1, Date value2) {
            addCriterion("distribution_success_date between", value1, value2, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDistributionSuccessDateNotBetween(Date value1, Date value2) {
            addCriterion("distribution_success_date not between", value1, value2, "distributionSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPdIdIsNull() {
            addCriterion("pd_id is null");
            return (Criteria) this;
        }

        public Criteria andPdIdIsNotNull() {
            addCriterion("pd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdIdEqualTo(Long value) {
            addCriterion("pd_id =", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotEqualTo(Long value) {
            addCriterion("pd_id <>", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThan(Long value) {
            addCriterion("pd_id >", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pd_id >=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThan(Long value) {
            addCriterion("pd_id <", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThanOrEqualTo(Long value) {
            addCriterion("pd_id <=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdIn(List<Long> values) {
            addCriterion("pd_id in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotIn(List<Long> values) {
            addCriterion("pd_id not in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdBetween(Long value1, Long value2) {
            addCriterion("pd_id between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotBetween(Long value1, Long value2) {
            addCriterion("pd_id not between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdNameIsNull() {
            addCriterion("pd_name is null");
            return (Criteria) this;
        }

        public Criteria andPdNameIsNotNull() {
            addCriterion("pd_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdNameEqualTo(String value) {
            addCriterion("pd_name =", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameNotEqualTo(String value) {
            addCriterion("pd_name <>", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameGreaterThan(String value) {
            addCriterion("pd_name >", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameGreaterThanOrEqualTo(String value) {
            addCriterion("pd_name >=", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameLessThan(String value) {
            addCriterion("pd_name <", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameLessThanOrEqualTo(String value) {
            addCriterion("pd_name <=", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameLike(String value) {
            addCriterion("pd_name like", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameNotLike(String value) {
            addCriterion("pd_name not like", value, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameIn(List<String> values) {
            addCriterion("pd_name in", values, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameNotIn(List<String> values) {
            addCriterion("pd_name not in", values, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameBetween(String value1, String value2) {
            addCriterion("pd_name between", value1, value2, "pdName");
            return (Criteria) this;
        }

        public Criteria andPdNameNotBetween(String value1, String value2) {
            addCriterion("pd_name not between", value1, value2, "pdName");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNull() {
            addCriterion("accept_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNotNull() {
            addCriterion("accept_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateEqualTo(Date value) {
            addCriterion("accept_date =", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotEqualTo(Date value) {
            addCriterion("accept_date <>", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThan(Date value) {
            addCriterion("accept_date >", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("accept_date >=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThan(Date value) {
            addCriterion("accept_date <", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThanOrEqualTo(Date value) {
            addCriterion("accept_date <=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIn(List<Date> values) {
            addCriterion("accept_date in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotIn(List<Date> values) {
            addCriterion("accept_date not in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateBetween(Date value1, Date value2) {
            addCriterion("accept_date between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotBetween(Date value1, Date value2) {
            addCriterion("accept_date not between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateIsNull() {
            addCriterion("dispatcht_date is null");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateIsNotNull() {
            addCriterion("dispatcht_date is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateEqualTo(Date value) {
            addCriterion("dispatcht_date =", value, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateNotEqualTo(Date value) {
            addCriterion("dispatcht_date <>", value, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateGreaterThan(Date value) {
            addCriterion("dispatcht_date >", value, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("dispatcht_date >=", value, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateLessThan(Date value) {
            addCriterion("dispatcht_date <", value, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateLessThanOrEqualTo(Date value) {
            addCriterion("dispatcht_date <=", value, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateIn(List<Date> values) {
            addCriterion("dispatcht_date in", values, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateNotIn(List<Date> values) {
            addCriterion("dispatcht_date not in", values, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateBetween(Date value1, Date value2) {
            addCriterion("dispatcht_date between", value1, value2, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDispatchtDateNotBetween(Date value1, Date value2) {
            addCriterion("dispatcht_date not between", value1, value2, "dispatchtDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateIsNull() {
            addCriterion("driver_accept_date is null");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateIsNotNull() {
            addCriterion("driver_accept_date is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateEqualTo(Date value) {
            addCriterion("driver_accept_date =", value, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateNotEqualTo(Date value) {
            addCriterion("driver_accept_date <>", value, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateGreaterThan(Date value) {
            addCriterion("driver_accept_date >", value, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("driver_accept_date >=", value, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateLessThan(Date value) {
            addCriterion("driver_accept_date <", value, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateLessThanOrEqualTo(Date value) {
            addCriterion("driver_accept_date <=", value, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateIn(List<Date> values) {
            addCriterion("driver_accept_date in", values, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateNotIn(List<Date> values) {
            addCriterion("driver_accept_date not in", values, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateBetween(Date value1, Date value2) {
            addCriterion("driver_accept_date between", value1, value2, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andDriverAcceptDateNotBetween(Date value1, Date value2) {
            addCriterion("driver_accept_date not between", value1, value2, "driverAcceptDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateIsNull() {
            addCriterion("arrive_scene_date is null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateIsNotNull() {
            addCriterion("arrive_scene_date is not null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateEqualTo(Date value) {
            addCriterion("arrive_scene_date =", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateNotEqualTo(Date value) {
            addCriterion("arrive_scene_date <>", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateGreaterThan(Date value) {
            addCriterion("arrive_scene_date >", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_scene_date >=", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateLessThan(Date value) {
            addCriterion("arrive_scene_date <", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateLessThanOrEqualTo(Date value) {
            addCriterion("arrive_scene_date <=", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateIn(List<Date> values) {
            addCriterion("arrive_scene_date in", values, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateNotIn(List<Date> values) {
            addCriterion("arrive_scene_date not in", values, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateBetween(Date value1, Date value2) {
            addCriterion("arrive_scene_date between", value1, value2, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateNotBetween(Date value1, Date value2) {
            addCriterion("arrive_scene_date not between", value1, value2, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateIsNull() {
            addCriterion("rescue_start_date is null");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateIsNotNull() {
            addCriterion("rescue_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateEqualTo(Date value) {
            addCriterion("rescue_start_date =", value, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateNotEqualTo(Date value) {
            addCriterion("rescue_start_date <>", value, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateGreaterThan(Date value) {
            addCriterion("rescue_start_date >", value, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("rescue_start_date >=", value, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateLessThan(Date value) {
            addCriterion("rescue_start_date <", value, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateLessThanOrEqualTo(Date value) {
            addCriterion("rescue_start_date <=", value, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateIn(List<Date> values) {
            addCriterion("rescue_start_date in", values, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateNotIn(List<Date> values) {
            addCriterion("rescue_start_date not in", values, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateBetween(Date value1, Date value2) {
            addCriterion("rescue_start_date between", value1, value2, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueStartDateNotBetween(Date value1, Date value2) {
            addCriterion("rescue_start_date not between", value1, value2, "rescueStartDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateIsNull() {
            addCriterion("rescue_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateIsNotNull() {
            addCriterion("rescue_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateEqualTo(Date value) {
            addCriterion("rescue_finish_date =", value, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateNotEqualTo(Date value) {
            addCriterion("rescue_finish_date <>", value, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateGreaterThan(Date value) {
            addCriterion("rescue_finish_date >", value, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("rescue_finish_date >=", value, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateLessThan(Date value) {
            addCriterion("rescue_finish_date <", value, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("rescue_finish_date <=", value, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateIn(List<Date> values) {
            addCriterion("rescue_finish_date in", values, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateNotIn(List<Date> values) {
            addCriterion("rescue_finish_date not in", values, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateBetween(Date value1, Date value2) {
            addCriterion("rescue_finish_date between", value1, value2, "rescueFinishDate");
            return (Criteria) this;
        }

        public Criteria andRescueFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("rescue_finish_date not between", value1, value2, "rescueFinishDate");
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
     * cos_case_task
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * cos_case_task 2016-07-13
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