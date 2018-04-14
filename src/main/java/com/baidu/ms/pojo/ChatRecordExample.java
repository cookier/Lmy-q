package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatRecordExample() {
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

        public Criteria andChatTypeIsNull() {
            addCriterion("chat_type is null");
            return (Criteria) this;
        }

        public Criteria andChatTypeIsNotNull() {
            addCriterion("chat_type is not null");
            return (Criteria) this;
        }

        public Criteria andChatTypeEqualTo(Integer value) {
            addCriterion("chat_type =", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeNotEqualTo(Integer value) {
            addCriterion("chat_type <>", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeGreaterThan(Integer value) {
            addCriterion("chat_type >", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_type >=", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeLessThan(Integer value) {
            addCriterion("chat_type <", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("chat_type <=", value, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeIn(List<Integer> values) {
            addCriterion("chat_type in", values, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeNotIn(List<Integer> values) {
            addCriterion("chat_type not in", values, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeBetween(Integer value1, Integer value2) {
            addCriterion("chat_type between", value1, value2, "chatType");
            return (Criteria) this;
        }

        public Criteria andChatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_type not between", value1, value2, "chatType");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNull() {
            addCriterion("user1_id is null");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNotNull() {
            addCriterion("user1_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser1IdEqualTo(Integer value) {
            addCriterion("user1_id =", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotEqualTo(Integer value) {
            addCriterion("user1_id <>", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThan(Integer value) {
            addCriterion("user1_id >", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user1_id >=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThan(Integer value) {
            addCriterion("user1_id <", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThanOrEqualTo(Integer value) {
            addCriterion("user1_id <=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdIn(List<Integer> values) {
            addCriterion("user1_id in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotIn(List<Integer> values) {
            addCriterion("user1_id not in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdBetween(Integer value1, Integer value2) {
            addCriterion("user1_id between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("user1_id not between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNull() {
            addCriterion("user2_id is null");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNotNull() {
            addCriterion("user2_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser2IdEqualTo(Integer value) {
            addCriterion("user2_id =", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotEqualTo(Integer value) {
            addCriterion("user2_id <>", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThan(Integer value) {
            addCriterion("user2_id >", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user2_id >=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThan(Integer value) {
            addCriterion("user2_id <", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThanOrEqualTo(Integer value) {
            addCriterion("user2_id <=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIn(List<Integer> values) {
            addCriterion("user2_id in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotIn(List<Integer> values) {
            addCriterion("user2_id not in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdBetween(Integer value1, Integer value2) {
            addCriterion("user2_id between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("user2_id not between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdIsNull() {
            addCriterion("shop1_id is null");
            return (Criteria) this;
        }

        public Criteria andShop1IdIsNotNull() {
            addCriterion("shop1_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop1IdEqualTo(Integer value) {
            addCriterion("shop1_id =", value, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdNotEqualTo(Integer value) {
            addCriterion("shop1_id <>", value, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdGreaterThan(Integer value) {
            addCriterion("shop1_id >", value, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop1_id >=", value, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdLessThan(Integer value) {
            addCriterion("shop1_id <", value, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdLessThanOrEqualTo(Integer value) {
            addCriterion("shop1_id <=", value, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdIn(List<Integer> values) {
            addCriterion("shop1_id in", values, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdNotIn(List<Integer> values) {
            addCriterion("shop1_id not in", values, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdBetween(Integer value1, Integer value2) {
            addCriterion("shop1_id between", value1, value2, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop1_id not between", value1, value2, "shop1Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdIsNull() {
            addCriterion("shop2_id is null");
            return (Criteria) this;
        }

        public Criteria andShop2IdIsNotNull() {
            addCriterion("shop2_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop2IdEqualTo(Integer value) {
            addCriterion("shop2_id =", value, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdNotEqualTo(Integer value) {
            addCriterion("shop2_id <>", value, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdGreaterThan(Integer value) {
            addCriterion("shop2_id >", value, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop2_id >=", value, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdLessThan(Integer value) {
            addCriterion("shop2_id <", value, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdLessThanOrEqualTo(Integer value) {
            addCriterion("shop2_id <=", value, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdIn(List<Integer> values) {
            addCriterion("shop2_id in", values, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdNotIn(List<Integer> values) {
            addCriterion("shop2_id not in", values, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdBetween(Integer value1, Integer value2) {
            addCriterion("shop2_id between", value1, value2, "shop2Id");
            return (Criteria) this;
        }

        public Criteria andShop2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop2_id not between", value1, value2, "shop2Id");
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

        public Criteria andLastTimeProxyReadLengthIsNull() {
            addCriterion("last_time_proxy_read_length is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthIsNotNull() {
            addCriterion("last_time_proxy_read_length is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthEqualTo(Integer value) {
            addCriterion("last_time_proxy_read_length =", value, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthNotEqualTo(Integer value) {
            addCriterion("last_time_proxy_read_length <>", value, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthGreaterThan(Integer value) {
            addCriterion("last_time_proxy_read_length >", value, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_time_proxy_read_length >=", value, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthLessThan(Integer value) {
            addCriterion("last_time_proxy_read_length <", value, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthLessThanOrEqualTo(Integer value) {
            addCriterion("last_time_proxy_read_length <=", value, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthIn(List<Integer> values) {
            addCriterion("last_time_proxy_read_length in", values, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthNotIn(List<Integer> values) {
            addCriterion("last_time_proxy_read_length not in", values, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthBetween(Integer value1, Integer value2) {
            addCriterion("last_time_proxy_read_length between", value1, value2, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeProxyReadLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("last_time_proxy_read_length not between", value1, value2, "lastTimeProxyReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthIsNull() {
            addCriterion("last_time_supplier_read_length is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthIsNotNull() {
            addCriterion("last_time_supplier_read_length is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthEqualTo(Integer value) {
            addCriterion("last_time_supplier_read_length =", value, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthNotEqualTo(Integer value) {
            addCriterion("last_time_supplier_read_length <>", value, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthGreaterThan(Integer value) {
            addCriterion("last_time_supplier_read_length >", value, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_time_supplier_read_length >=", value, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthLessThan(Integer value) {
            addCriterion("last_time_supplier_read_length <", value, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthLessThanOrEqualTo(Integer value) {
            addCriterion("last_time_supplier_read_length <=", value, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthIn(List<Integer> values) {
            addCriterion("last_time_supplier_read_length in", values, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthNotIn(List<Integer> values) {
            addCriterion("last_time_supplier_read_length not in", values, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthBetween(Integer value1, Integer value2) {
            addCriterion("last_time_supplier_read_length between", value1, value2, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSupplierReadLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("last_time_supplier_read_length not between", value1, value2, "lastTimeSupplierReadLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthIsNull() {
            addCriterion("last_time_save_length is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthIsNotNull() {
            addCriterion("last_time_save_length is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthEqualTo(Integer value) {
            addCriterion("last_time_save_length =", value, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthNotEqualTo(Integer value) {
            addCriterion("last_time_save_length <>", value, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthGreaterThan(Integer value) {
            addCriterion("last_time_save_length >", value, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_time_save_length >=", value, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthLessThan(Integer value) {
            addCriterion("last_time_save_length <", value, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthLessThanOrEqualTo(Integer value) {
            addCriterion("last_time_save_length <=", value, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthIn(List<Integer> values) {
            addCriterion("last_time_save_length in", values, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthNotIn(List<Integer> values) {
            addCriterion("last_time_save_length not in", values, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthBetween(Integer value1, Integer value2) {
            addCriterion("last_time_save_length between", value1, value2, "lastTimeSaveLength");
            return (Criteria) this;
        }

        public Criteria andLastTimeSaveLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("last_time_save_length not between", value1, value2, "lastTimeSaveLength");
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