package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andShowStockFlagIsNull() {
            addCriterion("show_stock_flag is null");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagIsNotNull() {
            addCriterion("show_stock_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagEqualTo(Integer value) {
            addCriterion("show_stock_flag =", value, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagNotEqualTo(Integer value) {
            addCriterion("show_stock_flag <>", value, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagGreaterThan(Integer value) {
            addCriterion("show_stock_flag >", value, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_stock_flag >=", value, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagLessThan(Integer value) {
            addCriterion("show_stock_flag <", value, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagLessThanOrEqualTo(Integer value) {
            addCriterion("show_stock_flag <=", value, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagIn(List<Integer> values) {
            addCriterion("show_stock_flag in", values, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagNotIn(List<Integer> values) {
            addCriterion("show_stock_flag not in", values, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagBetween(Integer value1, Integer value2) {
            addCriterion("show_stock_flag between", value1, value2, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andShowStockFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("show_stock_flag not between", value1, value2, "showStockFlag");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdIsNull() {
            addCriterion("default_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdIsNotNull() {
            addCriterion("default_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdEqualTo(Integer value) {
            addCriterion("default_pic_id =", value, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdNotEqualTo(Integer value) {
            addCriterion("default_pic_id <>", value, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdGreaterThan(Integer value) {
            addCriterion("default_pic_id >", value, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_pic_id >=", value, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdLessThan(Integer value) {
            addCriterion("default_pic_id <", value, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("default_pic_id <=", value, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdIn(List<Integer> values) {
            addCriterion("default_pic_id in", values, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdNotIn(List<Integer> values) {
            addCriterion("default_pic_id not in", values, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdBetween(Integer value1, Integer value2) {
            addCriterion("default_pic_id between", value1, value2, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("default_pic_id not between", value1, value2, "defaultPicId");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlIsNull() {
            addCriterion("default_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlIsNotNull() {
            addCriterion("default_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlEqualTo(String value) {
            addCriterion("default_pic_url =", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlNotEqualTo(String value) {
            addCriterion("default_pic_url <>", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlGreaterThan(String value) {
            addCriterion("default_pic_url >", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("default_pic_url >=", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlLessThan(String value) {
            addCriterion("default_pic_url <", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlLessThanOrEqualTo(String value) {
            addCriterion("default_pic_url <=", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlLike(String value) {
            addCriterion("default_pic_url like", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlNotLike(String value) {
            addCriterion("default_pic_url not like", value, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlIn(List<String> values) {
            addCriterion("default_pic_url in", values, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlNotIn(List<String> values) {
            addCriterion("default_pic_url not in", values, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlBetween(String value1, String value2) {
            addCriterion("default_pic_url between", value1, value2, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultPicUrlNotBetween(String value1, String value2) {
            addCriterion("default_pic_url not between", value1, value2, "defaultPicUrl");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceIsNull() {
            addCriterion("have_invoice is null");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceIsNotNull() {
            addCriterion("have_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceEqualTo(Integer value) {
            addCriterion("have_invoice =", value, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceNotEqualTo(Integer value) {
            addCriterion("have_invoice <>", value, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceGreaterThan(Integer value) {
            addCriterion("have_invoice >", value, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("have_invoice >=", value, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceLessThan(Integer value) {
            addCriterion("have_invoice <", value, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("have_invoice <=", value, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceIn(List<Integer> values) {
            addCriterion("have_invoice in", values, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceNotIn(List<Integer> values) {
            addCriterion("have_invoice not in", values, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("have_invoice between", value1, value2, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andHaveInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("have_invoice not between", value1, value2, "haveInvoice");
            return (Criteria) this;
        }

        public Criteria andCanRepairIsNull() {
            addCriterion("can_repair is null");
            return (Criteria) this;
        }

        public Criteria andCanRepairIsNotNull() {
            addCriterion("can_repair is not null");
            return (Criteria) this;
        }

        public Criteria andCanRepairEqualTo(Integer value) {
            addCriterion("can_repair =", value, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairNotEqualTo(Integer value) {
            addCriterion("can_repair <>", value, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairGreaterThan(Integer value) {
            addCriterion("can_repair >", value, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairGreaterThanOrEqualTo(Integer value) {
            addCriterion("can_repair >=", value, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairLessThan(Integer value) {
            addCriterion("can_repair <", value, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairLessThanOrEqualTo(Integer value) {
            addCriterion("can_repair <=", value, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairIn(List<Integer> values) {
            addCriterion("can_repair in", values, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairNotIn(List<Integer> values) {
            addCriterion("can_repair not in", values, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairBetween(Integer value1, Integer value2) {
            addCriterion("can_repair between", value1, value2, "canRepair");
            return (Criteria) this;
        }

        public Criteria andCanRepairNotBetween(Integer value1, Integer value2) {
            addCriterion("can_repair not between", value1, value2, "canRepair");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuValueIsNull() {
            addCriterion("sku_value is null");
            return (Criteria) this;
        }

        public Criteria andSkuValueIsNotNull() {
            addCriterion("sku_value is not null");
            return (Criteria) this;
        }

        public Criteria andSkuValueEqualTo(String value) {
            addCriterion("sku_value =", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueNotEqualTo(String value) {
            addCriterion("sku_value <>", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueGreaterThan(String value) {
            addCriterion("sku_value >", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueGreaterThanOrEqualTo(String value) {
            addCriterion("sku_value >=", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueLessThan(String value) {
            addCriterion("sku_value <", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueLessThanOrEqualTo(String value) {
            addCriterion("sku_value <=", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueLike(String value) {
            addCriterion("sku_value like", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueNotLike(String value) {
            addCriterion("sku_value not like", value, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueIn(List<String> values) {
            addCriterion("sku_value in", values, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueNotIn(List<String> values) {
            addCriterion("sku_value not in", values, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueBetween(String value1, String value2) {
            addCriterion("sku_value between", value1, value2, "skuValue");
            return (Criteria) this;
        }

        public Criteria andSkuValueNotBetween(String value1, String value2) {
            addCriterion("sku_value not between", value1, value2, "skuValue");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNull() {
            addCriterion("quota is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("quota is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(Integer value) {
            addCriterion("quota =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(Integer value) {
            addCriterion("quota <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(Integer value) {
            addCriterion("quota >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("quota >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(Integer value) {
            addCriterion("quota <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("quota <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<Integer> values) {
            addCriterion("quota in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<Integer> values) {
            addCriterion("quota not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(Integer value1, Integer value2) {
            addCriterion("quota between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("quota not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelIsNull() {
            addCriterion("sale_time_model is null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelIsNotNull() {
            addCriterion("sale_time_model is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelEqualTo(Integer value) {
            addCriterion("sale_time_model =", value, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelNotEqualTo(Integer value) {
            addCriterion("sale_time_model <>", value, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelGreaterThan(Integer value) {
            addCriterion("sale_time_model >", value, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_time_model >=", value, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelLessThan(Integer value) {
            addCriterion("sale_time_model <", value, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelLessThanOrEqualTo(Integer value) {
            addCriterion("sale_time_model <=", value, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelIn(List<Integer> values) {
            addCriterion("sale_time_model in", values, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelNotIn(List<Integer> values) {
            addCriterion("sale_time_model not in", values, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelBetween(Integer value1, Integer value2) {
            addCriterion("sale_time_model between", value1, value2, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeModelNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_time_model not between", value1, value2, "saleTimeModel");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNull() {
            addCriterion("sale_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNotNull() {
            addCriterion("sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeEqualTo(Date value) {
            addCriterion("sale_time =", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotEqualTo(Date value) {
            addCriterion("sale_time <>", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThan(Date value) {
            addCriterion("sale_time >", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_time >=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThan(Date value) {
            addCriterion("sale_time <", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_time <=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIn(List<Date> values) {
            addCriterion("sale_time in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotIn(List<Date> values) {
            addCriterion("sale_time not in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeBetween(Date value1, Date value2) {
            addCriterion("sale_time between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_time not between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusIsNull() {
            addCriterion("on_shelf_status is null");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusIsNotNull() {
            addCriterion("on_shelf_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusEqualTo(Integer value) {
            addCriterion("on_shelf_status =", value, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusNotEqualTo(Integer value) {
            addCriterion("on_shelf_status <>", value, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusGreaterThan(Integer value) {
            addCriterion("on_shelf_status >", value, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("on_shelf_status >=", value, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusLessThan(Integer value) {
            addCriterion("on_shelf_status <", value, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusLessThanOrEqualTo(Integer value) {
            addCriterion("on_shelf_status <=", value, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusIn(List<Integer> values) {
            addCriterion("on_shelf_status in", values, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusNotIn(List<Integer> values) {
            addCriterion("on_shelf_status not in", values, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusBetween(Integer value1, Integer value2) {
            addCriterion("on_shelf_status between", value1, value2, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOnShelfStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("on_shelf_status not between", value1, value2, "onShelfStatus");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeIsNull() {
            addCriterion("off_shelf_time is null");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeIsNotNull() {
            addCriterion("off_shelf_time is not null");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeEqualTo(Date value) {
            addCriterion("off_shelf_time =", value, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeNotEqualTo(Date value) {
            addCriterion("off_shelf_time <>", value, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeGreaterThan(Date value) {
            addCriterion("off_shelf_time >", value, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("off_shelf_time >=", value, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeLessThan(Date value) {
            addCriterion("off_shelf_time <", value, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeLessThanOrEqualTo(Date value) {
            addCriterion("off_shelf_time <=", value, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeIn(List<Date> values) {
            addCriterion("off_shelf_time in", values, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeNotIn(List<Date> values) {
            addCriterion("off_shelf_time not in", values, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeBetween(Date value1, Date value2) {
            addCriterion("off_shelf_time between", value1, value2, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andOffShelfTimeNotBetween(Date value1, Date value2) {
            addCriterion("off_shelf_time not between", value1, value2, "offShelfTime");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagIsNull() {
            addCriterion("discount_flag is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagIsNotNull() {
            addCriterion("discount_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagEqualTo(Integer value) {
            addCriterion("discount_flag =", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagNotEqualTo(Integer value) {
            addCriterion("discount_flag <>", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagGreaterThan(Integer value) {
            addCriterion("discount_flag >", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_flag >=", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagLessThan(Integer value) {
            addCriterion("discount_flag <", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagLessThanOrEqualTo(Integer value) {
            addCriterion("discount_flag <=", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagIn(List<Integer> values) {
            addCriterion("discount_flag in", values, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagNotIn(List<Integer> values) {
            addCriterion("discount_flag not in", values, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagBetween(Integer value1, Integer value2) {
            addCriterion("discount_flag between", value1, value2, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_flag not between", value1, value2, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelIsNull() {
            addCriterion("delivery_model is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelIsNotNull() {
            addCriterion("delivery_model is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelEqualTo(Integer value) {
            addCriterion("delivery_model =", value, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelNotEqualTo(Integer value) {
            addCriterion("delivery_model <>", value, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelGreaterThan(Integer value) {
            addCriterion("delivery_model >", value, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_model >=", value, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelLessThan(Integer value) {
            addCriterion("delivery_model <", value, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_model <=", value, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelIn(List<Integer> values) {
            addCriterion("delivery_model in", values, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelNotIn(List<Integer> values) {
            addCriterion("delivery_model not in", values, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelBetween(Integer value1, Integer value2) {
            addCriterion("delivery_model between", value1, value2, "deliveryModel");
            return (Criteria) this;
        }

        public Criteria andDeliveryModelNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_model not between", value1, value2, "deliveryModel");
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

        public Criteria andTransTemplateIdIsNull() {
            addCriterion("trans_template_id is null");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdIsNotNull() {
            addCriterion("trans_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdEqualTo(Integer value) {
            addCriterion("trans_template_id =", value, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdNotEqualTo(Integer value) {
            addCriterion("trans_template_id <>", value, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdGreaterThan(Integer value) {
            addCriterion("trans_template_id >", value, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_template_id >=", value, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdLessThan(Integer value) {
            addCriterion("trans_template_id <", value, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("trans_template_id <=", value, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdIn(List<Integer> values) {
            addCriterion("trans_template_id in", values, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdNotIn(List<Integer> values) {
            addCriterion("trans_template_id not in", values, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("trans_template_id between", value1, value2, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andTransTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_template_id not between", value1, value2, "transTemplateId");
            return (Criteria) this;
        }

        public Criteria andSaleModelIsNull() {
            addCriterion("sale_model is null");
            return (Criteria) this;
        }

        public Criteria andSaleModelIsNotNull() {
            addCriterion("sale_model is not null");
            return (Criteria) this;
        }

        public Criteria andSaleModelEqualTo(Integer value) {
            addCriterion("sale_model =", value, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelNotEqualTo(Integer value) {
            addCriterion("sale_model <>", value, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelGreaterThan(Integer value) {
            addCriterion("sale_model >", value, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_model >=", value, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelLessThan(Integer value) {
            addCriterion("sale_model <", value, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelLessThanOrEqualTo(Integer value) {
            addCriterion("sale_model <=", value, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelIn(List<Integer> values) {
            addCriterion("sale_model in", values, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelNotIn(List<Integer> values) {
            addCriterion("sale_model not in", values, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelBetween(Integer value1, Integer value2) {
            addCriterion("sale_model between", value1, value2, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSaleModelNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_model not between", value1, value2, "saleModel");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(String value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(String value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(String value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(String value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(String value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(String value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLike(String value) {
            addCriterion("sale_price like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotLike(String value) {
            addCriterion("sale_price not like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<String> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<String> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(String value1, String value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(String value1, String value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(Double value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(Double value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(Double value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(Double value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(Double value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<Double> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<Double> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(Double value1, Double value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(Double value1, Double value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andShowTemplateIsNull() {
            addCriterion("show_template is null");
            return (Criteria) this;
        }

        public Criteria andShowTemplateIsNotNull() {
            addCriterion("show_template is not null");
            return (Criteria) this;
        }

        public Criteria andShowTemplateEqualTo(Integer value) {
            addCriterion("show_template =", value, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateNotEqualTo(Integer value) {
            addCriterion("show_template <>", value, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateGreaterThan(Integer value) {
            addCriterion("show_template >", value, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_template >=", value, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateLessThan(Integer value) {
            addCriterion("show_template <", value, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateLessThanOrEqualTo(Integer value) {
            addCriterion("show_template <=", value, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateIn(List<Integer> values) {
            addCriterion("show_template in", values, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateNotIn(List<Integer> values) {
            addCriterion("show_template not in", values, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateBetween(Integer value1, Integer value2) {
            addCriterion("show_template between", value1, value2, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andShowTemplateNotBetween(Integer value1, Integer value2) {
            addCriterion("show_template not between", value1, value2, "showTemplate");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andQrUrlIsNull() {
            addCriterion("qr_url is null");
            return (Criteria) this;
        }

        public Criteria andQrUrlIsNotNull() {
            addCriterion("qr_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrUrlEqualTo(String value) {
            addCriterion("qr_url =", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotEqualTo(String value) {
            addCriterion("qr_url <>", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlGreaterThan(String value) {
            addCriterion("qr_url >", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qr_url >=", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlLessThan(String value) {
            addCriterion("qr_url <", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlLessThanOrEqualTo(String value) {
            addCriterion("qr_url <=", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlLike(String value) {
            addCriterion("qr_url like", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotLike(String value) {
            addCriterion("qr_url not like", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlIn(List<String> values) {
            addCriterion("qr_url in", values, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotIn(List<String> values) {
            addCriterion("qr_url not in", values, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlBetween(String value1, String value2) {
            addCriterion("qr_url between", value1, value2, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotBetween(String value1, String value2) {
            addCriterion("qr_url not between", value1, value2, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrPathIsNull() {
            addCriterion("qr_path is null");
            return (Criteria) this;
        }

        public Criteria andQrPathIsNotNull() {
            addCriterion("qr_path is not null");
            return (Criteria) this;
        }

        public Criteria andQrPathEqualTo(String value) {
            addCriterion("qr_path =", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathNotEqualTo(String value) {
            addCriterion("qr_path <>", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathGreaterThan(String value) {
            addCriterion("qr_path >", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathGreaterThanOrEqualTo(String value) {
            addCriterion("qr_path >=", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathLessThan(String value) {
            addCriterion("qr_path <", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathLessThanOrEqualTo(String value) {
            addCriterion("qr_path <=", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathLike(String value) {
            addCriterion("qr_path like", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathNotLike(String value) {
            addCriterion("qr_path not like", value, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathIn(List<String> values) {
            addCriterion("qr_path in", values, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathNotIn(List<String> values) {
            addCriterion("qr_path not in", values, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathBetween(String value1, String value2) {
            addCriterion("qr_path between", value1, value2, "qrPath");
            return (Criteria) this;
        }

        public Criteria andQrPathNotBetween(String value1, String value2) {
            addCriterion("qr_path not between", value1, value2, "qrPath");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIsNull() {
            addCriterion("seller_code is null");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIsNotNull() {
            addCriterion("seller_code is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCodeEqualTo(String value) {
            addCriterion("seller_code =", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotEqualTo(String value) {
            addCriterion("seller_code <>", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeGreaterThan(String value) {
            addCriterion("seller_code >", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("seller_code >=", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLessThan(String value) {
            addCriterion("seller_code <", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLessThanOrEqualTo(String value) {
            addCriterion("seller_code <=", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLike(String value) {
            addCriterion("seller_code like", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotLike(String value) {
            addCriterion("seller_code not like", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIn(List<String> values) {
            addCriterion("seller_code in", values, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotIn(List<String> values) {
            addCriterion("seller_code not in", values, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeBetween(String value1, String value2) {
            addCriterion("seller_code between", value1, value2, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotBetween(String value1, String value2) {
            addCriterion("seller_code not between", value1, value2, "sellerCode");
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

        public Criteria andFxPriceIsNull() {
            addCriterion("fx_price is null");
            return (Criteria) this;
        }

        public Criteria andFxPriceIsNotNull() {
            addCriterion("fx_price is not null");
            return (Criteria) this;
        }

        public Criteria andFxPriceEqualTo(Double value) {
            addCriterion("fx_price =", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceNotEqualTo(Double value) {
            addCriterion("fx_price <>", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceGreaterThan(Double value) {
            addCriterion("fx_price >", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("fx_price >=", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceLessThan(Double value) {
            addCriterion("fx_price <", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceLessThanOrEqualTo(Double value) {
            addCriterion("fx_price <=", value, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceIn(List<Double> values) {
            addCriterion("fx_price in", values, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceNotIn(List<Double> values) {
            addCriterion("fx_price not in", values, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceBetween(Double value1, Double value2) {
            addCriterion("fx_price between", value1, value2, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andFxPriceNotBetween(Double value1, Double value2) {
            addCriterion("fx_price not between", value1, value2, "fxPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNull() {
            addCriterion("supply_price is null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNotNull() {
            addCriterion("supply_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceEqualTo(Double value) {
            addCriterion("supply_price =", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotEqualTo(Double value) {
            addCriterion("supply_price <>", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThan(Double value) {
            addCriterion("supply_price >", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("supply_price >=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThan(Double value) {
            addCriterion("supply_price <", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThanOrEqualTo(Double value) {
            addCriterion("supply_price <=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIn(List<Double> values) {
            addCriterion("supply_price in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotIn(List<Double> values) {
            addCriterion("supply_price not in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceBetween(Double value1, Double value2) {
            addCriterion("supply_price between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotBetween(Double value1, Double value2) {
            addCriterion("supply_price not between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceIsNull() {
            addCriterion("max_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceIsNotNull() {
            addCriterion("max_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceEqualTo(Double value) {
            addCriterion("max_retail_price =", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceNotEqualTo(Double value) {
            addCriterion("max_retail_price <>", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceGreaterThan(Double value) {
            addCriterion("max_retail_price >", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("max_retail_price >=", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceLessThan(Double value) {
            addCriterion("max_retail_price <", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceLessThanOrEqualTo(Double value) {
            addCriterion("max_retail_price <=", value, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceIn(List<Double> values) {
            addCriterion("max_retail_price in", values, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceNotIn(List<Double> values) {
            addCriterion("max_retail_price not in", values, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceBetween(Double value1, Double value2) {
            addCriterion("max_retail_price between", value1, value2, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMaxRetailPriceNotBetween(Double value1, Double value2) {
            addCriterion("max_retail_price not between", value1, value2, "maxRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceIsNull() {
            addCriterion("min_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceIsNotNull() {
            addCriterion("min_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceEqualTo(Double value) {
            addCriterion("min_retail_price =", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceNotEqualTo(Double value) {
            addCriterion("min_retail_price <>", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceGreaterThan(Double value) {
            addCriterion("min_retail_price >", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("min_retail_price >=", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceLessThan(Double value) {
            addCriterion("min_retail_price <", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceLessThanOrEqualTo(Double value) {
            addCriterion("min_retail_price <=", value, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceIn(List<Double> values) {
            addCriterion("min_retail_price in", values, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceNotIn(List<Double> values) {
            addCriterion("min_retail_price not in", values, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceBetween(Double value1, Double value2) {
            addCriterion("min_retail_price between", value1, value2, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMinRetailPriceNotBetween(Double value1, Double value2) {
            addCriterion("min_retail_price not between", value1, value2, "minRetailPrice");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNull() {
            addCriterion("auditing_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNotNull() {
            addCriterion("auditing_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusEqualTo(Integer value) {
            addCriterion("auditing_status =", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotEqualTo(Integer value) {
            addCriterion("auditing_status <>", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThan(Integer value) {
            addCriterion("auditing_status >", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditing_status >=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThan(Integer value) {
            addCriterion("auditing_status <", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("auditing_status <=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIn(List<Integer> values) {
            addCriterion("auditing_status in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotIn(List<Integer> values) {
            addCriterion("auditing_status not in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusBetween(Integer value1, Integer value2) {
            addCriterion("auditing_status between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auditing_status not between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkIsNull() {
            addCriterion("auditing_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkIsNotNull() {
            addCriterion("auditing_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkEqualTo(String value) {
            addCriterion("auditing_remark =", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotEqualTo(String value) {
            addCriterion("auditing_remark <>", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkGreaterThan(String value) {
            addCriterion("auditing_remark >", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("auditing_remark >=", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkLessThan(String value) {
            addCriterion("auditing_remark <", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkLessThanOrEqualTo(String value) {
            addCriterion("auditing_remark <=", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkLike(String value) {
            addCriterion("auditing_remark like", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotLike(String value) {
            addCriterion("auditing_remark not like", value, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkIn(List<String> values) {
            addCriterion("auditing_remark in", values, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotIn(List<String> values) {
            addCriterion("auditing_remark not in", values, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkBetween(String value1, String value2) {
            addCriterion("auditing_remark between", value1, value2, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andAuditingRemarkNotBetween(String value1, String value2) {
            addCriterion("auditing_remark not between", value1, value2, "auditingRemark");
            return (Criteria) this;
        }

        public Criteria andProxyFlagIsNull() {
            addCriterion("proxy_flag is null");
            return (Criteria) this;
        }

        public Criteria andProxyFlagIsNotNull() {
            addCriterion("proxy_flag is not null");
            return (Criteria) this;
        }

        public Criteria andProxyFlagEqualTo(Integer value) {
            addCriterion("proxy_flag =", value, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagNotEqualTo(Integer value) {
            addCriterion("proxy_flag <>", value, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagGreaterThan(Integer value) {
            addCriterion("proxy_flag >", value, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("proxy_flag >=", value, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagLessThan(Integer value) {
            addCriterion("proxy_flag <", value, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("proxy_flag <=", value, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagIn(List<Integer> values) {
            addCriterion("proxy_flag in", values, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagNotIn(List<Integer> values) {
            addCriterion("proxy_flag not in", values, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagBetween(Integer value1, Integer value2) {
            addCriterion("proxy_flag between", value1, value2, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andProxyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("proxy_flag not between", value1, value2, "proxyFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagIsNull() {
            addCriterion("brand_direct_sale_flag is null");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagIsNotNull() {
            addCriterion("brand_direct_sale_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagEqualTo(Integer value) {
            addCriterion("brand_direct_sale_flag =", value, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagNotEqualTo(Integer value) {
            addCriterion("brand_direct_sale_flag <>", value, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagGreaterThan(Integer value) {
            addCriterion("brand_direct_sale_flag >", value, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_direct_sale_flag >=", value, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagLessThan(Integer value) {
            addCriterion("brand_direct_sale_flag <", value, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagLessThanOrEqualTo(Integer value) {
            addCriterion("brand_direct_sale_flag <=", value, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagIn(List<Integer> values) {
            addCriterion("brand_direct_sale_flag in", values, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagNotIn(List<Integer> values) {
            addCriterion("brand_direct_sale_flag not in", values, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagBetween(Integer value1, Integer value2) {
            addCriterion("brand_direct_sale_flag between", value1, value2, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandDirectSaleFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_direct_sale_flag not between", value1, value2, "brandDirectSaleFlag");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNull() {
            addCriterion("sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNotNull() {
            addCriterion("sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCountEqualTo(Integer value) {
            addCriterion("sale_count =", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotEqualTo(Integer value) {
            addCriterion("sale_count <>", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThan(Integer value) {
            addCriterion("sale_count >", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_count >=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThan(Integer value) {
            addCriterion("sale_count <", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_count <=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountIn(List<Integer> values) {
            addCriterion("sale_count in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotIn(List<Integer> values) {
            addCriterion("sale_count not in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_count between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_count not between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickCountEqualTo(Integer value) {
            addCriterion("click_count =", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThan(Integer value) {
            addCriterion("click_count >", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThan(Integer value) {
            addCriterion("click_count <", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIn(List<Integer> values) {
            addCriterion("click_count in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andCompScoreIsNull() {
            addCriterion("comp_score is null");
            return (Criteria) this;
        }

        public Criteria andCompScoreIsNotNull() {
            addCriterion("comp_score is not null");
            return (Criteria) this;
        }

        public Criteria andCompScoreEqualTo(Float value) {
            addCriterion("comp_score =", value, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreNotEqualTo(Float value) {
            addCriterion("comp_score <>", value, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreGreaterThan(Float value) {
            addCriterion("comp_score >", value, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("comp_score >=", value, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreLessThan(Float value) {
            addCriterion("comp_score <", value, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreLessThanOrEqualTo(Float value) {
            addCriterion("comp_score <=", value, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreIn(List<Float> values) {
            addCriterion("comp_score in", values, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreNotIn(List<Float> values) {
            addCriterion("comp_score not in", values, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreBetween(Float value1, Float value2) {
            addCriterion("comp_score between", value1, value2, "compScore");
            return (Criteria) this;
        }

        public Criteria andCompScoreNotBetween(Float value1, Float value2) {
            addCriterion("comp_score not between", value1, value2, "compScore");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusIsNull() {
            addCriterion("synchronize_status is null");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusIsNotNull() {
            addCriterion("synchronize_status is not null");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusEqualTo(Short value) {
            addCriterion("synchronize_status =", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusNotEqualTo(Short value) {
            addCriterion("synchronize_status <>", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusGreaterThan(Short value) {
            addCriterion("synchronize_status >", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("synchronize_status >=", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusLessThan(Short value) {
            addCriterion("synchronize_status <", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusLessThanOrEqualTo(Short value) {
            addCriterion("synchronize_status <=", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusIn(List<Short> values) {
            addCriterion("synchronize_status in", values, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusNotIn(List<Short> values) {
            addCriterion("synchronize_status not in", values, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusBetween(Short value1, Short value2) {
            addCriterion("synchronize_status between", value1, value2, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusNotBetween(Short value1, Short value2) {
            addCriterion("synchronize_status not between", value1, value2, "synchronizeStatus");
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