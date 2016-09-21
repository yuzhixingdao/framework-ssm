package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsRepairinfoExample {
    /**
     * nms_repairinfo
     */
    protected String orderByClause;

    /**
     * nms_repairinfo
     */
    protected boolean distinct;

    /**
     * nms_repairinfo
     */
    protected List<Criteria> oredCriteria;

    public NmsRepairinfoExample() {
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
     * nms_repairinfo 2016-07-13
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

        public Criteria andRepshopsquaIsNull() {
            addCriterion("repshopsqua is null");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaIsNotNull() {
            addCriterion("repshopsqua is not null");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaEqualTo(Byte value) {
            addCriterion("repshopsqua =", value, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaNotEqualTo(Byte value) {
            addCriterion("repshopsqua <>", value, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaGreaterThan(Byte value) {
            addCriterion("repshopsqua >", value, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaGreaterThanOrEqualTo(Byte value) {
            addCriterion("repshopsqua >=", value, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaLessThan(Byte value) {
            addCriterion("repshopsqua <", value, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaLessThanOrEqualTo(Byte value) {
            addCriterion("repshopsqua <=", value, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaIn(List<Byte> values) {
            addCriterion("repshopsqua in", values, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaNotIn(List<Byte> values) {
            addCriterion("repshopsqua not in", values, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaBetween(Byte value1, Byte value2) {
            addCriterion("repshopsqua between", value1, value2, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepshopsquaNotBetween(Byte value1, Byte value2) {
            addCriterion("repshopsqua not between", value1, value2, "repshopsqua");
            return (Criteria) this;
        }

        public Criteria andRepserIsNull() {
            addCriterion("repser is null");
            return (Criteria) this;
        }

        public Criteria andRepserIsNotNull() {
            addCriterion("repser is not null");
            return (Criteria) this;
        }

        public Criteria andRepserEqualTo(Byte value) {
            addCriterion("repser =", value, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserNotEqualTo(Byte value) {
            addCriterion("repser <>", value, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserGreaterThan(Byte value) {
            addCriterion("repser >", value, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserGreaterThanOrEqualTo(Byte value) {
            addCriterion("repser >=", value, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserLessThan(Byte value) {
            addCriterion("repser <", value, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserLessThanOrEqualTo(Byte value) {
            addCriterion("repser <=", value, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserIn(List<Byte> values) {
            addCriterion("repser in", values, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserNotIn(List<Byte> values) {
            addCriterion("repser not in", values, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserBetween(Byte value1, Byte value2) {
            addCriterion("repser between", value1, value2, "repser");
            return (Criteria) this;
        }

        public Criteria andRepserNotBetween(Byte value1, Byte value2) {
            addCriterion("repser not between", value1, value2, "repser");
            return (Criteria) this;
        }

        public Criteria andRepbandIsNull() {
            addCriterion("repband is null");
            return (Criteria) this;
        }

        public Criteria andRepbandIsNotNull() {
            addCriterion("repband is not null");
            return (Criteria) this;
        }

        public Criteria andRepbandEqualTo(Byte value) {
            addCriterion("repband =", value, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandNotEqualTo(Byte value) {
            addCriterion("repband <>", value, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandGreaterThan(Byte value) {
            addCriterion("repband >", value, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandGreaterThanOrEqualTo(Byte value) {
            addCriterion("repband >=", value, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandLessThan(Byte value) {
            addCriterion("repband <", value, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandLessThanOrEqualTo(Byte value) {
            addCriterion("repband <=", value, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandIn(List<Byte> values) {
            addCriterion("repband in", values, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandNotIn(List<Byte> values) {
            addCriterion("repband not in", values, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandBetween(Byte value1, Byte value2) {
            addCriterion("repband between", value1, value2, "repband");
            return (Criteria) this;
        }

        public Criteria andRepbandNotBetween(Byte value1, Byte value2) {
            addCriterion("repband not between", value1, value2, "repband");
            return (Criteria) this;
        }

        public Criteria andSearchserIsNull() {
            addCriterion("searchser is null");
            return (Criteria) this;
        }

        public Criteria andSearchserIsNotNull() {
            addCriterion("searchser is not null");
            return (Criteria) this;
        }

        public Criteria andSearchserEqualTo(Byte value) {
            addCriterion("searchser =", value, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserNotEqualTo(Byte value) {
            addCriterion("searchser <>", value, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserGreaterThan(Byte value) {
            addCriterion("searchser >", value, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserGreaterThanOrEqualTo(Byte value) {
            addCriterion("searchser >=", value, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserLessThan(Byte value) {
            addCriterion("searchser <", value, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserLessThanOrEqualTo(Byte value) {
            addCriterion("searchser <=", value, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserIn(List<Byte> values) {
            addCriterion("searchser in", values, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserNotIn(List<Byte> values) {
            addCriterion("searchser not in", values, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserBetween(Byte value1, Byte value2) {
            addCriterion("searchser between", value1, value2, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchserNotBetween(Byte value1, Byte value2) {
            addCriterion("searchser not between", value1, value2, "searchser");
            return (Criteria) this;
        }

        public Criteria andSearchbandIsNull() {
            addCriterion("searchband is null");
            return (Criteria) this;
        }

        public Criteria andSearchbandIsNotNull() {
            addCriterion("searchband is not null");
            return (Criteria) this;
        }

        public Criteria andSearchbandEqualTo(String value) {
            addCriterion("searchband =", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandNotEqualTo(String value) {
            addCriterion("searchband <>", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandGreaterThan(String value) {
            addCriterion("searchband >", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandGreaterThanOrEqualTo(String value) {
            addCriterion("searchband >=", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandLessThan(String value) {
            addCriterion("searchband <", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandLessThanOrEqualTo(String value) {
            addCriterion("searchband <=", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandLike(String value) {
            addCriterion("searchband like", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandNotLike(String value) {
            addCriterion("searchband not like", value, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandIn(List<String> values) {
            addCriterion("searchband in", values, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandNotIn(List<String> values) {
            addCriterion("searchband not in", values, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandBetween(String value1, String value2) {
            addCriterion("searchband between", value1, value2, "searchband");
            return (Criteria) this;
        }

        public Criteria andSearchbandNotBetween(String value1, String value2) {
            addCriterion("searchband not between", value1, value2, "searchband");
            return (Criteria) this;
        }

        public Criteria andAdjustIsNull() {
            addCriterion("adjust is null");
            return (Criteria) this;
        }

        public Criteria andAdjustIsNotNull() {
            addCriterion("adjust is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustEqualTo(Byte value) {
            addCriterion("adjust =", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustNotEqualTo(Byte value) {
            addCriterion("adjust <>", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustGreaterThan(Byte value) {
            addCriterion("adjust >", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustGreaterThanOrEqualTo(Byte value) {
            addCriterion("adjust >=", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustLessThan(Byte value) {
            addCriterion("adjust <", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustLessThanOrEqualTo(Byte value) {
            addCriterion("adjust <=", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustIn(List<Byte> values) {
            addCriterion("adjust in", values, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustNotIn(List<Byte> values) {
            addCriterion("adjust not in", values, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustBetween(Byte value1, Byte value2) {
            addCriterion("adjust between", value1, value2, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustNotBetween(Byte value1, Byte value2) {
            addCriterion("adjust not between", value1, value2, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustcomIsNull() {
            addCriterion("adjustcom is null");
            return (Criteria) this;
        }

        public Criteria andAdjustcomIsNotNull() {
            addCriterion("adjustcom is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustcomEqualTo(String value) {
            addCriterion("adjustcom =", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomNotEqualTo(String value) {
            addCriterion("adjustcom <>", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomGreaterThan(String value) {
            addCriterion("adjustcom >", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomGreaterThanOrEqualTo(String value) {
            addCriterion("adjustcom >=", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomLessThan(String value) {
            addCriterion("adjustcom <", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomLessThanOrEqualTo(String value) {
            addCriterion("adjustcom <=", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomLike(String value) {
            addCriterion("adjustcom like", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomNotLike(String value) {
            addCriterion("adjustcom not like", value, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomIn(List<String> values) {
            addCriterion("adjustcom in", values, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomNotIn(List<String> values) {
            addCriterion("adjustcom not in", values, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomBetween(String value1, String value2) {
            addCriterion("adjustcom between", value1, value2, "adjustcom");
            return (Criteria) this;
        }

        public Criteria andAdjustcomNotBetween(String value1, String value2) {
            addCriterion("adjustcom not between", value1, value2, "adjustcom");
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
     * nms_repairinfo
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_repairinfo 2016-07-13
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