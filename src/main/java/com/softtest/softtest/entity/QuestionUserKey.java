package com.softtest.softtest.entity;

public class QuestionUserKey {
    private Integer questionId;

    private Integer reviewerId;

    public QuestionUserKey(Integer questionId, Integer reviewerId) {
        this.questionId = questionId;
        this.reviewerId = reviewerId;
    }

    public QuestionUserKey() {
        super();
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
}