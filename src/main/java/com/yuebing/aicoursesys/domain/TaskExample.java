package com.yuebing.aicoursesys.domain;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TaskExample() {
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskIsNull() {
            addCriterion("task is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsNotNull() {
            addCriterion("task is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEqualTo(String value) {
            addCriterion("task =", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotEqualTo(String value) {
            addCriterion("task <>", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThan(String value) {
            addCriterion("task >", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThanOrEqualTo(String value) {
            addCriterion("task >=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThan(String value) {
            addCriterion("task <", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThanOrEqualTo(String value) {
            addCriterion("task <=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLike(String value) {
            addCriterion("task like", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotLike(String value) {
            addCriterion("task not like", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskIn(List<String> values) {
            addCriterion("task in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotIn(List<String> values) {
            addCriterion("task not in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskBetween(String value1, String value2) {
            addCriterion("task between", value1, value2, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotBetween(String value1, String value2) {
            addCriterion("task not between", value1, value2, "task");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
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

        public Criteria andAddvideoIsNull() {
            addCriterion("addvideo is null");
            return (Criteria) this;
        }

        public Criteria andAddvideoIsNotNull() {
            addCriterion("addvideo is not null");
            return (Criteria) this;
        }

        public Criteria andAddvideoEqualTo(Integer value) {
            addCriterion("addvideo =", value, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoNotEqualTo(Integer value) {
            addCriterion("addvideo <>", value, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoGreaterThan(Integer value) {
            addCriterion("addvideo >", value, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("addvideo >=", value, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoLessThan(Integer value) {
            addCriterion("addvideo <", value, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoLessThanOrEqualTo(Integer value) {
            addCriterion("addvideo <=", value, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoIn(List<Integer> values) {
            addCriterion("addvideo in", values, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoNotIn(List<Integer> values) {
            addCriterion("addvideo not in", values, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoBetween(Integer value1, Integer value2) {
            addCriterion("addvideo between", value1, value2, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddvideoNotBetween(Integer value1, Integer value2) {
            addCriterion("addvideo not between", value1, value2, "addvideo");
            return (Criteria) this;
        }

        public Criteria andAddpptIsNull() {
            addCriterion("addppt is null");
            return (Criteria) this;
        }

        public Criteria andAddpptIsNotNull() {
            addCriterion("addppt is not null");
            return (Criteria) this;
        }

        public Criteria andAddpptEqualTo(Integer value) {
            addCriterion("addppt =", value, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptNotEqualTo(Integer value) {
            addCriterion("addppt <>", value, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptGreaterThan(Integer value) {
            addCriterion("addppt >", value, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptGreaterThanOrEqualTo(Integer value) {
            addCriterion("addppt >=", value, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptLessThan(Integer value) {
            addCriterion("addppt <", value, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptLessThanOrEqualTo(Integer value) {
            addCriterion("addppt <=", value, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptIn(List<Integer> values) {
            addCriterion("addppt in", values, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptNotIn(List<Integer> values) {
            addCriterion("addppt not in", values, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptBetween(Integer value1, Integer value2) {
            addCriterion("addppt between", value1, value2, "addppt");
            return (Criteria) this;
        }

        public Criteria andAddpptNotBetween(Integer value1, Integer value2) {
            addCriterion("addppt not between", value1, value2, "addppt");
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