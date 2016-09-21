package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsSerinfouserExample {
    /**
     * nms_serinfouser
     */
    protected String orderByClause;

    /**
     * nms_serinfouser
     */
    protected boolean distinct;

    /**
     * nms_serinfouser
     */
    protected List<Criteria> oredCriteria;

    public NmsSerinfouserExample() {
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
     * nms_serinfouser 2016-07-13
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

        public Criteria andContactuserIsNull() {
            addCriterion("contactuser is null");
            return (Criteria) this;
        }

        public Criteria andContactuserIsNotNull() {
            addCriterion("contactuser is not null");
            return (Criteria) this;
        }

        public Criteria andContactuserEqualTo(String value) {
            addCriterion("contactuser =", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotEqualTo(String value) {
            addCriterion("contactuser <>", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserGreaterThan(String value) {
            addCriterion("contactuser >", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserGreaterThanOrEqualTo(String value) {
            addCriterion("contactuser >=", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserLessThan(String value) {
            addCriterion("contactuser <", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserLessThanOrEqualTo(String value) {
            addCriterion("contactuser <=", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserLike(String value) {
            addCriterion("contactuser like", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotLike(String value) {
            addCriterion("contactuser not like", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserIn(List<String> values) {
            addCriterion("contactuser in", values, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotIn(List<String> values) {
            addCriterion("contactuser not in", values, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserBetween(String value1, String value2) {
            addCriterion("contactuser between", value1, value2, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotBetween(String value1, String value2) {
            addCriterion("contactuser not between", value1, value2, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactsexIsNull() {
            addCriterion("contactsex is null");
            return (Criteria) this;
        }

        public Criteria andContactsexIsNotNull() {
            addCriterion("contactsex is not null");
            return (Criteria) this;
        }

        public Criteria andContactsexEqualTo(Byte value) {
            addCriterion("contactsex =", value, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexNotEqualTo(Byte value) {
            addCriterion("contactsex <>", value, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexGreaterThan(Byte value) {
            addCriterion("contactsex >", value, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexGreaterThanOrEqualTo(Byte value) {
            addCriterion("contactsex >=", value, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexLessThan(Byte value) {
            addCriterion("contactsex <", value, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexLessThanOrEqualTo(Byte value) {
            addCriterion("contactsex <=", value, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexIn(List<Byte> values) {
            addCriterion("contactsex in", values, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexNotIn(List<Byte> values) {
            addCriterion("contactsex not in", values, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexBetween(Byte value1, Byte value2) {
            addCriterion("contactsex between", value1, value2, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactsexNotBetween(Byte value1, Byte value2) {
            addCriterion("contactsex not between", value1, value2, "contactsex");
            return (Criteria) this;
        }

        public Criteria andContactlevelIsNull() {
            addCriterion("contactlevel is null");
            return (Criteria) this;
        }

        public Criteria andContactlevelIsNotNull() {
            addCriterion("contactlevel is not null");
            return (Criteria) this;
        }

        public Criteria andContactlevelEqualTo(Byte value) {
            addCriterion("contactlevel =", value, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelNotEqualTo(Byte value) {
            addCriterion("contactlevel <>", value, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelGreaterThan(Byte value) {
            addCriterion("contactlevel >", value, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("contactlevel >=", value, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelLessThan(Byte value) {
            addCriterion("contactlevel <", value, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelLessThanOrEqualTo(Byte value) {
            addCriterion("contactlevel <=", value, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelIn(List<Byte> values) {
            addCriterion("contactlevel in", values, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelNotIn(List<Byte> values) {
            addCriterion("contactlevel not in", values, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelBetween(Byte value1, Byte value2) {
            addCriterion("contactlevel between", value1, value2, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactlevelNotBetween(Byte value1, Byte value2) {
            addCriterion("contactlevel not between", value1, value2, "contactlevel");
            return (Criteria) this;
        }

        public Criteria andContactareaIsNull() {
            addCriterion("contactarea is null");
            return (Criteria) this;
        }

        public Criteria andContactareaIsNotNull() {
            addCriterion("contactarea is not null");
            return (Criteria) this;
        }

        public Criteria andContactareaEqualTo(Byte value) {
            addCriterion("contactarea =", value, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaNotEqualTo(Byte value) {
            addCriterion("contactarea <>", value, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaGreaterThan(Byte value) {
            addCriterion("contactarea >", value, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaGreaterThanOrEqualTo(Byte value) {
            addCriterion("contactarea >=", value, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaLessThan(Byte value) {
            addCriterion("contactarea <", value, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaLessThanOrEqualTo(Byte value) {
            addCriterion("contactarea <=", value, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaIn(List<Byte> values) {
            addCriterion("contactarea in", values, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaNotIn(List<Byte> values) {
            addCriterion("contactarea not in", values, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaBetween(Byte value1, Byte value2) {
            addCriterion("contactarea between", value1, value2, "contactarea");
            return (Criteria) this;
        }

        public Criteria andContactareaNotBetween(Byte value1, Byte value2) {
            addCriterion("contactarea not between", value1, value2, "contactarea");
            return (Criteria) this;
        }

        public Criteria andSeridIsNull() {
            addCriterion("serid is null");
            return (Criteria) this;
        }

        public Criteria andSeridIsNotNull() {
            addCriterion("serid is not null");
            return (Criteria) this;
        }

        public Criteria andSeridEqualTo(Long value) {
            addCriterion("serid =", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotEqualTo(Long value) {
            addCriterion("serid <>", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridGreaterThan(Long value) {
            addCriterion("serid >", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridGreaterThanOrEqualTo(Long value) {
            addCriterion("serid >=", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridLessThan(Long value) {
            addCriterion("serid <", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridLessThanOrEqualTo(Long value) {
            addCriterion("serid <=", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridIn(List<Long> values) {
            addCriterion("serid in", values, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotIn(List<Long> values) {
            addCriterion("serid not in", values, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridBetween(Long value1, Long value2) {
            addCriterion("serid between", value1, value2, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotBetween(Long value1, Long value2) {
            addCriterion("serid not between", value1, value2, "serid");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNull() {
            addCriterion("contacttype is null");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNotNull() {
            addCriterion("contacttype is not null");
            return (Criteria) this;
        }

        public Criteria andContacttypeEqualTo(Byte value) {
            addCriterion("contacttype =", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotEqualTo(Byte value) {
            addCriterion("contacttype <>", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThan(Byte value) {
            addCriterion("contacttype >", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("contacttype >=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThan(Byte value) {
            addCriterion("contacttype <", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThanOrEqualTo(Byte value) {
            addCriterion("contacttype <=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeIn(List<Byte> values) {
            addCriterion("contacttype in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotIn(List<Byte> values) {
            addCriterion("contacttype not in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeBetween(Byte value1, Byte value2) {
            addCriterion("contacttype between", value1, value2, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("contacttype not between", value1, value2, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContactmessIsNull() {
            addCriterion("contactmess is null");
            return (Criteria) this;
        }

        public Criteria andContactmessIsNotNull() {
            addCriterion("contactmess is not null");
            return (Criteria) this;
        }

        public Criteria andContactmessEqualTo(String value) {
            addCriterion("contactmess =", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessNotEqualTo(String value) {
            addCriterion("contactmess <>", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessGreaterThan(String value) {
            addCriterion("contactmess >", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessGreaterThanOrEqualTo(String value) {
            addCriterion("contactmess >=", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessLessThan(String value) {
            addCriterion("contactmess <", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessLessThanOrEqualTo(String value) {
            addCriterion("contactmess <=", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessLike(String value) {
            addCriterion("contactmess like", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessNotLike(String value) {
            addCriterion("contactmess not like", value, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessIn(List<String> values) {
            addCriterion("contactmess in", values, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessNotIn(List<String> values) {
            addCriterion("contactmess not in", values, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessBetween(String value1, String value2) {
            addCriterion("contactmess between", value1, value2, "contactmess");
            return (Criteria) this;
        }

        public Criteria andContactmessNotBetween(String value1, String value2) {
            addCriterion("contactmess not between", value1, value2, "contactmess");
            return (Criteria) this;
        }

        public Criteria andConpositionIsNull() {
            addCriterion("conposition is null");
            return (Criteria) this;
        }

        public Criteria andConpositionIsNotNull() {
            addCriterion("conposition is not null");
            return (Criteria) this;
        }

        public Criteria andConpositionEqualTo(String value) {
            addCriterion("conposition =", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionNotEqualTo(String value) {
            addCriterion("conposition <>", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionGreaterThan(String value) {
            addCriterion("conposition >", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionGreaterThanOrEqualTo(String value) {
            addCriterion("conposition >=", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionLessThan(String value) {
            addCriterion("conposition <", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionLessThanOrEqualTo(String value) {
            addCriterion("conposition <=", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionLike(String value) {
            addCriterion("conposition like", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionNotLike(String value) {
            addCriterion("conposition not like", value, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionIn(List<String> values) {
            addCriterion("conposition in", values, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionNotIn(List<String> values) {
            addCriterion("conposition not in", values, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionBetween(String value1, String value2) {
            addCriterion("conposition between", value1, value2, "conposition");
            return (Criteria) this;
        }

        public Criteria andConpositionNotBetween(String value1, String value2) {
            addCriterion("conposition not between", value1, value2, "conposition");
            return (Criteria) this;
        }

        public Criteria andExtcodeIsNull() {
            addCriterion("extcode is null");
            return (Criteria) this;
        }

        public Criteria andExtcodeIsNotNull() {
            addCriterion("extcode is not null");
            return (Criteria) this;
        }

        public Criteria andExtcodeEqualTo(String value) {
            addCriterion("extcode =", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotEqualTo(String value) {
            addCriterion("extcode <>", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeGreaterThan(String value) {
            addCriterion("extcode >", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeGreaterThanOrEqualTo(String value) {
            addCriterion("extcode >=", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeLessThan(String value) {
            addCriterion("extcode <", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeLessThanOrEqualTo(String value) {
            addCriterion("extcode <=", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeLike(String value) {
            addCriterion("extcode like", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotLike(String value) {
            addCriterion("extcode not like", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeIn(List<String> values) {
            addCriterion("extcode in", values, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotIn(List<String> values) {
            addCriterion("extcode not in", values, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeBetween(String value1, String value2) {
            addCriterion("extcode between", value1, value2, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotBetween(String value1, String value2) {
            addCriterion("extcode not between", value1, value2, "extcode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("areacode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areacode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("areacode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("areacode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("areacode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("areacode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("areacode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("areacode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("areacode like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("areacode not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("areacode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("areacode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("areacode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("areacode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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
     * nms_serinfouser
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_serinfouser 2016-07-13
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