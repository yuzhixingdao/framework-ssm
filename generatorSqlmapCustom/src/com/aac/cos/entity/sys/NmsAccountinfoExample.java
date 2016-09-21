package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsAccountinfoExample {
    /**
     * nms_accountinfo
     */
    protected String orderByClause;

    /**
     * nms_accountinfo
     */
    protected boolean distinct;

    /**
     * nms_accountinfo
     */
    protected List<Criteria> oredCriteria;

    public NmsAccountinfoExample() {
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
     * nms_accountinfo 2016-07-13
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

        public Criteria andAccnameIsNull() {
            addCriterion("accname is null");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNotNull() {
            addCriterion("accname is not null");
            return (Criteria) this;
        }

        public Criteria andAccnameEqualTo(String value) {
            addCriterion("accname =", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotEqualTo(String value) {
            addCriterion("accname <>", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThan(String value) {
            addCriterion("accname >", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThanOrEqualTo(String value) {
            addCriterion("accname >=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThan(String value) {
            addCriterion("accname <", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThanOrEqualTo(String value) {
            addCriterion("accname <=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLike(String value) {
            addCriterion("accname like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotLike(String value) {
            addCriterion("accname not like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameIn(List<String> values) {
            addCriterion("accname in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotIn(List<String> values) {
            addCriterion("accname not in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameBetween(String value1, String value2) {
            addCriterion("accname between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotBetween(String value1, String value2) {
            addCriterion("accname not between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankIsNull() {
            addCriterion("openaccbank is null");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankIsNotNull() {
            addCriterion("openaccbank is not null");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankEqualTo(String value) {
            addCriterion("openaccbank =", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankNotEqualTo(String value) {
            addCriterion("openaccbank <>", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankGreaterThan(String value) {
            addCriterion("openaccbank >", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankGreaterThanOrEqualTo(String value) {
            addCriterion("openaccbank >=", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankLessThan(String value) {
            addCriterion("openaccbank <", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankLessThanOrEqualTo(String value) {
            addCriterion("openaccbank <=", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankLike(String value) {
            addCriterion("openaccbank like", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankNotLike(String value) {
            addCriterion("openaccbank not like", value, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankIn(List<String> values) {
            addCriterion("openaccbank in", values, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankNotIn(List<String> values) {
            addCriterion("openaccbank not in", values, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankBetween(String value1, String value2) {
            addCriterion("openaccbank between", value1, value2, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andOpenaccbankNotBetween(String value1, String value2) {
            addCriterion("openaccbank not between", value1, value2, "openaccbank");
            return (Criteria) this;
        }

        public Criteria andBanknumIsNull() {
            addCriterion("banknum is null");
            return (Criteria) this;
        }

        public Criteria andBanknumIsNotNull() {
            addCriterion("banknum is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumEqualTo(String value) {
            addCriterion("banknum =", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotEqualTo(String value) {
            addCriterion("banknum <>", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumGreaterThan(String value) {
            addCriterion("banknum >", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumGreaterThanOrEqualTo(String value) {
            addCriterion("banknum >=", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLessThan(String value) {
            addCriterion("banknum <", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLessThanOrEqualTo(String value) {
            addCriterion("banknum <=", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLike(String value) {
            addCriterion("banknum like", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotLike(String value) {
            addCriterion("banknum not like", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumIn(List<String> values) {
            addCriterion("banknum in", values, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotIn(List<String> values) {
            addCriterion("banknum not in", values, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumBetween(String value1, String value2) {
            addCriterion("banknum between", value1, value2, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotBetween(String value1, String value2) {
            addCriterion("banknum not between", value1, value2, "banknum");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrIsNull() {
            addCriterion("openaccaddr is null");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrIsNotNull() {
            addCriterion("openaccaddr is not null");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrEqualTo(String value) {
            addCriterion("openaccaddr =", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrNotEqualTo(String value) {
            addCriterion("openaccaddr <>", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrGreaterThan(String value) {
            addCriterion("openaccaddr >", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrGreaterThanOrEqualTo(String value) {
            addCriterion("openaccaddr >=", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrLessThan(String value) {
            addCriterion("openaccaddr <", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrLessThanOrEqualTo(String value) {
            addCriterion("openaccaddr <=", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrLike(String value) {
            addCriterion("openaccaddr like", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrNotLike(String value) {
            addCriterion("openaccaddr not like", value, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrIn(List<String> values) {
            addCriterion("openaccaddr in", values, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrNotIn(List<String> values) {
            addCriterion("openaccaddr not in", values, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrBetween(String value1, String value2) {
            addCriterion("openaccaddr between", value1, value2, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andOpenaccaddrNotBetween(String value1, String value2) {
            addCriterion("openaccaddr not between", value1, value2, "openaccaddr");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("bankcode is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("bankcode is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("bankcode =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("bankcode <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("bankcode >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bankcode >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("bankcode <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("bankcode <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("bankcode like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("bankcode not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("bankcode in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("bankcode not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("bankcode between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("bankcode not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andMainIsNull() {
            addCriterion("main is null");
            return (Criteria) this;
        }

        public Criteria andMainIsNotNull() {
            addCriterion("main is not null");
            return (Criteria) this;
        }

        public Criteria andMainEqualTo(Byte value) {
            addCriterion("main =", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotEqualTo(Byte value) {
            addCriterion("main <>", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThan(Byte value) {
            addCriterion("main >", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThanOrEqualTo(Byte value) {
            addCriterion("main >=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThan(Byte value) {
            addCriterion("main <", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThanOrEqualTo(Byte value) {
            addCriterion("main <=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainIn(List<Byte> values) {
            addCriterion("main in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotIn(List<Byte> values) {
            addCriterion("main not in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainBetween(Byte value1, Byte value2) {
            addCriterion("main between", value1, value2, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotBetween(Byte value1, Byte value2) {
            addCriterion("main not between", value1, value2, "main");
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
     * nms_accountinfo
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_accountinfo 2016-07-13
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