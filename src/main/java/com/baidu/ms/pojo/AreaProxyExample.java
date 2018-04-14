package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.List;

public class AreaProxyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaProxyExample() {
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

        public Criteria andProxyShopIdIsNull() {
            addCriterion("proxy_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdIsNotNull() {
            addCriterion("proxy_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdEqualTo(Integer value) {
            addCriterion("proxy_shop_id =", value, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdNotEqualTo(Integer value) {
            addCriterion("proxy_shop_id <>", value, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdGreaterThan(Integer value) {
            addCriterion("proxy_shop_id >", value, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proxy_shop_id >=", value, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdLessThan(Integer value) {
            addCriterion("proxy_shop_id <", value, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("proxy_shop_id <=", value, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdIn(List<Integer> values) {
            addCriterion("proxy_shop_id in", values, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdNotIn(List<Integer> values) {
            addCriterion("proxy_shop_id not in", values, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdBetween(Integer value1, Integer value2) {
            addCriterion("proxy_shop_id between", value1, value2, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andProxyShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proxy_shop_id not between", value1, value2, "proxyShopId");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(Double value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(Double value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(Double value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(Double value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<Double> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<Double> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTradeNumIsNull() {
            addCriterion("trade_num is null");
            return (Criteria) this;
        }

        public Criteria andTradeNumIsNotNull() {
            addCriterion("trade_num is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNumEqualTo(Integer value) {
            addCriterion("trade_num =", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotEqualTo(Integer value) {
            addCriterion("trade_num <>", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThan(Integer value) {
            addCriterion("trade_num >", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_num >=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThan(Integer value) {
            addCriterion("trade_num <", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThanOrEqualTo(Integer value) {
            addCriterion("trade_num <=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumIn(List<Integer> values) {
            addCriterion("trade_num in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotIn(List<Integer> values) {
            addCriterion("trade_num not in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumBetween(Integer value1, Integer value2) {
            addCriterion("trade_num between", value1, value2, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_num not between", value1, value2, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyIsNull() {
            addCriterion("settled_money is null");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyIsNotNull() {
            addCriterion("settled_money is not null");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyEqualTo(Double value) {
            addCriterion("settled_money =", value, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyNotEqualTo(Double value) {
            addCriterion("settled_money <>", value, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyGreaterThan(Double value) {
            addCriterion("settled_money >", value, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("settled_money >=", value, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyLessThan(Double value) {
            addCriterion("settled_money <", value, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyLessThanOrEqualTo(Double value) {
            addCriterion("settled_money <=", value, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyIn(List<Double> values) {
            addCriterion("settled_money in", values, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyNotIn(List<Double> values) {
            addCriterion("settled_money not in", values, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyBetween(Double value1, Double value2) {
            addCriterion("settled_money between", value1, value2, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andSettledMoneyNotBetween(Double value1, Double value2) {
            addCriterion("settled_money not between", value1, value2, "settledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyIsNull() {
            addCriterion("unsettled_money is null");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyIsNotNull() {
            addCriterion("unsettled_money is not null");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyEqualTo(Double value) {
            addCriterion("unsettled_money =", value, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyNotEqualTo(Double value) {
            addCriterion("unsettled_money <>", value, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyGreaterThan(Double value) {
            addCriterion("unsettled_money >", value, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("unsettled_money >=", value, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyLessThan(Double value) {
            addCriterion("unsettled_money <", value, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyLessThanOrEqualTo(Double value) {
            addCriterion("unsettled_money <=", value, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyIn(List<Double> values) {
            addCriterion("unsettled_money in", values, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyNotIn(List<Double> values) {
            addCriterion("unsettled_money not in", values, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyBetween(Double value1, Double value2) {
            addCriterion("unsettled_money between", value1, value2, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andUnsettledMoneyNotBetween(Double value1, Double value2) {
            addCriterion("unsettled_money not between", value1, value2, "unsettledMoney");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdIsNull() {
            addCriterion("proxy_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdIsNotNull() {
            addCriterion("proxy_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdEqualTo(Integer value) {
            addCriterion("proxy_user_id =", value, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdNotEqualTo(Integer value) {
            addCriterion("proxy_user_id <>", value, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdGreaterThan(Integer value) {
            addCriterion("proxy_user_id >", value, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proxy_user_id >=", value, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdLessThan(Integer value) {
            addCriterion("proxy_user_id <", value, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("proxy_user_id <=", value, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdIn(List<Integer> values) {
            addCriterion("proxy_user_id in", values, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdNotIn(List<Integer> values) {
            addCriterion("proxy_user_id not in", values, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("proxy_user_id between", value1, value2, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andProxyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proxy_user_id not between", value1, value2, "proxyUserId");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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