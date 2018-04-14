package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityCashbackLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityCashbackLogExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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

        public Criteria andCashbackTimeIsNull() {
            addCriterion("cashback_time is null");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeIsNotNull() {
            addCriterion("cashback_time is not null");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeEqualTo(Date value) {
            addCriterion("cashback_time =", value, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeNotEqualTo(Date value) {
            addCriterion("cashback_time <>", value, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeGreaterThan(Date value) {
            addCriterion("cashback_time >", value, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cashback_time >=", value, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeLessThan(Date value) {
            addCriterion("cashback_time <", value, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("cashback_time <=", value, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeIn(List<Date> values) {
            addCriterion("cashback_time in", values, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeNotIn(List<Date> values) {
            addCriterion("cashback_time not in", values, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeBetween(Date value1, Date value2) {
            addCriterion("cashback_time between", value1, value2, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andCashbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("cashback_time not between", value1, value2, "cashbackTime");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderUrlIsNull() {
            addCriterion("order_url is null");
            return (Criteria) this;
        }

        public Criteria andOrderUrlIsNotNull() {
            addCriterion("order_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUrlEqualTo(String value) {
            addCriterion("order_url =", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotEqualTo(String value) {
            addCriterion("order_url <>", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlGreaterThan(String value) {
            addCriterion("order_url >", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlGreaterThanOrEqualTo(String value) {
            addCriterion("order_url >=", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlLessThan(String value) {
            addCriterion("order_url <", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlLessThanOrEqualTo(String value) {
            addCriterion("order_url <=", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlLike(String value) {
            addCriterion("order_url like", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotLike(String value) {
            addCriterion("order_url not like", value, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlIn(List<String> values) {
            addCriterion("order_url in", values, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotIn(List<String> values) {
            addCriterion("order_url not in", values, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlBetween(String value1, String value2) {
            addCriterion("order_url between", value1, value2, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andOrderUrlNotBetween(String value1, String value2) {
            addCriterion("order_url not between", value1, value2, "orderUrl");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyIsNull() {
            addCriterion("cashback_money is null");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyIsNotNull() {
            addCriterion("cashback_money is not null");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyEqualTo(Double value) {
            addCriterion("cashback_money =", value, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyNotEqualTo(Double value) {
            addCriterion("cashback_money <>", value, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyGreaterThan(Double value) {
            addCriterion("cashback_money >", value, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cashback_money >=", value, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyLessThan(Double value) {
            addCriterion("cashback_money <", value, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cashback_money <=", value, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyIn(List<Double> values) {
            addCriterion("cashback_money in", values, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyNotIn(List<Double> values) {
            addCriterion("cashback_money not in", values, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyBetween(Double value1, Double value2) {
            addCriterion("cashback_money between", value1, value2, "cashbackMoney");
            return (Criteria) this;
        }

        public Criteria andCashbackMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cashback_money not between", value1, value2, "cashbackMoney");
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