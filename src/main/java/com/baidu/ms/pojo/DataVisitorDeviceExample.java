package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataVisitorDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataVisitorDeviceExample() {
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

        public Criteria andIosIsNull() {
            addCriterion("ios is null");
            return (Criteria) this;
        }

        public Criteria andIosIsNotNull() {
            addCriterion("ios is not null");
            return (Criteria) this;
        }

        public Criteria andIosEqualTo(Integer value) {
            addCriterion("ios =", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotEqualTo(Integer value) {
            addCriterion("ios <>", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThan(Integer value) {
            addCriterion("ios >", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThanOrEqualTo(Integer value) {
            addCriterion("ios >=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThan(Integer value) {
            addCriterion("ios <", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThanOrEqualTo(Integer value) {
            addCriterion("ios <=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosIn(List<Integer> values) {
            addCriterion("ios in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotIn(List<Integer> values) {
            addCriterion("ios not in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosBetween(Integer value1, Integer value2) {
            addCriterion("ios between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotBetween(Integer value1, Integer value2) {
            addCriterion("ios not between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNull() {
            addCriterion("android is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNotNull() {
            addCriterion("android is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidEqualTo(Integer value) {
            addCriterion("android =", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotEqualTo(Integer value) {
            addCriterion("android <>", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThan(Integer value) {
            addCriterion("android >", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThanOrEqualTo(Integer value) {
            addCriterion("android >=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThan(Integer value) {
            addCriterion("android <", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThanOrEqualTo(Integer value) {
            addCriterion("android <=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidIn(List<Integer> values) {
            addCriterion("android in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotIn(List<Integer> values) {
            addCriterion("android not in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidBetween(Integer value1, Integer value2) {
            addCriterion("android between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotBetween(Integer value1, Integer value2) {
            addCriterion("android not between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceIsNull() {
            addCriterion("other_device is null");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceIsNotNull() {
            addCriterion("other_device is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceEqualTo(Integer value) {
            addCriterion("other_device =", value, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceNotEqualTo(Integer value) {
            addCriterion("other_device <>", value, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceGreaterThan(Integer value) {
            addCriterion("other_device >", value, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_device >=", value, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceLessThan(Integer value) {
            addCriterion("other_device <", value, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceLessThanOrEqualTo(Integer value) {
            addCriterion("other_device <=", value, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceIn(List<Integer> values) {
            addCriterion("other_device in", values, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceNotIn(List<Integer> values) {
            addCriterion("other_device not in", values, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceBetween(Integer value1, Integer value2) {
            addCriterion("other_device between", value1, value2, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andOtherDeviceNotBetween(Integer value1, Integer value2) {
            addCriterion("other_device not between", value1, value2, "otherDevice");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserIsNull() {
            addCriterion("wechat_browser is null");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserIsNotNull() {
            addCriterion("wechat_browser is not null");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserEqualTo(Integer value) {
            addCriterion("wechat_browser =", value, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserNotEqualTo(Integer value) {
            addCriterion("wechat_browser <>", value, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserGreaterThan(Integer value) {
            addCriterion("wechat_browser >", value, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_browser >=", value, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserLessThan(Integer value) {
            addCriterion("wechat_browser <", value, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_browser <=", value, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserIn(List<Integer> values) {
            addCriterion("wechat_browser in", values, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserNotIn(List<Integer> values) {
            addCriterion("wechat_browser not in", values, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserBetween(Integer value1, Integer value2) {
            addCriterion("wechat_browser between", value1, value2, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andWechatBrowserNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_browser not between", value1, value2, "wechatBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserIsNull() {
            addCriterion("other_browser is null");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserIsNotNull() {
            addCriterion("other_browser is not null");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserEqualTo(Integer value) {
            addCriterion("other_browser =", value, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserNotEqualTo(Integer value) {
            addCriterion("other_browser <>", value, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserGreaterThan(Integer value) {
            addCriterion("other_browser >", value, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_browser >=", value, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserLessThan(Integer value) {
            addCriterion("other_browser <", value, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserLessThanOrEqualTo(Integer value) {
            addCriterion("other_browser <=", value, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserIn(List<Integer> values) {
            addCriterion("other_browser in", values, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserNotIn(List<Integer> values) {
            addCriterion("other_browser not in", values, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserBetween(Integer value1, Integer value2) {
            addCriterion("other_browser between", value1, value2, "otherBrowser");
            return (Criteria) this;
        }

        public Criteria andOtherBrowserNotBetween(Integer value1, Integer value2) {
            addCriterion("other_browser not between", value1, value2, "otherBrowser");
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