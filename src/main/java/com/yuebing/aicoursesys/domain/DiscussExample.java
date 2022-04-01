package com.yuebing.aicoursesys.domain;

import java.util.ArrayList;
import java.util.List;

public class DiscussExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DiscussExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andDiscussidIsNull() {
            addCriterion("discussid is null");
            return (Criteria) this;
        }

        public Criteria andDiscussidIsNotNull() {
            addCriterion("discussid is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussidEqualTo(Integer value) {
            addCriterion("discussid =", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotEqualTo(Integer value) {
            addCriterion("discussid <>", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidGreaterThan(Integer value) {
            addCriterion("discussid >", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidGreaterThanOrEqualTo(Integer value) {
            addCriterion("discussid >=", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidLessThan(Integer value) {
            addCriterion("discussid <", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidLessThanOrEqualTo(Integer value) {
            addCriterion("discussid <=", value, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidIn(List<Integer> values) {
            addCriterion("discussid in", values, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotIn(List<Integer> values) {
            addCriterion("discussid not in", values, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidBetween(Integer value1, Integer value2) {
            addCriterion("discussid between", value1, value2, "discussid");
            return (Criteria) this;
        }

        public Criteria andDiscussidNotBetween(Integer value1, Integer value2) {
            addCriterion("discussid not between", value1, value2, "discussid");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andIsterminatedIsNull() {
            addCriterion("isTerminated is null");
            return (Criteria) this;
        }

        public Criteria andIsterminatedIsNotNull() {
            addCriterion("isTerminated is not null");
            return (Criteria) this;
        }

        public Criteria andIsterminatedEqualTo(Integer value) {
            addCriterion("isTerminated =", value, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedNotEqualTo(Integer value) {
            addCriterion("isTerminated <>", value, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedGreaterThan(Integer value) {
            addCriterion("isTerminated >", value, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTerminated >=", value, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedLessThan(Integer value) {
            addCriterion("isTerminated <", value, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedLessThanOrEqualTo(Integer value) {
            addCriterion("isTerminated <=", value, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedIn(List<Integer> values) {
            addCriterion("isTerminated in", values, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedNotIn(List<Integer> values) {
            addCriterion("isTerminated not in", values, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedBetween(Integer value1, Integer value2) {
            addCriterion("isTerminated between", value1, value2, "isterminated");
            return (Criteria) this;
        }

        public Criteria andIsterminatedNotBetween(Integer value1, Integer value2) {
            addCriterion("isTerminated not between", value1, value2, "isterminated");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherid is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Long value) {
            addCriterion("teacherid =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Long value) {
            addCriterion("teacherid <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Long value) {
            addCriterion("teacherid >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("teacherid >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Long value) {
            addCriterion("teacherid <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("teacherid <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Long> values) {
            addCriterion("teacherid in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Long> values) {
            addCriterion("teacherid not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Long value1, Long value2) {
            addCriterion("teacherid between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("teacherid not between", value1, value2, "teacherid");
            return (Criteria) this;
        }
    }

    /**
     */
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