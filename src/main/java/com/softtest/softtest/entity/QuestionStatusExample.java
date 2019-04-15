package com.softtest.softtest.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionStatusExample() {
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

        public Criteria andCreatedOnIsNull() {
            addCriterion("created_on is null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIsNotNull() {
            addCriterion("created_on is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnEqualTo(Date value) {
            addCriterion("created_on =", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotEqualTo(Date value) {
            addCriterion("created_on <>", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThan(Date value) {
            addCriterion("created_on >", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("created_on >=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThan(Date value) {
            addCriterion("created_on <", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThanOrEqualTo(Date value) {
            addCriterion("created_on <=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIn(List<Date> values) {
            addCriterion("created_on in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotIn(List<Date> values) {
            addCriterion("created_on not in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnBetween(Date value1, Date value2) {
            addCriterion("created_on between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotBetween(Date value1, Date value2) {
            addCriterion("created_on not between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnIsNull() {
            addCriterion("updated_on is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnIsNotNull() {
            addCriterion("updated_on is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnEqualTo(Date value) {
            addCriterion("updated_on =", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnNotEqualTo(Date value) {
            addCriterion("updated_on <>", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnGreaterThan(Date value) {
            addCriterion("updated_on >", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_on >=", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnLessThan(Date value) {
            addCriterion("updated_on <", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnLessThanOrEqualTo(Date value) {
            addCriterion("updated_on <=", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnIn(List<Date> values) {
            addCriterion("updated_on in", values, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnNotIn(List<Date> values) {
            addCriterion("updated_on not in", values, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnBetween(Date value1, Date value2) {
            addCriterion("updated_on between", value1, value2, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnNotBetween(Date value1, Date value2) {
            addCriterion("updated_on not between", value1, value2, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("is_finish is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("is_finish is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishEqualTo(Boolean value) {
            addCriterion("is_finish =", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotEqualTo(Boolean value) {
            addCriterion("is_finish <>", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThan(Boolean value) {
            addCriterion("is_finish >", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_finish >=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThan(Boolean value) {
            addCriterion("is_finish <", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(Boolean value) {
            addCriterion("is_finish <=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishIn(List<Boolean> values) {
            addCriterion("is_finish in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotIn(List<Boolean> values) {
            addCriterion("is_finish not in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishBetween(Boolean value1, Boolean value2) {
            addCriterion("is_finish between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_finish not between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsStartIsNull() {
            addCriterion("is_start is null");
            return (Criteria) this;
        }

        public Criteria andIsStartIsNotNull() {
            addCriterion("is_start is not null");
            return (Criteria) this;
        }

        public Criteria andIsStartEqualTo(Boolean value) {
            addCriterion("is_start =", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotEqualTo(Boolean value) {
            addCriterion("is_start <>", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartGreaterThan(Boolean value) {
            addCriterion("is_start >", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_start >=", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartLessThan(Boolean value) {
            addCriterion("is_start <", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartLessThanOrEqualTo(Boolean value) {
            addCriterion("is_start <=", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartIn(List<Boolean> values) {
            addCriterion("is_start in", values, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotIn(List<Boolean> values) {
            addCriterion("is_start not in", values, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartBetween(Boolean value1, Boolean value2) {
            addCriterion("is_start between", value1, value2, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_start not between", value1, value2, "isStart");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorIsNull() {
            addCriterion("accessible_by_author is null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorIsNotNull() {
            addCriterion("accessible_by_author is not null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorEqualTo(Boolean value) {
            addCriterion("accessible_by_author =", value, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorNotEqualTo(Boolean value) {
            addCriterion("accessible_by_author <>", value, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorGreaterThan(Boolean value) {
            addCriterion("accessible_by_author >", value, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_author >=", value, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorLessThan(Boolean value) {
            addCriterion("accessible_by_author <", value, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorLessThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_author <=", value, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorIn(List<Boolean> values) {
            addCriterion("accessible_by_author in", values, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorNotIn(List<Boolean> values) {
            addCriterion("accessible_by_author not in", values, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_author between", value1, value2, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByAuthorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_author not between", value1, value2, "accessibleByAuthor");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorIsNull() {
            addCriterion("accessible_by_facilitator is null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorIsNotNull() {
            addCriterion("accessible_by_facilitator is not null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorEqualTo(Boolean value) {
            addCriterion("accessible_by_facilitator =", value, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorNotEqualTo(Boolean value) {
            addCriterion("accessible_by_facilitator <>", value, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorGreaterThan(Boolean value) {
            addCriterion("accessible_by_facilitator >", value, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_facilitator >=", value, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorLessThan(Boolean value) {
            addCriterion("accessible_by_facilitator <", value, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorLessThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_facilitator <=", value, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorIn(List<Boolean> values) {
            addCriterion("accessible_by_facilitator in", values, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorNotIn(List<Boolean> values) {
            addCriterion("accessible_by_facilitator not in", values, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_facilitator between", value1, value2, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByFacilitatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_facilitator not between", value1, value2, "accessibleByFacilitator");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminIsNull() {
            addCriterion("accessible_by_quality_admin is null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminIsNotNull() {
            addCriterion("accessible_by_quality_admin is not null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminEqualTo(Boolean value) {
            addCriterion("accessible_by_quality_admin =", value, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminNotEqualTo(Boolean value) {
            addCriterion("accessible_by_quality_admin <>", value, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminGreaterThan(Boolean value) {
            addCriterion("accessible_by_quality_admin >", value, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_quality_admin >=", value, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminLessThan(Boolean value) {
            addCriterion("accessible_by_quality_admin <", value, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminLessThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_quality_admin <=", value, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminIn(List<Boolean> values) {
            addCriterion("accessible_by_quality_admin in", values, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminNotIn(List<Boolean> values) {
            addCriterion("accessible_by_quality_admin not in", values, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_quality_admin between", value1, value2, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByQualityAdminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_quality_admin not between", value1, value2, "accessibleByQualityAdmin");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerIsNull() {
            addCriterion("accessible_by_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerIsNotNull() {
            addCriterion("accessible_by_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerEqualTo(Boolean value) {
            addCriterion("accessible_by_reviewer =", value, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerNotEqualTo(Boolean value) {
            addCriterion("accessible_by_reviewer <>", value, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerGreaterThan(Boolean value) {
            addCriterion("accessible_by_reviewer >", value, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_reviewer >=", value, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerLessThan(Boolean value) {
            addCriterion("accessible_by_reviewer <", value, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerLessThanOrEqualTo(Boolean value) {
            addCriterion("accessible_by_reviewer <=", value, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerIn(List<Boolean> values) {
            addCriterion("accessible_by_reviewer in", values, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerNotIn(List<Boolean> values) {
            addCriterion("accessible_by_reviewer not in", values, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_reviewer between", value1, value2, "accessibleByReviewer");
            return (Criteria) this;
        }

        public Criteria andAccessibleByReviewerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accessible_by_reviewer not between", value1, value2, "accessibleByReviewer");
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