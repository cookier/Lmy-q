package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityCashbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityCashbackExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodIsNull() {
            addCriterion("cashback_method is null");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodIsNotNull() {
            addCriterion("cashback_method is not null");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodEqualTo(Integer value) {
            addCriterion("cashback_method =", value, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodNotEqualTo(Integer value) {
            addCriterion("cashback_method <>", value, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodGreaterThan(Integer value) {
            addCriterion("cashback_method >", value, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashback_method >=", value, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodLessThan(Integer value) {
            addCriterion("cashback_method <", value, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodLessThanOrEqualTo(Integer value) {
            addCriterion("cashback_method <=", value, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodIn(List<Integer> values) {
            addCriterion("cashback_method in", values, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodNotIn(List<Integer> values) {
            addCriterion("cashback_method not in", values, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodBetween(Integer value1, Integer value2) {
            addCriterion("cashback_method between", value1, value2, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("cashback_method not between", value1, value2, "cashbackMethod");
            return (Criteria) this;
        }

        public Criteria andCashbackStartIsNull() {
            addCriterion("cashback_start is null");
            return (Criteria) this;
        }

        public Criteria andCashbackStartIsNotNull() {
            addCriterion("cashback_start is not null");
            return (Criteria) this;
        }

        public Criteria andCashbackStartEqualTo(Integer value) {
            addCriterion("cashback_start =", value, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartNotEqualTo(Integer value) {
            addCriterion("cashback_start <>", value, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartGreaterThan(Integer value) {
            addCriterion("cashback_start >", value, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashback_start >=", value, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartLessThan(Integer value) {
            addCriterion("cashback_start <", value, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartLessThanOrEqualTo(Integer value) {
            addCriterion("cashback_start <=", value, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartIn(List<Integer> values) {
            addCriterion("cashback_start in", values, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartNotIn(List<Integer> values) {
            addCriterion("cashback_start not in", values, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartBetween(Integer value1, Integer value2) {
            addCriterion("cashback_start between", value1, value2, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackStartNotBetween(Integer value1, Integer value2) {
            addCriterion("cashback_start not between", value1, value2, "cashbackStart");
            return (Criteria) this;
        }

        public Criteria andCashbackEndIsNull() {
            addCriterion("cashback_end is null");
            return (Criteria) this;
        }

        public Criteria andCashbackEndIsNotNull() {
            addCriterion("cashback_end is not null");
            return (Criteria) this;
        }

        public Criteria andCashbackEndEqualTo(Integer value) {
            addCriterion("cashback_end =", value, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndNotEqualTo(Integer value) {
            addCriterion("cashback_end <>", value, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndGreaterThan(Integer value) {
            addCriterion("cashback_end >", value, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashback_end >=", value, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndLessThan(Integer value) {
            addCriterion("cashback_end <", value, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndLessThanOrEqualTo(Integer value) {
            addCriterion("cashback_end <=", value, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndIn(List<Integer> values) {
            addCriterion("cashback_end in", values, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndNotIn(List<Integer> values) {
            addCriterion("cashback_end not in", values, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndBetween(Integer value1, Integer value2) {
            addCriterion("cashback_end between", value1, value2, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackEndNotBetween(Integer value1, Integer value2) {
            addCriterion("cashback_end not between", value1, value2, "cashbackEnd");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitIsNull() {
            addCriterion("cashback_limit is null");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitIsNotNull() {
            addCriterion("cashback_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitEqualTo(Integer value) {
            addCriterion("cashback_limit =", value, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitNotEqualTo(Integer value) {
            addCriterion("cashback_limit <>", value, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitGreaterThan(Integer value) {
            addCriterion("cashback_limit >", value, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashback_limit >=", value, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitLessThan(Integer value) {
            addCriterion("cashback_limit <", value, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitLessThanOrEqualTo(Integer value) {
            addCriterion("cashback_limit <=", value, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitIn(List<Integer> values) {
            addCriterion("cashback_limit in", values, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitNotIn(List<Integer> values) {
            addCriterion("cashback_limit not in", values, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitBetween(Integer value1, Integer value2) {
            addCriterion("cashback_limit between", value1, value2, "cashbackLimit");
            return (Criteria) this;
        }

        public Criteria andCashbackLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("cashback_limit not between", value1, value2, "cashbackLimit");
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

        public Criteria andRangeTypeIsNull() {
            addCriterion("range_type is null");
            return (Criteria) this;
        }

        public Criteria andRangeTypeIsNotNull() {
            addCriterion("range_type is not null");
            return (Criteria) this;
        }

        public Criteria andRangeTypeEqualTo(Integer value) {
            addCriterion("range_type =", value, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeNotEqualTo(Integer value) {
            addCriterion("range_type <>", value, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeGreaterThan(Integer value) {
            addCriterion("range_type >", value, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("range_type >=", value, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeLessThan(Integer value) {
            addCriterion("range_type <", value, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("range_type <=", value, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeIn(List<Integer> values) {
            addCriterion("range_type in", values, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeNotIn(List<Integer> values) {
            addCriterion("range_type not in", values, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeBetween(Integer value1, Integer value2) {
            addCriterion("range_type between", value1, value2, "rangeType");
            return (Criteria) this;
        }

        public Criteria andRangeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("range_type not between", value1, value2, "rangeType");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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