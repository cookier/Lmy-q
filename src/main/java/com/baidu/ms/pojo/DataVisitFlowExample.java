package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataVisitFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataVisitFlowExample() {
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

        public Criteria andInsideUvIsNull() {
            addCriterion("inside_uv is null");
            return (Criteria) this;
        }

        public Criteria andInsideUvIsNotNull() {
            addCriterion("inside_uv is not null");
            return (Criteria) this;
        }

        public Criteria andInsideUvEqualTo(Integer value) {
            addCriterion("inside_uv =", value, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvNotEqualTo(Integer value) {
            addCriterion("inside_uv <>", value, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvGreaterThan(Integer value) {
            addCriterion("inside_uv >", value, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("inside_uv >=", value, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvLessThan(Integer value) {
            addCriterion("inside_uv <", value, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvLessThanOrEqualTo(Integer value) {
            addCriterion("inside_uv <=", value, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvIn(List<Integer> values) {
            addCriterion("inside_uv in", values, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvNotIn(List<Integer> values) {
            addCriterion("inside_uv not in", values, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvBetween(Integer value1, Integer value2) {
            addCriterion("inside_uv between", value1, value2, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsideUvNotBetween(Integer value1, Integer value2) {
            addCriterion("inside_uv not between", value1, value2, "insideUv");
            return (Criteria) this;
        }

        public Criteria andInsidePvIsNull() {
            addCriterion("inside_pv is null");
            return (Criteria) this;
        }

        public Criteria andInsidePvIsNotNull() {
            addCriterion("inside_pv is not null");
            return (Criteria) this;
        }

        public Criteria andInsidePvEqualTo(Integer value) {
            addCriterion("inside_pv =", value, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvNotEqualTo(Integer value) {
            addCriterion("inside_pv <>", value, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvGreaterThan(Integer value) {
            addCriterion("inside_pv >", value, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvGreaterThanOrEqualTo(Integer value) {
            addCriterion("inside_pv >=", value, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvLessThan(Integer value) {
            addCriterion("inside_pv <", value, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvLessThanOrEqualTo(Integer value) {
            addCriterion("inside_pv <=", value, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvIn(List<Integer> values) {
            addCriterion("inside_pv in", values, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvNotIn(List<Integer> values) {
            addCriterion("inside_pv not in", values, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvBetween(Integer value1, Integer value2) {
            addCriterion("inside_pv between", value1, value2, "insidePv");
            return (Criteria) this;
        }

        public Criteria andInsidePvNotBetween(Integer value1, Integer value2) {
            addCriterion("inside_pv not between", value1, value2, "insidePv");
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

        public Criteria andShareUvIsNull() {
            addCriterion("share_uv is null");
            return (Criteria) this;
        }

        public Criteria andShareUvIsNotNull() {
            addCriterion("share_uv is not null");
            return (Criteria) this;
        }

        public Criteria andShareUvEqualTo(Integer value) {
            addCriterion("share_uv =", value, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvNotEqualTo(Integer value) {
            addCriterion("share_uv <>", value, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvGreaterThan(Integer value) {
            addCriterion("share_uv >", value, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_uv >=", value, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvLessThan(Integer value) {
            addCriterion("share_uv <", value, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvLessThanOrEqualTo(Integer value) {
            addCriterion("share_uv <=", value, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvIn(List<Integer> values) {
            addCriterion("share_uv in", values, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvNotIn(List<Integer> values) {
            addCriterion("share_uv not in", values, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvBetween(Integer value1, Integer value2) {
            addCriterion("share_uv between", value1, value2, "shareUv");
            return (Criteria) this;
        }

        public Criteria andShareUvNotBetween(Integer value1, Integer value2) {
            addCriterion("share_uv not between", value1, value2, "shareUv");
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

        public Criteria andReachPvIsNull() {
            addCriterion("reach_pv is null");
            return (Criteria) this;
        }

        public Criteria andReachPvIsNotNull() {
            addCriterion("reach_pv is not null");
            return (Criteria) this;
        }

        public Criteria andReachPvEqualTo(Integer value) {
            addCriterion("reach_pv =", value, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvNotEqualTo(Integer value) {
            addCriterion("reach_pv <>", value, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvGreaterThan(Integer value) {
            addCriterion("reach_pv >", value, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("reach_pv >=", value, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvLessThan(Integer value) {
            addCriterion("reach_pv <", value, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvLessThanOrEqualTo(Integer value) {
            addCriterion("reach_pv <=", value, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvIn(List<Integer> values) {
            addCriterion("reach_pv in", values, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvNotIn(List<Integer> values) {
            addCriterion("reach_pv not in", values, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvBetween(Integer value1, Integer value2) {
            addCriterion("reach_pv between", value1, value2, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachPvNotBetween(Integer value1, Integer value2) {
            addCriterion("reach_pv not between", value1, value2, "reachPv");
            return (Criteria) this;
        }

        public Criteria andReachUvIsNull() {
            addCriterion("reach_uv is null");
            return (Criteria) this;
        }

        public Criteria andReachUvIsNotNull() {
            addCriterion("reach_uv is not null");
            return (Criteria) this;
        }

        public Criteria andReachUvEqualTo(Integer value) {
            addCriterion("reach_uv =", value, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvNotEqualTo(Integer value) {
            addCriterion("reach_uv <>", value, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvGreaterThan(Integer value) {
            addCriterion("reach_uv >", value, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("reach_uv >=", value, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvLessThan(Integer value) {
            addCriterion("reach_uv <", value, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvLessThanOrEqualTo(Integer value) {
            addCriterion("reach_uv <=", value, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvIn(List<Integer> values) {
            addCriterion("reach_uv in", values, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvNotIn(List<Integer> values) {
            addCriterion("reach_uv not in", values, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvBetween(Integer value1, Integer value2) {
            addCriterion("reach_uv between", value1, value2, "reachUv");
            return (Criteria) this;
        }

        public Criteria andReachUvNotBetween(Integer value1, Integer value2) {
            addCriterion("reach_uv not between", value1, value2, "reachUv");
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