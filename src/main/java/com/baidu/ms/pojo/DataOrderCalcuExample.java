package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataOrderCalcuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataOrderCalcuExample() {
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

        public Criteria andVisitorCountIsNull() {
            addCriterion("visitor_count is null");
            return (Criteria) this;
        }

        public Criteria andVisitorCountIsNotNull() {
            addCriterion("visitor_count is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorCountEqualTo(Integer value) {
            addCriterion("visitor_count =", value, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountNotEqualTo(Integer value) {
            addCriterion("visitor_count <>", value, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountGreaterThan(Integer value) {
            addCriterion("visitor_count >", value, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitor_count >=", value, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountLessThan(Integer value) {
            addCriterion("visitor_count <", value, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountLessThanOrEqualTo(Integer value) {
            addCriterion("visitor_count <=", value, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountIn(List<Integer> values) {
            addCriterion("visitor_count in", values, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountNotIn(List<Integer> values) {
            addCriterion("visitor_count not in", values, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountBetween(Integer value1, Integer value2) {
            addCriterion("visitor_count between", value1, value2, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andVisitorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("visitor_count not between", value1, value2, "visitorCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountIsNull() {
            addCriterion("buyer_count is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCountIsNotNull() {
            addCriterion("buyer_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCountEqualTo(Integer value) {
            addCriterion("buyer_count =", value, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountNotEqualTo(Integer value) {
            addCriterion("buyer_count <>", value, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountGreaterThan(Integer value) {
            addCriterion("buyer_count >", value, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_count >=", value, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountLessThan(Integer value) {
            addCriterion("buyer_count <", value, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_count <=", value, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountIn(List<Integer> values) {
            addCriterion("buyer_count in", values, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountNotIn(List<Integer> values) {
            addCriterion("buyer_count not in", values, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountBetween(Integer value1, Integer value2) {
            addCriterion("buyer_count between", value1, value2, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andBuyerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_count not between", value1, value2, "buyerCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Double value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Double value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Double value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Double value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Double value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Double> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Double> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Double value1, Double value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Double value1, Double value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andPayerCountIsNull() {
            addCriterion("payer_count is null");
            return (Criteria) this;
        }

        public Criteria andPayerCountIsNotNull() {
            addCriterion("payer_count is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCountEqualTo(Integer value) {
            addCriterion("payer_count =", value, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountNotEqualTo(Integer value) {
            addCriterion("payer_count <>", value, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountGreaterThan(Integer value) {
            addCriterion("payer_count >", value, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("payer_count >=", value, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountLessThan(Integer value) {
            addCriterion("payer_count <", value, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountLessThanOrEqualTo(Integer value) {
            addCriterion("payer_count <=", value, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountIn(List<Integer> values) {
            addCriterion("payer_count in", values, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountNotIn(List<Integer> values) {
            addCriterion("payer_count not in", values, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountBetween(Integer value1, Integer value2) {
            addCriterion("payer_count between", value1, value2, "payerCount");
            return (Criteria) this;
        }

        public Criteria andPayerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("payer_count not between", value1, value2, "payerCount");
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

        public Criteria andGoodsSalesIsNull() {
            addCriterion("goods_sales is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNotNull() {
            addCriterion("goods_sales is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesEqualTo(Integer value) {
            addCriterion("goods_sales =", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotEqualTo(Integer value) {
            addCriterion("goods_sales <>", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThan(Integer value) {
            addCriterion("goods_sales >", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sales >=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThan(Integer value) {
            addCriterion("goods_sales <", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sales <=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIn(List<Integer> values) {
            addCriterion("goods_sales in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotIn(List<Integer> values) {
            addCriterion("goods_sales not in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales not between", value1, value2, "goodsSales");
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