package com.softtest.softtest.entity;

import java.util.Date;

public class QuestionImage {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private String path;

    private String caption;

    private Integer questionId;

    public QuestionImage(Integer id, Date createdOn, Date updatedOn, String path, String caption, Integer questionId) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.path = path;
        this.caption = caption;
        this.questionId = questionId;
    }

    public QuestionImage() {
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}