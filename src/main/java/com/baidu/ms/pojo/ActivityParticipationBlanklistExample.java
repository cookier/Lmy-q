package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityParticipationBlanklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityParticipationBlanklistExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andApIdIsNull() {
            addCriterion("ap_id is null");
            return (Criteria) this;
        }

        public Criteria andApIdIsNotNull() {
            addCriterion("ap_id is not null");
            return (Criteria) this;
        }

        public Criteria andApIdEqualTo(Integer value) {
            addCriterion("ap_id =", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotEqualTo(Integer value) {
            addCriterion("ap_id <>", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThan(Integer value) {
            addCriterion("ap_id >", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap_id >=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThan(Integer value) {
            addCriterion("ap_id <", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap_id <=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdIn(List<Integer> values) {
            addCriterion("ap_id in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotIn(List<Integer> values) {
            addCriterion("ap_id not in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdBetween(Integer value1, Integer value2) {
            addCriterion("ap_id between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap_id not between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsIsNull() {
            addCriterion("exclude_rule_ids is null");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsIsNotNull() {
            addCriterion("exclude_rule_ids is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsEqualTo(String value) {
            addCriterion("exclude_rule_ids =", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsNotEqualTo(String value) {
            addCriterion("exclude_rule_ids <>", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsGreaterThan(String value) {
            addCriterion("exclude_rule_ids >", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsGreaterThanOrEqualTo(String value) {
            addCriterion("exclude_rule_ids >=", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsLessThan(String value) {
            addCriterion("exclude_rule_ids <", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsLessThanOrEqualTo(String value) {
            addCriterion("exclude_rule_ids <=", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsLike(String value) {
            addCriterion("exclude_rule_ids like", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsNotLike(String value) {
            addCriterion("exclude_rule_ids not like", value, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsIn(List<String> values) {
            addCriterion("exclude_rule_ids in", values, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsNotIn(List<String> values) {
            addCriterion("exclude_rule_ids not in", values, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsBetween(String value1, String value2) {
            addCriterion("exclude_rule_ids between", value1, value2, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andExcludeRuleIdsNotBetween(String value1, String value2) {
            addCriterion("exclude_rule_ids not between", value1, value2, "excludeRuleIds");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagIsNull() {
            addCriterion("activity_data_retain_flag is null");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagIsNotNull() {
            addCriterion("activity_data_retain_flag is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagEqualTo(Integer value) {
            addCriterion("activity_data_retain_flag =", value, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagNotEqualTo(Integer value) {
            addCriterion("activity_data_retain_flag <>", value, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagGreaterThan(Integer value) {
            addCriterion("activity_data_retain_flag >", value, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_data_retain_flag >=", value, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagLessThan(Integer value) {
            addCriterion("activity_data_retain_flag <", value, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagLessThanOrEqualTo(Integer value) {
            addCriterion("activity_data_retain_flag <=", value, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagIn(List<Integer> values) {
            addCriterion("activity_data_retain_flag in", values, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagNotIn(List<Integer> values) {
            addCriterion("activity_data_retain_flag not in", values, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagBetween(Integer value1, Integer value2) {
            addCriterion("activity_data_retain_flag between", value1, value2, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andActivityDataRetainFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_data_retain_flag not between", value1, value2, "activityDataRetainFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIsNull() {
            addCriterion("invalid_time is null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIsNotNull() {
            addCriterion("invalid_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeEqualTo(Date value) {
            addCriterion("invalid_time =", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotEqualTo(Date value) {
            addCriterion("invalid_time <>", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThan(Date value) {
            addCriterion("invalid_time >", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("invalid_time >=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThan(Date value) {
            addCriterion("invalid_time <", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThanOrEqualTo(Date value) {
            addCriterion("invalid_time <=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIn(List<Date> values) {
            addCriterion("invalid_time in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotIn(List<Date> values) {
            addCriterion("invalid_time not in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeBetween(Date value1, Date value2) {
            addCriterion("invalid_time between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotBetween(Date value1, Date value2) {
            addCriterion("invalid_time not between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusIsNull() {
            addCriterion("invalid_status is null");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusIsNotNull() {
            addCriterion("invalid_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusEqualTo(Integer value) {
            addCriterion("invalid_status =", value, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusNotEqualTo(Integer value) {
            addCriterion("invalid_status <>", value, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusGreaterThan(Integer value) {
            addCriterion("invalid_status >", value, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("invalid_status >=", value, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusLessThan(Integer value) {
            addCriterion("invalid_status <", value, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusLessThanOrEqualTo(Integer value) {
            addCriterion("invalid_status <=", value, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusIn(List<Integer> values) {
            addCriterion("invalid_status in", values, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusNotIn(List<Integer> values) {
            addCriterion("invalid_status not in", values, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusBetween(Integer value1, Integer value2) {
            addCriterion("invalid_status between", value1, value2, "invalidStatus");
            return (Criteria) this;
        }

        public Criteria andInvalidStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("invalid_status not between", value1, value2, "invalidStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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