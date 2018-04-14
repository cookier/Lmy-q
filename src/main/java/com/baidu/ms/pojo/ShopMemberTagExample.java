package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopMemberTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopMemberTagExample() {
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

        public Criteria andLabelNameIsNull() {
            addCriterion("label_name is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("label_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("label_name =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("label_name <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("label_name >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("label_name >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("label_name <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("label_name <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("label_name like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("label_name not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("label_name in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("label_name not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("label_name between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("label_name not between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountIsNull() {
            addCriterion("wechat_vip_count is null");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountIsNotNull() {
            addCriterion("wechat_vip_count is not null");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountEqualTo(Integer value) {
            addCriterion("wechat_vip_count =", value, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountNotEqualTo(Integer value) {
            addCriterion("wechat_vip_count <>", value, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountGreaterThan(Integer value) {
            addCriterion("wechat_vip_count >", value, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_vip_count >=", value, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountLessThan(Integer value) {
            addCriterion("wechat_vip_count <", value, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_vip_count <=", value, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountIn(List<Integer> values) {
            addCriterion("wechat_vip_count in", values, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountNotIn(List<Integer> values) {
            addCriterion("wechat_vip_count not in", values, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountBetween(Integer value1, Integer value2) {
            addCriterion("wechat_vip_count between", value1, value2, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andWechatVipCountNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_vip_count not between", value1, value2, "wechatVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountIsNull() {
            addCriterion("mobile_vip_count is null");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountIsNotNull() {
            addCriterion("mobile_vip_count is not null");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountEqualTo(Integer value) {
            addCriterion("mobile_vip_count =", value, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountNotEqualTo(Integer value) {
            addCriterion("mobile_vip_count <>", value, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountGreaterThan(Integer value) {
            addCriterion("mobile_vip_count >", value, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile_vip_count >=", value, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountLessThan(Integer value) {
            addCriterion("mobile_vip_count <", value, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountLessThanOrEqualTo(Integer value) {
            addCriterion("mobile_vip_count <=", value, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountIn(List<Integer> values) {
            addCriterion("mobile_vip_count in", values, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountNotIn(List<Integer> values) {
            addCriterion("mobile_vip_count not in", values, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountBetween(Integer value1, Integer value2) {
            addCriterion("mobile_vip_count between", value1, value2, "mobileVipCount");
            return (Criteria) this;
        }

        public Criteria andMobileVipCountNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile_vip_count not between", value1, value2, "mobileVipCount");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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