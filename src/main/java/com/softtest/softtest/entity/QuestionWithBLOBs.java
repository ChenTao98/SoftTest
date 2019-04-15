package com.softtest.softtest.entity;

import java.util.Date;

public class QuestionWithBLOBs extends Question {
    private String scenario;

    private String stem;

    private String remark;

    public QuestionWithBLOBs(Integer id, Date createdOn, Date updatedOn, Date authoringFinishDate, Date authoringStartDate, String customField1, String customField2, String customField3, String description, Integer difficulty, String memo, Boolean multipleChoice, Date published, Date reviewingFinishDate, Date reviewingStartDate, Short score, Integer authorId, Integer knowledgePoint, Integer language, Integer projectId, Integer qualityAdminId, Integer status, Integer type, String customFiled1, String scenario, String stem, String remark) {
        super(id, createdOn, updatedOn, authoringFinishDate, authoringStartDate, customField1, customField2, customField3, description, difficulty, memo, multipleChoice, published, reviewingFinishDate, reviewingStartDate, score, authorId, knowledgePoint, language, projectId, qualityAdminId, status, type, customFiled1);
        this.scenario = scenario;
        this.stem = stem;
        this.remark = remark;
    }

    public QuestionWithBLOBs() {
        super();
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario == null ? null : scenario.trim();
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem == null ? null : stem.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}