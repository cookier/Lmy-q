package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderGoodsItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodsItemExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Double value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Double value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Double value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Double value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Double value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Double> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Double> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Double value1, Double value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Double value1, Double value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
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

        public Criteria andSkuCodeIsNull() {
            addCriterion("sku_code is null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNotNull() {
            addCriterion("sku_code is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeEqualTo(String value) {
            addCriterion("sku_code =", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotEqualTo(String value) {
            addCriterion("sku_code <>", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThan(String value) {
            addCriterion("sku_code >", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_code >=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThan(String value) {
            addCriterion("sku_code <", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThanOrEqualTo(String value) {
            addCriterion("sku_code <=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLike(String value) {
            addCriterion("sku_code like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotLike(String value) {
            addCriterion("sku_code not like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIn(List<String> values) {
            addCriterion("sku_code in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotIn(List<String> values) {
            addCriterion("sku_code not in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeBetween(String value1, String value2) {
            addCriterion("sku_code between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotBetween(String value1, String value2) {
            addCriterion("sku_code not between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdIsNull() {
            addCriterion("deliver_template_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdIsNotNull() {
            addCriterion("deliver_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdEqualTo(Integer value) {
            addCriterion("deliver_template_id =", value, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdNotEqualTo(Integer value) {
            addCriterion("deliver_template_id <>", value, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdGreaterThan(Integer value) {
            addCriterion("deliver_template_id >", value, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_template_id >=", value, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdLessThan(Integer value) {
            addCriterion("deliver_template_id <", value, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_template_id <=", value, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdIn(List<Integer> values) {
            addCriterion("deliver_template_id in", values, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdNotIn(List<Integer> values) {
            addCriterion("deliver_template_id not in", values, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("deliver_template_id between", value1, value2, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliverTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_template_id not between", value1, value2, "deliverTemplateId");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIsNull() {
            addCriterion("goods_url is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIsNotNull() {
            addCriterion("goods_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlEqualTo(String value) {
            addCriterion("goods_url =", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotEqualTo(String value) {
            addCriterion("goods_url <>", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlGreaterThan(String value) {
            addCriterion("goods_url >", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_url >=", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLessThan(String value) {
            addCriterion("goods_url <", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLessThanOrEqualTo(String value) {
            addCriterion("goods_url <=", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLike(String value) {
            addCriterion("goods_url like", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotLike(String value) {
            addCriterion("goods_url not like", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIn(List<String> values) {
            addCriterion("goods_url in", values, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotIn(List<String> values) {
            addCriterion("goods_url not in", values, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlBetween(String value1, String value2) {
            addCriterion("goods_url between", value1, value2, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotBetween(String value1, String value2) {
            addCriterion("goods_url not between", value1, value2, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNull() {
            addCriterion("goods_title is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNotNull() {
            addCriterion("goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleEqualTo(String value) {
            addCriterion("goods_title =", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotEqualTo(String value) {
            addCriterion("goods_title <>", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThan(String value) {
            addCriterion("goods_title >", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_title >=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThan(String value) {
            addCriterion("goods_title <", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("goods_title <=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLike(String value) {
            addCriterion("goods_title like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotLike(String value) {
            addCriterion("goods_title not like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIn(List<String> values) {
            addCriterion("goods_title in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotIn(List<String> values) {
            addCriterion("goods_title not in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleBetween(String value1, String value2) {
            addCriterion("goods_title between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("goods_title not between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(Integer value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(Integer value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(Integer value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(Integer value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(Integer value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<Integer> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<Integer> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(Integer value1, Integer value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("success_time is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("success_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Date value) {
            addCriterion("success_time =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Date value) {
            addCriterion("success_time <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Date value) {
            addCriterion("success_time >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("success_time >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Date value) {
            addCriterion("success_time <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("success_time <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Date> values) {
            addCriterion("success_time in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Date> values) {
            addCriterion("success_time not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("success_time between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("success_time not between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyIsNull() {
            addCriterion("need_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyIsNotNull() {
            addCriterion("need_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyEqualTo(Double value) {
            addCriterion("need_pay_money =", value, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyNotEqualTo(Double value) {
            addCriterion("need_pay_money <>", value, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyGreaterThan(Double value) {
            addCriterion("need_pay_money >", value, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("need_pay_money >=", value, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyLessThan(Double value) {
            addCriterion("need_pay_money <", value, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("need_pay_money <=", value, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyIn(List<Double> values) {
            addCriterion("need_pay_money in", values, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyNotIn(List<Double> values) {
            addCriterion("need_pay_money not in", values, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyBetween(Double value1, Double value2) {
            addCriterion("need_pay_money between", value1, value2, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andNeedPayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("need_pay_money not between", value1, value2, "needPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyIsNull() {
            addCriterion("real_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyIsNotNull() {
            addCriterion("real_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyEqualTo(Double value) {
            addCriterion("real_pay_money =", value, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyNotEqualTo(Double value) {
            addCriterion("real_pay_money <>", value, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyGreaterThan(Double value) {
            addCriterion("real_pay_money >", value, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("real_pay_money >=", value, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyLessThan(Double value) {
            addCriterion("real_pay_money <", value, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("real_pay_money <=", value, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyIn(List<Double> values) {
            addCriterion("real_pay_money in", values, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyNotIn(List<Double> values) {
            addCriterion("real_pay_money not in", values, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyBetween(Double value1, Double value2) {
            addCriterion("real_pay_money between", value1, value2, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRealPayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("real_pay_money not between", value1, value2, "realPayMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNull() {
            addCriterion("refund_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(Double value) {
            addCriterion("refund_money =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(Double value) {
            addCriterion("refund_money <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(Double value) {
            addCriterion("refund_money >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("refund_money >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(Double value) {
            addCriterion("refund_money <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(Double value) {
            addCriterion("refund_money <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<Double> values) {
            addCriterion("refund_money in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<Double> values) {
            addCriterion("refund_money not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(Double value1, Double value2) {
            addCriterion("refund_money between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(Double value1, Double value2) {
            addCriterion("refund_money not between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andFreePostageIsNull() {
            addCriterion("free_postage is null");
            return (Criteria) this;
        }

        public Criteria andFreePostageIsNotNull() {
            addCriterion("free_postage is not null");
            return (Criteria) this;
        }

        public Criteria andFreePostageEqualTo(Integer value) {
            addCriterion("free_postage =", value, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageNotEqualTo(Integer value) {
            addCriterion("free_postage <>", value, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageGreaterThan(Integer value) {
            addCriterion("free_postage >", value, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_postage >=", value, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageLessThan(Integer value) {
            addCriterion("free_postage <", value, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageLessThanOrEqualTo(Integer value) {
            addCriterion("free_postage <=", value, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageIn(List<Integer> values) {
            addCriterion("free_postage in", values, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageNotIn(List<Integer> values) {
            addCriterion("free_postage not in", values, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageBetween(Integer value1, Integer value2) {
            addCriterion("free_postage between", value1, value2, "freePostage");
            return (Criteria) this;
        }

        public Criteria andFreePostageNotBetween(Integer value1, Integer value2) {
            addCriterion("free_postage not between", value1, value2, "freePostage");
            return (Criteria) this;
        }

        public Criteria andPostageIsNull() {
            addCriterion("postage is null");
            return (Criteria) this;
        }

        public Criteria andPostageIsNotNull() {
            addCriterion("postage is not null");
            return (Criteria) this;
        }

        public Criteria andPostageEqualTo(Double value) {
            addCriterion("postage =", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotEqualTo(Double value) {
            addCriterion("postage <>", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageGreaterThan(Double value) {
            addCriterion("postage >", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageGreaterThanOrEqualTo(Double value) {
            addCriterion("postage >=", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageLessThan(Double value) {
            addCriterion("postage <", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageLessThanOrEqualTo(Double value) {
            addCriterion("postage <=", value, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageIn(List<Double> values) {
            addCriterion("postage in", values, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotIn(List<Double> values) {
            addCriterion("postage not in", values, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageBetween(Double value1, Double value2) {
            addCriterion("postage between", value1, value2, "postage");
            return (Criteria) this;
        }

        public Criteria andPostageNotBetween(Double value1, Double value2) {
            addCriterion("postage not between", value1, value2, "postage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageIsNull() {
            addCriterion("adjust_postage is null");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageIsNotNull() {
            addCriterion("adjust_postage is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageEqualTo(Double value) {
            addCriterion("adjust_postage =", value, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageNotEqualTo(Double value) {
            addCriterion("adjust_postage <>", value, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageGreaterThan(Double value) {
            addCriterion("adjust_postage >", value, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageGreaterThanOrEqualTo(Double value) {
            addCriterion("adjust_postage >=", value, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageLessThan(Double value) {
            addCriterion("adjust_postage <", value, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageLessThanOrEqualTo(Double value) {
            addCriterion("adjust_postage <=", value, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageIn(List<Double> values) {
            addCriterion("adjust_postage in", values, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageNotIn(List<Double> values) {
            addCriterion("adjust_postage not in", values, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageBetween(Double value1, Double value2) {
            addCriterion("adjust_postage between", value1, value2, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andAdjustPostageNotBetween(Double value1, Double value2) {
            addCriterion("adjust_postage not between", value1, value2, "adjustPostage");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNull() {
            addCriterion("express_no is null");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNotNull() {
            addCriterion("express_no is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNoEqualTo(String value) {
            addCriterion("express_no =", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotEqualTo(String value) {
            addCriterion("express_no <>", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThan(String value) {
            addCriterion("express_no >", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("express_no >=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThan(String value) {
            addCriterion("express_no <", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThanOrEqualTo(String value) {
            addCriterion("express_no <=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLike(String value) {
            addCriterion("express_no like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotLike(String value) {
            addCriterion("express_no not like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoIn(List<String> values) {
            addCriterion("express_no in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotIn(List<String> values) {
            addCriterion("express_no not in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoBetween(String value1, String value2) {
            addCriterion("express_no between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotBetween(String value1, String value2) {
            addCriterion("express_no not between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNull() {
            addCriterion("express_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNotNull() {
            addCriterion("express_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpressIdEqualTo(Integer value) {
            addCriterion("express_id =", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotEqualTo(Integer value) {
            addCriterion("express_id <>", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThan(Integer value) {
            addCriterion("express_id >", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_id >=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThan(Integer value) {
            addCriterion("express_id <", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThanOrEqualTo(Integer value) {
            addCriterion("express_id <=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIn(List<Integer> values) {
            addCriterion("express_id in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotIn(List<Integer> values) {
            addCriterion("express_id not in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdBetween(Integer value1, Integer value2) {
            addCriterion("express_id between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("express_id not between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdIsNull() {
            addCriterion("customer_order_item_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdIsNotNull() {
            addCriterion("customer_order_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdEqualTo(Integer value) {
            addCriterion("customer_order_item_id =", value, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdNotEqualTo(Integer value) {
            addCriterion("customer_order_item_id <>", value, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdGreaterThan(Integer value) {
            addCriterion("customer_order_item_id >", value, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_order_item_id >=", value, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdLessThan(Integer value) {
            addCriterion("customer_order_item_id <", value, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_order_item_id <=", value, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdIn(List<Integer> values) {
            addCriterion("customer_order_item_id in", values, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdNotIn(List<Integer> values) {
            addCriterion("customer_order_item_id not in", values, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_item_id between", value1, value2, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_item_id not between", value1, value2, "customerOrderItemId");
            return (Criteria) this;
        }

        public Criteria andFxPriceIsNull() {
            addCriterion("fx_price is null");
            return (Criteria) this;
        }

        public Criteria andFxPriceIsNotNull() {
            addCriterion("fx_price is not null");
            return (Criteria) this;
        }

        public Criteria andFxPriceEqualTo(Double value) {
            addCriterion("fx_price =", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceNotEqualTo(Double value) {
            addCriterion("fx_price <>", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceGreaterThan(Double value) {
            addCriterion("fx_price >", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("fx_price >=", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceLessThan(Double value) {
            addCriterion("fx_price <", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceLessThanOrEqualTo(Double value) {
            addCriterion("fx_price <=", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceIn(List<Double> values) {
            addCriterion("fx_price in", values, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceNotIn(List<Double> values) {
            addCriterion("fx_price not in", values, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceBetween(Double value1, Double value2) {
            addCriterion("fx_price between", value1, value2, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceNotBetween(Double value1, Double value2) {
            addCriterion("fx_price not between", value1, value2, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNull() {
            addCriterion("supply_price is null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNotNull() {
            addCriterion("supply_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceEqualTo(Double value) {
            addCriterion("supply_price =", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotEqualTo(Double value) {
            addCriterion("supply_price <>", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThan(Double value) {
            addCriterion("supply_price >", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("supply_price >=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThan(Double value) {
            addCriterion("supply_price <", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThanOrEqualTo(Double value) {
            addCriterion("supply_price <=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIn(List<Double> values) {
            addCriterion("supply_price in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotIn(List<Double> values) {
            addCriterion("supply_price not in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceBetween(Double value1, Double value2) {
            addCriterion("supply_price between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotBetween(Double value1, Double value2) {
            addCriterion("supply_price not between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIsNull() {
            addCriterion("commission_money is null");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIsNotNull() {
            addCriterion("commission_money is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyEqualTo(Double value) {
            addCriterion("commission_money =", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotEqualTo(Double value) {
            addCriterion("commission_money <>", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyGreaterThan(Double value) {
            addCriterion("commission_money >", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("commission_money >=", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyLessThan(Double value) {
            addCriterion("commission_money <", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyLessThanOrEqualTo(Double value) {
            addCriterion("commission_money <=", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIn(List<Double> values) {
            addCriterion("commission_money in", values, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotIn(List<Double> values) {
            addCriterion("commission_money not in", values, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyBetween(Double value1, Double value2) {
            addCriterion("commission_money between", value1, value2, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotBetween(Double value1, Double value2) {
            addCriterion("commission_money not between", value1, value2, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyIsNull() {
            addCriterion("member_discount_money is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyIsNotNull() {
            addCriterion("member_discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyEqualTo(Double value) {
            addCriterion("member_discount_money =", value, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyNotEqualTo(Double value) {
            addCriterion("member_discount_money <>", value, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyGreaterThan(Double value) {
            addCriterion("member_discount_money >", value, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("member_discount_money >=", value, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyLessThan(Double value) {
            addCriterion("member_discount_money <", value, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("member_discount_money <=", value, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyIn(List<Double> values) {
            addCriterion("member_discount_money in", values, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyNotIn(List<Double> values) {
            addCriterion("member_discount_money not in", values, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyBetween(Double value1, Double value2) {
            addCriterion("member_discount_money between", value1, value2, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("member_discount_money not between", value1, value2, "memberDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyIsNull() {
            addCriterion("adjust_money is null");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyIsNotNull() {
            addCriterion("adjust_money is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyEqualTo(Double value) {
            addCriterion("adjust_money =", value, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyNotEqualTo(Double value) {
            addCriterion("adjust_money <>", value, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyGreaterThan(Double value) {
            addCriterion("adjust_money >", value, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("adjust_money >=", value, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyLessThan(Double value) {
            addCriterion("adjust_money <", value, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyLessThanOrEqualTo(Double value) {
            addCriterion("adjust_money <=", value, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyIn(List<Double> values) {
            addCriterion("adjust_money in", values, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyNotIn(List<Double> values) {
            addCriterion("adjust_money not in", values, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyBetween(Double value1, Double value2) {
            addCriterion("adjust_money between", value1, value2, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andAdjustMoneyNotBetween(Double value1, Double value2) {
            addCriterion("adjust_money not between", value1, value2, "adjustMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNull() {
            addCriterion("discount_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNotNull() {
            addCriterion("discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyEqualTo(Double value) {
            addCriterion("discount_money =", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotEqualTo(Double value) {
            addCriterion("discount_money <>", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThan(Double value) {
            addCriterion("discount_money >", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_money >=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThan(Double value) {
            addCriterion("discount_money <", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("discount_money <=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIn(List<Double> values) {
            addCriterion("discount_money in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotIn(List<Double> values) {
            addCriterion("discount_money not in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyBetween(Double value1, Double value2) {
            addCriterion("discount_money between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("discount_money not between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Short value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Short value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Short value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Short value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Short value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Short> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Short> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Short value1, Short value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Short value1, Short value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
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