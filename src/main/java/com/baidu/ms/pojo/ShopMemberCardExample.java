package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopMemberCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopMemberCardExample() {
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

        public Criteria andCardIconIsNull() {
            addCriterion("card_icon is null");
            return (Criteria) this;
        }

        public Criteria andCardIconIsNotNull() {
            addCriterion("card_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCardIconEqualTo(String value) {
            addCriterion("card_icon =", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconNotEqualTo(String value) {
            addCriterion("card_icon <>", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconGreaterThan(String value) {
            addCriterion("card_icon >", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconGreaterThanOrEqualTo(String value) {
            addCriterion("card_icon >=", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconLessThan(String value) {
            addCriterion("card_icon <", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconLessThanOrEqualTo(String value) {
            addCriterion("card_icon <=", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconLike(String value) {
            addCriterion("card_icon like", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconNotLike(String value) {
            addCriterion("card_icon not like", value, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconIn(List<String> values) {
            addCriterion("card_icon in", values, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconNotIn(List<String> values) {
            addCriterion("card_icon not in", values, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconBetween(String value1, String value2) {
            addCriterion("card_icon between", value1, value2, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardIconNotBetween(String value1, String value2) {
            addCriterion("card_icon not between", value1, value2, "cardIcon");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardLevelIsNull() {
            addCriterion("card_level is null");
            return (Criteria) this;
        }

        public Criteria andCardLevelIsNotNull() {
            addCriterion("card_level is not null");
            return (Criteria) this;
        }

        public Criteria andCardLevelEqualTo(Integer value) {
            addCriterion("card_level =", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotEqualTo(Integer value) {
            addCriterion("card_level <>", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelGreaterThan(Integer value) {
            addCriterion("card_level >", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_level >=", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelLessThan(Integer value) {
            addCriterion("card_level <", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelLessThanOrEqualTo(Integer value) {
            addCriterion("card_level <=", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelIn(List<Integer> values) {
            addCriterion("card_level in", values, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotIn(List<Integer> values) {
            addCriterion("card_level not in", values, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelBetween(Integer value1, Integer value2) {
            addCriterion("card_level between", value1, value2, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("card_level not between", value1, value2, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Float value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Float value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Float value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Float value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Float value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Float> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Float> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Float value1, Float value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Float value1, Float value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIsNull() {
            addCriterion("upate_time is null");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIsNotNull() {
            addCriterion("upate_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpateTimeEqualTo(Date value) {
            addCriterion("upate_time =", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotEqualTo(Date value) {
            addCriterion("upate_time <>", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeGreaterThan(Date value) {
            addCriterion("upate_time >", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upate_time >=", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeLessThan(Date value) {
            addCriterion("upate_time <", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeLessThanOrEqualTo(Date value) {
            addCriterion("upate_time <=", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIn(List<Date> values) {
            addCriterion("upate_time in", values, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotIn(List<Date> values) {
            addCriterion("upate_time not in", values, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeBetween(Date value1, Date value2) {
            addCriterion("upate_time between", value1, value2, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotBetween(Date value1, Date value2) {
            addCriterion("upate_time not between", value1, value2, "upateTime");
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

        public Criteria andTradeUpgradeLimitIsNull() {
            addCriterion("trade_upgrade_limit is null");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitIsNotNull() {
            addCriterion("trade_upgrade_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitEqualTo(Integer value) {
            addCriterion("trade_upgrade_limit =", value, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitNotEqualTo(Integer value) {
            addCriterion("trade_upgrade_limit <>", value, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitGreaterThan(Integer value) {
            addCriterion("trade_upgrade_limit >", value, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_upgrade_limit >=", value, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitLessThan(Integer value) {
            addCriterion("trade_upgrade_limit <", value, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("trade_upgrade_limit <=", value, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitIn(List<Integer> values) {
            addCriterion("trade_upgrade_limit in", values, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitNotIn(List<Integer> values) {
            addCriterion("trade_upgrade_limit not in", values, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitBetween(Integer value1, Integer value2) {
            addCriterion("trade_upgrade_limit between", value1, value2, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andTradeUpgradeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_upgrade_limit not between", value1, value2, "tradeUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitIsNull() {
            addCriterion("money_upgrade_limit is null");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitIsNotNull() {
            addCriterion("money_upgrade_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitEqualTo(Double value) {
            addCriterion("money_upgrade_limit =", value, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitNotEqualTo(Double value) {
            addCriterion("money_upgrade_limit <>", value, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitGreaterThan(Double value) {
            addCriterion("money_upgrade_limit >", value, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("money_upgrade_limit >=", value, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitLessThan(Double value) {
            addCriterion("money_upgrade_limit <", value, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitLessThanOrEqualTo(Double value) {
            addCriterion("money_upgrade_limit <=", value, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitIn(List<Double> values) {
            addCriterion("money_upgrade_limit in", values, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitNotIn(List<Double> values) {
            addCriterion("money_upgrade_limit not in", values, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitBetween(Double value1, Double value2) {
            addCriterion("money_upgrade_limit between", value1, value2, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyUpgradeLimitNotBetween(Double value1, Double value2) {
            addCriterion("money_upgrade_limit not between", value1, value2, "moneyUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitIsNull() {
            addCriterion("point_upgrade_limit is null");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitIsNotNull() {
            addCriterion("point_upgrade_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitEqualTo(Integer value) {
            addCriterion("point_upgrade_limit =", value, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitNotEqualTo(Integer value) {
            addCriterion("point_upgrade_limit <>", value, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitGreaterThan(Integer value) {
            addCriterion("point_upgrade_limit >", value, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_upgrade_limit >=", value, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitLessThan(Integer value) {
            addCriterion("point_upgrade_limit <", value, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("point_upgrade_limit <=", value, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitIn(List<Integer> values) {
            addCriterion("point_upgrade_limit in", values, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitNotIn(List<Integer> values) {
            addCriterion("point_upgrade_limit not in", values, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitBetween(Integer value1, Integer value2) {
            addCriterion("point_upgrade_limit between", value1, value2, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andPointUpgradeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("point_upgrade_limit not between", value1, value2, "pointUpgradeLimit");
            return (Criteria) this;
        }

        public Criteria andUsageNotesIsNull() {
            addCriterion("usage_notes is null");
            return (Criteria) this;
        }

        public Criteria andUsageNotesIsNotNull() {
            addCriterion("usage_notes is not null");
            return (Criteria) this;
        }

        public Criteria andUsageNotesEqualTo(String value) {
            addCriterion("usage_notes =", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesNotEqualTo(String value) {
            addCriterion("usage_notes <>", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesGreaterThan(String value) {
            addCriterion("usage_notes >", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesGreaterThanOrEqualTo(String value) {
            addCriterion("usage_notes >=", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesLessThan(String value) {
            addCriterion("usage_notes <", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesLessThanOrEqualTo(String value) {
            addCriterion("usage_notes <=", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesLike(String value) {
            addCriterion("usage_notes like", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesNotLike(String value) {
            addCriterion("usage_notes not like", value, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesIn(List<String> values) {
            addCriterion("usage_notes in", values, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesNotIn(List<String> values) {
            addCriterion("usage_notes not in", values, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesBetween(String value1, String value2) {
            addCriterion("usage_notes between", value1, value2, "usageNotes");
            return (Criteria) this;
        }

        public Criteria andUsageNotesNotBetween(String value1, String value2) {
            addCriterion("usage_notes not between", value1, value2, "usageNotes");
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