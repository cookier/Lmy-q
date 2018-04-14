package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDayBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDayBillExample() {
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

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeIsNull() {
            addCriterion("craete_time is null");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeIsNotNull() {
            addCriterion("craete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeEqualTo(Date value) {
            addCriterion("craete_time =", value, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeNotEqualTo(Date value) {
            addCriterion("craete_time <>", value, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeGreaterThan(Date value) {
            addCriterion("craete_time >", value, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("craete_time >=", value, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeLessThan(Date value) {
            addCriterion("craete_time <", value, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeLessThanOrEqualTo(Date value) {
            addCriterion("craete_time <=", value, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeIn(List<Date> values) {
            addCriterion("craete_time in", values, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeNotIn(List<Date> values) {
            addCriterion("craete_time not in", values, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeBetween(Date value1, Date value2) {
            addCriterion("craete_time between", value1, value2, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andCraeteTimeNotBetween(Date value1, Date value2) {
            addCriterion("craete_time not between", value1, value2, "craeteTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeIsNull() {
            addCriterion("last_billing_time is null");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeIsNotNull() {
            addCriterion("last_billing_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeEqualTo(Date value) {
            addCriterion("last_billing_time =", value, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeNotEqualTo(Date value) {
            addCriterion("last_billing_time <>", value, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeGreaterThan(Date value) {
            addCriterion("last_billing_time >", value, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_billing_time >=", value, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeLessThan(Date value) {
            addCriterion("last_billing_time <", value, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_billing_time <=", value, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeIn(List<Date> values) {
            addCriterion("last_billing_time in", values, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeNotIn(List<Date> values) {
            addCriterion("last_billing_time not in", values, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeBetween(Date value1, Date value2) {
            addCriterion("last_billing_time between", value1, value2, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andLastBillingTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_billing_time not between", value1, value2, "lastBillingTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordIsNull() {
            addCriterion("money_operation_record is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordIsNotNull() {
            addCriterion("money_operation_record is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordEqualTo(String value) {
            addCriterion("money_operation_record =", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordNotEqualTo(String value) {
            addCriterion("money_operation_record <>", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordGreaterThan(String value) {
            addCriterion("money_operation_record >", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordGreaterThanOrEqualTo(String value) {
            addCriterion("money_operation_record >=", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordLessThan(String value) {
            addCriterion("money_operation_record <", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordLessThanOrEqualTo(String value) {
            addCriterion("money_operation_record <=", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordLike(String value) {
            addCriterion("money_operation_record like", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordNotLike(String value) {
            addCriterion("money_operation_record not like", value, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordIn(List<String> values) {
            addCriterion("money_operation_record in", values, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordNotIn(List<String> values) {
            addCriterion("money_operation_record not in", values, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordBetween(String value1, String value2) {
            addCriterion("money_operation_record between", value1, value2, "moneyOperationRecord");
            return (Criteria) this;
        }

        public Criteria andMoneyOperationRecordNotBetween(String value1, String value2) {
            addCriterion("money_operation_record not between", value1, value2, "moneyOperationRecord");
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