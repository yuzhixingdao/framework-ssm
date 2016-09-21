package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CosCaseTaskDispathExample {
    /**
     * cos_case_task_dispath
     */
    protected String orderByClause;

    /**
     * cos_case_task_dispath
     */
    protected boolean distinct;

    /**
     * cos_case_task_dispath
     */
    protected List<Criteria> oredCriteria;

    public CosCaseTaskDispathExample() {
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
     * cos_case_task_dispath 2016-07-13
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
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

        public Criteria andDispathStateIsNull() {
            addCriterion("dispath_state is null");
            return (Criteria) this;
        }

        public Criteria andDispathStateIsNotNull() {
            addCriterion("dispath_state is not null");
            return (Criteria) this;
        }

        public Criteria andDispathStateEqualTo(String value) {
            addCriterion("dispath_state =", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateNotEqualTo(String value) {
            addCriterion("dispath_state <>", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateGreaterThan(String value) {
            addCriterion("dispath_state >", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateGreaterThanOrEqualTo(String value) {
            addCriterion("dispath_state >=", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateLessThan(String value) {
            addCriterion("dispath_state <", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateLessThanOrEqualTo(String value) {
            addCriterion("dispath_state <=", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateLike(String value) {
            addCriterion("dispath_state like", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateNotLike(String value) {
            addCriterion("dispath_state not like", value, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateIn(List<String> values) {
            addCriterion("dispath_state in", values, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateNotIn(List<String> values) {
            addCriterion("dispath_state not in", values, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateBetween(String value1, String value2) {
            addCriterion("dispath_state between", value1, value2, "dispathState");
            return (Criteria) this;
        }

        public Criteria andDispathStateNotBetween(String value1, String value2) {
            addCriterion("dispath_state not between", value1, value2, "dispathState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateIsNull() {
            addCriterion("ACCEPTANCE_ASK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateIsNotNull() {
            addCriterion("ACCEPTANCE_ASK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateEqualTo(Double value) {
            addCriterion("ACCEPTANCE_ASK_DATE =", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateNotEqualTo(Double value) {
            addCriterion("ACCEPTANCE_ASK_DATE <>", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateGreaterThan(Double value) {
            addCriterion("ACCEPTANCE_ASK_DATE >", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateGreaterThanOrEqualTo(Double value) {
            addCriterion("ACCEPTANCE_ASK_DATE >=", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateLessThan(Double value) {
            addCriterion("ACCEPTANCE_ASK_DATE <", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateLessThanOrEqualTo(Double value) {
            addCriterion("ACCEPTANCE_ASK_DATE <=", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateIn(List<Double> values) {
            addCriterion("ACCEPTANCE_ASK_DATE in", values, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateNotIn(List<Double> values) {
            addCriterion("ACCEPTANCE_ASK_DATE not in", values, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateBetween(Double value1, Double value2) {
            addCriterion("ACCEPTANCE_ASK_DATE between", value1, value2, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateNotBetween(Double value1, Double value2) {
            addCriterion("ACCEPTANCE_ASK_DATE not between", value1, value2, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateIsNull() {
            addCriterion("ACCEPTANCE_RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateIsNotNull() {
            addCriterion("ACCEPTANCE_RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateEqualTo(Double value) {
            addCriterion("ACCEPTANCE_RETURN_DATE =", value, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateNotEqualTo(Double value) {
            addCriterion("ACCEPTANCE_RETURN_DATE <>", value, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateGreaterThan(Double value) {
            addCriterion("ACCEPTANCE_RETURN_DATE >", value, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateGreaterThanOrEqualTo(Double value) {
            addCriterion("ACCEPTANCE_RETURN_DATE >=", value, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateLessThan(Double value) {
            addCriterion("ACCEPTANCE_RETURN_DATE <", value, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateLessThanOrEqualTo(Double value) {
            addCriterion("ACCEPTANCE_RETURN_DATE <=", value, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateIn(List<Double> values) {
            addCriterion("ACCEPTANCE_RETURN_DATE in", values, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateNotIn(List<Double> values) {
            addCriterion("ACCEPTANCE_RETURN_DATE not in", values, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateBetween(Double value1, Double value2) {
            addCriterion("ACCEPTANCE_RETURN_DATE between", value1, value2, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceReturnDateNotBetween(Double value1, Double value2) {
            addCriterion("ACCEPTANCE_RETURN_DATE not between", value1, value2, "acceptanceReturnDate");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionIsNull() {
            addCriterion("REFUSE_OPTION is null");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionIsNotNull() {
            addCriterion("REFUSE_OPTION is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionEqualTo(String value) {
            addCriterion("REFUSE_OPTION =", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionNotEqualTo(String value) {
            addCriterion("REFUSE_OPTION <>", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionGreaterThan(String value) {
            addCriterion("REFUSE_OPTION >", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionGreaterThanOrEqualTo(String value) {
            addCriterion("REFUSE_OPTION >=", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionLessThan(String value) {
            addCriterion("REFUSE_OPTION <", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionLessThanOrEqualTo(String value) {
            addCriterion("REFUSE_OPTION <=", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionLike(String value) {
            addCriterion("REFUSE_OPTION like", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionNotLike(String value) {
            addCriterion("REFUSE_OPTION not like", value, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionIn(List<String> values) {
            addCriterion("REFUSE_OPTION in", values, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionNotIn(List<String> values) {
            addCriterion("REFUSE_OPTION not in", values, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionBetween(String value1, String value2) {
            addCriterion("REFUSE_OPTION between", value1, value2, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseOptionNotBetween(String value1, String value2) {
            addCriterion("REFUSE_OPTION not between", value1, value2, "refuseOption");
            return (Criteria) this;
        }

        public Criteria andRefuseContentIsNull() {
            addCriterion("REFUSE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRefuseContentIsNotNull() {
            addCriterion("REFUSE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseContentEqualTo(Double value) {
            addCriterion("REFUSE_CONTENT =", value, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentNotEqualTo(Double value) {
            addCriterion("REFUSE_CONTENT <>", value, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentGreaterThan(Double value) {
            addCriterion("REFUSE_CONTENT >", value, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentGreaterThanOrEqualTo(Double value) {
            addCriterion("REFUSE_CONTENT >=", value, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentLessThan(Double value) {
            addCriterion("REFUSE_CONTENT <", value, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentLessThanOrEqualTo(Double value) {
            addCriterion("REFUSE_CONTENT <=", value, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentIn(List<Double> values) {
            addCriterion("REFUSE_CONTENT in", values, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentNotIn(List<Double> values) {
            addCriterion("REFUSE_CONTENT not in", values, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentBetween(Double value1, Double value2) {
            addCriterion("REFUSE_CONTENT between", value1, value2, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseContentNotBetween(Double value1, Double value2) {
            addCriterion("REFUSE_CONTENT not between", value1, value2, "refuseContent");
            return (Criteria) this;
        }

        public Criteria andRefuseDateIsNull() {
            addCriterion("REFUSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRefuseDateIsNotNull() {
            addCriterion("REFUSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseDateEqualTo(Double value) {
            addCriterion("REFUSE_DATE =", value, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateNotEqualTo(Double value) {
            addCriterion("REFUSE_DATE <>", value, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateGreaterThan(Double value) {
            addCriterion("REFUSE_DATE >", value, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateGreaterThanOrEqualTo(Double value) {
            addCriterion("REFUSE_DATE >=", value, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateLessThan(Double value) {
            addCriterion("REFUSE_DATE <", value, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateLessThanOrEqualTo(Double value) {
            addCriterion("REFUSE_DATE <=", value, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateIn(List<Double> values) {
            addCriterion("REFUSE_DATE in", values, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateNotIn(List<Double> values) {
            addCriterion("REFUSE_DATE not in", values, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateBetween(Double value1, Double value2) {
            addCriterion("REFUSE_DATE between", value1, value2, "refuseDate");
            return (Criteria) this;
        }

        public Criteria andRefuseDateNotBetween(Double value1, Double value2) {
            addCriterion("REFUSE_DATE not between", value1, value2, "refuseDate");
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
     * cos_case_task_dispath
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * cos_case_task_dispath 2016-07-13
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