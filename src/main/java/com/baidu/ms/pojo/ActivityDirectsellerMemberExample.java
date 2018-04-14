package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityDirectsellerMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityDirectsellerMemberExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeIsNull() {
            addCriterion("trading_volume is null");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeIsNotNull() {
            addCriterion("trading_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeEqualTo(Double value) {
            addCriterion("trading_volume =", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeNotEqualTo(Double value) {
            addCriterion("trading_volume <>", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeGreaterThan(Double value) {
            addCriterion("trading_volume >", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("trading_volume >=", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeLessThan(Double value) {
            addCriterion("trading_volume <", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeLessThanOrEqualTo(Double value) {
            addCriterion("trading_volume <=", value, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeIn(List<Double> values) {
            addCriterion("trading_volume in", values, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeNotIn(List<Double> values) {
            addCriterion("trading_volume not in", values, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeBetween(Double value1, Double value2) {
            addCriterion("trading_volume between", value1, value2, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andTradingVolumeNotBetween(Double value1, Double value2) {
            addCriterion("trading_volume not between", value1, value2, "tradingVolume");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountIsNull() {
            addCriterion("auto_settle_amount is null");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountIsNotNull() {
            addCriterion("auto_settle_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountEqualTo(Double value) {
            addCriterion("auto_settle_amount =", value, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountNotEqualTo(Double value) {
            addCriterion("auto_settle_amount <>", value, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountGreaterThan(Double value) {
            addCriterion("auto_settle_amount >", value, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("auto_settle_amount >=", value, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountLessThan(Double value) {
            addCriterion("auto_settle_amount <", value, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountLessThanOrEqualTo(Double value) {
            addCriterion("auto_settle_amount <=", value, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountIn(List<Double> values) {
            addCriterion("auto_settle_amount in", values, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountNotIn(List<Double> values) {
            addCriterion("auto_settle_amount not in", values, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountBetween(Double value1, Double value2) {
            addCriterion("auto_settle_amount between", value1, value2, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleAmountNotBetween(Double value1, Double value2) {
            addCriterion("auto_settle_amount not between", value1, value2, "autoSettleAmount");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumIsNull() {
            addCriterion("auto_settle_num is null");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumIsNotNull() {
            addCriterion("auto_settle_num is not null");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumEqualTo(Integer value) {
            addCriterion("auto_settle_num =", value, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumNotEqualTo(Integer value) {
            addCriterion("auto_settle_num <>", value, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumGreaterThan(Integer value) {
            addCriterion("auto_settle_num >", value, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_settle_num >=", value, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumLessThan(Integer value) {
            addCriterion("auto_settle_num <", value, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumLessThanOrEqualTo(Integer value) {
            addCriterion("auto_settle_num <=", value, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumIn(List<Integer> values) {
            addCriterion("auto_settle_num in", values, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumNotIn(List<Integer> values) {
            addCriterion("auto_settle_num not in", values, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumBetween(Integer value1, Integer value2) {
            addCriterion("auto_settle_num between", value1, value2, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andAutoSettleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_settle_num not between", value1, value2, "autoSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountIsNull() {
            addCriterion("manual_settle_amount is null");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountIsNotNull() {
            addCriterion("manual_settle_amount is not null");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountEqualTo(Double value) {
            addCriterion("manual_settle_amount =", value, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountNotEqualTo(Double value) {
            addCriterion("manual_settle_amount <>", value, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountGreaterThan(Double value) {
            addCriterion("manual_settle_amount >", value, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("manual_settle_amount >=", value, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountLessThan(Double value) {
            addCriterion("manual_settle_amount <", value, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountLessThanOrEqualTo(Double value) {
            addCriterion("manual_settle_amount <=", value, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountIn(List<Double> values) {
            addCriterion("manual_settle_amount in", values, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountNotIn(List<Double> values) {
            addCriterion("manual_settle_amount not in", values, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountBetween(Double value1, Double value2) {
            addCriterion("manual_settle_amount between", value1, value2, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleAmountNotBetween(Double value1, Double value2) {
            addCriterion("manual_settle_amount not between", value1, value2, "manualSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumIsNull() {
            addCriterion("manual_settle_num is null");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumIsNotNull() {
            addCriterion("manual_settle_num is not null");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumEqualTo(Integer value) {
            addCriterion("manual_settle_num =", value, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumNotEqualTo(Integer value) {
            addCriterion("manual_settle_num <>", value, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumGreaterThan(Integer value) {
            addCriterion("manual_settle_num >", value, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("manual_settle_num >=", value, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumLessThan(Integer value) {
            addCriterion("manual_settle_num <", value, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumLessThanOrEqualTo(Integer value) {
            addCriterion("manual_settle_num <=", value, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumIn(List<Integer> values) {
            addCriterion("manual_settle_num in", values, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumNotIn(List<Integer> values) {
            addCriterion("manual_settle_num not in", values, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumBetween(Integer value1, Integer value2) {
            addCriterion("manual_settle_num between", value1, value2, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andManualSettleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("manual_settle_num not between", value1, value2, "manualSettleNum");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyIsNull() {
            addCriterion("settle_money is null");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyIsNotNull() {
            addCriterion("settle_money is not null");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyEqualTo(Double value) {
            addCriterion("settle_money =", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyNotEqualTo(Double value) {
            addCriterion("settle_money <>", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyGreaterThan(Double value) {
            addCriterion("settle_money >", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("settle_money >=", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyLessThan(Double value) {
            addCriterion("settle_money <", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyLessThanOrEqualTo(Double value) {
            addCriterion("settle_money <=", value, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyIn(List<Double> values) {
            addCriterion("settle_money in", values, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyNotIn(List<Double> values) {
            addCriterion("settle_money not in", values, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyBetween(Double value1, Double value2) {
            addCriterion("settle_money between", value1, value2, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andSettleMoneyNotBetween(Double value1, Double value2) {
            addCriterion("settle_money not between", value1, value2, "settleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyIsNull() {
            addCriterion("wait_settle_money is null");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyIsNotNull() {
            addCriterion("wait_settle_money is not null");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyEqualTo(Double value) {
            addCriterion("wait_settle_money =", value, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyNotEqualTo(Double value) {
            addCriterion("wait_settle_money <>", value, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyGreaterThan(Double value) {
            addCriterion("wait_settle_money >", value, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("wait_settle_money >=", value, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyLessThan(Double value) {
            addCriterion("wait_settle_money <", value, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyLessThanOrEqualTo(Double value) {
            addCriterion("wait_settle_money <=", value, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyIn(List<Double> values) {
            addCriterion("wait_settle_money in", values, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyNotIn(List<Double> values) {
            addCriterion("wait_settle_money not in", values, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyBetween(Double value1, Double value2) {
            addCriterion("wait_settle_money between", value1, value2, "waitSettleMoney");
            return (Criteria) this;
        }

        public Criteria andWaitSettleMoneyNotBetween(Double value1, Double value2) {
            addCriterion("wait_settle_money not between", value1, value2, "waitSettleMoney");
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