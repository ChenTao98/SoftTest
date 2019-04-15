package com.softtest.softtest.entity;

public class ProjectUsersRole {
    private Integer projectUserId;

    private Integer roleId;

    public ProjectUsersRole(Integer projectUserId, Integer roleId) {
        this.projectUserId = projectUserId;
        this.roleId = roleId;
    }

    public ProjectUsersRole() {
        super();
    }

    public Integer getProjectUserId() {
        return projectUserId;
    }

    public void setProjectUserId(Integer projectUserId) {
        this.projectUserId = projectUserId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}