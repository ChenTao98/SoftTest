package com.softtest.softtest.entity;

import java.util.Date;

public class ProjectStatus {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private Boolean isFinish;

    private Boolean isStart;

    private String name;

    public ProjectStatus(Integer id, Date createdOn, Date updatedOn, Boolean isFinish, Boolean isStart, String name) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.isFinish = isFinish;
        this.isStart = isStart;
        this.name = name;
    }

    public ProjectStatus() {
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

    public Boolean getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Boolean getIsStart() {
        return isStart;
    }

    public void setIsStart(Boolean isStart) {
        this.isStart = isStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}