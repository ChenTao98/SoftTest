package com.softtest.softtest.entity;

import java.util.Date;

public class QuestionStatusTransition extends QuestionStatusTransitionKey {
    private Date createdOn;

    private Date updatedOn;

    private Integer sequence;

    public QuestionStatusTransition(Integer nextStatusId, Integer statusId, Date createdOn, Date updatedOn, Integer sequence) {
        super(nextStatusId, statusId);
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.sequence = sequence;
    }

    public QuestionStatusTransition() {
        super();
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

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}