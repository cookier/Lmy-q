package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataFanstagOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataFanstagOrderExample() {
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

        public Criteria andTagNameIsNull() {
            addCriterion("tag_name is null");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNotNull() {
            addCriterion("tag_name is not null");
            return (Criteria) this;
        }

        public Criteria andTagNameEqualTo(String value) {
            addCriterion("tag_name =", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotEqualTo(String value) {
            addCriterion("tag_name <>", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThan(String value) {
            addCriterion("tag_name >", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("tag_name >=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThan(String value) {
            addCriterion("tag_name <", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThanOrEqualTo(String value) {
            addCriterion("tag_name <=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLike(String value) {
            addCriterion("tag_name like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotLike(String value) {
            addCriterion("tag_name not like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameIn(List<String> values) {
            addCriterion("tag_name in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotIn(List<String> values) {
            addCriterion("tag_name not in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameBetween(String value1, String value2) {
            addCriterion("tag_name between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotBetween(String value1, String value2) {
            addCriterion("tag_name not between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNull() {
            addCriterion("tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Integer value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Integer value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Integer value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Integer value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Integer> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Integer> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Integer value1, Integer value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNull() {
            addCriterion("fans_count is null");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNotNull() {
            addCriterion("fans_count is not null");
            return (Criteria) this;
        }

        public Criteria andFansCountEqualTo(Integer value) {
            addCriterion("fans_count =", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotEqualTo(Integer value) {
            addCriterion("fans_count <>", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThan(Integer value) {
            addCriterion("fans_count >", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_count >=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThan(Integer value) {
            addCriterion("fans_count <", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThanOrEqualTo(Integer value) {
            addCriterion("fans_count <=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIn(List<Integer> values) {
            addCriterion("fans_count in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotIn(List<Integer> values) {
            addCriterion("fans_count not in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountBetween(Integer value1, Integer value2) {
            addCriterion("fans_count between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_count not between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andWechatAddedIsNull() {
            addCriterion("wechat_added is null");
            return (Criteria) this;
        }

        public Criteria andWechatAddedIsNotNull() {
            addCriterion("wechat_added is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAddedEqualTo(Integer value) {
            addCriterion("wechat_added =", value, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedNotEqualTo(Integer value) {
            addCriterion("wechat_added <>", value, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedGreaterThan(Integer value) {
            addCriterion("wechat_added >", value, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_added >=", value, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedLessThan(Integer value) {
            addCriterion("wechat_added <", value, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_added <=", value, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedIn(List<Integer> values) {
            addCriterion("wechat_added in", values, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedNotIn(List<Integer> values) {
            addCriterion("wechat_added not in", values, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedBetween(Integer value1, Integer value2) {
            addCriterion("wechat_added between", value1, value2, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andWechatAddedNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_added not between", value1, value2, "wechatAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedIsNull() {
            addCriterion("mobile_added is null");
            return (Criteria) this;
        }

        public Criteria andMobileAddedIsNotNull() {
            addCriterion("mobile_added is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAddedEqualTo(Integer value) {
            addCriterion("mobile_added =", value, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedNotEqualTo(Integer value) {
            addCriterion("mobile_added <>", value, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedGreaterThan(Integer value) {
            addCriterion("mobile_added >", value, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile_added >=", value, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedLessThan(Integer value) {
            addCriterion("mobile_added <", value, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedLessThanOrEqualTo(Integer value) {
            addCriterion("mobile_added <=", value, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedIn(List<Integer> values) {
            addCriterion("mobile_added in", values, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedNotIn(List<Integer> values) {
            addCriterion("mobile_added not in", values, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedBetween(Integer value1, Integer value2) {
            addCriterion("mobile_added between", value1, value2, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andMobileAddedNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile_added not between", value1, value2, "mobileAdded");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountIsNull() {
            addCriterion("pay_order_count is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountIsNotNull() {
            addCriterion("pay_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountEqualTo(Integer value) {
            addCriterion("pay_order_count =", value, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountNotEqualTo(Integer value) {
            addCriterion("pay_order_count <>", value, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountGreaterThan(Integer value) {
            addCriterion("pay_order_count >", value, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_order_count >=", value, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountLessThan(Integer value) {
            addCriterion("pay_order_count <", value, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("pay_order_count <=", value, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountIn(List<Integer> values) {
            addCriterion("pay_order_count in", values, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountNotIn(List<Integer> values) {
            addCriterion("pay_order_count not in", values, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("pay_order_count between", value1, value2, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_order_count not between", value1, value2, "payOrderCount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Double value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Double value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Double value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Double value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Double value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Double> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Double> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Double value1, Double value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Double value1, Double value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountIsNull() {
            addCriterion("pay_goods_count is null");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountIsNotNull() {
            addCriterion("pay_goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountEqualTo(Integer value) {
            addCriterion("pay_goods_count =", value, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountNotEqualTo(Integer value) {
            addCriterion("pay_goods_count <>", value, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountGreaterThan(Integer value) {
            addCriterion("pay_goods_count >", value, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_goods_count >=", value, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountLessThan(Integer value) {
            addCriterion("pay_goods_count <", value, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("pay_goods_count <=", value, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountIn(List<Integer> values) {
            addCriterion("pay_goods_count in", values, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountNotIn(List<Integer> values) {
            addCriterion("pay_goods_count not in", values, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("pay_goods_count between", value1, value2, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_goods_count not between", value1, value2, "payGoodsCount");
            return (Criteria) this;
        }

        public Criteria andPayBuyerIsNull() {
            addCriterion("pay_buyer is null");
            return (Criteria) this;
        }

        public Criteria andPayBuyerIsNotNull() {
            addCriterion("pay_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andPayBuyerEqualTo(Integer value) {
            addCriterion("pay_buyer =", value, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerNotEqualTo(Integer value) {
            addCriterion("pay_buyer <>", value, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerGreaterThan(Integer value) {
            addCriterion("pay_buyer >", value, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_buyer >=", value, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerLessThan(Integer value) {
            addCriterion("pay_buyer <", value, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerLessThanOrEqualTo(Integer value) {
            addCriterion("pay_buyer <=", value, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerIn(List<Integer> values) {
            addCriterion("pay_buyer in", values, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerNotIn(List<Integer> values) {
            addCriterion("pay_buyer not in", values, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerBetween(Integer value1, Integer value2) {
            addCriterion("pay_buyer between", value1, value2, "payBuyer");
            return (Criteria) this;
        }

        public Criteria andPayBuyerNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_buyer not between", value1, value2, "payBuyer");
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

        public Criteria andCalcuDateIsNull() {
            addCriterion("calcu_date is null");
            return (Criteria) this;
        }

        public Criteria andCalcuDateIsNotNull() {
            addCriterion("calcu_date is not null");
            return (Criteria) this;
        }

        public Criteria andCalcuDateEqualTo(Date value) {
            addCriterion("calcu_date =", value, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateNotEqualTo(Date value) {
            addCriterion("calcu_date <>", value, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateGreaterThan(Date value) {
            addCriterion("calcu_date >", value, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateGreaterThanOrEqualTo(Date value) {
            addCriterion("calcu_date >=", value, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateLessThan(Date value) {
            addCriterion("calcu_date <", value, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateLessThanOrEqualTo(Date value) {
            addCriterion("calcu_date <=", value, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateIn(List<Date> values) {
            addCriterion("calcu_date in", values, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateNotIn(List<Date> values) {
            addCriterion("calcu_date not in", values, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateBetween(Date value1, Date value2) {
            addCriterion("calcu_date between", value1, value2, "calcuDate");
            return (Criteria) this;
        }

        public Criteria andCalcuDateNotBetween(Date value1, Date value2) {
            addCriterion("calcu_date not between", value1, value2, "calcuDate");
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