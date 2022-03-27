package com.yuebing.aicoursesys.domain;

import java.util.ArrayList;
import java.util.List;

public class PptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PptExample() {
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

        public Criteria andPptidIsNull() {
            addCriterion("pptid is null");
            return (Criteria) this;
        }

        public Criteria andPptidIsNotNull() {
            addCriterion("pptid is not null");
            return (Criteria) this;
        }

        public Criteria andPptidEqualTo(Integer value) {
            addCriterion("pptid =", value, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidNotEqualTo(Integer value) {
            addCriterion("pptid <>", value, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidGreaterThan(Integer value) {
            addCriterion("pptid >", value, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pptid >=", value, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidLessThan(Integer value) {
            addCriterion("pptid <", value, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidLessThanOrEqualTo(Integer value) {
            addCriterion("pptid <=", value, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidIn(List<Integer> values) {
            addCriterion("pptid in", values, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidNotIn(List<Integer> values) {
            addCriterion("pptid not in", values, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidBetween(Integer value1, Integer value2) {
            addCriterion("pptid between", value1, value2, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptidNotBetween(Integer value1, Integer value2) {
            addCriterion("pptid not between", value1, value2, "pptid");
            return (Criteria) this;
        }

        public Criteria andPptnameIsNull() {
            addCriterion("pptname is null");
            return (Criteria) this;
        }

        public Criteria andPptnameIsNotNull() {
            addCriterion("pptname is not null");
            return (Criteria) this;
        }

        public Criteria andPptnameEqualTo(String value) {
            addCriterion("pptname =", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameNotEqualTo(String value) {
            addCriterion("pptname <>", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameGreaterThan(String value) {
            addCriterion("pptname >", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameGreaterThanOrEqualTo(String value) {
            addCriterion("pptname >=", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameLessThan(String value) {
            addCriterion("pptname <", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameLessThanOrEqualTo(String value) {
            addCriterion("pptname <=", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameLike(String value) {
            addCriterion("pptname like", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameNotLike(String value) {
            addCriterion("pptname not like", value, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameIn(List<String> values) {
            addCriterion("pptname in", values, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameNotIn(List<String> values) {
            addCriterion("pptname not in", values, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameBetween(String value1, String value2) {
            addCriterion("pptname between", value1, value2, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptnameNotBetween(String value1, String value2) {
            addCriterion("pptname not between", value1, value2, "pptname");
            return (Criteria) this;
        }

        public Criteria andPptaddressIsNull() {
            addCriterion("pptaddress is null");
            return (Criteria) this;
        }

        public Criteria andPptaddressIsNotNull() {
            addCriterion("pptaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPptaddressEqualTo(String value) {
            addCriterion("pptaddress =", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressNotEqualTo(String value) {
            addCriterion("pptaddress <>", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressGreaterThan(String value) {
            addCriterion("pptaddress >", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pptaddress >=", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressLessThan(String value) {
            addCriterion("pptaddress <", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressLessThanOrEqualTo(String value) {
            addCriterion("pptaddress <=", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressLike(String value) {
            addCriterion("pptaddress like", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressNotLike(String value) {
            addCriterion("pptaddress not like", value, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressIn(List<String> values) {
            addCriterion("pptaddress in", values, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressNotIn(List<String> values) {
            addCriterion("pptaddress not in", values, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressBetween(String value1, String value2) {
            addCriterion("pptaddress between", value1, value2, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPptaddressNotBetween(String value1, String value2) {
            addCriterion("pptaddress not between", value1, value2, "pptaddress");
            return (Criteria) this;
        }

        public Criteria andPpttagIsNull() {
            addCriterion("ppttag is null");
            return (Criteria) this;
        }

        public Criteria andPpttagIsNotNull() {
            addCriterion("ppttag is not null");
            return (Criteria) this;
        }

        public Criteria andPpttagEqualTo(Integer value) {
            addCriterion("ppttag =", value, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagNotEqualTo(Integer value) {
            addCriterion("ppttag <>", value, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagGreaterThan(Integer value) {
            addCriterion("ppttag >", value, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppttag >=", value, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagLessThan(Integer value) {
            addCriterion("ppttag <", value, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagLessThanOrEqualTo(Integer value) {
            addCriterion("ppttag <=", value, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagIn(List<Integer> values) {
            addCriterion("ppttag in", values, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagNotIn(List<Integer> values) {
            addCriterion("ppttag not in", values, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagBetween(Integer value1, Integer value2) {
            addCriterion("ppttag between", value1, value2, "ppttag");
            return (Criteria) this;
        }

        public Criteria andPpttagNotBetween(Integer value1, Integer value2) {
            addCriterion("ppttag not between", value1, value2, "ppttag");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
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