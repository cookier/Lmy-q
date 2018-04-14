package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSafeLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSafeLogExample() {
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

        public Criteria andFeedbackIsNull() {
            addCriterion("feedback is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNotNull() {
            addCriterion("feedback is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackEqualTo(String value) {
            addCriterion("feedback =", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotEqualTo(String value) {
            addCriterion("feedback <>", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThan(String value) {
            addCriterion("feedback >", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("feedback >=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThan(String value) {
            addCriterion("feedback <", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThanOrEqualTo(String value) {
            addCriterion("feedback <=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLike(String value) {
            addCriterion("feedback like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotLike(String value) {
            addCriterion("feedback not like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackIn(List<String> values) {
            addCriterion("feedback in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotIn(List<String> values) {
            addCriterion("feedback not in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackBetween(String value1, String value2) {
            addCriterion("feedback between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotBetween(String value1, String value2) {
            addCriterion("feedback not between", value1, value2, "feedback");
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

        public Criteria andExplainsIsNull() {
            addCriterion("explains is null");
            return (Criteria) this;
        }

        public Criteria andExplainsIsNotNull() {
            addCriterion("explains is not null");
            return (Criteria) this;
        }

        public Criteria andExplainsEqualTo(String value) {
            addCriterion("explains =", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotEqualTo(String value) {
            addCriterion("explains <>", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThan(String value) {
            addCriterion("explains >", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThanOrEqualTo(String value) {
            addCriterion("explains >=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThan(String value) {
            addCriterion("explains <", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThanOrEqualTo(String value) {
            addCriterion("explains <=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLike(String value) {
            addCriterion("explains like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotLike(String value) {
            addCriterion("explains not like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsIn(List<String> values) {
            addCriterion("explains in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotIn(List<String> values) {
            addCriterion("explains not in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsBetween(String value1, String value2) {
            addCriterion("explains between", value1, value2, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotBetween(String value1, String value2) {
            addCriterion("explains not between", value1, value2, "explains");
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

        public Criteria andRealPayIsNull() {
            addCriterion("real_pay is null");
            return (Criteria) this;
        }

        public Criteria andRealPayIsNotNull() {
            addCriterion("real_pay is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayEqualTo(Double value) {
            addCriterion("real_pay =", value, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayNotEqualTo(Double value) {
            addCriterion("real_pay <>", value, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayGreaterThan(Double value) {
            addCriterion("real_pay >", value, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayGreaterThanOrEqualTo(Double value) {
            addCriterion("real_pay >=", value, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayLessThan(Double value) {
            addCriterion("real_pay <", value, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayLessThanOrEqualTo(Double value) {
            addCriterion("real_pay <=", value, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayIn(List<Double> values) {
            addCriterion("real_pay in", values, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayNotIn(List<Double> values) {
            addCriterion("real_pay not in", values, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayBetween(Double value1, Double value2) {
            addCriterion("real_pay between", value1, value2, "realPay");
            return (Criteria) this;
        }

        public Criteria andRealPayNotBetween(Double value1, Double value2) {
            addCriterion("real_pay not between", value1, value2, "realPay");
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