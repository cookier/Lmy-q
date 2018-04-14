package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataTrendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataTrendExample() {
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

        public Criteria andPageNameIsNull() {
            addCriterion("page_name is null");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNotNull() {
            addCriterion("page_name is not null");
            return (Criteria) this;
        }

        public Criteria andPageNameEqualTo(String value) {
            addCriterion("page_name =", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotEqualTo(String value) {
            addCriterion("page_name <>", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThan(String value) {
            addCriterion("page_name >", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("page_name >=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThan(String value) {
            addCriterion("page_name <", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThanOrEqualTo(String value) {
            addCriterion("page_name <=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLike(String value) {
            addCriterion("page_name like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotLike(String value) {
            addCriterion("page_name not like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameIn(List<String> values) {
            addCriterion("page_name in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotIn(List<String> values) {
            addCriterion("page_name not in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameBetween(String value1, String value2) {
            addCriterion("page_name between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotBetween(String value1, String value2) {
            addCriterion("page_name not between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNull() {
            addCriterion("page_url is null");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNotNull() {
            addCriterion("page_url is not null");
            return (Criteria) this;
        }

        public Criteria andPageUrlEqualTo(String value) {
            addCriterion("page_url =", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotEqualTo(String value) {
            addCriterion("page_url <>", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThan(String value) {
            addCriterion("page_url >", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("page_url >=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThan(String value) {
            addCriterion("page_url <", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThanOrEqualTo(String value) {
            addCriterion("page_url <=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLike(String value) {
            addCriterion("page_url like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotLike(String value) {
            addCriterion("page_url not like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlIn(List<String> values) {
            addCriterion("page_url in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotIn(List<String> values) {
            addCriterion("page_url not in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlBetween(String value1, String value2) {
            addCriterion("page_url between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotBetween(String value1, String value2) {
            addCriterion("page_url not between", value1, value2, "pageUrl");
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