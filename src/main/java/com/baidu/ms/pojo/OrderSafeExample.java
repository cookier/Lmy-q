package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSafeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSafeExample() {
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

        public Criteria andSafeNoIsNull() {
            addCriterion("safe_no is null");
            return (Criteria) this;
        }

        public Criteria andSafeNoIsNotNull() {
            addCriterion("safe_no is not null");
            return (Criteria) this;
        }

        public Criteria andSafeNoEqualTo(String value) {
            addCriterion("safe_no =", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoNotEqualTo(String value) {
            addCriterion("safe_no <>", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoGreaterThan(String value) {
            addCriterion("safe_no >", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoGreaterThanOrEqualTo(String value) {
            addCriterion("safe_no >=", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoLessThan(String value) {
            addCriterion("safe_no <", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoLessThanOrEqualTo(String value) {
            addCriterion("safe_no <=", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoLike(String value) {
            addCriterion("safe_no like", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoNotLike(String value) {
            addCriterion("safe_no not like", value, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoIn(List<String> values) {
            addCriterion("safe_no in", values, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoNotIn(List<String> values) {
            addCriterion("safe_no not in", values, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoBetween(String value1, String value2) {
            addCriterion("safe_no between", value1, value2, "safeNo");
            return (Criteria) this;
        }

        public Criteria andSafeNoNotBetween(String value1, String value2) {
            addCriterion("safe_no not between", value1, value2, "safeNo");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNull() {
            addCriterion("refund_fee is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNotNull() {
            addCriterion("refund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeEqualTo(Double value) {
            addCriterion("refund_fee =", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotEqualTo(Double value) {
            addCriterion("refund_fee <>", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThan(Double value) {
            addCriterion("refund_fee >", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("refund_fee >=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThan(Double value) {
            addCriterion("refund_fee <", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThanOrEqualTo(Double value) {
            addCriterion("refund_fee <=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIn(List<Double> values) {
            addCriterion("refund_fee in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotIn(List<Double> values) {
            addCriterion("refund_fee not in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeBetween(Double value1, Double value2) {
            addCriterion("refund_fee between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotBetween(Double value1, Double value2) {
            addCriterion("refund_fee not between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andSafeTypeIsNull() {
            addCriterion("safe_type is null");
            return (Criteria) this;
        }

        public Criteria andSafeTypeIsNotNull() {
            addCriterion("safe_type is not null");
            return (Criteria) this;
        }

        public Criteria andSafeTypeEqualTo(Integer value) {
            addCriterion("safe_type =", value, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeNotEqualTo(Integer value) {
            addCriterion("safe_type <>", value, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeGreaterThan(Integer value) {
            addCriterion("safe_type >", value, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("safe_type >=", value, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeLessThan(Integer value) {
            addCriterion("safe_type <", value, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("safe_type <=", value, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeIn(List<Integer> values) {
            addCriterion("safe_type in", values, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeNotIn(List<Integer> values) {
            addCriterion("safe_type not in", values, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeBetween(Integer value1, Integer value2) {
            addCriterion("safe_type between", value1, value2, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("safe_type not between", value1, value2, "safeType");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrIsNull() {
            addCriterion("safe_type_str is null");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrIsNotNull() {
            addCriterion("safe_type_str is not null");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrEqualTo(String value) {
            addCriterion("safe_type_str =", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrNotEqualTo(String value) {
            addCriterion("safe_type_str <>", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrGreaterThan(String value) {
            addCriterion("safe_type_str >", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrGreaterThanOrEqualTo(String value) {
            addCriterion("safe_type_str >=", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrLessThan(String value) {
            addCriterion("safe_type_str <", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrLessThanOrEqualTo(String value) {
            addCriterion("safe_type_str <=", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrLike(String value) {
            addCriterion("safe_type_str like", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrNotLike(String value) {
            addCriterion("safe_type_str not like", value, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrIn(List<String> values) {
            addCriterion("safe_type_str in", values, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrNotIn(List<String> values) {
            addCriterion("safe_type_str not in", values, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrBetween(String value1, String value2) {
            addCriterion("safe_type_str between", value1, value2, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeTypeStrNotBetween(String value1, String value2) {
            addCriterion("safe_type_str not between", value1, value2, "safeTypeStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonIsNull() {
            addCriterion("safe_reason is null");
            return (Criteria) this;
        }

        public Criteria andSafeReasonIsNotNull() {
            addCriterion("safe_reason is not null");
            return (Criteria) this;
        }

        public Criteria andSafeReasonEqualTo(Integer value) {
            addCriterion("safe_reason =", value, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonNotEqualTo(Integer value) {
            addCriterion("safe_reason <>", value, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonGreaterThan(Integer value) {
            addCriterion("safe_reason >", value, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("safe_reason >=", value, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonLessThan(Integer value) {
            addCriterion("safe_reason <", value, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonLessThanOrEqualTo(Integer value) {
            addCriterion("safe_reason <=", value, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonIn(List<Integer> values) {
            addCriterion("safe_reason in", values, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonNotIn(List<Integer> values) {
            addCriterion("safe_reason not in", values, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonBetween(Integer value1, Integer value2) {
            addCriterion("safe_reason between", value1, value2, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("safe_reason not between", value1, value2, "safeReason");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrIsNull() {
            addCriterion("safe_reason_str is null");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrIsNotNull() {
            addCriterion("safe_reason_str is not null");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrEqualTo(String value) {
            addCriterion("safe_reason_str =", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrNotEqualTo(String value) {
            addCriterion("safe_reason_str <>", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrGreaterThan(String value) {
            addCriterion("safe_reason_str >", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrGreaterThanOrEqualTo(String value) {
            addCriterion("safe_reason_str >=", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrLessThan(String value) {
            addCriterion("safe_reason_str <", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrLessThanOrEqualTo(String value) {
            addCriterion("safe_reason_str <=", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrLike(String value) {
            addCriterion("safe_reason_str like", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrNotLike(String value) {
            addCriterion("safe_reason_str not like", value, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrIn(List<String> values) {
            addCriterion("safe_reason_str in", values, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrNotIn(List<String> values) {
            addCriterion("safe_reason_str not in", values, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrBetween(String value1, String value2) {
            addCriterion("safe_reason_str between", value1, value2, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSafeReasonStrNotBetween(String value1, String value2) {
            addCriterion("safe_reason_str not between", value1, value2, "safeReasonStr");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoIsNull() {
            addCriterion("supplier_order_no is null");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoIsNotNull() {
            addCriterion("supplier_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoEqualTo(String value) {
            addCriterion("supplier_order_no =", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotEqualTo(String value) {
            addCriterion("supplier_order_no <>", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoGreaterThan(String value) {
            addCriterion("supplier_order_no >", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_order_no >=", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoLessThan(String value) {
            addCriterion("supplier_order_no <", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoLessThanOrEqualTo(String value) {
            addCriterion("supplier_order_no <=", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoLike(String value) {
            addCriterion("supplier_order_no like", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotLike(String value) {
            addCriterion("supplier_order_no not like", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoIn(List<String> values) {
            addCriterion("supplier_order_no in", values, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotIn(List<String> values) {
            addCriterion("supplier_order_no not in", values, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoBetween(String value1, String value2) {
            addCriterion("supplier_order_no between", value1, value2, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotBetween(String value1, String value2) {
            addCriterion("supplier_order_no not between", value1, value2, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeIsNull() {
            addCriterion("supplier_refund_fee is null");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeIsNotNull() {
            addCriterion("supplier_refund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeEqualTo(Double value) {
            addCriterion("supplier_refund_fee =", value, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeNotEqualTo(Double value) {
            addCriterion("supplier_refund_fee <>", value, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeGreaterThan(Double value) {
            addCriterion("supplier_refund_fee >", value, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("supplier_refund_fee >=", value, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeLessThan(Double value) {
            addCriterion("supplier_refund_fee <", value, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeLessThanOrEqualTo(Double value) {
            addCriterion("supplier_refund_fee <=", value, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeIn(List<Double> values) {
            addCriterion("supplier_refund_fee in", values, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeNotIn(List<Double> values) {
            addCriterion("supplier_refund_fee not in", values, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeBetween(Double value1, Double value2) {
            addCriterion("supplier_refund_fee between", value1, value2, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRefundFeeNotBetween(Double value1, Double value2) {
            addCriterion("supplier_refund_fee not between", value1, value2, "supplierRefundFee");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayIsNull() {
            addCriterion("supplier_real_pay is null");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayIsNotNull() {
            addCriterion("supplier_real_pay is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayEqualTo(Double value) {
            addCriterion("supplier_real_pay =", value, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayNotEqualTo(Double value) {
            addCriterion("supplier_real_pay <>", value, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayGreaterThan(Double value) {
            addCriterion("supplier_real_pay >", value, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayGreaterThanOrEqualTo(Double value) {
            addCriterion("supplier_real_pay >=", value, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayLessThan(Double value) {
            addCriterion("supplier_real_pay <", value, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayLessThanOrEqualTo(Double value) {
            addCriterion("supplier_real_pay <=", value, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayIn(List<Double> values) {
            addCriterion("supplier_real_pay in", values, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayNotIn(List<Double> values) {
            addCriterion("supplier_real_pay not in", values, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayBetween(Double value1, Double value2) {
            addCriterion("supplier_real_pay between", value1, value2, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSupplierRealPayNotBetween(Double value1, Double value2) {
            addCriterion("supplier_real_pay not between", value1, value2, "supplierRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeIsNull() {
            addCriterion("seller_refund_fee is null");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeIsNotNull() {
            addCriterion("seller_refund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeEqualTo(Double value) {
            addCriterion("seller_refund_fee =", value, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeNotEqualTo(Double value) {
            addCriterion("seller_refund_fee <>", value, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeGreaterThan(Double value) {
            addCriterion("seller_refund_fee >", value, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("seller_refund_fee >=", value, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeLessThan(Double value) {
            addCriterion("seller_refund_fee <", value, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeLessThanOrEqualTo(Double value) {
            addCriterion("seller_refund_fee <=", value, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeIn(List<Double> values) {
            addCriterion("seller_refund_fee in", values, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeNotIn(List<Double> values) {
            addCriterion("seller_refund_fee not in", values, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeBetween(Double value1, Double value2) {
            addCriterion("seller_refund_fee between", value1, value2, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andSellerRefundFeeNotBetween(Double value1, Double value2) {
            addCriterion("seller_refund_fee not between", value1, value2, "sellerRefundFee");
            return (Criteria) this;
        }

        public Criteria andIsAssumeIsNull() {
            addCriterion("is_assume is null");
            return (Criteria) this;
        }

        public Criteria andIsAssumeIsNotNull() {
            addCriterion("is_assume is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssumeEqualTo(Integer value) {
            addCriterion("is_assume =", value, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeNotEqualTo(Integer value) {
            addCriterion("is_assume <>", value, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeGreaterThan(Integer value) {
            addCriterion("is_assume >", value, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_assume >=", value, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeLessThan(Integer value) {
            addCriterion("is_assume <", value, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeLessThanOrEqualTo(Integer value) {
            addCriterion("is_assume <=", value, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeIn(List<Integer> values) {
            addCriterion("is_assume in", values, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeNotIn(List<Integer> values) {
            addCriterion("is_assume not in", values, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeBetween(Integer value1, Integer value2) {
            addCriterion("is_assume between", value1, value2, "isAssume");
            return (Criteria) this;
        }

        public Criteria andIsAssumeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_assume not between", value1, value2, "isAssume");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayIsNull() {
            addCriterion("seller_real_pay is null");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayIsNotNull() {
            addCriterion("seller_real_pay is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayEqualTo(Double value) {
            addCriterion("seller_real_pay =", value, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayNotEqualTo(Double value) {
            addCriterion("seller_real_pay <>", value, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayGreaterThan(Double value) {
            addCriterion("seller_real_pay >", value, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayGreaterThanOrEqualTo(Double value) {
            addCriterion("seller_real_pay >=", value, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayLessThan(Double value) {
            addCriterion("seller_real_pay <", value, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayLessThanOrEqualTo(Double value) {
            addCriterion("seller_real_pay <=", value, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayIn(List<Double> values) {
            addCriterion("seller_real_pay in", values, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayNotIn(List<Double> values) {
            addCriterion("seller_real_pay not in", values, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayBetween(Double value1, Double value2) {
            addCriterion("seller_real_pay between", value1, value2, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andSellerRealPayNotBetween(Double value1, Double value2) {
            addCriterion("seller_real_pay not between", value1, value2, "sellerRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedIsNull() {
            addCriterion("platform_refund_feed is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedIsNotNull() {
            addCriterion("platform_refund_feed is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedEqualTo(Double value) {
            addCriterion("platform_refund_feed =", value, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedNotEqualTo(Double value) {
            addCriterion("platform_refund_feed <>", value, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedGreaterThan(Double value) {
            addCriterion("platform_refund_feed >", value, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedGreaterThanOrEqualTo(Double value) {
            addCriterion("platform_refund_feed >=", value, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedLessThan(Double value) {
            addCriterion("platform_refund_feed <", value, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedLessThanOrEqualTo(Double value) {
            addCriterion("platform_refund_feed <=", value, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedIn(List<Double> values) {
            addCriterion("platform_refund_feed in", values, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedNotIn(List<Double> values) {
            addCriterion("platform_refund_feed not in", values, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedBetween(Double value1, Double value2) {
            addCriterion("platform_refund_feed between", value1, value2, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRefundFeedNotBetween(Double value1, Double value2) {
            addCriterion("platform_refund_feed not between", value1, value2, "platformRefundFeed");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayIsNull() {
            addCriterion("platform_real_pay is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayIsNotNull() {
            addCriterion("platform_real_pay is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayEqualTo(Double value) {
            addCriterion("platform_real_pay =", value, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayNotEqualTo(Double value) {
            addCriterion("platform_real_pay <>", value, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayGreaterThan(Double value) {
            addCriterion("platform_real_pay >", value, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayGreaterThanOrEqualTo(Double value) {
            addCriterion("platform_real_pay >=", value, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayLessThan(Double value) {
            addCriterion("platform_real_pay <", value, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayLessThanOrEqualTo(Double value) {
            addCriterion("platform_real_pay <=", value, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayIn(List<Double> values) {
            addCriterion("platform_real_pay in", values, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayNotIn(List<Double> values) {
            addCriterion("platform_real_pay not in", values, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayBetween(Double value1, Double value2) {
            addCriterion("platform_real_pay between", value1, value2, "platformRealPay");
            return (Criteria) this;
        }

        public Criteria andPlatformRealPayNotBetween(Double value1, Double value2) {
            addCriterion("platform_real_pay not between", value1, value2, "platformRealPay");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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

        public Criteria andRefundAddressIsNull() {
            addCriterion("refund_address is null");
            return (Criteria) this;
        }

        public Criteria andRefundAddressIsNotNull() {
            addCriterion("refund_address is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAddressEqualTo(String value) {
            addCriterion("refund_address =", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressNotEqualTo(String value) {
            addCriterion("refund_address <>", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressGreaterThan(String value) {
            addCriterion("refund_address >", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressGreaterThanOrEqualTo(String value) {
            addCriterion("refund_address >=", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressLessThan(String value) {
            addCriterion("refund_address <", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressLessThanOrEqualTo(String value) {
            addCriterion("refund_address <=", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressLike(String value) {
            addCriterion("refund_address like", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressNotLike(String value) {
            addCriterion("refund_address not like", value, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressIn(List<String> values) {
            addCriterion("refund_address in", values, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressNotIn(List<String> values) {
            addCriterion("refund_address not in", values, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressBetween(String value1, String value2) {
            addCriterion("refund_address between", value1, value2, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundAddressNotBetween(String value1, String value2) {
            addCriterion("refund_address not between", value1, value2, "refundAddress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoIsNull() {
            addCriterion("refund_express_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoIsNotNull() {
            addCriterion("refund_express_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoEqualTo(String value) {
            addCriterion("refund_express_no =", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotEqualTo(String value) {
            addCriterion("refund_express_no <>", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoGreaterThan(String value) {
            addCriterion("refund_express_no >", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_express_no >=", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoLessThan(String value) {
            addCriterion("refund_express_no <", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoLessThanOrEqualTo(String value) {
            addCriterion("refund_express_no <=", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoLike(String value) {
            addCriterion("refund_express_no like", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotLike(String value) {
            addCriterion("refund_express_no not like", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoIn(List<String> values) {
            addCriterion("refund_express_no in", values, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotIn(List<String> values) {
            addCriterion("refund_express_no not in", values, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoBetween(String value1, String value2) {
            addCriterion("refund_express_no between", value1, value2, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotBetween(String value1, String value2) {
            addCriterion("refund_express_no not between", value1, value2, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameIsNull() {
            addCriterion("refund_express_name is null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameIsNotNull() {
            addCriterion("refund_express_name is not null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameEqualTo(String value) {
            addCriterion("refund_express_name =", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameNotEqualTo(String value) {
            addCriterion("refund_express_name <>", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameGreaterThan(String value) {
            addCriterion("refund_express_name >", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("refund_express_name >=", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameLessThan(String value) {
            addCriterion("refund_express_name <", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameLessThanOrEqualTo(String value) {
            addCriterion("refund_express_name <=", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameLike(String value) {
            addCriterion("refund_express_name like", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameNotLike(String value) {
            addCriterion("refund_express_name not like", value, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameIn(List<String> values) {
            addCriterion("refund_express_name in", values, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameNotIn(List<String> values) {
            addCriterion("refund_express_name not in", values, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameBetween(String value1, String value2) {
            addCriterion("refund_express_name between", value1, value2, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNameNotBetween(String value1, String value2) {
            addCriterion("refund_express_name not between", value1, value2, "refundExpressName");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdIsNull() {
            addCriterion("refund_pay_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdIsNotNull() {
            addCriterion("refund_pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdEqualTo(String value) {
            addCriterion("refund_pay_id =", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdNotEqualTo(String value) {
            addCriterion("refund_pay_id <>", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdGreaterThan(String value) {
            addCriterion("refund_pay_id >", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("refund_pay_id >=", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdLessThan(String value) {
            addCriterion("refund_pay_id <", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdLessThanOrEqualTo(String value) {
            addCriterion("refund_pay_id <=", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdLike(String value) {
            addCriterion("refund_pay_id like", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdNotLike(String value) {
            addCriterion("refund_pay_id not like", value, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdIn(List<String> values) {
            addCriterion("refund_pay_id in", values, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdNotIn(List<String> values) {
            addCriterion("refund_pay_id not in", values, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdBetween(String value1, String value2) {
            addCriterion("refund_pay_id between", value1, value2, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andRefundPayIdNotBetween(String value1, String value2) {
            addCriterion("refund_pay_id not between", value1, value2, "refundPayId");
            return (Criteria) this;
        }

        public Criteria andStatusStrIsNull() {
            addCriterion("status_str is null");
            return (Criteria) this;
        }

        public Criteria andStatusStrIsNotNull() {
            addCriterion("status_str is not null");
            return (Criteria) this;
        }

        public Criteria andStatusStrEqualTo(String value) {
            addCriterion("status_str =", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotEqualTo(String value) {
            addCriterion("status_str <>", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrGreaterThan(String value) {
            addCriterion("status_str >", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrGreaterThanOrEqualTo(String value) {
            addCriterion("status_str >=", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrLessThan(String value) {
            addCriterion("status_str <", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrLessThanOrEqualTo(String value) {
            addCriterion("status_str <=", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrLike(String value) {
            addCriterion("status_str like", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotLike(String value) {
            addCriterion("status_str not like", value, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrIn(List<String> values) {
            addCriterion("status_str in", values, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotIn(List<String> values) {
            addCriterion("status_str not in", values, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrBetween(String value1, String value2) {
            addCriterion("status_str between", value1, value2, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusStrNotBetween(String value1, String value2) {
            addCriterion("status_str not between", value1, value2, "statusStr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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