package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NmsTrabilityExample {
    /**
     * nms_trability
     */
    protected String orderByClause;

    /**
     * nms_trability
     */
    protected boolean distinct;

    /**
     * nms_trability
     */
    protected List<Criteria> oredCriteria;

    public NmsTrabilityExample() {
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
     * nms_trability 2016-07-13
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

        public Criteria andTralevelIsNull() {
            addCriterion("tralevel is null");
            return (Criteria) this;
        }

        public Criteria andTralevelIsNotNull() {
            addCriterion("tralevel is not null");
            return (Criteria) this;
        }

        public Criteria andTralevelEqualTo(Byte value) {
            addCriterion("tralevel =", value, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelNotEqualTo(Byte value) {
            addCriterion("tralevel <>", value, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelGreaterThan(Byte value) {
            addCriterion("tralevel >", value, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("tralevel >=", value, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelLessThan(Byte value) {
            addCriterion("tralevel <", value, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelLessThanOrEqualTo(Byte value) {
            addCriterion("tralevel <=", value, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelIn(List<Byte> values) {
            addCriterion("tralevel in", values, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelNotIn(List<Byte> values) {
            addCriterion("tralevel not in", values, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelBetween(Byte value1, Byte value2) {
            addCriterion("tralevel between", value1, value2, "tralevel");
            return (Criteria) this;
        }

        public Criteria andTralevelNotBetween(Byte value1, Byte value2) {
            addCriterion("tralevel not between", value1, value2, "tralevel");
            return (Criteria) this;
        }

        public Criteria andHightraqualIsNull() {
            addCriterion("hightraqual is null");
            return (Criteria) this;
        }

        public Criteria andHightraqualIsNotNull() {
            addCriterion("hightraqual is not null");
            return (Criteria) this;
        }

        public Criteria andHightraqualEqualTo(Byte value) {
            addCriterion("hightraqual =", value, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualNotEqualTo(Byte value) {
            addCriterion("hightraqual <>", value, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualGreaterThan(Byte value) {
            addCriterion("hightraqual >", value, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualGreaterThanOrEqualTo(Byte value) {
            addCriterion("hightraqual >=", value, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualLessThan(Byte value) {
            addCriterion("hightraqual <", value, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualLessThanOrEqualTo(Byte value) {
            addCriterion("hightraqual <=", value, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualIn(List<Byte> values) {
            addCriterion("hightraqual in", values, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualNotIn(List<Byte> values) {
            addCriterion("hightraqual not in", values, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualBetween(Byte value1, Byte value2) {
            addCriterion("hightraqual between", value1, value2, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andHightraqualNotBetween(Byte value1, Byte value2) {
            addCriterion("hightraqual not between", value1, value2, "hightraqual");
            return (Criteria) this;
        }

        public Criteria andBillmodelIsNull() {
            addCriterion("billmodel is null");
            return (Criteria) this;
        }

        public Criteria andBillmodelIsNotNull() {
            addCriterion("billmodel is not null");
            return (Criteria) this;
        }

        public Criteria andBillmodelEqualTo(Byte value) {
            addCriterion("billmodel =", value, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelNotEqualTo(Byte value) {
            addCriterion("billmodel <>", value, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelGreaterThan(Byte value) {
            addCriterion("billmodel >", value, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelGreaterThanOrEqualTo(Byte value) {
            addCriterion("billmodel >=", value, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelLessThan(Byte value) {
            addCriterion("billmodel <", value, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelLessThanOrEqualTo(Byte value) {
            addCriterion("billmodel <=", value, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelIn(List<Byte> values) {
            addCriterion("billmodel in", values, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelNotIn(List<Byte> values) {
            addCriterion("billmodel not in", values, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelBetween(Byte value1, Byte value2) {
            addCriterion("billmodel between", value1, value2, "billmodel");
            return (Criteria) this;
        }

        public Criteria andBillmodelNotBetween(Byte value1, Byte value2) {
            addCriterion("billmodel not between", value1, value2, "billmodel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelIsNull() {
            addCriterion("trainwheel is null");
            return (Criteria) this;
        }

        public Criteria andTrainwheelIsNotNull() {
            addCriterion("trainwheel is not null");
            return (Criteria) this;
        }

        public Criteria andTrainwheelEqualTo(Byte value) {
            addCriterion("trainwheel =", value, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelNotEqualTo(Byte value) {
            addCriterion("trainwheel <>", value, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelGreaterThan(Byte value) {
            addCriterion("trainwheel >", value, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelGreaterThanOrEqualTo(Byte value) {
            addCriterion("trainwheel >=", value, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelLessThan(Byte value) {
            addCriterion("trainwheel <", value, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelLessThanOrEqualTo(Byte value) {
            addCriterion("trainwheel <=", value, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelIn(List<Byte> values) {
            addCriterion("trainwheel in", values, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelNotIn(List<Byte> values) {
            addCriterion("trainwheel not in", values, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelBetween(Byte value1, Byte value2) {
            addCriterion("trainwheel between", value1, value2, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andTrainwheelNotBetween(Byte value1, Byte value2) {
            addCriterion("trainwheel not between", value1, value2, "trainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelIsNull() {
            addCriterion("univtrainwheel is null");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelIsNotNull() {
            addCriterion("univtrainwheel is not null");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelEqualTo(Byte value) {
            addCriterion("univtrainwheel =", value, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelNotEqualTo(Byte value) {
            addCriterion("univtrainwheel <>", value, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelGreaterThan(Byte value) {
            addCriterion("univtrainwheel >", value, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelGreaterThanOrEqualTo(Byte value) {
            addCriterion("univtrainwheel >=", value, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelLessThan(Byte value) {
            addCriterion("univtrainwheel <", value, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelLessThanOrEqualTo(Byte value) {
            addCriterion("univtrainwheel <=", value, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelIn(List<Byte> values) {
            addCriterion("univtrainwheel in", values, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelNotIn(List<Byte> values) {
            addCriterion("univtrainwheel not in", values, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelBetween(Byte value1, Byte value2) {
            addCriterion("univtrainwheel between", value1, value2, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andUnivtrainwheelNotBetween(Byte value1, Byte value2) {
            addCriterion("univtrainwheel not between", value1, value2, "univtrainwheel");
            return (Criteria) this;
        }

        public Criteria andBaseforkIsNull() {
            addCriterion("basefork is null");
            return (Criteria) this;
        }

        public Criteria andBaseforkIsNotNull() {
            addCriterion("basefork is not null");
            return (Criteria) this;
        }

        public Criteria andBaseforkEqualTo(Byte value) {
            addCriterion("basefork =", value, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkNotEqualTo(Byte value) {
            addCriterion("basefork <>", value, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkGreaterThan(Byte value) {
            addCriterion("basefork >", value, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkGreaterThanOrEqualTo(Byte value) {
            addCriterion("basefork >=", value, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkLessThan(Byte value) {
            addCriterion("basefork <", value, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkLessThanOrEqualTo(Byte value) {
            addCriterion("basefork <=", value, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkIn(List<Byte> values) {
            addCriterion("basefork in", values, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkNotIn(List<Byte> values) {
            addCriterion("basefork not in", values, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkBetween(Byte value1, Byte value2) {
            addCriterion("basefork between", value1, value2, "basefork");
            return (Criteria) this;
        }

        public Criteria andBaseforkNotBetween(Byte value1, Byte value2) {
            addCriterion("basefork not between", value1, value2, "basefork");
            return (Criteria) this;
        }

        public Criteria andBangdaiIsNull() {
            addCriterion("bangdai is null");
            return (Criteria) this;
        }

        public Criteria andBangdaiIsNotNull() {
            addCriterion("bangdai is not null");
            return (Criteria) this;
        }

        public Criteria andBangdaiEqualTo(Byte value) {
            addCriterion("bangdai =", value, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiNotEqualTo(Byte value) {
            addCriterion("bangdai <>", value, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiGreaterThan(Byte value) {
            addCriterion("bangdai >", value, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiGreaterThanOrEqualTo(Byte value) {
            addCriterion("bangdai >=", value, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiLessThan(Byte value) {
            addCriterion("bangdai <", value, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiLessThanOrEqualTo(Byte value) {
            addCriterion("bangdai <=", value, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiIn(List<Byte> values) {
            addCriterion("bangdai in", values, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiNotIn(List<Byte> values) {
            addCriterion("bangdai not in", values, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiBetween(Byte value1, Byte value2) {
            addCriterion("bangdai between", value1, value2, "bangdai");
            return (Criteria) this;
        }

        public Criteria andBangdaiNotBetween(Byte value1, Byte value2) {
            addCriterion("bangdai not between", value1, value2, "bangdai");
            return (Criteria) this;
        }

        public Criteria andTrainsuIsNull() {
            addCriterion("trainsu is null");
            return (Criteria) this;
        }

        public Criteria andTrainsuIsNotNull() {
            addCriterion("trainsu is not null");
            return (Criteria) this;
        }

        public Criteria andTrainsuEqualTo(Byte value) {
            addCriterion("trainsu =", value, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuNotEqualTo(Byte value) {
            addCriterion("trainsu <>", value, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuGreaterThan(Byte value) {
            addCriterion("trainsu >", value, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuGreaterThanOrEqualTo(Byte value) {
            addCriterion("trainsu >=", value, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuLessThan(Byte value) {
            addCriterion("trainsu <", value, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuLessThanOrEqualTo(Byte value) {
            addCriterion("trainsu <=", value, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuIn(List<Byte> values) {
            addCriterion("trainsu in", values, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuNotIn(List<Byte> values) {
            addCriterion("trainsu not in", values, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuBetween(Byte value1, Byte value2) {
            addCriterion("trainsu between", value1, value2, "trainsu");
            return (Criteria) this;
        }

        public Criteria andTrainsuNotBetween(Byte value1, Byte value2) {
            addCriterion("trainsu not between", value1, value2, "trainsu");
            return (Criteria) this;
        }

        public Criteria andGpsIsNull() {
            addCriterion("gps is null");
            return (Criteria) this;
        }

        public Criteria andGpsIsNotNull() {
            addCriterion("gps is not null");
            return (Criteria) this;
        }

        public Criteria andGpsEqualTo(Byte value) {
            addCriterion("gps =", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotEqualTo(Byte value) {
            addCriterion("gps <>", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThan(Byte value) {
            addCriterion("gps >", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThanOrEqualTo(Byte value) {
            addCriterion("gps >=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThan(Byte value) {
            addCriterion("gps <", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThanOrEqualTo(Byte value) {
            addCriterion("gps <=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsIn(List<Byte> values) {
            addCriterion("gps in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotIn(List<Byte> values) {
            addCriterion("gps not in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsBetween(Byte value1, Byte value2) {
            addCriterion("gps between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotBetween(Byte value1, Byte value2) {
            addCriterion("gps not between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andRectrackIsNull() {
            addCriterion("rectrack is null");
            return (Criteria) this;
        }

        public Criteria andRectrackIsNotNull() {
            addCriterion("rectrack is not null");
            return (Criteria) this;
        }

        public Criteria andRectrackEqualTo(Byte value) {
            addCriterion("rectrack =", value, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackNotEqualTo(Byte value) {
            addCriterion("rectrack <>", value, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackGreaterThan(Byte value) {
            addCriterion("rectrack >", value, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackGreaterThanOrEqualTo(Byte value) {
            addCriterion("rectrack >=", value, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackLessThan(Byte value) {
            addCriterion("rectrack <", value, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackLessThanOrEqualTo(Byte value) {
            addCriterion("rectrack <=", value, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackIn(List<Byte> values) {
            addCriterion("rectrack in", values, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackNotIn(List<Byte> values) {
            addCriterion("rectrack not in", values, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackBetween(Byte value1, Byte value2) {
            addCriterion("rectrack between", value1, value2, "rectrack");
            return (Criteria) this;
        }

        public Criteria andRectrackNotBetween(Byte value1, Byte value2) {
            addCriterion("rectrack not between", value1, value2, "rectrack");
            return (Criteria) this;
        }

        public Criteria andTraqualseaIsNull() {
            addCriterion("traqualsea is null");
            return (Criteria) this;
        }

        public Criteria andTraqualseaIsNotNull() {
            addCriterion("traqualsea is not null");
            return (Criteria) this;
        }

        public Criteria andTraqualseaEqualTo(String value) {
            addCriterion("traqualsea =", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaNotEqualTo(String value) {
            addCriterion("traqualsea <>", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaGreaterThan(String value) {
            addCriterion("traqualsea >", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaGreaterThanOrEqualTo(String value) {
            addCriterion("traqualsea >=", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaLessThan(String value) {
            addCriterion("traqualsea <", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaLessThanOrEqualTo(String value) {
            addCriterion("traqualsea <=", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaLike(String value) {
            addCriterion("traqualsea like", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaNotLike(String value) {
            addCriterion("traqualsea not like", value, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaIn(List<String> values) {
            addCriterion("traqualsea in", values, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaNotIn(List<String> values) {
            addCriterion("traqualsea not in", values, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaBetween(String value1, String value2) {
            addCriterion("traqualsea between", value1, value2, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andTraqualseaNotBetween(String value1, String value2) {
            addCriterion("traqualsea not between", value1, value2, "traqualsea");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuIsNull() {
            addCriterion("goodsinsu is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuIsNotNull() {
            addCriterion("goodsinsu is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuEqualTo(Byte value) {
            addCriterion("goodsinsu =", value, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuNotEqualTo(Byte value) {
            addCriterion("goodsinsu <>", value, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuGreaterThan(Byte value) {
            addCriterion("goodsinsu >", value, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuGreaterThanOrEqualTo(Byte value) {
            addCriterion("goodsinsu >=", value, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuLessThan(Byte value) {
            addCriterion("goodsinsu <", value, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuLessThanOrEqualTo(Byte value) {
            addCriterion("goodsinsu <=", value, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuIn(List<Byte> values) {
            addCriterion("goodsinsu in", values, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuNotIn(List<Byte> values) {
            addCriterion("goodsinsu not in", values, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuBetween(Byte value1, Byte value2) {
            addCriterion("goodsinsu between", value1, value2, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andGoodsinsuNotBetween(Byte value1, Byte value2) {
            addCriterion("goodsinsu not between", value1, value2, "goodsinsu");
            return (Criteria) this;
        }

        public Criteria andCoverageIsNull() {
            addCriterion("coverage is null");
            return (Criteria) this;
        }

        public Criteria andCoverageIsNotNull() {
            addCriterion("coverage is not null");
            return (Criteria) this;
        }

        public Criteria andCoverageEqualTo(Byte value) {
            addCriterion("coverage =", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotEqualTo(Byte value) {
            addCriterion("coverage <>", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageGreaterThan(Byte value) {
            addCriterion("coverage >", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageGreaterThanOrEqualTo(Byte value) {
            addCriterion("coverage >=", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLessThan(Byte value) {
            addCriterion("coverage <", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLessThanOrEqualTo(Byte value) {
            addCriterion("coverage <=", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageIn(List<Byte> values) {
            addCriterion("coverage in", values, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotIn(List<Byte> values) {
            addCriterion("coverage not in", values, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageBetween(Byte value1, Byte value2) {
            addCriterion("coverage between", value1, value2, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotBetween(Byte value1, Byte value2) {
            addCriterion("coverage not between", value1, value2, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverpriceIsNull() {
            addCriterion("coverprice is null");
            return (Criteria) this;
        }

        public Criteria andCoverpriceIsNotNull() {
            addCriterion("coverprice is not null");
            return (Criteria) this;
        }

        public Criteria andCoverpriceEqualTo(String value) {
            addCriterion("coverprice =", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceNotEqualTo(String value) {
            addCriterion("coverprice <>", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceGreaterThan(String value) {
            addCriterion("coverprice >", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceGreaterThanOrEqualTo(String value) {
            addCriterion("coverprice >=", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceLessThan(String value) {
            addCriterion("coverprice <", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceLessThanOrEqualTo(String value) {
            addCriterion("coverprice <=", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceLike(String value) {
            addCriterion("coverprice like", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceNotLike(String value) {
            addCriterion("coverprice not like", value, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceIn(List<String> values) {
            addCriterion("coverprice in", values, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceNotIn(List<String> values) {
            addCriterion("coverprice not in", values, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceBetween(String value1, String value2) {
            addCriterion("coverprice between", value1, value2, "coverprice");
            return (Criteria) this;
        }

        public Criteria andCoverpriceNotBetween(String value1, String value2) {
            addCriterion("coverprice not between", value1, value2, "coverprice");
            return (Criteria) this;
        }

        public Criteria andThrtabIsNull() {
            addCriterion("thrtab is null");
            return (Criteria) this;
        }

        public Criteria andThrtabIsNotNull() {
            addCriterion("thrtab is not null");
            return (Criteria) this;
        }

        public Criteria andThrtabEqualTo(String value) {
            addCriterion("thrtab =", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabNotEqualTo(String value) {
            addCriterion("thrtab <>", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabGreaterThan(String value) {
            addCriterion("thrtab >", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabGreaterThanOrEqualTo(String value) {
            addCriterion("thrtab >=", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabLessThan(String value) {
            addCriterion("thrtab <", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabLessThanOrEqualTo(String value) {
            addCriterion("thrtab <=", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabLike(String value) {
            addCriterion("thrtab like", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabNotLike(String value) {
            addCriterion("thrtab not like", value, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabIn(List<String> values) {
            addCriterion("thrtab in", values, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabNotIn(List<String> values) {
            addCriterion("thrtab not in", values, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabBetween(String value1, String value2) {
            addCriterion("thrtab between", value1, value2, "thrtab");
            return (Criteria) this;
        }

        public Criteria andThrtabNotBetween(String value1, String value2) {
            addCriterion("thrtab not between", value1, value2, "thrtab");
            return (Criteria) this;
        }

        public Criteria andFivtabIsNull() {
            addCriterion("fivtab is null");
            return (Criteria) this;
        }

        public Criteria andFivtabIsNotNull() {
            addCriterion("fivtab is not null");
            return (Criteria) this;
        }

        public Criteria andFivtabEqualTo(String value) {
            addCriterion("fivtab =", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabNotEqualTo(String value) {
            addCriterion("fivtab <>", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabGreaterThan(String value) {
            addCriterion("fivtab >", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabGreaterThanOrEqualTo(String value) {
            addCriterion("fivtab >=", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabLessThan(String value) {
            addCriterion("fivtab <", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabLessThanOrEqualTo(String value) {
            addCriterion("fivtab <=", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabLike(String value) {
            addCriterion("fivtab like", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabNotLike(String value) {
            addCriterion("fivtab not like", value, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabIn(List<String> values) {
            addCriterion("fivtab in", values, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabNotIn(List<String> values) {
            addCriterion("fivtab not in", values, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabBetween(String value1, String value2) {
            addCriterion("fivtab between", value1, value2, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFivtabNotBetween(String value1, String value2) {
            addCriterion("fivtab not between", value1, value2, "fivtab");
            return (Criteria) this;
        }

        public Criteria andFalltabIsNull() {
            addCriterion("falltab is null");
            return (Criteria) this;
        }

        public Criteria andFalltabIsNotNull() {
            addCriterion("falltab is not null");
            return (Criteria) this;
        }

        public Criteria andFalltabEqualTo(String value) {
            addCriterion("falltab =", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabNotEqualTo(String value) {
            addCriterion("falltab <>", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabGreaterThan(String value) {
            addCriterion("falltab >", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabGreaterThanOrEqualTo(String value) {
            addCriterion("falltab >=", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabLessThan(String value) {
            addCriterion("falltab <", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabLessThanOrEqualTo(String value) {
            addCriterion("falltab <=", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabLike(String value) {
            addCriterion("falltab like", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabNotLike(String value) {
            addCriterion("falltab not like", value, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabIn(List<String> values) {
            addCriterion("falltab in", values, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabNotIn(List<String> values) {
            addCriterion("falltab not in", values, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabBetween(String value1, String value2) {
            addCriterion("falltab between", value1, value2, "falltab");
            return (Criteria) this;
        }

        public Criteria andFalltabNotBetween(String value1, String value2) {
            addCriterion("falltab not between", value1, value2, "falltab");
            return (Criteria) this;
        }

        public Criteria andTardropIsNull() {
            addCriterion("tardrop is null");
            return (Criteria) this;
        }

        public Criteria andTardropIsNotNull() {
            addCriterion("tardrop is not null");
            return (Criteria) this;
        }

        public Criteria andTardropEqualTo(String value) {
            addCriterion("tardrop =", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropNotEqualTo(String value) {
            addCriterion("tardrop <>", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropGreaterThan(String value) {
            addCriterion("tardrop >", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropGreaterThanOrEqualTo(String value) {
            addCriterion("tardrop >=", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropLessThan(String value) {
            addCriterion("tardrop <", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropLessThanOrEqualTo(String value) {
            addCriterion("tardrop <=", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropLike(String value) {
            addCriterion("tardrop like", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropNotLike(String value) {
            addCriterion("tardrop not like", value, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropIn(List<String> values) {
            addCriterion("tardrop in", values, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropNotIn(List<String> values) {
            addCriterion("tardrop not in", values, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropBetween(String value1, String value2) {
            addCriterion("tardrop between", value1, value2, "tardrop");
            return (Criteria) this;
        }

        public Criteria andTardropNotBetween(String value1, String value2) {
            addCriterion("tardrop not between", value1, value2, "tardrop");
            return (Criteria) this;
        }

        public Criteria andThrmodbraIsNull() {
            addCriterion("thrmodbra is null");
            return (Criteria) this;
        }

        public Criteria andThrmodbraIsNotNull() {
            addCriterion("thrmodbra is not null");
            return (Criteria) this;
        }

        public Criteria andThrmodbraEqualTo(String value) {
            addCriterion("thrmodbra =", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraNotEqualTo(String value) {
            addCriterion("thrmodbra <>", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraGreaterThan(String value) {
            addCriterion("thrmodbra >", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraGreaterThanOrEqualTo(String value) {
            addCriterion("thrmodbra >=", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraLessThan(String value) {
            addCriterion("thrmodbra <", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraLessThanOrEqualTo(String value) {
            addCriterion("thrmodbra <=", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraLike(String value) {
            addCriterion("thrmodbra like", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraNotLike(String value) {
            addCriterion("thrmodbra not like", value, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraIn(List<String> values) {
            addCriterion("thrmodbra in", values, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraNotIn(List<String> values) {
            addCriterion("thrmodbra not in", values, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraBetween(String value1, String value2) {
            addCriterion("thrmodbra between", value1, value2, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrmodbraNotBetween(String value1, String value2) {
            addCriterion("thrmodbra not between", value1, value2, "thrmodbra");
            return (Criteria) this;
        }

        public Criteria andThrchaspeIsNull() {
            addCriterion("thrchaspe is null");
            return (Criteria) this;
        }

        public Criteria andThrchaspeIsNotNull() {
            addCriterion("thrchaspe is not null");
            return (Criteria) this;
        }

        public Criteria andThrchaspeEqualTo(String value) {
            addCriterion("thrchaspe =", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeNotEqualTo(String value) {
            addCriterion("thrchaspe <>", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeGreaterThan(String value) {
            addCriterion("thrchaspe >", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeGreaterThanOrEqualTo(String value) {
            addCriterion("thrchaspe >=", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeLessThan(String value) {
            addCriterion("thrchaspe <", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeLessThanOrEqualTo(String value) {
            addCriterion("thrchaspe <=", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeLike(String value) {
            addCriterion("thrchaspe like", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeNotLike(String value) {
            addCriterion("thrchaspe not like", value, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeIn(List<String> values) {
            addCriterion("thrchaspe in", values, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeNotIn(List<String> values) {
            addCriterion("thrchaspe not in", values, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeBetween(String value1, String value2) {
            addCriterion("thrchaspe between", value1, value2, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrchaspeNotBetween(String value1, String value2) {
            addCriterion("thrchaspe not between", value1, value2, "thrchaspe");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeIsNull() {
            addCriterion("thrtrasize is null");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeIsNotNull() {
            addCriterion("thrtrasize is not null");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeEqualTo(String value) {
            addCriterion("thrtrasize =", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeNotEqualTo(String value) {
            addCriterion("thrtrasize <>", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeGreaterThan(String value) {
            addCriterion("thrtrasize >", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeGreaterThanOrEqualTo(String value) {
            addCriterion("thrtrasize >=", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeLessThan(String value) {
            addCriterion("thrtrasize <", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeLessThanOrEqualTo(String value) {
            addCriterion("thrtrasize <=", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeLike(String value) {
            addCriterion("thrtrasize like", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeNotLike(String value) {
            addCriterion("thrtrasize not like", value, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeIn(List<String> values) {
            addCriterion("thrtrasize in", values, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeNotIn(List<String> values) {
            addCriterion("thrtrasize not in", values, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeBetween(String value1, String value2) {
            addCriterion("thrtrasize between", value1, value2, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andThrtrasizeNotBetween(String value1, String value2) {
            addCriterion("thrtrasize not between", value1, value2, "thrtrasize");
            return (Criteria) this;
        }

        public Criteria andFivmodbraIsNull() {
            addCriterion("fivmodbra is null");
            return (Criteria) this;
        }

        public Criteria andFivmodbraIsNotNull() {
            addCriterion("fivmodbra is not null");
            return (Criteria) this;
        }

        public Criteria andFivmodbraEqualTo(String value) {
            addCriterion("fivmodbra =", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraNotEqualTo(String value) {
            addCriterion("fivmodbra <>", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraGreaterThan(String value) {
            addCriterion("fivmodbra >", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraGreaterThanOrEqualTo(String value) {
            addCriterion("fivmodbra >=", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraLessThan(String value) {
            addCriterion("fivmodbra <", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraLessThanOrEqualTo(String value) {
            addCriterion("fivmodbra <=", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraLike(String value) {
            addCriterion("fivmodbra like", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraNotLike(String value) {
            addCriterion("fivmodbra not like", value, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraIn(List<String> values) {
            addCriterion("fivmodbra in", values, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraNotIn(List<String> values) {
            addCriterion("fivmodbra not in", values, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraBetween(String value1, String value2) {
            addCriterion("fivmodbra between", value1, value2, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivmodbraNotBetween(String value1, String value2) {
            addCriterion("fivmodbra not between", value1, value2, "fivmodbra");
            return (Criteria) this;
        }

        public Criteria andFivchaspeIsNull() {
            addCriterion("fivchaspe is null");
            return (Criteria) this;
        }

        public Criteria andFivchaspeIsNotNull() {
            addCriterion("fivchaspe is not null");
            return (Criteria) this;
        }

        public Criteria andFivchaspeEqualTo(String value) {
            addCriterion("fivchaspe =", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeNotEqualTo(String value) {
            addCriterion("fivchaspe <>", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeGreaterThan(String value) {
            addCriterion("fivchaspe >", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeGreaterThanOrEqualTo(String value) {
            addCriterion("fivchaspe >=", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeLessThan(String value) {
            addCriterion("fivchaspe <", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeLessThanOrEqualTo(String value) {
            addCriterion("fivchaspe <=", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeLike(String value) {
            addCriterion("fivchaspe like", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeNotLike(String value) {
            addCriterion("fivchaspe not like", value, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeIn(List<String> values) {
            addCriterion("fivchaspe in", values, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeNotIn(List<String> values) {
            addCriterion("fivchaspe not in", values, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeBetween(String value1, String value2) {
            addCriterion("fivchaspe between", value1, value2, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivchaspeNotBetween(String value1, String value2) {
            addCriterion("fivchaspe not between", value1, value2, "fivchaspe");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeIsNull() {
            addCriterion("fivtrasize is null");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeIsNotNull() {
            addCriterion("fivtrasize is not null");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeEqualTo(String value) {
            addCriterion("fivtrasize =", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeNotEqualTo(String value) {
            addCriterion("fivtrasize <>", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeGreaterThan(String value) {
            addCriterion("fivtrasize >", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeGreaterThanOrEqualTo(String value) {
            addCriterion("fivtrasize >=", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeLessThan(String value) {
            addCriterion("fivtrasize <", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeLessThanOrEqualTo(String value) {
            addCriterion("fivtrasize <=", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeLike(String value) {
            addCriterion("fivtrasize like", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeNotLike(String value) {
            addCriterion("fivtrasize not like", value, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeIn(List<String> values) {
            addCriterion("fivtrasize in", values, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeNotIn(List<String> values) {
            addCriterion("fivtrasize not in", values, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeBetween(String value1, String value2) {
            addCriterion("fivtrasize between", value1, value2, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFivtrasizeNotBetween(String value1, String value2) {
            addCriterion("fivtrasize not between", value1, value2, "fivtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraIsNull() {
            addCriterion("falltabmodbra is null");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraIsNotNull() {
            addCriterion("falltabmodbra is not null");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraEqualTo(String value) {
            addCriterion("falltabmodbra =", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraNotEqualTo(String value) {
            addCriterion("falltabmodbra <>", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraGreaterThan(String value) {
            addCriterion("falltabmodbra >", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraGreaterThanOrEqualTo(String value) {
            addCriterion("falltabmodbra >=", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraLessThan(String value) {
            addCriterion("falltabmodbra <", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraLessThanOrEqualTo(String value) {
            addCriterion("falltabmodbra <=", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraLike(String value) {
            addCriterion("falltabmodbra like", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraNotLike(String value) {
            addCriterion("falltabmodbra not like", value, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraIn(List<String> values) {
            addCriterion("falltabmodbra in", values, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraNotIn(List<String> values) {
            addCriterion("falltabmodbra not in", values, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraBetween(String value1, String value2) {
            addCriterion("falltabmodbra between", value1, value2, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabmodbraNotBetween(String value1, String value2) {
            addCriterion("falltabmodbra not between", value1, value2, "falltabmodbra");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeIsNull() {
            addCriterion("falltabchaspe is null");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeIsNotNull() {
            addCriterion("falltabchaspe is not null");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeEqualTo(String value) {
            addCriterion("falltabchaspe =", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeNotEqualTo(String value) {
            addCriterion("falltabchaspe <>", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeGreaterThan(String value) {
            addCriterion("falltabchaspe >", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeGreaterThanOrEqualTo(String value) {
            addCriterion("falltabchaspe >=", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeLessThan(String value) {
            addCriterion("falltabchaspe <", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeLessThanOrEqualTo(String value) {
            addCriterion("falltabchaspe <=", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeLike(String value) {
            addCriterion("falltabchaspe like", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeNotLike(String value) {
            addCriterion("falltabchaspe not like", value, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeIn(List<String> values) {
            addCriterion("falltabchaspe in", values, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeNotIn(List<String> values) {
            addCriterion("falltabchaspe not in", values, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeBetween(String value1, String value2) {
            addCriterion("falltabchaspe between", value1, value2, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabchaspeNotBetween(String value1, String value2) {
            addCriterion("falltabchaspe not between", value1, value2, "falltabchaspe");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeIsNull() {
            addCriterion("falltabtrasize is null");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeIsNotNull() {
            addCriterion("falltabtrasize is not null");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeEqualTo(String value) {
            addCriterion("falltabtrasize =", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeNotEqualTo(String value) {
            addCriterion("falltabtrasize <>", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeGreaterThan(String value) {
            addCriterion("falltabtrasize >", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeGreaterThanOrEqualTo(String value) {
            addCriterion("falltabtrasize >=", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeLessThan(String value) {
            addCriterion("falltabtrasize <", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeLessThanOrEqualTo(String value) {
            addCriterion("falltabtrasize <=", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeLike(String value) {
            addCriterion("falltabtrasize like", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeNotLike(String value) {
            addCriterion("falltabtrasize not like", value, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeIn(List<String> values) {
            addCriterion("falltabtrasize in", values, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeNotIn(List<String> values) {
            addCriterion("falltabtrasize not in", values, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeBetween(String value1, String value2) {
            addCriterion("falltabtrasize between", value1, value2, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andFalltabtrasizeNotBetween(String value1, String value2) {
            addCriterion("falltabtrasize not between", value1, value2, "falltabtrasize");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraIsNull() {
            addCriterion("tardropmodbra is null");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraIsNotNull() {
            addCriterion("tardropmodbra is not null");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraEqualTo(String value) {
            addCriterion("tardropmodbra =", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraNotEqualTo(String value) {
            addCriterion("tardropmodbra <>", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraGreaterThan(String value) {
            addCriterion("tardropmodbra >", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraGreaterThanOrEqualTo(String value) {
            addCriterion("tardropmodbra >=", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraLessThan(String value) {
            addCriterion("tardropmodbra <", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraLessThanOrEqualTo(String value) {
            addCriterion("tardropmodbra <=", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraLike(String value) {
            addCriterion("tardropmodbra like", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraNotLike(String value) {
            addCriterion("tardropmodbra not like", value, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraIn(List<String> values) {
            addCriterion("tardropmodbra in", values, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraNotIn(List<String> values) {
            addCriterion("tardropmodbra not in", values, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraBetween(String value1, String value2) {
            addCriterion("tardropmodbra between", value1, value2, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropmodbraNotBetween(String value1, String value2) {
            addCriterion("tardropmodbra not between", value1, value2, "tardropmodbra");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeIsNull() {
            addCriterion("tardropchaspe is null");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeIsNotNull() {
            addCriterion("tardropchaspe is not null");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeEqualTo(String value) {
            addCriterion("tardropchaspe =", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeNotEqualTo(String value) {
            addCriterion("tardropchaspe <>", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeGreaterThan(String value) {
            addCriterion("tardropchaspe >", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeGreaterThanOrEqualTo(String value) {
            addCriterion("tardropchaspe >=", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeLessThan(String value) {
            addCriterion("tardropchaspe <", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeLessThanOrEqualTo(String value) {
            addCriterion("tardropchaspe <=", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeLike(String value) {
            addCriterion("tardropchaspe like", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeNotLike(String value) {
            addCriterion("tardropchaspe not like", value, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeIn(List<String> values) {
            addCriterion("tardropchaspe in", values, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeNotIn(List<String> values) {
            addCriterion("tardropchaspe not in", values, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeBetween(String value1, String value2) {
            addCriterion("tardropchaspe between", value1, value2, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardropchaspeNotBetween(String value1, String value2) {
            addCriterion("tardropchaspe not between", value1, value2, "tardropchaspe");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeIsNull() {
            addCriterion("tardroptrasize is null");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeIsNotNull() {
            addCriterion("tardroptrasize is not null");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeEqualTo(String value) {
            addCriterion("tardroptrasize =", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeNotEqualTo(String value) {
            addCriterion("tardroptrasize <>", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeGreaterThan(String value) {
            addCriterion("tardroptrasize >", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeGreaterThanOrEqualTo(String value) {
            addCriterion("tardroptrasize >=", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeLessThan(String value) {
            addCriterion("tardroptrasize <", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeLessThanOrEqualTo(String value) {
            addCriterion("tardroptrasize <=", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeLike(String value) {
            addCriterion("tardroptrasize like", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeNotLike(String value) {
            addCriterion("tardroptrasize not like", value, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeIn(List<String> values) {
            addCriterion("tardroptrasize in", values, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeNotIn(List<String> values) {
            addCriterion("tardroptrasize not in", values, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeBetween(String value1, String value2) {
            addCriterion("tardroptrasize between", value1, value2, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTardroptrasizeNotBetween(String value1, String value2) {
            addCriterion("tardroptrasize not between", value1, value2, "tardroptrasize");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightIsNull() {
            addCriterion("tarmaxweight is null");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightIsNotNull() {
            addCriterion("tarmaxweight is not null");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightEqualTo(String value) {
            addCriterion("tarmaxweight =", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightNotEqualTo(String value) {
            addCriterion("tarmaxweight <>", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightGreaterThan(String value) {
            addCriterion("tarmaxweight >", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightGreaterThanOrEqualTo(String value) {
            addCriterion("tarmaxweight >=", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightLessThan(String value) {
            addCriterion("tarmaxweight <", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightLessThanOrEqualTo(String value) {
            addCriterion("tarmaxweight <=", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightLike(String value) {
            addCriterion("tarmaxweight like", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightNotLike(String value) {
            addCriterion("tarmaxweight not like", value, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightIn(List<String> values) {
            addCriterion("tarmaxweight in", values, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightNotIn(List<String> values) {
            addCriterion("tarmaxweight not in", values, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightBetween(String value1, String value2) {
            addCriterion("tarmaxweight between", value1, value2, "tarmaxweight");
            return (Criteria) this;
        }

        public Criteria andTarmaxweightNotBetween(String value1, String value2) {
            addCriterion("tarmaxweight not between", value1, value2, "tarmaxweight");
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
     * nms_trability
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_trability 2016-07-13
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