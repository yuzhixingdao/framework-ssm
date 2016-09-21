package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsTroresinfoExample {
    /**
     * nms_troresinfo
     */
    protected String orderByClause;

    /**
     * nms_troresinfo
     */
    protected boolean distinct;

    /**
     * nms_troresinfo
     */
    protected List<Criteria> oredCriteria;

    public NmsTroresinfoExample() {
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
     * nms_troresinfo 2016-07-13
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

        public Criteria andCraneserIsNull() {
            addCriterion("craneser is null");
            return (Criteria) this;
        }

        public Criteria andCraneserIsNotNull() {
            addCriterion("craneser is not null");
            return (Criteria) this;
        }

        public Criteria andCraneserEqualTo(Byte value) {
            addCriterion("craneser =", value, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserNotEqualTo(Byte value) {
            addCriterion("craneser <>", value, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserGreaterThan(Byte value) {
            addCriterion("craneser >", value, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserGreaterThanOrEqualTo(Byte value) {
            addCriterion("craneser >=", value, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserLessThan(Byte value) {
            addCriterion("craneser <", value, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserLessThanOrEqualTo(Byte value) {
            addCriterion("craneser <=", value, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserIn(List<Byte> values) {
            addCriterion("craneser in", values, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserNotIn(List<Byte> values) {
            addCriterion("craneser not in", values, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserBetween(Byte value1, Byte value2) {
            addCriterion("craneser between", value1, value2, "craneser");
            return (Criteria) this;
        }

        public Criteria andCraneserNotBetween(Byte value1, Byte value2) {
            addCriterion("craneser not between", value1, value2, "craneser");
            return (Criteria) this;
        }

        public Criteria andCranetonIsNull() {
            addCriterion("craneton is null");
            return (Criteria) this;
        }

        public Criteria andCranetonIsNotNull() {
            addCriterion("craneton is not null");
            return (Criteria) this;
        }

        public Criteria andCranetonEqualTo(String value) {
            addCriterion("craneton =", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonNotEqualTo(String value) {
            addCriterion("craneton <>", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonGreaterThan(String value) {
            addCriterion("craneton >", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonGreaterThanOrEqualTo(String value) {
            addCriterion("craneton >=", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonLessThan(String value) {
            addCriterion("craneton <", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonLessThanOrEqualTo(String value) {
            addCriterion("craneton <=", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonLike(String value) {
            addCriterion("craneton like", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonNotLike(String value) {
            addCriterion("craneton not like", value, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonIn(List<String> values) {
            addCriterion("craneton in", values, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonNotIn(List<String> values) {
            addCriterion("craneton not in", values, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonBetween(String value1, String value2) {
            addCriterion("craneton between", value1, value2, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranetonNotBetween(String value1, String value2) {
            addCriterion("craneton not between", value1, value2, "craneton");
            return (Criteria) this;
        }

        public Criteria andCranenumIsNull() {
            addCriterion("cranenum is null");
            return (Criteria) this;
        }

        public Criteria andCranenumIsNotNull() {
            addCriterion("cranenum is not null");
            return (Criteria) this;
        }

        public Criteria andCranenumEqualTo(String value) {
            addCriterion("cranenum =", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumNotEqualTo(String value) {
            addCriterion("cranenum <>", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumGreaterThan(String value) {
            addCriterion("cranenum >", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumGreaterThanOrEqualTo(String value) {
            addCriterion("cranenum >=", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumLessThan(String value) {
            addCriterion("cranenum <", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumLessThanOrEqualTo(String value) {
            addCriterion("cranenum <=", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumLike(String value) {
            addCriterion("cranenum like", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumNotLike(String value) {
            addCriterion("cranenum not like", value, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumIn(List<String> values) {
            addCriterion("cranenum in", values, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumNotIn(List<String> values) {
            addCriterion("cranenum not in", values, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumBetween(String value1, String value2) {
            addCriterion("cranenum between", value1, value2, "cranenum");
            return (Criteria) this;
        }

        public Criteria andCranenumNotBetween(String value1, String value2) {
            addCriterion("cranenum not between", value1, value2, "cranenum");
            return (Criteria) this;
        }

        public Criteria andContactcraIsNull() {
            addCriterion("contactcra is null");
            return (Criteria) this;
        }

        public Criteria andContactcraIsNotNull() {
            addCriterion("contactcra is not null");
            return (Criteria) this;
        }

        public Criteria andContactcraEqualTo(Byte value) {
            addCriterion("contactcra =", value, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraNotEqualTo(Byte value) {
            addCriterion("contactcra <>", value, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraGreaterThan(Byte value) {
            addCriterion("contactcra >", value, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraGreaterThanOrEqualTo(Byte value) {
            addCriterion("contactcra >=", value, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraLessThan(Byte value) {
            addCriterion("contactcra <", value, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraLessThanOrEqualTo(Byte value) {
            addCriterion("contactcra <=", value, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraIn(List<Byte> values) {
            addCriterion("contactcra in", values, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraNotIn(List<Byte> values) {
            addCriterion("contactcra not in", values, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraBetween(Byte value1, Byte value2) {
            addCriterion("contactcra between", value1, value2, "contactcra");
            return (Criteria) this;
        }

        public Criteria andContactcraNotBetween(Byte value1, Byte value2) {
            addCriterion("contactcra not between", value1, value2, "contactcra");
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
     * nms_troresinfo
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_troresinfo 2016-07-13
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