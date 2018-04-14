package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkUrlExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoIsNull() {
            addCriterion("display_info is null");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoIsNotNull() {
            addCriterion("display_info is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoEqualTo(String value) {
            addCriterion("display_info =", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoNotEqualTo(String value) {
            addCriterion("display_info <>", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoGreaterThan(String value) {
            addCriterion("display_info >", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoGreaterThanOrEqualTo(String value) {
            addCriterion("display_info >=", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoLessThan(String value) {
            addCriterion("display_info <", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoLessThanOrEqualTo(String value) {
            addCriterion("display_info <=", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoLike(String value) {
            addCriterion("display_info like", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoNotLike(String value) {
            addCriterion("display_info not like", value, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoIn(List<String> values) {
            addCriterion("display_info in", values, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoNotIn(List<String> values) {
            addCriterion("display_info not in", values, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoBetween(String value1, String value2) {
            addCriterion("display_info between", value1, value2, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andDisplayInfoNotBetween(String value1, String value2) {
            addCriterion("display_info not between", value1, value2, "displayInfo");
            return (Criteria) this;
        }

        public Criteria andRealUrlIsNull() {
            addCriterion("real_url is null");
            return (Criteria) this;
        }

        public Criteria andRealUrlIsNotNull() {
            addCriterion("real_url is not null");
            return (Criteria) this;
        }

        public Criteria andRealUrlEqualTo(String value) {
            addCriterion("real_url =", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlNotEqualTo(String value) {
            addCriterion("real_url <>", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlGreaterThan(String value) {
            addCriterion("real_url >", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlGreaterThanOrEqualTo(String value) {
            addCriterion("real_url >=", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlLessThan(String value) {
            addCriterion("real_url <", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlLessThanOrEqualTo(String value) {
            addCriterion("real_url <=", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlLike(String value) {
            addCriterion("real_url like", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlNotLike(String value) {
            addCriterion("real_url not like", value, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlIn(List<String> values) {
            addCriterion("real_url in", values, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlNotIn(List<String> values) {
            addCriterion("real_url not in", values, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlBetween(String value1, String value2) {
            addCriterion("real_url between", value1, value2, "realUrl");
            return (Criteria) this;
        }

        public Criteria andRealUrlNotBetween(String value1, String value2) {
            addCriterion("real_url not between", value1, value2, "realUrl");
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