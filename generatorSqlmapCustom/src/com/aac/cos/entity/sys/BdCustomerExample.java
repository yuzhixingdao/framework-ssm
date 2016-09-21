package com.aac.cos.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdCustomerExample {
    /**
     * bd_customer
     */
    protected String orderByClause;

    /**
     * bd_customer
     */
    protected boolean distinct;

    /**
     * bd_customer
     */
    protected List<Criteria> oredCriteria;

    public BdCustomerExample() {
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
     * bd_customer 2016-07-13
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

        public Criteria andConlinIdIsNull() {
            addCriterion("conlin_id is null");
            return (Criteria) this;
        }

        public Criteria andConlinIdIsNotNull() {
            addCriterion("conlin_id is not null");
            return (Criteria) this;
        }

        public Criteria andConlinIdEqualTo(Long value) {
            addCriterion("conlin_id =", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdNotEqualTo(Long value) {
            addCriterion("conlin_id <>", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdGreaterThan(Long value) {
            addCriterion("conlin_id >", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdGreaterThanOrEqualTo(Long value) {
            addCriterion("conlin_id >=", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdLessThan(Long value) {
            addCriterion("conlin_id <", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdLessThanOrEqualTo(Long value) {
            addCriterion("conlin_id <=", value, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdIn(List<Long> values) {
            addCriterion("conlin_id in", values, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdNotIn(List<Long> values) {
            addCriterion("conlin_id not in", values, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdBetween(Long value1, Long value2) {
            addCriterion("conlin_id between", value1, value2, "conlinId");
            return (Criteria) this;
        }

        public Criteria andConlinIdNotBetween(Long value1, Long value2) {
            addCriterion("conlin_id not between", value1, value2, "conlinId");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusSexIsNull() {
            addCriterion("cus_sex is null");
            return (Criteria) this;
        }

        public Criteria andCusSexIsNotNull() {
            addCriterion("cus_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCusSexEqualTo(Byte value) {
            addCriterion("cus_sex =", value, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexNotEqualTo(Byte value) {
            addCriterion("cus_sex <>", value, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexGreaterThan(Byte value) {
            addCriterion("cus_sex >", value, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("cus_sex >=", value, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexLessThan(Byte value) {
            addCriterion("cus_sex <", value, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexLessThanOrEqualTo(Byte value) {
            addCriterion("cus_sex <=", value, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexIn(List<Byte> values) {
            addCriterion("cus_sex in", values, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexNotIn(List<Byte> values) {
            addCriterion("cus_sex not in", values, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexBetween(Byte value1, Byte value2) {
            addCriterion("cus_sex between", value1, value2, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusSexNotBetween(Byte value1, Byte value2) {
            addCriterion("cus_sex not between", value1, value2, "cusSex");
            return (Criteria) this;
        }

        public Criteria andCusNumberIsNull() {
            addCriterion("cus_number is null");
            return (Criteria) this;
        }

        public Criteria andCusNumberIsNotNull() {
            addCriterion("cus_number is not null");
            return (Criteria) this;
        }

        public Criteria andCusNumberEqualTo(String value) {
            addCriterion("cus_number =", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberNotEqualTo(String value) {
            addCriterion("cus_number <>", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberGreaterThan(String value) {
            addCriterion("cus_number >", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cus_number >=", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberLessThan(String value) {
            addCriterion("cus_number <", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberLessThanOrEqualTo(String value) {
            addCriterion("cus_number <=", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberLike(String value) {
            addCriterion("cus_number like", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberNotLike(String value) {
            addCriterion("cus_number not like", value, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberIn(List<String> values) {
            addCriterion("cus_number in", values, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberNotIn(List<String> values) {
            addCriterion("cus_number not in", values, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberBetween(String value1, String value2) {
            addCriterion("cus_number between", value1, value2, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusNumberNotBetween(String value1, String value2) {
            addCriterion("cus_number not between", value1, value2, "cusNumber");
            return (Criteria) this;
        }

        public Criteria andCusLevelIsNull() {
            addCriterion("cus_level is null");
            return (Criteria) this;
        }

        public Criteria andCusLevelIsNotNull() {
            addCriterion("cus_level is not null");
            return (Criteria) this;
        }

        public Criteria andCusLevelEqualTo(String value) {
            addCriterion("cus_level =", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelNotEqualTo(String value) {
            addCriterion("cus_level <>", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelGreaterThan(String value) {
            addCriterion("cus_level >", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cus_level >=", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelLessThan(String value) {
            addCriterion("cus_level <", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelLessThanOrEqualTo(String value) {
            addCriterion("cus_level <=", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelLike(String value) {
            addCriterion("cus_level like", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelNotLike(String value) {
            addCriterion("cus_level not like", value, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelIn(List<String> values) {
            addCriterion("cus_level in", values, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelNotIn(List<String> values) {
            addCriterion("cus_level not in", values, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelBetween(String value1, String value2) {
            addCriterion("cus_level between", value1, value2, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusLevelNotBetween(String value1, String value2) {
            addCriterion("cus_level not between", value1, value2, "cusLevel");
            return (Criteria) this;
        }

        public Criteria andCusIdcardIsNull() {
            addCriterion("cus_idcard is null");
            return (Criteria) this;
        }

        public Criteria andCusIdcardIsNotNull() {
            addCriterion("cus_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdcardEqualTo(String value) {
            addCriterion("cus_idcard =", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotEqualTo(String value) {
            addCriterion("cus_idcard <>", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardGreaterThan(String value) {
            addCriterion("cus_idcard >", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("cus_idcard >=", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardLessThan(String value) {
            addCriterion("cus_idcard <", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardLessThanOrEqualTo(String value) {
            addCriterion("cus_idcard <=", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardLike(String value) {
            addCriterion("cus_idcard like", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotLike(String value) {
            addCriterion("cus_idcard not like", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardIn(List<String> values) {
            addCriterion("cus_idcard in", values, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotIn(List<String> values) {
            addCriterion("cus_idcard not in", values, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardBetween(String value1, String value2) {
            addCriterion("cus_idcard between", value1, value2, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotBetween(String value1, String value2) {
            addCriterion("cus_idcard not between", value1, value2, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusAddressIsNull() {
            addCriterion("cus_address is null");
            return (Criteria) this;
        }

        public Criteria andCusAddressIsNotNull() {
            addCriterion("cus_address is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddressEqualTo(String value) {
            addCriterion("cus_address =", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotEqualTo(String value) {
            addCriterion("cus_address <>", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressGreaterThan(String value) {
            addCriterion("cus_address >", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cus_address >=", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLessThan(String value) {
            addCriterion("cus_address <", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLessThanOrEqualTo(String value) {
            addCriterion("cus_address <=", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLike(String value) {
            addCriterion("cus_address like", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotLike(String value) {
            addCriterion("cus_address not like", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressIn(List<String> values) {
            addCriterion("cus_address in", values, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotIn(List<String> values) {
            addCriterion("cus_address not in", values, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressBetween(String value1, String value2) {
            addCriterion("cus_address between", value1, value2, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotBetween(String value1, String value2) {
            addCriterion("cus_address not between", value1, value2, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIsNull() {
            addCriterion("cus_province is null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIsNotNull() {
            addCriterion("cus_province is not null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceEqualTo(String value) {
            addCriterion("cus_province =", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotEqualTo(String value) {
            addCriterion("cus_province <>", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceGreaterThan(String value) {
            addCriterion("cus_province >", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("cus_province >=", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceLessThan(String value) {
            addCriterion("cus_province <", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceLessThanOrEqualTo(String value) {
            addCriterion("cus_province <=", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceLike(String value) {
            addCriterion("cus_province like", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotLike(String value) {
            addCriterion("cus_province not like", value, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIn(List<String> values) {
            addCriterion("cus_province in", values, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotIn(List<String> values) {
            addCriterion("cus_province not in", values, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceBetween(String value1, String value2) {
            addCriterion("cus_province between", value1, value2, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNotBetween(String value1, String value2) {
            addCriterion("cus_province not between", value1, value2, "cusProvince");
            return (Criteria) this;
        }

        public Criteria andCusCityIsNull() {
            addCriterion("cus_city is null");
            return (Criteria) this;
        }

        public Criteria andCusCityIsNotNull() {
            addCriterion("cus_city is not null");
            return (Criteria) this;
        }

        public Criteria andCusCityEqualTo(String value) {
            addCriterion("cus_city =", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotEqualTo(String value) {
            addCriterion("cus_city <>", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityGreaterThan(String value) {
            addCriterion("cus_city >", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityGreaterThanOrEqualTo(String value) {
            addCriterion("cus_city >=", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLessThan(String value) {
            addCriterion("cus_city <", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLessThanOrEqualTo(String value) {
            addCriterion("cus_city <=", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLike(String value) {
            addCriterion("cus_city like", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotLike(String value) {
            addCriterion("cus_city not like", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityIn(List<String> values) {
            addCriterion("cus_city in", values, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotIn(List<String> values) {
            addCriterion("cus_city not in", values, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityBetween(String value1, String value2) {
            addCriterion("cus_city between", value1, value2, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotBetween(String value1, String value2) {
            addCriterion("cus_city not between", value1, value2, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeIsNull() {
            addCriterion("cus_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeIsNotNull() {
            addCriterion("cus_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeEqualTo(String value) {
            addCriterion("cus_zip_code =", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeNotEqualTo(String value) {
            addCriterion("cus_zip_code <>", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeGreaterThan(String value) {
            addCriterion("cus_zip_code >", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cus_zip_code >=", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeLessThan(String value) {
            addCriterion("cus_zip_code <", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeLessThanOrEqualTo(String value) {
            addCriterion("cus_zip_code <=", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeLike(String value) {
            addCriterion("cus_zip_code like", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeNotLike(String value) {
            addCriterion("cus_zip_code not like", value, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeIn(List<String> values) {
            addCriterion("cus_zip_code in", values, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeNotIn(List<String> values) {
            addCriterion("cus_zip_code not in", values, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeBetween(String value1, String value2) {
            addCriterion("cus_zip_code between", value1, value2, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusZipCodeNotBetween(String value1, String value2) {
            addCriterion("cus_zip_code not between", value1, value2, "cusZipCode");
            return (Criteria) this;
        }

        public Criteria andCusRemarkIsNull() {
            addCriterion("cus_remark is null");
            return (Criteria) this;
        }

        public Criteria andCusRemarkIsNotNull() {
            addCriterion("cus_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCusRemarkEqualTo(String value) {
            addCriterion("cus_remark =", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkNotEqualTo(String value) {
            addCriterion("cus_remark <>", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkGreaterThan(String value) {
            addCriterion("cus_remark >", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cus_remark >=", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkLessThan(String value) {
            addCriterion("cus_remark <", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkLessThanOrEqualTo(String value) {
            addCriterion("cus_remark <=", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkLike(String value) {
            addCriterion("cus_remark like", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkNotLike(String value) {
            addCriterion("cus_remark not like", value, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkIn(List<String> values) {
            addCriterion("cus_remark in", values, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkNotIn(List<String> values) {
            addCriterion("cus_remark not in", values, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkBetween(String value1, String value2) {
            addCriterion("cus_remark between", value1, value2, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andCusRemarkNotBetween(String value1, String value2) {
            addCriterion("cus_remark not between", value1, value2, "cusRemark");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberIsNull() {
            addCriterion("policy_number is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberIsNotNull() {
            addCriterion("policy_number is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberEqualTo(String value) {
            addCriterion("policy_number =", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotEqualTo(String value) {
            addCriterion("policy_number <>", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberGreaterThan(String value) {
            addCriterion("policy_number >", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("policy_number >=", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberLessThan(String value) {
            addCriterion("policy_number <", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberLessThanOrEqualTo(String value) {
            addCriterion("policy_number <=", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberLike(String value) {
            addCriterion("policy_number like", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotLike(String value) {
            addCriterion("policy_number not like", value, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberIn(List<String> values) {
            addCriterion("policy_number in", values, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotIn(List<String> values) {
            addCriterion("policy_number not in", values, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberBetween(String value1, String value2) {
            addCriterion("policy_number between", value1, value2, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andPolicyNumberNotBetween(String value1, String value2) {
            addCriterion("policy_number not between", value1, value2, "policyNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("card_number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("card_number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateIsNull() {
            addCriterion("open_card_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateIsNotNull() {
            addCriterion("open_card_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateEqualTo(Date value) {
            addCriterion("open_card_date =", value, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateNotEqualTo(Date value) {
            addCriterion("open_card_date <>", value, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateGreaterThan(Date value) {
            addCriterion("open_card_date >", value, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_card_date >=", value, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateLessThan(Date value) {
            addCriterion("open_card_date <", value, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateLessThanOrEqualTo(Date value) {
            addCriterion("open_card_date <=", value, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateIn(List<Date> values) {
            addCriterion("open_card_date in", values, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateNotIn(List<Date> values) {
            addCriterion("open_card_date not in", values, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateBetween(Date value1, Date value2) {
            addCriterion("open_card_date between", value1, value2, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andOpenCardDateNotBetween(Date value1, Date value2) {
            addCriterion("open_card_date not between", value1, value2, "openCardDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesIsNull() {
            addCriterion("purchased_dates is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesIsNotNull() {
            addCriterion("purchased_dates is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesEqualTo(Date value) {
            addCriterion("purchased_dates =", value, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesNotEqualTo(Date value) {
            addCriterion("purchased_dates <>", value, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesGreaterThan(Date value) {
            addCriterion("purchased_dates >", value, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesGreaterThanOrEqualTo(Date value) {
            addCriterion("purchased_dates >=", value, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesLessThan(Date value) {
            addCriterion("purchased_dates <", value, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesLessThanOrEqualTo(Date value) {
            addCriterion("purchased_dates <=", value, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesIn(List<Date> values) {
            addCriterion("purchased_dates in", values, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesNotIn(List<Date> values) {
            addCriterion("purchased_dates not in", values, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesBetween(Date value1, Date value2) {
            addCriterion("purchased_dates between", value1, value2, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andPurchasedDatesNotBetween(Date value1, Date value2) {
            addCriterion("purchased_dates not between", value1, value2, "purchasedDates");
            return (Criteria) this;
        }

        public Criteria andSerStartDateIsNull() {
            addCriterion("ser_start_date is null");
            return (Criteria) this;
        }

        public Criteria andSerStartDateIsNotNull() {
            addCriterion("ser_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andSerStartDateEqualTo(Date value) {
            addCriterion("ser_start_date =", value, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateNotEqualTo(Date value) {
            addCriterion("ser_start_date <>", value, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateGreaterThan(Date value) {
            addCriterion("ser_start_date >", value, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ser_start_date >=", value, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateLessThan(Date value) {
            addCriterion("ser_start_date <", value, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateLessThanOrEqualTo(Date value) {
            addCriterion("ser_start_date <=", value, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateIn(List<Date> values) {
            addCriterion("ser_start_date in", values, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateNotIn(List<Date> values) {
            addCriterion("ser_start_date not in", values, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateBetween(Date value1, Date value2) {
            addCriterion("ser_start_date between", value1, value2, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerStartDateNotBetween(Date value1, Date value2) {
            addCriterion("ser_start_date not between", value1, value2, "serStartDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateIsNull() {
            addCriterion("ser_end_date is null");
            return (Criteria) this;
        }

        public Criteria andSerEndDateIsNotNull() {
            addCriterion("ser_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andSerEndDateEqualTo(Date value) {
            addCriterion("ser_end_date =", value, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateNotEqualTo(Date value) {
            addCriterion("ser_end_date <>", value, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateGreaterThan(Date value) {
            addCriterion("ser_end_date >", value, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ser_end_date >=", value, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateLessThan(Date value) {
            addCriterion("ser_end_date <", value, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateLessThanOrEqualTo(Date value) {
            addCriterion("ser_end_date <=", value, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateIn(List<Date> values) {
            addCriterion("ser_end_date in", values, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateNotIn(List<Date> values) {
            addCriterion("ser_end_date not in", values, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateBetween(Date value1, Date value2) {
            addCriterion("ser_end_date between", value1, value2, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerEndDateNotBetween(Date value1, Date value2) {
            addCriterion("ser_end_date not between", value1, value2, "serEndDate");
            return (Criteria) this;
        }

        public Criteria andSerRemarkIsNull() {
            addCriterion("ser_remark is null");
            return (Criteria) this;
        }

        public Criteria andSerRemarkIsNotNull() {
            addCriterion("ser_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSerRemarkEqualTo(String value) {
            addCriterion("ser_remark =", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkNotEqualTo(String value) {
            addCriterion("ser_remark <>", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkGreaterThan(String value) {
            addCriterion("ser_remark >", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ser_remark >=", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkLessThan(String value) {
            addCriterion("ser_remark <", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkLessThanOrEqualTo(String value) {
            addCriterion("ser_remark <=", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkLike(String value) {
            addCriterion("ser_remark like", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkNotLike(String value) {
            addCriterion("ser_remark not like", value, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkIn(List<String> values) {
            addCriterion("ser_remark in", values, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkNotIn(List<String> values) {
            addCriterion("ser_remark not in", values, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkBetween(String value1, String value2) {
            addCriterion("ser_remark between", value1, value2, "serRemark");
            return (Criteria) this;
        }

        public Criteria andSerRemarkNotBetween(String value1, String value2) {
            addCriterion("ser_remark not between", value1, value2, "serRemark");
            return (Criteria) this;
        }

        public Criteria andVinNumberIsNull() {
            addCriterion("vin_number is null");
            return (Criteria) this;
        }

        public Criteria andVinNumberIsNotNull() {
            addCriterion("vin_number is not null");
            return (Criteria) this;
        }

        public Criteria andVinNumberEqualTo(String value) {
            addCriterion("vin_number =", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotEqualTo(String value) {
            addCriterion("vin_number <>", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberGreaterThan(String value) {
            addCriterion("vin_number >", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberGreaterThanOrEqualTo(String value) {
            addCriterion("vin_number >=", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberLessThan(String value) {
            addCriterion("vin_number <", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberLessThanOrEqualTo(String value) {
            addCriterion("vin_number <=", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberLike(String value) {
            addCriterion("vin_number like", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotLike(String value) {
            addCriterion("vin_number not like", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberIn(List<String> values) {
            addCriterion("vin_number in", values, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotIn(List<String> values) {
            addCriterion("vin_number not in", values, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberBetween(String value1, String value2) {
            addCriterion("vin_number between", value1, value2, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotBetween(String value1, String value2) {
            addCriterion("vin_number not between", value1, value2, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNull() {
            addCriterion("car_color is null");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNotNull() {
            addCriterion("car_color is not null");
            return (Criteria) this;
        }

        public Criteria andCarColorEqualTo(String value) {
            addCriterion("car_color =", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotEqualTo(String value) {
            addCriterion("car_color <>", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThan(String value) {
            addCriterion("car_color >", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("car_color >=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThan(String value) {
            addCriterion("car_color <", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThanOrEqualTo(String value) {
            addCriterion("car_color <=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLike(String value) {
            addCriterion("car_color like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotLike(String value) {
            addCriterion("car_color not like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorIn(List<String> values) {
            addCriterion("car_color in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotIn(List<String> values) {
            addCriterion("car_color not in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorBetween(String value1, String value2) {
            addCriterion("car_color between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotBetween(String value1, String value2) {
            addCriterion("car_color not between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNull() {
            addCriterion("car_model is null");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNotNull() {
            addCriterion("car_model is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelEqualTo(String value) {
            addCriterion("car_model =", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotEqualTo(String value) {
            addCriterion("car_model <>", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThan(String value) {
            addCriterion("car_model >", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanOrEqualTo(String value) {
            addCriterion("car_model >=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThan(String value) {
            addCriterion("car_model <", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanOrEqualTo(String value) {
            addCriterion("car_model <=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLike(String value) {
            addCriterion("car_model like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotLike(String value) {
            addCriterion("car_model not like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelIn(List<String> values) {
            addCriterion("car_model in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotIn(List<String> values) {
            addCriterion("car_model not in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelBetween(String value1, String value2) {
            addCriterion("car_model between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotBetween(String value1, String value2) {
            addCriterion("car_model not between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIsNull() {
            addCriterion("car_series is null");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIsNotNull() {
            addCriterion("car_series is not null");
            return (Criteria) this;
        }

        public Criteria andCarSeriesEqualTo(String value) {
            addCriterion("car_series =", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotEqualTo(String value) {
            addCriterion("car_series <>", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesGreaterThan(String value) {
            addCriterion("car_series >", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("car_series >=", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLessThan(String value) {
            addCriterion("car_series <", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLessThanOrEqualTo(String value) {
            addCriterion("car_series <=", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLike(String value) {
            addCriterion("car_series like", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotLike(String value) {
            addCriterion("car_series not like", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIn(List<String> values) {
            addCriterion("car_series in", values, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotIn(List<String> values) {
            addCriterion("car_series not in", values, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesBetween(String value1, String value2) {
            addCriterion("car_series between", value1, value2, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotBetween(String value1, String value2) {
            addCriterion("car_series not between", value1, value2, "carSeries");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIsNull() {
            addCriterion("power_type is null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIsNotNull() {
            addCriterion("power_type is not null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeEqualTo(String value) {
            addCriterion("power_type =", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotEqualTo(String value) {
            addCriterion("power_type <>", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeGreaterThan(String value) {
            addCriterion("power_type >", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("power_type >=", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLessThan(String value) {
            addCriterion("power_type <", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLessThanOrEqualTo(String value) {
            addCriterion("power_type <=", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLike(String value) {
            addCriterion("power_type like", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotLike(String value) {
            addCriterion("power_type not like", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIn(List<String> values) {
            addCriterion("power_type in", values, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotIn(List<String> values) {
            addCriterion("power_type not in", values, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeBetween(String value1, String value2) {
            addCriterion("power_type between", value1, value2, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotBetween(String value1, String value2) {
            addCriterion("power_type not between", value1, value2, "powerType");
            return (Criteria) this;
        }

        public Criteria andDriveModeIsNull() {
            addCriterion("drive_mode is null");
            return (Criteria) this;
        }

        public Criteria andDriveModeIsNotNull() {
            addCriterion("drive_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDriveModeEqualTo(String value) {
            addCriterion("drive_mode =", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotEqualTo(String value) {
            addCriterion("drive_mode <>", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeGreaterThan(String value) {
            addCriterion("drive_mode >", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeGreaterThanOrEqualTo(String value) {
            addCriterion("drive_mode >=", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLessThan(String value) {
            addCriterion("drive_mode <", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLessThanOrEqualTo(String value) {
            addCriterion("drive_mode <=", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLike(String value) {
            addCriterion("drive_mode like", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotLike(String value) {
            addCriterion("drive_mode not like", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeIn(List<String> values) {
            addCriterion("drive_mode in", values, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotIn(List<String> values) {
            addCriterion("drive_mode not in", values, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeBetween(String value1, String value2) {
            addCriterion("drive_mode between", value1, value2, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotBetween(String value1, String value2) {
            addCriterion("drive_mode not between", value1, value2, "driveMode");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateIsNull() {
            addCriterion("purchased_car_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateIsNotNull() {
            addCriterion("purchased_car_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateEqualTo(Date value) {
            addCriterion("purchased_car_date =", value, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateNotEqualTo(Date value) {
            addCriterion("purchased_car_date <>", value, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateGreaterThan(Date value) {
            addCriterion("purchased_car_date >", value, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateGreaterThanOrEqualTo(Date value) {
            addCriterion("purchased_car_date >=", value, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateLessThan(Date value) {
            addCriterion("purchased_car_date <", value, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateLessThanOrEqualTo(Date value) {
            addCriterion("purchased_car_date <=", value, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateIn(List<Date> values) {
            addCriterion("purchased_car_date in", values, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateNotIn(List<Date> values) {
            addCriterion("purchased_car_date not in", values, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateBetween(Date value1, Date value2) {
            addCriterion("purchased_car_date between", value1, value2, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCarDateNotBetween(Date value1, Date value2) {
            addCriterion("purchased_car_date not between", value1, value2, "purchasedCarDate");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerIsNull() {
            addCriterion("purchased_cardealer is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerIsNotNull() {
            addCriterion("purchased_cardealer is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerEqualTo(String value) {
            addCriterion("purchased_cardealer =", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerNotEqualTo(String value) {
            addCriterion("purchased_cardealer <>", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerGreaterThan(String value) {
            addCriterion("purchased_cardealer >", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerGreaterThanOrEqualTo(String value) {
            addCriterion("purchased_cardealer >=", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerLessThan(String value) {
            addCriterion("purchased_cardealer <", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerLessThanOrEqualTo(String value) {
            addCriterion("purchased_cardealer <=", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerLike(String value) {
            addCriterion("purchased_cardealer like", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerNotLike(String value) {
            addCriterion("purchased_cardealer not like", value, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerIn(List<String> values) {
            addCriterion("purchased_cardealer in", values, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerNotIn(List<String> values) {
            addCriterion("purchased_cardealer not in", values, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerBetween(String value1, String value2) {
            addCriterion("purchased_cardealer between", value1, value2, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andPurchasedCardealerNotBetween(String value1, String value2) {
            addCriterion("purchased_cardealer not between", value1, value2, "purchasedCardealer");
            return (Criteria) this;
        }

        public Criteria andCarRemarkIsNull() {
            addCriterion("car_remark is null");
            return (Criteria) this;
        }

        public Criteria andCarRemarkIsNotNull() {
            addCriterion("car_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCarRemarkEqualTo(String value) {
            addCriterion("car_remark =", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotEqualTo(String value) {
            addCriterion("car_remark <>", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkGreaterThan(String value) {
            addCriterion("car_remark >", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("car_remark >=", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkLessThan(String value) {
            addCriterion("car_remark <", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkLessThanOrEqualTo(String value) {
            addCriterion("car_remark <=", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkLike(String value) {
            addCriterion("car_remark like", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotLike(String value) {
            addCriterion("car_remark not like", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkIn(List<String> values) {
            addCriterion("car_remark in", values, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotIn(List<String> values) {
            addCriterion("car_remark not in", values, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkBetween(String value1, String value2) {
            addCriterion("car_remark between", value1, value2, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotBetween(String value1, String value2) {
            addCriterion("car_remark not between", value1, value2, "carRemark");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoIsNull() {
            addCriterion("driving_photo is null");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoIsNotNull() {
            addCriterion("driving_photo is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoEqualTo(String value) {
            addCriterion("driving_photo =", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoNotEqualTo(String value) {
            addCriterion("driving_photo <>", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoGreaterThan(String value) {
            addCriterion("driving_photo >", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("driving_photo >=", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoLessThan(String value) {
            addCriterion("driving_photo <", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoLessThanOrEqualTo(String value) {
            addCriterion("driving_photo <=", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoLike(String value) {
            addCriterion("driving_photo like", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoNotLike(String value) {
            addCriterion("driving_photo not like", value, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoIn(List<String> values) {
            addCriterion("driving_photo in", values, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoNotIn(List<String> values) {
            addCriterion("driving_photo not in", values, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoBetween(String value1, String value2) {
            addCriterion("driving_photo between", value1, value2, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingPhotoNotBetween(String value1, String value2) {
            addCriterion("driving_photo not between", value1, value2, "drivingPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoIsNull() {
            addCriterion("run_photo is null");
            return (Criteria) this;
        }

        public Criteria andRunPhotoIsNotNull() {
            addCriterion("run_photo is not null");
            return (Criteria) this;
        }

        public Criteria andRunPhotoEqualTo(String value) {
            addCriterion("run_photo =", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoNotEqualTo(String value) {
            addCriterion("run_photo <>", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoGreaterThan(String value) {
            addCriterion("run_photo >", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("run_photo >=", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoLessThan(String value) {
            addCriterion("run_photo <", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoLessThanOrEqualTo(String value) {
            addCriterion("run_photo <=", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoLike(String value) {
            addCriterion("run_photo like", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoNotLike(String value) {
            addCriterion("run_photo not like", value, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoIn(List<String> values) {
            addCriterion("run_photo in", values, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoNotIn(List<String> values) {
            addCriterion("run_photo not in", values, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoBetween(String value1, String value2) {
            addCriterion("run_photo between", value1, value2, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andRunPhotoNotBetween(String value1, String value2) {
            addCriterion("run_photo not between", value1, value2, "runPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotIsNull() {
            addCriterion("car_phot is null");
            return (Criteria) this;
        }

        public Criteria andCarPhotIsNotNull() {
            addCriterion("car_phot is not null");
            return (Criteria) this;
        }

        public Criteria andCarPhotEqualTo(String value) {
            addCriterion("car_phot =", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotNotEqualTo(String value) {
            addCriterion("car_phot <>", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotGreaterThan(String value) {
            addCriterion("car_phot >", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotGreaterThanOrEqualTo(String value) {
            addCriterion("car_phot >=", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotLessThan(String value) {
            addCriterion("car_phot <", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotLessThanOrEqualTo(String value) {
            addCriterion("car_phot <=", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotLike(String value) {
            addCriterion("car_phot like", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotNotLike(String value) {
            addCriterion("car_phot not like", value, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotIn(List<String> values) {
            addCriterion("car_phot in", values, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotNotIn(List<String> values) {
            addCriterion("car_phot not in", values, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotBetween(String value1, String value2) {
            addCriterion("car_phot between", value1, value2, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCarPhotNotBetween(String value1, String value2) {
            addCriterion("car_phot not between", value1, value2, "carPhot");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
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

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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
     * bd_customer
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * bd_customer 2016-07-13
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