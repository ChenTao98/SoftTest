package com.softtest.softtest.entity;

import java.util.Date;

public class ReviewComment {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private Boolean isFinalReview;

    private Integer questionId;

    private Integer reviewerId;

    private String content;

    public ReviewComment(Integer id, Date createdOn, Date updatedOn, Boolean isFinalReview, Integer questionId, Integer reviewerId, String content) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.isFinalReview = isFinalReview;
        this.questionId = questionId;
        this.reviewerId = reviewerId;
        this.content = content;
    }

    public ReviewComment() {
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

    public Boolean getIsFinalReview() {
        return isFinalReview;
    }

    public void setIsFinalReview(Boolean isFinalReview) {
        this.isFinalReview = isFinalReview;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}