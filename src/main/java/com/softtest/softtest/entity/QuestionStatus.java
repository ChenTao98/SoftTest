package com.softtest.softtest.entity;

import java.util.Date;

public class QuestionStatus {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private Boolean isFinish;

    private Boolean isStart;

    private String name;

    private Boolean accessibleByAuthor;

    private Boolean accessibleByFacilitator;

    private Boolean accessibleByQualityAdmin;

    private Boolean accessibleByReviewer;

    public QuestionStatus(Integer id, Date createdOn, Date updatedOn, Boolean isFinish, Boolean isStart, String name, Boolean accessibleByAuthor, Boolean accessibleByFacilitator, Boolean accessibleByQualityAdmin, Boolean accessibleByReviewer) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.isFinish = isFinish;
        this.isStart = isStart;
        this.name = name;
        this.accessibleByAuthor = accessibleByAuthor;
        this.accessibleByFacilitator = accessibleByFacilitator;
        this.accessibleByQualityAdmin = accessibleByQualityAdmin;
        this.accessibleByReviewer = accessibleByReviewer;
    }

    public QuestionStatus() {
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

    public Boolean getAccessibleByAuthor() {
        return accessibleByAuthor;
    }

    public void setAccessibleByAuthor(Boolean accessibleByAuthor) {
        this.accessibleByAuthor = accessibleByAuthor;
    }

    public Boolean getAccessibleByFacilitator() {
        return accessibleByFacilitator;
    }

    public void setAccessibleByFacilitator(Boolean accessibleByFacilitator) {
        this.accessibleByFacilitator = accessibleByFacilitator;
    }

    public Boolean getAccessibleByQualityAdmin() {
        return accessibleByQualityAdmin;
    }

    public void setAccessibleByQualityAdmin(Boolean accessibleByQualityAdmin) {
        this.accessibleByQualityAdmin = accessibleByQualityAdmin;
    }

    public Boolean getAccessibleByReviewer() {
        return accessibleByReviewer;
    }

    public void setAccessibleByReviewer(Boolean accessibleByReviewer) {
        this.accessibleByReviewer = accessibleByReviewer;
    }
}