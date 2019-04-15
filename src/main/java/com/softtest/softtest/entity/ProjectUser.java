package com.softtest.softtest.entity;

public class ProjectUser {
    private Integer projectId;

    private Integer userId;

    public ProjectUser(Integer projectId, Integer userId) {
        this.projectId = projectId;
        this.userId = userId;
    }

    public ProjectUser() {
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
}