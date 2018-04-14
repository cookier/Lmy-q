package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.List;

public class PayConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayConfigExample() {
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

        public Criteria andPayPlugingIdIsNull() {
            addCriterion("pay_pluging_id is null");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdIsNotNull() {
            addCriterion("pay_pluging_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdEqualTo(Integer value) {
            addCriterion("pay_pluging_id =", value, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdNotEqualTo(Integer value) {
            addCriterion("pay_pluging_id <>", value, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdGreaterThan(Integer value) {
            addCriterion("pay_pluging_id >", value, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_pluging_id >=", value, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdLessThan(Integer value) {
            addCriterion("pay_pluging_id <", value, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_pluging_id <=", value, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdIn(List<Integer> values) {
            addCriterion("pay_pluging_id in", values, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdNotIn(List<Integer> values) {
            addCriterion("pay_pluging_id not in", values, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_pluging_id between", value1, value2, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPayPlugingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_pluging_id not between", value1, value2, "payPlugingId");
            return (Criteria) this;
        }

        public Criteria andPoundageIsNull() {
            addCriterion("poundage is null");
            return (Criteria) this;
        }

        public Criteria andPoundageIsNotNull() {
            addCriterion("poundage is not null");
            return (Criteria) this;
        }

        public Criteria andPoundageEqualTo(Double value) {
            addCriterion("poundage =", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotEqualTo(Double value) {
            addCriterion("poundage <>", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageGreaterThan(Double value) {
            addCriterion("poundage >", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageGreaterThanOrEqualTo(Double value) {
            addCriterion("poundage >=", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageLessThan(Double value) {
            addCriterion("poundage <", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageLessThanOrEqualTo(Double value) {
            addCriterion("poundage <=", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageIn(List<Double> values) {
            addCriterion("poundage in", values, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotIn(List<Double> values) {
            addCriterion("poundage not in", values, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageBetween(Double value1, Double value2) {
            addCriterion("poundage between", value1, value2, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotBetween(Double value1, Double value2) {
            addCriterion("poundage not between", value1, value2, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeIsNull() {
            addCriterion("poundage_type is null");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeIsNotNull() {
            addCriterion("poundage_type is not null");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeEqualTo(Integer value) {
            addCriterion("poundage_type =", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeNotEqualTo(Integer value) {
            addCriterion("poundage_type <>", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeGreaterThan(Integer value) {
            addCriterion("poundage_type >", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("poundage_type >=", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeLessThan(Integer value) {
            addCriterion("poundage_type <", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("poundage_type <=", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeIn(List<Integer> values) {
            addCriterion("poundage_type in", values, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeNotIn(List<Integer> values) {
            addCriterion("poundage_type not in", values, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeBetween(Integer value1, Integer value2) {
            addCriterion("poundage_type between", value1, value2, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("poundage_type not between", value1, value2, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(Integer value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(Integer value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(Integer value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(Integer value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<Integer> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<Integer> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyIsNull() {
            addCriterion("partner_key is null");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyIsNotNull() {
            addCriterion("partner_key is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyEqualTo(String value) {
            addCriterion("partner_key =", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotEqualTo(String value) {
            addCriterion("partner_key <>", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyGreaterThan(String value) {
            addCriterion("partner_key >", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyGreaterThanOrEqualTo(String value) {
            addCriterion("partner_key >=", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyLessThan(String value) {
            addCriterion("partner_key <", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyLessThanOrEqualTo(String value) {
            addCriterion("partner_key <=", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyLike(String value) {
            addCriterion("partner_key like", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotLike(String value) {
            addCriterion("partner_key not like", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyIn(List<String> values) {
            addCriterion("partner_key in", values, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotIn(List<String> values) {
            addCriterion("partner_key not in", values, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyBetween(String value1, String value2) {
            addCriterion("partner_key between", value1, value2, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotBetween(String value1, String value2) {
            addCriterion("partner_key not between", value1, value2, "partnerKey");
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