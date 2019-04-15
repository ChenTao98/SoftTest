package com.softtest.softtest.entity;

import java.util.Date;

public class Project {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private String customField1;

    private String customField2;

    private String customField3;

    private Date exportedOn;

    private Date finishDate;

    private String name;

    private Date startDate;

    private Integer exportedBy;

    private Integer facilitatorId;

    private Integer statusId;

    private Integer syllabusId;

    public Project(Integer id, Date createdOn, Date updatedOn, String customField1, String customField2, String customField3, Date exportedOn, Date finishDate, String name, Date startDate, Integer exportedBy, Integer facilitatorId, Integer statusId, Integer syllabusId) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.customField1 = customField1;
        this.customField2 = customField2;
        this.customField3 = customField3;
        this.exportedOn = exportedOn;
        this.finishDate = finishDate;
        this.name = name;
        this.startDate = startDate;
        this.exportedBy = exportedBy;
        this.facilitatorId = facilitatorId;
        this.statusId = statusId;
        this.syllabusId = syllabusId;
    }

    public Project() {
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

    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1 == null ? null : customField1.trim();
    }

    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2 == null ? null : customField2.trim();
    }

    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3 == null ? null : customField3.trim();
    }

    public Date getExportedOn() {
        return exportedOn;
    }

    public void setExportedOn(Date exportedOn) {
        this.exportedOn = exportedOn;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getExportedBy() {
        return exportedBy;
    }

    public void setExportedBy(Integer exportedBy) {
        this.exportedBy = exportedBy;
    }

    public Integer getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(Integer facilitatorId) {
        this.facilitatorId = facilitatorId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }
}