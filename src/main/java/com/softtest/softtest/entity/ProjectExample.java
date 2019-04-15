package com.softtest.softtest.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andExportedOnIsNull() {
            addCriterion("exported_on is null");
            return (Criteria) this;
        }

        public Criteria andExportedOnIsNotNull() {
            addCriterion("exported_on is not null");
            return (Criteria) this;
        }

        public Criteria andExportedOnEqualTo(Date value) {
            addCriterion("exported_on =", value, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnNotEqualTo(Date value) {
            addCriterion("exported_on <>", value, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnGreaterThan(Date value) {
            addCriterion("exported_on >", value, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("exported_on >=", value, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnLessThan(Date value) {
            addCriterion("exported_on <", value, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnLessThanOrEqualTo(Date value) {
            addCriterion("exported_on <=", value, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnIn(List<Date> values) {
            addCriterion("exported_on in", values, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnNotIn(List<Date> values) {
            addCriterion("exported_on not in", values, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnBetween(Date value1, Date value2) {
            addCriterion("exported_on between", value1, value2, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andExportedOnNotBetween(Date value1, Date value2) {
            addCriterion("exported_on not between", value1, value2, "exportedOn");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNull() {
            addCriterion("finish_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNotNull() {
            addCriterion("finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDateEqualTo(Date value) {
            addCriterionForJDBCDate("finish_date =", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("finish_date <>", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("finish_date >", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finish_date >=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThan(Date value) {
            addCriterionForJDBCDate("finish_date <", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finish_date <=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIn(List<Date> values) {
            addCriterionForJDBCDate("finish_date in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("finish_date not in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finish_date between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finish_date not between", value1, value2, "finishDate");
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andExportedByIsNull() {
            addCriterion("exported_by is null");
            return (Criteria) this;
        }

        public Criteria andExportedByIsNotNull() {
            addCriterion("exported_by is not null");
            return (Criteria) this;
        }

        public Criteria andExportedByEqualTo(Integer value) {
            addCriterion("exported_by =", value, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByNotEqualTo(Integer value) {
            addCriterion("exported_by <>", value, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByGreaterThan(Integer value) {
            addCriterion("exported_by >", value, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("exported_by >=", value, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByLessThan(Integer value) {
            addCriterion("exported_by <", value, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByLessThanOrEqualTo(Integer value) {
            addCriterion("exported_by <=", value, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByIn(List<Integer> values) {
            addCriterion("exported_by in", values, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByNotIn(List<Integer> values) {
            addCriterion("exported_by not in", values, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByBetween(Integer value1, Integer value2) {
            addCriterion("exported_by between", value1, value2, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andExportedByNotBetween(Integer value1, Integer value2) {
            addCriterion("exported_by not between", value1, value2, "exportedBy");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdIsNull() {
            addCriterion("facilitator_id is null");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdIsNotNull() {
            addCriterion("facilitator_id is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdEqualTo(Integer value) {
            addCriterion("facilitator_id =", value, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdNotEqualTo(Integer value) {
            addCriterion("facilitator_id <>", value, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdGreaterThan(Integer value) {
            addCriterion("facilitator_id >", value, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("facilitator_id >=", value, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdLessThan(Integer value) {
            addCriterion("facilitator_id <", value, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("facilitator_id <=", value, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdIn(List<Integer> values) {
            addCriterion("facilitator_id in", values, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdNotIn(List<Integer> values) {
            addCriterion("facilitator_id not in", values, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdBetween(Integer value1, Integer value2) {
            addCriterion("facilitator_id between", value1, value2, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andFacilitatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("facilitator_id not between", value1, value2, "facilitatorId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIsNull() {
            addCriterion("syllabus_id is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIsNotNull() {
            addCriterion("syllabus_id is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdEqualTo(Integer value) {
            addCriterion("syllabus_id =", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotEqualTo(Integer value) {
            addCriterion("syllabus_id <>", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdGreaterThan(Integer value) {
            addCriterion("syllabus_id >", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("syllabus_id >=", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdLessThan(Integer value) {
            addCriterion("syllabus_id <", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdLessThanOrEqualTo(Integer value) {
            addCriterion("syllabus_id <=", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIn(List<Integer> values) {
            addCriterion("syllabus_id in", values, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotIn(List<Integer> values) {
            addCriterion("syllabus_id not in", values, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_id between", value1, value2, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_id not between", value1, value2, "syllabusId");
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