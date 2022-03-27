package com.yuebing.aicoursesys.domain;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public VideoExample() {
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

        public Criteria andVideoidIsNull() {
            addCriterion("videoid is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoid is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(Integer value) {
            addCriterion("videoid =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(Integer value) {
            addCriterion("videoid <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(Integer value) {
            addCriterion("videoid >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoid >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(Integer value) {
            addCriterion("videoid <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(Integer value) {
            addCriterion("videoid <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<Integer> values) {
            addCriterion("videoid in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<Integer> values) {
            addCriterion("videoid not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(Integer value1, Integer value2) {
            addCriterion("videoid between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoid not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNull() {
            addCriterion("videoname is null");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNotNull() {
            addCriterion("videoname is not null");
            return (Criteria) this;
        }

        public Criteria andVideonameEqualTo(String value) {
            addCriterion("videoname =", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotEqualTo(String value) {
            addCriterion("videoname <>", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThan(String value) {
            addCriterion("videoname >", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThanOrEqualTo(String value) {
            addCriterion("videoname >=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThan(String value) {
            addCriterion("videoname <", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThanOrEqualTo(String value) {
            addCriterion("videoname <=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLike(String value) {
            addCriterion("videoname like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotLike(String value) {
            addCriterion("videoname not like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameIn(List<String> values) {
            addCriterion("videoname in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotIn(List<String> values) {
            addCriterion("videoname not in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameBetween(String value1, String value2) {
            addCriterion("videoname between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotBetween(String value1, String value2) {
            addCriterion("videoname not between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIsNull() {
            addCriterion("videoaddress is null");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIsNotNull() {
            addCriterion("videoaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVideoaddressEqualTo(String value) {
            addCriterion("videoaddress =", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotEqualTo(String value) {
            addCriterion("videoaddress <>", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressGreaterThan(String value) {
            addCriterion("videoaddress >", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("videoaddress >=", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLessThan(String value) {
            addCriterion("videoaddress <", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLessThanOrEqualTo(String value) {
            addCriterion("videoaddress <=", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLike(String value) {
            addCriterion("videoaddress like", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotLike(String value) {
            addCriterion("videoaddress not like", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIn(List<String> values) {
            addCriterion("videoaddress in", values, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotIn(List<String> values) {
            addCriterion("videoaddress not in", values, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressBetween(String value1, String value2) {
            addCriterion("videoaddress between", value1, value2, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotBetween(String value1, String value2) {
            addCriterion("videoaddress not between", value1, value2, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideotagIsNull() {
            addCriterion("videotag is null");
            return (Criteria) this;
        }

        public Criteria andVideotagIsNotNull() {
            addCriterion("videotag is not null");
            return (Criteria) this;
        }

        public Criteria andVideotagEqualTo(Integer value) {
            addCriterion("videotag =", value, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagNotEqualTo(Integer value) {
            addCriterion("videotag <>", value, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagGreaterThan(Integer value) {
            addCriterion("videotag >", value, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagGreaterThanOrEqualTo(Integer value) {
            addCriterion("videotag >=", value, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagLessThan(Integer value) {
            addCriterion("videotag <", value, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagLessThanOrEqualTo(Integer value) {
            addCriterion("videotag <=", value, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagIn(List<Integer> values) {
            addCriterion("videotag in", values, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagNotIn(List<Integer> values) {
            addCriterion("videotag not in", values, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagBetween(Integer value1, Integer value2) {
            addCriterion("videotag between", value1, value2, "videotag");
            return (Criteria) this;
        }

        public Criteria andVideotagNotBetween(Integer value1, Integer value2) {
            addCriterion("videotag not between", value1, value2, "videotag");
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