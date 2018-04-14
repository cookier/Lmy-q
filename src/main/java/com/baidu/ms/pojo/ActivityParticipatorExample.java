package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityParticipatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityParticipatorExample() {
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

        public Criteria andShareQrPathIsNull() {
            addCriterion("share_qr_path is null");
            return (Criteria) this;
        }

        public Criteria andShareQrPathIsNotNull() {
            addCriterion("share_qr_path is not null");
            return (Criteria) this;
        }

        public Criteria andShareQrPathEqualTo(String value) {
            addCriterion("share_qr_path =", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathNotEqualTo(String value) {
            addCriterion("share_qr_path <>", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathGreaterThan(String value) {
            addCriterion("share_qr_path >", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathGreaterThanOrEqualTo(String value) {
            addCriterion("share_qr_path >=", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathLessThan(String value) {
            addCriterion("share_qr_path <", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathLessThanOrEqualTo(String value) {
            addCriterion("share_qr_path <=", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathLike(String value) {
            addCriterion("share_qr_path like", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathNotLike(String value) {
            addCriterion("share_qr_path not like", value, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathIn(List<String> values) {
            addCriterion("share_qr_path in", values, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathNotIn(List<String> values) {
            addCriterion("share_qr_path not in", values, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathBetween(String value1, String value2) {
            addCriterion("share_qr_path between", value1, value2, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrPathNotBetween(String value1, String value2) {
            addCriterion("share_qr_path not between", value1, value2, "shareQrPath");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlIsNull() {
            addCriterion("share_qr_url is null");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlIsNotNull() {
            addCriterion("share_qr_url is not null");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlEqualTo(String value) {
            addCriterion("share_qr_url =", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlNotEqualTo(String value) {
            addCriterion("share_qr_url <>", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlGreaterThan(String value) {
            addCriterion("share_qr_url >", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("share_qr_url >=", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlLessThan(String value) {
            addCriterion("share_qr_url <", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlLessThanOrEqualTo(String value) {
            addCriterion("share_qr_url <=", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlLike(String value) {
            addCriterion("share_qr_url like", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlNotLike(String value) {
            addCriterion("share_qr_url not like", value, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlIn(List<String> values) {
            addCriterion("share_qr_url in", values, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlNotIn(List<String> values) {
            addCriterion("share_qr_url not in", values, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlBetween(String value1, String value2) {
            addCriterion("share_qr_url between", value1, value2, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareQrUrlNotBetween(String value1, String value2) {
            addCriterion("share_qr_url not between", value1, value2, "shareQrUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlIsNull() {
            addCriterion("share_link_url is null");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlIsNotNull() {
            addCriterion("share_link_url is not null");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlEqualTo(String value) {
            addCriterion("share_link_url =", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlNotEqualTo(String value) {
            addCriterion("share_link_url <>", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlGreaterThan(String value) {
            addCriterion("share_link_url >", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("share_link_url >=", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlLessThan(String value) {
            addCriterion("share_link_url <", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("share_link_url <=", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlLike(String value) {
            addCriterion("share_link_url like", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlNotLike(String value) {
            addCriterion("share_link_url not like", value, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlIn(List<String> values) {
            addCriterion("share_link_url in", values, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlNotIn(List<String> values) {
            addCriterion("share_link_url not in", values, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlBetween(String value1, String value2) {
            addCriterion("share_link_url between", value1, value2, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andShareLinkUrlNotBetween(String value1, String value2) {
            addCriterion("share_link_url not between", value1, value2, "shareLinkUrl");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Double value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Double value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Double value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Double value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Double value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Double value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Double> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Double> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Double value1, Double value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Double value1, Double value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andRecommendNumIsNull() {
            addCriterion("recommend_num is null");
            return (Criteria) this;
        }

        public Criteria andRecommendNumIsNotNull() {
            addCriterion("recommend_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendNumEqualTo(Integer value) {
            addCriterion("recommend_num =", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumNotEqualTo(Integer value) {
            addCriterion("recommend_num <>", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumGreaterThan(Integer value) {
            addCriterion("recommend_num >", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_num >=", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumLessThan(Integer value) {
            addCriterion("recommend_num <", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_num <=", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumIn(List<Integer> values) {
            addCriterion("recommend_num in", values, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumNotIn(List<Integer> values) {
            addCriterion("recommend_num not in", values, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumBetween(Integer value1, Integer value2) {
            addCriterion("recommend_num between", value1, value2, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_num not between", value1, value2, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesIsNull() {
            addCriterion("remainder_sales is null");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesIsNotNull() {
            addCriterion("remainder_sales is not null");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesEqualTo(Double value) {
            addCriterion("remainder_sales =", value, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesNotEqualTo(Double value) {
            addCriterion("remainder_sales <>", value, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesGreaterThan(Double value) {
            addCriterion("remainder_sales >", value, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesGreaterThanOrEqualTo(Double value) {
            addCriterion("remainder_sales >=", value, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesLessThan(Double value) {
            addCriterion("remainder_sales <", value, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesLessThanOrEqualTo(Double value) {
            addCriterion("remainder_sales <=", value, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesIn(List<Double> values) {
            addCriterion("remainder_sales in", values, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesNotIn(List<Double> values) {
            addCriterion("remainder_sales not in", values, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesBetween(Double value1, Double value2) {
            addCriterion("remainder_sales between", value1, value2, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderSalesNotBetween(Double value1, Double value2) {
            addCriterion("remainder_sales not between", value1, value2, "remainderSales");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberIsNull() {
            addCriterion("remainder_bonus_number is null");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberIsNotNull() {
            addCriterion("remainder_bonus_number is not null");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberEqualTo(Integer value) {
            addCriterion("remainder_bonus_number =", value, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberNotEqualTo(Integer value) {
            addCriterion("remainder_bonus_number <>", value, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberGreaterThan(Integer value) {
            addCriterion("remainder_bonus_number >", value, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainder_bonus_number >=", value, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberLessThan(Integer value) {
            addCriterion("remainder_bonus_number <", value, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberLessThanOrEqualTo(Integer value) {
            addCriterion("remainder_bonus_number <=", value, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberIn(List<Integer> values) {
            addCriterion("remainder_bonus_number in", values, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberNotIn(List<Integer> values) {
            addCriterion("remainder_bonus_number not in", values, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberBetween(Integer value1, Integer value2) {
            addCriterion("remainder_bonus_number between", value1, value2, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andRemainderBonusNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("remainder_bonus_number not between", value1, value2, "remainderBonusNumber");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyIsNull() {
            addCriterion("bonus_total_money is null");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyIsNotNull() {
            addCriterion("bonus_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyEqualTo(Double value) {
            addCriterion("bonus_total_money =", value, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyNotEqualTo(Double value) {
            addCriterion("bonus_total_money <>", value, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyGreaterThan(Double value) {
            addCriterion("bonus_total_money >", value, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bonus_total_money >=", value, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyLessThan(Double value) {
            addCriterion("bonus_total_money <", value, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bonus_total_money <=", value, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyIn(List<Double> values) {
            addCriterion("bonus_total_money in", values, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyNotIn(List<Double> values) {
            addCriterion("bonus_total_money not in", values, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("bonus_total_money between", value1, value2, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBonusTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bonus_total_money not between", value1, value2, "bonusTotalMoney");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagIsNull() {
            addCriterion("blanklist_flag is null");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagIsNotNull() {
            addCriterion("blanklist_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagEqualTo(Integer value) {
            addCriterion("blanklist_flag =", value, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagNotEqualTo(Integer value) {
            addCriterion("blanklist_flag <>", value, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagGreaterThan(Integer value) {
            addCriterion("blanklist_flag >", value, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("blanklist_flag >=", value, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagLessThan(Integer value) {
            addCriterion("blanklist_flag <", value, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagLessThanOrEqualTo(Integer value) {
            addCriterion("blanklist_flag <=", value, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagIn(List<Integer> values) {
            addCriterion("blanklist_flag in", values, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagNotIn(List<Integer> values) {
            addCriterion("blanklist_flag not in", values, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagBetween(Integer value1, Integer value2) {
            addCriterion("blanklist_flag between", value1, value2, "blanklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlanklistFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("blanklist_flag not between", value1, value2, "blanklistFlag");
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