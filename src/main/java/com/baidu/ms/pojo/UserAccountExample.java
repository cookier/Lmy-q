package com.baidu.ms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAvailableMoneyIsNull() {
            addCriterion("available_money is null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyIsNotNull() {
            addCriterion("available_money is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyEqualTo(Double value) {
            addCriterion("available_money =", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyNotEqualTo(Double value) {
            addCriterion("available_money <>", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyGreaterThan(Double value) {
            addCriterion("available_money >", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("available_money >=", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyLessThan(Double value) {
            addCriterion("available_money <", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyLessThanOrEqualTo(Double value) {
            addCriterion("available_money <=", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyIn(List<Double> values) {
            addCriterion("available_money in", values, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyNotIn(List<Double> values) {
            addCriterion("available_money not in", values, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBetween(Double value1, Double value2) {
            addCriterion("available_money between", value1, value2, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyNotBetween(Double value1, Double value2) {
            addCriterion("available_money not between", value1, value2, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyIsNull() {
            addCriterion("settlement_money is null");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyIsNotNull() {
            addCriterion("settlement_money is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyEqualTo(Double value) {
            addCriterion("settlement_money =", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyNotEqualTo(Double value) {
            addCriterion("settlement_money <>", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyGreaterThan(Double value) {
            addCriterion("settlement_money >", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("settlement_money >=", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyLessThan(Double value) {
            addCriterion("settlement_money <", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyLessThanOrEqualTo(Double value) {
            addCriterion("settlement_money <=", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyIn(List<Double> values) {
            addCriterion("settlement_money in", values, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyNotIn(List<Double> values) {
            addCriterion("settlement_money not in", values, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyBetween(Double value1, Double value2) {
            addCriterion("settlement_money between", value1, value2, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyNotBetween(Double value1, Double value2) {
            addCriterion("settlement_money not between", value1, value2, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNull() {
            addCriterion("deposit_money is null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNotNull() {
            addCriterion("deposit_money is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyEqualTo(Double value) {
            addCriterion("deposit_money =", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotEqualTo(Double value) {
            addCriterion("deposit_money <>", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThan(Double value) {
            addCriterion("deposit_money >", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit_money >=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThan(Double value) {
            addCriterion("deposit_money <", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThanOrEqualTo(Double value) {
            addCriterion("deposit_money <=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIn(List<Double> values) {
            addCriterion("deposit_money in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotIn(List<Double> values) {
            addCriterion("deposit_money not in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyBetween(Double value1, Double value2) {
            addCriterion("deposit_money between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotBetween(Double value1, Double value2) {
            addCriterion("deposit_money not between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNull() {
            addCriterion("bank_card_number is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNotNull() {
            addCriterion("bank_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberEqualTo(String value) {
            addCriterion("bank_card_number =", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotEqualTo(String value) {
            addCriterion("bank_card_number <>", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThan(String value) {
            addCriterion("bank_card_number >", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_number >=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThan(String value) {
            addCriterion("bank_card_number <", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_card_number <=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLike(String value) {
            addCriterion("bank_card_number like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotLike(String value) {
            addCriterion("bank_card_number not like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIn(List<String> values) {
            addCriterion("bank_card_number in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotIn(List<String> values) {
            addCriterion("bank_card_number not in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberBetween(String value1, String value2) {
            addCriterion("bank_card_number between", value1, value2, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotBetween(String value1, String value2) {
            addCriterion("bank_card_number not between", value1, value2, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameIsNull() {
            addCriterion("bank_deposit_name is null");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameIsNotNull() {
            addCriterion("bank_deposit_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameEqualTo(String value) {
            addCriterion("bank_deposit_name =", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameNotEqualTo(String value) {
            addCriterion("bank_deposit_name <>", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameGreaterThan(String value) {
            addCriterion("bank_deposit_name >", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_deposit_name >=", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameLessThan(String value) {
            addCriterion("bank_deposit_name <", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameLessThanOrEqualTo(String value) {
            addCriterion("bank_deposit_name <=", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameLike(String value) {
            addCriterion("bank_deposit_name like", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameNotLike(String value) {
            addCriterion("bank_deposit_name not like", value, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameIn(List<String> values) {
            addCriterion("bank_deposit_name in", values, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameNotIn(List<String> values) {
            addCriterion("bank_deposit_name not in", values, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameBetween(String value1, String value2) {
            addCriterion("bank_deposit_name between", value1, value2, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andBankDepositNameNotBetween(String value1, String value2) {
            addCriterion("bank_deposit_name not between", value1, value2, "bankDepositName");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNull() {
            addCriterion("alipay_account is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNotNull() {
            addCriterion("alipay_account is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountEqualTo(String value) {
            addCriterion("alipay_account =", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotEqualTo(String value) {
            addCriterion("alipay_account <>", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThan(String value) {
            addCriterion("alipay_account >", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_account >=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThan(String value) {
            addCriterion("alipay_account <", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThanOrEqualTo(String value) {
            addCriterion("alipay_account <=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLike(String value) {
            addCriterion("alipay_account like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotLike(String value) {
            addCriterion("alipay_account not like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIn(List<String> values) {
            addCriterion("alipay_account in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotIn(List<String> values) {
            addCriterion("alipay_account not in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountBetween(String value1, String value2) {
            addCriterion("alipay_account between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotBetween(String value1, String value2) {
            addCriterion("alipay_account not between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameIsNull() {
            addCriterion("alipay_valid_name is null");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameIsNotNull() {
            addCriterion("alipay_valid_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameEqualTo(String value) {
            addCriterion("alipay_valid_name =", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameNotEqualTo(String value) {
            addCriterion("alipay_valid_name <>", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameGreaterThan(String value) {
            addCriterion("alipay_valid_name >", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_valid_name >=", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameLessThan(String value) {
            addCriterion("alipay_valid_name <", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameLessThanOrEqualTo(String value) {
            addCriterion("alipay_valid_name <=", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameLike(String value) {
            addCriterion("alipay_valid_name like", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameNotLike(String value) {
            addCriterion("alipay_valid_name not like", value, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameIn(List<String> values) {
            addCriterion("alipay_valid_name in", values, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameNotIn(List<String> values) {
            addCriterion("alipay_valid_name not in", values, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameBetween(String value1, String value2) {
            addCriterion("alipay_valid_name between", value1, value2, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andAlipayValidNameNotBetween(String value1, String value2) {
            addCriterion("alipay_valid_name not between", value1, value2, "alipayValidName");
            return (Criteria) this;
        }

        public Criteria andWechatAccountIsNull() {
            addCriterion("wechat_account is null");
            return (Criteria) this;
        }

        public Criteria andWechatAccountIsNotNull() {
            addCriterion("wechat_account is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAccountEqualTo(String value) {
            addCriterion("wechat_account =", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountNotEqualTo(String value) {
            addCriterion("wechat_account <>", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountGreaterThan(String value) {
            addCriterion("wechat_account >", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_account >=", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountLessThan(String value) {
            addCriterion("wechat_account <", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountLessThanOrEqualTo(String value) {
            addCriterion("wechat_account <=", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountLike(String value) {
            addCriterion("wechat_account like", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountNotLike(String value) {
            addCriterion("wechat_account not like", value, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountIn(List<String> values) {
            addCriterion("wechat_account in", values, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountNotIn(List<String> values) {
            addCriterion("wechat_account not in", values, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountBetween(String value1, String value2) {
            addCriterion("wechat_account between", value1, value2, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWechatAccountNotBetween(String value1, String value2) {
            addCriterion("wechat_account not between", value1, value2, "wechatAccount");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameIsNull() {
            addCriterion("wechar_valid_name is null");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameIsNotNull() {
            addCriterion("wechar_valid_name is not null");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameEqualTo(String value) {
            addCriterion("wechar_valid_name =", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameNotEqualTo(String value) {
            addCriterion("wechar_valid_name <>", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameGreaterThan(String value) {
            addCriterion("wechar_valid_name >", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechar_valid_name >=", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameLessThan(String value) {
            addCriterion("wechar_valid_name <", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameLessThanOrEqualTo(String value) {
            addCriterion("wechar_valid_name <=", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameLike(String value) {
            addCriterion("wechar_valid_name like", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameNotLike(String value) {
            addCriterion("wechar_valid_name not like", value, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameIn(List<String> values) {
            addCriterion("wechar_valid_name in", values, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameNotIn(List<String> values) {
            addCriterion("wechar_valid_name not in", values, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameBetween(String value1, String value2) {
            addCriterion("wechar_valid_name between", value1, value2, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andWecharValidNameNotBetween(String value1, String value2) {
            addCriterion("wechar_valid_name not between", value1, value2, "wecharValidName");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageIsNull() {
            addCriterion("deduct_percentage is null");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageIsNotNull() {
            addCriterion("deduct_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageEqualTo(Double value) {
            addCriterion("deduct_percentage =", value, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageNotEqualTo(Double value) {
            addCriterion("deduct_percentage <>", value, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageGreaterThan(Double value) {
            addCriterion("deduct_percentage >", value, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_percentage >=", value, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageLessThan(Double value) {
            addCriterion("deduct_percentage <", value, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageLessThanOrEqualTo(Double value) {
            addCriterion("deduct_percentage <=", value, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageIn(List<Double> values) {
            addCriterion("deduct_percentage in", values, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageNotIn(List<Double> values) {
            addCriterion("deduct_percentage not in", values, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageBetween(Double value1, Double value2) {
            addCriterion("deduct_percentage between", value1, value2, "deductPercentage");
            return (Criteria) this;
        }

        public Criteria andDeductPercentageNotBetween(Double value1, Double value2) {
            addCriterion("deduct_percentage not between", value1, value2, "deductPercentage");
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

        public Criteria andBonusNumIsNull() {
            addCriterion("bonus_num is null");
            return (Criteria) this;
        }

        public Criteria andBonusNumIsNotNull() {
            addCriterion("bonus_num is not null");
            return (Criteria) this;
        }

        public Criteria andBonusNumEqualTo(Integer value) {
            addCriterion("bonus_num =", value, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumNotEqualTo(Integer value) {
            addCriterion("bonus_num <>", value, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumGreaterThan(Integer value) {
            addCriterion("bonus_num >", value, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_num >=", value, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumLessThan(Integer value) {
            addCriterion("bonus_num <", value, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_num <=", value, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumIn(List<Integer> values) {
            addCriterion("bonus_num in", values, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumNotIn(List<Integer> values) {
            addCriterion("bonus_num not in", values, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumBetween(Integer value1, Integer value2) {
            addCriterion("bonus_num between", value1, value2, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_num not between", value1, value2, "bonusNum");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyIsNull() {
            addCriterion("bonus_money is null");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyIsNotNull() {
            addCriterion("bonus_money is not null");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyEqualTo(Double value) {
            addCriterion("bonus_money =", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyNotEqualTo(Double value) {
            addCriterion("bonus_money <>", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyGreaterThan(Double value) {
            addCriterion("bonus_money >", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bonus_money >=", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyLessThan(Double value) {
            addCriterion("bonus_money <", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bonus_money <=", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyIn(List<Double> values) {
            addCriterion("bonus_money in", values, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyNotIn(List<Double> values) {
            addCriterion("bonus_money not in", values, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyBetween(Double value1, Double value2) {
            addCriterion("bonus_money between", value1, value2, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bonus_money not between", value1, value2, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIsNull() {
            addCriterion("commission_money is null");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIsNotNull() {
            addCriterion("commission_money is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyEqualTo(Double value) {
            addCriterion("commission_money =", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotEqualTo(Double value) {
            addCriterion("commission_money <>", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyGreaterThan(Double value) {
            addCriterion("commission_money >", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("commission_money >=", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyLessThan(Double value) {
            addCriterion("commission_money <", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyLessThanOrEqualTo(Double value) {
            addCriterion("commission_money <=", value, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyIn(List<Double> values) {
            addCriterion("commission_money in", values, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotIn(List<Double> values) {
            addCriterion("commission_money not in", values, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyBetween(Double value1, Double value2) {
            addCriterion("commission_money between", value1, value2, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionMoneyNotBetween(Double value1, Double value2) {
            addCriterion("commission_money not between", value1, value2, "commissionMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateIsNull() {
            addCriterion("last_day_settlement_date is null");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateIsNotNull() {
            addCriterion("last_day_settlement_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_day_settlement_date =", value, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_day_settlement_date <>", value, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_day_settlement_date >", value, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_day_settlement_date >=", value, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateLessThan(Date value) {
            addCriterionForJDBCDate("last_day_settlement_date <", value, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_day_settlement_date <=", value, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_day_settlement_date in", values, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_day_settlement_date not in", values, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_day_settlement_date between", value1, value2, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_day_settlement_date not between", value1, value2, "lastDaySettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateIsNull() {
            addCriterion("last_dividend_quota_settlement_date is null");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateIsNotNull() {
            addCriterion("last_dividend_quota_settlement_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date =", value, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date <>", value, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date >", value, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date >=", value, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateLessThan(Date value) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date <", value, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date <=", value, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date in", values, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date not in", values, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date between", value1, value2, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andLastDividendQuotaSettlementDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_dividend_quota_settlement_date not between", value1, value2, "lastDividendQuotaSettlementDate");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyIsNull() {
            addCriterion("order_commission_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyIsNotNull() {
            addCriterion("order_commission_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyEqualTo(Double value) {
            addCriterion("order_commission_money =", value, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyNotEqualTo(Double value) {
            addCriterion("order_commission_money <>", value, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyGreaterThan(Double value) {
            addCriterion("order_commission_money >", value, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("order_commission_money >=", value, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyLessThan(Double value) {
            addCriterion("order_commission_money <", value, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyLessThanOrEqualTo(Double value) {
            addCriterion("order_commission_money <=", value, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyIn(List<Double> values) {
            addCriterion("order_commission_money in", values, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyNotIn(List<Double> values) {
            addCriterion("order_commission_money not in", values, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyBetween(Double value1, Double value2) {
            addCriterion("order_commission_money between", value1, value2, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCommissionMoneyNotBetween(Double value1, Double value2) {
            addCriterion("order_commission_money not between", value1, value2, "orderCommissionMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyIsNull() {
            addCriterion("last_day_settlement_available_money is null");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyIsNotNull() {
            addCriterion("last_day_settlement_available_money is not null");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyEqualTo(Double value) {
            addCriterion("last_day_settlement_available_money =", value, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyNotEqualTo(Double value) {
            addCriterion("last_day_settlement_available_money <>", value, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyGreaterThan(Double value) {
            addCriterion("last_day_settlement_available_money >", value, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("last_day_settlement_available_money >=", value, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyLessThan(Double value) {
            addCriterion("last_day_settlement_available_money <", value, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyLessThanOrEqualTo(Double value) {
            addCriterion("last_day_settlement_available_money <=", value, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyIn(List<Double> values) {
            addCriterion("last_day_settlement_available_money in", values, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyNotIn(List<Double> values) {
            addCriterion("last_day_settlement_available_money not in", values, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyBetween(Double value1, Double value2) {
            addCriterion("last_day_settlement_available_money between", value1, value2, "lastDaySettlementAvailableMoney");
            return (Criteria) this;
        }

        public Criteria andLastDaySettlementAvailableMoneyNotBetween(Double value1, Double value2) {
            addCriterion("last_day_settlement_available_money not between", value1, value2, "lastDaySettlementAvailableMoney");
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