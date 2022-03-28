package com.yuebing.aicoursesys.domain;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public QuestionExample() {
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

        public Criteria andQuestionidIsNull() {
            addCriterion("questionid is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("questionid is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Integer value) {
            addCriterion("questionid =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Integer value) {
            addCriterion("questionid <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Integer value) {
            addCriterion("questionid >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionid >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Integer value) {
            addCriterion("questionid <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("questionid <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Integer> values) {
            addCriterion("questionid in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Integer> values) {
            addCriterion("questionid not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("questionid between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionid not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIsNull() {
            addCriterion("questioncontent is null");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIsNotNull() {
            addCriterion("questioncontent is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentEqualTo(String value) {
            addCriterion("questioncontent =", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotEqualTo(String value) {
            addCriterion("questioncontent <>", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentGreaterThan(String value) {
            addCriterion("questioncontent >", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("questioncontent >=", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLessThan(String value) {
            addCriterion("questioncontent <", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLessThanOrEqualTo(String value) {
            addCriterion("questioncontent <=", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLike(String value) {
            addCriterion("questioncontent like", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotLike(String value) {
            addCriterion("questioncontent not like", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIn(List<String> values) {
            addCriterion("questioncontent in", values, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotIn(List<String> values) {
            addCriterion("questioncontent not in", values, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentBetween(String value1, String value2) {
            addCriterion("questioncontent between", value1, value2, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotBetween(String value1, String value2) {
            addCriterion("questioncontent not between", value1, value2, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andOpaIsNull() {
            addCriterion("opa is null");
            return (Criteria) this;
        }

        public Criteria andOpaIsNotNull() {
            addCriterion("opa is not null");
            return (Criteria) this;
        }

        public Criteria andOpaEqualTo(String value) {
            addCriterion("opa =", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotEqualTo(String value) {
            addCriterion("opa <>", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaGreaterThan(String value) {
            addCriterion("opa >", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaGreaterThanOrEqualTo(String value) {
            addCriterion("opa >=", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaLessThan(String value) {
            addCriterion("opa <", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaLessThanOrEqualTo(String value) {
            addCriterion("opa <=", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaLike(String value) {
            addCriterion("opa like", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotLike(String value) {
            addCriterion("opa not like", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaIn(List<String> values) {
            addCriterion("opa in", values, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotIn(List<String> values) {
            addCriterion("opa not in", values, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaBetween(String value1, String value2) {
            addCriterion("opa between", value1, value2, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotBetween(String value1, String value2) {
            addCriterion("opa not between", value1, value2, "opa");
            return (Criteria) this;
        }

        public Criteria andOpbIsNull() {
            addCriterion("opb is null");
            return (Criteria) this;
        }

        public Criteria andOpbIsNotNull() {
            addCriterion("opb is not null");
            return (Criteria) this;
        }

        public Criteria andOpbEqualTo(String value) {
            addCriterion("opb =", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotEqualTo(String value) {
            addCriterion("opb <>", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbGreaterThan(String value) {
            addCriterion("opb >", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbGreaterThanOrEqualTo(String value) {
            addCriterion("opb >=", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbLessThan(String value) {
            addCriterion("opb <", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbLessThanOrEqualTo(String value) {
            addCriterion("opb <=", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbLike(String value) {
            addCriterion("opb like", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotLike(String value) {
            addCriterion("opb not like", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbIn(List<String> values) {
            addCriterion("opb in", values, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotIn(List<String> values) {
            addCriterion("opb not in", values, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbBetween(String value1, String value2) {
            addCriterion("opb between", value1, value2, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotBetween(String value1, String value2) {
            addCriterion("opb not between", value1, value2, "opb");
            return (Criteria) this;
        }

        public Criteria andOpcIsNull() {
            addCriterion("opc is null");
            return (Criteria) this;
        }

        public Criteria andOpcIsNotNull() {
            addCriterion("opc is not null");
            return (Criteria) this;
        }

        public Criteria andOpcEqualTo(String value) {
            addCriterion("opc =", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotEqualTo(String value) {
            addCriterion("opc <>", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcGreaterThan(String value) {
            addCriterion("opc >", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcGreaterThanOrEqualTo(String value) {
            addCriterion("opc >=", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcLessThan(String value) {
            addCriterion("opc <", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcLessThanOrEqualTo(String value) {
            addCriterion("opc <=", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcLike(String value) {
            addCriterion("opc like", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotLike(String value) {
            addCriterion("opc not like", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcIn(List<String> values) {
            addCriterion("opc in", values, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotIn(List<String> values) {
            addCriterion("opc not in", values, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcBetween(String value1, String value2) {
            addCriterion("opc between", value1, value2, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotBetween(String value1, String value2) {
            addCriterion("opc not between", value1, value2, "opc");
            return (Criteria) this;
        }

        public Criteria andOpdIsNull() {
            addCriterion("opd is null");
            return (Criteria) this;
        }

        public Criteria andOpdIsNotNull() {
            addCriterion("opd is not null");
            return (Criteria) this;
        }

        public Criteria andOpdEqualTo(String value) {
            addCriterion("opd =", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotEqualTo(String value) {
            addCriterion("opd <>", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdGreaterThan(String value) {
            addCriterion("opd >", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdGreaterThanOrEqualTo(String value) {
            addCriterion("opd >=", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdLessThan(String value) {
            addCriterion("opd <", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdLessThanOrEqualTo(String value) {
            addCriterion("opd <=", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdLike(String value) {
            addCriterion("opd like", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotLike(String value) {
            addCriterion("opd not like", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdIn(List<String> values) {
            addCriterion("opd in", values, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotIn(List<String> values) {
            addCriterion("opd not in", values, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdBetween(String value1, String value2) {
            addCriterion("opd between", value1, value2, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotBetween(String value1, String value2) {
            addCriterion("opd not between", value1, value2, "opd");
            return (Criteria) this;
        }

        public Criteria andCorrectopIsNull() {
            addCriterion("correctop is null");
            return (Criteria) this;
        }

        public Criteria andCorrectopIsNotNull() {
            addCriterion("correctop is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectopEqualTo(Integer value) {
            addCriterion("correctop =", value, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopNotEqualTo(Integer value) {
            addCriterion("correctop <>", value, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopGreaterThan(Integer value) {
            addCriterion("correctop >", value, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopGreaterThanOrEqualTo(Integer value) {
            addCriterion("correctop >=", value, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopLessThan(Integer value) {
            addCriterion("correctop <", value, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopLessThanOrEqualTo(Integer value) {
            addCriterion("correctop <=", value, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopIn(List<Integer> values) {
            addCriterion("correctop in", values, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopNotIn(List<Integer> values) {
            addCriterion("correctop not in", values, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopBetween(Integer value1, Integer value2) {
            addCriterion("correctop between", value1, value2, "correctop");
            return (Criteria) this;
        }

        public Criteria andCorrectopNotBetween(Integer value1, Integer value2) {
            addCriterion("correctop not between", value1, value2, "correctop");
            return (Criteria) this;
        }

        public Criteria andQuestiontagIsNull() {
            addCriterion("questiontag is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontagIsNotNull() {
            addCriterion("questiontag is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontagEqualTo(Integer value) {
            addCriterion("questiontag =", value, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagNotEqualTo(Integer value) {
            addCriterion("questiontag <>", value, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagGreaterThan(Integer value) {
            addCriterion("questiontag >", value, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagGreaterThanOrEqualTo(Integer value) {
            addCriterion("questiontag >=", value, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagLessThan(Integer value) {
            addCriterion("questiontag <", value, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagLessThanOrEqualTo(Integer value) {
            addCriterion("questiontag <=", value, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagIn(List<Integer> values) {
            addCriterion("questiontag in", values, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagNotIn(List<Integer> values) {
            addCriterion("questiontag not in", values, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagBetween(Integer value1, Integer value2) {
            addCriterion("questiontag between", value1, value2, "questiontag");
            return (Criteria) this;
        }

        public Criteria andQuestiontagNotBetween(Integer value1, Integer value2) {
            addCriterion("questiontag not between", value1, value2, "questiontag");
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

        public Criteria andExamidIsNull() {
            addCriterion("examid is null");
            return (Criteria) this;
        }

        public Criteria andExamidIsNotNull() {
            addCriterion("examid is not null");
            return (Criteria) this;
        }

        public Criteria andExamidEqualTo(Integer value) {
            addCriterion("examid =", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotEqualTo(Integer value) {
            addCriterion("examid <>", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThan(Integer value) {
            addCriterion("examid >", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("examid >=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThan(Integer value) {
            addCriterion("examid <", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThanOrEqualTo(Integer value) {
            addCriterion("examid <=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidIn(List<Integer> values) {
            addCriterion("examid in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotIn(List<Integer> values) {
            addCriterion("examid not in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidBetween(Integer value1, Integer value2) {
            addCriterion("examid between", value1, value2, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotBetween(Integer value1, Integer value2) {
            addCriterion("examid not between", value1, value2, "examid");
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