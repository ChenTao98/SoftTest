package com.softtest.softtest.entity;

public class QuestionInfo {
    private Integer questionId;
    private String stem;
    private String type;
    private String status;
    private String knowledgePoint;
    private Integer difficulty;
    private Integer score;
    private String project;
    private String author;
    private String language;

    public QuestionInfo(Integer questionId, String stem, String type, String status, String knowledgePoint, Integer difficulty, Integer score, String project, String author, String language) {
        this.questionId = questionId;
        this.stem = stem;
        this.type = type;
        this.status = status;
        this.knowledgePoint = knowledgePoint;
        this.difficulty = difficulty;
        this.score = score;
        this.project = project;
        this.author = author;
        this.language = language;
    }

    public QuestionInfo(String type, Integer score) {
        this.type = type;
        this.score = score;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKnowledgePoint() {
        return knowledgePoint;
    }

    public void setKnowledgePoint(String knowledgePoint) {
        this.knowledgePoint = knowledgePoint;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
