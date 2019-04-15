package com.softtest.softtest.entity;

import java.util.Date;

public class QuestionLanguage {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private String name;

    public QuestionLanguage(Integer id, Date createdOn, Date updatedOn, String name) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.name = name;
    }

    public QuestionLanguage() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}