package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RqcodeLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RqcodeLogExample() {
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

        public Criteria andRqcodeIdIsNull() {
            addCriterion("rqcode_id is null");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdIsNotNull() {
            addCriterion("rqcode_id is not null");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdEqualTo(Integer value) {
            addCriterion("rqcode_id =", value, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdNotEqualTo(Integer value) {
            addCriterion("rqcode_id <>", value, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdGreaterThan(Integer value) {
            addCriterion("rqcode_id >", value, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rqcode_id >=", value, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdLessThan(Integer value) {
            addCriterion("rqcode_id <", value, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("rqcode_id <=", value, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdIn(List<Integer> values) {
            addCriterion("rqcode_id in", values, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdNotIn(List<Integer> values) {
            addCriterion("rqcode_id not in", values, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdBetween(Integer value1, Integer value2) {
            addCriterion("rqcode_id between", value1, value2, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andRqcodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rqcode_id not between", value1, value2, "rqcodeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andScanTimeIsNull() {
            addCriterion("scan_time is null");
            return (Criteria) this;
        }

        public Criteria andScanTimeIsNotNull() {
            addCriterion("scan_time is not null");
            return (Criteria) this;
        }

        public Criteria andScanTimeEqualTo(Date value) {
            addCriterion("scan_time =", value, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeNotEqualTo(Date value) {
            addCriterion("scan_time <>", value, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeGreaterThan(Date value) {
            addCriterion("scan_time >", value, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scan_time >=", value, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeLessThan(Date value) {
            addCriterion("scan_time <", value, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeLessThanOrEqualTo(Date value) {
            addCriterion("scan_time <=", value, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeIn(List<Date> values) {
            addCriterion("scan_time in", values, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeNotIn(List<Date> values) {
            addCriterion("scan_time not in", values, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeBetween(Date value1, Date value2) {
            addCriterion("scan_time between", value1, value2, "scanTime");
            return (Criteria) this;
        }

        public Criteria andScanTimeNotBetween(Date value1, Date value2) {
            addCriterion("scan_time not between", value1, value2, "scanTime");
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