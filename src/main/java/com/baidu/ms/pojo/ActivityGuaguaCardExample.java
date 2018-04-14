package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityGuaguaCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityGuaguaCardExample() {
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

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andConsumePointIsNull() {
            addCriterion("consume_point is null");
            return (Criteria) this;
        }

        public Criteria andConsumePointIsNotNull() {
            addCriterion("consume_point is not null");
            return (Criteria) this;
        }

        public Criteria andConsumePointEqualTo(Integer value) {
            addCriterion("consume_point =", value, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointNotEqualTo(Integer value) {
            addCriterion("consume_point <>", value, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointGreaterThan(Integer value) {
            addCriterion("consume_point >", value, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_point >=", value, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointLessThan(Integer value) {
            addCriterion("consume_point <", value, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointLessThanOrEqualTo(Integer value) {
            addCriterion("consume_point <=", value, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointIn(List<Integer> values) {
            addCriterion("consume_point in", values, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointNotIn(List<Integer> values) {
            addCriterion("consume_point not in", values, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointBetween(Integer value1, Integer value2) {
            addCriterion("consume_point between", value1, value2, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andConsumePointNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_point not between", value1, value2, "consumePoint");
            return (Criteria) this;
        }

        public Criteria andUserLimitIsNull() {
            addCriterion("user_limit is null");
            return (Criteria) this;
        }

        public Criteria andUserLimitIsNotNull() {
            addCriterion("user_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUserLimitEqualTo(Integer value) {
            addCriterion("user_limit =", value, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitNotEqualTo(Integer value) {
            addCriterion("user_limit <>", value, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitGreaterThan(Integer value) {
            addCriterion("user_limit >", value, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_limit >=", value, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitLessThan(Integer value) {
            addCriterion("user_limit <", value, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitLessThanOrEqualTo(Integer value) {
            addCriterion("user_limit <=", value, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitIn(List<Integer> values) {
            addCriterion("user_limit in", values, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitNotIn(List<Integer> values) {
            addCriterion("user_limit not in", values, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitBetween(Integer value1, Integer value2) {
            addCriterion("user_limit between", value1, value2, "userLimit");
            return (Criteria) this;
        }

        public Criteria andUserLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("user_limit not between", value1, value2, "userLimit");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNull() {
            addCriterion("give_point is null");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNotNull() {
            addCriterion("give_point is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointEqualTo(Integer value) {
            addCriterion("give_point =", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotEqualTo(Integer value) {
            addCriterion("give_point <>", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThan(Integer value) {
            addCriterion("give_point >", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_point >=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThan(Integer value) {
            addCriterion("give_point <", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThanOrEqualTo(Integer value) {
            addCriterion("give_point <=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointIn(List<Integer> values) {
            addCriterion("give_point in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotIn(List<Integer> values) {
            addCriterion("give_point not in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointBetween(Integer value1, Integer value2) {
            addCriterion("give_point between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotBetween(Integer value1, Integer value2) {
            addCriterion("give_point not between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyIsNull() {
            addCriterion("give_point_to_no_prize_only is null");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyIsNotNull() {
            addCriterion("give_point_to_no_prize_only is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyEqualTo(Integer value) {
            addCriterion("give_point_to_no_prize_only =", value, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyNotEqualTo(Integer value) {
            addCriterion("give_point_to_no_prize_only <>", value, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyGreaterThan(Integer value) {
            addCriterion("give_point_to_no_prize_only >", value, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_point_to_no_prize_only >=", value, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyLessThan(Integer value) {
            addCriterion("give_point_to_no_prize_only <", value, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyLessThanOrEqualTo(Integer value) {
            addCriterion("give_point_to_no_prize_only <=", value, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyIn(List<Integer> values) {
            addCriterion("give_point_to_no_prize_only in", values, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyNotIn(List<Integer> values) {
            addCriterion("give_point_to_no_prize_only not in", values, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyBetween(Integer value1, Integer value2) {
            addCriterion("give_point_to_no_prize_only between", value1, value2, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andGivePointToNoPrizeOnlyNotBetween(Integer value1, Integer value2) {
            addCriterion("give_point_to_no_prize_only not between", value1, value2, "givePointToNoPrizeOnly");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNull() {
            addCriterion("probability is null");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNotNull() {
            addCriterion("probability is not null");
            return (Criteria) this;
        }

        public Criteria andProbabilityEqualTo(Integer value) {
            addCriterion("probability =", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotEqualTo(Integer value) {
            addCriterion("probability <>", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThan(Integer value) {
            addCriterion("probability >", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("probability >=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThan(Integer value) {
            addCriterion("probability <", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThanOrEqualTo(Integer value) {
            addCriterion("probability <=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityIn(List<Integer> values) {
            addCriterion("probability in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotIn(List<Integer> values) {
            addCriterion("probability not in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityBetween(Integer value1, Integer value2) {
            addCriterion("probability between", value1, value2, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("probability not between", value1, value2, "probability");
            return (Criteria) this;
        }

        public Criteria andSuccessTipIsNull() {
            addCriterion("success_tip is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTipIsNotNull() {
            addCriterion("success_tip is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTipEqualTo(String value) {
            addCriterion("success_tip =", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipNotEqualTo(String value) {
            addCriterion("success_tip <>", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipGreaterThan(String value) {
            addCriterion("success_tip >", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipGreaterThanOrEqualTo(String value) {
            addCriterion("success_tip >=", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipLessThan(String value) {
            addCriterion("success_tip <", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipLessThanOrEqualTo(String value) {
            addCriterion("success_tip <=", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipLike(String value) {
            addCriterion("success_tip like", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipNotLike(String value) {
            addCriterion("success_tip not like", value, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipIn(List<String> values) {
            addCriterion("success_tip in", values, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipNotIn(List<String> values) {
            addCriterion("success_tip not in", values, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipBetween(String value1, String value2) {
            addCriterion("success_tip between", value1, value2, "successTip");
            return (Criteria) this;
        }

        public Criteria andSuccessTipNotBetween(String value1, String value2) {
            addCriterion("success_tip not between", value1, value2, "successTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipIsNull() {
            addCriterion("failed_tip is null");
            return (Criteria) this;
        }

        public Criteria andFailedTipIsNotNull() {
            addCriterion("failed_tip is not null");
            return (Criteria) this;
        }

        public Criteria andFailedTipEqualTo(String value) {
            addCriterion("failed_tip =", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipNotEqualTo(String value) {
            addCriterion("failed_tip <>", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipGreaterThan(String value) {
            addCriterion("failed_tip >", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipGreaterThanOrEqualTo(String value) {
            addCriterion("failed_tip >=", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipLessThan(String value) {
            addCriterion("failed_tip <", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipLessThanOrEqualTo(String value) {
            addCriterion("failed_tip <=", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipLike(String value) {
            addCriterion("failed_tip like", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipNotLike(String value) {
            addCriterion("failed_tip not like", value, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipIn(List<String> values) {
            addCriterion("failed_tip in", values, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipNotIn(List<String> values) {
            addCriterion("failed_tip not in", values, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipBetween(String value1, String value2) {
            addCriterion("failed_tip between", value1, value2, "failedTip");
            return (Criteria) this;
        }

        public Criteria andFailedTipNotBetween(String value1, String value2) {
            addCriterion("failed_tip not between", value1, value2, "failedTip");
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