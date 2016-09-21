package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NmsSerinfoExample {
    /**
     * nms_serinfo
     */
    protected String orderByClause;

    /**
     * nms_serinfo
     */
    protected boolean distinct;

    /**
     * nms_serinfo
     */
    protected List<Criteria> oredCriteria;

    public NmsSerinfoExample() {
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
     * nms_serinfo 2016-07-13
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSernameIsNull() {
            addCriterion("sername is null");
            return (Criteria) this;
        }

        public Criteria andSernameIsNotNull() {
            addCriterion("sername is not null");
            return (Criteria) this;
        }

        public Criteria andSernameEqualTo(String value) {
            addCriterion("sername =", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameNotEqualTo(String value) {
            addCriterion("sername <>", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameGreaterThan(String value) {
            addCriterion("sername >", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameGreaterThanOrEqualTo(String value) {
            addCriterion("sername >=", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameLessThan(String value) {
            addCriterion("sername <", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameLessThanOrEqualTo(String value) {
            addCriterion("sername <=", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameLike(String value) {
            addCriterion("sername like", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameNotLike(String value) {
            addCriterion("sername not like", value, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameIn(List<String> values) {
            addCriterion("sername in", values, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameNotIn(List<String> values) {
            addCriterion("sername not in", values, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameBetween(String value1, String value2) {
            addCriterion("sername between", value1, value2, "sername");
            return (Criteria) this;
        }

        public Criteria andSernameNotBetween(String value1, String value2) {
            addCriterion("sername not between", value1, value2, "sername");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Byte value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Byte value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Byte value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Byte value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Byte value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Byte value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Byte> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Byte> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Byte value1, Byte value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Byte value1, Byte value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andContractIsNull() {
            addCriterion("contract is null");
            return (Criteria) this;
        }

        public Criteria andContractIsNotNull() {
            addCriterion("contract is not null");
            return (Criteria) this;
        }

        public Criteria andContractEqualTo(String value) {
            addCriterion("contract =", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotEqualTo(String value) {
            addCriterion("contract <>", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThan(String value) {
            addCriterion("contract >", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThanOrEqualTo(String value) {
            addCriterion("contract >=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThan(String value) {
            addCriterion("contract <", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThanOrEqualTo(String value) {
            addCriterion("contract <=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLike(String value) {
            addCriterion("contract like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotLike(String value) {
            addCriterion("contract not like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractIn(List<String> values) {
            addCriterion("contract in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotIn(List<String> values) {
            addCriterion("contract not in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractBetween(String value1, String value2) {
            addCriterion("contract between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotBetween(String value1, String value2) {
            addCriterion("contract not between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andSerattrIsNull() {
            addCriterion("serAttr is null");
            return (Criteria) this;
        }

        public Criteria andSerattrIsNotNull() {
            addCriterion("serAttr is not null");
            return (Criteria) this;
        }

        public Criteria andSerattrEqualTo(String value) {
            addCriterion("serAttr =", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrNotEqualTo(String value) {
            addCriterion("serAttr <>", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrGreaterThan(String value) {
            addCriterion("serAttr >", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrGreaterThanOrEqualTo(String value) {
            addCriterion("serAttr >=", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrLessThan(String value) {
            addCriterion("serAttr <", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrLessThanOrEqualTo(String value) {
            addCriterion("serAttr <=", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrLike(String value) {
            addCriterion("serAttr like", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrNotLike(String value) {
            addCriterion("serAttr not like", value, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrIn(List<String> values) {
            addCriterion("serAttr in", values, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrNotIn(List<String> values) {
            addCriterion("serAttr not in", values, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrBetween(String value1, String value2) {
            addCriterion("serAttr between", value1, value2, "serattr");
            return (Criteria) this;
        }

        public Criteria andSerattrNotBetween(String value1, String value2) {
            addCriterion("serAttr not between", value1, value2, "serattr");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
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

        public Criteria andDetailaddrIsNull() {
            addCriterion("detailAddr is null");
            return (Criteria) this;
        }

        public Criteria andDetailaddrIsNotNull() {
            addCriterion("detailAddr is not null");
            return (Criteria) this;
        }

        public Criteria andDetailaddrEqualTo(String value) {
            addCriterion("detailAddr =", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotEqualTo(String value) {
            addCriterion("detailAddr <>", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrGreaterThan(String value) {
            addCriterion("detailAddr >", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrGreaterThanOrEqualTo(String value) {
            addCriterion("detailAddr >=", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrLessThan(String value) {
            addCriterion("detailAddr <", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrLessThanOrEqualTo(String value) {
            addCriterion("detailAddr <=", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrLike(String value) {
            addCriterion("detailAddr like", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotLike(String value) {
            addCriterion("detailAddr not like", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrIn(List<String> values) {
            addCriterion("detailAddr in", values, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotIn(List<String> values) {
            addCriterion("detailAddr not in", values, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrBetween(String value1, String value2) {
            addCriterion("detailAddr between", value1, value2, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotBetween(String value1, String value2) {
            addCriterion("detailAddr not between", value1, value2, "detailaddr");
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

        public Criteria andSermarksIsNull() {
            addCriterion("sermarks is null");
            return (Criteria) this;
        }

        public Criteria andSermarksIsNotNull() {
            addCriterion("sermarks is not null");
            return (Criteria) this;
        }

        public Criteria andSermarksEqualTo(String value) {
            addCriterion("sermarks =", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksNotEqualTo(String value) {
            addCriterion("sermarks <>", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksGreaterThan(String value) {
            addCriterion("sermarks >", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksGreaterThanOrEqualTo(String value) {
            addCriterion("sermarks >=", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksLessThan(String value) {
            addCriterion("sermarks <", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksLessThanOrEqualTo(String value) {
            addCriterion("sermarks <=", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksLike(String value) {
            addCriterion("sermarks like", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksNotLike(String value) {
            addCriterion("sermarks not like", value, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksIn(List<String> values) {
            addCriterion("sermarks in", values, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksNotIn(List<String> values) {
            addCriterion("sermarks not in", values, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksBetween(String value1, String value2) {
            addCriterion("sermarks between", value1, value2, "sermarks");
            return (Criteria) this;
        }

        public Criteria andSermarksNotBetween(String value1, String value2) {
            addCriterion("sermarks not between", value1, value2, "sermarks");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andScodeIsNull() {
            addCriterion("scode is null");
            return (Criteria) this;
        }

        public Criteria andScodeIsNotNull() {
            addCriterion("scode is not null");
            return (Criteria) this;
        }

        public Criteria andScodeEqualTo(String value) {
            addCriterion("scode =", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotEqualTo(String value) {
            addCriterion("scode <>", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThan(String value) {
            addCriterion("scode >", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThanOrEqualTo(String value) {
            addCriterion("scode >=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThan(String value) {
            addCriterion("scode <", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThanOrEqualTo(String value) {
            addCriterion("scode <=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLike(String value) {
            addCriterion("scode like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotLike(String value) {
            addCriterion("scode not like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeIn(List<String> values) {
            addCriterion("scode in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotIn(List<String> values) {
            addCriterion("scode not in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeBetween(String value1, String value2) {
            addCriterion("scode between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotBetween(String value1, String value2) {
            addCriterion("scode not between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andSstateIsNull() {
            addCriterion("sstate is null");
            return (Criteria) this;
        }

        public Criteria andSstateIsNotNull() {
            addCriterion("sstate is not null");
            return (Criteria) this;
        }

        public Criteria andSstateEqualTo(Byte value) {
            addCriterion("sstate =", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotEqualTo(Byte value) {
            addCriterion("sstate <>", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThan(Byte value) {
            addCriterion("sstate >", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("sstate >=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThan(Byte value) {
            addCriterion("sstate <", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThanOrEqualTo(Byte value) {
            addCriterion("sstate <=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateIn(List<Byte> values) {
            addCriterion("sstate in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotIn(List<Byte> values) {
            addCriterion("sstate not in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateBetween(Byte value1, Byte value2) {
            addCriterion("sstate between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotBetween(Byte value1, Byte value2) {
            addCriterion("sstate not between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andBusinessuserIsNull() {
            addCriterion("businessuser is null");
            return (Criteria) this;
        }

        public Criteria andBusinessuserIsNotNull() {
            addCriterion("businessuser is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessuserEqualTo(String value) {
            addCriterion("businessuser =", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserNotEqualTo(String value) {
            addCriterion("businessuser <>", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserGreaterThan(String value) {
            addCriterion("businessuser >", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserGreaterThanOrEqualTo(String value) {
            addCriterion("businessuser >=", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserLessThan(String value) {
            addCriterion("businessuser <", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserLessThanOrEqualTo(String value) {
            addCriterion("businessuser <=", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserLike(String value) {
            addCriterion("businessuser like", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserNotLike(String value) {
            addCriterion("businessuser not like", value, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserIn(List<String> values) {
            addCriterion("businessuser in", values, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserNotIn(List<String> values) {
            addCriterion("businessuser not in", values, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserBetween(String value1, String value2) {
            addCriterion("businessuser between", value1, value2, "businessuser");
            return (Criteria) this;
        }

        public Criteria andBusinessuserNotBetween(String value1, String value2) {
            addCriterion("businessuser not between", value1, value2, "businessuser");
            return (Criteria) this;
        }

        public Criteria andScallIsNull() {
            addCriterion("scall is null");
            return (Criteria) this;
        }

        public Criteria andScallIsNotNull() {
            addCriterion("scall is not null");
            return (Criteria) this;
        }

        public Criteria andScallEqualTo(Byte value) {
            addCriterion("scall =", value, "scall");
            return (Criteria) this;
        }

        public Criteria andScallNotEqualTo(Byte value) {
            addCriterion("scall <>", value, "scall");
            return (Criteria) this;
        }

        public Criteria andScallGreaterThan(Byte value) {
            addCriterion("scall >", value, "scall");
            return (Criteria) this;
        }

        public Criteria andScallGreaterThanOrEqualTo(Byte value) {
            addCriterion("scall >=", value, "scall");
            return (Criteria) this;
        }

        public Criteria andScallLessThan(Byte value) {
            addCriterion("scall <", value, "scall");
            return (Criteria) this;
        }

        public Criteria andScallLessThanOrEqualTo(Byte value) {
            addCriterion("scall <=", value, "scall");
            return (Criteria) this;
        }

        public Criteria andScallIn(List<Byte> values) {
            addCriterion("scall in", values, "scall");
            return (Criteria) this;
        }

        public Criteria andScallNotIn(List<Byte> values) {
            addCriterion("scall not in", values, "scall");
            return (Criteria) this;
        }

        public Criteria andScallBetween(Byte value1, Byte value2) {
            addCriterion("scall between", value1, value2, "scall");
            return (Criteria) this;
        }

        public Criteria andScallNotBetween(Byte value1, Byte value2) {
            addCriterion("scall not between", value1, value2, "scall");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatefundsIsNull() {
            addCriterion("createfunds is null");
            return (Criteria) this;
        }

        public Criteria andCreatefundsIsNotNull() {
            addCriterion("createfunds is not null");
            return (Criteria) this;
        }

        public Criteria andCreatefundsEqualTo(String value) {
            addCriterion("createfunds =", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsNotEqualTo(String value) {
            addCriterion("createfunds <>", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsGreaterThan(String value) {
            addCriterion("createfunds >", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsGreaterThanOrEqualTo(String value) {
            addCriterion("createfunds >=", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsLessThan(String value) {
            addCriterion("createfunds <", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsLessThanOrEqualTo(String value) {
            addCriterion("createfunds <=", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsLike(String value) {
            addCriterion("createfunds like", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsNotLike(String value) {
            addCriterion("createfunds not like", value, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsIn(List<String> values) {
            addCriterion("createfunds in", values, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsNotIn(List<String> values) {
            addCriterion("createfunds not in", values, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsBetween(String value1, String value2) {
            addCriterion("createfunds between", value1, value2, "createfunds");
            return (Criteria) this;
        }

        public Criteria andCreatefundsNotBetween(String value1, String value2) {
            addCriterion("createfunds not between", value1, value2, "createfunds");
            return (Criteria) this;
        }

        public Criteria andComnatureIsNull() {
            addCriterion("comnature is null");
            return (Criteria) this;
        }

        public Criteria andComnatureIsNotNull() {
            addCriterion("comnature is not null");
            return (Criteria) this;
        }

        public Criteria andComnatureEqualTo(Byte value) {
            addCriterion("comnature =", value, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureNotEqualTo(Byte value) {
            addCriterion("comnature <>", value, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureGreaterThan(Byte value) {
            addCriterion("comnature >", value, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureGreaterThanOrEqualTo(Byte value) {
            addCriterion("comnature >=", value, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureLessThan(Byte value) {
            addCriterion("comnature <", value, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureLessThanOrEqualTo(Byte value) {
            addCriterion("comnature <=", value, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureIn(List<Byte> values) {
            addCriterion("comnature in", values, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureNotIn(List<Byte> values) {
            addCriterion("comnature not in", values, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureBetween(Byte value1, Byte value2) {
            addCriterion("comnature between", value1, value2, "comnature");
            return (Criteria) this;
        }

        public Criteria andComnatureNotBetween(Byte value1, Byte value2) {
            addCriterion("comnature not between", value1, value2, "comnature");
            return (Criteria) this;
        }

        public Criteria andMarksIsNull() {
            addCriterion("marks is null");
            return (Criteria) this;
        }

        public Criteria andMarksIsNotNull() {
            addCriterion("marks is not null");
            return (Criteria) this;
        }

        public Criteria andMarksEqualTo(String value) {
            addCriterion("marks =", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotEqualTo(String value) {
            addCriterion("marks <>", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThan(String value) {
            addCriterion("marks >", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThanOrEqualTo(String value) {
            addCriterion("marks >=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThan(String value) {
            addCriterion("marks <", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThanOrEqualTo(String value) {
            addCriterion("marks <=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLike(String value) {
            addCriterion("marks like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotLike(String value) {
            addCriterion("marks not like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksIn(List<String> values) {
            addCriterion("marks in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotIn(List<String> values) {
            addCriterion("marks not in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksBetween(String value1, String value2) {
            addCriterion("marks between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotBetween(String value1, String value2) {
            addCriterion("marks not between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andSercodeIsNull() {
            addCriterion("sercode is null");
            return (Criteria) this;
        }

        public Criteria andSercodeIsNotNull() {
            addCriterion("sercode is not null");
            return (Criteria) this;
        }

        public Criteria andSercodeEqualTo(String value) {
            addCriterion("sercode =", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeNotEqualTo(String value) {
            addCriterion("sercode <>", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeGreaterThan(String value) {
            addCriterion("sercode >", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeGreaterThanOrEqualTo(String value) {
            addCriterion("sercode >=", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeLessThan(String value) {
            addCriterion("sercode <", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeLessThanOrEqualTo(String value) {
            addCriterion("sercode <=", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeLike(String value) {
            addCriterion("sercode like", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeNotLike(String value) {
            addCriterion("sercode not like", value, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeIn(List<String> values) {
            addCriterion("sercode in", values, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeNotIn(List<String> values) {
            addCriterion("sercode not in", values, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeBetween(String value1, String value2) {
            addCriterion("sercode between", value1, value2, "sercode");
            return (Criteria) this;
        }

        public Criteria andSercodeNotBetween(String value1, String value2) {
            addCriterion("sercode not between", value1, value2, "sercode");
            return (Criteria) this;
        }

        public Criteria andDependIsNull() {
            addCriterion("depend is null");
            return (Criteria) this;
        }

        public Criteria andDependIsNotNull() {
            addCriterion("depend is not null");
            return (Criteria) this;
        }

        public Criteria andDependEqualTo(String value) {
            addCriterion("depend =", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotEqualTo(String value) {
            addCriterion("depend <>", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependGreaterThan(String value) {
            addCriterion("depend >", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependGreaterThanOrEqualTo(String value) {
            addCriterion("depend >=", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependLessThan(String value) {
            addCriterion("depend <", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependLessThanOrEqualTo(String value) {
            addCriterion("depend <=", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependLike(String value) {
            addCriterion("depend like", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotLike(String value) {
            addCriterion("depend not like", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependIn(List<String> values) {
            addCriterion("depend in", values, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotIn(List<String> values) {
            addCriterion("depend not in", values, "depend");
            return (Criteria) this;
        }

        public Criteria andDependBetween(String value1, String value2) {
            addCriterion("depend between", value1, value2, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotBetween(String value1, String value2) {
            addCriterion("depend not between", value1, value2, "depend");
            return (Criteria) this;
        }

        public Criteria andSertypeIsNull() {
            addCriterion("sertype is null");
            return (Criteria) this;
        }

        public Criteria andSertypeIsNotNull() {
            addCriterion("sertype is not null");
            return (Criteria) this;
        }

        public Criteria andSertypeEqualTo(String value) {
            addCriterion("sertype =", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeNotEqualTo(String value) {
            addCriterion("sertype <>", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeGreaterThan(String value) {
            addCriterion("sertype >", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeGreaterThanOrEqualTo(String value) {
            addCriterion("sertype >=", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeLessThan(String value) {
            addCriterion("sertype <", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeLessThanOrEqualTo(String value) {
            addCriterion("sertype <=", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeLike(String value) {
            addCriterion("sertype like", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeNotLike(String value) {
            addCriterion("sertype not like", value, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeIn(List<String> values) {
            addCriterion("sertype in", values, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeNotIn(List<String> values) {
            addCriterion("sertype not in", values, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeBetween(String value1, String value2) {
            addCriterion("sertype between", value1, value2, "sertype");
            return (Criteria) this;
        }

        public Criteria andSertypeNotBetween(String value1, String value2) {
            addCriterion("sertype not between", value1, value2, "sertype");
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

        public Criteria andSerAbilityIsNull() {
            addCriterion("ser_ability is null");
            return (Criteria) this;
        }

        public Criteria andSerAbilityIsNotNull() {
            addCriterion("ser_ability is not null");
            return (Criteria) this;
        }

        public Criteria andSerAbilityEqualTo(String value) {
            addCriterion("ser_ability =", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityNotEqualTo(String value) {
            addCriterion("ser_ability <>", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityGreaterThan(String value) {
            addCriterion("ser_ability >", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("ser_ability >=", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityLessThan(String value) {
            addCriterion("ser_ability <", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityLessThanOrEqualTo(String value) {
            addCriterion("ser_ability <=", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityLike(String value) {
            addCriterion("ser_ability like", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityNotLike(String value) {
            addCriterion("ser_ability not like", value, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityIn(List<String> values) {
            addCriterion("ser_ability in", values, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityNotIn(List<String> values) {
            addCriterion("ser_ability not in", values, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityBetween(String value1, String value2) {
            addCriterion("ser_ability between", value1, value2, "serAbility");
            return (Criteria) this;
        }

        public Criteria andSerAbilityNotBetween(String value1, String value2) {
            addCriterion("ser_ability not between", value1, value2, "serAbility");
            return (Criteria) this;
        }
    }

    /**
     * nms_serinfo
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nms_serinfo 2016-07-13
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