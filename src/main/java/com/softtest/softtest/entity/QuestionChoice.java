package com.softtest.softtest.entity;

import java.util.Date;

public class QuestionChoice {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private String choiceLabel;

    private Boolean isCorrectAnswer;

    private Integer questionId;

    private String content;

    public QuestionChoice(Integer id, Date createdOn, Date updatedOn, String choiceLabel, Boolean isCorrectAnswer, Integer questionId, String content) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.choiceLabel = choiceLabel;
        this.isCorrectAnswer = isCorrectAnswer;
        this.questionId = questionId;
        this.content = content;
    }

    public QuestionChoice() {
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

    public String getChoiceLabel() {
        return choiceLabel;
    }

    public void setChoiceLabel(String choiceLabel) {
        this.choiceLabel = choiceLabel == null ? null : choiceLabel.trim();
    }

    public Boolean getIsCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setIsCorrectAnswer(Boolean isCorrectAnswer) {
        this.isCorrectAnswer = isCorrectAnswer;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}