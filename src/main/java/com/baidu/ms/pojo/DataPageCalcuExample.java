package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataPageCalcuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataPageCalcuExample() {
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

        public Criteria andSharePvIsNull() {
            addCriterion("share_pv is null");
            return (Criteria) this;
        }

        public Criteria andSharePvIsNotNull() {
            addCriterion("share_pv is not null");
            return (Criteria) this;
        }

        public Criteria andSharePvEqualTo(Integer value) {
            addCriterion("share_pv =", value, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvNotEqualTo(Integer value) {
            addCriterion("share_pv <>", value, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvGreaterThan(Integer value) {
            addCriterion("share_pv >", value, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_pv >=", value, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvLessThan(Integer value) {
            addCriterion("share_pv <", value, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvLessThanOrEqualTo(Integer value) {
            addCriterion("share_pv <=", value, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvIn(List<Integer> values) {
            addCriterion("share_pv in", values, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvNotIn(List<Integer> values) {
            addCriterion("share_pv not in", values, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvBetween(Integer value1, Integer value2) {
            addCriterion("share_pv between", value1, value2, "sharePv");
            return (Criteria) this;
        }

        public Criteria andSharePvNotBetween(Integer value1, Integer value2) {
            addCriterion("share_pv not between", value1, value2, "sharePv");
            return (Criteria) this;
        }

        public Criteria andExportPvIsNull() {
            addCriterion("export_pv is null");
            return (Criteria) this;
        }

        public Criteria andExportPvIsNotNull() {
            addCriterion("export_pv is not null");
            return (Criteria) this;
        }

        public Criteria andExportPvEqualTo(Integer value) {
            addCriterion("export_pv =", value, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvNotEqualTo(Integer value) {
            addCriterion("export_pv <>", value, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvGreaterThan(Integer value) {
            addCriterion("export_pv >", value, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("export_pv >=", value, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvLessThan(Integer value) {
            addCriterion("export_pv <", value, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvLessThanOrEqualTo(Integer value) {
            addCriterion("export_pv <=", value, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvIn(List<Integer> values) {
            addCriterion("export_pv in", values, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvNotIn(List<Integer> values) {
            addCriterion("export_pv not in", values, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvBetween(Integer value1, Integer value2) {
            addCriterion("export_pv between", value1, value2, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExportPvNotBetween(Integer value1, Integer value2) {
            addCriterion("export_pv not between", value1, value2, "exportPv");
            return (Criteria) this;
        }

        public Criteria andExposureIsNull() {
            addCriterion("exposure is null");
            return (Criteria) this;
        }

        public Criteria andExposureIsNotNull() {
            addCriterion("exposure is not null");
            return (Criteria) this;
        }

        public Criteria andExposureEqualTo(Integer value) {
            addCriterion("exposure =", value, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureNotEqualTo(Integer value) {
            addCriterion("exposure <>", value, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureGreaterThan(Integer value) {
            addCriterion("exposure >", value, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureGreaterThanOrEqualTo(Integer value) {
            addCriterion("exposure >=", value, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureLessThan(Integer value) {
            addCriterion("exposure <", value, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureLessThanOrEqualTo(Integer value) {
            addCriterion("exposure <=", value, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureIn(List<Integer> values) {
            addCriterion("exposure in", values, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureNotIn(List<Integer> values) {
            addCriterion("exposure not in", values, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureBetween(Integer value1, Integer value2) {
            addCriterion("exposure between", value1, value2, "exposure");
            return (Criteria) this;
        }

        public Criteria andExposureNotBetween(Integer value1, Integer value2) {
            addCriterion("exposure not between", value1, value2, "exposure");
            return (Criteria) this;
        }

        public Criteria andMeanDepthIsNull() {
            addCriterion("mean_depth is null");
            return (Criteria) this;
        }

        public Criteria andMeanDepthIsNotNull() {
            addCriterion("mean_depth is not null");
            return (Criteria) this;
        }

        public Criteria andMeanDepthEqualTo(Integer value) {
            addCriterion("mean_depth =", value, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthNotEqualTo(Integer value) {
            addCriterion("mean_depth <>", value, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthGreaterThan(Integer value) {
            addCriterion("mean_depth >", value, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("mean_depth >=", value, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthLessThan(Integer value) {
            addCriterion("mean_depth <", value, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthLessThanOrEqualTo(Integer value) {
            addCriterion("mean_depth <=", value, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthIn(List<Integer> values) {
            addCriterion("mean_depth in", values, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthNotIn(List<Integer> values) {
            addCriterion("mean_depth not in", values, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthBetween(Integer value1, Integer value2) {
            addCriterion("mean_depth between", value1, value2, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("mean_depth not between", value1, value2, "meanDepth");
            return (Criteria) this;
        }

        public Criteria andMeanTimeIsNull() {
            addCriterion("mean_time is null");
            return (Criteria) this;
        }

        public Criteria andMeanTimeIsNotNull() {
            addCriterion("mean_time is not null");
            return (Criteria) this;
        }

        public Criteria andMeanTimeEqualTo(Integer value) {
            addCriterion("mean_time =", value, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeNotEqualTo(Integer value) {
            addCriterion("mean_time <>", value, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeGreaterThan(Integer value) {
            addCriterion("mean_time >", value, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mean_time >=", value, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeLessThan(Integer value) {
            addCriterion("mean_time <", value, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeLessThanOrEqualTo(Integer value) {
            addCriterion("mean_time <=", value, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeIn(List<Integer> values) {
            addCriterion("mean_time in", values, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeNotIn(List<Integer> values) {
            addCriterion("mean_time not in", values, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeBetween(Integer value1, Integer value2) {
            addCriterion("mean_time between", value1, value2, "meanTime");
            return (Criteria) this;
        }

        public Criteria andMeanTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("mean_time not between", value1, value2, "meanTime");
            return (Criteria) this;
        }

        public Criteria andExposureReachIsNull() {
            addCriterion("exposure_reach is null");
            return (Criteria) this;
        }

        public Criteria andExposureReachIsNotNull() {
            addCriterion("exposure_reach is not null");
            return (Criteria) this;
        }

        public Criteria andExposureReachEqualTo(Integer value) {
            addCriterion("exposure_reach =", value, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachNotEqualTo(Integer value) {
            addCriterion("exposure_reach <>", value, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachGreaterThan(Integer value) {
            addCriterion("exposure_reach >", value, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachGreaterThanOrEqualTo(Integer value) {
            addCriterion("exposure_reach >=", value, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachLessThan(Integer value) {
            addCriterion("exposure_reach <", value, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachLessThanOrEqualTo(Integer value) {
            addCriterion("exposure_reach <=", value, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachIn(List<Integer> values) {
            addCriterion("exposure_reach in", values, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachNotIn(List<Integer> values) {
            addCriterion("exposure_reach not in", values, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachBetween(Integer value1, Integer value2) {
            addCriterion("exposure_reach between", value1, value2, "exposureReach");
            return (Criteria) this;
        }

        public Criteria andExposureReachNotBetween(Integer value1, Integer value2) {
            addCriterion("exposure_reach not between", value1, value2, "exposureReach");
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

        public Criteria andPayOrderIsNull() {
            addCriterion("pay_order is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIsNotNull() {
            addCriterion("pay_order is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderEqualTo(Integer value) {
            addCriterion("pay_order =", value, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderNotEqualTo(Integer value) {
            addCriterion("pay_order <>", value, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderGreaterThan(Integer value) {
            addCriterion("pay_order >", value, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_order >=", value, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderLessThan(Integer value) {
            addCriterion("pay_order <", value, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pay_order <=", value, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderIn(List<Integer> values) {
            addCriterion("pay_order in", values, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderNotIn(List<Integer> values) {
            addCriterion("pay_order not in", values, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderBetween(Integer value1, Integer value2) {
            addCriterion("pay_order between", value1, value2, "payOrder");
            return (Criteria) this;
        }

        public Criteria andPayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_order not between", value1, value2, "payOrder");
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