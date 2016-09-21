package com.aac.cos.entity.gga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EasygotdExample {
    /**
     * easygotd
     */
    protected String orderByClause;

    /**
     * easygotd
     */
    protected boolean distinct;

    /**
     * easygotd
     */
    protected List<Criteria> oredCriteria;

    public EasygotdExample() {
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
     * easygotd 2016-08-18
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTdbmIsNull() {
            addCriterion("tdbm is null");
            return (Criteria) this;
        }

        public Criteria andTdbmIsNotNull() {
            addCriterion("tdbm is not null");
            return (Criteria) this;
        }

        public Criteria andTdbmEqualTo(String value) {
            addCriterion("tdbm =", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmNotEqualTo(String value) {
            addCriterion("tdbm <>", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmGreaterThan(String value) {
            addCriterion("tdbm >", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmGreaterThanOrEqualTo(String value) {
            addCriterion("tdbm >=", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmLessThan(String value) {
            addCriterion("tdbm <", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmLessThanOrEqualTo(String value) {
            addCriterion("tdbm <=", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmLike(String value) {
            addCriterion("tdbm like", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmNotLike(String value) {
            addCriterion("tdbm not like", value, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmIn(List<String> values) {
            addCriterion("tdbm in", values, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmNotIn(List<String> values) {
            addCriterion("tdbm not in", values, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmBetween(String value1, String value2) {
            addCriterion("tdbm between", value1, value2, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdbmNotBetween(String value1, String value2) {
            addCriterion("tdbm not between", value1, value2, "tdbm");
            return (Criteria) this;
        }

        public Criteria andTdmcIsNull() {
            addCriterion("tdmc is null");
            return (Criteria) this;
        }

        public Criteria andTdmcIsNotNull() {
            addCriterion("tdmc is not null");
            return (Criteria) this;
        }

        public Criteria andTdmcEqualTo(String value) {
            addCriterion("tdmc =", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcNotEqualTo(String value) {
            addCriterion("tdmc <>", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcGreaterThan(String value) {
            addCriterion("tdmc >", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcGreaterThanOrEqualTo(String value) {
            addCriterion("tdmc >=", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcLessThan(String value) {
            addCriterion("tdmc <", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcLessThanOrEqualTo(String value) {
            addCriterion("tdmc <=", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcLike(String value) {
            addCriterion("tdmc like", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcNotLike(String value) {
            addCriterion("tdmc not like", value, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcIn(List<String> values) {
            addCriterion("tdmc in", values, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcNotIn(List<String> values) {
            addCriterion("tdmc not in", values, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcBetween(String value1, String value2) {
            addCriterion("tdmc between", value1, value2, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdmcNotBetween(String value1, String value2) {
            addCriterion("tdmc not between", value1, value2, "tdmc");
            return (Criteria) this;
        }

        public Criteria andTdlxbmIsNull() {
            addCriterion("tdlxbm is null");
            return (Criteria) this;
        }

        public Criteria andTdlxbmIsNotNull() {
            addCriterion("tdlxbm is not null");
            return (Criteria) this;
        }

        public Criteria andTdlxbmEqualTo(String value) {
            addCriterion("tdlxbm =", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmNotEqualTo(String value) {
            addCriterion("tdlxbm <>", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmGreaterThan(String value) {
            addCriterion("tdlxbm >", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmGreaterThanOrEqualTo(String value) {
            addCriterion("tdlxbm >=", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmLessThan(String value) {
            addCriterion("tdlxbm <", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmLessThanOrEqualTo(String value) {
            addCriterion("tdlxbm <=", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmLike(String value) {
            addCriterion("tdlxbm like", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmNotLike(String value) {
            addCriterion("tdlxbm not like", value, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmIn(List<String> values) {
            addCriterion("tdlxbm in", values, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmNotIn(List<String> values) {
            addCriterion("tdlxbm not in", values, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmBetween(String value1, String value2) {
            addCriterion("tdlxbm between", value1, value2, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxbmNotBetween(String value1, String value2) {
            addCriterion("tdlxbm not between", value1, value2, "tdlxbm");
            return (Criteria) this;
        }

        public Criteria andTdlxmcIsNull() {
            addCriterion("tdlxmc is null");
            return (Criteria) this;
        }

        public Criteria andTdlxmcIsNotNull() {
            addCriterion("tdlxmc is not null");
            return (Criteria) this;
        }

        public Criteria andTdlxmcEqualTo(String value) {
            addCriterion("tdlxmc =", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcNotEqualTo(String value) {
            addCriterion("tdlxmc <>", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcGreaterThan(String value) {
            addCriterion("tdlxmc >", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcGreaterThanOrEqualTo(String value) {
            addCriterion("tdlxmc >=", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcLessThan(String value) {
            addCriterion("tdlxmc <", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcLessThanOrEqualTo(String value) {
            addCriterion("tdlxmc <=", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcLike(String value) {
            addCriterion("tdlxmc like", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcNotLike(String value) {
            addCriterion("tdlxmc not like", value, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcIn(List<String> values) {
            addCriterion("tdlxmc in", values, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcNotIn(List<String> values) {
            addCriterion("tdlxmc not in", values, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcBetween(String value1, String value2) {
            addCriterion("tdlxmc between", value1, value2, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdlxmcNotBetween(String value1, String value2) {
            addCriterion("tdlxmc not between", value1, value2, "tdlxmc");
            return (Criteria) this;
        }

        public Criteria andTdqxIsNull() {
            addCriterion("tdqx is null");
            return (Criteria) this;
        }

        public Criteria andTdqxIsNotNull() {
            addCriterion("tdqx is not null");
            return (Criteria) this;
        }

        public Criteria andTdqxEqualTo(String value) {
            addCriterion("tdqx =", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxNotEqualTo(String value) {
            addCriterion("tdqx <>", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxGreaterThan(String value) {
            addCriterion("tdqx >", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxGreaterThanOrEqualTo(String value) {
            addCriterion("tdqx >=", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxLessThan(String value) {
            addCriterion("tdqx <", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxLessThanOrEqualTo(String value) {
            addCriterion("tdqx <=", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxLike(String value) {
            addCriterion("tdqx like", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxNotLike(String value) {
            addCriterion("tdqx not like", value, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxIn(List<String> values) {
            addCriterion("tdqx in", values, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxNotIn(List<String> values) {
            addCriterion("tdqx not in", values, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxBetween(String value1, String value2) {
            addCriterion("tdqx between", value1, value2, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdqxNotBetween(String value1, String value2) {
            addCriterion("tdqx not between", value1, value2, "tdqx");
            return (Criteria) this;
        }

        public Criteria andTdxjsjIsNull() {
            addCriterion("tdxjsj is null");
            return (Criteria) this;
        }

        public Criteria andTdxjsjIsNotNull() {
            addCriterion("tdxjsj is not null");
            return (Criteria) this;
        }

        public Criteria andTdxjsjEqualTo(Date value) {
            addCriterion("tdxjsj =", value, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjNotEqualTo(Date value) {
            addCriterion("tdxjsj <>", value, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjGreaterThan(Date value) {
            addCriterion("tdxjsj >", value, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("tdxjsj >=", value, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjLessThan(Date value) {
            addCriterion("tdxjsj <", value, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjLessThanOrEqualTo(Date value) {
            addCriterion("tdxjsj <=", value, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjIn(List<Date> values) {
            addCriterion("tdxjsj in", values, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjNotIn(List<Date> values) {
            addCriterion("tdxjsj not in", values, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjBetween(Date value1, Date value2) {
            addCriterion("tdxjsj between", value1, value2, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxjsjNotBetween(Date value1, Date value2) {
            addCriterion("tdxjsj not between", value1, value2, "tdxjsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjIsNull() {
            addCriterion("tdxgsj is null");
            return (Criteria) this;
        }

        public Criteria andTdxgsjIsNotNull() {
            addCriterion("tdxgsj is not null");
            return (Criteria) this;
        }

        public Criteria andTdxgsjEqualTo(Date value) {
            addCriterion("tdxgsj =", value, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjNotEqualTo(Date value) {
            addCriterion("tdxgsj <>", value, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjGreaterThan(Date value) {
            addCriterion("tdxgsj >", value, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("tdxgsj >=", value, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjLessThan(Date value) {
            addCriterion("tdxgsj <", value, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjLessThanOrEqualTo(Date value) {
            addCriterion("tdxgsj <=", value, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjIn(List<Date> values) {
            addCriterion("tdxgsj in", values, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjNotIn(List<Date> values) {
            addCriterion("tdxgsj not in", values, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjBetween(Date value1, Date value2) {
            addCriterion("tdxgsj between", value1, value2, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdxgsjNotBetween(Date value1, Date value2) {
            addCriterion("tdxgsj not between", value1, value2, "tdxgsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjIsNull() {
            addCriterion("tdfwjzsj is null");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjIsNotNull() {
            addCriterion("tdfwjzsj is not null");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjEqualTo(Date value) {
            addCriterion("tdfwjzsj =", value, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjNotEqualTo(Date value) {
            addCriterion("tdfwjzsj <>", value, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjGreaterThan(Date value) {
            addCriterion("tdfwjzsj >", value, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("tdfwjzsj >=", value, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjLessThan(Date value) {
            addCriterion("tdfwjzsj <", value, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjLessThanOrEqualTo(Date value) {
            addCriterion("tdfwjzsj <=", value, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjIn(List<Date> values) {
            addCriterion("tdfwjzsj in", values, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjNotIn(List<Date> values) {
            addCriterion("tdfwjzsj not in", values, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjBetween(Date value1, Date value2) {
            addCriterion("tdfwjzsj between", value1, value2, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdfwjzsjNotBetween(Date value1, Date value2) {
            addCriterion("tdfwjzsj not between", value1, value2, "tdfwjzsj");
            return (Criteria) this;
        }

        public Criteria andTdnumberIsNull() {
            addCriterion("tdnumber is null");
            return (Criteria) this;
        }

        public Criteria andTdnumberIsNotNull() {
            addCriterion("tdnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTdnumberEqualTo(String value) {
            addCriterion("tdnumber =", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberNotEqualTo(String value) {
            addCriterion("tdnumber <>", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberGreaterThan(String value) {
            addCriterion("tdnumber >", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("tdnumber >=", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberLessThan(String value) {
            addCriterion("tdnumber <", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberLessThanOrEqualTo(String value) {
            addCriterion("tdnumber <=", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberLike(String value) {
            addCriterion("tdnumber like", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberNotLike(String value) {
            addCriterion("tdnumber not like", value, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberIn(List<String> values) {
            addCriterion("tdnumber in", values, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberNotIn(List<String> values) {
            addCriterion("tdnumber not in", values, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberBetween(String value1, String value2) {
            addCriterion("tdnumber between", value1, value2, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdnumberNotBetween(String value1, String value2) {
            addCriterion("tdnumber not between", value1, value2, "tdnumber");
            return (Criteria) this;
        }

        public Criteria andTdwhyIsNull() {
            addCriterion("tdwhy is null");
            return (Criteria) this;
        }

        public Criteria andTdwhyIsNotNull() {
            addCriterion("tdwhy is not null");
            return (Criteria) this;
        }

        public Criteria andTdwhyEqualTo(String value) {
            addCriterion("tdwhy =", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyNotEqualTo(String value) {
            addCriterion("tdwhy <>", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyGreaterThan(String value) {
            addCriterion("tdwhy >", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyGreaterThanOrEqualTo(String value) {
            addCriterion("tdwhy >=", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyLessThan(String value) {
            addCriterion("tdwhy <", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyLessThanOrEqualTo(String value) {
            addCriterion("tdwhy <=", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyLike(String value) {
            addCriterion("tdwhy like", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyNotLike(String value) {
            addCriterion("tdwhy not like", value, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyIn(List<String> values) {
            addCriterion("tdwhy in", values, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyNotIn(List<String> values) {
            addCriterion("tdwhy not in", values, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyBetween(String value1, String value2) {
            addCriterion("tdwhy between", value1, value2, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdwhyNotBetween(String value1, String value2) {
            addCriterion("tdwhy not between", value1, value2, "tdwhy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyIsNull() {
            addCriterion("tdtbzy is null");
            return (Criteria) this;
        }

        public Criteria andTdtbzyIsNotNull() {
            addCriterion("tdtbzy is not null");
            return (Criteria) this;
        }

        public Criteria andTdtbzyEqualTo(String value) {
            addCriterion("tdtbzy =", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyNotEqualTo(String value) {
            addCriterion("tdtbzy <>", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyGreaterThan(String value) {
            addCriterion("tdtbzy >", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyGreaterThanOrEqualTo(String value) {
            addCriterion("tdtbzy >=", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyLessThan(String value) {
            addCriterion("tdtbzy <", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyLessThanOrEqualTo(String value) {
            addCriterion("tdtbzy <=", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyLike(String value) {
            addCriterion("tdtbzy like", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyNotLike(String value) {
            addCriterion("tdtbzy not like", value, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyIn(List<String> values) {
            addCriterion("tdtbzy in", values, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyNotIn(List<String> values) {
            addCriterion("tdtbzy not in", values, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyBetween(String value1, String value2) {
            addCriterion("tdtbzy between", value1, value2, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdtbzyNotBetween(String value1, String value2) {
            addCriterion("tdtbzy not between", value1, value2, "tdtbzy");
            return (Criteria) this;
        }

        public Criteria andTdjddbIsNull() {
            addCriterion("tdjddb is null");
            return (Criteria) this;
        }

        public Criteria andTdjddbIsNotNull() {
            addCriterion("tdjddb is not null");
            return (Criteria) this;
        }

        public Criteria andTdjddbEqualTo(String value) {
            addCriterion("tdjddb =", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbNotEqualTo(String value) {
            addCriterion("tdjddb <>", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbGreaterThan(String value) {
            addCriterion("tdjddb >", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbGreaterThanOrEqualTo(String value) {
            addCriterion("tdjddb >=", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbLessThan(String value) {
            addCriterion("tdjddb <", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbLessThanOrEqualTo(String value) {
            addCriterion("tdjddb <=", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbLike(String value) {
            addCriterion("tdjddb like", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbNotLike(String value) {
            addCriterion("tdjddb not like", value, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbIn(List<String> values) {
            addCriterion("tdjddb in", values, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbNotIn(List<String> values) {
            addCriterion("tdjddb not in", values, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbBetween(String value1, String value2) {
            addCriterion("tdjddb between", value1, value2, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdjddbNotBetween(String value1, String value2) {
            addCriterion("tdjddb not between", value1, value2, "tdjddb");
            return (Criteria) this;
        }

        public Criteria andTdcxtjIsNull() {
            addCriterion("tdcxtj is null");
            return (Criteria) this;
        }

        public Criteria andTdcxtjIsNotNull() {
            addCriterion("tdcxtj is not null");
            return (Criteria) this;
        }

        public Criteria andTdcxtjEqualTo(String value) {
            addCriterion("tdcxtj =", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjNotEqualTo(String value) {
            addCriterion("tdcxtj <>", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjGreaterThan(String value) {
            addCriterion("tdcxtj >", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjGreaterThanOrEqualTo(String value) {
            addCriterion("tdcxtj >=", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjLessThan(String value) {
            addCriterion("tdcxtj <", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjLessThanOrEqualTo(String value) {
            addCriterion("tdcxtj <=", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjLike(String value) {
            addCriterion("tdcxtj like", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjNotLike(String value) {
            addCriterion("tdcxtj not like", value, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjIn(List<String> values) {
            addCriterion("tdcxtj in", values, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjNotIn(List<String> values) {
            addCriterion("tdcxtj not in", values, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjBetween(String value1, String value2) {
            addCriterion("tdcxtj between", value1, value2, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdcxtjNotBetween(String value1, String value2) {
            addCriterion("tdcxtj not between", value1, value2, "tdcxtj");
            return (Criteria) this;
        }

        public Criteria andTdpxhIsNull() {
            addCriterion("tdpxh is null");
            return (Criteria) this;
        }

        public Criteria andTdpxhIsNotNull() {
            addCriterion("tdpxh is not null");
            return (Criteria) this;
        }

        public Criteria andTdpxhEqualTo(String value) {
            addCriterion("tdpxh =", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhNotEqualTo(String value) {
            addCriterion("tdpxh <>", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhGreaterThan(String value) {
            addCriterion("tdpxh >", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhGreaterThanOrEqualTo(String value) {
            addCriterion("tdpxh >=", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhLessThan(String value) {
            addCriterion("tdpxh <", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhLessThanOrEqualTo(String value) {
            addCriterion("tdpxh <=", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhLike(String value) {
            addCriterion("tdpxh like", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhNotLike(String value) {
            addCriterion("tdpxh not like", value, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhIn(List<String> values) {
            addCriterion("tdpxh in", values, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhNotIn(List<String> values) {
            addCriterion("tdpxh not in", values, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhBetween(String value1, String value2) {
            addCriterion("tdpxh between", value1, value2, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdpxhNotBetween(String value1, String value2) {
            addCriterion("tdpxh not between", value1, value2, "tdpxh");
            return (Criteria) this;
        }

        public Criteria andTdhtbmIsNull() {
            addCriterion("tdhtbm is null");
            return (Criteria) this;
        }

        public Criteria andTdhtbmIsNotNull() {
            addCriterion("tdhtbm is not null");
            return (Criteria) this;
        }

        public Criteria andTdhtbmEqualTo(String value) {
            addCriterion("tdhtbm =", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmNotEqualTo(String value) {
            addCriterion("tdhtbm <>", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmGreaterThan(String value) {
            addCriterion("tdhtbm >", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmGreaterThanOrEqualTo(String value) {
            addCriterion("tdhtbm >=", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmLessThan(String value) {
            addCriterion("tdhtbm <", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmLessThanOrEqualTo(String value) {
            addCriterion("tdhtbm <=", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmLike(String value) {
            addCriterion("tdhtbm like", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmNotLike(String value) {
            addCriterion("tdhtbm not like", value, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmIn(List<String> values) {
            addCriterion("tdhtbm in", values, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmNotIn(List<String> values) {
            addCriterion("tdhtbm not in", values, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmBetween(String value1, String value2) {
            addCriterion("tdhtbm between", value1, value2, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtbmNotBetween(String value1, String value2) {
            addCriterion("tdhtbm not between", value1, value2, "tdhtbm");
            return (Criteria) this;
        }

        public Criteria andTdhtmcIsNull() {
            addCriterion("tdhtmc is null");
            return (Criteria) this;
        }

        public Criteria andTdhtmcIsNotNull() {
            addCriterion("tdhtmc is not null");
            return (Criteria) this;
        }

        public Criteria andTdhtmcEqualTo(String value) {
            addCriterion("tdhtmc =", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcNotEqualTo(String value) {
            addCriterion("tdhtmc <>", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcGreaterThan(String value) {
            addCriterion("tdhtmc >", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcGreaterThanOrEqualTo(String value) {
            addCriterion("tdhtmc >=", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcLessThan(String value) {
            addCriterion("tdhtmc <", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcLessThanOrEqualTo(String value) {
            addCriterion("tdhtmc <=", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcLike(String value) {
            addCriterion("tdhtmc like", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcNotLike(String value) {
            addCriterion("tdhtmc not like", value, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcIn(List<String> values) {
            addCriterion("tdhtmc in", values, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcNotIn(List<String> values) {
            addCriterion("tdhtmc not in", values, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcBetween(String value1, String value2) {
            addCriterion("tdhtmc between", value1, value2, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andTdhtmcNotBetween(String value1, String value2) {
            addCriterion("tdhtmc not between", value1, value2, "tdhtmc");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIsNull() {
            addCriterion("flow_code is null");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIsNotNull() {
            addCriterion("flow_code is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCodeEqualTo(Long value) {
            addCriterion("flow_code =", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotEqualTo(Long value) {
            addCriterion("flow_code <>", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeGreaterThan(Long value) {
            addCriterion("flow_code >", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("flow_code >=", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLessThan(Long value) {
            addCriterion("flow_code <", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLessThanOrEqualTo(Long value) {
            addCriterion("flow_code <=", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIn(List<Long> values) {
            addCriterion("flow_code in", values, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotIn(List<Long> values) {
            addCriterion("flow_code not in", values, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeBetween(Long value1, Long value2) {
            addCriterion("flow_code between", value1, value2, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotBetween(Long value1, Long value2) {
            addCriterion("flow_code not between", value1, value2, "flowCode");
            return (Criteria) this;
        }
    }

    /**
     * easygotd
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * easygotd 2016-08-18
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