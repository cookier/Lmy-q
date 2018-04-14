package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataQrcodeCalcuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataQrcodeCalcuExample() {
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

        public Criteria andScanTimesIsNull() {
            addCriterion("scan_times is null");
            return (Criteria) this;
        }

        public Criteria andScanTimesIsNotNull() {
            addCriterion("scan_times is not null");
            return (Criteria) this;
        }

        public Criteria andScanTimesEqualTo(Integer value) {
            addCriterion("scan_times =", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesNotEqualTo(Integer value) {
            addCriterion("scan_times <>", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesGreaterThan(Integer value) {
            addCriterion("scan_times >", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("scan_times >=", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesLessThan(Integer value) {
            addCriterion("scan_times <", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesLessThanOrEqualTo(Integer value) {
            addCriterion("scan_times <=", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesIn(List<Integer> values) {
            addCriterion("scan_times in", values, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesNotIn(List<Integer> values) {
            addCriterion("scan_times not in", values, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesBetween(Integer value1, Integer value2) {
            addCriterion("scan_times between", value1, value2, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("scan_times not between", value1, value2, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanPersonsIsNull() {
            addCriterion("scan_persons is null");
            return (Criteria) this;
        }

        public Criteria andScanPersonsIsNotNull() {
            addCriterion("scan_persons is not null");
            return (Criteria) this;
        }

        public Criteria andScanPersonsEqualTo(Integer value) {
            addCriterion("scan_persons =", value, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsNotEqualTo(Integer value) {
            addCriterion("scan_persons <>", value, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsGreaterThan(Integer value) {
            addCriterion("scan_persons >", value, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("scan_persons >=", value, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsLessThan(Integer value) {
            addCriterion("scan_persons <", value, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsLessThanOrEqualTo(Integer value) {
            addCriterion("scan_persons <=", value, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsIn(List<Integer> values) {
            addCriterion("scan_persons in", values, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsNotIn(List<Integer> values) {
            addCriterion("scan_persons not in", values, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsBetween(Integer value1, Integer value2) {
            addCriterion("scan_persons between", value1, value2, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andScanPersonsNotBetween(Integer value1, Integer value2) {
            addCriterion("scan_persons not between", value1, value2, "scanPersons");
            return (Criteria) this;
        }

        public Criteria andAddedFansIsNull() {
            addCriterion("added_fans is null");
            return (Criteria) this;
        }

        public Criteria andAddedFansIsNotNull() {
            addCriterion("added_fans is not null");
            return (Criteria) this;
        }

        public Criteria andAddedFansEqualTo(Integer value) {
            addCriterion("added_fans =", value, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansNotEqualTo(Integer value) {
            addCriterion("added_fans <>", value, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansGreaterThan(Integer value) {
            addCriterion("added_fans >", value, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("added_fans >=", value, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansLessThan(Integer value) {
            addCriterion("added_fans <", value, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansLessThanOrEqualTo(Integer value) {
            addCriterion("added_fans <=", value, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansIn(List<Integer> values) {
            addCriterion("added_fans in", values, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansNotIn(List<Integer> values) {
            addCriterion("added_fans not in", values, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansBetween(Integer value1, Integer value2) {
            addCriterion("added_fans between", value1, value2, "addedFans");
            return (Criteria) this;
        }

        public Criteria andAddedFansNotBetween(Integer value1, Integer value2) {
            addCriterion("added_fans not between", value1, value2, "addedFans");
            return (Criteria) this;
        }

        public Criteria andBrowserUvIsNull() {
            addCriterion("browser_uv is null");
            return (Criteria) this;
        }

        public Criteria andBrowserUvIsNotNull() {
            addCriterion("browser_uv is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserUvEqualTo(Integer value) {
            addCriterion("browser_uv =", value, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvNotEqualTo(Integer value) {
            addCriterion("browser_uv <>", value, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvGreaterThan(Integer value) {
            addCriterion("browser_uv >", value, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("browser_uv >=", value, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvLessThan(Integer value) {
            addCriterion("browser_uv <", value, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvLessThanOrEqualTo(Integer value) {
            addCriterion("browser_uv <=", value, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvIn(List<Integer> values) {
            addCriterion("browser_uv in", values, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvNotIn(List<Integer> values) {
            addCriterion("browser_uv not in", values, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvBetween(Integer value1, Integer value2) {
            addCriterion("browser_uv between", value1, value2, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserUvNotBetween(Integer value1, Integer value2) {
            addCriterion("browser_uv not between", value1, value2, "browserUv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvIsNull() {
            addCriterion("browser_pv is null");
            return (Criteria) this;
        }

        public Criteria andBrowserPvIsNotNull() {
            addCriterion("browser_pv is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserPvEqualTo(Integer value) {
            addCriterion("browser_pv =", value, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvNotEqualTo(Integer value) {
            addCriterion("browser_pv <>", value, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvGreaterThan(Integer value) {
            addCriterion("browser_pv >", value, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("browser_pv >=", value, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvLessThan(Integer value) {
            addCriterion("browser_pv <", value, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvLessThanOrEqualTo(Integer value) {
            addCriterion("browser_pv <=", value, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvIn(List<Integer> values) {
            addCriterion("browser_pv in", values, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvNotIn(List<Integer> values) {
            addCriterion("browser_pv not in", values, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvBetween(Integer value1, Integer value2) {
            addCriterion("browser_pv between", value1, value2, "browserPv");
            return (Criteria) this;
        }

        public Criteria andBrowserPvNotBetween(Integer value1, Integer value2) {
            addCriterion("browser_pv not between", value1, value2, "browserPv");
            return (Criteria) this;
        }

        public Criteria andAddTagIsNull() {
            addCriterion("add_tag is null");
            return (Criteria) this;
        }

        public Criteria andAddTagIsNotNull() {
            addCriterion("add_tag is not null");
            return (Criteria) this;
        }

        public Criteria andAddTagEqualTo(Integer value) {
            addCriterion("add_tag =", value, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagNotEqualTo(Integer value) {
            addCriterion("add_tag <>", value, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagGreaterThan(Integer value) {
            addCriterion("add_tag >", value, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_tag >=", value, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagLessThan(Integer value) {
            addCriterion("add_tag <", value, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagLessThanOrEqualTo(Integer value) {
            addCriterion("add_tag <=", value, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagIn(List<Integer> values) {
            addCriterion("add_tag in", values, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagNotIn(List<Integer> values) {
            addCriterion("add_tag not in", values, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagBetween(Integer value1, Integer value2) {
            addCriterion("add_tag between", value1, value2, "addTag");
            return (Criteria) this;
        }

        public Criteria andAddTagNotBetween(Integer value1, Integer value2) {
            addCriterion("add_tag not between", value1, value2, "addTag");
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

        public Criteria andPayPersonsIsNull() {
            addCriterion("pay_persons is null");
            return (Criteria) this;
        }

        public Criteria andPayPersonsIsNotNull() {
            addCriterion("pay_persons is not null");
            return (Criteria) this;
        }

        public Criteria andPayPersonsEqualTo(Integer value) {
            addCriterion("pay_persons =", value, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsNotEqualTo(Integer value) {
            addCriterion("pay_persons <>", value, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsGreaterThan(Integer value) {
            addCriterion("pay_persons >", value, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_persons >=", value, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsLessThan(Integer value) {
            addCriterion("pay_persons <", value, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsLessThanOrEqualTo(Integer value) {
            addCriterion("pay_persons <=", value, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsIn(List<Integer> values) {
            addCriterion("pay_persons in", values, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsNotIn(List<Integer> values) {
            addCriterion("pay_persons not in", values, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsBetween(Integer value1, Integer value2) {
            addCriterion("pay_persons between", value1, value2, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayPersonsNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_persons not between", value1, value2, "payPersons");
            return (Criteria) this;
        }

        public Criteria andPayOrdersIsNull() {
            addCriterion("pay_orders is null");
            return (Criteria) this;
        }

        public Criteria andPayOrdersIsNotNull() {
            addCriterion("pay_orders is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrdersEqualTo(Integer value) {
            addCriterion("pay_orders =", value, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersNotEqualTo(Integer value) {
            addCriterion("pay_orders <>", value, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersGreaterThan(Integer value) {
            addCriterion("pay_orders >", value, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_orders >=", value, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersLessThan(Integer value) {
            addCriterion("pay_orders <", value, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("pay_orders <=", value, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersIn(List<Integer> values) {
            addCriterion("pay_orders in", values, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersNotIn(List<Integer> values) {
            addCriterion("pay_orders not in", values, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersBetween(Integer value1, Integer value2) {
            addCriterion("pay_orders between", value1, value2, "payOrders");
            return (Criteria) this;
        }

        public Criteria andPayOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_orders not between", value1, value2, "payOrders");
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

        public Criteria andPayGoodsIsNull() {
            addCriterion("pay_goods is null");
            return (Criteria) this;
        }

        public Criteria andPayGoodsIsNotNull() {
            addCriterion("pay_goods is not null");
            return (Criteria) this;
        }

        public Criteria andPayGoodsEqualTo(Integer value) {
            addCriterion("pay_goods =", value, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsNotEqualTo(Integer value) {
            addCriterion("pay_goods <>", value, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsGreaterThan(Integer value) {
            addCriterion("pay_goods >", value, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_goods >=", value, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsLessThan(Integer value) {
            addCriterion("pay_goods <", value, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("pay_goods <=", value, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsIn(List<Integer> values) {
            addCriterion("pay_goods in", values, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsNotIn(List<Integer> values) {
            addCriterion("pay_goods not in", values, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsBetween(Integer value1, Integer value2) {
            addCriterion("pay_goods between", value1, value2, "payGoods");
            return (Criteria) this;
        }

        public Criteria andPayGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_goods not between", value1, value2, "payGoods");
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

        public Criteria andFansNewIsNull() {
            addCriterion("fans_new is null");
            return (Criteria) this;
        }

        public Criteria andFansNewIsNotNull() {
            addCriterion("fans_new is not null");
            return (Criteria) this;
        }

        public Criteria andFansNewEqualTo(Integer value) {
            addCriterion("fans_new =", value, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewNotEqualTo(Integer value) {
            addCriterion("fans_new <>", value, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewGreaterThan(Integer value) {
            addCriterion("fans_new >", value, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_new >=", value, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewLessThan(Integer value) {
            addCriterion("fans_new <", value, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewLessThanOrEqualTo(Integer value) {
            addCriterion("fans_new <=", value, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewIn(List<Integer> values) {
            addCriterion("fans_new in", values, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewNotIn(List<Integer> values) {
            addCriterion("fans_new not in", values, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewBetween(Integer value1, Integer value2) {
            addCriterion("fans_new between", value1, value2, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansNewNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_new not between", value1, value2, "fansNew");
            return (Criteria) this;
        }

        public Criteria andFansOldIsNull() {
            addCriterion("fans_old is null");
            return (Criteria) this;
        }

        public Criteria andFansOldIsNotNull() {
            addCriterion("fans_old is not null");
            return (Criteria) this;
        }

        public Criteria andFansOldEqualTo(Integer value) {
            addCriterion("fans_old =", value, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldNotEqualTo(Integer value) {
            addCriterion("fans_old <>", value, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldGreaterThan(Integer value) {
            addCriterion("fans_old >", value, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_old >=", value, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldLessThan(Integer value) {
            addCriterion("fans_old <", value, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldLessThanOrEqualTo(Integer value) {
            addCriterion("fans_old <=", value, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldIn(List<Integer> values) {
            addCriterion("fans_old in", values, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldNotIn(List<Integer> values) {
            addCriterion("fans_old not in", values, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldBetween(Integer value1, Integer value2) {
            addCriterion("fans_old between", value1, value2, "fansOld");
            return (Criteria) this;
        }

        public Criteria andFansOldNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_old not between", value1, value2, "fansOld");
            return (Criteria) this;
        }

        public Criteria andQrcode1IsNull() {
            addCriterion("qrcode_1 is null");
            return (Criteria) this;
        }

        public Criteria andQrcode1IsNotNull() {
            addCriterion("qrcode_1 is not null");
            return (Criteria) this;
        }

        public Criteria andQrcode1EqualTo(Integer value) {
            addCriterion("qrcode_1 =", value, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1NotEqualTo(Integer value) {
            addCriterion("qrcode_1 <>", value, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1GreaterThan(Integer value) {
            addCriterion("qrcode_1 >", value, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1GreaterThanOrEqualTo(Integer value) {
            addCriterion("qrcode_1 >=", value, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1LessThan(Integer value) {
            addCriterion("qrcode_1 <", value, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1LessThanOrEqualTo(Integer value) {
            addCriterion("qrcode_1 <=", value, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1In(List<Integer> values) {
            addCriterion("qrcode_1 in", values, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1NotIn(List<Integer> values) {
            addCriterion("qrcode_1 not in", values, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1Between(Integer value1, Integer value2) {
            addCriterion("qrcode_1 between", value1, value2, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode1NotBetween(Integer value1, Integer value2) {
            addCriterion("qrcode_1 not between", value1, value2, "qrcode1");
            return (Criteria) this;
        }

        public Criteria andQrcode2IsNull() {
            addCriterion("qrcode_2 is null");
            return (Criteria) this;
        }

        public Criteria andQrcode2IsNotNull() {
            addCriterion("qrcode_2 is not null");
            return (Criteria) this;
        }

        public Criteria andQrcode2EqualTo(Integer value) {
            addCriterion("qrcode_2 =", value, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2NotEqualTo(Integer value) {
            addCriterion("qrcode_2 <>", value, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2GreaterThan(Integer value) {
            addCriterion("qrcode_2 >", value, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2GreaterThanOrEqualTo(Integer value) {
            addCriterion("qrcode_2 >=", value, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2LessThan(Integer value) {
            addCriterion("qrcode_2 <", value, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2LessThanOrEqualTo(Integer value) {
            addCriterion("qrcode_2 <=", value, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2In(List<Integer> values) {
            addCriterion("qrcode_2 in", values, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2NotIn(List<Integer> values) {
            addCriterion("qrcode_2 not in", values, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2Between(Integer value1, Integer value2) {
            addCriterion("qrcode_2 between", value1, value2, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode2NotBetween(Integer value1, Integer value2) {
            addCriterion("qrcode_2 not between", value1, value2, "qrcode2");
            return (Criteria) this;
        }

        public Criteria andQrcode3IsNull() {
            addCriterion("qrcode_3 is null");
            return (Criteria) this;
        }

        public Criteria andQrcode3IsNotNull() {
            addCriterion("qrcode_3 is not null");
            return (Criteria) this;
        }

        public Criteria andQrcode3EqualTo(Integer value) {
            addCriterion("qrcode_3 =", value, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3NotEqualTo(Integer value) {
            addCriterion("qrcode_3 <>", value, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3GreaterThan(Integer value) {
            addCriterion("qrcode_3 >", value, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3GreaterThanOrEqualTo(Integer value) {
            addCriterion("qrcode_3 >=", value, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3LessThan(Integer value) {
            addCriterion("qrcode_3 <", value, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3LessThanOrEqualTo(Integer value) {
            addCriterion("qrcode_3 <=", value, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3In(List<Integer> values) {
            addCriterion("qrcode_3 in", values, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3NotIn(List<Integer> values) {
            addCriterion("qrcode_3 not in", values, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3Between(Integer value1, Integer value2) {
            addCriterion("qrcode_3 between", value1, value2, "qrcode3");
            return (Criteria) this;
        }

        public Criteria andQrcode3NotBetween(Integer value1, Integer value2) {
            addCriterion("qrcode_3 not between", value1, value2, "qrcode3");
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