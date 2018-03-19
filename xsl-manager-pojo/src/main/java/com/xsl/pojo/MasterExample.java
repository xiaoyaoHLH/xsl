package com.xsl.pojo;

import java.util.ArrayList;
import java.util.List;

public class MasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MasterExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIsNull() {
            addCriterion("empirical is null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIsNotNull() {
            addCriterion("empirical is not null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalEqualTo(Integer value) {
            addCriterion("empirical =", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotEqualTo(Integer value) {
            addCriterion("empirical <>", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalGreaterThan(Integer value) {
            addCriterion("empirical >", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalGreaterThanOrEqualTo(Integer value) {
            addCriterion("empirical >=", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalLessThan(Integer value) {
            addCriterion("empirical <", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalLessThanOrEqualTo(Integer value) {
            addCriterion("empirical <=", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIn(List<Integer> values) {
            addCriterion("empirical in", values, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotIn(List<Integer> values) {
            addCriterion("empirical not in", values, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalBetween(Integer value1, Integer value2) {
            addCriterion("empirical between", value1, value2, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotBetween(Integer value1, Integer value2) {
            addCriterion("empirical not between", value1, value2, "empirical");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNull() {
            addCriterion("send_count is null");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNotNull() {
            addCriterion("send_count is not null");
            return (Criteria) this;
        }

        public Criteria andSendCountEqualTo(Short value) {
            addCriterion("send_count =", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotEqualTo(Short value) {
            addCriterion("send_count <>", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThan(Short value) {
            addCriterion("send_count >", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThanOrEqualTo(Short value) {
            addCriterion("send_count >=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThan(Short value) {
            addCriterion("send_count <", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThanOrEqualTo(Short value) {
            addCriterion("send_count <=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountIn(List<Short> values) {
            addCriterion("send_count in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotIn(List<Short> values) {
            addCriterion("send_count not in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountBetween(Short value1, Short value2) {
            addCriterion("send_count between", value1, value2, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotBetween(Short value1, Short value2) {
            addCriterion("send_count not between", value1, value2, "sendCount");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andNewTimeIsNull() {
            addCriterion("new_time is null");
            return (Criteria) this;
        }

        public Criteria andNewTimeIsNotNull() {
            addCriterion("new_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewTimeEqualTo(String value) {
            addCriterion("new_time =", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotEqualTo(String value) {
            addCriterion("new_time <>", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeGreaterThan(String value) {
            addCriterion("new_time >", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("new_time >=", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeLessThan(String value) {
            addCriterion("new_time <", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeLessThanOrEqualTo(String value) {
            addCriterion("new_time <=", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeLike(String value) {
            addCriterion("new_time like", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotLike(String value) {
            addCriterion("new_time not like", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeIn(List<String> values) {
            addCriterion("new_time in", values, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotIn(List<String> values) {
            addCriterion("new_time not in", values, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeBetween(String value1, String value2) {
            addCriterion("new_time between", value1, value2, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotBetween(String value1, String value2) {
            addCriterion("new_time not between", value1, value2, "newTime");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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