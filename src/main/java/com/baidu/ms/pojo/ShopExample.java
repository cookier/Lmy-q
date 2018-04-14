package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopNoIsNull() {
            addCriterion("shop_no is null");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNotNull() {
            addCriterion("shop_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopNoEqualTo(String value) {
            addCriterion("shop_no =", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotEqualTo(String value) {
            addCriterion("shop_no <>", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThan(String value) {
            addCriterion("shop_no >", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_no >=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThan(String value) {
            addCriterion("shop_no <", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThanOrEqualTo(String value) {
            addCriterion("shop_no <=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLike(String value) {
            addCriterion("shop_no like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotLike(String value) {
            addCriterion("shop_no not like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIn(List<String> values) {
            addCriterion("shop_no in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotIn(List<String> values) {
            addCriterion("shop_no not in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoBetween(String value1, String value2) {
            addCriterion("shop_no between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotBetween(String value1, String value2) {
            addCriterion("shop_no not between", value1, value2, "shopNo");
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

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
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

        public Criteria andCertificationTypeIsNull() {
            addCriterion("certification_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeIsNotNull() {
            addCriterion("certification_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeEqualTo(Integer value) {
            addCriterion("certification_type =", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeNotEqualTo(Integer value) {
            addCriterion("certification_type <>", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeGreaterThan(Integer value) {
            addCriterion("certification_type >", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("certification_type >=", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeLessThan(Integer value) {
            addCriterion("certification_type <", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("certification_type <=", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeIn(List<Integer> values) {
            addCriterion("certification_type in", values, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeNotIn(List<Integer> values) {
            addCriterion("certification_type not in", values, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBetween(Integer value1, Integer value2) {
            addCriterion("certification_type between", value1, value2, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("certification_type not between", value1, value2, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusIsNull() {
            addCriterion("certification_status is null");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusIsNotNull() {
            addCriterion("certification_status is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusEqualTo(Integer value) {
            addCriterion("certification_status =", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusNotEqualTo(Integer value) {
            addCriterion("certification_status <>", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusGreaterThan(Integer value) {
            addCriterion("certification_status >", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("certification_status >=", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusLessThan(Integer value) {
            addCriterion("certification_status <", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("certification_status <=", value, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusIn(List<Integer> values) {
            addCriterion("certification_status in", values, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusNotIn(List<Integer> values) {
            addCriterion("certification_status not in", values, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusBetween(Integer value1, Integer value2) {
            addCriterion("certification_status between", value1, value2, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("certification_status not between", value1, value2, "certificationStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoIsNull() {
            addCriterion("certification_info is null");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoIsNotNull() {
            addCriterion("certification_info is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoEqualTo(String value) {
            addCriterion("certification_info =", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoNotEqualTo(String value) {
            addCriterion("certification_info <>", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoGreaterThan(String value) {
            addCriterion("certification_info >", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoGreaterThanOrEqualTo(String value) {
            addCriterion("certification_info >=", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoLessThan(String value) {
            addCriterion("certification_info <", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoLessThanOrEqualTo(String value) {
            addCriterion("certification_info <=", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoLike(String value) {
            addCriterion("certification_info like", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoNotLike(String value) {
            addCriterion("certification_info not like", value, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoIn(List<String> values) {
            addCriterion("certification_info in", values, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoNotIn(List<String> values) {
            addCriterion("certification_info not in", values, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoBetween(String value1, String value2) {
            addCriterion("certification_info between", value1, value2, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andCertificationInfoNotBetween(String value1, String value2) {
            addCriterion("certification_info not between", value1, value2, "certificationInfo");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(Date value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(Date value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(Date value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(Date value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(Date value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<Date> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<Date> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(Date value1, Date value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(Date value1, Date value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactQqIsNull() {
            addCriterion("contact_qq is null");
            return (Criteria) this;
        }

        public Criteria andContactQqIsNotNull() {
            addCriterion("contact_qq is not null");
            return (Criteria) this;
        }

        public Criteria andContactQqEqualTo(String value) {
            addCriterion("contact_qq =", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqNotEqualTo(String value) {
            addCriterion("contact_qq <>", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqGreaterThan(String value) {
            addCriterion("contact_qq >", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqGreaterThanOrEqualTo(String value) {
            addCriterion("contact_qq >=", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqLessThan(String value) {
            addCriterion("contact_qq <", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqLessThanOrEqualTo(String value) {
            addCriterion("contact_qq <=", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqLike(String value) {
            addCriterion("contact_qq like", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqNotLike(String value) {
            addCriterion("contact_qq not like", value, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqIn(List<String> values) {
            addCriterion("contact_qq in", values, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqNotIn(List<String> values) {
            addCriterion("contact_qq not in", values, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqBetween(String value1, String value2) {
            addCriterion("contact_qq between", value1, value2, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactQqNotBetween(String value1, String value2) {
            addCriterion("contact_qq not between", value1, value2, "contactQq");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNull() {
            addCriterion("contact_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNotNull() {
            addCriterion("contact_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactMobileEqualTo(String value) {
            addCriterion("contact_mobile =", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotEqualTo(String value) {
            addCriterion("contact_mobile <>", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThan(String value) {
            addCriterion("contact_mobile >", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mobile >=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThan(String value) {
            addCriterion("contact_mobile <", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThanOrEqualTo(String value) {
            addCriterion("contact_mobile <=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLike(String value) {
            addCriterion("contact_mobile like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotLike(String value) {
            addCriterion("contact_mobile not like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileIn(List<String> values) {
            addCriterion("contact_mobile in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotIn(List<String> values) {
            addCriterion("contact_mobile not in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileBetween(String value1, String value2) {
            addCriterion("contact_mobile between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotBetween(String value1, String value2) {
            addCriterion("contact_mobile not between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactWeixinIsNull() {
            addCriterion("contact_weixin is null");
            return (Criteria) this;
        }

        public Criteria andContactWeixinIsNotNull() {
            addCriterion("contact_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andContactWeixinEqualTo(String value) {
            addCriterion("contact_weixin =", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinNotEqualTo(String value) {
            addCriterion("contact_weixin <>", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinGreaterThan(String value) {
            addCriterion("contact_weixin >", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("contact_weixin >=", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinLessThan(String value) {
            addCriterion("contact_weixin <", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinLessThanOrEqualTo(String value) {
            addCriterion("contact_weixin <=", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinLike(String value) {
            addCriterion("contact_weixin like", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinNotLike(String value) {
            addCriterion("contact_weixin not like", value, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinIn(List<String> values) {
            addCriterion("contact_weixin in", values, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinNotIn(List<String> values) {
            addCriterion("contact_weixin not in", values, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinBetween(String value1, String value2) {
            addCriterion("contact_weixin between", value1, value2, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andContactWeixinNotBetween(String value1, String value2) {
            addCriterion("contact_weixin not between", value1, value2, "contactWeixin");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("service_phone is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("service_phone =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("service_phone <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("service_phone >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("service_phone <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("service_phone <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("service_phone like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("service_phone not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("service_phone in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("service_phone not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("service_phone between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("service_phone not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNull() {
            addCriterion("street_id is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("street_id is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(Integer value) {
            addCriterion("street_id =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(Integer value) {
            addCriterion("street_id <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(Integer value) {
            addCriterion("street_id >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("street_id >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(Integer value) {
            addCriterion("street_id <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(Integer value) {
            addCriterion("street_id <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<Integer> values) {
            addCriterion("street_id in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<Integer> values) {
            addCriterion("street_id not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(Integer value1, Integer value2) {
            addCriterion("street_id between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("street_id not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNull() {
            addCriterion("street_name is null");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNotNull() {
            addCriterion("street_name is not null");
            return (Criteria) this;
        }

        public Criteria andStreetNameEqualTo(String value) {
            addCriterion("street_name =", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotEqualTo(String value) {
            addCriterion("street_name <>", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThan(String value) {
            addCriterion("street_name >", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThanOrEqualTo(String value) {
            addCriterion("street_name >=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThan(String value) {
            addCriterion("street_name <", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThanOrEqualTo(String value) {
            addCriterion("street_name <=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLike(String value) {
            addCriterion("street_name like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotLike(String value) {
            addCriterion("street_name not like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameIn(List<String> values) {
            addCriterion("street_name in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotIn(List<String> values) {
            addCriterion("street_name not in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameBetween(String value1, String value2) {
            addCriterion("street_name between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotBetween(String value1, String value2) {
            addCriterion("street_name not between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
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

        public Criteria andGoodsCategoryIsNull() {
            addCriterion("goods_category is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIsNotNull() {
            addCriterion("goods_category is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryEqualTo(String value) {
            addCriterion("goods_category =", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotEqualTo(String value) {
            addCriterion("goods_category <>", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThan(String value) {
            addCriterion("goods_category >", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("goods_category >=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThan(String value) {
            addCriterion("goods_category <", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThanOrEqualTo(String value) {
            addCriterion("goods_category <=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLike(String value) {
            addCriterion("goods_category like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotLike(String value) {
            addCriterion("goods_category not like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIn(List<String> values) {
            addCriterion("goods_category in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotIn(List<String> values) {
            addCriterion("goods_category not in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryBetween(String value1, String value2) {
            addCriterion("goods_category between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotBetween(String value1, String value2) {
            addCriterion("goods_category not between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andCommonSettingIsNull() {
            addCriterion("common_setting is null");
            return (Criteria) this;
        }

        public Criteria andCommonSettingIsNotNull() {
            addCriterion("common_setting is not null");
            return (Criteria) this;
        }

        public Criteria andCommonSettingEqualTo(String value) {
            addCriterion("common_setting =", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingNotEqualTo(String value) {
            addCriterion("common_setting <>", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingGreaterThan(String value) {
            addCriterion("common_setting >", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingGreaterThanOrEqualTo(String value) {
            addCriterion("common_setting >=", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingLessThan(String value) {
            addCriterion("common_setting <", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingLessThanOrEqualTo(String value) {
            addCriterion("common_setting <=", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingLike(String value) {
            addCriterion("common_setting like", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingNotLike(String value) {
            addCriterion("common_setting not like", value, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingIn(List<String> values) {
            addCriterion("common_setting in", values, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingNotIn(List<String> values) {
            addCriterion("common_setting not in", values, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingBetween(String value1, String value2) {
            addCriterion("common_setting between", value1, value2, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andCommonSettingNotBetween(String value1, String value2) {
            addCriterion("common_setting not between", value1, value2, "commonSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingIsNull() {
            addCriterion("trade_setting is null");
            return (Criteria) this;
        }

        public Criteria andTradeSettingIsNotNull() {
            addCriterion("trade_setting is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSettingEqualTo(String value) {
            addCriterion("trade_setting =", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingNotEqualTo(String value) {
            addCriterion("trade_setting <>", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingGreaterThan(String value) {
            addCriterion("trade_setting >", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingGreaterThanOrEqualTo(String value) {
            addCriterion("trade_setting >=", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingLessThan(String value) {
            addCriterion("trade_setting <", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingLessThanOrEqualTo(String value) {
            addCriterion("trade_setting <=", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingLike(String value) {
            addCriterion("trade_setting like", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingNotLike(String value) {
            addCriterion("trade_setting not like", value, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingIn(List<String> values) {
            addCriterion("trade_setting in", values, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingNotIn(List<String> values) {
            addCriterion("trade_setting not in", values, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingBetween(String value1, String value2) {
            addCriterion("trade_setting between", value1, value2, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andTradeSettingNotBetween(String value1, String value2) {
            addCriterion("trade_setting not between", value1, value2, "tradeSetting");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingIsNull() {
            addCriterion("weixin_setting is null");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingIsNotNull() {
            addCriterion("weixin_setting is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingEqualTo(String value) {
            addCriterion("weixin_setting =", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingNotEqualTo(String value) {
            addCriterion("weixin_setting <>", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingGreaterThan(String value) {
            addCriterion("weixin_setting >", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_setting >=", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingLessThan(String value) {
            addCriterion("weixin_setting <", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingLessThanOrEqualTo(String value) {
            addCriterion("weixin_setting <=", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingLike(String value) {
            addCriterion("weixin_setting like", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingNotLike(String value) {
            addCriterion("weixin_setting not like", value, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingIn(List<String> values) {
            addCriterion("weixin_setting in", values, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingNotIn(List<String> values) {
            addCriterion("weixin_setting not in", values, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingBetween(String value1, String value2) {
            addCriterion("weixin_setting between", value1, value2, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andWeixinSettingNotBetween(String value1, String value2) {
            addCriterion("weixin_setting not between", value1, value2, "weixinSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingIsNull() {
            addCriterion("payment_setting is null");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingIsNotNull() {
            addCriterion("payment_setting is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingEqualTo(String value) {
            addCriterion("payment_setting =", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingNotEqualTo(String value) {
            addCriterion("payment_setting <>", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingGreaterThan(String value) {
            addCriterion("payment_setting >", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingGreaterThanOrEqualTo(String value) {
            addCriterion("payment_setting >=", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingLessThan(String value) {
            addCriterion("payment_setting <", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingLessThanOrEqualTo(String value) {
            addCriterion("payment_setting <=", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingLike(String value) {
            addCriterion("payment_setting like", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingNotLike(String value) {
            addCriterion("payment_setting not like", value, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingIn(List<String> values) {
            addCriterion("payment_setting in", values, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingNotIn(List<String> values) {
            addCriterion("payment_setting not in", values, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingBetween(String value1, String value2) {
            addCriterion("payment_setting between", value1, value2, "paymentSetting");
            return (Criteria) this;
        }

        public Criteria andPaymentSettingNotBetween(String value1, String value2) {
            addCriterion("payment_setting not between", value1, value2, "paymentSetting");
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

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(Float value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(Float value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(Float value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(Float value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(Float value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(Float value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<Float> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<Float> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(Float value1, Float value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(Float value1, Float value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
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

        public Criteria andRefundSettingIsNull() {
            addCriterion("refund_setting is null");
            return (Criteria) this;
        }

        public Criteria andRefundSettingIsNotNull() {
            addCriterion("refund_setting is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSettingEqualTo(String value) {
            addCriterion("refund_setting =", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingNotEqualTo(String value) {
            addCriterion("refund_setting <>", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingGreaterThan(String value) {
            addCriterion("refund_setting >", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingGreaterThanOrEqualTo(String value) {
            addCriterion("refund_setting >=", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingLessThan(String value) {
            addCriterion("refund_setting <", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingLessThanOrEqualTo(String value) {
            addCriterion("refund_setting <=", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingLike(String value) {
            addCriterion("refund_setting like", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingNotLike(String value) {
            addCriterion("refund_setting not like", value, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingIn(List<String> values) {
            addCriterion("refund_setting in", values, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingNotIn(List<String> values) {
            addCriterion("refund_setting not in", values, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingBetween(String value1, String value2) {
            addCriterion("refund_setting between", value1, value2, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andRefundSettingNotBetween(String value1, String value2) {
            addCriterion("refund_setting not between", value1, value2, "refundSetting");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagIsNull() {
            addCriterion("logo_update_flag is null");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagIsNotNull() {
            addCriterion("logo_update_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagEqualTo(Short value) {
            addCriterion("logo_update_flag =", value, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagNotEqualTo(Short value) {
            addCriterion("logo_update_flag <>", value, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagGreaterThan(Short value) {
            addCriterion("logo_update_flag >", value, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("logo_update_flag >=", value, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagLessThan(Short value) {
            addCriterion("logo_update_flag <", value, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagLessThanOrEqualTo(Short value) {
            addCriterion("logo_update_flag <=", value, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagIn(List<Short> values) {
            addCriterion("logo_update_flag in", values, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagNotIn(List<Short> values) {
            addCriterion("logo_update_flag not in", values, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagBetween(Short value1, Short value2) {
            addCriterion("logo_update_flag between", value1, value2, "logoUpdateFlag");
            return (Criteria) this;
        }

        public Criteria andLogoUpdateFlagNotBetween(Short value1, Short value2) {
            addCriterion("logo_update_flag not between", value1, value2, "logoUpdateFlag");
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