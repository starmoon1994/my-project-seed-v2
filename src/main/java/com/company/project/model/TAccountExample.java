package com.company.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public TAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
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
            addCriterion("`ID` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`ID` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`ID` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`ID` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`ID` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`ID` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`ID` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`ID` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`ID` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`ID` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`ID` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`ID` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIsNull() {
            addCriterion("`GLOBAL_ID` is null");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIsNotNull() {
            addCriterion("`GLOBAL_ID` is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalIdEqualTo(String value) {
            addCriterion("`GLOBAL_ID` =", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotEqualTo(String value) {
            addCriterion("`GLOBAL_ID` <>", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdGreaterThan(String value) {
            addCriterion("`GLOBAL_ID` >", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdGreaterThanOrEqualTo(String value) {
            addCriterion("`GLOBAL_ID` >=", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLessThan(String value) {
            addCriterion("`GLOBAL_ID` <", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLessThanOrEqualTo(String value) {
            addCriterion("`GLOBAL_ID` <=", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLike(String value) {
            addCriterion("`GLOBAL_ID` like", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotLike(String value) {
            addCriterion("`GLOBAL_ID` not like", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIn(List<String> values) {
            addCriterion("`GLOBAL_ID` in", values, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotIn(List<String> values) {
            addCriterion("`GLOBAL_ID` not in", values, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdBetween(String value1, String value2) {
            addCriterion("`GLOBAL_ID` between", value1, value2, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotBetween(String value1, String value2) {
            addCriterion("`GLOBAL_ID` not between", value1, value2, "globalId");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNull() {
            addCriterion("`TOTAL_AMT` is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNotNull() {
            addCriterion("`TOTAL_AMT` is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtEqualTo(BigDecimal value) {
            addCriterion("`TOTAL_AMT` =", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("`TOTAL_AMT` <>", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("`TOTAL_AMT` >", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`TOTAL_AMT` >=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThan(BigDecimal value) {
            addCriterion("`TOTAL_AMT` <", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`TOTAL_AMT` <=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIn(List<BigDecimal> values) {
            addCriterion("`TOTAL_AMT` in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("`TOTAL_AMT` not in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`TOTAL_AMT` between", value1, value2, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`TOTAL_AMT` not between", value1, value2, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtIsNull() {
            addCriterion("`FROZEN_AMT` is null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtIsNotNull() {
            addCriterion("`FROZEN_AMT` is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtEqualTo(BigDecimal value) {
            addCriterion("`FROZEN_AMT` =", value, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtNotEqualTo(BigDecimal value) {
            addCriterion("`FROZEN_AMT` <>", value, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtGreaterThan(BigDecimal value) {
            addCriterion("`FROZEN_AMT` >", value, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`FROZEN_AMT` >=", value, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtLessThan(BigDecimal value) {
            addCriterion("`FROZEN_AMT` <", value, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`FROZEN_AMT` <=", value, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtIn(List<BigDecimal> values) {
            addCriterion("`FROZEN_AMT` in", values, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtNotIn(List<BigDecimal> values) {
            addCriterion("`FROZEN_AMT` not in", values, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`FROZEN_AMT` between", value1, value2, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andFrozenAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`FROZEN_AMT` not between", value1, value2, "frozenAmt");
            return (Criteria) this;
        }

        public Criteria andHotAccountIsNull() {
            addCriterion("`HOT_ACCOUNT` is null");
            return (Criteria) this;
        }

        public Criteria andHotAccountIsNotNull() {
            addCriterion("`HOT_ACCOUNT` is not null");
            return (Criteria) this;
        }

        public Criteria andHotAccountEqualTo(Byte value) {
            addCriterion("`HOT_ACCOUNT` =", value, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountNotEqualTo(Byte value) {
            addCriterion("`HOT_ACCOUNT` <>", value, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountGreaterThan(Byte value) {
            addCriterion("`HOT_ACCOUNT` >", value, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountGreaterThanOrEqualTo(Byte value) {
            addCriterion("`HOT_ACCOUNT` >=", value, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountLessThan(Byte value) {
            addCriterion("`HOT_ACCOUNT` <", value, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountLessThanOrEqualTo(Byte value) {
            addCriterion("`HOT_ACCOUNT` <=", value, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountIn(List<Byte> values) {
            addCriterion("`HOT_ACCOUNT` in", values, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountNotIn(List<Byte> values) {
            addCriterion("`HOT_ACCOUNT` not in", values, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountBetween(Byte value1, Byte value2) {
            addCriterion("`HOT_ACCOUNT` between", value1, value2, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andHotAccountNotBetween(Byte value1, Byte value2) {
            addCriterion("`HOT_ACCOUNT` not between", value1, value2, "hotAccount");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeIsNull() {
            addCriterion("`CR_DATETIME` is null");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeIsNotNull() {
            addCriterion("`CR_DATETIME` is not null");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeEqualTo(Date value) {
            addCriterion("`CR_DATETIME` =", value, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeNotEqualTo(Date value) {
            addCriterion("`CR_DATETIME` <>", value, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeGreaterThan(Date value) {
            addCriterion("`CR_DATETIME` >", value, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`CR_DATETIME` >=", value, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeLessThan(Date value) {
            addCriterion("`CR_DATETIME` <", value, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("`CR_DATETIME` <=", value, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeIn(List<Date> values) {
            addCriterion("`CR_DATETIME` in", values, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeNotIn(List<Date> values) {
            addCriterion("`CR_DATETIME` not in", values, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeBetween(Date value1, Date value2) {
            addCriterion("`CR_DATETIME` between", value1, value2, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andCrDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("`CR_DATETIME` not between", value1, value2, "crDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeIsNull() {
            addCriterion("`LM_DATETIME` is null");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeIsNotNull() {
            addCriterion("`LM_DATETIME` is not null");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeEqualTo(Date value) {
            addCriterion("`LM_DATETIME` =", value, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeNotEqualTo(Date value) {
            addCriterion("`LM_DATETIME` <>", value, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeGreaterThan(Date value) {
            addCriterion("`LM_DATETIME` >", value, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`LM_DATETIME` >=", value, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeLessThan(Date value) {
            addCriterion("`LM_DATETIME` <", value, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("`LM_DATETIME` <=", value, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeIn(List<Date> values) {
            addCriterion("`LM_DATETIME` in", values, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeNotIn(List<Date> values) {
            addCriterion("`LM_DATETIME` not in", values, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeBetween(Date value1, Date value2) {
            addCriterion("`LM_DATETIME` between", value1, value2, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andLmDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("`LM_DATETIME` not between", value1, value2, "lmDatetime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("`VERSION` is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("`VERSION` is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("`VERSION` =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("`VERSION` <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("`VERSION` >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("`VERSION` >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("`VERSION` <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("`VERSION` <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("`VERSION` in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("`VERSION` not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("`VERSION` between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("`VERSION` not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated do_not_delete_during_merge Sun Feb 07 16:38:31 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ACCOUNT
     *
     * @mbg.generated Sun Feb 07 16:38:31 CST 2021
     */
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