package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsRoadrepinfoExample {
    /**
     * nms_roadrepinfo
     */
    protected String orderByClause;

    /**
     * nms_roadrepinfo
     */
    protected boolean distinct;

    /**
     * nms_roadrepinfo
     */
    protected List<Criteria> oredCriteria;

    public NmsRoadrepinfoExample() {
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
     * nms_roadrepinfo 2016-07-13
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

        public Criteria andRoadreplevIsNull() {
            addCriterion("roadreplev is null");
            return (Criteria) this;
        }

        public Criteria andRoadreplevIsNotNull() {
            addCriterion("roadreplev is not null");
            return (Criteria) this;
        }

        public Criteria andRoadreplevEqualTo(Byte value) {
            addCriterion("roadreplev =", value, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevNotEqualTo(Byte value) {
            addCriterion("roadreplev <>", value, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevGreaterThan(Byte value) {
            addCriterion("roadreplev >", value, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevGreaterThanOrEqualTo(Byte value) {
            addCriterion("roadreplev >=", value, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevLessThan(Byte value) {
            addCriterion("roadreplev <", value, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevLessThanOrEqualTo(Byte value) {
            addCriterion("roadreplev <=", value, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevIn(List<Byte> values) {
            addCriterion("roadreplev in", values, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevNotIn(List<Byte> values) {
            addCriterion("roadreplev not in", values, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevBetween(Byte value1, Byte value2) {
            addCriterion("roadreplev between", value1, value2, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andRoadreplevNotBetween(Byte value1, Byte value2) {
            addCriterion("roadreplev not between", value1, value2, "roadreplev");
            return (Criteria) this;
        }

        public Criteria andBillplanIsNull() {
            addCriterion("billplan is null");
            return (Criteria) this;
        }

        public Criteria andBillplanIsNotNull() {
            addCriterion("billplan is not null");
            return (Criteria) this;
        }

        public Criteria andBillplanEqualTo(Byte value) {
            addCriterion("billplan =", value, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanNotEqualTo(Byte value) {
            addCriterion("billplan <>", value, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanGreaterThan(Byte value) {
            addCriterion("billplan >", value, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanGreaterThanOrEqualTo(Byte value) {
            addCriterion("billplan >=", value, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanLessThan(Byte value) {
            addCriterion("billplan <", value, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanLessThanOrEqualTo(Byte value) {
            addCriterion("billplan <=", value, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanIn(List<Byte> values) {
            addCriterion("billplan in", values, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanNotIn(List<Byte> values) {
            addCriterion("billplan not in", values, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanBetween(Byte value1, Byte value2) {
            addCriterion("billplan between", value1, value2, "billplan");
            return (Criteria) this;
        }

        public Criteria andBillplanNotBetween(Byte value1, Byte value2) {
            addCriterion("billplan not between", value1, value2, "billplan");
            return (Criteria) this;
        }

        public Criteria andOilserIsNull() {
            addCriterion("oilser is null");
            return (Criteria) this;
        }

        public Criteria andOilserIsNotNull() {
            addCriterion("oilser is not null");
            return (Criteria) this;
        }

        public Criteria andOilserEqualTo(Byte value) {
            addCriterion("oilser =", value, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserNotEqualTo(Byte value) {
            addCriterion("oilser <>", value, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserGreaterThan(Byte value) {
            addCriterion("oilser >", value, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserGreaterThanOrEqualTo(Byte value) {
            addCriterion("oilser >=", value, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserLessThan(Byte value) {
            addCriterion("oilser <", value, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserLessThanOrEqualTo(Byte value) {
            addCriterion("oilser <=", value, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserIn(List<Byte> values) {
            addCriterion("oilser in", values, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserNotIn(List<Byte> values) {
            addCriterion("oilser not in", values, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserBetween(Byte value1, Byte value2) {
            addCriterion("oilser between", value1, value2, "oilser");
            return (Criteria) this;
        }

        public Criteria andOilserNotBetween(Byte value1, Byte value2) {
            addCriterion("oilser not between", value1, value2, "oilser");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumIsNull() {
            addCriterion("noroadrepnum is null");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumIsNotNull() {
            addCriterion("noroadrepnum is not null");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumEqualTo(String value) {
            addCriterion("noroadrepnum =", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumNotEqualTo(String value) {
            addCriterion("noroadrepnum <>", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumGreaterThan(String value) {
            addCriterion("noroadrepnum >", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumGreaterThanOrEqualTo(String value) {
            addCriterion("noroadrepnum >=", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumLessThan(String value) {
            addCriterion("noroadrepnum <", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumLessThanOrEqualTo(String value) {
            addCriterion("noroadrepnum <=", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumLike(String value) {
            addCriterion("noroadrepnum like", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumNotLike(String value) {
            addCriterion("noroadrepnum not like", value, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumIn(List<String> values) {
            addCriterion("noroadrepnum in", values, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumNotIn(List<String> values) {
            addCriterion("noroadrepnum not in", values, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumBetween(String value1, String value2) {
            addCriterion("noroadrepnum between", value1, value2, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andNoroadrepnumNotBetween(String value1, String value2) {
            addCriterion("noroadrepnum not between", value1, value2, "noroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumIsNull() {
            addCriterion("eleroadrepnum is null");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumIsNotNull() {
            addCriterion("eleroadrepnum is not null");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumEqualTo(String value) {
            addCriterion("eleroadrepnum =", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumNotEqualTo(String value) {
            addCriterion("eleroadrepnum <>", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumGreaterThan(String value) {
            addCriterion("eleroadrepnum >", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumGreaterThanOrEqualTo(String value) {
            addCriterion("eleroadrepnum >=", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumLessThan(String value) {
            addCriterion("eleroadrepnum <", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumLessThanOrEqualTo(String value) {
            addCriterion("eleroadrepnum <=", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumLike(String value) {
            addCriterion("eleroadrepnum like", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumNotLike(String value) {
            addCriterion("eleroadrepnum not like", value, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumIn(List<String> values) {
            addCriterion("eleroadrepnum in", values, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumNotIn(List<String> values) {
            addCriterion("eleroadrepnum not in", values, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumBetween(String value1, String value2) {
            addCriterion("eleroadrepnum between", value1, value2, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andEleroadrepnumNotBetween(String value1, String value2) {
            addCriterion("eleroadrepnum not between", value1, value2, "eleroadrepnum");
            return (Criteria) this;
        }

        public Criteria andLowdrojackIsNull() {
            addCriterion("lowdrojack is null");
            return (Criteria) this;
        }

        public Criteria andLowdrojackIsNotNull() {
            addCriterion("lowdrojack is not null");
            return (Criteria) this;
        }

        public Criteria andLowdrojackEqualTo(Byte value) {
            addCriterion("lowdrojack =", value, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackNotEqualTo(Byte value) {
            addCriterion("lowdrojack <>", value, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackGreaterThan(Byte value) {
            addCriterion("lowdrojack >", value, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackGreaterThanOrEqualTo(Byte value) {
            addCriterion("lowdrojack >=", value, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackLessThan(Byte value) {
            addCriterion("lowdrojack <", value, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackLessThanOrEqualTo(Byte value) {
            addCriterion("lowdrojack <=", value, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackIn(List<Byte> values) {
            addCriterion("lowdrojack in", values, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackNotIn(List<Byte> values) {
            addCriterion("lowdrojack not in", values, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackBetween(Byte value1, Byte value2) {
            addCriterion("lowdrojack between", value1, value2, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andLowdrojackNotBetween(Byte value1, Byte value2) {
            addCriterion("lowdrojack not between", value1, value2, "lowdrojack");
            return (Criteria) this;
        }

        public Criteria andBatteryappIsNull() {
            addCriterion("batteryapp is null");
            return (Criteria) this;
        }

        public Criteria andBatteryappIsNotNull() {
            addCriterion("batteryapp is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryappEqualTo(Byte value) {
            addCriterion("batteryapp =", value, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappNotEqualTo(Byte value) {
            addCriterion("batteryapp <>", value, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappGreaterThan(Byte value) {
            addCriterion("batteryapp >", value, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappGreaterThanOrEqualTo(Byte value) {
            addCriterion("batteryapp >=", value, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappLessThan(Byte value) {
            addCriterion("batteryapp <", value, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappLessThanOrEqualTo(Byte value) {
            addCriterion("batteryapp <=", value, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappIn(List<Byte> values) {
            addCriterion("batteryapp in", values, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappNotIn(List<Byte> values) {
            addCriterion("batteryapp not in", values, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappBetween(Byte value1, Byte value2) {
            addCriterion("batteryapp between", value1, value2, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andBatteryappNotBetween(Byte value1, Byte value2) {
            addCriterion("batteryapp not between", value1, value2, "batteryapp");
            return (Criteria) this;
        }

        public Criteria andProilbucketIsNull() {
            addCriterion("proilbucket is null");
            return (Criteria) this;
        }

        public Criteria andProilbucketIsNotNull() {
            addCriterion("proilbucket is not null");
            return (Criteria) this;
        }

        public Criteria andProilbucketEqualTo(Byte value) {
            addCriterion("proilbucket =", value, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketNotEqualTo(Byte value) {
            addCriterion("proilbucket <>", value, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketGreaterThan(Byte value) {
            addCriterion("proilbucket >", value, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketGreaterThanOrEqualTo(Byte value) {
            addCriterion("proilbucket >=", value, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketLessThan(Byte value) {
            addCriterion("proilbucket <", value, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketLessThanOrEqualTo(Byte value) {
            addCriterion("proilbucket <=", value, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketIn(List<Byte> values) {
            addCriterion("proilbucket in", values, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketNotIn(List<Byte> values) {
            addCriterion("proilbucket not in", values, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketBetween(Byte value1, Byte value2) {
            addCriterion("proilbucket between", value1, value2, "proilbucket");
            return (Criteria) this;
        }

        public Criteria andProilbucketNotBetween(Byte value1, Byte value2) {
            addCriterion("proilbucket not between", value1, value2, "proilbucket");
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
     * nms_roadrepinfo
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_roadrepinfo 2016-07-13
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