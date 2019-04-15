package com.softtest.softtest.entity;

import java.util.Date;

public class Syllabus {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private Boolean isDisabled;

    private String level;

    private String version;

    private Boolean isdisabled;

    public Syllabus(Integer id, Date createdOn, Date updatedOn, Boolean isDisabled, String level, String version, Boolean isdisabled) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.isDisabled = isDisabled;
        this.level = level;
        this.version = version;
        this.isdisabled = isdisabled;
    }

    public Syllabus() {
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

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Boolean getIsdisabled() {
        return isdisabled;
    }

    public void setIsdisabled(Boolean isdisabled) {
        this.isdisabled = isdisabled;
    }
}