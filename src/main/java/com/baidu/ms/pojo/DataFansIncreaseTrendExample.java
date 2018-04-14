package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataFansIncreaseTrendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataFansIncreaseTrendExample() {
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

        public Criteria andAddedIsNull() {
            addCriterion("added is null");
            return (Criteria) this;
        }

        public Criteria andAddedIsNotNull() {
            addCriterion("added is not null");
            return (Criteria) this;
        }

        public Criteria andAddedEqualTo(Integer value) {
            addCriterion("added =", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotEqualTo(Integer value) {
            addCriterion("added <>", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedGreaterThan(Integer value) {
            addCriterion("added >", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedGreaterThanOrEqualTo(Integer value) {
            addCriterion("added >=", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLessThan(Integer value) {
            addCriterion("added <", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLessThanOrEqualTo(Integer value) {
            addCriterion("added <=", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedIn(List<Integer> values) {
            addCriterion("added in", values, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotIn(List<Integer> values) {
            addCriterion("added not in", values, "added");
            return (Criteria) this;
        }

        public Criteria andAddedBetween(Integer value1, Integer value2) {
            addCriterion("added between", value1, value2, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotBetween(Integer value1, Integer value2) {
            addCriterion("added not between", value1, value2, "added");
            return (Criteria) this;
        }

        public Criteria andRunAwayIsNull() {
            addCriterion("run_away is null");
            return (Criteria) this;
        }

        public Criteria andRunAwayIsNotNull() {
            addCriterion("run_away is not null");
            return (Criteria) this;
        }

        public Criteria andRunAwayEqualTo(Integer value) {
            addCriterion("run_away =", value, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayNotEqualTo(Integer value) {
            addCriterion("run_away <>", value, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayGreaterThan(Integer value) {
            addCriterion("run_away >", value, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_away >=", value, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayLessThan(Integer value) {
            addCriterion("run_away <", value, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayLessThanOrEqualTo(Integer value) {
            addCriterion("run_away <=", value, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayIn(List<Integer> values) {
            addCriterion("run_away in", values, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayNotIn(List<Integer> values) {
            addCriterion("run_away not in", values, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayBetween(Integer value1, Integer value2) {
            addCriterion("run_away between", value1, value2, "runAway");
            return (Criteria) this;
        }

        public Criteria andRunAwayNotBetween(Integer value1, Integer value2) {
            addCriterion("run_away not between", value1, value2, "runAway");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("growth is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("growth is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(Integer value) {
            addCriterion("growth =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(Integer value) {
            addCriterion("growth <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(Integer value) {
            addCriterion("growth >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(Integer value) {
            addCriterion("growth <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(Integer value) {
            addCriterion("growth <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<Integer> values) {
            addCriterion("growth in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<Integer> values) {
            addCriterion("growth not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(Integer value1, Integer value2) {
            addCriterion("growth between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(Integer value1, Integer value2) {
            addCriterion("growth not between", value1, value2, "growth");
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