package com.taotao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EasygokrxxExample {
    /**
     * easygokrxx
     */
    protected String orderByClause;

    /**
     * easygokrxx
     */
    protected boolean distinct;

    /**
     * easygokrxx
     */
    protected List<Criteria> oredCriteria;

    public EasygokrxxExample() {
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
     * easygokrxx 2016-07-11
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

        public Criteria andKrxxidIsNull() {
            addCriterion("krxxid is null");
            return (Criteria) this;
        }

        public Criteria andKrxxidIsNotNull() {
            addCriterion("krxxid is not null");
            return (Criteria) this;
        }

        public Criteria andKrxxidEqualTo(Long value) {
            addCriterion("krxxid =", value, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidNotEqualTo(Long value) {
            addCriterion("krxxid <>", value, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidGreaterThan(Long value) {
            addCriterion("krxxid >", value, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidGreaterThanOrEqualTo(Long value) {
            addCriterion("krxxid >=", value, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidLessThan(Long value) {
            addCriterion("krxxid <", value, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidLessThanOrEqualTo(Long value) {
            addCriterion("krxxid <=", value, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidIn(List<Long> values) {
            addCriterion("krxxid in", values, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidNotIn(List<Long> values) {
            addCriterion("krxxid not in", values, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidBetween(Long value1, Long value2) {
            addCriterion("krxxid between", value1, value2, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxxidNotBetween(Long value1, Long value2) {
            addCriterion("krxxid not between", value1, value2, "krxxid");
            return (Criteria) this;
        }

        public Criteria andKrxmIsNull() {
            addCriterion("krxm is null");
            return (Criteria) this;
        }

        public Criteria andKrxmIsNotNull() {
            addCriterion("krxm is not null");
            return (Criteria) this;
        }

        public Criteria andKrxmEqualTo(String value) {
            addCriterion("krxm =", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmNotEqualTo(String value) {
            addCriterion("krxm <>", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmGreaterThan(String value) {
            addCriterion("krxm >", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmGreaterThanOrEqualTo(String value) {
            addCriterion("krxm >=", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmLessThan(String value) {
            addCriterion("krxm <", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmLessThanOrEqualTo(String value) {
            addCriterion("krxm <=", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmLike(String value) {
            addCriterion("krxm like", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmNotLike(String value) {
            addCriterion("krxm not like", value, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmIn(List<String> values) {
            addCriterion("krxm in", values, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmNotIn(List<String> values) {
            addCriterion("krxm not in", values, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmBetween(String value1, String value2) {
            addCriterion("krxm between", value1, value2, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrxmNotBetween(String value1, String value2) {
            addCriterion("krxm not between", value1, value2, "krxm");
            return (Criteria) this;
        }

        public Criteria andKrcwIsNull() {
            addCriterion("krcw is null");
            return (Criteria) this;
        }

        public Criteria andKrcwIsNotNull() {
            addCriterion("krcw is not null");
            return (Criteria) this;
        }

        public Criteria andKrcwEqualTo(Byte value) {
            addCriterion("krcw =", value, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwNotEqualTo(Byte value) {
            addCriterion("krcw <>", value, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwGreaterThan(Byte value) {
            addCriterion("krcw >", value, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwGreaterThanOrEqualTo(Byte value) {
            addCriterion("krcw >=", value, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwLessThan(Byte value) {
            addCriterion("krcw <", value, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwLessThanOrEqualTo(Byte value) {
            addCriterion("krcw <=", value, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwIn(List<Byte> values) {
            addCriterion("krcw in", values, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwNotIn(List<Byte> values) {
            addCriterion("krcw not in", values, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwBetween(Byte value1, Byte value2) {
            addCriterion("krcw between", value1, value2, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrcwNotBetween(Byte value1, Byte value2) {
            addCriterion("krcw not between", value1, value2, "krcw");
            return (Criteria) this;
        }

        public Criteria andKrsstdIsNull() {
            addCriterion("krsstd is null");
            return (Criteria) this;
        }

        public Criteria andKrsstdIsNotNull() {
            addCriterion("krsstd is not null");
            return (Criteria) this;
        }

        public Criteria andKrsstdEqualTo(String value) {
            addCriterion("krsstd =", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdNotEqualTo(String value) {
            addCriterion("krsstd <>", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdGreaterThan(String value) {
            addCriterion("krsstd >", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdGreaterThanOrEqualTo(String value) {
            addCriterion("krsstd >=", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdLessThan(String value) {
            addCriterion("krsstd <", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdLessThanOrEqualTo(String value) {
            addCriterion("krsstd <=", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdLike(String value) {
            addCriterion("krsstd like", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdNotLike(String value) {
            addCriterion("krsstd not like", value, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdIn(List<String> values) {
            addCriterion("krsstd in", values, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdNotIn(List<String> values) {
            addCriterion("krsstd not in", values, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdBetween(String value1, String value2) {
            addCriterion("krsstd between", value1, value2, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrsstdNotBetween(String value1, String value2) {
            addCriterion("krsstd not between", value1, value2, "krsstd");
            return (Criteria) this;
        }

        public Criteria andKrldhmIsNull() {
            addCriterion("krldhm is null");
            return (Criteria) this;
        }

        public Criteria andKrldhmIsNotNull() {
            addCriterion("krldhm is not null");
            return (Criteria) this;
        }

        public Criteria andKrldhmEqualTo(String value) {
            addCriterion("krldhm =", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmNotEqualTo(String value) {
            addCriterion("krldhm <>", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmGreaterThan(String value) {
            addCriterion("krldhm >", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmGreaterThanOrEqualTo(String value) {
            addCriterion("krldhm >=", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmLessThan(String value) {
            addCriterion("krldhm <", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmLessThanOrEqualTo(String value) {
            addCriterion("krldhm <=", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmLike(String value) {
            addCriterion("krldhm like", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmNotLike(String value) {
            addCriterion("krldhm not like", value, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmIn(List<String> values) {
            addCriterion("krldhm in", values, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmNotIn(List<String> values) {
            addCriterion("krldhm not in", values, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmBetween(String value1, String value2) {
            addCriterion("krldhm between", value1, value2, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrldhmNotBetween(String value1, String value2) {
            addCriterion("krldhm not between", value1, value2, "krldhm");
            return (Criteria) this;
        }

        public Criteria andKrjbIsNull() {
            addCriterion("krjb is null");
            return (Criteria) this;
        }

        public Criteria andKrjbIsNotNull() {
            addCriterion("krjb is not null");
            return (Criteria) this;
        }

        public Criteria andKrjbEqualTo(Byte value) {
            addCriterion("krjb =", value, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbNotEqualTo(Byte value) {
            addCriterion("krjb <>", value, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbGreaterThan(Byte value) {
            addCriterion("krjb >", value, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbGreaterThanOrEqualTo(Byte value) {
            addCriterion("krjb >=", value, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbLessThan(Byte value) {
            addCriterion("krjb <", value, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbLessThanOrEqualTo(Byte value) {
            addCriterion("krjb <=", value, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbIn(List<Byte> values) {
            addCriterion("krjb in", values, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbNotIn(List<Byte> values) {
            addCriterion("krjb not in", values, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbBetween(Byte value1, Byte value2) {
            addCriterion("krjb between", value1, value2, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjbNotBetween(Byte value1, Byte value2) {
            addCriterion("krjb not between", value1, value2, "krjb");
            return (Criteria) this;
        }

        public Criteria andKrjzdIsNull() {
            addCriterion("krjzd is null");
            return (Criteria) this;
        }

        public Criteria andKrjzdIsNotNull() {
            addCriterion("krjzd is not null");
            return (Criteria) this;
        }

        public Criteria andKrjzdEqualTo(String value) {
            addCriterion("krjzd =", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdNotEqualTo(String value) {
            addCriterion("krjzd <>", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdGreaterThan(String value) {
            addCriterion("krjzd >", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdGreaterThanOrEqualTo(String value) {
            addCriterion("krjzd >=", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdLessThan(String value) {
            addCriterion("krjzd <", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdLessThanOrEqualTo(String value) {
            addCriterion("krjzd <=", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdLike(String value) {
            addCriterion("krjzd like", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdNotLike(String value) {
            addCriterion("krjzd not like", value, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdIn(List<String> values) {
            addCriterion("krjzd in", values, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdNotIn(List<String> values) {
            addCriterion("krjzd not in", values, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdBetween(String value1, String value2) {
            addCriterion("krjzd between", value1, value2, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrjzdNotBetween(String value1, String value2) {
            addCriterion("krjzd not between", value1, value2, "krjzd");
            return (Criteria) this;
        }

        public Criteria andKrybIsNull() {
            addCriterion("kryb is null");
            return (Criteria) this;
        }

        public Criteria andKrybIsNotNull() {
            addCriterion("kryb is not null");
            return (Criteria) this;
        }

        public Criteria andKrybEqualTo(String value) {
            addCriterion("kryb =", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybNotEqualTo(String value) {
            addCriterion("kryb <>", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybGreaterThan(String value) {
            addCriterion("kryb >", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybGreaterThanOrEqualTo(String value) {
            addCriterion("kryb >=", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybLessThan(String value) {
            addCriterion("kryb <", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybLessThanOrEqualTo(String value) {
            addCriterion("kryb <=", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybLike(String value) {
            addCriterion("kryb like", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybNotLike(String value) {
            addCriterion("kryb not like", value, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybIn(List<String> values) {
            addCriterion("kryb in", values, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybNotIn(List<String> values) {
            addCriterion("kryb not in", values, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybBetween(String value1, String value2) {
            addCriterion("kryb between", value1, value2, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrybNotBetween(String value1, String value2) {
            addCriterion("kryb not between", value1, value2, "kryb");
            return (Criteria) this;
        }

        public Criteria andKrbdhIsNull() {
            addCriterion("krbdh is null");
            return (Criteria) this;
        }

        public Criteria andKrbdhIsNotNull() {
            addCriterion("krbdh is not null");
            return (Criteria) this;
        }

        public Criteria andKrbdhEqualTo(String value) {
            addCriterion("krbdh =", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhNotEqualTo(String value) {
            addCriterion("krbdh <>", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhGreaterThan(String value) {
            addCriterion("krbdh >", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhGreaterThanOrEqualTo(String value) {
            addCriterion("krbdh >=", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhLessThan(String value) {
            addCriterion("krbdh <", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhLessThanOrEqualTo(String value) {
            addCriterion("krbdh <=", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhLike(String value) {
            addCriterion("krbdh like", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhNotLike(String value) {
            addCriterion("krbdh not like", value, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhIn(List<String> values) {
            addCriterion("krbdh in", values, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhNotIn(List<String> values) {
            addCriterion("krbdh not in", values, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhBetween(String value1, String value2) {
            addCriterion("krbdh between", value1, value2, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrbdhNotBetween(String value1, String value2) {
            addCriterion("krbdh not between", value1, value2, "krbdh");
            return (Criteria) this;
        }

        public Criteria andKrkhIsNull() {
            addCriterion("krkh is null");
            return (Criteria) this;
        }

        public Criteria andKrkhIsNotNull() {
            addCriterion("krkh is not null");
            return (Criteria) this;
        }

        public Criteria andKrkhEqualTo(String value) {
            addCriterion("krkh =", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhNotEqualTo(String value) {
            addCriterion("krkh <>", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhGreaterThan(String value) {
            addCriterion("krkh >", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhGreaterThanOrEqualTo(String value) {
            addCriterion("krkh >=", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhLessThan(String value) {
            addCriterion("krkh <", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhLessThanOrEqualTo(String value) {
            addCriterion("krkh <=", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhLike(String value) {
            addCriterion("krkh like", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhNotLike(String value) {
            addCriterion("krkh not like", value, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhIn(List<String> values) {
            addCriterion("krkh in", values, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhNotIn(List<String> values) {
            addCriterion("krkh not in", values, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhBetween(String value1, String value2) {
            addCriterion("krkh between", value1, value2, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrkhNotBetween(String value1, String value2) {
            addCriterion("krkh not between", value1, value2, "krkh");
            return (Criteria) this;
        }

        public Criteria andKrgxrqIsNull() {
            addCriterion("krgxrq is null");
            return (Criteria) this;
        }

        public Criteria andKrgxrqIsNotNull() {
            addCriterion("krgxrq is not null");
            return (Criteria) this;
        }

        public Criteria andKrgxrqEqualTo(Date value) {
            addCriterion("krgxrq =", value, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqNotEqualTo(Date value) {
            addCriterion("krgxrq <>", value, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqGreaterThan(Date value) {
            addCriterion("krgxrq >", value, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("krgxrq >=", value, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqLessThan(Date value) {
            addCriterion("krgxrq <", value, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqLessThanOrEqualTo(Date value) {
            addCriterion("krgxrq <=", value, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqIn(List<Date> values) {
            addCriterion("krgxrq in", values, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqNotIn(List<Date> values) {
            addCriterion("krgxrq not in", values, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqBetween(Date value1, Date value2) {
            addCriterion("krgxrq between", value1, value2, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrgxrqNotBetween(Date value1, Date value2) {
            addCriterion("krgxrq not between", value1, value2, "krgxrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqIsNull() {
            addCriterion("krkkrq is null");
            return (Criteria) this;
        }

        public Criteria andKrkkrqIsNotNull() {
            addCriterion("krkkrq is not null");
            return (Criteria) this;
        }

        public Criteria andKrkkrqEqualTo(Date value) {
            addCriterion("krkkrq =", value, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqNotEqualTo(Date value) {
            addCriterion("krkkrq <>", value, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqGreaterThan(Date value) {
            addCriterion("krkkrq >", value, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqGreaterThanOrEqualTo(Date value) {
            addCriterion("krkkrq >=", value, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqLessThan(Date value) {
            addCriterion("krkkrq <", value, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqLessThanOrEqualTo(Date value) {
            addCriterion("krkkrq <=", value, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqIn(List<Date> values) {
            addCriterion("krkkrq in", values, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqNotIn(List<Date> values) {
            addCriterion("krkkrq not in", values, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqBetween(Date value1, Date value2) {
            addCriterion("krkkrq between", value1, value2, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrkkrqNotBetween(Date value1, Date value2) {
            addCriterion("krkkrq not between", value1, value2, "krkkrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqIsNull() {
            addCriterion("krfwsxrq is null");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqIsNotNull() {
            addCriterion("krfwsxrq is not null");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqEqualTo(Date value) {
            addCriterion("krfwsxrq =", value, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqNotEqualTo(Date value) {
            addCriterion("krfwsxrq <>", value, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqGreaterThan(Date value) {
            addCriterion("krfwsxrq >", value, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("krfwsxrq >=", value, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqLessThan(Date value) {
            addCriterion("krfwsxrq <", value, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqLessThanOrEqualTo(Date value) {
            addCriterion("krfwsxrq <=", value, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqIn(List<Date> values) {
            addCriterion("krfwsxrq in", values, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqNotIn(List<Date> values) {
            addCriterion("krfwsxrq not in", values, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqBetween(Date value1, Date value2) {
            addCriterion("krfwsxrq between", value1, value2, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwsxrqNotBetween(Date value1, Date value2) {
            addCriterion("krfwsxrq not between", value1, value2, "krfwsxrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqIsNull() {
            addCriterion("krfwjzrq is null");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqIsNotNull() {
            addCriterion("krfwjzrq is not null");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqEqualTo(Date value) {
            addCriterion("krfwjzrq =", value, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqNotEqualTo(Date value) {
            addCriterion("krfwjzrq <>", value, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqGreaterThan(Date value) {
            addCriterion("krfwjzrq >", value, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("krfwjzrq >=", value, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqLessThan(Date value) {
            addCriterion("krfwjzrq <", value, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqLessThanOrEqualTo(Date value) {
            addCriterion("krfwjzrq <=", value, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqIn(List<Date> values) {
            addCriterion("krfwjzrq in", values, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqNotIn(List<Date> values) {
            addCriterion("krfwjzrq not in", values, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqBetween(Date value1, Date value2) {
            addCriterion("krfwjzrq between", value1, value2, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwjzrqNotBetween(Date value1, Date value2) {
            addCriterion("krfwjzrq not between", value1, value2, "krfwjzrq");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzIsNull() {
            addCriterion("krfwxxbz is null");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzIsNotNull() {
            addCriterion("krfwxxbz is not null");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzEqualTo(String value) {
            addCriterion("krfwxxbz =", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzNotEqualTo(String value) {
            addCriterion("krfwxxbz <>", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzGreaterThan(String value) {
            addCriterion("krfwxxbz >", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzGreaterThanOrEqualTo(String value) {
            addCriterion("krfwxxbz >=", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzLessThan(String value) {
            addCriterion("krfwxxbz <", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzLessThanOrEqualTo(String value) {
            addCriterion("krfwxxbz <=", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzLike(String value) {
            addCriterion("krfwxxbz like", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzNotLike(String value) {
            addCriterion("krfwxxbz not like", value, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzIn(List<String> values) {
            addCriterion("krfwxxbz in", values, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzNotIn(List<String> values) {
            addCriterion("krfwxxbz not in", values, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzBetween(String value1, String value2) {
            addCriterion("krfwxxbz between", value1, value2, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrfwxxbzNotBetween(String value1, String value2) {
            addCriterion("krfwxxbz not between", value1, value2, "krfwxxbz");
            return (Criteria) this;
        }

        public Criteria andKrcjridIsNull() {
            addCriterion("krcjrid is null");
            return (Criteria) this;
        }

        public Criteria andKrcjridIsNotNull() {
            addCriterion("krcjrid is not null");
            return (Criteria) this;
        }

        public Criteria andKrcjridEqualTo(Long value) {
            addCriterion("krcjrid =", value, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridNotEqualTo(Long value) {
            addCriterion("krcjrid <>", value, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridGreaterThan(Long value) {
            addCriterion("krcjrid >", value, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridGreaterThanOrEqualTo(Long value) {
            addCriterion("krcjrid >=", value, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridLessThan(Long value) {
            addCriterion("krcjrid <", value, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridLessThanOrEqualTo(Long value) {
            addCriterion("krcjrid <=", value, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridIn(List<Long> values) {
            addCriterion("krcjrid in", values, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridNotIn(List<Long> values) {
            addCriterion("krcjrid not in", values, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridBetween(Long value1, Long value2) {
            addCriterion("krcjrid between", value1, value2, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjridNotBetween(Long value1, Long value2) {
            addCriterion("krcjrid not between", value1, value2, "krcjrid");
            return (Criteria) this;
        }

        public Criteria andKrcjsjIsNull() {
            addCriterion("krcjsj is null");
            return (Criteria) this;
        }

        public Criteria andKrcjsjIsNotNull() {
            addCriterion("krcjsj is not null");
            return (Criteria) this;
        }

        public Criteria andKrcjsjEqualTo(Date value) {
            addCriterion("krcjsj =", value, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjNotEqualTo(Date value) {
            addCriterion("krcjsj <>", value, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjGreaterThan(Date value) {
            addCriterion("krcjsj >", value, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("krcjsj >=", value, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjLessThan(Date value) {
            addCriterion("krcjsj <", value, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjLessThanOrEqualTo(Date value) {
            addCriterion("krcjsj <=", value, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjIn(List<Date> values) {
            addCriterion("krcjsj in", values, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjNotIn(List<Date> values) {
            addCriterion("krcjsj not in", values, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjBetween(Date value1, Date value2) {
            addCriterion("krcjsj between", value1, value2, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrcjsjNotBetween(Date value1, Date value2) {
            addCriterion("krcjsj not between", value1, value2, "krcjsj");
            return (Criteria) this;
        }

        public Criteria andKrxgridIsNull() {
            addCriterion("krxgrid is null");
            return (Criteria) this;
        }

        public Criteria andKrxgridIsNotNull() {
            addCriterion("krxgrid is not null");
            return (Criteria) this;
        }

        public Criteria andKrxgridEqualTo(Long value) {
            addCriterion("krxgrid =", value, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridNotEqualTo(Long value) {
            addCriterion("krxgrid <>", value, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridGreaterThan(Long value) {
            addCriterion("krxgrid >", value, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridGreaterThanOrEqualTo(Long value) {
            addCriterion("krxgrid >=", value, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridLessThan(Long value) {
            addCriterion("krxgrid <", value, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridLessThanOrEqualTo(Long value) {
            addCriterion("krxgrid <=", value, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridIn(List<Long> values) {
            addCriterion("krxgrid in", values, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridNotIn(List<Long> values) {
            addCriterion("krxgrid not in", values, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridBetween(Long value1, Long value2) {
            addCriterion("krxgrid between", value1, value2, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgridNotBetween(Long value1, Long value2) {
            addCriterion("krxgrid not between", value1, value2, "krxgrid");
            return (Criteria) this;
        }

        public Criteria andKrxgsjIsNull() {
            addCriterion("krxgsj is null");
            return (Criteria) this;
        }

        public Criteria andKrxgsjIsNotNull() {
            addCriterion("krxgsj is not null");
            return (Criteria) this;
        }

        public Criteria andKrxgsjEqualTo(Date value) {
            addCriterion("krxgsj =", value, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjNotEqualTo(Date value) {
            addCriterion("krxgsj <>", value, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjGreaterThan(Date value) {
            addCriterion("krxgsj >", value, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("krxgsj >=", value, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjLessThan(Date value) {
            addCriterion("krxgsj <", value, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjLessThanOrEqualTo(Date value) {
            addCriterion("krxgsj <=", value, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjIn(List<Date> values) {
            addCriterion("krxgsj in", values, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjNotIn(List<Date> values) {
            addCriterion("krxgsj not in", values, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjBetween(Date value1, Date value2) {
            addCriterion("krxgsj between", value1, value2, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrxgsjNotBetween(Date value1, Date value2) {
            addCriterion("krxgsj not between", value1, value2, "krxgsj");
            return (Criteria) this;
        }

        public Criteria andKrgjIsNull() {
            addCriterion("krgj is null");
            return (Criteria) this;
        }

        public Criteria andKrgjIsNotNull() {
            addCriterion("krgj is not null");
            return (Criteria) this;
        }

        public Criteria andKrgjEqualTo(String value) {
            addCriterion("krgj =", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjNotEqualTo(String value) {
            addCriterion("krgj <>", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjGreaterThan(String value) {
            addCriterion("krgj >", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjGreaterThanOrEqualTo(String value) {
            addCriterion("krgj >=", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjLessThan(String value) {
            addCriterion("krgj <", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjLessThanOrEqualTo(String value) {
            addCriterion("krgj <=", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjLike(String value) {
            addCriterion("krgj like", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjNotLike(String value) {
            addCriterion("krgj not like", value, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjIn(List<String> values) {
            addCriterion("krgj in", values, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjNotIn(List<String> values) {
            addCriterion("krgj not in", values, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjBetween(String value1, String value2) {
            addCriterion("krgj between", value1, value2, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrgjNotBetween(String value1, String value2) {
            addCriterion("krgj not between", value1, value2, "krgj");
            return (Criteria) this;
        }

        public Criteria andKrzjlxIsNull() {
            addCriterion("krzjlx is null");
            return (Criteria) this;
        }

        public Criteria andKrzjlxIsNotNull() {
            addCriterion("krzjlx is not null");
            return (Criteria) this;
        }

        public Criteria andKrzjlxEqualTo(String value) {
            addCriterion("krzjlx =", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxNotEqualTo(String value) {
            addCriterion("krzjlx <>", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxGreaterThan(String value) {
            addCriterion("krzjlx >", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxGreaterThanOrEqualTo(String value) {
            addCriterion("krzjlx >=", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxLessThan(String value) {
            addCriterion("krzjlx <", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxLessThanOrEqualTo(String value) {
            addCriterion("krzjlx <=", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxLike(String value) {
            addCriterion("krzjlx like", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxNotLike(String value) {
            addCriterion("krzjlx not like", value, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxIn(List<String> values) {
            addCriterion("krzjlx in", values, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxNotIn(List<String> values) {
            addCriterion("krzjlx not in", values, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxBetween(String value1, String value2) {
            addCriterion("krzjlx between", value1, value2, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrzjlxNotBetween(String value1, String value2) {
            addCriterion("krzjlx not between", value1, value2, "krzjlx");
            return (Criteria) this;
        }

        public Criteria andKrcsrqIsNull() {
            addCriterion("krcsrq is null");
            return (Criteria) this;
        }

        public Criteria andKrcsrqIsNotNull() {
            addCriterion("krcsrq is not null");
            return (Criteria) this;
        }

        public Criteria andKrcsrqEqualTo(Date value) {
            addCriterion("krcsrq =", value, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqNotEqualTo(Date value) {
            addCriterion("krcsrq <>", value, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqGreaterThan(Date value) {
            addCriterion("krcsrq >", value, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("krcsrq >=", value, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqLessThan(Date value) {
            addCriterion("krcsrq <", value, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqLessThanOrEqualTo(Date value) {
            addCriterion("krcsrq <=", value, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqIn(List<Date> values) {
            addCriterion("krcsrq in", values, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqNotIn(List<Date> values) {
            addCriterion("krcsrq not in", values, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqBetween(Date value1, Date value2) {
            addCriterion("krcsrq between", value1, value2, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrcsrqNotBetween(Date value1, Date value2) {
            addCriterion("krcsrq not between", value1, value2, "krcsrq");
            return (Criteria) this;
        }

        public Criteria andKrzylbIsNull() {
            addCriterion("krzylb is null");
            return (Criteria) this;
        }

        public Criteria andKrzylbIsNotNull() {
            addCriterion("krzylb is not null");
            return (Criteria) this;
        }

        public Criteria andKrzylbEqualTo(String value) {
            addCriterion("krzylb =", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbNotEqualTo(String value) {
            addCriterion("krzylb <>", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbGreaterThan(String value) {
            addCriterion("krzylb >", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbGreaterThanOrEqualTo(String value) {
            addCriterion("krzylb >=", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbLessThan(String value) {
            addCriterion("krzylb <", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbLessThanOrEqualTo(String value) {
            addCriterion("krzylb <=", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbLike(String value) {
            addCriterion("krzylb like", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbNotLike(String value) {
            addCriterion("krzylb not like", value, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbIn(List<String> values) {
            addCriterion("krzylb in", values, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbNotIn(List<String> values) {
            addCriterion("krzylb not in", values, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbBetween(String value1, String value2) {
            addCriterion("krzylb between", value1, value2, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrzylbNotBetween(String value1, String value2) {
            addCriterion("krzylb not between", value1, value2, "krzylb");
            return (Criteria) this;
        }

        public Criteria andKrsfIsNull() {
            addCriterion("krsf is null");
            return (Criteria) this;
        }

        public Criteria andKrsfIsNotNull() {
            addCriterion("krsf is not null");
            return (Criteria) this;
        }

        public Criteria andKrsfEqualTo(String value) {
            addCriterion("krsf =", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfNotEqualTo(String value) {
            addCriterion("krsf <>", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfGreaterThan(String value) {
            addCriterion("krsf >", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfGreaterThanOrEqualTo(String value) {
            addCriterion("krsf >=", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfLessThan(String value) {
            addCriterion("krsf <", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfLessThanOrEqualTo(String value) {
            addCriterion("krsf <=", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfLike(String value) {
            addCriterion("krsf like", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfNotLike(String value) {
            addCriterion("krsf not like", value, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfIn(List<String> values) {
            addCriterion("krsf in", values, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfNotIn(List<String> values) {
            addCriterion("krsf not in", values, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfBetween(String value1, String value2) {
            addCriterion("krsf between", value1, value2, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrsfNotBetween(String value1, String value2) {
            addCriterion("krsf not between", value1, value2, "krsf");
            return (Criteria) this;
        }

        public Criteria andKrcsIsNull() {
            addCriterion("krcs is null");
            return (Criteria) this;
        }

        public Criteria andKrcsIsNotNull() {
            addCriterion("krcs is not null");
            return (Criteria) this;
        }

        public Criteria andKrcsEqualTo(String value) {
            addCriterion("krcs =", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsNotEqualTo(String value) {
            addCriterion("krcs <>", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsGreaterThan(String value) {
            addCriterion("krcs >", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsGreaterThanOrEqualTo(String value) {
            addCriterion("krcs >=", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsLessThan(String value) {
            addCriterion("krcs <", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsLessThanOrEqualTo(String value) {
            addCriterion("krcs <=", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsLike(String value) {
            addCriterion("krcs like", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsNotLike(String value) {
            addCriterion("krcs not like", value, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsIn(List<String> values) {
            addCriterion("krcs in", values, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsNotIn(List<String> values) {
            addCriterion("krcs not in", values, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsBetween(String value1, String value2) {
            addCriterion("krcs between", value1, value2, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrcsNotBetween(String value1, String value2) {
            addCriterion("krcs not between", value1, value2, "krcs");
            return (Criteria) this;
        }

        public Criteria andKrlxrIsNull() {
            addCriterion("krlxr is null");
            return (Criteria) this;
        }

        public Criteria andKrlxrIsNotNull() {
            addCriterion("krlxr is not null");
            return (Criteria) this;
        }

        public Criteria andKrlxrEqualTo(String value) {
            addCriterion("krlxr =", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrNotEqualTo(String value) {
            addCriterion("krlxr <>", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrGreaterThan(String value) {
            addCriterion("krlxr >", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrGreaterThanOrEqualTo(String value) {
            addCriterion("krlxr >=", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrLessThan(String value) {
            addCriterion("krlxr <", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrLessThanOrEqualTo(String value) {
            addCriterion("krlxr <=", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrLike(String value) {
            addCriterion("krlxr like", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrNotLike(String value) {
            addCriterion("krlxr not like", value, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrIn(List<String> values) {
            addCriterion("krlxr in", values, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrNotIn(List<String> values) {
            addCriterion("krlxr not in", values, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrBetween(String value1, String value2) {
            addCriterion("krlxr between", value1, value2, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxrNotBetween(String value1, String value2) {
            addCriterion("krlxr not between", value1, value2, "krlxr");
            return (Criteria) this;
        }

        public Criteria andKrlxdhIsNull() {
            addCriterion("krlxdh is null");
            return (Criteria) this;
        }

        public Criteria andKrlxdhIsNotNull() {
            addCriterion("krlxdh is not null");
            return (Criteria) this;
        }

        public Criteria andKrlxdhEqualTo(String value) {
            addCriterion("krlxdh =", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhNotEqualTo(String value) {
            addCriterion("krlxdh <>", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhGreaterThan(String value) {
            addCriterion("krlxdh >", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhGreaterThanOrEqualTo(String value) {
            addCriterion("krlxdh >=", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhLessThan(String value) {
            addCriterion("krlxdh <", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhLessThanOrEqualTo(String value) {
            addCriterion("krlxdh <=", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhLike(String value) {
            addCriterion("krlxdh like", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhNotLike(String value) {
            addCriterion("krlxdh not like", value, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhIn(List<String> values) {
            addCriterion("krlxdh in", values, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhNotIn(List<String> values) {
            addCriterion("krlxdh not in", values, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhBetween(String value1, String value2) {
            addCriterion("krlxdh between", value1, value2, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrlxdhNotBetween(String value1, String value2) {
            addCriterion("krlxdh not between", value1, value2, "krlxdh");
            return (Criteria) this;
        }

        public Criteria andKrssdwIsNull() {
            addCriterion("krssdw is null");
            return (Criteria) this;
        }

        public Criteria andKrssdwIsNotNull() {
            addCriterion("krssdw is not null");
            return (Criteria) this;
        }

        public Criteria andKrssdwEqualTo(String value) {
            addCriterion("krssdw =", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwNotEqualTo(String value) {
            addCriterion("krssdw <>", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwGreaterThan(String value) {
            addCriterion("krssdw >", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwGreaterThanOrEqualTo(String value) {
            addCriterion("krssdw >=", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwLessThan(String value) {
            addCriterion("krssdw <", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwLessThanOrEqualTo(String value) {
            addCriterion("krssdw <=", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwLike(String value) {
            addCriterion("krssdw like", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwNotLike(String value) {
            addCriterion("krssdw not like", value, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwIn(List<String> values) {
            addCriterion("krssdw in", values, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwNotIn(List<String> values) {
            addCriterion("krssdw not in", values, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwBetween(String value1, String value2) {
            addCriterion("krssdw between", value1, value2, "krssdw");
            return (Criteria) this;
        }

        public Criteria andKrssdwNotBetween(String value1, String value2) {
            addCriterion("krssdw not between", value1, value2, "krssdw");
            return (Criteria) this;
        }

        public Criteria andClcjhIsNull() {
            addCriterion("clcjh is null");
            return (Criteria) this;
        }

        public Criteria andClcjhIsNotNull() {
            addCriterion("clcjh is not null");
            return (Criteria) this;
        }

        public Criteria andClcjhEqualTo(String value) {
            addCriterion("clcjh =", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhNotEqualTo(String value) {
            addCriterion("clcjh <>", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhGreaterThan(String value) {
            addCriterion("clcjh >", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhGreaterThanOrEqualTo(String value) {
            addCriterion("clcjh >=", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhLessThan(String value) {
            addCriterion("clcjh <", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhLessThanOrEqualTo(String value) {
            addCriterion("clcjh <=", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhLike(String value) {
            addCriterion("clcjh like", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhNotLike(String value) {
            addCriterion("clcjh not like", value, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhIn(List<String> values) {
            addCriterion("clcjh in", values, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhNotIn(List<String> values) {
            addCriterion("clcjh not in", values, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhBetween(String value1, String value2) {
            addCriterion("clcjh between", value1, value2, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcjhNotBetween(String value1, String value2) {
            addCriterion("clcjh not between", value1, value2, "clcjh");
            return (Criteria) this;
        }

        public Criteria andClcphIsNull() {
            addCriterion("clcph is null");
            return (Criteria) this;
        }

        public Criteria andClcphIsNotNull() {
            addCriterion("clcph is not null");
            return (Criteria) this;
        }

        public Criteria andClcphEqualTo(String value) {
            addCriterion("clcph =", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphNotEqualTo(String value) {
            addCriterion("clcph <>", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphGreaterThan(String value) {
            addCriterion("clcph >", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphGreaterThanOrEqualTo(String value) {
            addCriterion("clcph >=", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphLessThan(String value) {
            addCriterion("clcph <", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphLessThanOrEqualTo(String value) {
            addCriterion("clcph <=", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphLike(String value) {
            addCriterion("clcph like", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphNotLike(String value) {
            addCriterion("clcph not like", value, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphIn(List<String> values) {
            addCriterion("clcph in", values, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphNotIn(List<String> values) {
            addCriterion("clcph not in", values, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphBetween(String value1, String value2) {
            addCriterion("clcph between", value1, value2, "clcph");
            return (Criteria) this;
        }

        public Criteria andClcphNotBetween(String value1, String value2) {
            addCriterion("clcph not between", value1, value2, "clcph");
            return (Criteria) this;
        }

        public Criteria andClclysIsNull() {
            addCriterion("clclys is null");
            return (Criteria) this;
        }

        public Criteria andClclysIsNotNull() {
            addCriterion("clclys is not null");
            return (Criteria) this;
        }

        public Criteria andClclysEqualTo(String value) {
            addCriterion("clclys =", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysNotEqualTo(String value) {
            addCriterion("clclys <>", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysGreaterThan(String value) {
            addCriterion("clclys >", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysGreaterThanOrEqualTo(String value) {
            addCriterion("clclys >=", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysLessThan(String value) {
            addCriterion("clclys <", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysLessThanOrEqualTo(String value) {
            addCriterion("clclys <=", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysLike(String value) {
            addCriterion("clclys like", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysNotLike(String value) {
            addCriterion("clclys not like", value, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysIn(List<String> values) {
            addCriterion("clclys in", values, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysNotIn(List<String> values) {
            addCriterion("clclys not in", values, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysBetween(String value1, String value2) {
            addCriterion("clclys between", value1, value2, "clclys");
            return (Criteria) this;
        }

        public Criteria andClclysNotBetween(String value1, String value2) {
            addCriterion("clclys not between", value1, value2, "clclys");
            return (Criteria) this;
        }

        public Criteria andClppIsNull() {
            addCriterion("clpp is null");
            return (Criteria) this;
        }

        public Criteria andClppIsNotNull() {
            addCriterion("clpp is not null");
            return (Criteria) this;
        }

        public Criteria andClppEqualTo(String value) {
            addCriterion("clpp =", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotEqualTo(String value) {
            addCriterion("clpp <>", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppGreaterThan(String value) {
            addCriterion("clpp >", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppGreaterThanOrEqualTo(String value) {
            addCriterion("clpp >=", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppLessThan(String value) {
            addCriterion("clpp <", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppLessThanOrEqualTo(String value) {
            addCriterion("clpp <=", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppLike(String value) {
            addCriterion("clpp like", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotLike(String value) {
            addCriterion("clpp not like", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppIn(List<String> values) {
            addCriterion("clpp in", values, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotIn(List<String> values) {
            addCriterion("clpp not in", values, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppBetween(String value1, String value2) {
            addCriterion("clpp between", value1, value2, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotBetween(String value1, String value2) {
            addCriterion("clpp not between", value1, value2, "clpp");
            return (Criteria) this;
        }

        public Criteria andClcxIsNull() {
            addCriterion("clcx is null");
            return (Criteria) this;
        }

        public Criteria andClcxIsNotNull() {
            addCriterion("clcx is not null");
            return (Criteria) this;
        }

        public Criteria andClcxEqualTo(String value) {
            addCriterion("clcx =", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxNotEqualTo(String value) {
            addCriterion("clcx <>", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxGreaterThan(String value) {
            addCriterion("clcx >", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxGreaterThanOrEqualTo(String value) {
            addCriterion("clcx >=", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxLessThan(String value) {
            addCriterion("clcx <", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxLessThanOrEqualTo(String value) {
            addCriterion("clcx <=", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxLike(String value) {
            addCriterion("clcx like", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxNotLike(String value) {
            addCriterion("clcx not like", value, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxIn(List<String> values) {
            addCriterion("clcx in", values, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxNotIn(List<String> values) {
            addCriterion("clcx not in", values, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxBetween(String value1, String value2) {
            addCriterion("clcx between", value1, value2, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxNotBetween(String value1, String value2) {
            addCriterion("clcx not between", value1, value2, "clcx");
            return (Criteria) this;
        }

        public Criteria andClcxlIsNull() {
            addCriterion("clcxl is null");
            return (Criteria) this;
        }

        public Criteria andClcxlIsNotNull() {
            addCriterion("clcxl is not null");
            return (Criteria) this;
        }

        public Criteria andClcxlEqualTo(String value) {
            addCriterion("clcxl =", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlNotEqualTo(String value) {
            addCriterion("clcxl <>", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlGreaterThan(String value) {
            addCriterion("clcxl >", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlGreaterThanOrEqualTo(String value) {
            addCriterion("clcxl >=", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlLessThan(String value) {
            addCriterion("clcxl <", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlLessThanOrEqualTo(String value) {
            addCriterion("clcxl <=", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlLike(String value) {
            addCriterion("clcxl like", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlNotLike(String value) {
            addCriterion("clcxl not like", value, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlIn(List<String> values) {
            addCriterion("clcxl in", values, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlNotIn(List<String> values) {
            addCriterion("clcxl not in", values, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlBetween(String value1, String value2) {
            addCriterion("clcxl between", value1, value2, "clcxl");
            return (Criteria) this;
        }

        public Criteria andClcxlNotBetween(String value1, String value2) {
            addCriterion("clcxl not between", value1, value2, "clcxl");
            return (Criteria) this;
        }

        public Criteria andCldllxIsNull() {
            addCriterion("cldllx is null");
            return (Criteria) this;
        }

        public Criteria andCldllxIsNotNull() {
            addCriterion("cldllx is not null");
            return (Criteria) this;
        }

        public Criteria andCldllxEqualTo(Byte value) {
            addCriterion("cldllx =", value, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxNotEqualTo(Byte value) {
            addCriterion("cldllx <>", value, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxGreaterThan(Byte value) {
            addCriterion("cldllx >", value, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxGreaterThanOrEqualTo(Byte value) {
            addCriterion("cldllx >=", value, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxLessThan(Byte value) {
            addCriterion("cldllx <", value, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxLessThanOrEqualTo(Byte value) {
            addCriterion("cldllx <=", value, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxIn(List<Byte> values) {
            addCriterion("cldllx in", values, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxNotIn(List<Byte> values) {
            addCriterion("cldllx not in", values, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxBetween(Byte value1, Byte value2) {
            addCriterion("cldllx between", value1, value2, "cldllx");
            return (Criteria) this;
        }

        public Criteria andCldllxNotBetween(Byte value1, Byte value2) {
            addCriterion("cldllx not between", value1, value2, "cldllx");
            return (Criteria) this;
        }

        public Criteria andClqdfsIsNull() {
            addCriterion("clqdfs is null");
            return (Criteria) this;
        }

        public Criteria andClqdfsIsNotNull() {
            addCriterion("clqdfs is not null");
            return (Criteria) this;
        }

        public Criteria andClqdfsEqualTo(Byte value) {
            addCriterion("clqdfs =", value, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsNotEqualTo(Byte value) {
            addCriterion("clqdfs <>", value, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsGreaterThan(Byte value) {
            addCriterion("clqdfs >", value, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsGreaterThanOrEqualTo(Byte value) {
            addCriterion("clqdfs >=", value, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsLessThan(Byte value) {
            addCriterion("clqdfs <", value, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsLessThanOrEqualTo(Byte value) {
            addCriterion("clqdfs <=", value, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsIn(List<Byte> values) {
            addCriterion("clqdfs in", values, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsNotIn(List<Byte> values) {
            addCriterion("clqdfs not in", values, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsBetween(Byte value1, Byte value2) {
            addCriterion("clqdfs between", value1, value2, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClqdfsNotBetween(Byte value1, Byte value2) {
            addCriterion("clqdfs not between", value1, value2, "clqdfs");
            return (Criteria) this;
        }

        public Criteria andClxsglsIsNull() {
            addCriterion("clxsgls is null");
            return (Criteria) this;
        }

        public Criteria andClxsglsIsNotNull() {
            addCriterion("clxsgls is not null");
            return (Criteria) this;
        }

        public Criteria andClxsglsEqualTo(String value) {
            addCriterion("clxsgls =", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsNotEqualTo(String value) {
            addCriterion("clxsgls <>", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsGreaterThan(String value) {
            addCriterion("clxsgls >", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsGreaterThanOrEqualTo(String value) {
            addCriterion("clxsgls >=", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsLessThan(String value) {
            addCriterion("clxsgls <", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsLessThanOrEqualTo(String value) {
            addCriterion("clxsgls <=", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsLike(String value) {
            addCriterion("clxsgls like", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsNotLike(String value) {
            addCriterion("clxsgls not like", value, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsIn(List<String> values) {
            addCriterion("clxsgls in", values, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsNotIn(List<String> values) {
            addCriterion("clxsgls not in", values, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsBetween(String value1, String value2) {
            addCriterion("clxsgls between", value1, value2, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClxsglsNotBetween(String value1, String value2) {
            addCriterion("clxsgls not between", value1, value2, "clxsgls");
            return (Criteria) this;
        }

        public Criteria andClgmrqIsNull() {
            addCriterion("clgmrq is null");
            return (Criteria) this;
        }

        public Criteria andClgmrqIsNotNull() {
            addCriterion("clgmrq is not null");
            return (Criteria) this;
        }

        public Criteria andClgmrqEqualTo(Date value) {
            addCriterion("clgmrq =", value, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqNotEqualTo(Date value) {
            addCriterion("clgmrq <>", value, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqGreaterThan(Date value) {
            addCriterion("clgmrq >", value, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqGreaterThanOrEqualTo(Date value) {
            addCriterion("clgmrq >=", value, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqLessThan(Date value) {
            addCriterion("clgmrq <", value, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqLessThanOrEqualTo(Date value) {
            addCriterion("clgmrq <=", value, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqIn(List<Date> values) {
            addCriterion("clgmrq in", values, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqNotIn(List<Date> values) {
            addCriterion("clgmrq not in", values, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqBetween(Date value1, Date value2) {
            addCriterion("clgmrq between", value1, value2, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmrqNotBetween(Date value1, Date value2) {
            addCriterion("clgmrq not between", value1, value2, "clgmrq");
            return (Criteria) this;
        }

        public Criteria andClgmjxsIsNull() {
            addCriterion("clgmjxs is null");
            return (Criteria) this;
        }

        public Criteria andClgmjxsIsNotNull() {
            addCriterion("clgmjxs is not null");
            return (Criteria) this;
        }

        public Criteria andClgmjxsEqualTo(String value) {
            addCriterion("clgmjxs =", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsNotEqualTo(String value) {
            addCriterion("clgmjxs <>", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsGreaterThan(String value) {
            addCriterion("clgmjxs >", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsGreaterThanOrEqualTo(String value) {
            addCriterion("clgmjxs >=", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsLessThan(String value) {
            addCriterion("clgmjxs <", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsLessThanOrEqualTo(String value) {
            addCriterion("clgmjxs <=", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsLike(String value) {
            addCriterion("clgmjxs like", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsNotLike(String value) {
            addCriterion("clgmjxs not like", value, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsIn(List<String> values) {
            addCriterion("clgmjxs in", values, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsNotIn(List<String> values) {
            addCriterion("clgmjxs not in", values, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsBetween(String value1, String value2) {
            addCriterion("clgmjxs between", value1, value2, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClgmjxsNotBetween(String value1, String value2) {
            addCriterion("clgmjxs not between", value1, value2, "clgmjxs");
            return (Criteria) this;
        }

        public Criteria andClxxbzIsNull() {
            addCriterion("clxxbz is null");
            return (Criteria) this;
        }

        public Criteria andClxxbzIsNotNull() {
            addCriterion("clxxbz is not null");
            return (Criteria) this;
        }

        public Criteria andClxxbzEqualTo(String value) {
            addCriterion("clxxbz =", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzNotEqualTo(String value) {
            addCriterion("clxxbz <>", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzGreaterThan(String value) {
            addCriterion("clxxbz >", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzGreaterThanOrEqualTo(String value) {
            addCriterion("clxxbz >=", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzLessThan(String value) {
            addCriterion("clxxbz <", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzLessThanOrEqualTo(String value) {
            addCriterion("clxxbz <=", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzLike(String value) {
            addCriterion("clxxbz like", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzNotLike(String value) {
            addCriterion("clxxbz not like", value, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzIn(List<String> values) {
            addCriterion("clxxbz in", values, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzNotIn(List<String> values) {
            addCriterion("clxxbz not in", values, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzBetween(String value1, String value2) {
            addCriterion("clxxbz between", value1, value2, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxxbzNotBetween(String value1, String value2) {
            addCriterion("clxxbz not between", value1, value2, "clxxbz");
            return (Criteria) this;
        }

        public Criteria andClxgridIsNull() {
            addCriterion("clxgrid is null");
            return (Criteria) this;
        }

        public Criteria andClxgridIsNotNull() {
            addCriterion("clxgrid is not null");
            return (Criteria) this;
        }

        public Criteria andClxgridEqualTo(Long value) {
            addCriterion("clxgrid =", value, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridNotEqualTo(Long value) {
            addCriterion("clxgrid <>", value, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridGreaterThan(Long value) {
            addCriterion("clxgrid >", value, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridGreaterThanOrEqualTo(Long value) {
            addCriterion("clxgrid >=", value, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridLessThan(Long value) {
            addCriterion("clxgrid <", value, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridLessThanOrEqualTo(Long value) {
            addCriterion("clxgrid <=", value, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridIn(List<Long> values) {
            addCriterion("clxgrid in", values, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridNotIn(List<Long> values) {
            addCriterion("clxgrid not in", values, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridBetween(Long value1, Long value2) {
            addCriterion("clxgrid between", value1, value2, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgridNotBetween(Long value1, Long value2) {
            addCriterion("clxgrid not between", value1, value2, "clxgrid");
            return (Criteria) this;
        }

        public Criteria andClxgsjIsNull() {
            addCriterion("clxgsj is null");
            return (Criteria) this;
        }

        public Criteria andClxgsjIsNotNull() {
            addCriterion("clxgsj is not null");
            return (Criteria) this;
        }

        public Criteria andClxgsjEqualTo(Date value) {
            addCriterion("clxgsj =", value, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjNotEqualTo(Date value) {
            addCriterion("clxgsj <>", value, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjGreaterThan(Date value) {
            addCriterion("clxgsj >", value, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("clxgsj >=", value, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjLessThan(Date value) {
            addCriterion("clxgsj <", value, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjLessThanOrEqualTo(Date value) {
            addCriterion("clxgsj <=", value, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjIn(List<Date> values) {
            addCriterion("clxgsj in", values, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjNotIn(List<Date> values) {
            addCriterion("clxgsj not in", values, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjBetween(Date value1, Date value2) {
            addCriterion("clxgsj between", value1, value2, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClxgsjNotBetween(Date value1, Date value2) {
            addCriterion("clxgsj not between", value1, value2, "clxgsj");
            return (Criteria) this;
        }

        public Criteria andClszcsIsNull() {
            addCriterion("clszcs is null");
            return (Criteria) this;
        }

        public Criteria andClszcsIsNotNull() {
            addCriterion("clszcs is not null");
            return (Criteria) this;
        }

        public Criteria andClszcsEqualTo(String value) {
            addCriterion("clszcs =", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotEqualTo(String value) {
            addCriterion("clszcs <>", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsGreaterThan(String value) {
            addCriterion("clszcs >", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsGreaterThanOrEqualTo(String value) {
            addCriterion("clszcs >=", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsLessThan(String value) {
            addCriterion("clszcs <", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsLessThanOrEqualTo(String value) {
            addCriterion("clszcs <=", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsLike(String value) {
            addCriterion("clszcs like", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotLike(String value) {
            addCriterion("clszcs not like", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsIn(List<String> values) {
            addCriterion("clszcs in", values, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotIn(List<String> values) {
            addCriterion("clszcs not in", values, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsBetween(String value1, String value2) {
            addCriterion("clszcs between", value1, value2, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotBetween(String value1, String value2) {
            addCriterion("clszcs not between", value1, value2, "clszcs");
            return (Criteria) this;
        }

        public Criteria andSfzxxIsNull() {
            addCriterion("sfzxx is null");
            return (Criteria) this;
        }

        public Criteria andSfzxxIsNotNull() {
            addCriterion("sfzxx is not null");
            return (Criteria) this;
        }

        public Criteria andSfzxxEqualTo(String value) {
            addCriterion("sfzxx =", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxNotEqualTo(String value) {
            addCriterion("sfzxx <>", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxGreaterThan(String value) {
            addCriterion("sfzxx >", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxGreaterThanOrEqualTo(String value) {
            addCriterion("sfzxx >=", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxLessThan(String value) {
            addCriterion("sfzxx <", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxLessThanOrEqualTo(String value) {
            addCriterion("sfzxx <=", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxLike(String value) {
            addCriterion("sfzxx like", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxNotLike(String value) {
            addCriterion("sfzxx not like", value, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxIn(List<String> values) {
            addCriterion("sfzxx in", values, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxNotIn(List<String> values) {
            addCriterion("sfzxx not in", values, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxBetween(String value1, String value2) {
            addCriterion("sfzxx between", value1, value2, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andSfzxxNotBetween(String value1, String value2) {
            addCriterion("sfzxx not between", value1, value2, "sfzxx");
            return (Criteria) this;
        }

        public Criteria andTxxxIsNull() {
            addCriterion("txxx is null");
            return (Criteria) this;
        }

        public Criteria andTxxxIsNotNull() {
            addCriterion("txxx is not null");
            return (Criteria) this;
        }

        public Criteria andTxxxEqualTo(String value) {
            addCriterion("txxx =", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxNotEqualTo(String value) {
            addCriterion("txxx <>", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxGreaterThan(String value) {
            addCriterion("txxx >", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxGreaterThanOrEqualTo(String value) {
            addCriterion("txxx >=", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxLessThan(String value) {
            addCriterion("txxx <", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxLessThanOrEqualTo(String value) {
            addCriterion("txxx <=", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxLike(String value) {
            addCriterion("txxx like", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxNotLike(String value) {
            addCriterion("txxx not like", value, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxIn(List<String> values) {
            addCriterion("txxx in", values, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxNotIn(List<String> values) {
            addCriterion("txxx not in", values, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxBetween(String value1, String value2) {
            addCriterion("txxx between", value1, value2, "txxx");
            return (Criteria) this;
        }

        public Criteria andTxxxNotBetween(String value1, String value2) {
            addCriterion("txxx not between", value1, value2, "txxx");
            return (Criteria) this;
        }

        public Criteria andDrivephotoIsNull() {
            addCriterion("drivePhoto is null");
            return (Criteria) this;
        }

        public Criteria andDrivephotoIsNotNull() {
            addCriterion("drivePhoto is not null");
            return (Criteria) this;
        }

        public Criteria andDrivephotoEqualTo(String value) {
            addCriterion("drivePhoto =", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoNotEqualTo(String value) {
            addCriterion("drivePhoto <>", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoGreaterThan(String value) {
            addCriterion("drivePhoto >", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoGreaterThanOrEqualTo(String value) {
            addCriterion("drivePhoto >=", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoLessThan(String value) {
            addCriterion("drivePhoto <", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoLessThanOrEqualTo(String value) {
            addCriterion("drivePhoto <=", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoLike(String value) {
            addCriterion("drivePhoto like", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoNotLike(String value) {
            addCriterion("drivePhoto not like", value, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoIn(List<String> values) {
            addCriterion("drivePhoto in", values, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoNotIn(List<String> values) {
            addCriterion("drivePhoto not in", values, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoBetween(String value1, String value2) {
            addCriterion("drivePhoto between", value1, value2, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andDrivephotoNotBetween(String value1, String value2) {
            addCriterion("drivePhoto not between", value1, value2, "drivephoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoIsNull() {
            addCriterion("runPhoto is null");
            return (Criteria) this;
        }

        public Criteria andRunphotoIsNotNull() {
            addCriterion("runPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andRunphotoEqualTo(String value) {
            addCriterion("runPhoto =", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoNotEqualTo(String value) {
            addCriterion("runPhoto <>", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoGreaterThan(String value) {
            addCriterion("runPhoto >", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoGreaterThanOrEqualTo(String value) {
            addCriterion("runPhoto >=", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoLessThan(String value) {
            addCriterion("runPhoto <", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoLessThanOrEqualTo(String value) {
            addCriterion("runPhoto <=", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoLike(String value) {
            addCriterion("runPhoto like", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoNotLike(String value) {
            addCriterion("runPhoto not like", value, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoIn(List<String> values) {
            addCriterion("runPhoto in", values, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoNotIn(List<String> values) {
            addCriterion("runPhoto not in", values, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoBetween(String value1, String value2) {
            addCriterion("runPhoto between", value1, value2, "runphoto");
            return (Criteria) this;
        }

        public Criteria andRunphotoNotBetween(String value1, String value2) {
            addCriterion("runPhoto not between", value1, value2, "runphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoIsNull() {
            addCriterion("carPhoto is null");
            return (Criteria) this;
        }

        public Criteria andCarphotoIsNotNull() {
            addCriterion("carPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andCarphotoEqualTo(String value) {
            addCriterion("carPhoto =", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotEqualTo(String value) {
            addCriterion("carPhoto <>", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoGreaterThan(String value) {
            addCriterion("carPhoto >", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoGreaterThanOrEqualTo(String value) {
            addCriterion("carPhoto >=", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLessThan(String value) {
            addCriterion("carPhoto <", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLessThanOrEqualTo(String value) {
            addCriterion("carPhoto <=", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLike(String value) {
            addCriterion("carPhoto like", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotLike(String value) {
            addCriterion("carPhoto not like", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoIn(List<String> values) {
            addCriterion("carPhoto in", values, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotIn(List<String> values) {
            addCriterion("carPhoto not in", values, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoBetween(String value1, String value2) {
            addCriterion("carPhoto between", value1, value2, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotBetween(String value1, String value2) {
            addCriterion("carPhoto not between", value1, value2, "carphoto");
            return (Criteria) this;
        }

        public Criteria andIsappIsNull() {
            addCriterion("isapp is null");
            return (Criteria) this;
        }

        public Criteria andIsappIsNotNull() {
            addCriterion("isapp is not null");
            return (Criteria) this;
        }

        public Criteria andIsappEqualTo(Byte value) {
            addCriterion("isapp =", value, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappNotEqualTo(Byte value) {
            addCriterion("isapp <>", value, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappGreaterThan(Byte value) {
            addCriterion("isapp >", value, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappGreaterThanOrEqualTo(Byte value) {
            addCriterion("isapp >=", value, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappLessThan(Byte value) {
            addCriterion("isapp <", value, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappLessThanOrEqualTo(Byte value) {
            addCriterion("isapp <=", value, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappIn(List<Byte> values) {
            addCriterion("isapp in", values, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappNotIn(List<Byte> values) {
            addCriterion("isapp not in", values, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappBetween(Byte value1, Byte value2) {
            addCriterion("isapp between", value1, value2, "isapp");
            return (Criteria) this;
        }

        public Criteria andIsappNotBetween(Byte value1, Byte value2) {
            addCriterion("isapp not between", value1, value2, "isapp");
            return (Criteria) this;
        }

        public Criteria andZclyIsNull() {
            addCriterion("zcly is null");
            return (Criteria) this;
        }

        public Criteria andZclyIsNotNull() {
            addCriterion("zcly is not null");
            return (Criteria) this;
        }

        public Criteria andZclyEqualTo(Byte value) {
            addCriterion("zcly =", value, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyNotEqualTo(Byte value) {
            addCriterion("zcly <>", value, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyGreaterThan(Byte value) {
            addCriterion("zcly >", value, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyGreaterThanOrEqualTo(Byte value) {
            addCriterion("zcly >=", value, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyLessThan(Byte value) {
            addCriterion("zcly <", value, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyLessThanOrEqualTo(Byte value) {
            addCriterion("zcly <=", value, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyIn(List<Byte> values) {
            addCriterion("zcly in", values, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyNotIn(List<Byte> values) {
            addCriterion("zcly not in", values, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyBetween(Byte value1, Byte value2) {
            addCriterion("zcly between", value1, value2, "zcly");
            return (Criteria) this;
        }

        public Criteria andZclyNotBetween(Byte value1, Byte value2) {
            addCriterion("zcly not between", value1, value2, "zcly");
            return (Criteria) this;
        }

        public Criteria andScsrflagIsNull() {
            addCriterion("scsrFlag is null");
            return (Criteria) this;
        }

        public Criteria andScsrflagIsNotNull() {
            addCriterion("scsrFlag is not null");
            return (Criteria) this;
        }

        public Criteria andScsrflagEqualTo(String value) {
            addCriterion("scsrFlag =", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagNotEqualTo(String value) {
            addCriterion("scsrFlag <>", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagGreaterThan(String value) {
            addCriterion("scsrFlag >", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagGreaterThanOrEqualTo(String value) {
            addCriterion("scsrFlag >=", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagLessThan(String value) {
            addCriterion("scsrFlag <", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagLessThanOrEqualTo(String value) {
            addCriterion("scsrFlag <=", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagLike(String value) {
            addCriterion("scsrFlag like", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagNotLike(String value) {
            addCriterion("scsrFlag not like", value, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagIn(List<String> values) {
            addCriterion("scsrFlag in", values, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagNotIn(List<String> values) {
            addCriterion("scsrFlag not in", values, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagBetween(String value1, String value2) {
            addCriterion("scsrFlag between", value1, value2, "scsrflag");
            return (Criteria) this;
        }

        public Criteria andScsrflagNotBetween(String value1, String value2) {
            addCriterion("scsrFlag not between", value1, value2, "scsrflag");
            return (Criteria) this;
        }
    }

    /**
     * easygokrxx
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * easygokrxx 2016-07-11
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