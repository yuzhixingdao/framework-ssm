package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CosCaseTaskContactExample {
    /**
     * cos_case_task_contact
     */
    protected String orderByClause;

    /**
     * cos_case_task_contact
     */
    protected boolean distinct;

    /**
     * cos_case_task_contact
     */
    protected List<Criteria> oredCriteria;

    public CosCaseTaskContactExample() {
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
     * cos_case_task_contact 2016-07-13
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

        public Criteria andConTypeIsNull() {
            addCriterion("con_type is null");
            return (Criteria) this;
        }

        public Criteria andConTypeIsNotNull() {
            addCriterion("con_type is not null");
            return (Criteria) this;
        }

        public Criteria andConTypeEqualTo(Byte value) {
            addCriterion("con_type =", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeNotEqualTo(Byte value) {
            addCriterion("con_type <>", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeGreaterThan(Byte value) {
            addCriterion("con_type >", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("con_type >=", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeLessThan(Byte value) {
            addCriterion("con_type <", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeLessThanOrEqualTo(Byte value) {
            addCriterion("con_type <=", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeIn(List<Byte> values) {
            addCriterion("con_type in", values, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeNotIn(List<Byte> values) {
            addCriterion("con_type not in", values, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeBetween(Byte value1, Byte value2) {
            addCriterion("con_type between", value1, value2, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("con_type not between", value1, value2, "conType");
            return (Criteria) this;
        }

        public Criteria andConStateIsNull() {
            addCriterion("con_state is null");
            return (Criteria) this;
        }

        public Criteria andConStateIsNotNull() {
            addCriterion("con_state is not null");
            return (Criteria) this;
        }

        public Criteria andConStateEqualTo(Byte value) {
            addCriterion("con_state =", value, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateNotEqualTo(Byte value) {
            addCriterion("con_state <>", value, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateGreaterThan(Byte value) {
            addCriterion("con_state >", value, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("con_state >=", value, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateLessThan(Byte value) {
            addCriterion("con_state <", value, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateLessThanOrEqualTo(Byte value) {
            addCriterion("con_state <=", value, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateIn(List<Byte> values) {
            addCriterion("con_state in", values, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateNotIn(List<Byte> values) {
            addCriterion("con_state not in", values, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateBetween(Byte value1, Byte value2) {
            addCriterion("con_state between", value1, value2, "conState");
            return (Criteria) this;
        }

        public Criteria andConStateNotBetween(Byte value1, Byte value2) {
            addCriterion("con_state not between", value1, value2, "conState");
            return (Criteria) this;
        }

        public Criteria andObjTypeIsNull() {
            addCriterion("obj_type is null");
            return (Criteria) this;
        }

        public Criteria andObjTypeIsNotNull() {
            addCriterion("obj_type is not null");
            return (Criteria) this;
        }

        public Criteria andObjTypeEqualTo(Byte value) {
            addCriterion("obj_type =", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotEqualTo(Byte value) {
            addCriterion("obj_type <>", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeGreaterThan(Byte value) {
            addCriterion("obj_type >", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("obj_type >=", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLessThan(Byte value) {
            addCriterion("obj_type <", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLessThanOrEqualTo(Byte value) {
            addCriterion("obj_type <=", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeIn(List<Byte> values) {
            addCriterion("obj_type in", values, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotIn(List<Byte> values) {
            addCriterion("obj_type not in", values, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeBetween(Byte value1, Byte value2) {
            addCriterion("obj_type between", value1, value2, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("obj_type not between", value1, value2, "objType");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(Byte value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(Byte value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(Byte value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(Byte value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(Byte value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(Byte value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<Byte> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<Byte> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(Byte value1, Byte value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(Byte value1, Byte value2) {
            addCriterion("cause not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(Byte value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(Byte value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(Byte value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(Byte value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(Byte value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(Byte value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<Byte> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<Byte> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(Byte value1, Byte value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(Byte value1, Byte value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andConPersonIsNull() {
            addCriterion("con_person is null");
            return (Criteria) this;
        }

        public Criteria andConPersonIsNotNull() {
            addCriterion("con_person is not null");
            return (Criteria) this;
        }

        public Criteria andConPersonEqualTo(String value) {
            addCriterion("con_person =", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonNotEqualTo(String value) {
            addCriterion("con_person <>", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonGreaterThan(String value) {
            addCriterion("con_person >", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonGreaterThanOrEqualTo(String value) {
            addCriterion("con_person >=", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonLessThan(String value) {
            addCriterion("con_person <", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonLessThanOrEqualTo(String value) {
            addCriterion("con_person <=", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonLike(String value) {
            addCriterion("con_person like", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonNotLike(String value) {
            addCriterion("con_person not like", value, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonIn(List<String> values) {
            addCriterion("con_person in", values, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonNotIn(List<String> values) {
            addCriterion("con_person not in", values, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonBetween(String value1, String value2) {
            addCriterion("con_person between", value1, value2, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPersonNotBetween(String value1, String value2) {
            addCriterion("con_person not between", value1, value2, "conPerson");
            return (Criteria) this;
        }

        public Criteria andConPhoneIsNull() {
            addCriterion("con_phone is null");
            return (Criteria) this;
        }

        public Criteria andConPhoneIsNotNull() {
            addCriterion("con_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConPhoneEqualTo(String value) {
            addCriterion("con_phone =", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotEqualTo(String value) {
            addCriterion("con_phone <>", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneGreaterThan(String value) {
            addCriterion("con_phone >", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("con_phone >=", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneLessThan(String value) {
            addCriterion("con_phone <", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneLessThanOrEqualTo(String value) {
            addCriterion("con_phone <=", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneLike(String value) {
            addCriterion("con_phone like", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotLike(String value) {
            addCriterion("con_phone not like", value, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneIn(List<String> values) {
            addCriterion("con_phone in", values, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotIn(List<String> values) {
            addCriterion("con_phone not in", values, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneBetween(String value1, String value2) {
            addCriterion("con_phone between", value1, value2, "conPhone");
            return (Criteria) this;
        }

        public Criteria andConPhoneNotBetween(String value1, String value2) {
            addCriterion("con_phone not between", value1, value2, "conPhone");
            return (Criteria) this;
        }

        public Criteria andReturnStateIsNull() {
            addCriterion("return_state is null");
            return (Criteria) this;
        }

        public Criteria andReturnStateIsNotNull() {
            addCriterion("return_state is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStateEqualTo(Byte value) {
            addCriterion("return_state =", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotEqualTo(Byte value) {
            addCriterion("return_state <>", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateGreaterThan(Byte value) {
            addCriterion("return_state >", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("return_state >=", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLessThan(Byte value) {
            addCriterion("return_state <", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLessThanOrEqualTo(Byte value) {
            addCriterion("return_state <=", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateIn(List<Byte> values) {
            addCriterion("return_state in", values, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotIn(List<Byte> values) {
            addCriterion("return_state not in", values, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateBetween(Byte value1, Byte value2) {
            addCriterion("return_state between", value1, value2, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotBetween(Byte value1, Byte value2) {
            addCriterion("return_state not between", value1, value2, "returnState");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNull() {
            addCriterion("finish_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNotNull() {
            addCriterion("finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDateEqualTo(Date value) {
            addCriterion("finish_date =", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotEqualTo(Date value) {
            addCriterion("finish_date <>", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThan(Date value) {
            addCriterion("finish_date >", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_date >=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThan(Date value) {
            addCriterion("finish_date <", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("finish_date <=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIn(List<Date> values) {
            addCriterion("finish_date in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotIn(List<Date> values) {
            addCriterion("finish_date not in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateBetween(Date value1, Date value2) {
            addCriterion("finish_date between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("finish_date not between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andDateNumberIsNull() {
            addCriterion("date_number is null");
            return (Criteria) this;
        }

        public Criteria andDateNumberIsNotNull() {
            addCriterion("date_number is not null");
            return (Criteria) this;
        }

        public Criteria andDateNumberEqualTo(Long value) {
            addCriterion("date_number =", value, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberNotEqualTo(Long value) {
            addCriterion("date_number <>", value, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberGreaterThan(Long value) {
            addCriterion("date_number >", value, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("date_number >=", value, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberLessThan(Long value) {
            addCriterion("date_number <", value, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberLessThanOrEqualTo(Long value) {
            addCriterion("date_number <=", value, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberIn(List<Long> values) {
            addCriterion("date_number in", values, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberNotIn(List<Long> values) {
            addCriterion("date_number not in", values, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberBetween(Long value1, Long value2) {
            addCriterion("date_number between", value1, value2, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDateNumberNotBetween(Long value1, Long value2) {
            addCriterion("date_number not between", value1, value2, "dateNumber");
            return (Criteria) this;
        }

        public Criteria andDlbjDateIsNull() {
            addCriterion("dlbj_date is null");
            return (Criteria) this;
        }

        public Criteria andDlbjDateIsNotNull() {
            addCriterion("dlbj_date is not null");
            return (Criteria) this;
        }

        public Criteria andDlbjDateEqualTo(Date value) {
            addCriterion("dlbj_date =", value, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateNotEqualTo(Date value) {
            addCriterion("dlbj_date <>", value, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateGreaterThan(Date value) {
            addCriterion("dlbj_date >", value, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateGreaterThanOrEqualTo(Date value) {
            addCriterion("dlbj_date >=", value, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateLessThan(Date value) {
            addCriterion("dlbj_date <", value, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateLessThanOrEqualTo(Date value) {
            addCriterion("dlbj_date <=", value, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateIn(List<Date> values) {
            addCriterion("dlbj_date in", values, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateNotIn(List<Date> values) {
            addCriterion("dlbj_date not in", values, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateBetween(Date value1, Date value2) {
            addCriterion("dlbj_date between", value1, value2, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andDlbjDateNotBetween(Date value1, Date value2) {
            addCriterion("dlbj_date not between", value1, value2, "dlbjDate");
            return (Criteria) this;
        }

        public Criteria andConRemarkIsNull() {
            addCriterion("con_remark is null");
            return (Criteria) this;
        }

        public Criteria andConRemarkIsNotNull() {
            addCriterion("con_remark is not null");
            return (Criteria) this;
        }

        public Criteria andConRemarkEqualTo(String value) {
            addCriterion("con_remark =", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkNotEqualTo(String value) {
            addCriterion("con_remark <>", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkGreaterThan(String value) {
            addCriterion("con_remark >", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("con_remark >=", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkLessThan(String value) {
            addCriterion("con_remark <", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkLessThanOrEqualTo(String value) {
            addCriterion("con_remark <=", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkLike(String value) {
            addCriterion("con_remark like", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkNotLike(String value) {
            addCriterion("con_remark not like", value, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkIn(List<String> values) {
            addCriterion("con_remark in", values, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkNotIn(List<String> values) {
            addCriterion("con_remark not in", values, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkBetween(String value1, String value2) {
            addCriterion("con_remark between", value1, value2, "conRemark");
            return (Criteria) this;
        }

        public Criteria andConRemarkNotBetween(String value1, String value2) {
            addCriterion("con_remark not between", value1, value2, "conRemark");
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
     * cos_case_task_contact
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * cos_case_task_contact 2016-07-13
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