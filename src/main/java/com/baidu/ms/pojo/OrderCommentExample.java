package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCommentExample() {
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

        public Criteria andOrderItemIdIsNull() {
            addCriterion("order_item_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("order_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(Integer value) {
            addCriterion("order_item_id =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(Integer value) {
            addCriterion("order_item_id <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(Integer value) {
            addCriterion("order_item_id >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_item_id >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(Integer value) {
            addCriterion("order_item_id <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_item_id <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<Integer> values) {
            addCriterion("order_item_id in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<Integer> values) {
            addCriterion("order_item_id not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id not between", value1, value2, "orderItemId");
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

        public Criteria andSupplierGoodsIdIsNull() {
            addCriterion("supplier_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdIsNotNull() {
            addCriterion("supplier_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdEqualTo(Integer value) {
            addCriterion("supplier_goods_id =", value, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdNotEqualTo(Integer value) {
            addCriterion("supplier_goods_id <>", value, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdGreaterThan(Integer value) {
            addCriterion("supplier_goods_id >", value, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_goods_id >=", value, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdLessThan(Integer value) {
            addCriterion("supplier_goods_id <", value, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_goods_id <=", value, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdIn(List<Integer> values) {
            addCriterion("supplier_goods_id in", values, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdNotIn(List<Integer> values) {
            addCriterion("supplier_goods_id not in", values, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_goods_id between", value1, value2, "supplierGoodsId");
            return (Criteria) this;
        }

        public Criteria andSupplierGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_goods_id not between", value1, value2, "supplierGoodsId");
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

        public Criteria andDescriptionScoreIsNull() {
            addCriterion("description_score is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreIsNotNull() {
            addCriterion("description_score is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreEqualTo(Integer value) {
            addCriterion("description_score =", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreNotEqualTo(Integer value) {
            addCriterion("description_score <>", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreGreaterThan(Integer value) {
            addCriterion("description_score >", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("description_score >=", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreLessThan(Integer value) {
            addCriterion("description_score <", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreLessThanOrEqualTo(Integer value) {
            addCriterion("description_score <=", value, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreIn(List<Integer> values) {
            addCriterion("description_score in", values, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreNotIn(List<Integer> values) {
            addCriterion("description_score not in", values, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreBetween(Integer value1, Integer value2) {
            addCriterion("description_score between", value1, value2, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andDescriptionScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("description_score not between", value1, value2, "descriptionScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNull() {
            addCriterion("service_score is null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNotNull() {
            addCriterion("service_score is not null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreEqualTo(Integer value) {
            addCriterion("service_score =", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotEqualTo(Integer value) {
            addCriterion("service_score <>", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThan(Integer value) {
            addCriterion("service_score >", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_score >=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThan(Integer value) {
            addCriterion("service_score <", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThanOrEqualTo(Integer value) {
            addCriterion("service_score <=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIn(List<Integer> values) {
            addCriterion("service_score in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotIn(List<Integer> values) {
            addCriterion("service_score not in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreBetween(Integer value1, Integer value2) {
            addCriterion("service_score between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("service_score not between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreIsNull() {
            addCriterion("delivery_score is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreIsNotNull() {
            addCriterion("delivery_score is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreEqualTo(Integer value) {
            addCriterion("delivery_score =", value, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreNotEqualTo(Integer value) {
            addCriterion("delivery_score <>", value, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreGreaterThan(Integer value) {
            addCriterion("delivery_score >", value, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_score >=", value, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreLessThan(Integer value) {
            addCriterion("delivery_score <", value, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_score <=", value, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreIn(List<Integer> values) {
            addCriterion("delivery_score in", values, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreNotIn(List<Integer> values) {
            addCriterion("delivery_score not in", values, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreBetween(Integer value1, Integer value2) {
            addCriterion("delivery_score between", value1, value2, "deliveryScore");
            return (Criteria) this;
        }

        public Criteria andDeliveryScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_score not between", value1, value2, "deliveryScore");
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

        public Criteria andFxGoodsIdIsNull() {
            addCriterion("fx_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdIsNotNull() {
            addCriterion("fx_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdEqualTo(Integer value) {
            addCriterion("fx_goods_id =", value, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdNotEqualTo(Integer value) {
            addCriterion("fx_goods_id <>", value, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdGreaterThan(Integer value) {
            addCriterion("fx_goods_id >", value, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fx_goods_id >=", value, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdLessThan(Integer value) {
            addCriterion("fx_goods_id <", value, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("fx_goods_id <=", value, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdIn(List<Integer> values) {
            addCriterion("fx_goods_id in", values, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdNotIn(List<Integer> values) {
            addCriterion("fx_goods_id not in", values, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("fx_goods_id between", value1, value2, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andFxGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fx_goods_id not between", value1, value2, "fxGoodsId");
            return (Criteria) this;
        }

        public Criteria andImgFlagIsNull() {
            addCriterion("img_flag is null");
            return (Criteria) this;
        }

        public Criteria andImgFlagIsNotNull() {
            addCriterion("img_flag is not null");
            return (Criteria) this;
        }

        public Criteria andImgFlagEqualTo(Short value) {
            addCriterion("img_flag =", value, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagNotEqualTo(Short value) {
            addCriterion("img_flag <>", value, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagGreaterThan(Short value) {
            addCriterion("img_flag >", value, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("img_flag >=", value, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagLessThan(Short value) {
            addCriterion("img_flag <", value, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagLessThanOrEqualTo(Short value) {
            addCriterion("img_flag <=", value, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagIn(List<Short> values) {
            addCriterion("img_flag in", values, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagNotIn(List<Short> values) {
            addCriterion("img_flag not in", values, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagBetween(Short value1, Short value2) {
            addCriterion("img_flag between", value1, value2, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andImgFlagNotBetween(Short value1, Short value2) {
            addCriterion("img_flag not between", value1, value2, "imgFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagIsNull() {
            addCriterion("reviews_flag is null");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagIsNotNull() {
            addCriterion("reviews_flag is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagEqualTo(Short value) {
            addCriterion("reviews_flag =", value, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagNotEqualTo(Short value) {
            addCriterion("reviews_flag <>", value, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagGreaterThan(Short value) {
            addCriterion("reviews_flag >", value, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("reviews_flag >=", value, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagLessThan(Short value) {
            addCriterion("reviews_flag <", value, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagLessThanOrEqualTo(Short value) {
            addCriterion("reviews_flag <=", value, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagIn(List<Short> values) {
            addCriterion("reviews_flag in", values, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagNotIn(List<Short> values) {
            addCriterion("reviews_flag not in", values, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagBetween(Short value1, Short value2) {
            addCriterion("reviews_flag between", value1, value2, "reviewsFlag");
            return (Criteria) this;
        }

        public Criteria andReviewsFlagNotBetween(Short value1, Short value2) {
            addCriterion("reviews_flag not between", value1, value2, "reviewsFlag");
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