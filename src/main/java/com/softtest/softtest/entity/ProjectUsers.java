package com.softtest.softtest.entity;

import java.util.Date;

public class ProjectUsers {
    private Integer projectId;

    private Integer userId;

    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    public ProjectUsers(Integer projectId, Integer userId, Integer id, Date createdOn, Date updatedOn) {
        this.projectId = projectId;
        this.userId = userId;
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public ProjectUsers() {
        super();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}