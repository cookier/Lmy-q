package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSpecExample() {
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

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andSkuName1IsNull() {
            addCriterion("sku_name1 is null");
            return (Criteria) this;
        }

        public Criteria andSkuName1IsNotNull() {
            addCriterion("sku_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuName1EqualTo(String value) {
            addCriterion("sku_name1 =", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1NotEqualTo(String value) {
            addCriterion("sku_name1 <>", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1GreaterThan(String value) {
            addCriterion("sku_name1 >", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1GreaterThanOrEqualTo(String value) {
            addCriterion("sku_name1 >=", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1LessThan(String value) {
            addCriterion("sku_name1 <", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1LessThanOrEqualTo(String value) {
            addCriterion("sku_name1 <=", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1Like(String value) {
            addCriterion("sku_name1 like", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1NotLike(String value) {
            addCriterion("sku_name1 not like", value, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1In(List<String> values) {
            addCriterion("sku_name1 in", values, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1NotIn(List<String> values) {
            addCriterion("sku_name1 not in", values, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1Between(String value1, String value2) {
            addCriterion("sku_name1 between", value1, value2, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuName1NotBetween(String value1, String value2) {
            addCriterion("sku_name1 not between", value1, value2, "skuName1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1IsNull() {
            addCriterion("sku_value1 is null");
            return (Criteria) this;
        }

        public Criteria andSkuValue1IsNotNull() {
            addCriterion("sku_value1 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuValue1EqualTo(String value) {
            addCriterion("sku_value1 =", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1NotEqualTo(String value) {
            addCriterion("sku_value1 <>", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1GreaterThan(String value) {
            addCriterion("sku_value1 >", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1GreaterThanOrEqualTo(String value) {
            addCriterion("sku_value1 >=", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1LessThan(String value) {
            addCriterion("sku_value1 <", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1LessThanOrEqualTo(String value) {
            addCriterion("sku_value1 <=", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1Like(String value) {
            addCriterion("sku_value1 like", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1NotLike(String value) {
            addCriterion("sku_value1 not like", value, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1In(List<String> values) {
            addCriterion("sku_value1 in", values, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1NotIn(List<String> values) {
            addCriterion("sku_value1 not in", values, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1Between(String value1, String value2) {
            addCriterion("sku_value1 between", value1, value2, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuValue1NotBetween(String value1, String value2) {
            addCriterion("sku_value1 not between", value1, value2, "skuValue1");
            return (Criteria) this;
        }

        public Criteria andSkuName2IsNull() {
            addCriterion("sku_name2 is null");
            return (Criteria) this;
        }

        public Criteria andSkuName2IsNotNull() {
            addCriterion("sku_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuName2EqualTo(String value) {
            addCriterion("sku_name2 =", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2NotEqualTo(String value) {
            addCriterion("sku_name2 <>", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2GreaterThan(String value) {
            addCriterion("sku_name2 >", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2GreaterThanOrEqualTo(String value) {
            addCriterion("sku_name2 >=", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2LessThan(String value) {
            addCriterion("sku_name2 <", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2LessThanOrEqualTo(String value) {
            addCriterion("sku_name2 <=", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2Like(String value) {
            addCriterion("sku_name2 like", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2NotLike(String value) {
            addCriterion("sku_name2 not like", value, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2In(List<String> values) {
            addCriterion("sku_name2 in", values, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2NotIn(List<String> values) {
            addCriterion("sku_name2 not in", values, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2Between(String value1, String value2) {
            addCriterion("sku_name2 between", value1, value2, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuName2NotBetween(String value1, String value2) {
            addCriterion("sku_name2 not between", value1, value2, "skuName2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2IsNull() {
            addCriterion("sku_value2 is null");
            return (Criteria) this;
        }

        public Criteria andSkuValue2IsNotNull() {
            addCriterion("sku_value2 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuValue2EqualTo(String value) {
            addCriterion("sku_value2 =", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2NotEqualTo(String value) {
            addCriterion("sku_value2 <>", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2GreaterThan(String value) {
            addCriterion("sku_value2 >", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2GreaterThanOrEqualTo(String value) {
            addCriterion("sku_value2 >=", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2LessThan(String value) {
            addCriterion("sku_value2 <", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2LessThanOrEqualTo(String value) {
            addCriterion("sku_value2 <=", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2Like(String value) {
            addCriterion("sku_value2 like", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2NotLike(String value) {
            addCriterion("sku_value2 not like", value, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2In(List<String> values) {
            addCriterion("sku_value2 in", values, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2NotIn(List<String> values) {
            addCriterion("sku_value2 not in", values, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2Between(String value1, String value2) {
            addCriterion("sku_value2 between", value1, value2, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuValue2NotBetween(String value1, String value2) {
            addCriterion("sku_value2 not between", value1, value2, "skuValue2");
            return (Criteria) this;
        }

        public Criteria andSkuName3IsNull() {
            addCriterion("sku_name3 is null");
            return (Criteria) this;
        }

        public Criteria andSkuName3IsNotNull() {
            addCriterion("sku_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuName3EqualTo(String value) {
            addCriterion("sku_name3 =", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3NotEqualTo(String value) {
            addCriterion("sku_name3 <>", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3GreaterThan(String value) {
            addCriterion("sku_name3 >", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3GreaterThanOrEqualTo(String value) {
            addCriterion("sku_name3 >=", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3LessThan(String value) {
            addCriterion("sku_name3 <", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3LessThanOrEqualTo(String value) {
            addCriterion("sku_name3 <=", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3Like(String value) {
            addCriterion("sku_name3 like", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3NotLike(String value) {
            addCriterion("sku_name3 not like", value, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3In(List<String> values) {
            addCriterion("sku_name3 in", values, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3NotIn(List<String> values) {
            addCriterion("sku_name3 not in", values, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3Between(String value1, String value2) {
            addCriterion("sku_name3 between", value1, value2, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuName3NotBetween(String value1, String value2) {
            addCriterion("sku_name3 not between", value1, value2, "skuName3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3IsNull() {
            addCriterion("sku_value3 is null");
            return (Criteria) this;
        }

        public Criteria andSkuValue3IsNotNull() {
            addCriterion("sku_value3 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuValue3EqualTo(String value) {
            addCriterion("sku_value3 =", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3NotEqualTo(String value) {
            addCriterion("sku_value3 <>", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3GreaterThan(String value) {
            addCriterion("sku_value3 >", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3GreaterThanOrEqualTo(String value) {
            addCriterion("sku_value3 >=", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3LessThan(String value) {
            addCriterion("sku_value3 <", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3LessThanOrEqualTo(String value) {
            addCriterion("sku_value3 <=", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3Like(String value) {
            addCriterion("sku_value3 like", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3NotLike(String value) {
            addCriterion("sku_value3 not like", value, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3In(List<String> values) {
            addCriterion("sku_value3 in", values, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3NotIn(List<String> values) {
            addCriterion("sku_value3 not in", values, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3Between(String value1, String value2) {
            addCriterion("sku_value3 between", value1, value2, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuValue3NotBetween(String value1, String value2) {
            addCriterion("sku_value3 not between", value1, value2, "skuValue3");
            return (Criteria) this;
        }

        public Criteria andSkuName4IsNull() {
            addCriterion("sku_name4 is null");
            return (Criteria) this;
        }

        public Criteria andSkuName4IsNotNull() {
            addCriterion("sku_name4 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuName4EqualTo(String value) {
            addCriterion("sku_name4 =", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4NotEqualTo(String value) {
            addCriterion("sku_name4 <>", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4GreaterThan(String value) {
            addCriterion("sku_name4 >", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4GreaterThanOrEqualTo(String value) {
            addCriterion("sku_name4 >=", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4LessThan(String value) {
            addCriterion("sku_name4 <", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4LessThanOrEqualTo(String value) {
            addCriterion("sku_name4 <=", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4Like(String value) {
            addCriterion("sku_name4 like", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4NotLike(String value) {
            addCriterion("sku_name4 not like", value, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4In(List<String> values) {
            addCriterion("sku_name4 in", values, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4NotIn(List<String> values) {
            addCriterion("sku_name4 not in", values, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4Between(String value1, String value2) {
            addCriterion("sku_name4 between", value1, value2, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuName4NotBetween(String value1, String value2) {
            addCriterion("sku_name4 not between", value1, value2, "skuName4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4IsNull() {
            addCriterion("sku_value4 is null");
            return (Criteria) this;
        }

        public Criteria andSkuValue4IsNotNull() {
            addCriterion("sku_value4 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuValue4EqualTo(String value) {
            addCriterion("sku_value4 =", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4NotEqualTo(String value) {
            addCriterion("sku_value4 <>", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4GreaterThan(String value) {
            addCriterion("sku_value4 >", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4GreaterThanOrEqualTo(String value) {
            addCriterion("sku_value4 >=", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4LessThan(String value) {
            addCriterion("sku_value4 <", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4LessThanOrEqualTo(String value) {
            addCriterion("sku_value4 <=", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4Like(String value) {
            addCriterion("sku_value4 like", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4NotLike(String value) {
            addCriterion("sku_value4 not like", value, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4In(List<String> values) {
            addCriterion("sku_value4 in", values, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4NotIn(List<String> values) {
            addCriterion("sku_value4 not in", values, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4Between(String value1, String value2) {
            addCriterion("sku_value4 between", value1, value2, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuValue4NotBetween(String value1, String value2) {
            addCriterion("sku_value4 not between", value1, value2, "skuValue4");
            return (Criteria) this;
        }

        public Criteria andSkuName5IsNull() {
            addCriterion("sku_name5 is null");
            return (Criteria) this;
        }

        public Criteria andSkuName5IsNotNull() {
            addCriterion("sku_name5 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuName5EqualTo(String value) {
            addCriterion("sku_name5 =", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5NotEqualTo(String value) {
            addCriterion("sku_name5 <>", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5GreaterThan(String value) {
            addCriterion("sku_name5 >", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5GreaterThanOrEqualTo(String value) {
            addCriterion("sku_name5 >=", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5LessThan(String value) {
            addCriterion("sku_name5 <", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5LessThanOrEqualTo(String value) {
            addCriterion("sku_name5 <=", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5Like(String value) {
            addCriterion("sku_name5 like", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5NotLike(String value) {
            addCriterion("sku_name5 not like", value, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5In(List<String> values) {
            addCriterion("sku_name5 in", values, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5NotIn(List<String> values) {
            addCriterion("sku_name5 not in", values, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5Between(String value1, String value2) {
            addCriterion("sku_name5 between", value1, value2, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuName5NotBetween(String value1, String value2) {
            addCriterion("sku_name5 not between", value1, value2, "skuName5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5IsNull() {
            addCriterion("sku_value5 is null");
            return (Criteria) this;
        }

        public Criteria andSkuValue5IsNotNull() {
            addCriterion("sku_value5 is not null");
            return (Criteria) this;
        }

        public Criteria andSkuValue5EqualTo(String value) {
            addCriterion("sku_value5 =", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5NotEqualTo(String value) {
            addCriterion("sku_value5 <>", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5GreaterThan(String value) {
            addCriterion("sku_value5 >", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5GreaterThanOrEqualTo(String value) {
            addCriterion("sku_value5 >=", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5LessThan(String value) {
            addCriterion("sku_value5 <", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5LessThanOrEqualTo(String value) {
            addCriterion("sku_value5 <=", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5Like(String value) {
            addCriterion("sku_value5 like", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5NotLike(String value) {
            addCriterion("sku_value5 not like", value, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5In(List<String> values) {
            addCriterion("sku_value5 in", values, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5NotIn(List<String> values) {
            addCriterion("sku_value5 not in", values, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5Between(String value1, String value2) {
            addCriterion("sku_value5 between", value1, value2, "skuValue5");
            return (Criteria) this;
        }

        public Criteria andSkuValue5NotBetween(String value1, String value2) {
            addCriterion("sku_value5 not between", value1, value2, "skuValue5");
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

        public Criteria andSaleCountIsNull() {
            addCriterion("sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNotNull() {
            addCriterion("sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCountEqualTo(Integer value) {
            addCriterion("sale_count =", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotEqualTo(Integer value) {
            addCriterion("sale_count <>", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThan(Integer value) {
            addCriterion("sale_count >", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_count >=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThan(Integer value) {
            addCriterion("sale_count <", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_count <=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountIn(List<Integer> values) {
            addCriterion("sale_count in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotIn(List<Integer> values) {
            addCriterion("sale_count not in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_count between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_count not between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
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

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
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

        public Criteria andMaxRetailPriceIsNull() {
            addCriterion("max_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceIsNotNull() {
            addCriterion("max_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceEqualTo(Double value) {
            addCriterion("max_retail_price =", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceNotEqualTo(Double value) {
            addCriterion("max_retail_price <>", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceGreaterThan(Double value) {
            addCriterion("max_retail_price >", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("max_retail_price >=", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceLessThan(Double value) {
            addCriterion("max_retail_price <", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceLessThanOrEqualTo(Double value) {
            addCriterion("max_retail_price <=", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceIn(List<Double> values) {
            addCriterion("max_retail_price in", values, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceNotIn(List<Double> values) {
            addCriterion("max_retail_price not in", values, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceBetween(Double value1, Double value2) {
            addCriterion("max_retail_price between", value1, value2, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceNotBetween(Double value1, Double value2) {
            addCriterion("max_retail_price not between", value1, value2, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceIsNull() {
            addCriterion("min_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceIsNotNull() {
            addCriterion("min_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceEqualTo(Double value) {
            addCriterion("min_retail_price =", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceNotEqualTo(Double value) {
            addCriterion("min_retail_price <>", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceGreaterThan(Double value) {
            addCriterion("min_retail_price >", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("min_retail_price >=", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceLessThan(Double value) {
            addCriterion("min_retail_price <", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceLessThanOrEqualTo(Double value) {
            addCriterion("min_retail_price <=", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceIn(List<Double> values) {
            addCriterion("min_retail_price in", values, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceNotIn(List<Double> values) {
            addCriterion("min_retail_price not in", values, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceBetween(Double value1, Double value2) {
            addCriterion("min_retail_price between", value1, value2, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceNotBetween(Double value1, Double value2) {
            addCriterion("min_retail_price not between", value1, value2, "minRetailPrice");
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