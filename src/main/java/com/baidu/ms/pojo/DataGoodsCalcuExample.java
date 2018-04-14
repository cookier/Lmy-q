package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataGoodsCalcuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataGoodsCalcuExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
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

        public Criteria andExportUvIsNull() {
            addCriterion("export_uv is null");
            return (Criteria) this;
        }

        public Criteria andExportUvIsNotNull() {
            addCriterion("export_uv is not null");
            return (Criteria) this;
        }

        public Criteria andExportUvEqualTo(Integer value) {
            addCriterion("export_uv =", value, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvNotEqualTo(Integer value) {
            addCriterion("export_uv <>", value, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvGreaterThan(Integer value) {
            addCriterion("export_uv >", value, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("export_uv >=", value, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvLessThan(Integer value) {
            addCriterion("export_uv <", value, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvLessThanOrEqualTo(Integer value) {
            addCriterion("export_uv <=", value, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvIn(List<Integer> values) {
            addCriterion("export_uv in", values, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvNotIn(List<Integer> values) {
            addCriterion("export_uv not in", values, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvBetween(Integer value1, Integer value2) {
            addCriterion("export_uv between", value1, value2, "exportUv");
            return (Criteria) this;
        }

        public Criteria andExportUvNotBetween(Integer value1, Integer value2) {
            addCriterion("export_uv not between", value1, value2, "exportUv");
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

        public Criteria andClickBuyIsNull() {
            addCriterion("click_buy is null");
            return (Criteria) this;
        }

        public Criteria andClickBuyIsNotNull() {
            addCriterion("click_buy is not null");
            return (Criteria) this;
        }

        public Criteria andClickBuyEqualTo(Integer value) {
            addCriterion("click_buy =", value, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyNotEqualTo(Integer value) {
            addCriterion("click_buy <>", value, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyGreaterThan(Integer value) {
            addCriterion("click_buy >", value, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_buy >=", value, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyLessThan(Integer value) {
            addCriterion("click_buy <", value, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyLessThanOrEqualTo(Integer value) {
            addCriterion("click_buy <=", value, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyIn(List<Integer> values) {
            addCriterion("click_buy in", values, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyNotIn(List<Integer> values) {
            addCriterion("click_buy not in", values, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyBetween(Integer value1, Integer value2) {
            addCriterion("click_buy between", value1, value2, "clickBuy");
            return (Criteria) this;
        }

        public Criteria andClickBuyNotBetween(Integer value1, Integer value2) {
            addCriterion("click_buy not between", value1, value2, "clickBuy");
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