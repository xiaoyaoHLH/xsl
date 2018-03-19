package com.xsl.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserNetworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserNetworkExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Short value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Short value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Short value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Short value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Short value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Short value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Short> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Short> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Short value1, Short value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Short value1, Short value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Short value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Short value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Short value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Short value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Short value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Short value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Short> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Short> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Short value1, Short value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Short value1, Short value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(String value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(String value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(String value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(String value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(String value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(String value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLike(String value) {
            addCriterion("count like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotLike(String value) {
            addCriterion("count not like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<String> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<String> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(String value1, String value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(String value1, String value2) {
            addCriterion("count not between", value1, value2, "count");
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