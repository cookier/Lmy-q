package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsTagsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTagsExample() {
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

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameIsNull() {
            addCriterion("show_group_name is null");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameIsNotNull() {
            addCriterion("show_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameEqualTo(Short value) {
            addCriterion("show_group_name =", value, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameNotEqualTo(Short value) {
            addCriterion("show_group_name <>", value, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameGreaterThan(Short value) {
            addCriterion("show_group_name >", value, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameGreaterThanOrEqualTo(Short value) {
            addCriterion("show_group_name >=", value, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameLessThan(Short value) {
            addCriterion("show_group_name <", value, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameLessThanOrEqualTo(Short value) {
            addCriterion("show_group_name <=", value, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameIn(List<Short> values) {
            addCriterion("show_group_name in", values, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameNotIn(List<Short> values) {
            addCriterion("show_group_name not in", values, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameBetween(Short value1, Short value2) {
            addCriterion("show_group_name between", value1, value2, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andShowGroupNameNotBetween(Short value1, Short value2) {
            addCriterion("show_group_name not between", value1, value2, "showGroupName");
            return (Criteria) this;
        }

        public Criteria andSortPriority1IsNull() {
            addCriterion("sort_priority1 is null");
            return (Criteria) this;
        }

        public Criteria andSortPriority1IsNotNull() {
            addCriterion("sort_priority1 is not null");
            return (Criteria) this;
        }

        public Criteria andSortPriority1EqualTo(Short value) {
            addCriterion("sort_priority1 =", value, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1NotEqualTo(Short value) {
            addCriterion("sort_priority1 <>", value, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1GreaterThan(Short value) {
            addCriterion("sort_priority1 >", value, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1GreaterThanOrEqualTo(Short value) {
            addCriterion("sort_priority1 >=", value, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1LessThan(Short value) {
            addCriterion("sort_priority1 <", value, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1LessThanOrEqualTo(Short value) {
            addCriterion("sort_priority1 <=", value, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1In(List<Short> values) {
            addCriterion("sort_priority1 in", values, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1NotIn(List<Short> values) {
            addCriterion("sort_priority1 not in", values, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1Between(Short value1, Short value2) {
            addCriterion("sort_priority1 between", value1, value2, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority1NotBetween(Short value1, Short value2) {
            addCriterion("sort_priority1 not between", value1, value2, "sortPriority1");
            return (Criteria) this;
        }

        public Criteria andSortPriority2IsNull() {
            addCriterion("sort_priority2 is null");
            return (Criteria) this;
        }

        public Criteria andSortPriority2IsNotNull() {
            addCriterion("sort_priority2 is not null");
            return (Criteria) this;
        }

        public Criteria andSortPriority2EqualTo(Short value) {
            addCriterion("sort_priority2 =", value, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2NotEqualTo(Short value) {
            addCriterion("sort_priority2 <>", value, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2GreaterThan(Short value) {
            addCriterion("sort_priority2 >", value, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2GreaterThanOrEqualTo(Short value) {
            addCriterion("sort_priority2 >=", value, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2LessThan(Short value) {
            addCriterion("sort_priority2 <", value, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2LessThanOrEqualTo(Short value) {
            addCriterion("sort_priority2 <=", value, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2In(List<Short> values) {
            addCriterion("sort_priority2 in", values, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2NotIn(List<Short> values) {
            addCriterion("sort_priority2 not in", values, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2Between(Short value1, Short value2) {
            addCriterion("sort_priority2 between", value1, value2, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andSortPriority2NotBetween(Short value1, Short value2) {
            addCriterion("sort_priority2 not between", value1, value2, "sortPriority2");
            return (Criteria) this;
        }

        public Criteria andListStyleIsNull() {
            addCriterion("list_style is null");
            return (Criteria) this;
        }

        public Criteria andListStyleIsNotNull() {
            addCriterion("list_style is not null");
            return (Criteria) this;
        }

        public Criteria andListStyleEqualTo(Short value) {
            addCriterion("list_style =", value, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleNotEqualTo(Short value) {
            addCriterion("list_style <>", value, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleGreaterThan(Short value) {
            addCriterion("list_style >", value, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleGreaterThanOrEqualTo(Short value) {
            addCriterion("list_style >=", value, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleLessThan(Short value) {
            addCriterion("list_style <", value, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleLessThanOrEqualTo(Short value) {
            addCriterion("list_style <=", value, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleIn(List<Short> values) {
            addCriterion("list_style in", values, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleNotIn(List<Short> values) {
            addCriterion("list_style not in", values, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleBetween(Short value1, Short value2) {
            addCriterion("list_style between", value1, value2, "listStyle");
            return (Criteria) this;
        }

        public Criteria andListStyleNotBetween(Short value1, Short value2) {
            addCriterion("list_style not between", value1, value2, "listStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleIsNull() {
            addCriterion("item_style is null");
            return (Criteria) this;
        }

        public Criteria andItemStyleIsNotNull() {
            addCriterion("item_style is not null");
            return (Criteria) this;
        }

        public Criteria andItemStyleEqualTo(Short value) {
            addCriterion("item_style =", value, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleNotEqualTo(Short value) {
            addCriterion("item_style <>", value, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleGreaterThan(Short value) {
            addCriterion("item_style >", value, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleGreaterThanOrEqualTo(Short value) {
            addCriterion("item_style >=", value, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleLessThan(Short value) {
            addCriterion("item_style <", value, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleLessThanOrEqualTo(Short value) {
            addCriterion("item_style <=", value, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleIn(List<Short> values) {
            addCriterion("item_style in", values, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleNotIn(List<Short> values) {
            addCriterion("item_style not in", values, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleBetween(Short value1, Short value2) {
            addCriterion("item_style between", value1, value2, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andItemStyleNotBetween(Short value1, Short value2) {
            addCriterion("item_style not between", value1, value2, "itemStyle");
            return (Criteria) this;
        }

        public Criteria andShowProductNameIsNull() {
            addCriterion("show_product_name is null");
            return (Criteria) this;
        }

        public Criteria andShowProductNameIsNotNull() {
            addCriterion("show_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andShowProductNameEqualTo(Short value) {
            addCriterion("show_product_name =", value, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameNotEqualTo(Short value) {
            addCriterion("show_product_name <>", value, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameGreaterThan(Short value) {
            addCriterion("show_product_name >", value, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameGreaterThanOrEqualTo(Short value) {
            addCriterion("show_product_name >=", value, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameLessThan(Short value) {
            addCriterion("show_product_name <", value, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameLessThanOrEqualTo(Short value) {
            addCriterion("show_product_name <=", value, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameIn(List<Short> values) {
            addCriterion("show_product_name in", values, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameNotIn(List<Short> values) {
            addCriterion("show_product_name not in", values, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameBetween(Short value1, Short value2) {
            addCriterion("show_product_name between", value1, value2, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowProductNameNotBetween(Short value1, Short value2) {
            addCriterion("show_product_name not between", value1, value2, "showProductName");
            return (Criteria) this;
        }

        public Criteria andShowPriceIsNull() {
            addCriterion("show_price is null");
            return (Criteria) this;
        }

        public Criteria andShowPriceIsNotNull() {
            addCriterion("show_price is not null");
            return (Criteria) this;
        }

        public Criteria andShowPriceEqualTo(Short value) {
            addCriterion("show_price =", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceNotEqualTo(Short value) {
            addCriterion("show_price <>", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceGreaterThan(Short value) {
            addCriterion("show_price >", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceGreaterThanOrEqualTo(Short value) {
            addCriterion("show_price >=", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceLessThan(Short value) {
            addCriterion("show_price <", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceLessThanOrEqualTo(Short value) {
            addCriterion("show_price <=", value, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceIn(List<Short> values) {
            addCriterion("show_price in", values, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceNotIn(List<Short> values) {
            addCriterion("show_price not in", values, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceBetween(Short value1, Short value2) {
            addCriterion("show_price between", value1, value2, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowPriceNotBetween(Short value1, Short value2) {
            addCriterion("show_price not between", value1, value2, "showPrice");
            return (Criteria) this;
        }

        public Criteria andShowCartIconIsNull() {
            addCriterion("show_cart_icon is null");
            return (Criteria) this;
        }

        public Criteria andShowCartIconIsNotNull() {
            addCriterion("show_cart_icon is not null");
            return (Criteria) this;
        }

        public Criteria andShowCartIconEqualTo(Short value) {
            addCriterion("show_cart_icon =", value, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconNotEqualTo(Short value) {
            addCriterion("show_cart_icon <>", value, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconGreaterThan(Short value) {
            addCriterion("show_cart_icon >", value, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconGreaterThanOrEqualTo(Short value) {
            addCriterion("show_cart_icon >=", value, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconLessThan(Short value) {
            addCriterion("show_cart_icon <", value, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconLessThanOrEqualTo(Short value) {
            addCriterion("show_cart_icon <=", value, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconIn(List<Short> values) {
            addCriterion("show_cart_icon in", values, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconNotIn(List<Short> values) {
            addCriterion("show_cart_icon not in", values, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconBetween(Short value1, Short value2) {
            addCriterion("show_cart_icon between", value1, value2, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowCartIconNotBetween(Short value1, Short value2) {
            addCriterion("show_cart_icon not between", value1, value2, "showCartIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconIsNull() {
            addCriterion("show_buy_icon is null");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconIsNotNull() {
            addCriterion("show_buy_icon is not null");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconEqualTo(Short value) {
            addCriterion("show_buy_icon =", value, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconNotEqualTo(Short value) {
            addCriterion("show_buy_icon <>", value, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconGreaterThan(Short value) {
            addCriterion("show_buy_icon >", value, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconGreaterThanOrEqualTo(Short value) {
            addCriterion("show_buy_icon >=", value, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconLessThan(Short value) {
            addCriterion("show_buy_icon <", value, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconLessThanOrEqualTo(Short value) {
            addCriterion("show_buy_icon <=", value, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconIn(List<Short> values) {
            addCriterion("show_buy_icon in", values, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconNotIn(List<Short> values) {
            addCriterion("show_buy_icon not in", values, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconBetween(Short value1, Short value2) {
            addCriterion("show_buy_icon between", value1, value2, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconNotBetween(Short value1, Short value2) {
            addCriterion("show_buy_icon not between", value1, value2, "showBuyIcon");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleIsNull() {
            addCriterion("show_buy_icon_style is null");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleIsNotNull() {
            addCriterion("show_buy_icon_style is not null");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleEqualTo(Short value) {
            addCriterion("show_buy_icon_style =", value, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleNotEqualTo(Short value) {
            addCriterion("show_buy_icon_style <>", value, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleGreaterThan(Short value) {
            addCriterion("show_buy_icon_style >", value, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleGreaterThanOrEqualTo(Short value) {
            addCriterion("show_buy_icon_style >=", value, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleLessThan(Short value) {
            addCriterion("show_buy_icon_style <", value, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleLessThanOrEqualTo(Short value) {
            addCriterion("show_buy_icon_style <=", value, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleIn(List<Short> values) {
            addCriterion("show_buy_icon_style in", values, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleNotIn(List<Short> values) {
            addCriterion("show_buy_icon_style not in", values, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleBetween(Short value1, Short value2) {
            addCriterion("show_buy_icon_style between", value1, value2, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andShowBuyIconStyleNotBetween(Short value1, Short value2) {
            addCriterion("show_buy_icon_style not between", value1, value2, "showBuyIconStyle");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionIsNull() {
            addCriterion("group_label_introduction is null");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionIsNotNull() {
            addCriterion("group_label_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionEqualTo(String value) {
            addCriterion("group_label_introduction =", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionNotEqualTo(String value) {
            addCriterion("group_label_introduction <>", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionGreaterThan(String value) {
            addCriterion("group_label_introduction >", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("group_label_introduction >=", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionLessThan(String value) {
            addCriterion("group_label_introduction <", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionLessThanOrEqualTo(String value) {
            addCriterion("group_label_introduction <=", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionLike(String value) {
            addCriterion("group_label_introduction like", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionNotLike(String value) {
            addCriterion("group_label_introduction not like", value, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionIn(List<String> values) {
            addCriterion("group_label_introduction in", values, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionNotIn(List<String> values) {
            addCriterion("group_label_introduction not in", values, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionBetween(String value1, String value2) {
            addCriterion("group_label_introduction between", value1, value2, "groupLabelIntroduction");
            return (Criteria) this;
        }

        public Criteria andGroupLabelIntroductionNotBetween(String value1, String value2) {
            addCriterion("group_label_introduction not between", value1, value2, "groupLabelIntroduction");
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

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagIsNull() {
            addCriterion("system_group_flag is null");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagIsNotNull() {
            addCriterion("system_group_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagEqualTo(Short value) {
            addCriterion("system_group_flag =", value, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagNotEqualTo(Short value) {
            addCriterion("system_group_flag <>", value, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagGreaterThan(Short value) {
            addCriterion("system_group_flag >", value, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("system_group_flag >=", value, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagLessThan(Short value) {
            addCriterion("system_group_flag <", value, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagLessThanOrEqualTo(Short value) {
            addCriterion("system_group_flag <=", value, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagIn(List<Short> values) {
            addCriterion("system_group_flag in", values, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagNotIn(List<Short> values) {
            addCriterion("system_group_flag not in", values, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagBetween(Short value1, Short value2) {
            addCriterion("system_group_flag between", value1, value2, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andSystemGroupFlagNotBetween(Short value1, Short value2) {
            addCriterion("system_group_flag not between", value1, value2, "systemGroupFlag");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Short value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Short value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Short value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Short value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Short value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Short value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Short> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Short> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Short value1, Short value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Short value1, Short value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
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

        public Criteria andDeleteFlagEqualTo(Short value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Short value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Short value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Short value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Short value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Short> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Short> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Short value1, Short value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Short value1, Short value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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