package com.softtest.softtest.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

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

        public Criteria andAuthoringFinishDateIsNull() {
            addCriterion("authoring_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateIsNotNull() {
            addCriterion("authoring_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_finish_date =", value, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_finish_date <>", value, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("authoring_finish_date >", value, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_finish_date >=", value, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateLessThan(Date value) {
            addCriterionForJDBCDate("authoring_finish_date <", value, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_finish_date <=", value, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateIn(List<Date> values) {
            addCriterionForJDBCDate("authoring_finish_date in", values, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("authoring_finish_date not in", values, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authoring_finish_date between", value1, value2, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringFinishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authoring_finish_date not between", value1, value2, "authoringFinishDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateIsNull() {
            addCriterion("authoring_start_date is null");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateIsNotNull() {
            addCriterion("authoring_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_start_date =", value, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_start_date <>", value, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("authoring_start_date >", value, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_start_date >=", value, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateLessThan(Date value) {
            addCriterionForJDBCDate("authoring_start_date <", value, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authoring_start_date <=", value, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("authoring_start_date in", values, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("authoring_start_date not in", values, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authoring_start_date between", value1, value2, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andAuthoringStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authoring_start_date not between", value1, value2, "authoringStartDate");
            return (Criteria) this;
        }

        public Criteria andCustomField1IsNull() {
            addCriterion("custom_field1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomField1IsNotNull() {
            addCriterion("custom_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomField1EqualTo(String value) {
            addCriterion("custom_field1 =", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1NotEqualTo(String value) {
            addCriterion("custom_field1 <>", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1GreaterThan(String value) {
            addCriterion("custom_field1 >", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1GreaterThanOrEqualTo(String value) {
            addCriterion("custom_field1 >=", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1LessThan(String value) {
            addCriterion("custom_field1 <", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1LessThanOrEqualTo(String value) {
            addCriterion("custom_field1 <=", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1Like(String value) {
            addCriterion("custom_field1 like", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1NotLike(String value) {
            addCriterion("custom_field1 not like", value, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1In(List<String> values) {
            addCriterion("custom_field1 in", values, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1NotIn(List<String> values) {
            addCriterion("custom_field1 not in", values, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1Between(String value1, String value2) {
            addCriterion("custom_field1 between", value1, value2, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField1NotBetween(String value1, String value2) {
            addCriterion("custom_field1 not between", value1, value2, "customField1");
            return (Criteria) this;
        }

        public Criteria andCustomField2IsNull() {
            addCriterion("custom_field2 is null");
            return (Criteria) this;
        }

        public Criteria andCustomField2IsNotNull() {
            addCriterion("custom_field2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomField2EqualTo(String value) {
            addCriterion("custom_field2 =", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2NotEqualTo(String value) {
            addCriterion("custom_field2 <>", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2GreaterThan(String value) {
            addCriterion("custom_field2 >", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2GreaterThanOrEqualTo(String value) {
            addCriterion("custom_field2 >=", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2LessThan(String value) {
            addCriterion("custom_field2 <", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2LessThanOrEqualTo(String value) {
            addCriterion("custom_field2 <=", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2Like(String value) {
            addCriterion("custom_field2 like", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2NotLike(String value) {
            addCriterion("custom_field2 not like", value, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2In(List<String> values) {
            addCriterion("custom_field2 in", values, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2NotIn(List<String> values) {
            addCriterion("custom_field2 not in", values, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2Between(String value1, String value2) {
            addCriterion("custom_field2 between", value1, value2, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField2NotBetween(String value1, String value2) {
            addCriterion("custom_field2 not between", value1, value2, "customField2");
            return (Criteria) this;
        }

        public Criteria andCustomField3IsNull() {
            addCriterion("custom_field3 is null");
            return (Criteria) this;
        }

        public Criteria andCustomField3IsNotNull() {
            addCriterion("custom_field3 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomField3EqualTo(String value) {
            addCriterion("custom_field3 =", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3NotEqualTo(String value) {
            addCriterion("custom_field3 <>", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3GreaterThan(String value) {
            addCriterion("custom_field3 >", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3GreaterThanOrEqualTo(String value) {
            addCriterion("custom_field3 >=", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3LessThan(String value) {
            addCriterion("custom_field3 <", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3LessThanOrEqualTo(String value) {
            addCriterion("custom_field3 <=", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3Like(String value) {
            addCriterion("custom_field3 like", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3NotLike(String value) {
            addCriterion("custom_field3 not like", value, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3In(List<String> values) {
            addCriterion("custom_field3 in", values, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3NotIn(List<String> values) {
            addCriterion("custom_field3 not in", values, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3Between(String value1, String value2) {
            addCriterion("custom_field3 between", value1, value2, "customField3");
            return (Criteria) this;
        }

        public Criteria andCustomField3NotBetween(String value1, String value2) {
            addCriterion("custom_field3 not between", value1, value2, "customField3");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(Integer value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(Integer value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(Integer value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(Integer value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(Integer value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<Integer> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<Integer> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(Integer value1, Integer value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(Integer value1, Integer value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceIsNull() {
            addCriterion("multiple_choice is null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceIsNotNull() {
            addCriterion("multiple_choice is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceEqualTo(Boolean value) {
            addCriterion("multiple_choice =", value, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNotEqualTo(Boolean value) {
            addCriterion("multiple_choice <>", value, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceGreaterThan(Boolean value) {
            addCriterion("multiple_choice >", value, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("multiple_choice >=", value, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceLessThan(Boolean value) {
            addCriterion("multiple_choice <", value, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("multiple_choice <=", value, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceIn(List<Boolean> values) {
            addCriterion("multiple_choice in", values, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNotIn(List<Boolean> values) {
            addCriterion("multiple_choice not in", values, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("multiple_choice between", value1, value2, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andMultipleChoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("multiple_choice not between", value1, value2, "multipleChoice");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(Date value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(Date value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(Date value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(Date value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(Date value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(Date value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<Date> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<Date> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(Date value1, Date value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(Date value1, Date value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateIsNull() {
            addCriterion("reviewing_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateIsNotNull() {
            addCriterion("reviewing_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_finish_date =", value, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_finish_date <>", value, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reviewing_finish_date >", value, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_finish_date >=", value, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateLessThan(Date value) {
            addCriterionForJDBCDate("reviewing_finish_date <", value, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_finish_date <=", value, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateIn(List<Date> values) {
            addCriterionForJDBCDate("reviewing_finish_date in", values, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reviewing_finish_date not in", values, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reviewing_finish_date between", value1, value2, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingFinishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reviewing_finish_date not between", value1, value2, "reviewingFinishDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateIsNull() {
            addCriterion("reviewing_start_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateIsNotNull() {
            addCriterion("reviewing_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_start_date =", value, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_start_date <>", value, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reviewing_start_date >", value, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_start_date >=", value, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateLessThan(Date value) {
            addCriterionForJDBCDate("reviewing_start_date <", value, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reviewing_start_date <=", value, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("reviewing_start_date in", values, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reviewing_start_date not in", values, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reviewing_start_date between", value1, value2, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andReviewingStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reviewing_start_date not between", value1, value2, "reviewingStartDate");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Short value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Short value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Short value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Short value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Short value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Short> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Short> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Short value1, Short value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Short value1, Short value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNull() {
            addCriterion("knowledge_point is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNotNull() {
            addCriterion("knowledge_point is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointEqualTo(Integer value) {
            addCriterion("knowledge_point =", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotEqualTo(Integer value) {
            addCriterion("knowledge_point <>", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThan(Integer value) {
            addCriterion("knowledge_point >", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_point >=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThan(Integer value) {
            addCriterion("knowledge_point <", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_point <=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIn(List<Integer> values) {
            addCriterion("knowledge_point in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotIn(List<Integer> values) {
            addCriterion("knowledge_point not in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_point between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_point not between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(Integer value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(Integer value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(Integer value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(Integer value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(Integer value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(Integer value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<Integer> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<Integer> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(Integer value1, Integer value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(Integer value1, Integer value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdIsNull() {
            addCriterion("quality_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdIsNotNull() {
            addCriterion("quality_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdEqualTo(Integer value) {
            addCriterion("quality_admin_id =", value, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdNotEqualTo(Integer value) {
            addCriterion("quality_admin_id <>", value, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdGreaterThan(Integer value) {
            addCriterion("quality_admin_id >", value, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_admin_id >=", value, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdLessThan(Integer value) {
            addCriterion("quality_admin_id <", value, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("quality_admin_id <=", value, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdIn(List<Integer> values) {
            addCriterion("quality_admin_id in", values, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdNotIn(List<Integer> values) {
            addCriterion("quality_admin_id not in", values, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("quality_admin_id between", value1, value2, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andQualityAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_admin_id not between", value1, value2, "qualityAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1IsNull() {
            addCriterion("custom_filed1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1IsNotNull() {
            addCriterion("custom_filed1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1EqualTo(String value) {
            addCriterion("custom_filed1 =", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1NotEqualTo(String value) {
            addCriterion("custom_filed1 <>", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1GreaterThan(String value) {
            addCriterion("custom_filed1 >", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1GreaterThanOrEqualTo(String value) {
            addCriterion("custom_filed1 >=", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1LessThan(String value) {
            addCriterion("custom_filed1 <", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1LessThanOrEqualTo(String value) {
            addCriterion("custom_filed1 <=", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1Like(String value) {
            addCriterion("custom_filed1 like", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1NotLike(String value) {
            addCriterion("custom_filed1 not like", value, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1In(List<String> values) {
            addCriterion("custom_filed1 in", values, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1NotIn(List<String> values) {
            addCriterion("custom_filed1 not in", values, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1Between(String value1, String value2) {
            addCriterion("custom_filed1 between", value1, value2, "customFiled1");
            return (Criteria) this;
        }

        public Criteria andCustomFiled1NotBetween(String value1, String value2) {
            addCriterion("custom_filed1 not between", value1, value2, "customFiled1");
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