package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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

        public Criteria andSelectFlagIsNull() {
            addCriterion("select_flag is null");
            return (Criteria) this;
        }

        public Criteria andSelectFlagIsNotNull() {
            addCriterion("select_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSelectFlagEqualTo(Integer value) {
            addCriterion("select_flag =", value, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagNotEqualTo(Integer value) {
            addCriterion("select_flag <>", value, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagGreaterThan(Integer value) {
            addCriterion("select_flag >", value, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("select_flag >=", value, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagLessThan(Integer value) {
            addCriterion("select_flag <", value, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagLessThanOrEqualTo(Integer value) {
            addCriterion("select_flag <=", value, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagIn(List<Integer> values) {
            addCriterion("select_flag in", values, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagNotIn(List<Integer> values) {
            addCriterion("select_flag not in", values, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagBetween(Integer value1, Integer value2) {
            addCriterion("select_flag between", value1, value2, "selectFlag");
            return (Criteria) this;
        }

        public Criteria andSelectFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("select_flag not between", value1, value2, "selectFlag");
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andS1IsNull() {
            addCriterion("s1 is null");
            return (Criteria) this;
        }

        public Criteria andS1IsNotNull() {
            addCriterion("s1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1EqualTo(String value) {
            addCriterion("s1 =", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotEqualTo(String value) {
            addCriterion("s1 <>", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThan(String value) {
            addCriterion("s1 >", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThanOrEqualTo(String value) {
            addCriterion("s1 >=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThan(String value) {
            addCriterion("s1 <", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThanOrEqualTo(String value) {
            addCriterion("s1 <=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Like(String value) {
            addCriterion("s1 like", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotLike(String value) {
            addCriterion("s1 not like", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1In(List<String> values) {
            addCriterion("s1 in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotIn(List<String> values) {
            addCriterion("s1 not in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Between(String value1, String value2) {
            addCriterion("s1 between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotBetween(String value1, String value2) {
            addCriterion("s1 not between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS2IsNull() {
            addCriterion("s2 is null");
            return (Criteria) this;
        }

        public Criteria andS2IsNotNull() {
            addCriterion("s2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2EqualTo(String value) {
            addCriterion("s2 =", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotEqualTo(String value) {
            addCriterion("s2 <>", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThan(String value) {
            addCriterion("s2 >", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThanOrEqualTo(String value) {
            addCriterion("s2 >=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThan(String value) {
            addCriterion("s2 <", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThanOrEqualTo(String value) {
            addCriterion("s2 <=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Like(String value) {
            addCriterion("s2 like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotLike(String value) {
            addCriterion("s2 not like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2In(List<String> values) {
            addCriterion("s2 in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotIn(List<String> values) {
            addCriterion("s2 not in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Between(String value1, String value2) {
            addCriterion("s2 between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotBetween(String value1, String value2) {
            addCriterion("s2 not between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS3IsNull() {
            addCriterion("s3 is null");
            return (Criteria) this;
        }

        public Criteria andS3IsNotNull() {
            addCriterion("s3 is not null");
            return (Criteria) this;
        }

        public Criteria andS3EqualTo(String value) {
            addCriterion("s3 =", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotEqualTo(String value) {
            addCriterion("s3 <>", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThan(String value) {
            addCriterion("s3 >", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThanOrEqualTo(String value) {
            addCriterion("s3 >=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThan(String value) {
            addCriterion("s3 <", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThanOrEqualTo(String value) {
            addCriterion("s3 <=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Like(String value) {
            addCriterion("s3 like", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotLike(String value) {
            addCriterion("s3 not like", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3In(List<String> values) {
            addCriterion("s3 in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotIn(List<String> values) {
            addCriterion("s3 not in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Between(String value1, String value2) {
            addCriterion("s3 between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotBetween(String value1, String value2) {
            addCriterion("s3 not between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS4IsNull() {
            addCriterion("s4 is null");
            return (Criteria) this;
        }

        public Criteria andS4IsNotNull() {
            addCriterion("s4 is not null");
            return (Criteria) this;
        }

        public Criteria andS4EqualTo(String value) {
            addCriterion("s4 =", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotEqualTo(String value) {
            addCriterion("s4 <>", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThan(String value) {
            addCriterion("s4 >", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThanOrEqualTo(String value) {
            addCriterion("s4 >=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThan(String value) {
            addCriterion("s4 <", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThanOrEqualTo(String value) {
            addCriterion("s4 <=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Like(String value) {
            addCriterion("s4 like", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotLike(String value) {
            addCriterion("s4 not like", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4In(List<String> values) {
            addCriterion("s4 in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotIn(List<String> values) {
            addCriterion("s4 not in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Between(String value1, String value2) {
            addCriterion("s4 between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotBetween(String value1, String value2) {
            addCriterion("s4 not between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS5IsNull() {
            addCriterion("s5 is null");
            return (Criteria) this;
        }

        public Criteria andS5IsNotNull() {
            addCriterion("s5 is not null");
            return (Criteria) this;
        }

        public Criteria andS5EqualTo(String value) {
            addCriterion("s5 =", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotEqualTo(String value) {
            addCriterion("s5 <>", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThan(String value) {
            addCriterion("s5 >", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThanOrEqualTo(String value) {
            addCriterion("s5 >=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThan(String value) {
            addCriterion("s5 <", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThanOrEqualTo(String value) {
            addCriterion("s5 <=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5Like(String value) {
            addCriterion("s5 like", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotLike(String value) {
            addCriterion("s5 not like", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5In(List<String> values) {
            addCriterion("s5 in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotIn(List<String> values) {
            addCriterion("s5 not in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5Between(String value1, String value2) {
            addCriterion("s5 between", value1, value2, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotBetween(String value1, String value2) {
            addCriterion("s5 not between", value1, value2, "s5");
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

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("activity_id like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("activity_id not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
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