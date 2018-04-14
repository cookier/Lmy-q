package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponCodeExample() {
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

        public Criteria andOrderLimitFlagIsNull() {
            addCriterion("order_limit_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagIsNotNull() {
            addCriterion("order_limit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagEqualTo(Integer value) {
            addCriterion("order_limit_flag =", value, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagNotEqualTo(Integer value) {
            addCriterion("order_limit_flag <>", value, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagGreaterThan(Integer value) {
            addCriterion("order_limit_flag >", value, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_limit_flag >=", value, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagLessThan(Integer value) {
            addCriterion("order_limit_flag <", value, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagLessThanOrEqualTo(Integer value) {
            addCriterion("order_limit_flag <=", value, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagIn(List<Integer> values) {
            addCriterion("order_limit_flag in", values, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagNotIn(List<Integer> values) {
            addCriterion("order_limit_flag not in", values, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagBetween(Integer value1, Integer value2) {
            addCriterion("order_limit_flag between", value1, value2, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLimitFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("order_limit_flag not between", value1, value2, "orderLimitFlag");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitIsNull() {
            addCriterion("order_money_limit is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitIsNotNull() {
            addCriterion("order_money_limit is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitEqualTo(Double value) {
            addCriterion("order_money_limit =", value, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitNotEqualTo(Double value) {
            addCriterion("order_money_limit <>", value, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitGreaterThan(Double value) {
            addCriterion("order_money_limit >", value, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("order_money_limit >=", value, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitLessThan(Double value) {
            addCriterion("order_money_limit <", value, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitLessThanOrEqualTo(Double value) {
            addCriterion("order_money_limit <=", value, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitIn(List<Double> values) {
            addCriterion("order_money_limit in", values, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitNotIn(List<Double> values) {
            addCriterion("order_money_limit not in", values, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitBetween(Double value1, Double value2) {
            addCriterion("order_money_limit between", value1, value2, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLimitNotBetween(Double value1, Double value2) {
            addCriterion("order_money_limit not between", value1, value2, "orderMoneyLimit");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameIsNull() {
            addCriterion("background_name is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameIsNotNull() {
            addCriterion("background_name is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameEqualTo(String value) {
            addCriterion("background_name =", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameNotEqualTo(String value) {
            addCriterion("background_name <>", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameGreaterThan(String value) {
            addCriterion("background_name >", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameGreaterThanOrEqualTo(String value) {
            addCriterion("background_name >=", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameLessThan(String value) {
            addCriterion("background_name <", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameLessThanOrEqualTo(String value) {
            addCriterion("background_name <=", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameLike(String value) {
            addCriterion("background_name like", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameNotLike(String value) {
            addCriterion("background_name not like", value, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameIn(List<String> values) {
            addCriterion("background_name in", values, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameNotIn(List<String> values) {
            addCriterion("background_name not in", values, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameBetween(String value1, String value2) {
            addCriterion("background_name between", value1, value2, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundNameNotBetween(String value1, String value2) {
            addCriterion("background_name not between", value1, value2, "backgroundName");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueIsNull() {
            addCriterion("background_value is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueIsNotNull() {
            addCriterion("background_value is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueEqualTo(String value) {
            addCriterion("background_value =", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueNotEqualTo(String value) {
            addCriterion("background_value <>", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueGreaterThan(String value) {
            addCriterion("background_value >", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueGreaterThanOrEqualTo(String value) {
            addCriterion("background_value >=", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueLessThan(String value) {
            addCriterion("background_value <", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueLessThanOrEqualTo(String value) {
            addCriterion("background_value <=", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueLike(String value) {
            addCriterion("background_value like", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueNotLike(String value) {
            addCriterion("background_value not like", value, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueIn(List<String> values) {
            addCriterion("background_value in", values, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueNotIn(List<String> values) {
            addCriterion("background_value not in", values, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueBetween(String value1, String value2) {
            addCriterion("background_value between", value1, value2, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andBackgroundValueNotBetween(String value1, String value2) {
            addCriterion("background_value not between", value1, value2, "backgroundValue");
            return (Criteria) this;
        }

        public Criteria andCanAttornIsNull() {
            addCriterion("can_attorn is null");
            return (Criteria) this;
        }

        public Criteria andCanAttornIsNotNull() {
            addCriterion("can_attorn is not null");
            return (Criteria) this;
        }

        public Criteria andCanAttornEqualTo(Integer value) {
            addCriterion("can_attorn =", value, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornNotEqualTo(Integer value) {
            addCriterion("can_attorn <>", value, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornGreaterThan(Integer value) {
            addCriterion("can_attorn >", value, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornGreaterThanOrEqualTo(Integer value) {
            addCriterion("can_attorn >=", value, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornLessThan(Integer value) {
            addCriterion("can_attorn <", value, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornLessThanOrEqualTo(Integer value) {
            addCriterion("can_attorn <=", value, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornIn(List<Integer> values) {
            addCriterion("can_attorn in", values, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornNotIn(List<Integer> values) {
            addCriterion("can_attorn not in", values, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornBetween(Integer value1, Integer value2) {
            addCriterion("can_attorn between", value1, value2, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCanAttornNotBetween(Integer value1, Integer value2) {
            addCriterion("can_attorn not between", value1, value2, "canAttorn");
            return (Criteria) this;
        }

        public Criteria andCodeNoIsNull() {
            addCriterion("code_no is null");
            return (Criteria) this;
        }

        public Criteria andCodeNoIsNotNull() {
            addCriterion("code_no is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNoEqualTo(String value) {
            addCriterion("code_no =", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotEqualTo(String value) {
            addCriterion("code_no <>", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoGreaterThan(String value) {
            addCriterion("code_no >", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoGreaterThanOrEqualTo(String value) {
            addCriterion("code_no >=", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLessThan(String value) {
            addCriterion("code_no <", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLessThanOrEqualTo(String value) {
            addCriterion("code_no <=", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLike(String value) {
            addCriterion("code_no like", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotLike(String value) {
            addCriterion("code_no not like", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoIn(List<String> values) {
            addCriterion("code_no in", values, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotIn(List<String> values) {
            addCriterion("code_no not in", values, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoBetween(String value1, String value2) {
            addCriterion("code_no between", value1, value2, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotBetween(String value1, String value2) {
            addCriterion("code_no not between", value1, value2, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNull() {
            addCriterion("code_type is null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNotNull() {
            addCriterion("code_type is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeEqualTo(Integer value) {
            addCriterion("code_type =", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotEqualTo(Integer value) {
            addCriterion("code_type <>", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThan(Integer value) {
            addCriterion("code_type >", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_type >=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThan(Integer value) {
            addCriterion("code_type <", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("code_type <=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIn(List<Integer> values) {
            addCriterion("code_type in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotIn(List<Integer> values) {
            addCriterion("code_type not in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeBetween(Integer value1, Integer value2) {
            addCriterion("code_type between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("code_type not between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andUseConditionIsNull() {
            addCriterion("use_condition is null");
            return (Criteria) this;
        }

        public Criteria andUseConditionIsNotNull() {
            addCriterion("use_condition is not null");
            return (Criteria) this;
        }

        public Criteria andUseConditionEqualTo(String value) {
            addCriterion("use_condition =", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionNotEqualTo(String value) {
            addCriterion("use_condition <>", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionGreaterThan(String value) {
            addCriterion("use_condition >", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionGreaterThanOrEqualTo(String value) {
            addCriterion("use_condition >=", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionLessThan(String value) {
            addCriterion("use_condition <", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionLessThanOrEqualTo(String value) {
            addCriterion("use_condition <=", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionLike(String value) {
            addCriterion("use_condition like", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionNotLike(String value) {
            addCriterion("use_condition not like", value, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionIn(List<String> values) {
            addCriterion("use_condition in", values, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionNotIn(List<String> values) {
            addCriterion("use_condition not in", values, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionBetween(String value1, String value2) {
            addCriterion("use_condition between", value1, value2, "useCondition");
            return (Criteria) this;
        }

        public Criteria andUseConditionNotBetween(String value1, String value2) {
            addCriterion("use_condition not between", value1, value2, "useCondition");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andUseInstructionsIsNull() {
            addCriterion("use_instructions is null");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsIsNotNull() {
            addCriterion("use_instructions is not null");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsEqualTo(String value) {
            addCriterion("use_instructions =", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsNotEqualTo(String value) {
            addCriterion("use_instructions <>", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsGreaterThan(String value) {
            addCriterion("use_instructions >", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("use_instructions >=", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsLessThan(String value) {
            addCriterion("use_instructions <", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsLessThanOrEqualTo(String value) {
            addCriterion("use_instructions <=", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsLike(String value) {
            addCriterion("use_instructions like", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsNotLike(String value) {
            addCriterion("use_instructions not like", value, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsIn(List<String> values) {
            addCriterion("use_instructions in", values, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsNotIn(List<String> values) {
            addCriterion("use_instructions not in", values, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsBetween(String value1, String value2) {
            addCriterion("use_instructions between", value1, value2, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andUseInstructionsNotBetween(String value1, String value2) {
            addCriterion("use_instructions not between", value1, value2, "useInstructions");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("valid_time is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(Date value) {
            addCriterion("valid_time =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(Date value) {
            addCriterion("valid_time <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(Date value) {
            addCriterion("valid_time >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_time >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(Date value) {
            addCriterion("valid_time <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(Date value) {
            addCriterion("valid_time <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<Date> values) {
            addCriterion("valid_time in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<Date> values) {
            addCriterion("valid_time not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(Date value1, Date value2) {
            addCriterion("valid_time between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(Date value1, Date value2) {
            addCriterion("valid_time not between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireFlagIsNull() {
            addCriterion("expire_flag is null");
            return (Criteria) this;
        }

        public Criteria andExpireFlagIsNotNull() {
            addCriterion("expire_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExpireFlagEqualTo(Integer value) {
            addCriterion("expire_flag =", value, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagNotEqualTo(Integer value) {
            addCriterion("expire_flag <>", value, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagGreaterThan(Integer value) {
            addCriterion("expire_flag >", value, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("expire_flag >=", value, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagLessThan(Integer value) {
            addCriterion("expire_flag <", value, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagLessThanOrEqualTo(Integer value) {
            addCriterion("expire_flag <=", value, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagIn(List<Integer> values) {
            addCriterion("expire_flag in", values, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagNotIn(List<Integer> values) {
            addCriterion("expire_flag not in", values, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagBetween(Integer value1, Integer value2) {
            addCriterion("expire_flag between", value1, value2, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExpireFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("expire_flag not between", value1, value2, "expireFlag");
            return (Criteria) this;
        }

        public Criteria andExtendSettingIsNull() {
            addCriterion("extend_setting is null");
            return (Criteria) this;
        }

        public Criteria andExtendSettingIsNotNull() {
            addCriterion("extend_setting is not null");
            return (Criteria) this;
        }

        public Criteria andExtendSettingEqualTo(Integer value) {
            addCriterion("extend_setting =", value, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingNotEqualTo(Integer value) {
            addCriterion("extend_setting <>", value, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingGreaterThan(Integer value) {
            addCriterion("extend_setting >", value, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingGreaterThanOrEqualTo(Integer value) {
            addCriterion("extend_setting >=", value, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingLessThan(Integer value) {
            addCriterion("extend_setting <", value, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingLessThanOrEqualTo(Integer value) {
            addCriterion("extend_setting <=", value, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingIn(List<Integer> values) {
            addCriterion("extend_setting in", values, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingNotIn(List<Integer> values) {
            addCriterion("extend_setting not in", values, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingBetween(Integer value1, Integer value2) {
            addCriterion("extend_setting between", value1, value2, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andExtendSettingNotBetween(Integer value1, Integer value2) {
            addCriterion("extend_setting not between", value1, value2, "extendSetting");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagIsNull() {
            addCriterion("sync_wechat_flag is null");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagIsNotNull() {
            addCriterion("sync_wechat_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagEqualTo(Integer value) {
            addCriterion("sync_wechat_flag =", value, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagNotEqualTo(Integer value) {
            addCriterion("sync_wechat_flag <>", value, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagGreaterThan(Integer value) {
            addCriterion("sync_wechat_flag >", value, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("sync_wechat_flag >=", value, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagLessThan(Integer value) {
            addCriterion("sync_wechat_flag <", value, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagLessThanOrEqualTo(Integer value) {
            addCriterion("sync_wechat_flag <=", value, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagIn(List<Integer> values) {
            addCriterion("sync_wechat_flag in", values, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagNotIn(List<Integer> values) {
            addCriterion("sync_wechat_flag not in", values, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagBetween(Integer value1, Integer value2) {
            addCriterion("sync_wechat_flag between", value1, value2, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andSyncWechatFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("sync_wechat_flag not between", value1, value2, "syncWechatFlag");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountIsNull() {
            addCriterion("each_one_limit_count is null");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountIsNotNull() {
            addCriterion("each_one_limit_count is not null");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountEqualTo(Integer value) {
            addCriterion("each_one_limit_count =", value, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountNotEqualTo(Integer value) {
            addCriterion("each_one_limit_count <>", value, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountGreaterThan(Integer value) {
            addCriterion("each_one_limit_count >", value, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("each_one_limit_count >=", value, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountLessThan(Integer value) {
            addCriterion("each_one_limit_count <", value, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountLessThanOrEqualTo(Integer value) {
            addCriterion("each_one_limit_count <=", value, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountIn(List<Integer> values) {
            addCriterion("each_one_limit_count in", values, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountNotIn(List<Integer> values) {
            addCriterion("each_one_limit_count not in", values, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountBetween(Integer value1, Integer value2) {
            addCriterion("each_one_limit_count between", value1, value2, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andEachOneLimitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("each_one_limit_count not between", value1, value2, "eachOneLimitCount");
            return (Criteria) this;
        }

        public Criteria andUseRangeIsNull() {
            addCriterion("use_range is null");
            return (Criteria) this;
        }

        public Criteria andUseRangeIsNotNull() {
            addCriterion("use_range is not null");
            return (Criteria) this;
        }

        public Criteria andUseRangeEqualTo(Integer value) {
            addCriterion("use_range =", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeNotEqualTo(Integer value) {
            addCriterion("use_range <>", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeGreaterThan(Integer value) {
            addCriterion("use_range >", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_range >=", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeLessThan(Integer value) {
            addCriterion("use_range <", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeLessThanOrEqualTo(Integer value) {
            addCriterion("use_range <=", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeIn(List<Integer> values) {
            addCriterion("use_range in", values, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeNotIn(List<Integer> values) {
            addCriterion("use_range not in", values, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeBetween(Integer value1, Integer value2) {
            addCriterion("use_range between", value1, value2, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("use_range not between", value1, value2, "useRange");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesIsNull() {
            addCriterion("used_by_fullrates is null");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesIsNotNull() {
            addCriterion("used_by_fullrates is not null");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesEqualTo(Integer value) {
            addCriterion("used_by_fullrates =", value, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesNotEqualTo(Integer value) {
            addCriterion("used_by_fullrates <>", value, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesGreaterThan(Integer value) {
            addCriterion("used_by_fullrates >", value, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_by_fullrates >=", value, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesLessThan(Integer value) {
            addCriterion("used_by_fullrates <", value, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesLessThanOrEqualTo(Integer value) {
            addCriterion("used_by_fullrates <=", value, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesIn(List<Integer> values) {
            addCriterion("used_by_fullrates in", values, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesNotIn(List<Integer> values) {
            addCriterion("used_by_fullrates not in", values, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesBetween(Integer value1, Integer value2) {
            addCriterion("used_by_fullrates between", value1, value2, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andUsedByFullratesNotBetween(Integer value1, Integer value2) {
            addCriterion("used_by_fullrates not between", value1, value2, "usedByFullrates");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("service_phone is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("service_phone =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("service_phone <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("service_phone >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("service_phone <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("service_phone <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("service_phone like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("service_phone not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("service_phone in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("service_phone not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("service_phone between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("service_phone not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityIsNull() {
            addCriterion("issue_quantity is null");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityIsNotNull() {
            addCriterion("issue_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityEqualTo(Integer value) {
            addCriterion("issue_quantity =", value, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityNotEqualTo(Integer value) {
            addCriterion("issue_quantity <>", value, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityGreaterThan(Integer value) {
            addCriterion("issue_quantity >", value, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_quantity >=", value, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityLessThan(Integer value) {
            addCriterion("issue_quantity <", value, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("issue_quantity <=", value, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityIn(List<Integer> values) {
            addCriterion("issue_quantity in", values, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityNotIn(List<Integer> values) {
            addCriterion("issue_quantity not in", values, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityBetween(Integer value1, Integer value2) {
            addCriterion("issue_quantity between", value1, value2, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andIssueQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("issue_quantity not between", value1, value2, "issueQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityIsNull() {
            addCriterion("can_receive_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityIsNotNull() {
            addCriterion("can_receive_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityEqualTo(Integer value) {
            addCriterion("can_receive_quantity =", value, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityNotEqualTo(Integer value) {
            addCriterion("can_receive_quantity <>", value, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityGreaterThan(Integer value) {
            addCriterion("can_receive_quantity >", value, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("can_receive_quantity >=", value, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityLessThan(Integer value) {
            addCriterion("can_receive_quantity <", value, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("can_receive_quantity <=", value, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityIn(List<Integer> values) {
            addCriterion("can_receive_quantity in", values, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityNotIn(List<Integer> values) {
            addCriterion("can_receive_quantity not in", values, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityBetween(Integer value1, Integer value2) {
            addCriterion("can_receive_quantity between", value1, value2, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCanReceiveQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("can_receive_quantity not between", value1, value2, "canReceiveQuantity");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountIsNull() {
            addCriterion("received_people_count is null");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountIsNotNull() {
            addCriterion("received_people_count is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountEqualTo(Integer value) {
            addCriterion("received_people_count =", value, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountNotEqualTo(Integer value) {
            addCriterion("received_people_count <>", value, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountGreaterThan(Integer value) {
            addCriterion("received_people_count >", value, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("received_people_count >=", value, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountLessThan(Integer value) {
            addCriterion("received_people_count <", value, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountLessThanOrEqualTo(Integer value) {
            addCriterion("received_people_count <=", value, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountIn(List<Integer> values) {
            addCriterion("received_people_count in", values, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountNotIn(List<Integer> values) {
            addCriterion("received_people_count not in", values, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountBetween(Integer value1, Integer value2) {
            addCriterion("received_people_count between", value1, value2, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andReceivedPeopleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("received_people_count not between", value1, value2, "receivedPeopleCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountIsNull() {
            addCriterion("used_count is null");
            return (Criteria) this;
        }

        public Criteria andUsedCountIsNotNull() {
            addCriterion("used_count is not null");
            return (Criteria) this;
        }

        public Criteria andUsedCountEqualTo(Integer value) {
            addCriterion("used_count =", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountNotEqualTo(Integer value) {
            addCriterion("used_count <>", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountGreaterThan(Integer value) {
            addCriterion("used_count >", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_count >=", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountLessThan(Integer value) {
            addCriterion("used_count <", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountLessThanOrEqualTo(Integer value) {
            addCriterion("used_count <=", value, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountIn(List<Integer> values) {
            addCriterion("used_count in", values, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountNotIn(List<Integer> values) {
            addCriterion("used_count not in", values, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountBetween(Integer value1, Integer value2) {
            addCriterion("used_count between", value1, value2, "usedCount");
            return (Criteria) this;
        }

        public Criteria andUsedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("used_count not between", value1, value2, "usedCount");
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

        public Criteria andCouponUrlIsNull() {
            addCriterion("coupon_url is null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIsNotNull() {
            addCriterion("coupon_url is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlEqualTo(String value) {
            addCriterion("coupon_url =", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotEqualTo(String value) {
            addCriterion("coupon_url <>", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThan(String value) {
            addCriterion("coupon_url >", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_url >=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThan(String value) {
            addCriterion("coupon_url <", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThanOrEqualTo(String value) {
            addCriterion("coupon_url <=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLike(String value) {
            addCriterion("coupon_url like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotLike(String value) {
            addCriterion("coupon_url not like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIn(List<String> values) {
            addCriterion("coupon_url in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotIn(List<String> values) {
            addCriterion("coupon_url not in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlBetween(String value1, String value2) {
            addCriterion("coupon_url between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotBetween(String value1, String value2) {
            addCriterion("coupon_url not between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitIsNull() {
            addCriterion("vip_level_limit is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitIsNotNull() {
            addCriterion("vip_level_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitEqualTo(Integer value) {
            addCriterion("vip_level_limit =", value, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitNotEqualTo(Integer value) {
            addCriterion("vip_level_limit <>", value, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitGreaterThan(Integer value) {
            addCriterion("vip_level_limit >", value, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_level_limit >=", value, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitLessThan(Integer value) {
            addCriterion("vip_level_limit <", value, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitLessThanOrEqualTo(Integer value) {
            addCriterion("vip_level_limit <=", value, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitIn(List<Integer> values) {
            addCriterion("vip_level_limit in", values, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitNotIn(List<Integer> values) {
            addCriterion("vip_level_limit not in", values, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitBetween(Integer value1, Integer value2) {
            addCriterion("vip_level_limit between", value1, value2, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_level_limit not between", value1, value2, "vipLevelLimit");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameIsNull() {
            addCriterion("vip_level_name is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameIsNotNull() {
            addCriterion("vip_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameEqualTo(String value) {
            addCriterion("vip_level_name =", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameNotEqualTo(String value) {
            addCriterion("vip_level_name <>", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameGreaterThan(String value) {
            addCriterion("vip_level_name >", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("vip_level_name >=", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameLessThan(String value) {
            addCriterion("vip_level_name <", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameLessThanOrEqualTo(String value) {
            addCriterion("vip_level_name <=", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameLike(String value) {
            addCriterion("vip_level_name like", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameNotLike(String value) {
            addCriterion("vip_level_name not like", value, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameIn(List<String> values) {
            addCriterion("vip_level_name in", values, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameNotIn(List<String> values) {
            addCriterion("vip_level_name not in", values, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameBetween(String value1, String value2) {
            addCriterion("vip_level_name between", value1, value2, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andVipLevelNameNotBetween(String value1, String value2) {
            addCriterion("vip_level_name not between", value1, value2, "vipLevelName");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentIsNull() {
            addCriterion("wechat_card_notice_content is null");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentIsNotNull() {
            addCriterion("wechat_card_notice_content is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentEqualTo(String value) {
            addCriterion("wechat_card_notice_content =", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentNotEqualTo(String value) {
            addCriterion("wechat_card_notice_content <>", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentGreaterThan(String value) {
            addCriterion("wechat_card_notice_content >", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_card_notice_content >=", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentLessThan(String value) {
            addCriterion("wechat_card_notice_content <", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentLessThanOrEqualTo(String value) {
            addCriterion("wechat_card_notice_content <=", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentLike(String value) {
            addCriterion("wechat_card_notice_content like", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentNotLike(String value) {
            addCriterion("wechat_card_notice_content not like", value, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentIn(List<String> values) {
            addCriterion("wechat_card_notice_content in", values, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentNotIn(List<String> values) {
            addCriterion("wechat_card_notice_content not in", values, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentBetween(String value1, String value2) {
            addCriterion("wechat_card_notice_content between", value1, value2, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardNoticeContentNotBetween(String value1, String value2) {
            addCriterion("wechat_card_notice_content not between", value1, value2, "wechatCardNoticeContent");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleIsNull() {
            addCriterion("wechat_card_title is null");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleIsNotNull() {
            addCriterion("wechat_card_title is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleEqualTo(String value) {
            addCriterion("wechat_card_title =", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleNotEqualTo(String value) {
            addCriterion("wechat_card_title <>", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleGreaterThan(String value) {
            addCriterion("wechat_card_title >", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_card_title >=", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleLessThan(String value) {
            addCriterion("wechat_card_title <", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleLessThanOrEqualTo(String value) {
            addCriterion("wechat_card_title <=", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleLike(String value) {
            addCriterion("wechat_card_title like", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleNotLike(String value) {
            addCriterion("wechat_card_title not like", value, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleIn(List<String> values) {
            addCriterion("wechat_card_title in", values, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleNotIn(List<String> values) {
            addCriterion("wechat_card_title not in", values, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleBetween(String value1, String value2) {
            addCriterion("wechat_card_title between", value1, value2, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardTitleNotBetween(String value1, String value2) {
            addCriterion("wechat_card_title not between", value1, value2, "wechatCardTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleIsNull() {
            addCriterion("wechat_card_sub_title is null");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleIsNotNull() {
            addCriterion("wechat_card_sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleEqualTo(String value) {
            addCriterion("wechat_card_sub_title =", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleNotEqualTo(String value) {
            addCriterion("wechat_card_sub_title <>", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleGreaterThan(String value) {
            addCriterion("wechat_card_sub_title >", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_card_sub_title >=", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleLessThan(String value) {
            addCriterion("wechat_card_sub_title <", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleLessThanOrEqualTo(String value) {
            addCriterion("wechat_card_sub_title <=", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleLike(String value) {
            addCriterion("wechat_card_sub_title like", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleNotLike(String value) {
            addCriterion("wechat_card_sub_title not like", value, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleIn(List<String> values) {
            addCriterion("wechat_card_sub_title in", values, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleNotIn(List<String> values) {
            addCriterion("wechat_card_sub_title not in", values, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleBetween(String value1, String value2) {
            addCriterion("wechat_card_sub_title between", value1, value2, "wechatCardSubTitle");
            return (Criteria) this;
        }

        public Criteria andWechatCardSubTitleNotBetween(String value1, String value2) {
            addCriterion("wechat_card_sub_title not between", value1, value2, "wechatCardSubTitle");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Short value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Short value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Short value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Short value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Short value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Short> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Short> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Short value1, Short value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Short value1, Short value2) {
            addCriterion("source not between", value1, value2, "source");
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