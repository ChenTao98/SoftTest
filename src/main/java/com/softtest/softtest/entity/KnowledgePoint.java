package com.softtest.softtest.entity;

import java.util.Date;

public class KnowledgePoint {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private String kLevel;

    private String number;

    private Short score;

    private String title;

    private Integer chapterId;

    public KnowledgePoint(Integer id, Date createdOn, Date updatedOn, String kLevel, String number, Short score, String title, Integer chapterId) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.kLevel = kLevel;
        this.number = number;
        this.score = score;
        this.title = title;
        this.chapterId = chapterId;
    }

    public KnowledgePoint() {
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

    public String getkLevel() {
        return kLevel;
    }

    public void setkLevel(String kLevel) {
        this.kLevel = kLevel == null ? null : kLevel.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }
}