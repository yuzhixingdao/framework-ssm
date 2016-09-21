package com.aac.cos.entity.sys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsSerinfoaddrExample {
    /**
     * nms_serinfoaddr
     */
    protected String orderByClause;

    /**
     * nms_serinfoaddr
     */
    protected boolean distinct;

    /**
     * nms_serinfoaddr
     */
    protected List<Criteria> oredCriteria;

    public NmsSerinfoaddrExample() {
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
     * nms_serinfoaddr 2016-07-13
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrIsNull() {
            addCriterion("registeraddr is null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrIsNotNull() {
            addCriterion("registeraddr is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrEqualTo(String value) {
            addCriterion("registeraddr =", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotEqualTo(String value) {
            addCriterion("registeraddr <>", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrGreaterThan(String value) {
            addCriterion("registeraddr >", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrGreaterThanOrEqualTo(String value) {
            addCriterion("registeraddr >=", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrLessThan(String value) {
            addCriterion("registeraddr <", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrLessThanOrEqualTo(String value) {
            addCriterion("registeraddr <=", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrLike(String value) {
            addCriterion("registeraddr like", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotLike(String value) {
            addCriterion("registeraddr not like", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrIn(List<String> values) {
            addCriterion("registeraddr in", values, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotIn(List<String> values) {
            addCriterion("registeraddr not in", values, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrBetween(String value1, String value2) {
            addCriterion("registeraddr between", value1, value2, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotBetween(String value1, String value2) {
            addCriterion("registeraddr not between", value1, value2, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrIsNull() {
            addCriterion("workaddr is null");
            return (Criteria) this;
        }

        public Criteria andWorkaddrIsNotNull() {
            addCriterion("workaddr is not null");
            return (Criteria) this;
        }

        public Criteria andWorkaddrEqualTo(String value) {
            addCriterion("workaddr =", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrNotEqualTo(String value) {
            addCriterion("workaddr <>", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrGreaterThan(String value) {
            addCriterion("workaddr >", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrGreaterThanOrEqualTo(String value) {
            addCriterion("workaddr >=", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrLessThan(String value) {
            addCriterion("workaddr <", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrLessThanOrEqualTo(String value) {
            addCriterion("workaddr <=", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrLike(String value) {
            addCriterion("workaddr like", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrNotLike(String value) {
            addCriterion("workaddr not like", value, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrIn(List<String> values) {
            addCriterion("workaddr in", values, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrNotIn(List<String> values) {
            addCriterion("workaddr not in", values, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrBetween(String value1, String value2) {
            addCriterion("workaddr between", value1, value2, "workaddr");
            return (Criteria) this;
        }

        public Criteria andWorkaddrNotBetween(String value1, String value2) {
            addCriterion("workaddr not between", value1, value2, "workaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrIsNull() {
            addCriterion("departaddr is null");
            return (Criteria) this;
        }

        public Criteria andDepartaddrIsNotNull() {
            addCriterion("departaddr is not null");
            return (Criteria) this;
        }

        public Criteria andDepartaddrEqualTo(String value) {
            addCriterion("departaddr =", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrNotEqualTo(String value) {
            addCriterion("departaddr <>", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrGreaterThan(String value) {
            addCriterion("departaddr >", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrGreaterThanOrEqualTo(String value) {
            addCriterion("departaddr >=", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrLessThan(String value) {
            addCriterion("departaddr <", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrLessThanOrEqualTo(String value) {
            addCriterion("departaddr <=", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrLike(String value) {
            addCriterion("departaddr like", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrNotLike(String value) {
            addCriterion("departaddr not like", value, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrIn(List<String> values) {
            addCriterion("departaddr in", values, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrNotIn(List<String> values) {
            addCriterion("departaddr not in", values, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrBetween(String value1, String value2) {
            addCriterion("departaddr between", value1, value2, "departaddr");
            return (Criteria) this;
        }

        public Criteria andDepartaddrNotBetween(String value1, String value2) {
            addCriterion("departaddr not between", value1, value2, "departaddr");
            return (Criteria) this;
        }

        public Criteria andTrailerIsNull() {
            addCriterion("trailer is null");
            return (Criteria) this;
        }

        public Criteria andTrailerIsNotNull() {
            addCriterion("trailer is not null");
            return (Criteria) this;
        }

        public Criteria andTrailerEqualTo(String value) {
            addCriterion("trailer =", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerNotEqualTo(String value) {
            addCriterion("trailer <>", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerGreaterThan(String value) {
            addCriterion("trailer >", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerGreaterThanOrEqualTo(String value) {
            addCriterion("trailer >=", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerLessThan(String value) {
            addCriterion("trailer <", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerLessThanOrEqualTo(String value) {
            addCriterion("trailer <=", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerLike(String value) {
            addCriterion("trailer like", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerNotLike(String value) {
            addCriterion("trailer not like", value, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerIn(List<String> values) {
            addCriterion("trailer in", values, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerNotIn(List<String> values) {
            addCriterion("trailer not in", values, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerBetween(String value1, String value2) {
            addCriterion("trailer between", value1, value2, "trailer");
            return (Criteria) this;
        }

        public Criteria andTrailerNotBetween(String value1, String value2) {
            addCriterion("trailer not between", value1, value2, "trailer");
            return (Criteria) this;
        }

        public Criteria andRoadsIsNull() {
            addCriterion("roads is null");
            return (Criteria) this;
        }

        public Criteria andRoadsIsNotNull() {
            addCriterion("roads is not null");
            return (Criteria) this;
        }

        public Criteria andRoadsEqualTo(String value) {
            addCriterion("roads =", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsNotEqualTo(String value) {
            addCriterion("roads <>", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsGreaterThan(String value) {
            addCriterion("roads >", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsGreaterThanOrEqualTo(String value) {
            addCriterion("roads >=", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsLessThan(String value) {
            addCriterion("roads <", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsLessThanOrEqualTo(String value) {
            addCriterion("roads <=", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsLike(String value) {
            addCriterion("roads like", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsNotLike(String value) {
            addCriterion("roads not like", value, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsIn(List<String> values) {
            addCriterion("roads in", values, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsNotIn(List<String> values) {
            addCriterion("roads not in", values, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsBetween(String value1, String value2) {
            addCriterion("roads between", value1, value2, "roads");
            return (Criteria) this;
        }

        public Criteria andRoadsNotBetween(String value1, String value2) {
            addCriterion("roads not between", value1, value2, "roads");
            return (Criteria) this;
        }

        public Criteria andYmapIsNull() {
            addCriterion("ymap is null");
            return (Criteria) this;
        }

        public Criteria andYmapIsNotNull() {
            addCriterion("ymap is not null");
            return (Criteria) this;
        }

        public Criteria andYmapEqualTo(BigDecimal value) {
            addCriterion("ymap =", value, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapNotEqualTo(BigDecimal value) {
            addCriterion("ymap <>", value, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapGreaterThan(BigDecimal value) {
            addCriterion("ymap >", value, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ymap >=", value, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapLessThan(BigDecimal value) {
            addCriterion("ymap <", value, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ymap <=", value, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapIn(List<BigDecimal> values) {
            addCriterion("ymap in", values, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapNotIn(List<BigDecimal> values) {
            addCriterion("ymap not in", values, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ymap between", value1, value2, "ymap");
            return (Criteria) this;
        }

        public Criteria andYmapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ymap not between", value1, value2, "ymap");
            return (Criteria) this;
        }

        public Criteria andXmapIsNull() {
            addCriterion("xmap is null");
            return (Criteria) this;
        }

        public Criteria andXmapIsNotNull() {
            addCriterion("xmap is not null");
            return (Criteria) this;
        }

        public Criteria andXmapEqualTo(BigDecimal value) {
            addCriterion("xmap =", value, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapNotEqualTo(BigDecimal value) {
            addCriterion("xmap <>", value, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapGreaterThan(BigDecimal value) {
            addCriterion("xmap >", value, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("xmap >=", value, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapLessThan(BigDecimal value) {
            addCriterion("xmap <", value, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("xmap <=", value, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapIn(List<BigDecimal> values) {
            addCriterion("xmap in", values, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapNotIn(List<BigDecimal> values) {
            addCriterion("xmap not in", values, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xmap between", value1, value2, "xmap");
            return (Criteria) this;
        }

        public Criteria andXmapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xmap not between", value1, value2, "xmap");
            return (Criteria) this;
        }

        public Criteria andGeoHashIsNull() {
            addCriterion("geo_hash is null");
            return (Criteria) this;
        }

        public Criteria andGeoHashIsNotNull() {
            addCriterion("geo_hash is not null");
            return (Criteria) this;
        }

        public Criteria andGeoHashEqualTo(String value) {
            addCriterion("geo_hash =", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashNotEqualTo(String value) {
            addCriterion("geo_hash <>", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashGreaterThan(String value) {
            addCriterion("geo_hash >", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashGreaterThanOrEqualTo(String value) {
            addCriterion("geo_hash >=", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashLessThan(String value) {
            addCriterion("geo_hash <", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashLessThanOrEqualTo(String value) {
            addCriterion("geo_hash <=", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashLike(String value) {
            addCriterion("geo_hash like", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashNotLike(String value) {
            addCriterion("geo_hash not like", value, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashIn(List<String> values) {
            addCriterion("geo_hash in", values, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashNotIn(List<String> values) {
            addCriterion("geo_hash not in", values, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashBetween(String value1, String value2) {
            addCriterion("geo_hash between", value1, value2, "geoHash");
            return (Criteria) this;
        }

        public Criteria andGeoHashNotBetween(String value1, String value2) {
            addCriterion("geo_hash not between", value1, value2, "geoHash");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andFgwlxIsNull() {
            addCriterion("fgwlx is null");
            return (Criteria) this;
        }

        public Criteria andFgwlxIsNotNull() {
            addCriterion("fgwlx is not null");
            return (Criteria) this;
        }

        public Criteria andFgwlxEqualTo(String value) {
            addCriterion("fgwlx =", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxNotEqualTo(String value) {
            addCriterion("fgwlx <>", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxGreaterThan(String value) {
            addCriterion("fgwlx >", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxGreaterThanOrEqualTo(String value) {
            addCriterion("fgwlx >=", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxLessThan(String value) {
            addCriterion("fgwlx <", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxLessThanOrEqualTo(String value) {
            addCriterion("fgwlx <=", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxLike(String value) {
            addCriterion("fgwlx like", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxNotLike(String value) {
            addCriterion("fgwlx not like", value, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxIn(List<String> values) {
            addCriterion("fgwlx in", values, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxNotIn(List<String> values) {
            addCriterion("fgwlx not in", values, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxBetween(String value1, String value2) {
            addCriterion("fgwlx between", value1, value2, "fgwlx");
            return (Criteria) this;
        }

        public Criteria andFgwlxNotBetween(String value1, String value2) {
            addCriterion("fgwlx not between", value1, value2, "fgwlx");
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
     * nms_serinfoaddr
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_serinfoaddr 2016-07-13
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