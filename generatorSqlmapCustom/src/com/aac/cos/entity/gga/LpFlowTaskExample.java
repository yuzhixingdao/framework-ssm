package com.aac.cos.entity.gga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LpFlowTaskExample {
    /**
     * lp_flow_task
     */
    protected String orderByClause;

    /**
     * lp_flow_task
     */
    protected boolean distinct;

    /**
     * lp_flow_task
     */
    protected List<Criteria> oredCriteria;

    public LpFlowTaskExample() {
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
     * lp_flow_task 2016-08-18
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andClaimCodeIsNull() {
            addCriterion("CLAIM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andClaimCodeIsNotNull() {
            addCriterion("CLAIM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andClaimCodeEqualTo(String value) {
            addCriterion("CLAIM_CODE =", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeNotEqualTo(String value) {
            addCriterion("CLAIM_CODE <>", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeGreaterThan(String value) {
            addCriterion("CLAIM_CODE >", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIM_CODE >=", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeLessThan(String value) {
            addCriterion("CLAIM_CODE <", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeLessThanOrEqualTo(String value) {
            addCriterion("CLAIM_CODE <=", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeLike(String value) {
            addCriterion("CLAIM_CODE like", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeNotLike(String value) {
            addCriterion("CLAIM_CODE not like", value, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeIn(List<String> values) {
            addCriterion("CLAIM_CODE in", values, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeNotIn(List<String> values) {
            addCriterion("CLAIM_CODE not in", values, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeBetween(String value1, String value2) {
            addCriterion("CLAIM_CODE between", value1, value2, "claimCode");
            return (Criteria) this;
        }

        public Criteria andClaimCodeNotBetween(String value1, String value2) {
            addCriterion("CLAIM_CODE not between", value1, value2, "claimCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("TASK_TYPE like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("TASK_TYPE not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("FLOW_ID =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("FLOW_ID <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("FLOW_ID >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_ID >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("FLOW_ID <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("FLOW_ID <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("FLOW_ID like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("FLOW_ID not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("FLOW_ID in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("FLOW_ID not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("FLOW_ID between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("FLOW_ID not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andDispatchDateIsNull() {
            addCriterion("DISPATCH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDispatchDateIsNotNull() {
            addCriterion("DISPATCH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchDateEqualTo(Date value) {
            addCriterion("DISPATCH_DATE =", value, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateNotEqualTo(Date value) {
            addCriterion("DISPATCH_DATE <>", value, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateGreaterThan(Date value) {
            addCriterion("DISPATCH_DATE >", value, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DISPATCH_DATE >=", value, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateLessThan(Date value) {
            addCriterion("DISPATCH_DATE <", value, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateLessThanOrEqualTo(Date value) {
            addCriterion("DISPATCH_DATE <=", value, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateIn(List<Date> values) {
            addCriterion("DISPATCH_DATE in", values, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateNotIn(List<Date> values) {
            addCriterion("DISPATCH_DATE not in", values, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateBetween(Date value1, Date value2) {
            addCriterion("DISPATCH_DATE between", value1, value2, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andDispatchDateNotBetween(Date value1, Date value2) {
            addCriterion("DISPATCH_DATE not between", value1, value2, "dispatchDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("UPDATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("UPDATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterion("UPDATED_DATE =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterion("UPDATED_DATE <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterion("UPDATED_DATE >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATE >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterion("UPDATED_DATE <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATE <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterion("UPDATED_DATE in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterion("UPDATED_DATE not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATE between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATE not between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdIsNull() {
            addCriterion("GG_VEHICLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdIsNotNull() {
            addCriterion("GG_VEHICLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdEqualTo(String value) {
            addCriterion("GG_VEHICLE_ID =", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdNotEqualTo(String value) {
            addCriterion("GG_VEHICLE_ID <>", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdGreaterThan(String value) {
            addCriterion("GG_VEHICLE_ID >", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdGreaterThanOrEqualTo(String value) {
            addCriterion("GG_VEHICLE_ID >=", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdLessThan(String value) {
            addCriterion("GG_VEHICLE_ID <", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdLessThanOrEqualTo(String value) {
            addCriterion("GG_VEHICLE_ID <=", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdLike(String value) {
            addCriterion("GG_VEHICLE_ID like", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdNotLike(String value) {
            addCriterion("GG_VEHICLE_ID not like", value, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdIn(List<String> values) {
            addCriterion("GG_VEHICLE_ID in", values, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdNotIn(List<String> values) {
            addCriterion("GG_VEHICLE_ID not in", values, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdBetween(String value1, String value2) {
            addCriterion("GG_VEHICLE_ID between", value1, value2, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleIdNotBetween(String value1, String value2) {
            addCriterion("GG_VEHICLE_ID not between", value1, value2, "ggVehicleId");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeIsNull() {
            addCriterion("GG_VEHICLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeIsNotNull() {
            addCriterion("GG_VEHICLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeEqualTo(String value) {
            addCriterion("GG_VEHICLE_CODE =", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeNotEqualTo(String value) {
            addCriterion("GG_VEHICLE_CODE <>", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeGreaterThan(String value) {
            addCriterion("GG_VEHICLE_CODE >", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GG_VEHICLE_CODE >=", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeLessThan(String value) {
            addCriterion("GG_VEHICLE_CODE <", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeLessThanOrEqualTo(String value) {
            addCriterion("GG_VEHICLE_CODE <=", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeLike(String value) {
            addCriterion("GG_VEHICLE_CODE like", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeNotLike(String value) {
            addCriterion("GG_VEHICLE_CODE not like", value, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeIn(List<String> values) {
            addCriterion("GG_VEHICLE_CODE in", values, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeNotIn(List<String> values) {
            addCriterion("GG_VEHICLE_CODE not in", values, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeBetween(String value1, String value2) {
            addCriterion("GG_VEHICLE_CODE between", value1, value2, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andGgVehicleCodeNotBetween(String value1, String value2) {
            addCriterion("GG_VEHICLE_CODE not between", value1, value2, "ggVehicleCode");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("PERSON_NAME =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("PERSON_NAME <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("PERSON_NAME >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_NAME >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("PERSON_NAME <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("PERSON_NAME <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("PERSON_NAME like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("PERSON_NAME not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("PERSON_NAME in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("PERSON_NAME not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("PERSON_NAME between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("PERSON_NAME not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNull() {
            addCriterion("PERSON_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNotNull() {
            addCriterion("PERSON_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneEqualTo(String value) {
            addCriterion("PERSON_PHONE =", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotEqualTo(String value) {
            addCriterion("PERSON_PHONE <>", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThan(String value) {
            addCriterion("PERSON_PHONE >", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_PHONE >=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThan(String value) {
            addCriterion("PERSON_PHONE <", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("PERSON_PHONE <=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLike(String value) {
            addCriterion("PERSON_PHONE like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotLike(String value) {
            addCriterion("PERSON_PHONE not like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIn(List<String> values) {
            addCriterion("PERSON_PHONE in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotIn(List<String> values) {
            addCriterion("PERSON_PHONE not in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneBetween(String value1, String value2) {
            addCriterion("PERSON_PHONE between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("PERSON_PHONE not between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("STATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("STATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(String value) {
            addCriterion("STATE_CODE =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(String value) {
            addCriterion("STATE_CODE <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(String value) {
            addCriterion("STATE_CODE >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STATE_CODE >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(String value) {
            addCriterion("STATE_CODE <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(String value) {
            addCriterion("STATE_CODE <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLike(String value) {
            addCriterion("STATE_CODE like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotLike(String value) {
            addCriterion("STATE_CODE not like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<String> values) {
            addCriterion("STATE_CODE in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<String> values) {
            addCriterion("STATE_CODE not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(String value1, String value2) {
            addCriterion("STATE_CODE between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(String value1, String value2) {
            addCriterion("STATE_CODE not between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("PERSON_ID =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("PERSON_ID <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("PERSON_ID >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_ID >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("PERSON_ID <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("PERSON_ID <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("PERSON_ID like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("PERSON_ID not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("PERSON_ID in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("PERSON_ID not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("PERSON_ID between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("PERSON_ID not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateIsNull() {
            addCriterion("PREDICT_ARRIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateIsNotNull() {
            addCriterion("PREDICT_ARRIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateEqualTo(Date value) {
            addCriterion("PREDICT_ARRIVE_DATE =", value, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateNotEqualTo(Date value) {
            addCriterion("PREDICT_ARRIVE_DATE <>", value, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateGreaterThan(Date value) {
            addCriterion("PREDICT_ARRIVE_DATE >", value, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PREDICT_ARRIVE_DATE >=", value, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateLessThan(Date value) {
            addCriterion("PREDICT_ARRIVE_DATE <", value, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateLessThanOrEqualTo(Date value) {
            addCriterion("PREDICT_ARRIVE_DATE <=", value, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateIn(List<Date> values) {
            addCriterion("PREDICT_ARRIVE_DATE in", values, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateNotIn(List<Date> values) {
            addCriterion("PREDICT_ARRIVE_DATE not in", values, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateBetween(Date value1, Date value2) {
            addCriterion("PREDICT_ARRIVE_DATE between", value1, value2, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictArriveDateNotBetween(Date value1, Date value2) {
            addCriterion("PREDICT_ARRIVE_DATE not between", value1, value2, "predictArriveDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateIsNull() {
            addCriterion("PREDICT_FINISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateIsNotNull() {
            addCriterion("PREDICT_FINISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateEqualTo(Date value) {
            addCriterion("PREDICT_FINISH_DATE =", value, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateNotEqualTo(Date value) {
            addCriterion("PREDICT_FINISH_DATE <>", value, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateGreaterThan(Date value) {
            addCriterion("PREDICT_FINISH_DATE >", value, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PREDICT_FINISH_DATE >=", value, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateLessThan(Date value) {
            addCriterion("PREDICT_FINISH_DATE <", value, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("PREDICT_FINISH_DATE <=", value, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateIn(List<Date> values) {
            addCriterion("PREDICT_FINISH_DATE in", values, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateNotIn(List<Date> values) {
            addCriterion("PREDICT_FINISH_DATE not in", values, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateBetween(Date value1, Date value2) {
            addCriterion("PREDICT_FINISH_DATE between", value1, value2, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andPredictFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("PREDICT_FINISH_DATE not between", value1, value2, "predictFinishDate");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdIsNull() {
            addCriterion("DISPATCH_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdIsNotNull() {
            addCriterion("DISPATCH_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_ID =", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdNotEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_ID <>", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdGreaterThan(String value) {
            addCriterion("DISPATCH_PERSON_ID >", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_ID >=", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdLessThan(String value) {
            addCriterion("DISPATCH_PERSON_ID <", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_ID <=", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdLike(String value) {
            addCriterion("DISPATCH_PERSON_ID like", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdNotLike(String value) {
            addCriterion("DISPATCH_PERSON_ID not like", value, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdIn(List<String> values) {
            addCriterion("DISPATCH_PERSON_ID in", values, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdNotIn(List<String> values) {
            addCriterion("DISPATCH_PERSON_ID not in", values, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdBetween(String value1, String value2) {
            addCriterion("DISPATCH_PERSON_ID between", value1, value2, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonIdNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_PERSON_ID not between", value1, value2, "dispatchPersonId");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameIsNull() {
            addCriterion("DISPATCH_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameIsNotNull() {
            addCriterion("DISPATCH_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_NAME =", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameNotEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_NAME <>", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameGreaterThan(String value) {
            addCriterion("DISPATCH_PERSON_NAME >", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_NAME >=", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameLessThan(String value) {
            addCriterion("DISPATCH_PERSON_NAME <", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_PERSON_NAME <=", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameLike(String value) {
            addCriterion("DISPATCH_PERSON_NAME like", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameNotLike(String value) {
            addCriterion("DISPATCH_PERSON_NAME not like", value, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameIn(List<String> values) {
            addCriterion("DISPATCH_PERSON_NAME in", values, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameNotIn(List<String> values) {
            addCriterion("DISPATCH_PERSON_NAME not in", values, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameBetween(String value1, String value2) {
            addCriterion("DISPATCH_PERSON_NAME between", value1, value2, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andDispatchPersonNameNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_PERSON_NAME not between", value1, value2, "dispatchPersonName");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterion("SUBMIT_DATE =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterion("SUBMIT_DATE >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterion("SUBMIT_DATE <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterion("SUBMIT_DATE in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterion("SUBMIT_DATE not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitSumIsNull() {
            addCriterion("SUBMIT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andSubmitSumIsNotNull() {
            addCriterion("SUBMIT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitSumEqualTo(Double value) {
            addCriterion("SUBMIT_SUM =", value, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumNotEqualTo(Double value) {
            addCriterion("SUBMIT_SUM <>", value, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumGreaterThan(Double value) {
            addCriterion("SUBMIT_SUM >", value, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumGreaterThanOrEqualTo(Double value) {
            addCriterion("SUBMIT_SUM >=", value, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumLessThan(Double value) {
            addCriterion("SUBMIT_SUM <", value, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumLessThanOrEqualTo(Double value) {
            addCriterion("SUBMIT_SUM <=", value, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumIn(List<Double> values) {
            addCriterion("SUBMIT_SUM in", values, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumNotIn(List<Double> values) {
            addCriterion("SUBMIT_SUM not in", values, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumBetween(Double value1, Double value2) {
            addCriterion("SUBMIT_SUM between", value1, value2, "submitSum");
            return (Criteria) this;
        }

        public Criteria andSubmitSumNotBetween(Double value1, Double value2) {
            addCriterion("SUBMIT_SUM not between", value1, value2, "submitSum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("INVOICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("INVOICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("INVOICE_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("INVOICE_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("INVOICE_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("INVOICE_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("INVOICE_NO like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("INVOICE_NO not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("INVOICE_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("INVOICE_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("INVOICE_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NO not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameIsNull() {
            addCriterion("REPAIR_SITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameIsNotNull() {
            addCriterion("REPAIR_SITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameEqualTo(String value) {
            addCriterion("REPAIR_SITE_NAME =", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameNotEqualTo(String value) {
            addCriterion("REPAIR_SITE_NAME <>", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameGreaterThan(String value) {
            addCriterion("REPAIR_SITE_NAME >", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_SITE_NAME >=", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameLessThan(String value) {
            addCriterion("REPAIR_SITE_NAME <", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_SITE_NAME <=", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameLike(String value) {
            addCriterion("REPAIR_SITE_NAME like", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameNotLike(String value) {
            addCriterion("REPAIR_SITE_NAME not like", value, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameIn(List<String> values) {
            addCriterion("REPAIR_SITE_NAME in", values, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameNotIn(List<String> values) {
            addCriterion("REPAIR_SITE_NAME not in", values, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameBetween(String value1, String value2) {
            addCriterion("REPAIR_SITE_NAME between", value1, value2, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andRepairSiteNameNotBetween(String value1, String value2) {
            addCriterion("REPAIR_SITE_NAME not between", value1, value2, "repairSiteName");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagIsNull() {
            addCriterion("SEND_PHONE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagIsNotNull() {
            addCriterion("SEND_PHONE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagEqualTo(String value) {
            addCriterion("SEND_PHONE_FLAG =", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagNotEqualTo(String value) {
            addCriterion("SEND_PHONE_FLAG <>", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagGreaterThan(String value) {
            addCriterion("SEND_PHONE_FLAG >", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_PHONE_FLAG >=", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagLessThan(String value) {
            addCriterion("SEND_PHONE_FLAG <", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagLessThanOrEqualTo(String value) {
            addCriterion("SEND_PHONE_FLAG <=", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagLike(String value) {
            addCriterion("SEND_PHONE_FLAG like", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagNotLike(String value) {
            addCriterion("SEND_PHONE_FLAG not like", value, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagIn(List<String> values) {
            addCriterion("SEND_PHONE_FLAG in", values, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagNotIn(List<String> values) {
            addCriterion("SEND_PHONE_FLAG not in", values, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagBetween(String value1, String value2) {
            addCriterion("SEND_PHONE_FLAG between", value1, value2, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneFlagNotBetween(String value1, String value2) {
            addCriterion("SEND_PHONE_FLAG not between", value1, value2, "sendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagIsNull() {
            addCriterion("AUTO_SEND_PHONE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagIsNotNull() {
            addCriterion("AUTO_SEND_PHONE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagEqualTo(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG =", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagNotEqualTo(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG <>", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagGreaterThan(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG >", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG >=", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagLessThan(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG <", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagLessThanOrEqualTo(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG <=", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagLike(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG like", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagNotLike(String value) {
            addCriterion("AUTO_SEND_PHONE_FLAG not like", value, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagIn(List<String> values) {
            addCriterion("AUTO_SEND_PHONE_FLAG in", values, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagNotIn(List<String> values) {
            addCriterion("AUTO_SEND_PHONE_FLAG not in", values, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagBetween(String value1, String value2) {
            addCriterion("AUTO_SEND_PHONE_FLAG between", value1, value2, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoSendPhoneFlagNotBetween(String value1, String value2) {
            addCriterion("AUTO_SEND_PHONE_FLAG not between", value1, value2, "autoSendPhoneFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIsNull() {
            addCriterion("AUTO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIsNotNull() {
            addCriterion("AUTO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagEqualTo(String value) {
            addCriterion("AUTO_FLAG =", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotEqualTo(String value) {
            addCriterion("AUTO_FLAG <>", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThan(String value) {
            addCriterion("AUTO_FLAG >", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_FLAG >=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThan(String value) {
            addCriterion("AUTO_FLAG <", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThanOrEqualTo(String value) {
            addCriterion("AUTO_FLAG <=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLike(String value) {
            addCriterion("AUTO_FLAG like", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotLike(String value) {
            addCriterion("AUTO_FLAG not like", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIn(List<String> values) {
            addCriterion("AUTO_FLAG in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotIn(List<String> values) {
            addCriterion("AUTO_FLAG not in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagBetween(String value1, String value2) {
            addCriterion("AUTO_FLAG between", value1, value2, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotBetween(String value1, String value2) {
            addCriterion("AUTO_FLAG not between", value1, value2, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoModelIsNull() {
            addCriterion("AUTO_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andAutoModelIsNotNull() {
            addCriterion("AUTO_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andAutoModelEqualTo(String value) {
            addCriterion("AUTO_MODEL =", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelNotEqualTo(String value) {
            addCriterion("AUTO_MODEL <>", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelGreaterThan(String value) {
            addCriterion("AUTO_MODEL >", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_MODEL >=", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelLessThan(String value) {
            addCriterion("AUTO_MODEL <", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelLessThanOrEqualTo(String value) {
            addCriterion("AUTO_MODEL <=", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelLike(String value) {
            addCriterion("AUTO_MODEL like", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelNotLike(String value) {
            addCriterion("AUTO_MODEL not like", value, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelIn(List<String> values) {
            addCriterion("AUTO_MODEL in", values, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelNotIn(List<String> values) {
            addCriterion("AUTO_MODEL not in", values, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelBetween(String value1, String value2) {
            addCriterion("AUTO_MODEL between", value1, value2, "autoModel");
            return (Criteria) this;
        }

        public Criteria andAutoModelNotBetween(String value1, String value2) {
            addCriterion("AUTO_MODEL not between", value1, value2, "autoModel");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateIsNull() {
            addCriterion("MOBILE_RECEIVER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateIsNotNull() {
            addCriterion("MOBILE_RECEIVER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateEqualTo(Date value) {
            addCriterion("MOBILE_RECEIVER_DATE =", value, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateNotEqualTo(Date value) {
            addCriterion("MOBILE_RECEIVER_DATE <>", value, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateGreaterThan(Date value) {
            addCriterion("MOBILE_RECEIVER_DATE >", value, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MOBILE_RECEIVER_DATE >=", value, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateLessThan(Date value) {
            addCriterion("MOBILE_RECEIVER_DATE <", value, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateLessThanOrEqualTo(Date value) {
            addCriterion("MOBILE_RECEIVER_DATE <=", value, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateIn(List<Date> values) {
            addCriterion("MOBILE_RECEIVER_DATE in", values, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateNotIn(List<Date> values) {
            addCriterion("MOBILE_RECEIVER_DATE not in", values, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateBetween(Date value1, Date value2) {
            addCriterion("MOBILE_RECEIVER_DATE between", value1, value2, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileReceiverDateNotBetween(Date value1, Date value2) {
            addCriterion("MOBILE_RECEIVER_DATE not between", value1, value2, "mobileReceiverDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateIsNull() {
            addCriterion("MOBILE_ACCEPT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateIsNotNull() {
            addCriterion("MOBILE_ACCEPT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateEqualTo(Date value) {
            addCriterion("MOBILE_ACCEPT_DATE =", value, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateNotEqualTo(Date value) {
            addCriterion("MOBILE_ACCEPT_DATE <>", value, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateGreaterThan(Date value) {
            addCriterion("MOBILE_ACCEPT_DATE >", value, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MOBILE_ACCEPT_DATE >=", value, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateLessThan(Date value) {
            addCriterion("MOBILE_ACCEPT_DATE <", value, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateLessThanOrEqualTo(Date value) {
            addCriterion("MOBILE_ACCEPT_DATE <=", value, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateIn(List<Date> values) {
            addCriterion("MOBILE_ACCEPT_DATE in", values, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateNotIn(List<Date> values) {
            addCriterion("MOBILE_ACCEPT_DATE not in", values, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateBetween(Date value1, Date value2) {
            addCriterion("MOBILE_ACCEPT_DATE between", value1, value2, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andMobileAcceptDateNotBetween(Date value1, Date value2) {
            addCriterion("MOBILE_ACCEPT_DATE not between", value1, value2, "mobileAcceptDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateIsNull() {
            addCriterion("TRAIL_CAR_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateIsNotNull() {
            addCriterion("TRAIL_CAR_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateEqualTo(Date value) {
            addCriterion("TRAIL_CAR_START_DATE =", value, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateNotEqualTo(Date value) {
            addCriterion("TRAIL_CAR_START_DATE <>", value, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateGreaterThan(Date value) {
            addCriterion("TRAIL_CAR_START_DATE >", value, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRAIL_CAR_START_DATE >=", value, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateLessThan(Date value) {
            addCriterion("TRAIL_CAR_START_DATE <", value, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateLessThanOrEqualTo(Date value) {
            addCriterion("TRAIL_CAR_START_DATE <=", value, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateIn(List<Date> values) {
            addCriterion("TRAIL_CAR_START_DATE in", values, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateNotIn(List<Date> values) {
            addCriterion("TRAIL_CAR_START_DATE not in", values, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateBetween(Date value1, Date value2) {
            addCriterion("TRAIL_CAR_START_DATE between", value1, value2, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartDateNotBetween(Date value1, Date value2) {
            addCriterion("TRAIL_CAR_START_DATE not between", value1, value2, "trailCarStartDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngIsNull() {
            addCriterion("TRAIL_CAR_START_LNG is null");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngIsNotNull() {
            addCriterion("TRAIL_CAR_START_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LNG =", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngNotEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LNG <>", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngGreaterThan(String value) {
            addCriterion("TRAIL_CAR_START_LNG >", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngGreaterThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LNG >=", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngLessThan(String value) {
            addCriterion("TRAIL_CAR_START_LNG <", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngLessThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LNG <=", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngLike(String value) {
            addCriterion("TRAIL_CAR_START_LNG like", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngNotLike(String value) {
            addCriterion("TRAIL_CAR_START_LNG not like", value, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngIn(List<String> values) {
            addCriterion("TRAIL_CAR_START_LNG in", values, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngNotIn(List<String> values) {
            addCriterion("TRAIL_CAR_START_LNG not in", values, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_START_LNG between", value1, value2, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLngNotBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_START_LNG not between", value1, value2, "trailCarStartLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatIsNull() {
            addCriterion("TRAIL_CAR_START_LAT is null");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatIsNotNull() {
            addCriterion("TRAIL_CAR_START_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LAT =", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatNotEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LAT <>", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatGreaterThan(String value) {
            addCriterion("TRAIL_CAR_START_LAT >", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatGreaterThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LAT >=", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatLessThan(String value) {
            addCriterion("TRAIL_CAR_START_LAT <", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatLessThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_START_LAT <=", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatLike(String value) {
            addCriterion("TRAIL_CAR_START_LAT like", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatNotLike(String value) {
            addCriterion("TRAIL_CAR_START_LAT not like", value, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatIn(List<String> values) {
            addCriterion("TRAIL_CAR_START_LAT in", values, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatNotIn(List<String> values) {
            addCriterion("TRAIL_CAR_START_LAT not in", values, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_START_LAT between", value1, value2, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarStartLatNotBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_START_LAT not between", value1, value2, "trailCarStartLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateIsNull() {
            addCriterion("TRAIL_CAR_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateIsNotNull() {
            addCriterion("TRAIL_CAR_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateEqualTo(Date value) {
            addCriterion("TRAIL_CAR_END_DATE =", value, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateNotEqualTo(Date value) {
            addCriterion("TRAIL_CAR_END_DATE <>", value, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateGreaterThan(Date value) {
            addCriterion("TRAIL_CAR_END_DATE >", value, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRAIL_CAR_END_DATE >=", value, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateLessThan(Date value) {
            addCriterion("TRAIL_CAR_END_DATE <", value, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateLessThanOrEqualTo(Date value) {
            addCriterion("TRAIL_CAR_END_DATE <=", value, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateIn(List<Date> values) {
            addCriterion("TRAIL_CAR_END_DATE in", values, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateNotIn(List<Date> values) {
            addCriterion("TRAIL_CAR_END_DATE not in", values, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateBetween(Date value1, Date value2) {
            addCriterion("TRAIL_CAR_END_DATE between", value1, value2, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndDateNotBetween(Date value1, Date value2) {
            addCriterion("TRAIL_CAR_END_DATE not between", value1, value2, "trailCarEndDate");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngIsNull() {
            addCriterion("TRAIL_CAR_END_LNG is null");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngIsNotNull() {
            addCriterion("TRAIL_CAR_END_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LNG =", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngNotEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LNG <>", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngGreaterThan(String value) {
            addCriterion("TRAIL_CAR_END_LNG >", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngGreaterThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LNG >=", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngLessThan(String value) {
            addCriterion("TRAIL_CAR_END_LNG <", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngLessThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LNG <=", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngLike(String value) {
            addCriterion("TRAIL_CAR_END_LNG like", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngNotLike(String value) {
            addCriterion("TRAIL_CAR_END_LNG not like", value, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngIn(List<String> values) {
            addCriterion("TRAIL_CAR_END_LNG in", values, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngNotIn(List<String> values) {
            addCriterion("TRAIL_CAR_END_LNG not in", values, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_END_LNG between", value1, value2, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLngNotBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_END_LNG not between", value1, value2, "trailCarEndLng");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatIsNull() {
            addCriterion("TRAIL_CAR_END_LAT is null");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatIsNotNull() {
            addCriterion("TRAIL_CAR_END_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LAT =", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatNotEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LAT <>", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatGreaterThan(String value) {
            addCriterion("TRAIL_CAR_END_LAT >", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatGreaterThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LAT >=", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatLessThan(String value) {
            addCriterion("TRAIL_CAR_END_LAT <", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatLessThanOrEqualTo(String value) {
            addCriterion("TRAIL_CAR_END_LAT <=", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatLike(String value) {
            addCriterion("TRAIL_CAR_END_LAT like", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatNotLike(String value) {
            addCriterion("TRAIL_CAR_END_LAT not like", value, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatIn(List<String> values) {
            addCriterion("TRAIL_CAR_END_LAT in", values, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatNotIn(List<String> values) {
            addCriterion("TRAIL_CAR_END_LAT not in", values, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_END_LAT between", value1, value2, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andTrailCarEndLatNotBetween(String value1, String value2) {
            addCriterion("TRAIL_CAR_END_LAT not between", value1, value2, "trailCarEndLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateIsNull() {
            addCriterion("ARRIVE_SCENE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateIsNotNull() {
            addCriterion("ARRIVE_SCENE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_DATE =", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateNotEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_DATE <>", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateGreaterThan(Date value) {
            addCriterion("ARRIVE_SCENE_DATE >", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_DATE >=", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateLessThan(Date value) {
            addCriterion("ARRIVE_SCENE_DATE <", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateLessThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_DATE <=", value, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateIn(List<Date> values) {
            addCriterion("ARRIVE_SCENE_DATE in", values, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateNotIn(List<Date> values) {
            addCriterion("ARRIVE_SCENE_DATE not in", values, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_SCENE_DATE between", value1, value2, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneDateNotBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_SCENE_DATE not between", value1, value2, "arriveSceneDate");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngIsNull() {
            addCriterion("ARRIVE_SCENE_LNG is null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngIsNotNull() {
            addCriterion("ARRIVE_SCENE_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LNG =", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngNotEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LNG <>", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngGreaterThan(String value) {
            addCriterion("ARRIVE_SCENE_LNG >", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngGreaterThanOrEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LNG >=", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngLessThan(String value) {
            addCriterion("ARRIVE_SCENE_LNG <", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngLessThanOrEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LNG <=", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngLike(String value) {
            addCriterion("ARRIVE_SCENE_LNG like", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngNotLike(String value) {
            addCriterion("ARRIVE_SCENE_LNG not like", value, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngIn(List<String> values) {
            addCriterion("ARRIVE_SCENE_LNG in", values, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngNotIn(List<String> values) {
            addCriterion("ARRIVE_SCENE_LNG not in", values, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngBetween(String value1, String value2) {
            addCriterion("ARRIVE_SCENE_LNG between", value1, value2, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLngNotBetween(String value1, String value2) {
            addCriterion("ARRIVE_SCENE_LNG not between", value1, value2, "arriveSceneLng");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatIsNull() {
            addCriterion("ARRIVE_SCENE_LAT is null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatIsNotNull() {
            addCriterion("ARRIVE_SCENE_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LAT =", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatNotEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LAT <>", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatGreaterThan(String value) {
            addCriterion("ARRIVE_SCENE_LAT >", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatGreaterThanOrEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LAT >=", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatLessThan(String value) {
            addCriterion("ARRIVE_SCENE_LAT <", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatLessThanOrEqualTo(String value) {
            addCriterion("ARRIVE_SCENE_LAT <=", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatLike(String value) {
            addCriterion("ARRIVE_SCENE_LAT like", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatNotLike(String value) {
            addCriterion("ARRIVE_SCENE_LAT not like", value, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatIn(List<String> values) {
            addCriterion("ARRIVE_SCENE_LAT in", values, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatNotIn(List<String> values) {
            addCriterion("ARRIVE_SCENE_LAT not in", values, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatBetween(String value1, String value2) {
            addCriterion("ARRIVE_SCENE_LAT between", value1, value2, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andArriveSceneLatNotBetween(String value1, String value2) {
            addCriterion("ARRIVE_SCENE_LAT not between", value1, value2, "arriveSceneLat");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusIsNull() {
            addCriterion("VEHICLE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusIsNotNull() {
            addCriterion("VEHICLE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusEqualTo(String value) {
            addCriterion("VEHICLE_STATUS =", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusNotEqualTo(String value) {
            addCriterion("VEHICLE_STATUS <>", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusGreaterThan(String value) {
            addCriterion("VEHICLE_STATUS >", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_STATUS >=", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusLessThan(String value) {
            addCriterion("VEHICLE_STATUS <", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_STATUS <=", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusLike(String value) {
            addCriterion("VEHICLE_STATUS like", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusNotLike(String value) {
            addCriterion("VEHICLE_STATUS not like", value, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusIn(List<String> values) {
            addCriterion("VEHICLE_STATUS in", values, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusNotIn(List<String> values) {
            addCriterion("VEHICLE_STATUS not in", values, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusBetween(String value1, String value2) {
            addCriterion("VEHICLE_STATUS between", value1, value2, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andVehicleStatusNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_STATUS not between", value1, value2, "vehicleStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIsNull() {
            addCriterion("INVOICE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIsNotNull() {
            addCriterion("INVOICE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagEqualTo(String value) {
            addCriterion("INVOICE_FLAG =", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotEqualTo(String value) {
            addCriterion("INVOICE_FLAG <>", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagGreaterThan(String value) {
            addCriterion("INVOICE_FLAG >", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_FLAG >=", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagLessThan(String value) {
            addCriterion("INVOICE_FLAG <", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_FLAG <=", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagLike(String value) {
            addCriterion("INVOICE_FLAG like", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotLike(String value) {
            addCriterion("INVOICE_FLAG not like", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIn(List<String> values) {
            addCriterion("INVOICE_FLAG in", values, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotIn(List<String> values) {
            addCriterion("INVOICE_FLAG not in", values, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagBetween(String value1, String value2) {
            addCriterion("INVOICE_FLAG between", value1, value2, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotBetween(String value1, String value2) {
            addCriterion("INVOICE_FLAG not between", value1, value2, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceIsNull() {
            addCriterion("OUT_CAR_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceIsNotNull() {
            addCriterion("OUT_CAR_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceEqualTo(String value) {
            addCriterion("OUT_CAR_PRICE =", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceNotEqualTo(String value) {
            addCriterion("OUT_CAR_PRICE <>", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceGreaterThan(String value) {
            addCriterion("OUT_CAR_PRICE >", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_CAR_PRICE >=", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceLessThan(String value) {
            addCriterion("OUT_CAR_PRICE <", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceLessThanOrEqualTo(String value) {
            addCriterion("OUT_CAR_PRICE <=", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceLike(String value) {
            addCriterion("OUT_CAR_PRICE like", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceNotLike(String value) {
            addCriterion("OUT_CAR_PRICE not like", value, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceIn(List<String> values) {
            addCriterion("OUT_CAR_PRICE in", values, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceNotIn(List<String> values) {
            addCriterion("OUT_CAR_PRICE not in", values, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceBetween(String value1, String value2) {
            addCriterion("OUT_CAR_PRICE between", value1, value2, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andOutCarPriceNotBetween(String value1, String value2) {
            addCriterion("OUT_CAR_PRICE not between", value1, value2, "outCarPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageIsNull() {
            addCriterion("TRAILER_MILEAGE is null");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageIsNotNull() {
            addCriterion("TRAILER_MILEAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageEqualTo(String value) {
            addCriterion("TRAILER_MILEAGE =", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageNotEqualTo(String value) {
            addCriterion("TRAILER_MILEAGE <>", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageGreaterThan(String value) {
            addCriterion("TRAILER_MILEAGE >", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageGreaterThanOrEqualTo(String value) {
            addCriterion("TRAILER_MILEAGE >=", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageLessThan(String value) {
            addCriterion("TRAILER_MILEAGE <", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageLessThanOrEqualTo(String value) {
            addCriterion("TRAILER_MILEAGE <=", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageLike(String value) {
            addCriterion("TRAILER_MILEAGE like", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageNotLike(String value) {
            addCriterion("TRAILER_MILEAGE not like", value, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageIn(List<String> values) {
            addCriterion("TRAILER_MILEAGE in", values, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageNotIn(List<String> values) {
            addCriterion("TRAILER_MILEAGE not in", values, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageBetween(String value1, String value2) {
            addCriterion("TRAILER_MILEAGE between", value1, value2, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andTrailerMileageNotBetween(String value1, String value2) {
            addCriterion("TRAILER_MILEAGE not between", value1, value2, "trailerMileage");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidIsNull() {
            addCriterion("PRICE_STANDARDID is null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidIsNotNull() {
            addCriterion("PRICE_STANDARDID is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidEqualTo(String value) {
            addCriterion("PRICE_STANDARDID =", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidNotEqualTo(String value) {
            addCriterion("PRICE_STANDARDID <>", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidGreaterThan(String value) {
            addCriterion("PRICE_STANDARDID >", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_STANDARDID >=", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidLessThan(String value) {
            addCriterion("PRICE_STANDARDID <", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidLessThanOrEqualTo(String value) {
            addCriterion("PRICE_STANDARDID <=", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidLike(String value) {
            addCriterion("PRICE_STANDARDID like", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidNotLike(String value) {
            addCriterion("PRICE_STANDARDID not like", value, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidIn(List<String> values) {
            addCriterion("PRICE_STANDARDID in", values, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidNotIn(List<String> values) {
            addCriterion("PRICE_STANDARDID not in", values, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidBetween(String value1, String value2) {
            addCriterion("PRICE_STANDARDID between", value1, value2, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardidNotBetween(String value1, String value2) {
            addCriterion("PRICE_STANDARDID not between", value1, value2, "priceStandardid");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIsNull() {
            addCriterion("PRICE_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIsNotNull() {
            addCriterion("PRICE_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardEqualTo(String value) {
            addCriterion("PRICE_STANDARD =", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotEqualTo(String value) {
            addCriterion("PRICE_STANDARD <>", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardGreaterThan(String value) {
            addCriterion("PRICE_STANDARD >", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_STANDARD >=", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardLessThan(String value) {
            addCriterion("PRICE_STANDARD <", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardLessThanOrEqualTo(String value) {
            addCriterion("PRICE_STANDARD <=", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardLike(String value) {
            addCriterion("PRICE_STANDARD like", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotLike(String value) {
            addCriterion("PRICE_STANDARD not like", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIn(List<String> values) {
            addCriterion("PRICE_STANDARD in", values, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotIn(List<String> values) {
            addCriterion("PRICE_STANDARD not in", values, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardBetween(String value1, String value2) {
            addCriterion("PRICE_STANDARD between", value1, value2, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotBetween(String value1, String value2) {
            addCriterion("PRICE_STANDARD not between", value1, value2, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andSavePriceIsNull() {
            addCriterion("SAVE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSavePriceIsNotNull() {
            addCriterion("SAVE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSavePriceEqualTo(String value) {
            addCriterion("SAVE_PRICE =", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceNotEqualTo(String value) {
            addCriterion("SAVE_PRICE <>", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceGreaterThan(String value) {
            addCriterion("SAVE_PRICE >", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceGreaterThanOrEqualTo(String value) {
            addCriterion("SAVE_PRICE >=", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceLessThan(String value) {
            addCriterion("SAVE_PRICE <", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceLessThanOrEqualTo(String value) {
            addCriterion("SAVE_PRICE <=", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceLike(String value) {
            addCriterion("SAVE_PRICE like", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceNotLike(String value) {
            addCriterion("SAVE_PRICE not like", value, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceIn(List<String> values) {
            addCriterion("SAVE_PRICE in", values, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceNotIn(List<String> values) {
            addCriterion("SAVE_PRICE not in", values, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceBetween(String value1, String value2) {
            addCriterion("SAVE_PRICE between", value1, value2, "savePrice");
            return (Criteria) this;
        }

        public Criteria andSavePriceNotBetween(String value1, String value2) {
            addCriterion("SAVE_PRICE not between", value1, value2, "savePrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceIsNull() {
            addCriterion("WAIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andWaitPriceIsNotNull() {
            addCriterion("WAIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andWaitPriceEqualTo(String value) {
            addCriterion("WAIT_PRICE =", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceNotEqualTo(String value) {
            addCriterion("WAIT_PRICE <>", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceGreaterThan(String value) {
            addCriterion("WAIT_PRICE >", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAIT_PRICE >=", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceLessThan(String value) {
            addCriterion("WAIT_PRICE <", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceLessThanOrEqualTo(String value) {
            addCriterion("WAIT_PRICE <=", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceLike(String value) {
            addCriterion("WAIT_PRICE like", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceNotLike(String value) {
            addCriterion("WAIT_PRICE not like", value, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceIn(List<String> values) {
            addCriterion("WAIT_PRICE in", values, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceNotIn(List<String> values) {
            addCriterion("WAIT_PRICE not in", values, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceBetween(String value1, String value2) {
            addCriterion("WAIT_PRICE between", value1, value2, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andWaitPriceNotBetween(String value1, String value2) {
            addCriterion("WAIT_PRICE not between", value1, value2, "waitPrice");
            return (Criteria) this;
        }

        public Criteria andLossSumIsNull() {
            addCriterion("LOSS_SUM is null");
            return (Criteria) this;
        }

        public Criteria andLossSumIsNotNull() {
            addCriterion("LOSS_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andLossSumEqualTo(String value) {
            addCriterion("LOSS_SUM =", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumNotEqualTo(String value) {
            addCriterion("LOSS_SUM <>", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumGreaterThan(String value) {
            addCriterion("LOSS_SUM >", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumGreaterThanOrEqualTo(String value) {
            addCriterion("LOSS_SUM >=", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumLessThan(String value) {
            addCriterion("LOSS_SUM <", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumLessThanOrEqualTo(String value) {
            addCriterion("LOSS_SUM <=", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumLike(String value) {
            addCriterion("LOSS_SUM like", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumNotLike(String value) {
            addCriterion("LOSS_SUM not like", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumIn(List<String> values) {
            addCriterion("LOSS_SUM in", values, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumNotIn(List<String> values) {
            addCriterion("LOSS_SUM not in", values, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumBetween(String value1, String value2) {
            addCriterion("LOSS_SUM between", value1, value2, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumNotBetween(String value1, String value2) {
            addCriterion("LOSS_SUM not between", value1, value2, "lossSum");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("PRICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("PRICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(String value) {
            addCriterion("PRICE_TYPE =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(String value) {
            addCriterion("PRICE_TYPE <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(String value) {
            addCriterion("PRICE_TYPE >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_TYPE >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(String value) {
            addCriterion("PRICE_TYPE <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(String value) {
            addCriterion("PRICE_TYPE <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLike(String value) {
            addCriterion("PRICE_TYPE like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotLike(String value) {
            addCriterion("PRICE_TYPE not like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<String> values) {
            addCriterion("PRICE_TYPE in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<String> values) {
            addCriterion("PRICE_TYPE not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(String value1, String value2) {
            addCriterion("PRICE_TYPE between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(String value1, String value2) {
            addCriterion("PRICE_TYPE not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("RECEIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("RECEIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(String value) {
            addCriterion("RECEIVE_DATE =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(String value) {
            addCriterion("RECEIVE_DATE <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(String value) {
            addCriterion("RECEIVE_DATE >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_DATE >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(String value) {
            addCriterion("RECEIVE_DATE <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_DATE <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLike(String value) {
            addCriterion("RECEIVE_DATE like", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotLike(String value) {
            addCriterion("RECEIVE_DATE not like", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<String> values) {
            addCriterion("RECEIVE_DATE in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<String> values) {
            addCriterion("RECEIVE_DATE not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(String value1, String value2) {
            addCriterion("RECEIVE_DATE between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_DATE not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNull() {
            addCriterion("DEAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("DEAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(String value) {
            addCriterion("DEAL_DATE =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(String value) {
            addCriterion("DEAL_DATE <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(String value) {
            addCriterion("DEAL_DATE >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_DATE >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(String value) {
            addCriterion("DEAL_DATE <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(String value) {
            addCriterion("DEAL_DATE <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLike(String value) {
            addCriterion("DEAL_DATE like", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotLike(String value) {
            addCriterion("DEAL_DATE not like", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<String> values) {
            addCriterion("DEAL_DATE in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<String> values) {
            addCriterion("DEAL_DATE not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(String value1, String value2) {
            addCriterion("DEAL_DATE between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(String value1, String value2) {
            addCriterion("DEAL_DATE not between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDriveLineIsNull() {
            addCriterion("DRIVE_LINE is null");
            return (Criteria) this;
        }

        public Criteria andDriveLineIsNotNull() {
            addCriterion("DRIVE_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andDriveLineEqualTo(String value) {
            addCriterion("DRIVE_LINE =", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineNotEqualTo(String value) {
            addCriterion("DRIVE_LINE <>", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineGreaterThan(String value) {
            addCriterion("DRIVE_LINE >", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVE_LINE >=", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineLessThan(String value) {
            addCriterion("DRIVE_LINE <", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineLessThanOrEqualTo(String value) {
            addCriterion("DRIVE_LINE <=", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineLike(String value) {
            addCriterion("DRIVE_LINE like", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineNotLike(String value) {
            addCriterion("DRIVE_LINE not like", value, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineIn(List<String> values) {
            addCriterion("DRIVE_LINE in", values, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineNotIn(List<String> values) {
            addCriterion("DRIVE_LINE not in", values, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineBetween(String value1, String value2) {
            addCriterion("DRIVE_LINE between", value1, value2, "driveLine");
            return (Criteria) this;
        }

        public Criteria andDriveLineNotBetween(String value1, String value2) {
            addCriterion("DRIVE_LINE not between", value1, value2, "driveLine");
            return (Criteria) this;
        }

        public Criteria andBespeakDateIsNull() {
            addCriterion("BESPEAK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBespeakDateIsNotNull() {
            addCriterion("BESPEAK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakDateEqualTo(Date value) {
            addCriterion("BESPEAK_DATE =", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateNotEqualTo(Date value) {
            addCriterion("BESPEAK_DATE <>", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateGreaterThan(Date value) {
            addCriterion("BESPEAK_DATE >", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BESPEAK_DATE >=", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateLessThan(Date value) {
            addCriterion("BESPEAK_DATE <", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateLessThanOrEqualTo(Date value) {
            addCriterion("BESPEAK_DATE <=", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateIn(List<Date> values) {
            addCriterion("BESPEAK_DATE in", values, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateNotIn(List<Date> values) {
            addCriterion("BESPEAK_DATE not in", values, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateBetween(Date value1, Date value2) {
            addCriterion("BESPEAK_DATE between", value1, value2, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateNotBetween(Date value1, Date value2) {
            addCriterion("BESPEAK_DATE not between", value1, value2, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceIsNull() {
            addCriterion("SURVEY_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceIsNotNull() {
            addCriterion("SURVEY_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceEqualTo(String value) {
            addCriterion("SURVEY_PLACE =", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotEqualTo(String value) {
            addCriterion("SURVEY_PLACE <>", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceGreaterThan(String value) {
            addCriterion("SURVEY_PLACE >", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("SURVEY_PLACE >=", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceLessThan(String value) {
            addCriterion("SURVEY_PLACE <", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceLessThanOrEqualTo(String value) {
            addCriterion("SURVEY_PLACE <=", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceLike(String value) {
            addCriterion("SURVEY_PLACE like", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotLike(String value) {
            addCriterion("SURVEY_PLACE not like", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceIn(List<String> values) {
            addCriterion("SURVEY_PLACE in", values, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotIn(List<String> values) {
            addCriterion("SURVEY_PLACE not in", values, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceBetween(String value1, String value2) {
            addCriterion("SURVEY_PLACE between", value1, value2, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotBetween(String value1, String value2) {
            addCriterion("SURVEY_PLACE not between", value1, value2, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyLngIsNull() {
            addCriterion("SURVEY_LNG is null");
            return (Criteria) this;
        }

        public Criteria andSurveyLngIsNotNull() {
            addCriterion("SURVEY_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyLngEqualTo(String value) {
            addCriterion("SURVEY_LNG =", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngNotEqualTo(String value) {
            addCriterion("SURVEY_LNG <>", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngGreaterThan(String value) {
            addCriterion("SURVEY_LNG >", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngGreaterThanOrEqualTo(String value) {
            addCriterion("SURVEY_LNG >=", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngLessThan(String value) {
            addCriterion("SURVEY_LNG <", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngLessThanOrEqualTo(String value) {
            addCriterion("SURVEY_LNG <=", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngLike(String value) {
            addCriterion("SURVEY_LNG like", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngNotLike(String value) {
            addCriterion("SURVEY_LNG not like", value, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngIn(List<String> values) {
            addCriterion("SURVEY_LNG in", values, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngNotIn(List<String> values) {
            addCriterion("SURVEY_LNG not in", values, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngBetween(String value1, String value2) {
            addCriterion("SURVEY_LNG between", value1, value2, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLngNotBetween(String value1, String value2) {
            addCriterion("SURVEY_LNG not between", value1, value2, "surveyLng");
            return (Criteria) this;
        }

        public Criteria andSurveyLatIsNull() {
            addCriterion("SURVEY_LAT is null");
            return (Criteria) this;
        }

        public Criteria andSurveyLatIsNotNull() {
            addCriterion("SURVEY_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyLatEqualTo(String value) {
            addCriterion("SURVEY_LAT =", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatNotEqualTo(String value) {
            addCriterion("SURVEY_LAT <>", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatGreaterThan(String value) {
            addCriterion("SURVEY_LAT >", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatGreaterThanOrEqualTo(String value) {
            addCriterion("SURVEY_LAT >=", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatLessThan(String value) {
            addCriterion("SURVEY_LAT <", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatLessThanOrEqualTo(String value) {
            addCriterion("SURVEY_LAT <=", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatLike(String value) {
            addCriterion("SURVEY_LAT like", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatNotLike(String value) {
            addCriterion("SURVEY_LAT not like", value, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatIn(List<String> values) {
            addCriterion("SURVEY_LAT in", values, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatNotIn(List<String> values) {
            addCriterion("SURVEY_LAT not in", values, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatBetween(String value1, String value2) {
            addCriterion("SURVEY_LAT between", value1, value2, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andSurveyLatNotBetween(String value1, String value2) {
            addCriterion("SURVEY_LAT not between", value1, value2, "surveyLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceIsNull() {
            addCriterion("EVAL_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceIsNotNull() {
            addCriterion("EVAL_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceEqualTo(String value) {
            addCriterion("EVAL_PLACE =", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceNotEqualTo(String value) {
            addCriterion("EVAL_PLACE <>", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceGreaterThan(String value) {
            addCriterion("EVAL_PLACE >", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("EVAL_PLACE >=", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLessThan(String value) {
            addCriterion("EVAL_PLACE <", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLessThanOrEqualTo(String value) {
            addCriterion("EVAL_PLACE <=", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLike(String value) {
            addCriterion("EVAL_PLACE like", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceNotLike(String value) {
            addCriterion("EVAL_PLACE not like", value, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceIn(List<String> values) {
            addCriterion("EVAL_PLACE in", values, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceNotIn(List<String> values) {
            addCriterion("EVAL_PLACE not in", values, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceBetween(String value1, String value2) {
            addCriterion("EVAL_PLACE between", value1, value2, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceNotBetween(String value1, String value2) {
            addCriterion("EVAL_PLACE not between", value1, value2, "evalPlace");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngIsNull() {
            addCriterion("EVAL_PLACE_LNG is null");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngIsNotNull() {
            addCriterion("EVAL_PLACE_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngEqualTo(String value) {
            addCriterion("EVAL_PLACE_LNG =", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngNotEqualTo(String value) {
            addCriterion("EVAL_PLACE_LNG <>", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngGreaterThan(String value) {
            addCriterion("EVAL_PLACE_LNG >", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngGreaterThanOrEqualTo(String value) {
            addCriterion("EVAL_PLACE_LNG >=", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngLessThan(String value) {
            addCriterion("EVAL_PLACE_LNG <", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngLessThanOrEqualTo(String value) {
            addCriterion("EVAL_PLACE_LNG <=", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngLike(String value) {
            addCriterion("EVAL_PLACE_LNG like", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngNotLike(String value) {
            addCriterion("EVAL_PLACE_LNG not like", value, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngIn(List<String> values) {
            addCriterion("EVAL_PLACE_LNG in", values, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngNotIn(List<String> values) {
            addCriterion("EVAL_PLACE_LNG not in", values, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngBetween(String value1, String value2) {
            addCriterion("EVAL_PLACE_LNG between", value1, value2, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLngNotBetween(String value1, String value2) {
            addCriterion("EVAL_PLACE_LNG not between", value1, value2, "evalPlaceLng");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatIsNull() {
            addCriterion("EVAL_PLACE_LAT is null");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatIsNotNull() {
            addCriterion("EVAL_PLACE_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatEqualTo(String value) {
            addCriterion("EVAL_PLACE_LAT =", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatNotEqualTo(String value) {
            addCriterion("EVAL_PLACE_LAT <>", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatGreaterThan(String value) {
            addCriterion("EVAL_PLACE_LAT >", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatGreaterThanOrEqualTo(String value) {
            addCriterion("EVAL_PLACE_LAT >=", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatLessThan(String value) {
            addCriterion("EVAL_PLACE_LAT <", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatLessThanOrEqualTo(String value) {
            addCriterion("EVAL_PLACE_LAT <=", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatLike(String value) {
            addCriterion("EVAL_PLACE_LAT like", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatNotLike(String value) {
            addCriterion("EVAL_PLACE_LAT not like", value, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatIn(List<String> values) {
            addCriterion("EVAL_PLACE_LAT in", values, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatNotIn(List<String> values) {
            addCriterion("EVAL_PLACE_LAT not in", values, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatBetween(String value1, String value2) {
            addCriterion("EVAL_PLACE_LAT between", value1, value2, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andEvalPlaceLatNotBetween(String value1, String value2) {
            addCriterion("EVAL_PLACE_LAT not between", value1, value2, "evalPlaceLat");
            return (Criteria) this;
        }

        public Criteria andPayCompanyIsNull() {
            addCriterion("PAY_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andPayCompanyIsNotNull() {
            addCriterion("PAY_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andPayCompanyEqualTo(String value) {
            addCriterion("PAY_COMPANY =", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotEqualTo(String value) {
            addCriterion("PAY_COMPANY <>", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyGreaterThan(String value) {
            addCriterion("PAY_COMPANY >", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY >=", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyLessThan(String value) {
            addCriterion("PAY_COMPANY <", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyLessThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY <=", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyLike(String value) {
            addCriterion("PAY_COMPANY like", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotLike(String value) {
            addCriterion("PAY_COMPANY not like", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyIn(List<String> values) {
            addCriterion("PAY_COMPANY in", values, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotIn(List<String> values) {
            addCriterion("PAY_COMPANY not in", values, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyBetween(String value1, String value2) {
            addCriterion("PAY_COMPANY between", value1, value2, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotBetween(String value1, String value2) {
            addCriterion("PAY_COMPANY not between", value1, value2, "payCompany");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("UPDATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("UPDATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(String value) {
            addCriterion("UPDATE_FLAG =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(String value) {
            addCriterion("UPDATE_FLAG <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(String value) {
            addCriterion("UPDATE_FLAG >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_FLAG >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(String value) {
            addCriterion("UPDATE_FLAG <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_FLAG <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLike(String value) {
            addCriterion("UPDATE_FLAG like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotLike(String value) {
            addCriterion("UPDATE_FLAG not like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<String> values) {
            addCriterion("UPDATE_FLAG in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<String> values) {
            addCriterion("UPDATE_FLAG not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(String value1, String value2) {
            addCriterion("UPDATE_FLAG between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(String value1, String value2) {
            addCriterion("UPDATE_FLAG not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("CANCEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("CANCEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("CANCEL_DATE =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("CANCEL_DATE <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("CANCEL_DATE >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("CANCEL_DATE <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("CANCEL_DATE in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("CANCEL_DATE not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCancelDescripIsNull() {
            addCriterion("CANCEL_DESCRIP is null");
            return (Criteria) this;
        }

        public Criteria andCancelDescripIsNotNull() {
            addCriterion("CANCEL_DESCRIP is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDescripEqualTo(String value) {
            addCriterion("CANCEL_DESCRIP =", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripNotEqualTo(String value) {
            addCriterion("CANCEL_DESCRIP <>", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripGreaterThan(String value) {
            addCriterion("CANCEL_DESCRIP >", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_DESCRIP >=", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripLessThan(String value) {
            addCriterion("CANCEL_DESCRIP <", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_DESCRIP <=", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripLike(String value) {
            addCriterion("CANCEL_DESCRIP like", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripNotLike(String value) {
            addCriterion("CANCEL_DESCRIP not like", value, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripIn(List<String> values) {
            addCriterion("CANCEL_DESCRIP in", values, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripNotIn(List<String> values) {
            addCriterion("CANCEL_DESCRIP not in", values, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripBetween(String value1, String value2) {
            addCriterion("CANCEL_DESCRIP between", value1, value2, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andCancelDescripNotBetween(String value1, String value2) {
            addCriterion("CANCEL_DESCRIP not between", value1, value2, "cancelDescrip");
            return (Criteria) this;
        }

        public Criteria andTollPriceIsNull() {
            addCriterion("TOLL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTollPriceIsNotNull() {
            addCriterion("TOLL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTollPriceEqualTo(Double value) {
            addCriterion("TOLL_PRICE =", value, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceNotEqualTo(Double value) {
            addCriterion("TOLL_PRICE <>", value, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceGreaterThan(Double value) {
            addCriterion("TOLL_PRICE >", value, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("TOLL_PRICE >=", value, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceLessThan(Double value) {
            addCriterion("TOLL_PRICE <", value, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceLessThanOrEqualTo(Double value) {
            addCriterion("TOLL_PRICE <=", value, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceIn(List<Double> values) {
            addCriterion("TOLL_PRICE in", values, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceNotIn(List<Double> values) {
            addCriterion("TOLL_PRICE not in", values, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceBetween(Double value1, Double value2) {
            addCriterion("TOLL_PRICE between", value1, value2, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPriceNotBetween(Double value1, Double value2) {
            addCriterion("TOLL_PRICE not between", value1, value2, "tollPrice");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeIsNull() {
            addCriterion("TOLL_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeIsNotNull() {
            addCriterion("TOLL_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeEqualTo(String value) {
            addCriterion("TOLL_PAY_TYPE =", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeNotEqualTo(String value) {
            addCriterion("TOLL_PAY_TYPE <>", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeGreaterThan(String value) {
            addCriterion("TOLL_PAY_TYPE >", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TOLL_PAY_TYPE >=", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeLessThan(String value) {
            addCriterion("TOLL_PAY_TYPE <", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeLessThanOrEqualTo(String value) {
            addCriterion("TOLL_PAY_TYPE <=", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeLike(String value) {
            addCriterion("TOLL_PAY_TYPE like", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeNotLike(String value) {
            addCriterion("TOLL_PAY_TYPE not like", value, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeIn(List<String> values) {
            addCriterion("TOLL_PAY_TYPE in", values, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeNotIn(List<String> values) {
            addCriterion("TOLL_PAY_TYPE not in", values, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeBetween(String value1, String value2) {
            addCriterion("TOLL_PAY_TYPE between", value1, value2, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andTollPayTypeNotBetween(String value1, String value2) {
            addCriterion("TOLL_PAY_TYPE not between", value1, value2, "tollPayType");
            return (Criteria) this;
        }

        public Criteria andStartOdometerIsNull() {
            addCriterion("START_ODOMETER is null");
            return (Criteria) this;
        }

        public Criteria andStartOdometerIsNotNull() {
            addCriterion("START_ODOMETER is not null");
            return (Criteria) this;
        }

        public Criteria andStartOdometerEqualTo(Double value) {
            addCriterion("START_ODOMETER =", value, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerNotEqualTo(Double value) {
            addCriterion("START_ODOMETER <>", value, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerGreaterThan(Double value) {
            addCriterion("START_ODOMETER >", value, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerGreaterThanOrEqualTo(Double value) {
            addCriterion("START_ODOMETER >=", value, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerLessThan(Double value) {
            addCriterion("START_ODOMETER <", value, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerLessThanOrEqualTo(Double value) {
            addCriterion("START_ODOMETER <=", value, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerIn(List<Double> values) {
            addCriterion("START_ODOMETER in", values, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerNotIn(List<Double> values) {
            addCriterion("START_ODOMETER not in", values, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerBetween(Double value1, Double value2) {
            addCriterion("START_ODOMETER between", value1, value2, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andStartOdometerNotBetween(Double value1, Double value2) {
            addCriterion("START_ODOMETER not between", value1, value2, "startOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerIsNull() {
            addCriterion("ARRIVE_ODOMETER is null");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerIsNotNull() {
            addCriterion("ARRIVE_ODOMETER is not null");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerEqualTo(Double value) {
            addCriterion("ARRIVE_ODOMETER =", value, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerNotEqualTo(Double value) {
            addCriterion("ARRIVE_ODOMETER <>", value, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerGreaterThan(Double value) {
            addCriterion("ARRIVE_ODOMETER >", value, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerGreaterThanOrEqualTo(Double value) {
            addCriterion("ARRIVE_ODOMETER >=", value, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerLessThan(Double value) {
            addCriterion("ARRIVE_ODOMETER <", value, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerLessThanOrEqualTo(Double value) {
            addCriterion("ARRIVE_ODOMETER <=", value, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerIn(List<Double> values) {
            addCriterion("ARRIVE_ODOMETER in", values, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerNotIn(List<Double> values) {
            addCriterion("ARRIVE_ODOMETER not in", values, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerBetween(Double value1, Double value2) {
            addCriterion("ARRIVE_ODOMETER between", value1, value2, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andArriveOdometerNotBetween(Double value1, Double value2) {
            addCriterion("ARRIVE_ODOMETER not between", value1, value2, "arriveOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerIsNull() {
            addCriterion("END_ODOMETER is null");
            return (Criteria) this;
        }

        public Criteria andEndOdometerIsNotNull() {
            addCriterion("END_ODOMETER is not null");
            return (Criteria) this;
        }

        public Criteria andEndOdometerEqualTo(Double value) {
            addCriterion("END_ODOMETER =", value, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerNotEqualTo(Double value) {
            addCriterion("END_ODOMETER <>", value, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerGreaterThan(Double value) {
            addCriterion("END_ODOMETER >", value, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerGreaterThanOrEqualTo(Double value) {
            addCriterion("END_ODOMETER >=", value, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerLessThan(Double value) {
            addCriterion("END_ODOMETER <", value, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerLessThanOrEqualTo(Double value) {
            addCriterion("END_ODOMETER <=", value, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerIn(List<Double> values) {
            addCriterion("END_ODOMETER in", values, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerNotIn(List<Double> values) {
            addCriterion("END_ODOMETER not in", values, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerBetween(Double value1, Double value2) {
            addCriterion("END_ODOMETER between", value1, value2, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andEndOdometerNotBetween(Double value1, Double value2) {
            addCriterion("END_ODOMETER not between", value1, value2, "endOdometer");
            return (Criteria) this;
        }

        public Criteria andNumberPlateIsNull() {
            addCriterion("NUMBER_PLATE is null");
            return (Criteria) this;
        }

        public Criteria andNumberPlateIsNotNull() {
            addCriterion("NUMBER_PLATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumberPlateEqualTo(String value) {
            addCriterion("NUMBER_PLATE =", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateNotEqualTo(String value) {
            addCriterion("NUMBER_PLATE <>", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateGreaterThan(String value) {
            addCriterion("NUMBER_PLATE >", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBER_PLATE >=", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateLessThan(String value) {
            addCriterion("NUMBER_PLATE <", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateLessThanOrEqualTo(String value) {
            addCriterion("NUMBER_PLATE <=", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateLike(String value) {
            addCriterion("NUMBER_PLATE like", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateNotLike(String value) {
            addCriterion("NUMBER_PLATE not like", value, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateIn(List<String> values) {
            addCriterion("NUMBER_PLATE in", values, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateNotIn(List<String> values) {
            addCriterion("NUMBER_PLATE not in", values, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateBetween(String value1, String value2) {
            addCriterion("NUMBER_PLATE between", value1, value2, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andNumberPlateNotBetween(String value1, String value2) {
            addCriterion("NUMBER_PLATE not between", value1, value2, "numberPlate");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNull() {
            addCriterion("PRODUCT_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNotNull() {
            addCriterion("PRODUCT_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andProductModelEqualTo(String value) {
            addCriterion("PRODUCT_MODEL =", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotEqualTo(String value) {
            addCriterion("PRODUCT_MODEL <>", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThan(String value) {
            addCriterion("PRODUCT_MODEL >", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MODEL >=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThan(String value) {
            addCriterion("PRODUCT_MODEL <", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MODEL <=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLike(String value) {
            addCriterion("PRODUCT_MODEL like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotLike(String value) {
            addCriterion("PRODUCT_MODEL not like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelIn(List<String> values) {
            addCriterion("PRODUCT_MODEL in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotIn(List<String> values) {
            addCriterion("PRODUCT_MODEL not in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelBetween(String value1, String value2) {
            addCriterion("PRODUCT_MODEL between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MODEL not between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andVehicleNameIsNull() {
            addCriterion("VEHICLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNameIsNotNull() {
            addCriterion("VEHICLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNameEqualTo(String value) {
            addCriterion("VEHICLE_NAME =", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotEqualTo(String value) {
            addCriterion("VEHICLE_NAME <>", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameGreaterThan(String value) {
            addCriterion("VEHICLE_NAME >", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NAME >=", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameLessThan(String value) {
            addCriterion("VEHICLE_NAME <", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NAME <=", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameLike(String value) {
            addCriterion("VEHICLE_NAME like", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotLike(String value) {
            addCriterion("VEHICLE_NAME not like", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameIn(List<String> values) {
            addCriterion("VEHICLE_NAME in", values, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotIn(List<String> values) {
            addCriterion("VEHICLE_NAME not in", values, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameBetween(String value1, String value2) {
            addCriterion("VEHICLE_NAME between", value1, value2, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_NAME not between", value1, value2, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeIsNull() {
            addCriterion("RESCUE_ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeIsNotNull() {
            addCriterion("RESCUE_ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeEqualTo(String value) {
            addCriterion("RESCUE_ITEM_TYPE =", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeNotEqualTo(String value) {
            addCriterion("RESCUE_ITEM_TYPE <>", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeGreaterThan(String value) {
            addCriterion("RESCUE_ITEM_TYPE >", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESCUE_ITEM_TYPE >=", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeLessThan(String value) {
            addCriterion("RESCUE_ITEM_TYPE <", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeLessThanOrEqualTo(String value) {
            addCriterion("RESCUE_ITEM_TYPE <=", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeLike(String value) {
            addCriterion("RESCUE_ITEM_TYPE like", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeNotLike(String value) {
            addCriterion("RESCUE_ITEM_TYPE not like", value, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeIn(List<String> values) {
            addCriterion("RESCUE_ITEM_TYPE in", values, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeNotIn(List<String> values) {
            addCriterion("RESCUE_ITEM_TYPE not in", values, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeBetween(String value1, String value2) {
            addCriterion("RESCUE_ITEM_TYPE between", value1, value2, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueItemTypeNotBetween(String value1, String value2) {
            addCriterion("RESCUE_ITEM_TYPE not between", value1, value2, "rescueItemType");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkIsNull() {
            addCriterion("RESCUE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkIsNotNull() {
            addCriterion("RESCUE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkEqualTo(String value) {
            addCriterion("RESCUE_REMARK =", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkNotEqualTo(String value) {
            addCriterion("RESCUE_REMARK <>", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkGreaterThan(String value) {
            addCriterion("RESCUE_REMARK >", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("RESCUE_REMARK >=", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkLessThan(String value) {
            addCriterion("RESCUE_REMARK <", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkLessThanOrEqualTo(String value) {
            addCriterion("RESCUE_REMARK <=", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkLike(String value) {
            addCriterion("RESCUE_REMARK like", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkNotLike(String value) {
            addCriterion("RESCUE_REMARK not like", value, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkIn(List<String> values) {
            addCriterion("RESCUE_REMARK in", values, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkNotIn(List<String> values) {
            addCriterion("RESCUE_REMARK not in", values, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkBetween(String value1, String value2) {
            addCriterion("RESCUE_REMARK between", value1, value2, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andRescueRemarkNotBetween(String value1, String value2) {
            addCriterion("RESCUE_REMARK not between", value1, value2, "rescueRemark");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneIsNull() {
            addCriterion("MOBLE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneIsNotNull() {
            addCriterion("MOBLE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneEqualTo(String value) {
            addCriterion("MOBLE_PHONE =", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNotEqualTo(String value) {
            addCriterion("MOBLE_PHONE <>", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneGreaterThan(String value) {
            addCriterion("MOBLE_PHONE >", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBLE_PHONE >=", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneLessThan(String value) {
            addCriterion("MOBLE_PHONE <", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBLE_PHONE <=", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneLike(String value) {
            addCriterion("MOBLE_PHONE like", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNotLike(String value) {
            addCriterion("MOBLE_PHONE not like", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneIn(List<String> values) {
            addCriterion("MOBLE_PHONE in", values, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNotIn(List<String> values) {
            addCriterion("MOBLE_PHONE not in", values, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneBetween(String value1, String value2) {
            addCriterion("MOBLE_PHONE between", value1, value2, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBLE_PHONE not between", value1, value2, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneIsNull() {
            addCriterion("JIECHE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneIsNotNull() {
            addCriterion("JIECHE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneEqualTo(String value) {
            addCriterion("JIECHE_PHONE =", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNotEqualTo(String value) {
            addCriterion("JIECHE_PHONE <>", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneGreaterThan(String value) {
            addCriterion("JIECHE_PHONE >", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("JIECHE_PHONE >=", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneLessThan(String value) {
            addCriterion("JIECHE_PHONE <", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneLessThanOrEqualTo(String value) {
            addCriterion("JIECHE_PHONE <=", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneLike(String value) {
            addCriterion("JIECHE_PHONE like", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNotLike(String value) {
            addCriterion("JIECHE_PHONE not like", value, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneIn(List<String> values) {
            addCriterion("JIECHE_PHONE in", values, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNotIn(List<String> values) {
            addCriterion("JIECHE_PHONE not in", values, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneBetween(String value1, String value2) {
            addCriterion("JIECHE_PHONE between", value1, value2, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNotBetween(String value1, String value2) {
            addCriterion("JIECHE_PHONE not between", value1, value2, "jiechePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameIsNull() {
            addCriterion("MOBLE_PHONE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameIsNotNull() {
            addCriterion("MOBLE_PHONE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameEqualTo(String value) {
            addCriterion("MOBLE_PHONE_NAME =", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameNotEqualTo(String value) {
            addCriterion("MOBLE_PHONE_NAME <>", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameGreaterThan(String value) {
            addCriterion("MOBLE_PHONE_NAME >", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("MOBLE_PHONE_NAME >=", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameLessThan(String value) {
            addCriterion("MOBLE_PHONE_NAME <", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameLessThanOrEqualTo(String value) {
            addCriterion("MOBLE_PHONE_NAME <=", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameLike(String value) {
            addCriterion("MOBLE_PHONE_NAME like", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameNotLike(String value) {
            addCriterion("MOBLE_PHONE_NAME not like", value, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameIn(List<String> values) {
            addCriterion("MOBLE_PHONE_NAME in", values, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameNotIn(List<String> values) {
            addCriterion("MOBLE_PHONE_NAME not in", values, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameBetween(String value1, String value2) {
            addCriterion("MOBLE_PHONE_NAME between", value1, value2, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNameNotBetween(String value1, String value2) {
            addCriterion("MOBLE_PHONE_NAME not between", value1, value2, "moblePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameIsNull() {
            addCriterion("JIECHE_PHONE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameIsNotNull() {
            addCriterion("JIECHE_PHONE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameEqualTo(String value) {
            addCriterion("JIECHE_PHONE_NAME =", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameNotEqualTo(String value) {
            addCriterion("JIECHE_PHONE_NAME <>", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameGreaterThan(String value) {
            addCriterion("JIECHE_PHONE_NAME >", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("JIECHE_PHONE_NAME >=", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameLessThan(String value) {
            addCriterion("JIECHE_PHONE_NAME <", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameLessThanOrEqualTo(String value) {
            addCriterion("JIECHE_PHONE_NAME <=", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameLike(String value) {
            addCriterion("JIECHE_PHONE_NAME like", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameNotLike(String value) {
            addCriterion("JIECHE_PHONE_NAME not like", value, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameIn(List<String> values) {
            addCriterion("JIECHE_PHONE_NAME in", values, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameNotIn(List<String> values) {
            addCriterion("JIECHE_PHONE_NAME not in", values, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameBetween(String value1, String value2) {
            addCriterion("JIECHE_PHONE_NAME between", value1, value2, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andJiechePhoneNameNotBetween(String value1, String value2) {
            addCriterion("JIECHE_PHONE_NAME not between", value1, value2, "jiechePhoneName");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeIsNull() {
            addCriterion("SAVE_VEHICLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeIsNotNull() {
            addCriterion("SAVE_VEHICLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeEqualTo(String value) {
            addCriterion("SAVE_VEHICLE_TYPE =", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeNotEqualTo(String value) {
            addCriterion("SAVE_VEHICLE_TYPE <>", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeGreaterThan(String value) {
            addCriterion("SAVE_VEHICLE_TYPE >", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SAVE_VEHICLE_TYPE >=", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeLessThan(String value) {
            addCriterion("SAVE_VEHICLE_TYPE <", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeLessThanOrEqualTo(String value) {
            addCriterion("SAVE_VEHICLE_TYPE <=", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeLike(String value) {
            addCriterion("SAVE_VEHICLE_TYPE like", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeNotLike(String value) {
            addCriterion("SAVE_VEHICLE_TYPE not like", value, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeIn(List<String> values) {
            addCriterion("SAVE_VEHICLE_TYPE in", values, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeNotIn(List<String> values) {
            addCriterion("SAVE_VEHICLE_TYPE not in", values, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeBetween(String value1, String value2) {
            addCriterion("SAVE_VEHICLE_TYPE between", value1, value2, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andSaveVehicleTypeNotBetween(String value1, String value2) {
            addCriterion("SAVE_VEHICLE_TYPE not between", value1, value2, "saveVehicleType");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripIsNull() {
            addCriterion("DISPATCH_DESCRIP is null");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripIsNotNull() {
            addCriterion("DISPATCH_DESCRIP is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripEqualTo(String value) {
            addCriterion("DISPATCH_DESCRIP =", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripNotEqualTo(String value) {
            addCriterion("DISPATCH_DESCRIP <>", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripGreaterThan(String value) {
            addCriterion("DISPATCH_DESCRIP >", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_DESCRIP >=", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripLessThan(String value) {
            addCriterion("DISPATCH_DESCRIP <", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_DESCRIP <=", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripLike(String value) {
            addCriterion("DISPATCH_DESCRIP like", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripNotLike(String value) {
            addCriterion("DISPATCH_DESCRIP not like", value, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripIn(List<String> values) {
            addCriterion("DISPATCH_DESCRIP in", values, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripNotIn(List<String> values) {
            addCriterion("DISPATCH_DESCRIP not in", values, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripBetween(String value1, String value2) {
            addCriterion("DISPATCH_DESCRIP between", value1, value2, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andDispatchDescripNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_DESCRIP not between", value1, value2, "dispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingIsNull() {
            addCriterion("IS_FIVE_RING is null");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingIsNotNull() {
            addCriterion("IS_FIVE_RING is not null");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingEqualTo(String value) {
            addCriterion("IS_FIVE_RING =", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingNotEqualTo(String value) {
            addCriterion("IS_FIVE_RING <>", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingGreaterThan(String value) {
            addCriterion("IS_FIVE_RING >", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FIVE_RING >=", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingLessThan(String value) {
            addCriterion("IS_FIVE_RING <", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingLessThanOrEqualTo(String value) {
            addCriterion("IS_FIVE_RING <=", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingLike(String value) {
            addCriterion("IS_FIVE_RING like", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingNotLike(String value) {
            addCriterion("IS_FIVE_RING not like", value, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingIn(List<String> values) {
            addCriterion("IS_FIVE_RING in", values, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingNotIn(List<String> values) {
            addCriterion("IS_FIVE_RING not in", values, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingBetween(String value1, String value2) {
            addCriterion("IS_FIVE_RING between", value1, value2, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andIsFiveRingNotBetween(String value1, String value2) {
            addCriterion("IS_FIVE_RING not between", value1, value2, "isFiveRing");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateIsNull() {
            addCriterion("ACCEPTANCE_ASK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateIsNotNull() {
            addCriterion("ACCEPTANCE_ASK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateEqualTo(Date value) {
            addCriterion("ACCEPTANCE_ASK_DATE =", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateNotEqualTo(Date value) {
            addCriterion("ACCEPTANCE_ASK_DATE <>", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateGreaterThan(Date value) {
            addCriterion("ACCEPTANCE_ASK_DATE >", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCEPTANCE_ASK_DATE >=", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateLessThan(Date value) {
            addCriterion("ACCEPTANCE_ASK_DATE <", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCEPTANCE_ASK_DATE <=", value, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateIn(List<Date> values) {
            addCriterion("ACCEPTANCE_ASK_DATE in", values, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateNotIn(List<Date> values) {
            addCriterion("ACCEPTANCE_ASK_DATE not in", values, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateBetween(Date value1, Date value2) {
            addCriterion("ACCEPTANCE_ASK_DATE between", value1, value2, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceAskDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCEPTANCE_ASK_DATE not between", value1, value2, "acceptanceAskDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateIsNull() {
            addCriterion("ACCEPTANCE_SUCCESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateIsNotNull() {
            addCriterion("ACCEPTANCE_SUCCESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateEqualTo(Date value) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE =", value, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateNotEqualTo(Date value) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE <>", value, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateGreaterThan(Date value) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE >", value, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE >=", value, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateLessThan(Date value) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE <", value, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE <=", value, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateIn(List<Date> values) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE in", values, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateNotIn(List<Date> values) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE not in", values, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateBetween(Date value1, Date value2) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE between", value1, value2, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceSuccessDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCEPTANCE_SUCCESS_DATE not between", value1, value2, "acceptanceSuccessDate");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagIsNull() {
            addCriterion("DEVOLVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagIsNotNull() {
            addCriterion("DEVOLVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagEqualTo(String value) {
            addCriterion("DEVOLVE_FLAG =", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagNotEqualTo(String value) {
            addCriterion("DEVOLVE_FLAG <>", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagGreaterThan(String value) {
            addCriterion("DEVOLVE_FLAG >", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEVOLVE_FLAG >=", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagLessThan(String value) {
            addCriterion("DEVOLVE_FLAG <", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagLessThanOrEqualTo(String value) {
            addCriterion("DEVOLVE_FLAG <=", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagLike(String value) {
            addCriterion("DEVOLVE_FLAG like", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagNotLike(String value) {
            addCriterion("DEVOLVE_FLAG not like", value, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagIn(List<String> values) {
            addCriterion("DEVOLVE_FLAG in", values, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagNotIn(List<String> values) {
            addCriterion("DEVOLVE_FLAG not in", values, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagBetween(String value1, String value2) {
            addCriterion("DEVOLVE_FLAG between", value1, value2, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andDevolveFlagNotBetween(String value1, String value2) {
            addCriterion("DEVOLVE_FLAG not between", value1, value2, "devolveFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagIsNull() {
            addCriterion("SMS_SEND_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagIsNotNull() {
            addCriterion("SMS_SEND_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagEqualTo(String value) {
            addCriterion("SMS_SEND_FLAG =", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagNotEqualTo(String value) {
            addCriterion("SMS_SEND_FLAG <>", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagGreaterThan(String value) {
            addCriterion("SMS_SEND_FLAG >", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_SEND_FLAG >=", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagLessThan(String value) {
            addCriterion("SMS_SEND_FLAG <", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagLessThanOrEqualTo(String value) {
            addCriterion("SMS_SEND_FLAG <=", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagLike(String value) {
            addCriterion("SMS_SEND_FLAG like", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagNotLike(String value) {
            addCriterion("SMS_SEND_FLAG not like", value, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagIn(List<String> values) {
            addCriterion("SMS_SEND_FLAG in", values, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagNotIn(List<String> values) {
            addCriterion("SMS_SEND_FLAG not in", values, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagBetween(String value1, String value2) {
            addCriterion("SMS_SEND_FLAG between", value1, value2, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andSmsSendFlagNotBetween(String value1, String value2) {
            addCriterion("SMS_SEND_FLAG not between", value1, value2, "smsSendFlag");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateIsNull() {
            addCriterion("LX_BTGS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateIsNotNull() {
            addCriterion("LX_BTGS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateEqualTo(String value) {
            addCriterion("LX_BTGS_STATE =", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateNotEqualTo(String value) {
            addCriterion("LX_BTGS_STATE <>", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateGreaterThan(String value) {
            addCriterion("LX_BTGS_STATE >", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_BTGS_STATE >=", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateLessThan(String value) {
            addCriterion("LX_BTGS_STATE <", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateLessThanOrEqualTo(String value) {
            addCriterion("LX_BTGS_STATE <=", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateLike(String value) {
            addCriterion("LX_BTGS_STATE like", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateNotLike(String value) {
            addCriterion("LX_BTGS_STATE not like", value, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateIn(List<String> values) {
            addCriterion("LX_BTGS_STATE in", values, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateNotIn(List<String> values) {
            addCriterion("LX_BTGS_STATE not in", values, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateBetween(String value1, String value2) {
            addCriterion("LX_BTGS_STATE between", value1, value2, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtgsStateNotBetween(String value1, String value2) {
            addCriterion("LX_BTGS_STATE not between", value1, value2, "lxBtgsState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateIsNull() {
            addCriterion("LX_BTWH_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateIsNotNull() {
            addCriterion("LX_BTWH_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateEqualTo(String value) {
            addCriterion("LX_BTWH_STATE =", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateNotEqualTo(String value) {
            addCriterion("LX_BTWH_STATE <>", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateGreaterThan(String value) {
            addCriterion("LX_BTWH_STATE >", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_BTWH_STATE >=", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateLessThan(String value) {
            addCriterion("LX_BTWH_STATE <", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateLessThanOrEqualTo(String value) {
            addCriterion("LX_BTWH_STATE <=", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateLike(String value) {
            addCriterion("LX_BTWH_STATE like", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateNotLike(String value) {
            addCriterion("LX_BTWH_STATE not like", value, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateIn(List<String> values) {
            addCriterion("LX_BTWH_STATE in", values, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateNotIn(List<String> values) {
            addCriterion("LX_BTWH_STATE not in", values, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateBetween(String value1, String value2) {
            addCriterion("LX_BTWH_STATE between", value1, value2, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxBtwhStateNotBetween(String value1, String value2) {
            addCriterion("LX_BTWH_STATE not between", value1, value2, "lxBtwhState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateIsNull() {
            addCriterion("LX_DPWZ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateIsNotNull() {
            addCriterion("LX_DPWZ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateEqualTo(String value) {
            addCriterion("LX_DPWZ_STATE =", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateNotEqualTo(String value) {
            addCriterion("LX_DPWZ_STATE <>", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateGreaterThan(String value) {
            addCriterion("LX_DPWZ_STATE >", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_DPWZ_STATE >=", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateLessThan(String value) {
            addCriterion("LX_DPWZ_STATE <", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateLessThanOrEqualTo(String value) {
            addCriterion("LX_DPWZ_STATE <=", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateLike(String value) {
            addCriterion("LX_DPWZ_STATE like", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateNotLike(String value) {
            addCriterion("LX_DPWZ_STATE not like", value, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateIn(List<String> values) {
            addCriterion("LX_DPWZ_STATE in", values, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateNotIn(List<String> values) {
            addCriterion("LX_DPWZ_STATE not in", values, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateBetween(String value1, String value2) {
            addCriterion("LX_DPWZ_STATE between", value1, value2, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxDpwzStateNotBetween(String value1, String value2) {
            addCriterion("LX_DPWZ_STATE not between", value1, value2, "lxDpwzState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateIsNull() {
            addCriterion("LX_FDLS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateIsNotNull() {
            addCriterion("LX_FDLS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateEqualTo(String value) {
            addCriterion("LX_FDLS_STATE =", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateNotEqualTo(String value) {
            addCriterion("LX_FDLS_STATE <>", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateGreaterThan(String value) {
            addCriterion("LX_FDLS_STATE >", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_FDLS_STATE >=", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateLessThan(String value) {
            addCriterion("LX_FDLS_STATE <", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateLessThanOrEqualTo(String value) {
            addCriterion("LX_FDLS_STATE <=", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateLike(String value) {
            addCriterion("LX_FDLS_STATE like", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateNotLike(String value) {
            addCriterion("LX_FDLS_STATE not like", value, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateIn(List<String> values) {
            addCriterion("LX_FDLS_STATE in", values, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateNotIn(List<String> values) {
            addCriterion("LX_FDLS_STATE not in", values, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateBetween(String value1, String value2) {
            addCriterion("LX_FDLS_STATE between", value1, value2, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxFdlsStateNotBetween(String value1, String value2) {
            addCriterion("LX_FDLS_STATE not between", value1, value2, "lxFdlsState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateIsNull() {
            addCriterion("LX_HHDL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateIsNotNull() {
            addCriterion("LX_HHDL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateEqualTo(String value) {
            addCriterion("LX_HHDL_STATE =", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateNotEqualTo(String value) {
            addCriterion("LX_HHDL_STATE <>", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateGreaterThan(String value) {
            addCriterion("LX_HHDL_STATE >", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_HHDL_STATE >=", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateLessThan(String value) {
            addCriterion("LX_HHDL_STATE <", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateLessThanOrEqualTo(String value) {
            addCriterion("LX_HHDL_STATE <=", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateLike(String value) {
            addCriterion("LX_HHDL_STATE like", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateNotLike(String value) {
            addCriterion("LX_HHDL_STATE not like", value, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateIn(List<String> values) {
            addCriterion("LX_HHDL_STATE in", values, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateNotIn(List<String> values) {
            addCriterion("LX_HHDL_STATE not in", values, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateBetween(String value1, String value2) {
            addCriterion("LX_HHDL_STATE between", value1, value2, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHhdlStateNotBetween(String value1, String value2) {
            addCriterion("LX_HHDL_STATE not between", value1, value2, "lxHhdlState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateIsNull() {
            addCriterion("LX_HTGJ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateIsNotNull() {
            addCriterion("LX_HTGJ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateEqualTo(String value) {
            addCriterion("LX_HTGJ_STATE =", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateNotEqualTo(String value) {
            addCriterion("LX_HTGJ_STATE <>", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateGreaterThan(String value) {
            addCriterion("LX_HTGJ_STATE >", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_HTGJ_STATE >=", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateLessThan(String value) {
            addCriterion("LX_HTGJ_STATE <", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateLessThanOrEqualTo(String value) {
            addCriterion("LX_HTGJ_STATE <=", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateLike(String value) {
            addCriterion("LX_HTGJ_STATE like", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateNotLike(String value) {
            addCriterion("LX_HTGJ_STATE not like", value, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateIn(List<String> values) {
            addCriterion("LX_HTGJ_STATE in", values, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateNotIn(List<String> values) {
            addCriterion("LX_HTGJ_STATE not in", values, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateBetween(String value1, String value2) {
            addCriterion("LX_HTGJ_STATE between", value1, value2, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxHtgjStateNotBetween(String value1, String value2) {
            addCriterion("LX_HTGJ_STATE not between", value1, value2, "lxHtgjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateIsNull() {
            addCriterion("LX_JYGJ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateIsNotNull() {
            addCriterion("LX_JYGJ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateEqualTo(String value) {
            addCriterion("LX_JYGJ_STATE =", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateNotEqualTo(String value) {
            addCriterion("LX_JYGJ_STATE <>", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateGreaterThan(String value) {
            addCriterion("LX_JYGJ_STATE >", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_JYGJ_STATE >=", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateLessThan(String value) {
            addCriterion("LX_JYGJ_STATE <", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateLessThanOrEqualTo(String value) {
            addCriterion("LX_JYGJ_STATE <=", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateLike(String value) {
            addCriterion("LX_JYGJ_STATE like", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateNotLike(String value) {
            addCriterion("LX_JYGJ_STATE not like", value, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateIn(List<String> values) {
            addCriterion("LX_JYGJ_STATE in", values, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateNotIn(List<String> values) {
            addCriterion("LX_JYGJ_STATE not in", values, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateBetween(String value1, String value2) {
            addCriterion("LX_JYGJ_STATE between", value1, value2, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxJygjStateNotBetween(String value1, String value2) {
            addCriterion("LX_JYGJ_STATE not between", value1, value2, "lxJygjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateIsNull() {
            addCriterion("LX_KJ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxKjStateIsNotNull() {
            addCriterion("LX_KJ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxKjStateEqualTo(String value) {
            addCriterion("LX_KJ_STATE =", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateNotEqualTo(String value) {
            addCriterion("LX_KJ_STATE <>", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateGreaterThan(String value) {
            addCriterion("LX_KJ_STATE >", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_KJ_STATE >=", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateLessThan(String value) {
            addCriterion("LX_KJ_STATE <", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateLessThanOrEqualTo(String value) {
            addCriterion("LX_KJ_STATE <=", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateLike(String value) {
            addCriterion("LX_KJ_STATE like", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateNotLike(String value) {
            addCriterion("LX_KJ_STATE not like", value, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateIn(List<String> values) {
            addCriterion("LX_KJ_STATE in", values, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateNotIn(List<String> values) {
            addCriterion("LX_KJ_STATE not in", values, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateBetween(String value1, String value2) {
            addCriterion("LX_KJ_STATE between", value1, value2, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxKjStateNotBetween(String value1, String value2) {
            addCriterion("LX_KJ_STATE not between", value1, value2, "lxKjState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateIsNull() {
            addCriterion("LX_RYLX_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateIsNotNull() {
            addCriterion("LX_RYLX_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateEqualTo(String value) {
            addCriterion("LX_RYLX_STATE =", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateNotEqualTo(String value) {
            addCriterion("LX_RYLX_STATE <>", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateGreaterThan(String value) {
            addCriterion("LX_RYLX_STATE >", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_RYLX_STATE >=", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateLessThan(String value) {
            addCriterion("LX_RYLX_STATE <", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateLessThanOrEqualTo(String value) {
            addCriterion("LX_RYLX_STATE <=", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateLike(String value) {
            addCriterion("LX_RYLX_STATE like", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateNotLike(String value) {
            addCriterion("LX_RYLX_STATE not like", value, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateIn(List<String> values) {
            addCriterion("LX_RYLX_STATE in", values, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateNotIn(List<String> values) {
            addCriterion("LX_RYLX_STATE not in", values, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateBetween(String value1, String value2) {
            addCriterion("LX_RYLX_STATE between", value1, value2, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxRylxStateNotBetween(String value1, String value2) {
            addCriterion("LX_RYLX_STATE not between", value1, value2, "lxRylxState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateIsNull() {
            addCriterion("LX_SFGZ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateIsNotNull() {
            addCriterion("LX_SFGZ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateEqualTo(String value) {
            addCriterion("LX_SFGZ_STATE =", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateNotEqualTo(String value) {
            addCriterion("LX_SFGZ_STATE <>", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateGreaterThan(String value) {
            addCriterion("LX_SFGZ_STATE >", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_SFGZ_STATE >=", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateLessThan(String value) {
            addCriterion("LX_SFGZ_STATE <", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateLessThanOrEqualTo(String value) {
            addCriterion("LX_SFGZ_STATE <=", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateLike(String value) {
            addCriterion("LX_SFGZ_STATE like", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateNotLike(String value) {
            addCriterion("LX_SFGZ_STATE not like", value, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateIn(List<String> values) {
            addCriterion("LX_SFGZ_STATE in", values, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateNotIn(List<String> values) {
            addCriterion("LX_SFGZ_STATE not in", values, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateBetween(String value1, String value2) {
            addCriterion("LX_SFGZ_STATE between", value1, value2, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfgzStateNotBetween(String value1, String value2) {
            addCriterion("LX_SFGZ_STATE not between", value1, value2, "lxSfgzState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateIsNull() {
            addCriterion("LX_SFYBT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateIsNotNull() {
            addCriterion("LX_SFYBT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateEqualTo(String value) {
            addCriterion("LX_SFYBT_STATE =", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateNotEqualTo(String value) {
            addCriterion("LX_SFYBT_STATE <>", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateGreaterThan(String value) {
            addCriterion("LX_SFYBT_STATE >", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_SFYBT_STATE >=", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateLessThan(String value) {
            addCriterion("LX_SFYBT_STATE <", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateLessThanOrEqualTo(String value) {
            addCriterion("LX_SFYBT_STATE <=", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateLike(String value) {
            addCriterion("LX_SFYBT_STATE like", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateNotLike(String value) {
            addCriterion("LX_SFYBT_STATE not like", value, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateIn(List<String> values) {
            addCriterion("LX_SFYBT_STATE in", values, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateNotIn(List<String> values) {
            addCriterion("LX_SFYBT_STATE not in", values, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateBetween(String value1, String value2) {
            addCriterion("LX_SFYBT_STATE between", value1, value2, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxSfybtStateNotBetween(String value1, String value2) {
            addCriterion("LX_SFYBT_STATE not between", value1, value2, "lxSfybtState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateIsNull() {
            addCriterion("LX_WZ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLxWzStateIsNotNull() {
            addCriterion("LX_WZ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLxWzStateEqualTo(String value) {
            addCriterion("LX_WZ_STATE =", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateNotEqualTo(String value) {
            addCriterion("LX_WZ_STATE <>", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateGreaterThan(String value) {
            addCriterion("LX_WZ_STATE >", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateGreaterThanOrEqualTo(String value) {
            addCriterion("LX_WZ_STATE >=", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateLessThan(String value) {
            addCriterion("LX_WZ_STATE <", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateLessThanOrEqualTo(String value) {
            addCriterion("LX_WZ_STATE <=", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateLike(String value) {
            addCriterion("LX_WZ_STATE like", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateNotLike(String value) {
            addCriterion("LX_WZ_STATE not like", value, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateIn(List<String> values) {
            addCriterion("LX_WZ_STATE in", values, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateNotIn(List<String> values) {
            addCriterion("LX_WZ_STATE not in", values, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateBetween(String value1, String value2) {
            addCriterion("LX_WZ_STATE between", value1, value2, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxWzStateNotBetween(String value1, String value2) {
            addCriterion("LX_WZ_STATE not between", value1, value2, "lxWzState");
            return (Criteria) this;
        }

        public Criteria andLxYhIsNull() {
            addCriterion("LX_YH is null");
            return (Criteria) this;
        }

        public Criteria andLxYhIsNotNull() {
            addCriterion("LX_YH is not null");
            return (Criteria) this;
        }

        public Criteria andLxYhEqualTo(String value) {
            addCriterion("LX_YH =", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhNotEqualTo(String value) {
            addCriterion("LX_YH <>", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhGreaterThan(String value) {
            addCriterion("LX_YH >", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhGreaterThanOrEqualTo(String value) {
            addCriterion("LX_YH >=", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhLessThan(String value) {
            addCriterion("LX_YH <", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhLessThanOrEqualTo(String value) {
            addCriterion("LX_YH <=", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhLike(String value) {
            addCriterion("LX_YH like", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhNotLike(String value) {
            addCriterion("LX_YH not like", value, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhIn(List<String> values) {
            addCriterion("LX_YH in", values, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhNotIn(List<String> values) {
            addCriterion("LX_YH not in", values, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhBetween(String value1, String value2) {
            addCriterion("LX_YH between", value1, value2, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxYhNotBetween(String value1, String value2) {
            addCriterion("LX_YH not between", value1, value2, "lxYh");
            return (Criteria) this;
        }

        public Criteria andLxSsIsNull() {
            addCriterion("LX_SS is null");
            return (Criteria) this;
        }

        public Criteria andLxSsIsNotNull() {
            addCriterion("LX_SS is not null");
            return (Criteria) this;
        }

        public Criteria andLxSsEqualTo(Double value) {
            addCriterion("LX_SS =", value, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsNotEqualTo(Double value) {
            addCriterion("LX_SS <>", value, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsGreaterThan(Double value) {
            addCriterion("LX_SS >", value, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsGreaterThanOrEqualTo(Double value) {
            addCriterion("LX_SS >=", value, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsLessThan(Double value) {
            addCriterion("LX_SS <", value, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsLessThanOrEqualTo(Double value) {
            addCriterion("LX_SS <=", value, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsIn(List<Double> values) {
            addCriterion("LX_SS in", values, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsNotIn(List<Double> values) {
            addCriterion("LX_SS not in", values, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsBetween(Double value1, Double value2) {
            addCriterion("LX_SS between", value1, value2, "lxSs");
            return (Criteria) this;
        }

        public Criteria andLxSsNotBetween(Double value1, Double value2) {
            addCriterion("LX_SS not between", value1, value2, "lxSs");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeIsNull() {
            addCriterion("TC_CLWZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeIsNotNull() {
            addCriterion("TC_CLWZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeEqualTo(String value) {
            addCriterion("TC_CLWZ_TYPE =", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeNotEqualTo(String value) {
            addCriterion("TC_CLWZ_TYPE <>", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeGreaterThan(String value) {
            addCriterion("TC_CLWZ_TYPE >", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TC_CLWZ_TYPE >=", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeLessThan(String value) {
            addCriterion("TC_CLWZ_TYPE <", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeLessThanOrEqualTo(String value) {
            addCriterion("TC_CLWZ_TYPE <=", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeLike(String value) {
            addCriterion("TC_CLWZ_TYPE like", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeNotLike(String value) {
            addCriterion("TC_CLWZ_TYPE not like", value, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeIn(List<String> values) {
            addCriterion("TC_CLWZ_TYPE in", values, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeNotIn(List<String> values) {
            addCriterion("TC_CLWZ_TYPE not in", values, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeBetween(String value1, String value2) {
            addCriterion("TC_CLWZ_TYPE between", value1, value2, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcClwzTypeNotBetween(String value1, String value2) {
            addCriterion("TC_CLWZ_TYPE not between", value1, value2, "tcClwzType");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateIsNull() {
            addCriterion("TC_FXP_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateIsNotNull() {
            addCriterion("TC_FXP_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateEqualTo(String value) {
            addCriterion("TC_FXP_STATE =", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateNotEqualTo(String value) {
            addCriterion("TC_FXP_STATE <>", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateGreaterThan(String value) {
            addCriterion("TC_FXP_STATE >", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_FXP_STATE >=", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateLessThan(String value) {
            addCriterion("TC_FXP_STATE <", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateLessThanOrEqualTo(String value) {
            addCriterion("TC_FXP_STATE <=", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateLike(String value) {
            addCriterion("TC_FXP_STATE like", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateNotLike(String value) {
            addCriterion("TC_FXP_STATE not like", value, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateIn(List<String> values) {
            addCriterion("TC_FXP_STATE in", values, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateNotIn(List<String> values) {
            addCriterion("TC_FXP_STATE not in", values, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateBetween(String value1, String value2) {
            addCriterion("TC_FXP_STATE between", value1, value2, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcFxpStateNotBetween(String value1, String value2) {
            addCriterion("TC_FXP_STATE not between", value1, value2, "tcFxpState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateIsNull() {
            addCriterion("TC_JSD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateIsNotNull() {
            addCriterion("TC_JSD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateEqualTo(String value) {
            addCriterion("TC_JSD_STATE =", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateNotEqualTo(String value) {
            addCriterion("TC_JSD_STATE <>", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateGreaterThan(String value) {
            addCriterion("TC_JSD_STATE >", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_JSD_STATE >=", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateLessThan(String value) {
            addCriterion("TC_JSD_STATE <", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateLessThanOrEqualTo(String value) {
            addCriterion("TC_JSD_STATE <=", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateLike(String value) {
            addCriterion("TC_JSD_STATE like", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateNotLike(String value) {
            addCriterion("TC_JSD_STATE not like", value, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateIn(List<String> values) {
            addCriterion("TC_JSD_STATE in", values, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateNotIn(List<String> values) {
            addCriterion("TC_JSD_STATE not in", values, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateBetween(String value1, String value2) {
            addCriterion("TC_JSD_STATE between", value1, value2, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcJsdStateNotBetween(String value1, String value2) {
            addCriterion("TC_JSD_STATE not between", value1, value2, "tcJsdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateIsNull() {
            addCriterion("TC_PD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcPdStateIsNotNull() {
            addCriterion("TC_PD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcPdStateEqualTo(String value) {
            addCriterion("TC_PD_STATE =", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateNotEqualTo(String value) {
            addCriterion("TC_PD_STATE <>", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateGreaterThan(String value) {
            addCriterion("TC_PD_STATE >", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_PD_STATE >=", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateLessThan(String value) {
            addCriterion("TC_PD_STATE <", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateLessThanOrEqualTo(String value) {
            addCriterion("TC_PD_STATE <=", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateLike(String value) {
            addCriterion("TC_PD_STATE like", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateNotLike(String value) {
            addCriterion("TC_PD_STATE not like", value, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateIn(List<String> values) {
            addCriterion("TC_PD_STATE in", values, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateNotIn(List<String> values) {
            addCriterion("TC_PD_STATE not in", values, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateBetween(String value1, String value2) {
            addCriterion("TC_PD_STATE between", value1, value2, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcPdStateNotBetween(String value1, String value2) {
            addCriterion("TC_PD_STATE not between", value1, value2, "tcPdState");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeIsNull() {
            addCriterion("TC_SHOUSHA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeIsNotNull() {
            addCriterion("TC_SHOUSHA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeEqualTo(String value) {
            addCriterion("TC_SHOUSHA_TYPE =", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeNotEqualTo(String value) {
            addCriterion("TC_SHOUSHA_TYPE <>", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeGreaterThan(String value) {
            addCriterion("TC_SHOUSHA_TYPE >", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TC_SHOUSHA_TYPE >=", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeLessThan(String value) {
            addCriterion("TC_SHOUSHA_TYPE <", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeLessThanOrEqualTo(String value) {
            addCriterion("TC_SHOUSHA_TYPE <=", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeLike(String value) {
            addCriterion("TC_SHOUSHA_TYPE like", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeNotLike(String value) {
            addCriterion("TC_SHOUSHA_TYPE not like", value, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeIn(List<String> values) {
            addCriterion("TC_SHOUSHA_TYPE in", values, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeNotIn(List<String> values) {
            addCriterion("TC_SHOUSHA_TYPE not in", values, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeBetween(String value1, String value2) {
            addCriterion("TC_SHOUSHA_TYPE between", value1, value2, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcShoushaTypeNotBetween(String value1, String value2) {
            addCriterion("TC_SHOUSHA_TYPE not between", value1, value2, "tcShoushaType");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateIsNull() {
            addCriterion("TC_TCG_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateIsNotNull() {
            addCriterion("TC_TCG_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateEqualTo(String value) {
            addCriterion("TC_TCG_STATE =", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateNotEqualTo(String value) {
            addCriterion("TC_TCG_STATE <>", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateGreaterThan(String value) {
            addCriterion("TC_TCG_STATE >", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_TCG_STATE >=", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateLessThan(String value) {
            addCriterion("TC_TCG_STATE <", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateLessThanOrEqualTo(String value) {
            addCriterion("TC_TCG_STATE <=", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateLike(String value) {
            addCriterion("TC_TCG_STATE like", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateNotLike(String value) {
            addCriterion("TC_TCG_STATE not like", value, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateIn(List<String> values) {
            addCriterion("TC_TCG_STATE in", values, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateNotIn(List<String> values) {
            addCriterion("TC_TCG_STATE not in", values, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateBetween(String value1, String value2) {
            addCriterion("TC_TCG_STATE between", value1, value2, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTcgStateNotBetween(String value1, String value2) {
            addCriterion("TC_TCG_STATE not between", value1, value2, "tcTcgState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateIsNull() {
            addCriterion("TC_TCKJ_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateIsNotNull() {
            addCriterion("TC_TCKJ_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateEqualTo(String value) {
            addCriterion("TC_TCKJ_STATE =", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateNotEqualTo(String value) {
            addCriterion("TC_TCKJ_STATE <>", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateGreaterThan(String value) {
            addCriterion("TC_TCKJ_STATE >", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_TCKJ_STATE >=", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateLessThan(String value) {
            addCriterion("TC_TCKJ_STATE <", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateLessThanOrEqualTo(String value) {
            addCriterion("TC_TCKJ_STATE <=", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateLike(String value) {
            addCriterion("TC_TCKJ_STATE like", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateNotLike(String value) {
            addCriterion("TC_TCKJ_STATE not like", value, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateIn(List<String> values) {
            addCriterion("TC_TCKJ_STATE in", values, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateNotIn(List<String> values) {
            addCriterion("TC_TCKJ_STATE not in", values, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateBetween(String value1, String value2) {
            addCriterion("TC_TCKJ_STATE between", value1, value2, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcTckjStateNotBetween(String value1, String value2) {
            addCriterion("TC_TCKJ_STATE not between", value1, value2, "tcTckjState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateIsNull() {
            addCriterion("TC_WD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcWdStateIsNotNull() {
            addCriterion("TC_WD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcWdStateEqualTo(String value) {
            addCriterion("TC_WD_STATE =", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateNotEqualTo(String value) {
            addCriterion("TC_WD_STATE <>", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateGreaterThan(String value) {
            addCriterion("TC_WD_STATE >", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_WD_STATE >=", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateLessThan(String value) {
            addCriterion("TC_WD_STATE <", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateLessThanOrEqualTo(String value) {
            addCriterion("TC_WD_STATE <=", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateLike(String value) {
            addCriterion("TC_WD_STATE like", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateNotLike(String value) {
            addCriterion("TC_WD_STATE not like", value, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateIn(List<String> values) {
            addCriterion("TC_WD_STATE in", values, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateNotIn(List<String> values) {
            addCriterion("TC_WD_STATE not in", values, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateBetween(String value1, String value2) {
            addCriterion("TC_WD_STATE between", value1, value2, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcWdStateNotBetween(String value1, String value2) {
            addCriterion("TC_WD_STATE not between", value1, value2, "tcWdState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateIsNull() {
            addCriterion("TC_XG_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcXgStateIsNotNull() {
            addCriterion("TC_XG_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcXgStateEqualTo(String value) {
            addCriterion("TC_XG_STATE =", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateNotEqualTo(String value) {
            addCriterion("TC_XG_STATE <>", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateGreaterThan(String value) {
            addCriterion("TC_XG_STATE >", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_XG_STATE >=", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateLessThan(String value) {
            addCriterion("TC_XG_STATE <", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateLessThanOrEqualTo(String value) {
            addCriterion("TC_XG_STATE <=", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateLike(String value) {
            addCriterion("TC_XG_STATE like", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateNotLike(String value) {
            addCriterion("TC_XG_STATE not like", value, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateIn(List<String> values) {
            addCriterion("TC_XG_STATE in", values, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateNotIn(List<String> values) {
            addCriterion("TC_XG_STATE not in", values, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateBetween(String value1, String value2) {
            addCriterion("TC_XG_STATE between", value1, value2, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcXgStateNotBetween(String value1, String value2) {
            addCriterion("TC_XG_STATE not between", value1, value2, "tcXgState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateIsNull() {
            addCriterion("TC_DW_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTcDwStateIsNotNull() {
            addCriterion("TC_DW_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTcDwStateEqualTo(String value) {
            addCriterion("TC_DW_STATE =", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateNotEqualTo(String value) {
            addCriterion("TC_DW_STATE <>", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateGreaterThan(String value) {
            addCriterion("TC_DW_STATE >", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateGreaterThanOrEqualTo(String value) {
            addCriterion("TC_DW_STATE >=", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateLessThan(String value) {
            addCriterion("TC_DW_STATE <", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateLessThanOrEqualTo(String value) {
            addCriterion("TC_DW_STATE <=", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateLike(String value) {
            addCriterion("TC_DW_STATE like", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateNotLike(String value) {
            addCriterion("TC_DW_STATE not like", value, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateIn(List<String> values) {
            addCriterion("TC_DW_STATE in", values, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateNotIn(List<String> values) {
            addCriterion("TC_DW_STATE not in", values, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateBetween(String value1, String value2) {
            addCriterion("TC_DW_STATE between", value1, value2, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcDwStateNotBetween(String value1, String value2) {
            addCriterion("TC_DW_STATE not between", value1, value2, "tcDwState");
            return (Criteria) this;
        }

        public Criteria andTcCkIsNull() {
            addCriterion("TC_CK is null");
            return (Criteria) this;
        }

        public Criteria andTcCkIsNotNull() {
            addCriterion("TC_CK is not null");
            return (Criteria) this;
        }

        public Criteria andTcCkEqualTo(String value) {
            addCriterion("TC_CK =", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkNotEqualTo(String value) {
            addCriterion("TC_CK <>", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkGreaterThan(String value) {
            addCriterion("TC_CK >", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkGreaterThanOrEqualTo(String value) {
            addCriterion("TC_CK >=", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkLessThan(String value) {
            addCriterion("TC_CK <", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkLessThanOrEqualTo(String value) {
            addCriterion("TC_CK <=", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkLike(String value) {
            addCriterion("TC_CK like", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkNotLike(String value) {
            addCriterion("TC_CK not like", value, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkIn(List<String> values) {
            addCriterion("TC_CK in", values, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkNotIn(List<String> values) {
            addCriterion("TC_CK not in", values, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkBetween(String value1, String value2) {
            addCriterion("TC_CK between", value1, value2, "tcCk");
            return (Criteria) this;
        }

        public Criteria andTcCkNotBetween(String value1, String value2) {
            addCriterion("TC_CK not between", value1, value2, "tcCk");
            return (Criteria) this;
        }

        public Criteria andAwaitDateIsNull() {
            addCriterion("AWAIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAwaitDateIsNotNull() {
            addCriterion("AWAIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAwaitDateEqualTo(Date value) {
            addCriterion("AWAIT_DATE =", value, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateNotEqualTo(Date value) {
            addCriterion("AWAIT_DATE <>", value, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateGreaterThan(Date value) {
            addCriterion("AWAIT_DATE >", value, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AWAIT_DATE >=", value, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateLessThan(Date value) {
            addCriterion("AWAIT_DATE <", value, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateLessThanOrEqualTo(Date value) {
            addCriterion("AWAIT_DATE <=", value, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateIn(List<Date> values) {
            addCriterion("AWAIT_DATE in", values, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateNotIn(List<Date> values) {
            addCriterion("AWAIT_DATE not in", values, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateBetween(Date value1, Date value2) {
            addCriterion("AWAIT_DATE between", value1, value2, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitDateNotBetween(Date value1, Date value2) {
            addCriterion("AWAIT_DATE not between", value1, value2, "awaitDate");
            return (Criteria) this;
        }

        public Criteria andAwaitStateIsNull() {
            addCriterion("AWAIT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAwaitStateIsNotNull() {
            addCriterion("AWAIT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAwaitStateEqualTo(String value) {
            addCriterion("AWAIT_STATE =", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateNotEqualTo(String value) {
            addCriterion("AWAIT_STATE <>", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateGreaterThan(String value) {
            addCriterion("AWAIT_STATE >", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateGreaterThanOrEqualTo(String value) {
            addCriterion("AWAIT_STATE >=", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateLessThan(String value) {
            addCriterion("AWAIT_STATE <", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateLessThanOrEqualTo(String value) {
            addCriterion("AWAIT_STATE <=", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateLike(String value) {
            addCriterion("AWAIT_STATE like", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateNotLike(String value) {
            addCriterion("AWAIT_STATE not like", value, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateIn(List<String> values) {
            addCriterion("AWAIT_STATE in", values, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateNotIn(List<String> values) {
            addCriterion("AWAIT_STATE not in", values, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateBetween(String value1, String value2) {
            addCriterion("AWAIT_STATE between", value1, value2, "awaitState");
            return (Criteria) this;
        }

        public Criteria andAwaitStateNotBetween(String value1, String value2) {
            addCriterion("AWAIT_STATE not between", value1, value2, "awaitState");
            return (Criteria) this;
        }
    }

    /**
     * lp_flow_task
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * lp_flow_task 2016-08-18
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