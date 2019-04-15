package com.softtest.softtest.entity;

public class QuestionReviewersKey {
    private Integer questionId;

    private Integer reviewerId;

    public QuestionReviewersKey(Integer questionId, Integer reviewerId) {
        this.questionId = questionId;
        this.reviewerId = reviewerId;
    }

    public QuestionReviewersKey() {
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