package com.softtest.softtest.entity;

import java.util.Date;

public class Question {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private Date authoringFinishDate;

    private Date authoringStartDate;

    private String customField1;

    private String customField2;

    private String customField3;

    private String description;

    private Integer difficulty;

    private String memo;

    private Boolean multipleChoice;

    private Date published;

    private Date reviewingFinishDate;

    private Date reviewingStartDate;

    private Short score;

    private Integer authorId;

    private Integer knowledgePoint;

    private Integer language;

    private Integer projectId;

    private Integer qualityAdminId;

    private Integer status;

    private Integer type;

    private String customFiled1;

    public Question(Integer id, Date createdOn, Date updatedOn, Date authoringFinishDate, Date authoringStartDate, String customField1, String customField2, String customField3, String description, Integer difficulty, String memo, Boolean multipleChoice, Date published, Date reviewingFinishDate, Date reviewingStartDate, Short score, Integer authorId, Integer knowledgePoint, Integer language, Integer projectId, Integer qualityAdminId, Integer status, Integer type, String customFiled1) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.authoringFinishDate = authoringFinishDate;
        this.authoringStartDate = authoringStartDate;
        this.customField1 = customField1;
        this.customField2 = customField2;
        this.customField3 = customField3;
        this.description = description;
        this.difficulty = difficulty;
        this.memo = memo;
        this.multipleChoice = multipleChoice;
        this.published = published;
        this.reviewingFinishDate = reviewingFinishDate;
        this.reviewingStartDate = reviewingStartDate;
        this.score = score;
        this.authorId = authorId;
        this.knowledgePoint = knowledgePoint;
        this.language = language;
        this.projectId = projectId;
        this.qualityAdminId = qualityAdminId;
        this.status = status;
        this.type = type;
        this.customFiled1 = customFiled1;
    }

    public Question() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Date getAuthoringFinishDate() {
        return authoringFinishDate;
    }

    public void setAuthoringFinishDate(Date authoringFinishDate) {
        this.authoringFinishDate = authoringFinishDate;
    }

    public Date getAuthoringStartDate() {
        return authoringStartDate;
    }

    public void setAuthoringStartDate(Date authoringStartDate) {
        this.authoringStartDate = authoringStartDate;
    }

    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1 == null ? null : customField1.trim();
    }

    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2 == null ? null : customField2.trim();
    }

    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3 == null ? null : customField3.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Boolean getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(Boolean multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getReviewingFinishDate() {
        return reviewingFinishDate;
    }

    public void setReviewingFinishDate(Date reviewingFinishDate) {
        this.reviewingFinishDate = reviewingFinishDate;
    }

    public Date getReviewingStartDate() {
        return reviewingStartDate;
    }

    public void setReviewingStartDate(Date reviewingStartDate) {
        this.reviewingStartDate = reviewingStartDate;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getKnowledgePoint() {
        return knowledgePoint;
    }

    public void setKnowledgePoint(Integer knowledgePoint) {
        this.knowledgePoint = knowledgePoint;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getQualityAdminId() {
        return qualityAdminId;
    }

    public void setQualityAdminId(Integer qualityAdminId) {
        this.qualityAdminId = qualityAdminId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCustomFiled1() {
        return customFiled1;
    }

    public void setCustomFiled1(String customFiled1) {
        this.customFiled1 = customFiled1 == null ? null : customFiled1.trim();
    }
}