package com.softtest.softtest.entity;

public class QuestionStatusTransitionKey {
    private Integer nextStatusId;

    private Integer statusId;

    public QuestionStatusTransitionKey(Integer nextStatusId, Integer statusId) {
        this.nextStatusId = nextStatusId;
        this.statusId = statusId;
    }

    public QuestionStatusTransitionKey() {
        super();
    }

    public Integer getNextStatusId() {
        return nextStatusId;
    }

    public void setNextStatusId(Integer nextStatusId) {
        this.nextStatusId = nextStatusId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}