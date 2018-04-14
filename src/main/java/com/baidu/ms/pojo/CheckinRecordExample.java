package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckinRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckinRecordExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
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

        public Criteria andFirstCheckinTimeIsNull() {
            addCriterion("first_checkin_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeIsNotNull() {
            addCriterion("first_checkin_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeEqualTo(Date value) {
            addCriterion("first_checkin_time =", value, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeNotEqualTo(Date value) {
            addCriterion("first_checkin_time <>", value, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeGreaterThan(Date value) {
            addCriterion("first_checkin_time >", value, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_checkin_time >=", value, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeLessThan(Date value) {
            addCriterion("first_checkin_time <", value, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_checkin_time <=", value, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeIn(List<Date> values) {
            addCriterion("first_checkin_time in", values, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeNotIn(List<Date> values) {
            addCriterion("first_checkin_time not in", values, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeBetween(Date value1, Date value2) {
            addCriterion("first_checkin_time between", value1, value2, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckinTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_checkin_time not between", value1, value2, "firstCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeIsNull() {
            addCriterion("last_checkin_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeIsNotNull() {
            addCriterion("last_checkin_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeEqualTo(Date value) {
            addCriterion("last_checkin_time =", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeNotEqualTo(Date value) {
            addCriterion("last_checkin_time <>", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeGreaterThan(Date value) {
            addCriterion("last_checkin_time >", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_checkin_time >=", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeLessThan(Date value) {
            addCriterion("last_checkin_time <", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_checkin_time <=", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeIn(List<Date> values) {
            addCriterion("last_checkin_time in", values, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeNotIn(List<Date> values) {
            addCriterion("last_checkin_time not in", values, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeBetween(Date value1, Date value2) {
            addCriterion("last_checkin_time between", value1, value2, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_checkin_time not between", value1, value2, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIsNull() {
            addCriterion("total_times is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIsNotNull() {
            addCriterion("total_times is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesEqualTo(Integer value) {
            addCriterion("total_times =", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotEqualTo(Integer value) {
            addCriterion("total_times <>", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesGreaterThan(Integer value) {
            addCriterion("total_times >", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_times >=", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesLessThan(Integer value) {
            addCriterion("total_times <", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesLessThanOrEqualTo(Integer value) {
            addCriterion("total_times <=", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIn(List<Integer> values) {
            addCriterion("total_times in", values, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotIn(List<Integer> values) {
            addCriterion("total_times not in", values, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBetween(Integer value1, Integer value2) {
            addCriterion("total_times between", value1, value2, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("total_times not between", value1, value2, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesIsNull() {
            addCriterion("total_continuou_times is null");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesIsNotNull() {
            addCriterion("total_continuou_times is not null");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesEqualTo(Integer value) {
            addCriterion("total_continuou_times =", value, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesNotEqualTo(Integer value) {
            addCriterion("total_continuou_times <>", value, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesGreaterThan(Integer value) {
            addCriterion("total_continuou_times >", value, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_continuou_times >=", value, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesLessThan(Integer value) {
            addCriterion("total_continuou_times <", value, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesLessThanOrEqualTo(Integer value) {
            addCriterion("total_continuou_times <=", value, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesIn(List<Integer> values) {
            addCriterion("total_continuou_times in", values, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesNotIn(List<Integer> values) {
            addCriterion("total_continuou_times not in", values, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesBetween(Integer value1, Integer value2) {
            addCriterion("total_continuou_times between", value1, value2, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andTotalContinuouTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("total_continuou_times not between", value1, value2, "totalContinuouTimes");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andCouponsIsNull() {
            addCriterion("coupons is null");
            return (Criteria) this;
        }

        public Criteria andCouponsIsNotNull() {
            addCriterion("coupons is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsEqualTo(String value) {
            addCriterion("coupons =", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotEqualTo(String value) {
            addCriterion("coupons <>", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsGreaterThan(String value) {
            addCriterion("coupons >", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsGreaterThanOrEqualTo(String value) {
            addCriterion("coupons >=", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsLessThan(String value) {
            addCriterion("coupons <", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsLessThanOrEqualTo(String value) {
            addCriterion("coupons <=", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsLike(String value) {
            addCriterion("coupons like", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotLike(String value) {
            addCriterion("coupons not like", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsIn(List<String> values) {
            addCriterion("coupons in", values, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotIn(List<String> values) {
            addCriterion("coupons not in", values, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsBetween(String value1, String value2) {
            addCriterion("coupons between", value1, value2, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotBetween(String value1, String value2) {
            addCriterion("coupons not between", value1, value2, "coupons");
            return (Criteria) this;
        }

        public Criteria andGiftsIsNull() {
            addCriterion("gifts is null");
            return (Criteria) this;
        }

        public Criteria andGiftsIsNotNull() {
            addCriterion("gifts is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsEqualTo(String value) {
            addCriterion("gifts =", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsNotEqualTo(String value) {
            addCriterion("gifts <>", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsGreaterThan(String value) {
            addCriterion("gifts >", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsGreaterThanOrEqualTo(String value) {
            addCriterion("gifts >=", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsLessThan(String value) {
            addCriterion("gifts <", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsLessThanOrEqualTo(String value) {
            addCriterion("gifts <=", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsLike(String value) {
            addCriterion("gifts like", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsNotLike(String value) {
            addCriterion("gifts not like", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsIn(List<String> values) {
            addCriterion("gifts in", values, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsNotIn(List<String> values) {
            addCriterion("gifts not in", values, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsBetween(String value1, String value2) {
            addCriterion("gifts between", value1, value2, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsNotBetween(String value1, String value2) {
            addCriterion("gifts not between", value1, value2, "gifts");
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