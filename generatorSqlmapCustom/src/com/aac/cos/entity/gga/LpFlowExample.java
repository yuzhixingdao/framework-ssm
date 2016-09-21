package com.aac.cos.entity.gga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LpFlowExample {
    /**
     * lp_flow
     */
    protected String orderByClause;

    /**
     * lp_flow
     */
    protected boolean distinct;

    /**
     * lp_flow
     */
    protected List<Criteria> oredCriteria;

    public LpFlowExample() {
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
     * lp_flow 2016-08-18
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

        public Criteria andClaimIdIsNull() {
            addCriterion("CLAIM_ID is null");
            return (Criteria) this;
        }

        public Criteria andClaimIdIsNotNull() {
            addCriterion("CLAIM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClaimIdEqualTo(String value) {
            addCriterion("CLAIM_ID =", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotEqualTo(String value) {
            addCriterion("CLAIM_ID <>", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdGreaterThan(String value) {
            addCriterion("CLAIM_ID >", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIM_ID >=", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdLessThan(String value) {
            addCriterion("CLAIM_ID <", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdLessThanOrEqualTo(String value) {
            addCriterion("CLAIM_ID <=", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdLike(String value) {
            addCriterion("CLAIM_ID like", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotLike(String value) {
            addCriterion("CLAIM_ID not like", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdIn(List<String> values) {
            addCriterion("CLAIM_ID in", values, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotIn(List<String> values) {
            addCriterion("CLAIM_ID not in", values, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdBetween(String value1, String value2) {
            addCriterion("CLAIM_ID between", value1, value2, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotBetween(String value1, String value2) {
            addCriterion("CLAIM_ID not between", value1, value2, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdIsNull() {
            addCriterion("CLAIM_FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdIsNotNull() {
            addCriterion("CLAIM_FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdEqualTo(String value) {
            addCriterion("CLAIM_FLOW_ID =", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdNotEqualTo(String value) {
            addCriterion("CLAIM_FLOW_ID <>", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdGreaterThan(String value) {
            addCriterion("CLAIM_FLOW_ID >", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIM_FLOW_ID >=", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdLessThan(String value) {
            addCriterion("CLAIM_FLOW_ID <", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdLessThanOrEqualTo(String value) {
            addCriterion("CLAIM_FLOW_ID <=", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdLike(String value) {
            addCriterion("CLAIM_FLOW_ID like", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdNotLike(String value) {
            addCriterion("CLAIM_FLOW_ID not like", value, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdIn(List<String> values) {
            addCriterion("CLAIM_FLOW_ID in", values, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdNotIn(List<String> values) {
            addCriterion("CLAIM_FLOW_ID not in", values, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdBetween(String value1, String value2) {
            addCriterion("CLAIM_FLOW_ID between", value1, value2, "claimFlowId");
            return (Criteria) this;
        }

        public Criteria andClaimFlowIdNotBetween(String value1, String value2) {
            addCriterion("CLAIM_FLOW_ID not between", value1, value2, "claimFlowId");
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

        public Criteria andFlowCodeIsNull() {
            addCriterion("FLOW_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIsNotNull() {
            addCriterion("FLOW_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCodeEqualTo(String value) {
            addCriterion("FLOW_CODE =", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotEqualTo(String value) {
            addCriterion("FLOW_CODE <>", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeGreaterThan(String value) {
            addCriterion("FLOW_CODE >", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_CODE >=", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLessThan(String value) {
            addCriterion("FLOW_CODE <", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLessThanOrEqualTo(String value) {
            addCriterion("FLOW_CODE <=", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLike(String value) {
            addCriterion("FLOW_CODE like", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotLike(String value) {
            addCriterion("FLOW_CODE not like", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIn(List<String> values) {
            addCriterion("FLOW_CODE in", values, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotIn(List<String> values) {
            addCriterion("FLOW_CODE not in", values, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeBetween(String value1, String value2) {
            addCriterion("FLOW_CODE between", value1, value2, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotBetween(String value1, String value2) {
            addCriterion("FLOW_CODE not between", value1, value2, "flowCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeIsNull() {
            addCriterion("TASK_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeIsNotNull() {
            addCriterion("TASK_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeEqualTo(String value) {
            addCriterion("TASK_TYPE_CODE =", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeNotEqualTo(String value) {
            addCriterion("TASK_TYPE_CODE <>", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeGreaterThan(String value) {
            addCriterion("TASK_TYPE_CODE >", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE_CODE >=", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeLessThan(String value) {
            addCriterion("TASK_TYPE_CODE <", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE_CODE <=", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeLike(String value) {
            addCriterion("TASK_TYPE_CODE like", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeNotLike(String value) {
            addCriterion("TASK_TYPE_CODE not like", value, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeIn(List<String> values) {
            addCriterion("TASK_TYPE_CODE in", values, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeNotIn(List<String> values) {
            addCriterion("TASK_TYPE_CODE not in", values, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE_CODE between", value1, value2, "taskTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeCodeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE_CODE not between", value1, value2, "taskTypeCode");
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

        public Criteria andLastStateCodeIsNull() {
            addCriterion("LAST_STATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeIsNotNull() {
            addCriterion("LAST_STATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeEqualTo(String value) {
            addCriterion("LAST_STATE_CODE =", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeNotEqualTo(String value) {
            addCriterion("LAST_STATE_CODE <>", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeGreaterThan(String value) {
            addCriterion("LAST_STATE_CODE >", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_STATE_CODE >=", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeLessThan(String value) {
            addCriterion("LAST_STATE_CODE <", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeLessThanOrEqualTo(String value) {
            addCriterion("LAST_STATE_CODE <=", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeLike(String value) {
            addCriterion("LAST_STATE_CODE like", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeNotLike(String value) {
            addCriterion("LAST_STATE_CODE not like", value, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeIn(List<String> values) {
            addCriterion("LAST_STATE_CODE in", values, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeNotIn(List<String> values) {
            addCriterion("LAST_STATE_CODE not in", values, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeBetween(String value1, String value2) {
            addCriterion("LAST_STATE_CODE between", value1, value2, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andLastStateCodeNotBetween(String value1, String value2) {
            addCriterion("LAST_STATE_CODE not between", value1, value2, "lastStateCode");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagIsNull() {
            addCriterion("COMPLETED_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagIsNotNull() {
            addCriterion("COMPLETED_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagEqualTo(String value) {
            addCriterion("COMPLETED_FLAG =", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagNotEqualTo(String value) {
            addCriterion("COMPLETED_FLAG <>", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagGreaterThan(String value) {
            addCriterion("COMPLETED_FLAG >", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLETED_FLAG >=", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagLessThan(String value) {
            addCriterion("COMPLETED_FLAG <", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagLessThanOrEqualTo(String value) {
            addCriterion("COMPLETED_FLAG <=", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagLike(String value) {
            addCriterion("COMPLETED_FLAG like", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagNotLike(String value) {
            addCriterion("COMPLETED_FLAG not like", value, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagIn(List<String> values) {
            addCriterion("COMPLETED_FLAG in", values, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagNotIn(List<String> values) {
            addCriterion("COMPLETED_FLAG not in", values, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagBetween(String value1, String value2) {
            addCriterion("COMPLETED_FLAG between", value1, value2, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andCompletedFlagNotBetween(String value1, String value2) {
            addCriterion("COMPLETED_FLAG not between", value1, value2, "completedFlag");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeIsNull() {
            addCriterion("CHILD_STATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeIsNotNull() {
            addCriterion("CHILD_STATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeEqualTo(String value) {
            addCriterion("CHILD_STATE_CODE =", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeNotEqualTo(String value) {
            addCriterion("CHILD_STATE_CODE <>", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeGreaterThan(String value) {
            addCriterion("CHILD_STATE_CODE >", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHILD_STATE_CODE >=", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeLessThan(String value) {
            addCriterion("CHILD_STATE_CODE <", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeLessThanOrEqualTo(String value) {
            addCriterion("CHILD_STATE_CODE <=", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeLike(String value) {
            addCriterion("CHILD_STATE_CODE like", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeNotLike(String value) {
            addCriterion("CHILD_STATE_CODE not like", value, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeIn(List<String> values) {
            addCriterion("CHILD_STATE_CODE in", values, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeNotIn(List<String> values) {
            addCriterion("CHILD_STATE_CODE not in", values, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeBetween(String value1, String value2) {
            addCriterion("CHILD_STATE_CODE between", value1, value2, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andChildStateCodeNotBetween(String value1, String value2) {
            addCriterion("CHILD_STATE_CODE not between", value1, value2, "childStateCode");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNull() {
            addCriterion("TASK_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNotNull() {
            addCriterion("TASK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNoEqualTo(String value) {
            addCriterion("TASK_NO =", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotEqualTo(String value) {
            addCriterion("TASK_NO <>", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThan(String value) {
            addCriterion("TASK_NO >", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NO >=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThan(String value) {
            addCriterion("TASK_NO <", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThanOrEqualTo(String value) {
            addCriterion("TASK_NO <=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLike(String value) {
            addCriterion("TASK_NO like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotLike(String value) {
            addCriterion("TASK_NO not like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoIn(List<String> values) {
            addCriterion("TASK_NO in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotIn(List<String> values) {
            addCriterion("TASK_NO not in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoBetween(String value1, String value2) {
            addCriterion("TASK_NO between", value1, value2, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotBetween(String value1, String value2) {
            addCriterion("TASK_NO not between", value1, value2, "taskNo");
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

        public Criteria andPolicyCodeIsNull() {
            addCriterion("POLICY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeIsNotNull() {
            addCriterion("POLICY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeEqualTo(String value) {
            addCriterion("POLICY_CODE =", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotEqualTo(String value) {
            addCriterion("POLICY_CODE <>", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeGreaterThan(String value) {
            addCriterion("POLICY_CODE >", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_CODE >=", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeLessThan(String value) {
            addCriterion("POLICY_CODE <", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeLessThanOrEqualTo(String value) {
            addCriterion("POLICY_CODE <=", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeLike(String value) {
            addCriterion("POLICY_CODE like", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotLike(String value) {
            addCriterion("POLICY_CODE not like", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeIn(List<String> values) {
            addCriterion("POLICY_CODE in", values, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotIn(List<String> values) {
            addCriterion("POLICY_CODE not in", values, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeBetween(String value1, String value2) {
            addCriterion("POLICY_CODE between", value1, value2, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotBetween(String value1, String value2) {
            addCriterion("POLICY_CODE not between", value1, value2, "policyCode");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonIsNull() {
            addCriterion("INSURANT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonIsNotNull() {
            addCriterion("INSURANT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonEqualTo(String value) {
            addCriterion("INSURANT_PERSON =", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonNotEqualTo(String value) {
            addCriterion("INSURANT_PERSON <>", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonGreaterThan(String value) {
            addCriterion("INSURANT_PERSON >", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANT_PERSON >=", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonLessThan(String value) {
            addCriterion("INSURANT_PERSON <", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonLessThanOrEqualTo(String value) {
            addCriterion("INSURANT_PERSON <=", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonLike(String value) {
            addCriterion("INSURANT_PERSON like", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonNotLike(String value) {
            addCriterion("INSURANT_PERSON not like", value, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonIn(List<String> values) {
            addCriterion("INSURANT_PERSON in", values, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonNotIn(List<String> values) {
            addCriterion("INSURANT_PERSON not in", values, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonBetween(String value1, String value2) {
            addCriterion("INSURANT_PERSON between", value1, value2, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andInsurantPersonNotBetween(String value1, String value2) {
            addCriterion("INSURANT_PERSON not between", value1, value2, "insurantPerson");
            return (Criteria) this;
        }

        public Criteria andCarVinIsNull() {
            addCriterion("CAR_VIN is null");
            return (Criteria) this;
        }

        public Criteria andCarVinIsNotNull() {
            addCriterion("CAR_VIN is not null");
            return (Criteria) this;
        }

        public Criteria andCarVinEqualTo(String value) {
            addCriterion("CAR_VIN =", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotEqualTo(String value) {
            addCriterion("CAR_VIN <>", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinGreaterThan(String value) {
            addCriterion("CAR_VIN >", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_VIN >=", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLessThan(String value) {
            addCriterion("CAR_VIN <", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLessThanOrEqualTo(String value) {
            addCriterion("CAR_VIN <=", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLike(String value) {
            addCriterion("CAR_VIN like", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotLike(String value) {
            addCriterion("CAR_VIN not like", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinIn(List<String> values) {
            addCriterion("CAR_VIN in", values, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotIn(List<String> values) {
            addCriterion("CAR_VIN not in", values, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinBetween(String value1, String value2) {
            addCriterion("CAR_VIN between", value1, value2, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotBetween(String value1, String value2) {
            addCriterion("CAR_VIN not between", value1, value2, "carVin");
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

        public Criteria andAccidentTimeIsNull() {
            addCriterion("ACCIDENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeIsNotNull() {
            addCriterion("ACCIDENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeEqualTo(Date value) {
            addCriterion("ACCIDENT_TIME =", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeNotEqualTo(Date value) {
            addCriterion("ACCIDENT_TIME <>", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeGreaterThan(Date value) {
            addCriterion("ACCIDENT_TIME >", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCIDENT_TIME >=", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeLessThan(Date value) {
            addCriterion("ACCIDENT_TIME <", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACCIDENT_TIME <=", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeIn(List<Date> values) {
            addCriterion("ACCIDENT_TIME in", values, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeNotIn(List<Date> values) {
            addCriterion("ACCIDENT_TIME not in", values, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeBetween(Date value1, Date value2) {
            addCriterion("ACCIDENT_TIME between", value1, value2, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACCIDENT_TIME not between", value1, value2, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("REPORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("REPORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Date value) {
            addCriterion("REPORT_DATE =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Date value) {
            addCriterion("REPORT_DATE <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Date value) {
            addCriterion("REPORT_DATE >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPORT_DATE >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Date value) {
            addCriterion("REPORT_DATE <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Date value) {
            addCriterion("REPORT_DATE <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Date> values) {
            addCriterion("REPORT_DATE in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Date> values) {
            addCriterion("REPORT_DATE not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Date value1, Date value2) {
            addCriterion("REPORT_DATE between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Date value1, Date value2) {
            addCriterion("REPORT_DATE not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityIsNull() {
            addCriterion("CURRENT_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityIsNotNull() {
            addCriterion("CURRENT_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityEqualTo(String value) {
            addCriterion("CURRENT_PRIORITY =", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityNotEqualTo(String value) {
            addCriterion("CURRENT_PRIORITY <>", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityGreaterThan(String value) {
            addCriterion("CURRENT_PRIORITY >", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_PRIORITY >=", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityLessThan(String value) {
            addCriterion("CURRENT_PRIORITY <", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_PRIORITY <=", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityLike(String value) {
            addCriterion("CURRENT_PRIORITY like", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityNotLike(String value) {
            addCriterion("CURRENT_PRIORITY not like", value, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityIn(List<String> values) {
            addCriterion("CURRENT_PRIORITY in", values, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityNotIn(List<String> values) {
            addCriterion("CURRENT_PRIORITY not in", values, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityBetween(String value1, String value2) {
            addCriterion("CURRENT_PRIORITY between", value1, value2, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCurrentPriorityNotBetween(String value1, String value2) {
            addCriterion("CURRENT_PRIORITY not between", value1, value2, "currentPriority");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("CUSTOMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("CUSTOMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("CUSTOMER_TYPE >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("CUSTOMER_TYPE <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("CUSTOMER_TYPE like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("CUSTOMER_TYPE not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andToOrgIdIsNull() {
            addCriterion("TO_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andToOrgIdIsNotNull() {
            addCriterion("TO_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToOrgIdEqualTo(String value) {
            addCriterion("TO_ORG_ID =", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdNotEqualTo(String value) {
            addCriterion("TO_ORG_ID <>", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdGreaterThan(String value) {
            addCriterion("TO_ORG_ID >", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("TO_ORG_ID >=", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdLessThan(String value) {
            addCriterion("TO_ORG_ID <", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdLessThanOrEqualTo(String value) {
            addCriterion("TO_ORG_ID <=", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdLike(String value) {
            addCriterion("TO_ORG_ID like", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdNotLike(String value) {
            addCriterion("TO_ORG_ID not like", value, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdIn(List<String> values) {
            addCriterion("TO_ORG_ID in", values, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdNotIn(List<String> values) {
            addCriterion("TO_ORG_ID not in", values, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdBetween(String value1, String value2) {
            addCriterion("TO_ORG_ID between", value1, value2, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andToOrgIdNotBetween(String value1, String value2) {
            addCriterion("TO_ORG_ID not between", value1, value2, "toOrgId");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateIsNull() {
            addCriterion("EVALUATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateIsNotNull() {
            addCriterion("EVALUATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateEqualTo(Date value) {
            addCriterion("EVALUATION_DATE =", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateNotEqualTo(Date value) {
            addCriterion("EVALUATION_DATE <>", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateGreaterThan(Date value) {
            addCriterion("EVALUATION_DATE >", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EVALUATION_DATE >=", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateLessThan(Date value) {
            addCriterion("EVALUATION_DATE <", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateLessThanOrEqualTo(Date value) {
            addCriterion("EVALUATION_DATE <=", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateIn(List<Date> values) {
            addCriterion("EVALUATION_DATE in", values, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateNotIn(List<Date> values) {
            addCriterion("EVALUATION_DATE not in", values, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateBetween(Date value1, Date value2) {
            addCriterion("EVALUATION_DATE between", value1, value2, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateNotBetween(Date value1, Date value2) {
            addCriterion("EVALUATION_DATE not between", value1, value2, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdIsNull() {
            addCriterion("ESTIMATE_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdIsNotNull() {
            addCriterion("ESTIMATE_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_ID =", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdNotEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_ID <>", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdGreaterThan(String value) {
            addCriterion("ESTIMATE_PERSON_ID >", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_ID >=", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdLessThan(String value) {
            addCriterion("ESTIMATE_PERSON_ID <", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdLessThanOrEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_ID <=", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdLike(String value) {
            addCriterion("ESTIMATE_PERSON_ID like", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdNotLike(String value) {
            addCriterion("ESTIMATE_PERSON_ID not like", value, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdIn(List<String> values) {
            addCriterion("ESTIMATE_PERSON_ID in", values, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdNotIn(List<String> values) {
            addCriterion("ESTIMATE_PERSON_ID not in", values, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdBetween(String value1, String value2) {
            addCriterion("ESTIMATE_PERSON_ID between", value1, value2, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonIdNotBetween(String value1, String value2) {
            addCriterion("ESTIMATE_PERSON_ID not between", value1, value2, "estimatePersonId");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameIsNull() {
            addCriterion("ESTIMATE_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameIsNotNull() {
            addCriterion("ESTIMATE_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_NAME =", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameNotEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_NAME <>", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameGreaterThan(String value) {
            addCriterion("ESTIMATE_PERSON_NAME >", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_NAME >=", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameLessThan(String value) {
            addCriterion("ESTIMATE_PERSON_NAME <", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameLessThanOrEqualTo(String value) {
            addCriterion("ESTIMATE_PERSON_NAME <=", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameLike(String value) {
            addCriterion("ESTIMATE_PERSON_NAME like", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameNotLike(String value) {
            addCriterion("ESTIMATE_PERSON_NAME not like", value, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameIn(List<String> values) {
            addCriterion("ESTIMATE_PERSON_NAME in", values, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameNotIn(List<String> values) {
            addCriterion("ESTIMATE_PERSON_NAME not in", values, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameBetween(String value1, String value2) {
            addCriterion("ESTIMATE_PERSON_NAME between", value1, value2, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEstimatePersonNameNotBetween(String value1, String value2) {
            addCriterion("ESTIMATE_PERSON_NAME not between", value1, value2, "estimatePersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdIsNull() {
            addCriterion("EVALUATION_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdIsNotNull() {
            addCriterion("EVALUATION_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_ID =", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdNotEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_ID <>", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdGreaterThan(String value) {
            addCriterion("EVALUATION_PERSON_ID >", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_ID >=", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdLessThan(String value) {
            addCriterion("EVALUATION_PERSON_ID <", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_ID <=", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdLike(String value) {
            addCriterion("EVALUATION_PERSON_ID like", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdNotLike(String value) {
            addCriterion("EVALUATION_PERSON_ID not like", value, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdIn(List<String> values) {
            addCriterion("EVALUATION_PERSON_ID in", values, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdNotIn(List<String> values) {
            addCriterion("EVALUATION_PERSON_ID not in", values, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdBetween(String value1, String value2) {
            addCriterion("EVALUATION_PERSON_ID between", value1, value2, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonIdNotBetween(String value1, String value2) {
            addCriterion("EVALUATION_PERSON_ID not between", value1, value2, "evaluationPersonId");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameIsNull() {
            addCriterion("EVALUATION_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameIsNotNull() {
            addCriterion("EVALUATION_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_NAME =", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameNotEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_NAME <>", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameGreaterThan(String value) {
            addCriterion("EVALUATION_PERSON_NAME >", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_NAME >=", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameLessThan(String value) {
            addCriterion("EVALUATION_PERSON_NAME <", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION_PERSON_NAME <=", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameLike(String value) {
            addCriterion("EVALUATION_PERSON_NAME like", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameNotLike(String value) {
            addCriterion("EVALUATION_PERSON_NAME not like", value, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameIn(List<String> values) {
            addCriterion("EVALUATION_PERSON_NAME in", values, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameNotIn(List<String> values) {
            addCriterion("EVALUATION_PERSON_NAME not in", values, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameBetween(String value1, String value2) {
            addCriterion("EVALUATION_PERSON_NAME between", value1, value2, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEvaluationPersonNameNotBetween(String value1, String value2) {
            addCriterion("EVALUATION_PERSON_NAME not between", value1, value2, "evaluationPersonName");
            return (Criteria) this;
        }

        public Criteria andEstimateDateIsNull() {
            addCriterion("ESTIMATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEstimateDateIsNotNull() {
            addCriterion("ESTIMATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateDateEqualTo(Date value) {
            addCriterion("ESTIMATE_DATE =", value, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateNotEqualTo(Date value) {
            addCriterion("ESTIMATE_DATE <>", value, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateGreaterThan(Date value) {
            addCriterion("ESTIMATE_DATE >", value, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ESTIMATE_DATE >=", value, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateLessThan(Date value) {
            addCriterion("ESTIMATE_DATE <", value, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateLessThanOrEqualTo(Date value) {
            addCriterion("ESTIMATE_DATE <=", value, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateIn(List<Date> values) {
            addCriterion("ESTIMATE_DATE in", values, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateNotIn(List<Date> values) {
            addCriterion("ESTIMATE_DATE not in", values, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateBetween(Date value1, Date value2) {
            addCriterion("ESTIMATE_DATE between", value1, value2, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andEstimateDateNotBetween(Date value1, Date value2) {
            addCriterion("ESTIMATE_DATE not between", value1, value2, "estimateDate");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdIsNull() {
            addCriterion("APPROVE_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdIsNotNull() {
            addCriterion("APPROVE_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdEqualTo(String value) {
            addCriterion("APPROVE_PERSON_ID =", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdNotEqualTo(String value) {
            addCriterion("APPROVE_PERSON_ID <>", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdGreaterThan(String value) {
            addCriterion("APPROVE_PERSON_ID >", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_PERSON_ID >=", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdLessThan(String value) {
            addCriterion("APPROVE_PERSON_ID <", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_PERSON_ID <=", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdLike(String value) {
            addCriterion("APPROVE_PERSON_ID like", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdNotLike(String value) {
            addCriterion("APPROVE_PERSON_ID not like", value, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdIn(List<String> values) {
            addCriterion("APPROVE_PERSON_ID in", values, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdNotIn(List<String> values) {
            addCriterion("APPROVE_PERSON_ID not in", values, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdBetween(String value1, String value2) {
            addCriterion("APPROVE_PERSON_ID between", value1, value2, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonIdNotBetween(String value1, String value2) {
            addCriterion("APPROVE_PERSON_ID not between", value1, value2, "approvePersonId");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameIsNull() {
            addCriterion("APPROVE_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameIsNotNull() {
            addCriterion("APPROVE_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameEqualTo(String value) {
            addCriterion("APPROVE_PERSON_NAME =", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameNotEqualTo(String value) {
            addCriterion("APPROVE_PERSON_NAME <>", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameGreaterThan(String value) {
            addCriterion("APPROVE_PERSON_NAME >", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_PERSON_NAME >=", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameLessThan(String value) {
            addCriterion("APPROVE_PERSON_NAME <", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_PERSON_NAME <=", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameLike(String value) {
            addCriterion("APPROVE_PERSON_NAME like", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameNotLike(String value) {
            addCriterion("APPROVE_PERSON_NAME not like", value, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameIn(List<String> values) {
            addCriterion("APPROVE_PERSON_NAME in", values, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameNotIn(List<String> values) {
            addCriterion("APPROVE_PERSON_NAME not in", values, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameBetween(String value1, String value2) {
            addCriterion("APPROVE_PERSON_NAME between", value1, value2, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApprovePersonNameNotBetween(String value1, String value2) {
            addCriterion("APPROVE_PERSON_NAME not between", value1, value2, "approvePersonName");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNull() {
            addCriterion("APPROVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNotNull() {
            addCriterion("APPROVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDateEqualTo(Date value) {
            addCriterion("APPROVE_DATE =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(Date value) {
            addCriterion("APPROVE_DATE <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(Date value) {
            addCriterion("APPROVE_DATE >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVE_DATE >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(Date value) {
            addCriterion("APPROVE_DATE <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(Date value) {
            addCriterion("APPROVE_DATE <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<Date> values) {
            addCriterion("APPROVE_DATE in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<Date> values) {
            addCriterion("APPROVE_DATE not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(Date value1, Date value2) {
            addCriterion("APPROVE_DATE between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(Date value1, Date value2) {
            addCriterion("APPROVE_DATE not between", value1, value2, "approveDate");
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

        public Criteria andDispatchOrgIdIsNull() {
            addCriterion("DISPATCH_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdIsNotNull() {
            addCriterion("DISPATCH_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdEqualTo(String value) {
            addCriterion("DISPATCH_ORG_ID =", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdNotEqualTo(String value) {
            addCriterion("DISPATCH_ORG_ID <>", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdGreaterThan(String value) {
            addCriterion("DISPATCH_ORG_ID >", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_ORG_ID >=", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdLessThan(String value) {
            addCriterion("DISPATCH_ORG_ID <", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_ORG_ID <=", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdLike(String value) {
            addCriterion("DISPATCH_ORG_ID like", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdNotLike(String value) {
            addCriterion("DISPATCH_ORG_ID not like", value, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdIn(List<String> values) {
            addCriterion("DISPATCH_ORG_ID in", values, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdNotIn(List<String> values) {
            addCriterion("DISPATCH_ORG_ID not in", values, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdBetween(String value1, String value2) {
            addCriterion("DISPATCH_ORG_ID between", value1, value2, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgIdNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_ORG_ID not between", value1, value2, "dispatchOrgId");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameIsNull() {
            addCriterion("DISPATCH_ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameIsNotNull() {
            addCriterion("DISPATCH_ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameEqualTo(String value) {
            addCriterion("DISPATCH_ORG_NAME =", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameNotEqualTo(String value) {
            addCriterion("DISPATCH_ORG_NAME <>", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameGreaterThan(String value) {
            addCriterion("DISPATCH_ORG_NAME >", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_ORG_NAME >=", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameLessThan(String value) {
            addCriterion("DISPATCH_ORG_NAME <", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_ORG_NAME <=", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameLike(String value) {
            addCriterion("DISPATCH_ORG_NAME like", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameNotLike(String value) {
            addCriterion("DISPATCH_ORG_NAME not like", value, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameIn(List<String> values) {
            addCriterion("DISPATCH_ORG_NAME in", values, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameNotIn(List<String> values) {
            addCriterion("DISPATCH_ORG_NAME not in", values, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameBetween(String value1, String value2) {
            addCriterion("DISPATCH_ORG_NAME between", value1, value2, "dispatchOrgName");
            return (Criteria) this;
        }

        public Criteria andDispatchOrgNameNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_ORG_NAME not between", value1, value2, "dispatchOrgName");
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

        public Criteria andCDispatchFlagIsNull() {
            addCriterion("C_DISPATCH_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagIsNotNull() {
            addCriterion("C_DISPATCH_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagEqualTo(String value) {
            addCriterion("C_DISPATCH_FLAG =", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagNotEqualTo(String value) {
            addCriterion("C_DISPATCH_FLAG <>", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagGreaterThan(String value) {
            addCriterion("C_DISPATCH_FLAG >", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagGreaterThanOrEqualTo(String value) {
            addCriterion("C_DISPATCH_FLAG >=", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagLessThan(String value) {
            addCriterion("C_DISPATCH_FLAG <", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagLessThanOrEqualTo(String value) {
            addCriterion("C_DISPATCH_FLAG <=", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagLike(String value) {
            addCriterion("C_DISPATCH_FLAG like", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagNotLike(String value) {
            addCriterion("C_DISPATCH_FLAG not like", value, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagIn(List<String> values) {
            addCriterion("C_DISPATCH_FLAG in", values, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagNotIn(List<String> values) {
            addCriterion("C_DISPATCH_FLAG not in", values, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagBetween(String value1, String value2) {
            addCriterion("C_DISPATCH_FLAG between", value1, value2, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andCDispatchFlagNotBetween(String value1, String value2) {
            addCriterion("C_DISPATCH_FLAG not between", value1, value2, "cDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andAccidentNumIsNull() {
            addCriterion("ACCIDENT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAccidentNumIsNotNull() {
            addCriterion("ACCIDENT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentNumEqualTo(Double value) {
            addCriterion("ACCIDENT_NUM =", value, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumNotEqualTo(Double value) {
            addCriterion("ACCIDENT_NUM <>", value, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumGreaterThan(Double value) {
            addCriterion("ACCIDENT_NUM >", value, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumGreaterThanOrEqualTo(Double value) {
            addCriterion("ACCIDENT_NUM >=", value, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumLessThan(Double value) {
            addCriterion("ACCIDENT_NUM <", value, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumLessThanOrEqualTo(Double value) {
            addCriterion("ACCIDENT_NUM <=", value, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumIn(List<Double> values) {
            addCriterion("ACCIDENT_NUM in", values, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumNotIn(List<Double> values) {
            addCriterion("ACCIDENT_NUM not in", values, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumBetween(Double value1, Double value2) {
            addCriterion("ACCIDENT_NUM between", value1, value2, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andAccidentNumNotBetween(Double value1, Double value2) {
            addCriterion("ACCIDENT_NUM not between", value1, value2, "accidentNum");
            return (Criteria) this;
        }

        public Criteria andRiskTypeIsNull() {
            addCriterion("RISK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRiskTypeIsNotNull() {
            addCriterion("RISK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskTypeEqualTo(String value) {
            addCriterion("RISK_TYPE =", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotEqualTo(String value) {
            addCriterion("RISK_TYPE <>", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeGreaterThan(String value) {
            addCriterion("RISK_TYPE >", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_TYPE >=", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeLessThan(String value) {
            addCriterion("RISK_TYPE <", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeLessThanOrEqualTo(String value) {
            addCriterion("RISK_TYPE <=", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeLike(String value) {
            addCriterion("RISK_TYPE like", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotLike(String value) {
            addCriterion("RISK_TYPE not like", value, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeIn(List<String> values) {
            addCriterion("RISK_TYPE in", values, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotIn(List<String> values) {
            addCriterion("RISK_TYPE not in", values, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeBetween(String value1, String value2) {
            addCriterion("RISK_TYPE between", value1, value2, "riskType");
            return (Criteria) this;
        }

        public Criteria andRiskTypeNotBetween(String value1, String value2) {
            addCriterion("RISK_TYPE not between", value1, value2, "riskType");
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

        public Criteria andLossSumEqualTo(Double value) {
            addCriterion("LOSS_SUM =", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumNotEqualTo(Double value) {
            addCriterion("LOSS_SUM <>", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumGreaterThan(Double value) {
            addCriterion("LOSS_SUM >", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumGreaterThanOrEqualTo(Double value) {
            addCriterion("LOSS_SUM >=", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumLessThan(Double value) {
            addCriterion("LOSS_SUM <", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumLessThanOrEqualTo(Double value) {
            addCriterion("LOSS_SUM <=", value, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumIn(List<Double> values) {
            addCriterion("LOSS_SUM in", values, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumNotIn(List<Double> values) {
            addCriterion("LOSS_SUM not in", values, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumBetween(Double value1, Double value2) {
            addCriterion("LOSS_SUM between", value1, value2, "lossSum");
            return (Criteria) this;
        }

        public Criteria andLossSumNotBetween(Double value1, Double value2) {
            addCriterion("LOSS_SUM not between", value1, value2, "lossSum");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameIsNull() {
            addCriterion("DIS_OBJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameIsNotNull() {
            addCriterion("DIS_OBJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameEqualTo(String value) {
            addCriterion("DIS_OBJECT_NAME =", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameNotEqualTo(String value) {
            addCriterion("DIS_OBJECT_NAME <>", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameGreaterThan(String value) {
            addCriterion("DIS_OBJECT_NAME >", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIS_OBJECT_NAME >=", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameLessThan(String value) {
            addCriterion("DIS_OBJECT_NAME <", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameLessThanOrEqualTo(String value) {
            addCriterion("DIS_OBJECT_NAME <=", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameLike(String value) {
            addCriterion("DIS_OBJECT_NAME like", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameNotLike(String value) {
            addCriterion("DIS_OBJECT_NAME not like", value, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameIn(List<String> values) {
            addCriterion("DIS_OBJECT_NAME in", values, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameNotIn(List<String> values) {
            addCriterion("DIS_OBJECT_NAME not in", values, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameBetween(String value1, String value2) {
            addCriterion("DIS_OBJECT_NAME between", value1, value2, "disObjectName");
            return (Criteria) this;
        }

        public Criteria andDisObjectNameNotBetween(String value1, String value2) {
            addCriterion("DIS_OBJECT_NAME not between", value1, value2, "disObjectName");
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

        public Criteria andContactContentIsNull() {
            addCriterion("CONTACT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContactContentIsNotNull() {
            addCriterion("CONTACT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContactContentEqualTo(String value) {
            addCriterion("CONTACT_CONTENT =", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotEqualTo(String value) {
            addCriterion("CONTACT_CONTENT <>", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThan(String value) {
            addCriterion("CONTACT_CONTENT >", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_CONTENT >=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThan(String value) {
            addCriterion("CONTACT_CONTENT <", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_CONTENT <=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLike(String value) {
            addCriterion("CONTACT_CONTENT like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotLike(String value) {
            addCriterion("CONTACT_CONTENT not like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentIn(List<String> values) {
            addCriterion("CONTACT_CONTENT in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotIn(List<String> values) {
            addCriterion("CONTACT_CONTENT not in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentBetween(String value1, String value2) {
            addCriterion("CONTACT_CONTENT between", value1, value2, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotBetween(String value1, String value2) {
            addCriterion("CONTACT_CONTENT not between", value1, value2, "contactContent");
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

        public Criteria andCDispatchDescripIsNull() {
            addCriterion("C_DISPATCH_DESCRIP is null");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripIsNotNull() {
            addCriterion("C_DISPATCH_DESCRIP is not null");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripEqualTo(String value) {
            addCriterion("C_DISPATCH_DESCRIP =", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripNotEqualTo(String value) {
            addCriterion("C_DISPATCH_DESCRIP <>", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripGreaterThan(String value) {
            addCriterion("C_DISPATCH_DESCRIP >", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripGreaterThanOrEqualTo(String value) {
            addCriterion("C_DISPATCH_DESCRIP >=", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripLessThan(String value) {
            addCriterion("C_DISPATCH_DESCRIP <", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripLessThanOrEqualTo(String value) {
            addCriterion("C_DISPATCH_DESCRIP <=", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripLike(String value) {
            addCriterion("C_DISPATCH_DESCRIP like", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripNotLike(String value) {
            addCriterion("C_DISPATCH_DESCRIP not like", value, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripIn(List<String> values) {
            addCriterion("C_DISPATCH_DESCRIP in", values, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripNotIn(List<String> values) {
            addCriterion("C_DISPATCH_DESCRIP not in", values, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripBetween(String value1, String value2) {
            addCriterion("C_DISPATCH_DESCRIP between", value1, value2, "cDispatchDescrip");
            return (Criteria) this;
        }

        public Criteria andCDispatchDescripNotBetween(String value1, String value2) {
            addCriterion("C_DISPATCH_DESCRIP not between", value1, value2, "cDispatchDescrip");
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

        public Criteria andRelationFlowIdIsNull() {
            addCriterion("RELATION_FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdIsNotNull() {
            addCriterion("RELATION_FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdEqualTo(String value) {
            addCriterion("RELATION_FLOW_ID =", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdNotEqualTo(String value) {
            addCriterion("RELATION_FLOW_ID <>", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdGreaterThan(String value) {
            addCriterion("RELATION_FLOW_ID >", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION_FLOW_ID >=", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdLessThan(String value) {
            addCriterion("RELATION_FLOW_ID <", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdLessThanOrEqualTo(String value) {
            addCriterion("RELATION_FLOW_ID <=", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdLike(String value) {
            addCriterion("RELATION_FLOW_ID like", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdNotLike(String value) {
            addCriterion("RELATION_FLOW_ID not like", value, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdIn(List<String> values) {
            addCriterion("RELATION_FLOW_ID in", values, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdNotIn(List<String> values) {
            addCriterion("RELATION_FLOW_ID not in", values, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdBetween(String value1, String value2) {
            addCriterion("RELATION_FLOW_ID between", value1, value2, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andRelationFlowIdNotBetween(String value1, String value2) {
            addCriterion("RELATION_FLOW_ID not between", value1, value2, "relationFlowId");
            return (Criteria) this;
        }

        public Criteria andModifyEditionIsNull() {
            addCriterion("MODIFY_EDITION is null");
            return (Criteria) this;
        }

        public Criteria andModifyEditionIsNotNull() {
            addCriterion("MODIFY_EDITION is not null");
            return (Criteria) this;
        }

        public Criteria andModifyEditionEqualTo(Double value) {
            addCriterion("MODIFY_EDITION =", value, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionNotEqualTo(Double value) {
            addCriterion("MODIFY_EDITION <>", value, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionGreaterThan(Double value) {
            addCriterion("MODIFY_EDITION >", value, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionGreaterThanOrEqualTo(Double value) {
            addCriterion("MODIFY_EDITION >=", value, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionLessThan(Double value) {
            addCriterion("MODIFY_EDITION <", value, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionLessThanOrEqualTo(Double value) {
            addCriterion("MODIFY_EDITION <=", value, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionIn(List<Double> values) {
            addCriterion("MODIFY_EDITION in", values, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionNotIn(List<Double> values) {
            addCriterion("MODIFY_EDITION not in", values, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionBetween(Double value1, Double value2) {
            addCriterion("MODIFY_EDITION between", value1, value2, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andModifyEditionNotBetween(Double value1, Double value2) {
            addCriterion("MODIFY_EDITION not between", value1, value2, "modifyEdition");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("DEL_FLAG like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("DEL_FLAG not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
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

        public Criteria andEvalFlagIsNull() {
            addCriterion("EVAL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEvalFlagIsNotNull() {
            addCriterion("EVAL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEvalFlagEqualTo(String value) {
            addCriterion("EVAL_FLAG =", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagNotEqualTo(String value) {
            addCriterion("EVAL_FLAG <>", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagGreaterThan(String value) {
            addCriterion("EVAL_FLAG >", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EVAL_FLAG >=", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagLessThan(String value) {
            addCriterion("EVAL_FLAG <", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagLessThanOrEqualTo(String value) {
            addCriterion("EVAL_FLAG <=", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagLike(String value) {
            addCriterion("EVAL_FLAG like", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagNotLike(String value) {
            addCriterion("EVAL_FLAG not like", value, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagIn(List<String> values) {
            addCriterion("EVAL_FLAG in", values, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagNotIn(List<String> values) {
            addCriterion("EVAL_FLAG not in", values, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagBetween(String value1, String value2) {
            addCriterion("EVAL_FLAG between", value1, value2, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andEvalFlagNotBetween(String value1, String value2) {
            addCriterion("EVAL_FLAG not between", value1, value2, "evalFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagIsNull() {
            addCriterion("SELF_ESTI_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagIsNotNull() {
            addCriterion("SELF_ESTI_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagEqualTo(String value) {
            addCriterion("SELF_ESTI_FLAG =", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagNotEqualTo(String value) {
            addCriterion("SELF_ESTI_FLAG <>", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagGreaterThan(String value) {
            addCriterion("SELF_ESTI_FLAG >", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_ESTI_FLAG >=", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagLessThan(String value) {
            addCriterion("SELF_ESTI_FLAG <", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagLessThanOrEqualTo(String value) {
            addCriterion("SELF_ESTI_FLAG <=", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagLike(String value) {
            addCriterion("SELF_ESTI_FLAG like", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagNotLike(String value) {
            addCriterion("SELF_ESTI_FLAG not like", value, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagIn(List<String> values) {
            addCriterion("SELF_ESTI_FLAG in", values, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagNotIn(List<String> values) {
            addCriterion("SELF_ESTI_FLAG not in", values, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagBetween(String value1, String value2) {
            addCriterion("SELF_ESTI_FLAG between", value1, value2, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfEstiFlagNotBetween(String value1, String value2) {
            addCriterion("SELF_ESTI_FLAG not between", value1, value2, "selfEstiFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagIsNull() {
            addCriterion("SELF_APPROVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagIsNotNull() {
            addCriterion("SELF_APPROVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagEqualTo(String value) {
            addCriterion("SELF_APPROVE_FLAG =", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagNotEqualTo(String value) {
            addCriterion("SELF_APPROVE_FLAG <>", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagGreaterThan(String value) {
            addCriterion("SELF_APPROVE_FLAG >", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_APPROVE_FLAG >=", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagLessThan(String value) {
            addCriterion("SELF_APPROVE_FLAG <", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagLessThanOrEqualTo(String value) {
            addCriterion("SELF_APPROVE_FLAG <=", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagLike(String value) {
            addCriterion("SELF_APPROVE_FLAG like", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagNotLike(String value) {
            addCriterion("SELF_APPROVE_FLAG not like", value, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagIn(List<String> values) {
            addCriterion("SELF_APPROVE_FLAG in", values, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagNotIn(List<String> values) {
            addCriterion("SELF_APPROVE_FLAG not in", values, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagBetween(String value1, String value2) {
            addCriterion("SELF_APPROVE_FLAG between", value1, value2, "selfApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSelfApproveFlagNotBetween(String value1, String value2) {
            addCriterion("SELF_APPROVE_FLAG not between", value1, value2, "selfApproveFlag");
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

        public Criteria andFromDisDevTypeIsNull() {
            addCriterion("FROM_DIS_DEV_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeIsNotNull() {
            addCriterion("FROM_DIS_DEV_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_TYPE =", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeNotEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_TYPE <>", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeGreaterThan(String value) {
            addCriterion("FROM_DIS_DEV_TYPE >", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_TYPE >=", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeLessThan(String value) {
            addCriterion("FROM_DIS_DEV_TYPE <", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeLessThanOrEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_TYPE <=", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeLike(String value) {
            addCriterion("FROM_DIS_DEV_TYPE like", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeNotLike(String value) {
            addCriterion("FROM_DIS_DEV_TYPE not like", value, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeIn(List<String> values) {
            addCriterion("FROM_DIS_DEV_TYPE in", values, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeNotIn(List<String> values) {
            addCriterion("FROM_DIS_DEV_TYPE not in", values, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeBetween(String value1, String value2) {
            addCriterion("FROM_DIS_DEV_TYPE between", value1, value2, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevTypeNotBetween(String value1, String value2) {
            addCriterion("FROM_DIS_DEV_TYPE not between", value1, value2, "fromDisDevType");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdIsNull() {
            addCriterion("FROM_DIS_DEV_ID is null");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdIsNotNull() {
            addCriterion("FROM_DIS_DEV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_ID =", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdNotEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_ID <>", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdGreaterThan(String value) {
            addCriterion("FROM_DIS_DEV_ID >", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_ID >=", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdLessThan(String value) {
            addCriterion("FROM_DIS_DEV_ID <", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdLessThanOrEqualTo(String value) {
            addCriterion("FROM_DIS_DEV_ID <=", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdLike(String value) {
            addCriterion("FROM_DIS_DEV_ID like", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdNotLike(String value) {
            addCriterion("FROM_DIS_DEV_ID not like", value, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdIn(List<String> values) {
            addCriterion("FROM_DIS_DEV_ID in", values, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdNotIn(List<String> values) {
            addCriterion("FROM_DIS_DEV_ID not in", values, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdBetween(String value1, String value2) {
            addCriterion("FROM_DIS_DEV_ID between", value1, value2, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andFromDisDevIdNotBetween(String value1, String value2) {
            addCriterion("FROM_DIS_DEV_ID not between", value1, value2, "fromDisDevId");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameIsNull() {
            addCriterion("TMP_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameIsNotNull() {
            addCriterion("TMP_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameEqualTo(String value) {
            addCriterion("TMP_PERSON_NAME =", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameNotEqualTo(String value) {
            addCriterion("TMP_PERSON_NAME <>", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameGreaterThan(String value) {
            addCriterion("TMP_PERSON_NAME >", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("TMP_PERSON_NAME >=", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameLessThan(String value) {
            addCriterion("TMP_PERSON_NAME <", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameLessThanOrEqualTo(String value) {
            addCriterion("TMP_PERSON_NAME <=", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameLike(String value) {
            addCriterion("TMP_PERSON_NAME like", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameNotLike(String value) {
            addCriterion("TMP_PERSON_NAME not like", value, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameIn(List<String> values) {
            addCriterion("TMP_PERSON_NAME in", values, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameNotIn(List<String> values) {
            addCriterion("TMP_PERSON_NAME not in", values, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameBetween(String value1, String value2) {
            addCriterion("TMP_PERSON_NAME between", value1, value2, "tmpPersonName");
            return (Criteria) this;
        }

        public Criteria andTmpPersonNameNotBetween(String value1, String value2) {
            addCriterion("TMP_PERSON_NAME not between", value1, value2, "tmpPersonName");
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

        public Criteria andLaidianPhoneIsNull() {
            addCriterion("lAIDIAN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneIsNotNull() {
            addCriterion("lAIDIAN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneEqualTo(String value) {
            addCriterion("lAIDIAN_PHONE =", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNotEqualTo(String value) {
            addCriterion("lAIDIAN_PHONE <>", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneGreaterThan(String value) {
            addCriterion("lAIDIAN_PHONE >", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("lAIDIAN_PHONE >=", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneLessThan(String value) {
            addCriterion("lAIDIAN_PHONE <", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneLessThanOrEqualTo(String value) {
            addCriterion("lAIDIAN_PHONE <=", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneLike(String value) {
            addCriterion("lAIDIAN_PHONE like", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNotLike(String value) {
            addCriterion("lAIDIAN_PHONE not like", value, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneIn(List<String> values) {
            addCriterion("lAIDIAN_PHONE in", values, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNotIn(List<String> values) {
            addCriterion("lAIDIAN_PHONE not in", values, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneBetween(String value1, String value2) {
            addCriterion("lAIDIAN_PHONE between", value1, value2, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNotBetween(String value1, String value2) {
            addCriterion("lAIDIAN_PHONE not between", value1, value2, "laidianPhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneIsNull() {
            addCriterion("ZHUANGCHE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneIsNotNull() {
            addCriterion("ZHUANGCHE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE =", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNotEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE <>", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneGreaterThan(String value) {
            addCriterion("ZHUANGCHE_PHONE >", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE >=", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneLessThan(String value) {
            addCriterion("ZHUANGCHE_PHONE <", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneLessThanOrEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE <=", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneLike(String value) {
            addCriterion("ZHUANGCHE_PHONE like", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNotLike(String value) {
            addCriterion("ZHUANGCHE_PHONE not like", value, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneIn(List<String> values) {
            addCriterion("ZHUANGCHE_PHONE in", values, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNotIn(List<String> values) {
            addCriterion("ZHUANGCHE_PHONE not in", values, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneBetween(String value1, String value2) {
            addCriterion("ZHUANGCHE_PHONE between", value1, value2, "zhuangchePhone");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNotBetween(String value1, String value2) {
            addCriterion("ZHUANGCHE_PHONE not between", value1, value2, "zhuangchePhone");
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

        public Criteria andInquireFlagIsNull() {
            addCriterion("INQUIRE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInquireFlagIsNotNull() {
            addCriterion("INQUIRE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInquireFlagEqualTo(String value) {
            addCriterion("INQUIRE_FLAG =", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagNotEqualTo(String value) {
            addCriterion("INQUIRE_FLAG <>", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagGreaterThan(String value) {
            addCriterion("INQUIRE_FLAG >", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagGreaterThanOrEqualTo(String value) {
            addCriterion("INQUIRE_FLAG >=", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagLessThan(String value) {
            addCriterion("INQUIRE_FLAG <", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagLessThanOrEqualTo(String value) {
            addCriterion("INQUIRE_FLAG <=", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagLike(String value) {
            addCriterion("INQUIRE_FLAG like", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagNotLike(String value) {
            addCriterion("INQUIRE_FLAG not like", value, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagIn(List<String> values) {
            addCriterion("INQUIRE_FLAG in", values, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagNotIn(List<String> values) {
            addCriterion("INQUIRE_FLAG not in", values, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagBetween(String value1, String value2) {
            addCriterion("INQUIRE_FLAG between", value1, value2, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andInquireFlagNotBetween(String value1, String value2) {
            addCriterion("INQUIRE_FLAG not between", value1, value2, "inquireFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagIsNull() {
            addCriterion("RESURVEY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagIsNotNull() {
            addCriterion("RESURVEY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagEqualTo(String value) {
            addCriterion("RESURVEY_FLAG =", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagNotEqualTo(String value) {
            addCriterion("RESURVEY_FLAG <>", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagGreaterThan(String value) {
            addCriterion("RESURVEY_FLAG >", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RESURVEY_FLAG >=", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagLessThan(String value) {
            addCriterion("RESURVEY_FLAG <", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagLessThanOrEqualTo(String value) {
            addCriterion("RESURVEY_FLAG <=", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagLike(String value) {
            addCriterion("RESURVEY_FLAG like", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagNotLike(String value) {
            addCriterion("RESURVEY_FLAG not like", value, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagIn(List<String> values) {
            addCriterion("RESURVEY_FLAG in", values, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagNotIn(List<String> values) {
            addCriterion("RESURVEY_FLAG not in", values, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagBetween(String value1, String value2) {
            addCriterion("RESURVEY_FLAG between", value1, value2, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyFlagNotBetween(String value1, String value2) {
            addCriterion("RESURVEY_FLAG not between", value1, value2, "resurveyFlag");
            return (Criteria) this;
        }

        public Criteria andResurveyStateIsNull() {
            addCriterion("RESURVEY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andResurveyStateIsNotNull() {
            addCriterion("RESURVEY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andResurveyStateEqualTo(String value) {
            addCriterion("RESURVEY_STATE =", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateNotEqualTo(String value) {
            addCriterion("RESURVEY_STATE <>", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateGreaterThan(String value) {
            addCriterion("RESURVEY_STATE >", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateGreaterThanOrEqualTo(String value) {
            addCriterion("RESURVEY_STATE >=", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateLessThan(String value) {
            addCriterion("RESURVEY_STATE <", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateLessThanOrEqualTo(String value) {
            addCriterion("RESURVEY_STATE <=", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateLike(String value) {
            addCriterion("RESURVEY_STATE like", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateNotLike(String value) {
            addCriterion("RESURVEY_STATE not like", value, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateIn(List<String> values) {
            addCriterion("RESURVEY_STATE in", values, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateNotIn(List<String> values) {
            addCriterion("RESURVEY_STATE not in", values, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateBetween(String value1, String value2) {
            addCriterion("RESURVEY_STATE between", value1, value2, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyStateNotBetween(String value1, String value2) {
            addCriterion("RESURVEY_STATE not between", value1, value2, "resurveyState");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdIsNull() {
            addCriterion("RESURVEY_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdIsNotNull() {
            addCriterion("RESURVEY_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_ID =", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdNotEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_ID <>", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdGreaterThan(String value) {
            addCriterion("RESURVEY_PERSON_ID >", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_ID >=", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdLessThan(String value) {
            addCriterion("RESURVEY_PERSON_ID <", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdLessThanOrEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_ID <=", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdLike(String value) {
            addCriterion("RESURVEY_PERSON_ID like", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdNotLike(String value) {
            addCriterion("RESURVEY_PERSON_ID not like", value, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdIn(List<String> values) {
            addCriterion("RESURVEY_PERSON_ID in", values, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdNotIn(List<String> values) {
            addCriterion("RESURVEY_PERSON_ID not in", values, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdBetween(String value1, String value2) {
            addCriterion("RESURVEY_PERSON_ID between", value1, value2, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonIdNotBetween(String value1, String value2) {
            addCriterion("RESURVEY_PERSON_ID not between", value1, value2, "resurveyPersonId");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameIsNull() {
            addCriterion("RESURVEY_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameIsNotNull() {
            addCriterion("RESURVEY_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_NAME =", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameNotEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_NAME <>", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameGreaterThan(String value) {
            addCriterion("RESURVEY_PERSON_NAME >", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_NAME >=", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameLessThan(String value) {
            addCriterion("RESURVEY_PERSON_NAME <", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameLessThanOrEqualTo(String value) {
            addCriterion("RESURVEY_PERSON_NAME <=", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameLike(String value) {
            addCriterion("RESURVEY_PERSON_NAME like", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameNotLike(String value) {
            addCriterion("RESURVEY_PERSON_NAME not like", value, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameIn(List<String> values) {
            addCriterion("RESURVEY_PERSON_NAME in", values, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameNotIn(List<String> values) {
            addCriterion("RESURVEY_PERSON_NAME not in", values, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameBetween(String value1, String value2) {
            addCriterion("RESURVEY_PERSON_NAME between", value1, value2, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andResurveyPersonNameNotBetween(String value1, String value2) {
            addCriterion("RESURVEY_PERSON_NAME not between", value1, value2, "resurveyPersonName");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagIsNull() {
            addCriterion("QUICK_PAY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagIsNotNull() {
            addCriterion("QUICK_PAY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagEqualTo(String value) {
            addCriterion("QUICK_PAY_FLAG =", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagNotEqualTo(String value) {
            addCriterion("QUICK_PAY_FLAG <>", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagGreaterThan(String value) {
            addCriterion("QUICK_PAY_FLAG >", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagGreaterThanOrEqualTo(String value) {
            addCriterion("QUICK_PAY_FLAG >=", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagLessThan(String value) {
            addCriterion("QUICK_PAY_FLAG <", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagLessThanOrEqualTo(String value) {
            addCriterion("QUICK_PAY_FLAG <=", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagLike(String value) {
            addCriterion("QUICK_PAY_FLAG like", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagNotLike(String value) {
            addCriterion("QUICK_PAY_FLAG not like", value, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagIn(List<String> values) {
            addCriterion("QUICK_PAY_FLAG in", values, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagNotIn(List<String> values) {
            addCriterion("QUICK_PAY_FLAG not in", values, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagBetween(String value1, String value2) {
            addCriterion("QUICK_PAY_FLAG between", value1, value2, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andQuickPayFlagNotBetween(String value1, String value2) {
            addCriterion("QUICK_PAY_FLAG not between", value1, value2, "quickPayFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagIsNull() {
            addCriterion("IFC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIfcFlagIsNotNull() {
            addCriterion("IFC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIfcFlagEqualTo(String value) {
            addCriterion("IFC_FLAG =", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagNotEqualTo(String value) {
            addCriterion("IFC_FLAG <>", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagGreaterThan(String value) {
            addCriterion("IFC_FLAG >", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IFC_FLAG >=", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagLessThan(String value) {
            addCriterion("IFC_FLAG <", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagLessThanOrEqualTo(String value) {
            addCriterion("IFC_FLAG <=", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagLike(String value) {
            addCriterion("IFC_FLAG like", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagNotLike(String value) {
            addCriterion("IFC_FLAG not like", value, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagIn(List<String> values) {
            addCriterion("IFC_FLAG in", values, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagNotIn(List<String> values) {
            addCriterion("IFC_FLAG not in", values, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagBetween(String value1, String value2) {
            addCriterion("IFC_FLAG between", value1, value2, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andIfcFlagNotBetween(String value1, String value2) {
            addCriterion("IFC_FLAG not between", value1, value2, "ifcFlag");
            return (Criteria) this;
        }

        public Criteria andPrintDateIsNull() {
            addCriterion("PRINT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrintDateIsNotNull() {
            addCriterion("PRINT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintDateEqualTo(Date value) {
            addCriterion("PRINT_DATE =", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotEqualTo(Date value) {
            addCriterion("PRINT_DATE <>", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateGreaterThan(Date value) {
            addCriterion("PRINT_DATE >", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRINT_DATE >=", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateLessThan(Date value) {
            addCriterion("PRINT_DATE <", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateLessThanOrEqualTo(Date value) {
            addCriterion("PRINT_DATE <=", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateIn(List<Date> values) {
            addCriterion("PRINT_DATE in", values, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotIn(List<Date> values) {
            addCriterion("PRINT_DATE not in", values, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateBetween(Date value1, Date value2) {
            addCriterion("PRINT_DATE between", value1, value2, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotBetween(Date value1, Date value2) {
            addCriterion("PRINT_DATE not between", value1, value2, "printDate");
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

        public Criteria andEvalNumIsNull() {
            addCriterion("EVAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEvalNumIsNotNull() {
            addCriterion("EVAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEvalNumEqualTo(Double value) {
            addCriterion("EVAL_NUM =", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumNotEqualTo(Double value) {
            addCriterion("EVAL_NUM <>", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumGreaterThan(Double value) {
            addCriterion("EVAL_NUM >", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumGreaterThanOrEqualTo(Double value) {
            addCriterion("EVAL_NUM >=", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumLessThan(Double value) {
            addCriterion("EVAL_NUM <", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumLessThanOrEqualTo(Double value) {
            addCriterion("EVAL_NUM <=", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumIn(List<Double> values) {
            addCriterion("EVAL_NUM in", values, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumNotIn(List<Double> values) {
            addCriterion("EVAL_NUM not in", values, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumBetween(Double value1, Double value2) {
            addCriterion("EVAL_NUM between", value1, value2, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumNotBetween(Double value1, Double value2) {
            addCriterion("EVAL_NUM not between", value1, value2, "evalNum");
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

        public Criteria andArriveSceneTimeIsNull() {
            addCriterion("ARRIVE_SCENE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeIsNotNull() {
            addCriterion("ARRIVE_SCENE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_TIME =", value, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeNotEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_TIME <>", value, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeGreaterThan(Date value) {
            addCriterion("ARRIVE_SCENE_TIME >", value, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_TIME >=", value, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeLessThan(Date value) {
            addCriterion("ARRIVE_SCENE_TIME <", value, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeLessThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_SCENE_TIME <=", value, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeIn(List<Date> values) {
            addCriterion("ARRIVE_SCENE_TIME in", values, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeNotIn(List<Date> values) {
            addCriterion("ARRIVE_SCENE_TIME not in", values, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_SCENE_TIME between", value1, value2, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andArriveSceneTimeNotBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_SCENE_TIME not between", value1, value2, "arriveSceneTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeIsNull() {
            addCriterion("CONTACT_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeIsNotNull() {
            addCriterion("CONTACT_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeEqualTo(Date value) {
            addCriterion("CONTACT_START_TIME =", value, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeNotEqualTo(Date value) {
            addCriterion("CONTACT_START_TIME <>", value, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeGreaterThan(Date value) {
            addCriterion("CONTACT_START_TIME >", value, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTACT_START_TIME >=", value, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeLessThan(Date value) {
            addCriterion("CONTACT_START_TIME <", value, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONTACT_START_TIME <=", value, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeIn(List<Date> values) {
            addCriterion("CONTACT_START_TIME in", values, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeNotIn(List<Date> values) {
            addCriterion("CONTACT_START_TIME not in", values, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeBetween(Date value1, Date value2) {
            addCriterion("CONTACT_START_TIME between", value1, value2, "contactStartTime");
            return (Criteria) this;
        }

        public Criteria andContactStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONTACT_START_TIME not between", value1, value2, "contactStartTime");
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

        public Criteria andApproveFlagIsNull() {
            addCriterion("APPROVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andApproveFlagIsNotNull() {
            addCriterion("APPROVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andApproveFlagEqualTo(String value) {
            addCriterion("APPROVE_FLAG =", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotEqualTo(String value) {
            addCriterion("APPROVE_FLAG <>", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagGreaterThan(String value) {
            addCriterion("APPROVE_FLAG >", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_FLAG >=", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagLessThan(String value) {
            addCriterion("APPROVE_FLAG <", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_FLAG <=", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagLike(String value) {
            addCriterion("APPROVE_FLAG like", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotLike(String value) {
            addCriterion("APPROVE_FLAG not like", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagIn(List<String> values) {
            addCriterion("APPROVE_FLAG in", values, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotIn(List<String> values) {
            addCriterion("APPROVE_FLAG not in", values, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagBetween(String value1, String value2) {
            addCriterion("APPROVE_FLAG between", value1, value2, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotBetween(String value1, String value2) {
            addCriterion("APPROVE_FLAG not between", value1, value2, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagIsNull() {
            addCriterion("SEND_PHONE_BACK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagIsNotNull() {
            addCriterion("SEND_PHONE_BACK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagEqualTo(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG =", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagNotEqualTo(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG <>", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagGreaterThan(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG >", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG >=", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagLessThan(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG <", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagLessThanOrEqualTo(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG <=", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagLike(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG like", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagNotLike(String value) {
            addCriterion("SEND_PHONE_BACK_FLAG not like", value, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagIn(List<String> values) {
            addCriterion("SEND_PHONE_BACK_FLAG in", values, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagNotIn(List<String> values) {
            addCriterion("SEND_PHONE_BACK_FLAG not in", values, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagBetween(String value1, String value2) {
            addCriterion("SEND_PHONE_BACK_FLAG between", value1, value2, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBackFlagNotBetween(String value1, String value2) {
            addCriterion("SEND_PHONE_BACK_FLAG not between", value1, value2, "sendPhoneBackFlag");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdIsNull() {
            addCriterion("PS_FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdIsNotNull() {
            addCriterion("PS_FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdEqualTo(String value) {
            addCriterion("PS_FLOW_ID =", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdNotEqualTo(String value) {
            addCriterion("PS_FLOW_ID <>", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdGreaterThan(String value) {
            addCriterion("PS_FLOW_ID >", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("PS_FLOW_ID >=", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdLessThan(String value) {
            addCriterion("PS_FLOW_ID <", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdLessThanOrEqualTo(String value) {
            addCriterion("PS_FLOW_ID <=", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdLike(String value) {
            addCriterion("PS_FLOW_ID like", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdNotLike(String value) {
            addCriterion("PS_FLOW_ID not like", value, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdIn(List<String> values) {
            addCriterion("PS_FLOW_ID in", values, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdNotIn(List<String> values) {
            addCriterion("PS_FLOW_ID not in", values, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdBetween(String value1, String value2) {
            addCriterion("PS_FLOW_ID between", value1, value2, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andPsFlowIdNotBetween(String value1, String value2) {
            addCriterion("PS_FLOW_ID not between", value1, value2, "psFlowId");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagIsNull() {
            addCriterion("IS_GPS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagIsNotNull() {
            addCriterion("IS_GPS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagEqualTo(String value) {
            addCriterion("IS_GPS_FLAG =", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagNotEqualTo(String value) {
            addCriterion("IS_GPS_FLAG <>", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagGreaterThan(String value) {
            addCriterion("IS_GPS_FLAG >", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GPS_FLAG >=", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagLessThan(String value) {
            addCriterion("IS_GPS_FLAG <", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagLessThanOrEqualTo(String value) {
            addCriterion("IS_GPS_FLAG <=", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagLike(String value) {
            addCriterion("IS_GPS_FLAG like", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagNotLike(String value) {
            addCriterion("IS_GPS_FLAG not like", value, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagIn(List<String> values) {
            addCriterion("IS_GPS_FLAG in", values, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagNotIn(List<String> values) {
            addCriterion("IS_GPS_FLAG not in", values, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagBetween(String value1, String value2) {
            addCriterion("IS_GPS_FLAG between", value1, value2, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andIsGpsFlagNotBetween(String value1, String value2) {
            addCriterion("IS_GPS_FLAG not between", value1, value2, "isGpsFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIsNull() {
            addCriterion("VIDEO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIsNotNull() {
            addCriterion("VIDEO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFlagEqualTo(String value) {
            addCriterion("VIDEO_FLAG =", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotEqualTo(String value) {
            addCriterion("VIDEO_FLAG <>", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagGreaterThan(String value) {
            addCriterion("VIDEO_FLAG >", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_FLAG >=", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLessThan(String value) {
            addCriterion("VIDEO_FLAG <", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_FLAG <=", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagLike(String value) {
            addCriterion("VIDEO_FLAG like", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotLike(String value) {
            addCriterion("VIDEO_FLAG not like", value, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagIn(List<String> values) {
            addCriterion("VIDEO_FLAG in", values, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotIn(List<String> values) {
            addCriterion("VIDEO_FLAG not in", values, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagBetween(String value1, String value2) {
            addCriterion("VIDEO_FLAG between", value1, value2, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andVideoFlagNotBetween(String value1, String value2) {
            addCriterion("VIDEO_FLAG not between", value1, value2, "videoFlag");
            return (Criteria) this;
        }

        public Criteria andDlmIsNull() {
            addCriterion("DLM is null");
            return (Criteria) this;
        }

        public Criteria andDlmIsNotNull() {
            addCriterion("DLM is not null");
            return (Criteria) this;
        }

        public Criteria andDlmEqualTo(String value) {
            addCriterion("DLM =", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmNotEqualTo(String value) {
            addCriterion("DLM <>", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmGreaterThan(String value) {
            addCriterion("DLM >", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmGreaterThanOrEqualTo(String value) {
            addCriterion("DLM >=", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmLessThan(String value) {
            addCriterion("DLM <", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmLessThanOrEqualTo(String value) {
            addCriterion("DLM <=", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmLike(String value) {
            addCriterion("DLM like", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmNotLike(String value) {
            addCriterion("DLM not like", value, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmIn(List<String> values) {
            addCriterion("DLM in", values, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmNotIn(List<String> values) {
            addCriterion("DLM not in", values, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmBetween(String value1, String value2) {
            addCriterion("DLM between", value1, value2, "dlm");
            return (Criteria) this;
        }

        public Criteria andDlmNotBetween(String value1, String value2) {
            addCriterion("DLM not between", value1, value2, "dlm");
            return (Criteria) this;
        }

        public Criteria andAuditFlagIsNull() {
            addCriterion("AUDIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAuditFlagIsNotNull() {
            addCriterion("AUDIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAuditFlagEqualTo(String value) {
            addCriterion("AUDIT_FLAG =", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagNotEqualTo(String value) {
            addCriterion("AUDIT_FLAG <>", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagGreaterThan(String value) {
            addCriterion("AUDIT_FLAG >", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_FLAG >=", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagLessThan(String value) {
            addCriterion("AUDIT_FLAG <", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_FLAG <=", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagLike(String value) {
            addCriterion("AUDIT_FLAG like", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagNotLike(String value) {
            addCriterion("AUDIT_FLAG not like", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagIn(List<String> values) {
            addCriterion("AUDIT_FLAG in", values, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagNotIn(List<String> values) {
            addCriterion("AUDIT_FLAG not in", values, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagBetween(String value1, String value2) {
            addCriterion("AUDIT_FLAG between", value1, value2, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagNotBetween(String value1, String value2) {
            addCriterion("AUDIT_FLAG not between", value1, value2, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdIsNull() {
            addCriterion("SURVEY_THIRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdIsNotNull() {
            addCriterion("SURVEY_THIRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdEqualTo(String value) {
            addCriterion("SURVEY_THIRD_ID =", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdNotEqualTo(String value) {
            addCriterion("SURVEY_THIRD_ID <>", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdGreaterThan(String value) {
            addCriterion("SURVEY_THIRD_ID >", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdGreaterThanOrEqualTo(String value) {
            addCriterion("SURVEY_THIRD_ID >=", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdLessThan(String value) {
            addCriterion("SURVEY_THIRD_ID <", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdLessThanOrEqualTo(String value) {
            addCriterion("SURVEY_THIRD_ID <=", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdLike(String value) {
            addCriterion("SURVEY_THIRD_ID like", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdNotLike(String value) {
            addCriterion("SURVEY_THIRD_ID not like", value, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdIn(List<String> values) {
            addCriterion("SURVEY_THIRD_ID in", values, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdNotIn(List<String> values) {
            addCriterion("SURVEY_THIRD_ID not in", values, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdBetween(String value1, String value2) {
            addCriterion("SURVEY_THIRD_ID between", value1, value2, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andSurveyThirdIdNotBetween(String value1, String value2) {
            addCriterion("SURVEY_THIRD_ID not between", value1, value2, "surveyThirdId");
            return (Criteria) this;
        }

        public Criteria andReturnDescIsNull() {
            addCriterion("RETURN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andReturnDescIsNotNull() {
            addCriterion("RETURN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDescEqualTo(String value) {
            addCriterion("RETURN_DESC =", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescNotEqualTo(String value) {
            addCriterion("RETURN_DESC <>", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescGreaterThan(String value) {
            addCriterion("RETURN_DESC >", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_DESC >=", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescLessThan(String value) {
            addCriterion("RETURN_DESC <", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescLessThanOrEqualTo(String value) {
            addCriterion("RETURN_DESC <=", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescLike(String value) {
            addCriterion("RETURN_DESC like", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescNotLike(String value) {
            addCriterion("RETURN_DESC not like", value, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescIn(List<String> values) {
            addCriterion("RETURN_DESC in", values, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescNotIn(List<String> values) {
            addCriterion("RETURN_DESC not in", values, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescBetween(String value1, String value2) {
            addCriterion("RETURN_DESC between", value1, value2, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andReturnDescNotBetween(String value1, String value2) {
            addCriterion("RETURN_DESC not between", value1, value2, "returnDesc");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("LAT like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("LAT not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("LNG is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("LNG is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("LNG =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("LNG <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("LNG >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("LNG >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("LNG <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("LNG <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("LNG like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("LNG not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("LNG in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("LNG not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("LNG between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("LNG not between", value1, value2, "lng");
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

        public Criteria andPriceStandardIdIsNull() {
            addCriterion("PRICE_STANDARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdIsNotNull() {
            addCriterion("PRICE_STANDARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdEqualTo(String value) {
            addCriterion("PRICE_STANDARD_ID =", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdNotEqualTo(String value) {
            addCriterion("PRICE_STANDARD_ID <>", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdGreaterThan(String value) {
            addCriterion("PRICE_STANDARD_ID >", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_STANDARD_ID >=", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdLessThan(String value) {
            addCriterion("PRICE_STANDARD_ID <", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdLessThanOrEqualTo(String value) {
            addCriterion("PRICE_STANDARD_ID <=", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdLike(String value) {
            addCriterion("PRICE_STANDARD_ID like", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdNotLike(String value) {
            addCriterion("PRICE_STANDARD_ID not like", value, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdIn(List<String> values) {
            addCriterion("PRICE_STANDARD_ID in", values, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdNotIn(List<String> values) {
            addCriterion("PRICE_STANDARD_ID not in", values, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdBetween(String value1, String value2) {
            addCriterion("PRICE_STANDARD_ID between", value1, value2, "priceStandardId");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIdNotBetween(String value1, String value2) {
            addCriterion("PRICE_STANDARD_ID not between", value1, value2, "priceStandardId");
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

        public Criteria andLawCaseNoIsNull() {
            addCriterion("LAW_CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoIsNotNull() {
            addCriterion("LAW_CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoEqualTo(String value) {
            addCriterion("LAW_CASE_NO =", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoNotEqualTo(String value) {
            addCriterion("LAW_CASE_NO <>", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoGreaterThan(String value) {
            addCriterion("LAW_CASE_NO >", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("LAW_CASE_NO >=", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoLessThan(String value) {
            addCriterion("LAW_CASE_NO <", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoLessThanOrEqualTo(String value) {
            addCriterion("LAW_CASE_NO <=", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoLike(String value) {
            addCriterion("LAW_CASE_NO like", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoNotLike(String value) {
            addCriterion("LAW_CASE_NO not like", value, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoIn(List<String> values) {
            addCriterion("LAW_CASE_NO in", values, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoNotIn(List<String> values) {
            addCriterion("LAW_CASE_NO not in", values, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoBetween(String value1, String value2) {
            addCriterion("LAW_CASE_NO between", value1, value2, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andLawCaseNoNotBetween(String value1, String value2) {
            addCriterion("LAW_CASE_NO not between", value1, value2, "lawCaseNo");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdIsNull() {
            addCriterion("COMPANY_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdIsNotNull() {
            addCriterion("COMPANY_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdEqualTo(String value) {
            addCriterion("COMPANY_UNIT_ID =", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdNotEqualTo(String value) {
            addCriterion("COMPANY_UNIT_ID <>", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdGreaterThan(String value) {
            addCriterion("COMPANY_UNIT_ID >", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_UNIT_ID >=", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdLessThan(String value) {
            addCriterion("COMPANY_UNIT_ID <", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_UNIT_ID <=", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdLike(String value) {
            addCriterion("COMPANY_UNIT_ID like", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdNotLike(String value) {
            addCriterion("COMPANY_UNIT_ID not like", value, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdIn(List<String> values) {
            addCriterion("COMPANY_UNIT_ID in", values, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdNotIn(List<String> values) {
            addCriterion("COMPANY_UNIT_ID not in", values, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdBetween(String value1, String value2) {
            addCriterion("COMPANY_UNIT_ID between", value1, value2, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_UNIT_ID not between", value1, value2, "companyUnitId");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIsNull() {
            addCriterion("COMPANY_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIsNotNull() {
            addCriterion("COMPANY_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitEqualTo(String value) {
            addCriterion("COMPANY_UNIT =", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitNotEqualTo(String value) {
            addCriterion("COMPANY_UNIT <>", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitGreaterThan(String value) {
            addCriterion("COMPANY_UNIT >", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_UNIT >=", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitLessThan(String value) {
            addCriterion("COMPANY_UNIT <", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_UNIT <=", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitLike(String value) {
            addCriterion("COMPANY_UNIT like", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitNotLike(String value) {
            addCriterion("COMPANY_UNIT not like", value, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitIn(List<String> values) {
            addCriterion("COMPANY_UNIT in", values, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitNotIn(List<String> values) {
            addCriterion("COMPANY_UNIT not in", values, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitBetween(String value1, String value2) {
            addCriterion("COMPANY_UNIT between", value1, value2, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andCompanyUnitNotBetween(String value1, String value2) {
            addCriterion("COMPANY_UNIT not between", value1, value2, "companyUnit");
            return (Criteria) this;
        }

        public Criteria andPolicyNumIsNull() {
            addCriterion("POLICY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNumIsNotNull() {
            addCriterion("POLICY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNumEqualTo(String value) {
            addCriterion("POLICY_NUM =", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumNotEqualTo(String value) {
            addCriterion("POLICY_NUM <>", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumGreaterThan(String value) {
            addCriterion("POLICY_NUM >", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_NUM >=", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumLessThan(String value) {
            addCriterion("POLICY_NUM <", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumLessThanOrEqualTo(String value) {
            addCriterion("POLICY_NUM <=", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumLike(String value) {
            addCriterion("POLICY_NUM like", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumNotLike(String value) {
            addCriterion("POLICY_NUM not like", value, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumIn(List<String> values) {
            addCriterion("POLICY_NUM in", values, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumNotIn(List<String> values) {
            addCriterion("POLICY_NUM not in", values, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumBetween(String value1, String value2) {
            addCriterion("POLICY_NUM between", value1, value2, "policyNum");
            return (Criteria) this;
        }

        public Criteria andPolicyNumNotBetween(String value1, String value2) {
            addCriterion("POLICY_NUM not between", value1, value2, "policyNum");
            return (Criteria) this;
        }

        public Criteria andReportNumIsNull() {
            addCriterion("REPORT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReportNumIsNotNull() {
            addCriterion("REPORT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReportNumEqualTo(String value) {
            addCriterion("REPORT_NUM =", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumNotEqualTo(String value) {
            addCriterion("REPORT_NUM <>", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumGreaterThan(String value) {
            addCriterion("REPORT_NUM >", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_NUM >=", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumLessThan(String value) {
            addCriterion("REPORT_NUM <", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumLessThanOrEqualTo(String value) {
            addCriterion("REPORT_NUM <=", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumLike(String value) {
            addCriterion("REPORT_NUM like", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumNotLike(String value) {
            addCriterion("REPORT_NUM not like", value, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumIn(List<String> values) {
            addCriterion("REPORT_NUM in", values, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumNotIn(List<String> values) {
            addCriterion("REPORT_NUM not in", values, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumBetween(String value1, String value2) {
            addCriterion("REPORT_NUM between", value1, value2, "reportNum");
            return (Criteria) this;
        }

        public Criteria andReportNumNotBetween(String value1, String value2) {
            addCriterion("REPORT_NUM not between", value1, value2, "reportNum");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelIsNull() {
            addCriterion("ASSURANCE_PERSONNEL is null");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelIsNotNull() {
            addCriterion("ASSURANCE_PERSONNEL is not null");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelEqualTo(String value) {
            addCriterion("ASSURANCE_PERSONNEL =", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelNotEqualTo(String value) {
            addCriterion("ASSURANCE_PERSONNEL <>", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelGreaterThan(String value) {
            addCriterion("ASSURANCE_PERSONNEL >", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("ASSURANCE_PERSONNEL >=", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelLessThan(String value) {
            addCriterion("ASSURANCE_PERSONNEL <", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelLessThanOrEqualTo(String value) {
            addCriterion("ASSURANCE_PERSONNEL <=", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelLike(String value) {
            addCriterion("ASSURANCE_PERSONNEL like", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelNotLike(String value) {
            addCriterion("ASSURANCE_PERSONNEL not like", value, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelIn(List<String> values) {
            addCriterion("ASSURANCE_PERSONNEL in", values, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelNotIn(List<String> values) {
            addCriterion("ASSURANCE_PERSONNEL not in", values, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelBetween(String value1, String value2) {
            addCriterion("ASSURANCE_PERSONNEL between", value1, value2, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andAssurancePersonnelNotBetween(String value1, String value2) {
            addCriterion("ASSURANCE_PERSONNEL not between", value1, value2, "assurancePersonnel");
            return (Criteria) this;
        }

        public Criteria andSceneConditionIsNull() {
            addCriterion("SCENE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andSceneConditionIsNotNull() {
            addCriterion("SCENE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andSceneConditionEqualTo(String value) {
            addCriterion("SCENE_CONDITION =", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionNotEqualTo(String value) {
            addCriterion("SCENE_CONDITION <>", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionGreaterThan(String value) {
            addCriterion("SCENE_CONDITION >", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionGreaterThanOrEqualTo(String value) {
            addCriterion("SCENE_CONDITION >=", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionLessThan(String value) {
            addCriterion("SCENE_CONDITION <", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionLessThanOrEqualTo(String value) {
            addCriterion("SCENE_CONDITION <=", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionLike(String value) {
            addCriterion("SCENE_CONDITION like", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionNotLike(String value) {
            addCriterion("SCENE_CONDITION not like", value, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionIn(List<String> values) {
            addCriterion("SCENE_CONDITION in", values, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionNotIn(List<String> values) {
            addCriterion("SCENE_CONDITION not in", values, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionBetween(String value1, String value2) {
            addCriterion("SCENE_CONDITION between", value1, value2, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andSceneConditionNotBetween(String value1, String value2) {
            addCriterion("SCENE_CONDITION not between", value1, value2, "sceneCondition");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonIsNull() {
            addCriterion("ENTERING_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonIsNotNull() {
            addCriterion("ENTERING_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonEqualTo(String value) {
            addCriterion("ENTERING_PERSON =", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonNotEqualTo(String value) {
            addCriterion("ENTERING_PERSON <>", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonGreaterThan(String value) {
            addCriterion("ENTERING_PERSON >", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERING_PERSON >=", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonLessThan(String value) {
            addCriterion("ENTERING_PERSON <", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonLessThanOrEqualTo(String value) {
            addCriterion("ENTERING_PERSON <=", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonLike(String value) {
            addCriterion("ENTERING_PERSON like", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonNotLike(String value) {
            addCriterion("ENTERING_PERSON not like", value, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonIn(List<String> values) {
            addCriterion("ENTERING_PERSON in", values, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonNotIn(List<String> values) {
            addCriterion("ENTERING_PERSON not in", values, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonBetween(String value1, String value2) {
            addCriterion("ENTERING_PERSON between", value1, value2, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringPersonNotBetween(String value1, String value2) {
            addCriterion("ENTERING_PERSON not between", value1, value2, "enteringPerson");
            return (Criteria) this;
        }

        public Criteria andEnteringDateIsNull() {
            addCriterion("ENTERING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEnteringDateIsNotNull() {
            addCriterion("ENTERING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnteringDateEqualTo(Date value) {
            addCriterion("ENTERING_DATE =", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateNotEqualTo(Date value) {
            addCriterion("ENTERING_DATE <>", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateGreaterThan(Date value) {
            addCriterion("ENTERING_DATE >", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERING_DATE >=", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateLessThan(Date value) {
            addCriterion("ENTERING_DATE <", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateLessThanOrEqualTo(Date value) {
            addCriterion("ENTERING_DATE <=", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateIn(List<Date> values) {
            addCriterion("ENTERING_DATE in", values, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateNotIn(List<Date> values) {
            addCriterion("ENTERING_DATE not in", values, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateBetween(Date value1, Date value2) {
            addCriterion("ENTERING_DATE between", value1, value2, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateNotBetween(Date value1, Date value2) {
            addCriterion("ENTERING_DATE not between", value1, value2, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateIsNull() {
            addCriterion("APPLY_RESCUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateIsNotNull() {
            addCriterion("APPLY_RESCUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateEqualTo(Date value) {
            addCriterion("APPLY_RESCUE_DATE =", value, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateNotEqualTo(Date value) {
            addCriterion("APPLY_RESCUE_DATE <>", value, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateGreaterThan(Date value) {
            addCriterion("APPLY_RESCUE_DATE >", value, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_RESCUE_DATE >=", value, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateLessThan(Date value) {
            addCriterion("APPLY_RESCUE_DATE <", value, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_RESCUE_DATE <=", value, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateIn(List<Date> values) {
            addCriterion("APPLY_RESCUE_DATE in", values, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateNotIn(List<Date> values) {
            addCriterion("APPLY_RESCUE_DATE not in", values, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_RESCUE_DATE between", value1, value2, "applyRescueDate");
            return (Criteria) this;
        }

        public Criteria andApplyRescueDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_RESCUE_DATE not between", value1, value2, "applyRescueDate");
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

        public Criteria andBespeakNoticeDateIsNull() {
            addCriterion("BESPEAK_NOTICE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateIsNotNull() {
            addCriterion("BESPEAK_NOTICE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateEqualTo(Date value) {
            addCriterion("BESPEAK_NOTICE_DATE =", value, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateNotEqualTo(Date value) {
            addCriterion("BESPEAK_NOTICE_DATE <>", value, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateGreaterThan(Date value) {
            addCriterion("BESPEAK_NOTICE_DATE >", value, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BESPEAK_NOTICE_DATE >=", value, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateLessThan(Date value) {
            addCriterion("BESPEAK_NOTICE_DATE <", value, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateLessThanOrEqualTo(Date value) {
            addCriterion("BESPEAK_NOTICE_DATE <=", value, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateIn(List<Date> values) {
            addCriterion("BESPEAK_NOTICE_DATE in", values, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateNotIn(List<Date> values) {
            addCriterion("BESPEAK_NOTICE_DATE not in", values, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateBetween(Date value1, Date value2) {
            addCriterion("BESPEAK_NOTICE_DATE between", value1, value2, "bespeakNoticeDate");
            return (Criteria) this;
        }

        public Criteria andBespeakNoticeDateNotBetween(Date value1, Date value2) {
            addCriterion("BESPEAK_NOTICE_DATE not between", value1, value2, "bespeakNoticeDate");
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

        public Criteria andPayCompany2IsNull() {
            addCriterion("PAY_COMPANY2 is null");
            return (Criteria) this;
        }

        public Criteria andPayCompany2IsNotNull() {
            addCriterion("PAY_COMPANY2 is not null");
            return (Criteria) this;
        }

        public Criteria andPayCompany2EqualTo(String value) {
            addCriterion("PAY_COMPANY2 =", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2NotEqualTo(String value) {
            addCriterion("PAY_COMPANY2 <>", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2GreaterThan(String value) {
            addCriterion("PAY_COMPANY2 >", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2GreaterThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY2 >=", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2LessThan(String value) {
            addCriterion("PAY_COMPANY2 <", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2LessThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY2 <=", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2Like(String value) {
            addCriterion("PAY_COMPANY2 like", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2NotLike(String value) {
            addCriterion("PAY_COMPANY2 not like", value, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2In(List<String> values) {
            addCriterion("PAY_COMPANY2 in", values, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2NotIn(List<String> values) {
            addCriterion("PAY_COMPANY2 not in", values, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2Between(String value1, String value2) {
            addCriterion("PAY_COMPANY2 between", value1, value2, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andPayCompany2NotBetween(String value1, String value2) {
            addCriterion("PAY_COMPANY2 not between", value1, value2, "payCompany2");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberIsNull() {
            addCriterion("DISPATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberIsNotNull() {
            addCriterion("DISPATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberEqualTo(Integer value) {
            addCriterion("DISPATCH_NUMBER =", value, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberNotEqualTo(Integer value) {
            addCriterion("DISPATCH_NUMBER <>", value, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberGreaterThan(Integer value) {
            addCriterion("DISPATCH_NUMBER >", value, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISPATCH_NUMBER >=", value, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberLessThan(Integer value) {
            addCriterion("DISPATCH_NUMBER <", value, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberLessThanOrEqualTo(Integer value) {
            addCriterion("DISPATCH_NUMBER <=", value, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberIn(List<Integer> values) {
            addCriterion("DISPATCH_NUMBER in", values, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberNotIn(List<Integer> values) {
            addCriterion("DISPATCH_NUMBER not in", values, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberBetween(Integer value1, Integer value2) {
            addCriterion("DISPATCH_NUMBER between", value1, value2, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andDispatchNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("DISPATCH_NUMBER not between", value1, value2, "dispatchNumber");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameIsNull() {
            addCriterion("LAIDIAN_PHONE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameIsNotNull() {
            addCriterion("LAIDIAN_PHONE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameEqualTo(String value) {
            addCriterion("LAIDIAN_PHONE_NAME =", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameNotEqualTo(String value) {
            addCriterion("LAIDIAN_PHONE_NAME <>", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameGreaterThan(String value) {
            addCriterion("LAIDIAN_PHONE_NAME >", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAIDIAN_PHONE_NAME >=", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameLessThan(String value) {
            addCriterion("LAIDIAN_PHONE_NAME <", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameLessThanOrEqualTo(String value) {
            addCriterion("LAIDIAN_PHONE_NAME <=", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameLike(String value) {
            addCriterion("LAIDIAN_PHONE_NAME like", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameNotLike(String value) {
            addCriterion("LAIDIAN_PHONE_NAME not like", value, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameIn(List<String> values) {
            addCriterion("LAIDIAN_PHONE_NAME in", values, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameNotIn(List<String> values) {
            addCriterion("LAIDIAN_PHONE_NAME not in", values, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameBetween(String value1, String value2) {
            addCriterion("LAIDIAN_PHONE_NAME between", value1, value2, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andLaidianPhoneNameNotBetween(String value1, String value2) {
            addCriterion("LAIDIAN_PHONE_NAME not between", value1, value2, "laidianPhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameIsNull() {
            addCriterion("ZHUANGCHE_PHONE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameIsNotNull() {
            addCriterion("ZHUANGCHE_PHONE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME =", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameNotEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME <>", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameGreaterThan(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME >", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME >=", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameLessThan(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME <", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameLessThanOrEqualTo(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME <=", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameLike(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME like", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameNotLike(String value) {
            addCriterion("ZHUANGCHE_PHONE_NAME not like", value, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameIn(List<String> values) {
            addCriterion("ZHUANGCHE_PHONE_NAME in", values, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameNotIn(List<String> values) {
            addCriterion("ZHUANGCHE_PHONE_NAME not in", values, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameBetween(String value1, String value2) {
            addCriterion("ZHUANGCHE_PHONE_NAME between", value1, value2, "zhuangchePhoneName");
            return (Criteria) this;
        }

        public Criteria andZhuangchePhoneNameNotBetween(String value1, String value2) {
            addCriterion("ZHUANGCHE_PHONE_NAME not between", value1, value2, "zhuangchePhoneName");
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

        public Criteria andPaasTypeIsNull() {
            addCriterion("PAAS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaasTypeIsNotNull() {
            addCriterion("PAAS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaasTypeEqualTo(String value) {
            addCriterion("PAAS_TYPE =", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeNotEqualTo(String value) {
            addCriterion("PAAS_TYPE <>", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeGreaterThan(String value) {
            addCriterion("PAAS_TYPE >", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAAS_TYPE >=", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeLessThan(String value) {
            addCriterion("PAAS_TYPE <", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeLessThanOrEqualTo(String value) {
            addCriterion("PAAS_TYPE <=", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeLike(String value) {
            addCriterion("PAAS_TYPE like", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeNotLike(String value) {
            addCriterion("PAAS_TYPE not like", value, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeIn(List<String> values) {
            addCriterion("PAAS_TYPE in", values, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeNotIn(List<String> values) {
            addCriterion("PAAS_TYPE not in", values, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeBetween(String value1, String value2) {
            addCriterion("PAAS_TYPE between", value1, value2, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasTypeNotBetween(String value1, String value2) {
            addCriterion("PAAS_TYPE not between", value1, value2, "paasType");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateIsNull() {
            addCriterion("PAAS_REPORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateIsNotNull() {
            addCriterion("PAAS_REPORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateEqualTo(Date value) {
            addCriterion("PAAS_REPORT_DATE =", value, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateNotEqualTo(Date value) {
            addCriterion("PAAS_REPORT_DATE <>", value, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateGreaterThan(Date value) {
            addCriterion("PAAS_REPORT_DATE >", value, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAAS_REPORT_DATE >=", value, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateLessThan(Date value) {
            addCriterion("PAAS_REPORT_DATE <", value, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateLessThanOrEqualTo(Date value) {
            addCriterion("PAAS_REPORT_DATE <=", value, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateIn(List<Date> values) {
            addCriterion("PAAS_REPORT_DATE in", values, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateNotIn(List<Date> values) {
            addCriterion("PAAS_REPORT_DATE not in", values, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateBetween(Date value1, Date value2) {
            addCriterion("PAAS_REPORT_DATE between", value1, value2, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasReportDateNotBetween(Date value1, Date value2) {
            addCriterion("PAAS_REPORT_DATE not between", value1, value2, "paasReportDate");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdIsNull() {
            addCriterion("PAAS_APPROVE_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdIsNotNull() {
            addCriterion("PAAS_APPROVE_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID =", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdNotEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID <>", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdGreaterThan(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID >", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID >=", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdLessThan(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID <", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdLessThanOrEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID <=", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdLike(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID like", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdNotLike(String value) {
            addCriterion("PAAS_APPROVE_PERSON_ID not like", value, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdIn(List<String> values) {
            addCriterion("PAAS_APPROVE_PERSON_ID in", values, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdNotIn(List<String> values) {
            addCriterion("PAAS_APPROVE_PERSON_ID not in", values, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdBetween(String value1, String value2) {
            addCriterion("PAAS_APPROVE_PERSON_ID between", value1, value2, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonIdNotBetween(String value1, String value2) {
            addCriterion("PAAS_APPROVE_PERSON_ID not between", value1, value2, "paasApprovePersonId");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameIsNull() {
            addCriterion("PAAS_APPROVE_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameIsNotNull() {
            addCriterion("PAAS_APPROVE_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME =", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameNotEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME <>", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameGreaterThan(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME >", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME >=", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameLessThan(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME <", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameLessThanOrEqualTo(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME <=", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameLike(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME like", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameNotLike(String value) {
            addCriterion("PAAS_APPROVE_PERSON_NAME not like", value, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameIn(List<String> values) {
            addCriterion("PAAS_APPROVE_PERSON_NAME in", values, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameNotIn(List<String> values) {
            addCriterion("PAAS_APPROVE_PERSON_NAME not in", values, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameBetween(String value1, String value2) {
            addCriterion("PAAS_APPROVE_PERSON_NAME between", value1, value2, "paasApprovePersonName");
            return (Criteria) this;
        }

        public Criteria andPaasApprovePersonNameNotBetween(String value1, String value2) {
            addCriterion("PAAS_APPROVE_PERSON_NAME not between", value1, value2, "paasApprovePersonName");
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

        public Criteria andKrIdIsNull() {
            addCriterion("KR_ID is null");
            return (Criteria) this;
        }

        public Criteria andKrIdIsNotNull() {
            addCriterion("KR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKrIdEqualTo(String value) {
            addCriterion("KR_ID =", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdNotEqualTo(String value) {
            addCriterion("KR_ID <>", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdGreaterThan(String value) {
            addCriterion("KR_ID >", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdGreaterThanOrEqualTo(String value) {
            addCriterion("KR_ID >=", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdLessThan(String value) {
            addCriterion("KR_ID <", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdLessThanOrEqualTo(String value) {
            addCriterion("KR_ID <=", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdLike(String value) {
            addCriterion("KR_ID like", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdNotLike(String value) {
            addCriterion("KR_ID not like", value, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdIn(List<String> values) {
            addCriterion("KR_ID in", values, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdNotIn(List<String> values) {
            addCriterion("KR_ID not in", values, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdBetween(String value1, String value2) {
            addCriterion("KR_ID between", value1, value2, "krId");
            return (Criteria) this;
        }

        public Criteria andKrIdNotBetween(String value1, String value2) {
            addCriterion("KR_ID not between", value1, value2, "krId");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeIsNull() {
            addCriterion("DL_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeIsNotNull() {
            addCriterion("DL_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeEqualTo(String value) {
            addCriterion("DL_TYPE_CODE =", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeNotEqualTo(String value) {
            addCriterion("DL_TYPE_CODE <>", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeGreaterThan(String value) {
            addCriterion("DL_TYPE_CODE >", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DL_TYPE_CODE >=", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeLessThan(String value) {
            addCriterion("DL_TYPE_CODE <", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("DL_TYPE_CODE <=", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeLike(String value) {
            addCriterion("DL_TYPE_CODE like", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeNotLike(String value) {
            addCriterion("DL_TYPE_CODE not like", value, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeIn(List<String> values) {
            addCriterion("DL_TYPE_CODE in", values, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeNotIn(List<String> values) {
            addCriterion("DL_TYPE_CODE not in", values, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeBetween(String value1, String value2) {
            addCriterion("DL_TYPE_CODE between", value1, value2, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andDlTypeCodeNotBetween(String value1, String value2) {
            addCriterion("DL_TYPE_CODE not between", value1, value2, "dlTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeIsNull() {
            addCriterion("QD_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeIsNotNull() {
            addCriterion("QD_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeEqualTo(String value) {
            addCriterion("QD_TYPE_CODE =", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeNotEqualTo(String value) {
            addCriterion("QD_TYPE_CODE <>", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeGreaterThan(String value) {
            addCriterion("QD_TYPE_CODE >", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("QD_TYPE_CODE >=", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeLessThan(String value) {
            addCriterion("QD_TYPE_CODE <", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("QD_TYPE_CODE <=", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeLike(String value) {
            addCriterion("QD_TYPE_CODE like", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeNotLike(String value) {
            addCriterion("QD_TYPE_CODE not like", value, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeIn(List<String> values) {
            addCriterion("QD_TYPE_CODE in", values, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeNotIn(List<String> values) {
            addCriterion("QD_TYPE_CODE not in", values, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeBetween(String value1, String value2) {
            addCriterion("QD_TYPE_CODE between", value1, value2, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeCodeNotBetween(String value1, String value2) {
            addCriterion("QD_TYPE_CODE not between", value1, value2, "qdTypeCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeIsNull() {
            addCriterion("QD_TYPE_TF_CODE is null");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeIsNotNull() {
            addCriterion("QD_TYPE_TF_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeEqualTo(String value) {
            addCriterion("QD_TYPE_TF_CODE =", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeNotEqualTo(String value) {
            addCriterion("QD_TYPE_TF_CODE <>", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeGreaterThan(String value) {
            addCriterion("QD_TYPE_TF_CODE >", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("QD_TYPE_TF_CODE >=", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeLessThan(String value) {
            addCriterion("QD_TYPE_TF_CODE <", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeLessThanOrEqualTo(String value) {
            addCriterion("QD_TYPE_TF_CODE <=", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeLike(String value) {
            addCriterion("QD_TYPE_TF_CODE like", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeNotLike(String value) {
            addCriterion("QD_TYPE_TF_CODE not like", value, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeIn(List<String> values) {
            addCriterion("QD_TYPE_TF_CODE in", values, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeNotIn(List<String> values) {
            addCriterion("QD_TYPE_TF_CODE not in", values, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeBetween(String value1, String value2) {
            addCriterion("QD_TYPE_TF_CODE between", value1, value2, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andQdTypeTfCodeNotBetween(String value1, String value2) {
            addCriterion("QD_TYPE_TF_CODE not between", value1, value2, "qdTypeTfCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeIsNull() {
            addCriterion("RISK_TYPE_DATIL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeIsNotNull() {
            addCriterion("RISK_TYPE_DATIL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeEqualTo(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE =", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeNotEqualTo(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE <>", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeGreaterThan(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE >", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE >=", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeLessThan(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE <", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeLessThanOrEqualTo(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE <=", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeLike(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE like", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeNotLike(String value) {
            addCriterion("RISK_TYPE_DATIL_CODE not like", value, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeIn(List<String> values) {
            addCriterion("RISK_TYPE_DATIL_CODE in", values, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeNotIn(List<String> values) {
            addCriterion("RISK_TYPE_DATIL_CODE not in", values, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeBetween(String value1, String value2) {
            addCriterion("RISK_TYPE_DATIL_CODE between", value1, value2, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andRiskTypeDatilCodeNotBetween(String value1, String value2) {
            addCriterion("RISK_TYPE_DATIL_CODE not between", value1, value2, "riskTypeDatilCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeIsNull() {
            addCriterion("TD_HETONG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeIsNotNull() {
            addCriterion("TD_HETONG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeEqualTo(String value) {
            addCriterion("TD_HETONG_CODE =", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeNotEqualTo(String value) {
            addCriterion("TD_HETONG_CODE <>", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeGreaterThan(String value) {
            addCriterion("TD_HETONG_CODE >", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TD_HETONG_CODE >=", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeLessThan(String value) {
            addCriterion("TD_HETONG_CODE <", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeLessThanOrEqualTo(String value) {
            addCriterion("TD_HETONG_CODE <=", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeLike(String value) {
            addCriterion("TD_HETONG_CODE like", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeNotLike(String value) {
            addCriterion("TD_HETONG_CODE not like", value, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeIn(List<String> values) {
            addCriterion("TD_HETONG_CODE in", values, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeNotIn(List<String> values) {
            addCriterion("TD_HETONG_CODE not in", values, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeBetween(String value1, String value2) {
            addCriterion("TD_HETONG_CODE between", value1, value2, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andTdHetongCodeNotBetween(String value1, String value2) {
            addCriterion("TD_HETONG_CODE not between", value1, value2, "tdHetongCode");
            return (Criteria) this;
        }

        public Criteria andXslcIsNull() {
            addCriterion("XSLC is null");
            return (Criteria) this;
        }

        public Criteria andXslcIsNotNull() {
            addCriterion("XSLC is not null");
            return (Criteria) this;
        }

        public Criteria andXslcEqualTo(Double value) {
            addCriterion("XSLC =", value, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcNotEqualTo(Double value) {
            addCriterion("XSLC <>", value, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcGreaterThan(Double value) {
            addCriterion("XSLC >", value, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcGreaterThanOrEqualTo(Double value) {
            addCriterion("XSLC >=", value, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcLessThan(Double value) {
            addCriterion("XSLC <", value, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcLessThanOrEqualTo(Double value) {
            addCriterion("XSLC <=", value, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcIn(List<Double> values) {
            addCriterion("XSLC in", values, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcNotIn(List<Double> values) {
            addCriterion("XSLC not in", values, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcBetween(Double value1, Double value2) {
            addCriterion("XSLC between", value1, value2, "xslc");
            return (Criteria) this;
        }

        public Criteria andXslcNotBetween(Double value1, Double value2) {
            addCriterion("XSLC not between", value1, value2, "xslc");
            return (Criteria) this;
        }

        public Criteria andIsMyCostIsNull() {
            addCriterion("IS_MY_COST is null");
            return (Criteria) this;
        }

        public Criteria andIsMyCostIsNotNull() {
            addCriterion("IS_MY_COST is not null");
            return (Criteria) this;
        }

        public Criteria andIsMyCostEqualTo(String value) {
            addCriterion("IS_MY_COST =", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostNotEqualTo(String value) {
            addCriterion("IS_MY_COST <>", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostGreaterThan(String value) {
            addCriterion("IS_MY_COST >", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MY_COST >=", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostLessThan(String value) {
            addCriterion("IS_MY_COST <", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostLessThanOrEqualTo(String value) {
            addCriterion("IS_MY_COST <=", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostLike(String value) {
            addCriterion("IS_MY_COST like", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostNotLike(String value) {
            addCriterion("IS_MY_COST not like", value, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostIn(List<String> values) {
            addCriterion("IS_MY_COST in", values, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostNotIn(List<String> values) {
            addCriterion("IS_MY_COST not in", values, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostBetween(String value1, String value2) {
            addCriterion("IS_MY_COST between", value1, value2, "isMyCost");
            return (Criteria) this;
        }

        public Criteria andIsMyCostNotBetween(String value1, String value2) {
            addCriterion("IS_MY_COST not between", value1, value2, "isMyCost");
            return (Criteria) this;
        }
    }

    /**
     * lp_flow
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * lp_flow 2016-08-18
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