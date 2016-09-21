package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsRoadpriceExample {
    /**
     * nms_roadprice
     */
    protected String orderByClause;

    /**
     * nms_roadprice
     */
    protected boolean distinct;

    /**
     * nms_roadprice
     */
    protected List<Criteria> oredCriteria;

    public NmsRoadpriceExample() {
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
     * nms_roadprice 2016-07-13
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

        public Criteria andRoadrepairserIsNull() {
            addCriterion("roadrepairser is null");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserIsNotNull() {
            addCriterion("roadrepairser is not null");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserEqualTo(Byte value) {
            addCriterion("roadrepairser =", value, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserNotEqualTo(Byte value) {
            addCriterion("roadrepairser <>", value, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserGreaterThan(Byte value) {
            addCriterion("roadrepairser >", value, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserGreaterThanOrEqualTo(Byte value) {
            addCriterion("roadrepairser >=", value, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserLessThan(Byte value) {
            addCriterion("roadrepairser <", value, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserLessThanOrEqualTo(Byte value) {
            addCriterion("roadrepairser <=", value, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserIn(List<Byte> values) {
            addCriterion("roadrepairser in", values, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserNotIn(List<Byte> values) {
            addCriterion("roadrepairser not in", values, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserBetween(Byte value1, Byte value2) {
            addCriterion("roadrepairser between", value1, value2, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairserNotBetween(Byte value1, Byte value2) {
            addCriterion("roadrepairser not between", value1, value2, "roadrepairser");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeIsNull() {
            addCriterion("roadrepairtype is null");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeIsNotNull() {
            addCriterion("roadrepairtype is not null");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeEqualTo(Byte value) {
            addCriterion("roadrepairtype =", value, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeNotEqualTo(Byte value) {
            addCriterion("roadrepairtype <>", value, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeGreaterThan(Byte value) {
            addCriterion("roadrepairtype >", value, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("roadrepairtype >=", value, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeLessThan(Byte value) {
            addCriterion("roadrepairtype <", value, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeLessThanOrEqualTo(Byte value) {
            addCriterion("roadrepairtype <=", value, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeIn(List<Byte> values) {
            addCriterion("roadrepairtype in", values, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeNotIn(List<Byte> values) {
            addCriterion("roadrepairtype not in", values, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeBetween(Byte value1, Byte value2) {
            addCriterion("roadrepairtype between", value1, value2, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andRoadrepairtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("roadrepairtype not between", value1, value2, "roadrepairtype");
            return (Criteria) this;
        }

        public Criteria andStandarIsNull() {
            addCriterion("standar is null");
            return (Criteria) this;
        }

        public Criteria andStandarIsNotNull() {
            addCriterion("standar is not null");
            return (Criteria) this;
        }

        public Criteria andStandarEqualTo(Byte value) {
            addCriterion("standar =", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarNotEqualTo(Byte value) {
            addCriterion("standar <>", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarGreaterThan(Byte value) {
            addCriterion("standar >", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarGreaterThanOrEqualTo(Byte value) {
            addCriterion("standar >=", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarLessThan(Byte value) {
            addCriterion("standar <", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarLessThanOrEqualTo(Byte value) {
            addCriterion("standar <=", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarIn(List<Byte> values) {
            addCriterion("standar in", values, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarNotIn(List<Byte> values) {
            addCriterion("standar not in", values, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarBetween(Byte value1, Byte value2) {
            addCriterion("standar between", value1, value2, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarNotBetween(Byte value1, Byte value2) {
            addCriterion("standar not between", value1, value2, "standar");
            return (Criteria) this;
        }

        public Criteria andRefnumIsNull() {
            addCriterion("refnum is null");
            return (Criteria) this;
        }

        public Criteria andRefnumIsNotNull() {
            addCriterion("refnum is not null");
            return (Criteria) this;
        }

        public Criteria andRefnumEqualTo(String value) {
            addCriterion("refnum =", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumNotEqualTo(String value) {
            addCriterion("refnum <>", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumGreaterThan(String value) {
            addCriterion("refnum >", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumGreaterThanOrEqualTo(String value) {
            addCriterion("refnum >=", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumLessThan(String value) {
            addCriterion("refnum <", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumLessThanOrEqualTo(String value) {
            addCriterion("refnum <=", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumLike(String value) {
            addCriterion("refnum like", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumNotLike(String value) {
            addCriterion("refnum not like", value, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumIn(List<String> values) {
            addCriterion("refnum in", values, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumNotIn(List<String> values) {
            addCriterion("refnum not in", values, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumBetween(String value1, String value2) {
            addCriterion("refnum between", value1, value2, "refnum");
            return (Criteria) this;
        }

        public Criteria andRefnumNotBetween(String value1, String value2) {
            addCriterion("refnum not between", value1, value2, "refnum");
            return (Criteria) this;
        }

        public Criteria andBeginpriceIsNull() {
            addCriterion("beginprice is null");
            return (Criteria) this;
        }

        public Criteria andBeginpriceIsNotNull() {
            addCriterion("beginprice is not null");
            return (Criteria) this;
        }

        public Criteria andBeginpriceEqualTo(String value) {
            addCriterion("beginprice =", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceNotEqualTo(String value) {
            addCriterion("beginprice <>", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceGreaterThan(String value) {
            addCriterion("beginprice >", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceGreaterThanOrEqualTo(String value) {
            addCriterion("beginprice >=", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceLessThan(String value) {
            addCriterion("beginprice <", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceLessThanOrEqualTo(String value) {
            addCriterion("beginprice <=", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceLike(String value) {
            addCriterion("beginprice like", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceNotLike(String value) {
            addCriterion("beginprice not like", value, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceIn(List<String> values) {
            addCriterion("beginprice in", values, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceNotIn(List<String> values) {
            addCriterion("beginprice not in", values, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceBetween(String value1, String value2) {
            addCriterion("beginprice between", value1, value2, "beginprice");
            return (Criteria) this;
        }

        public Criteria andBeginpriceNotBetween(String value1, String value2) {
            addCriterion("beginprice not between", value1, value2, "beginprice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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
     * nms_roadprice
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_roadprice 2016-07-13
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