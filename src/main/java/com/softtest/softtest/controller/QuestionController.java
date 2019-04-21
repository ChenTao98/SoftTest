package com.softtest.softtest.controller;

import com.softtest.softtest.entity.Question;
import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/type/{typeId}", produces = "application/json;charset=UTF-8")
    public List<QuestionInfo> getQuestionsByTypeId(@PathVariable("typeId") Integer typeId) {
        List<QuestionInfo> questions = questionService.getQuestionByType(typeId);
        return questions;
    }

    @RequestMapping(value="/knowledgePoint/{knowledgeId}", produces = "application/json;char-set=UTF-8")
    public List<QuestionInfo> getQuestionsByKnowledgeId(@PathVariable("knowledgeId") Integer knowledgeId) {
        List<QuestionInfo> questions = questionService.getQuestionByKnowledgePoint(knowledgeId);
        return questions;
    }

    @RequestMapping(value="/project/{projectId}", produces = "application/json;char-set=UTF-8")
    public List<QuestionInfo> getQuestionsByProjectId(@PathVariable("projectId") Integer projectId) {
        List<QuestionInfo> questions = questionService.getQuestionByProjectId(projectId);
        return questions;
    }

    @RequestMapping(value="/author/{authorId}", produces = "application/json;char-set=UTF-8")
    public List<QuestionInfo> getQuestionsByAuthorId(@PathVariable("authorId") Integer authorId) {
        List<QuestionInfo> questions = questionService.getQuestionByAuthorId(authorId);
        return questions;
    }

    @RequestMapping(value="/language/{languageId}", produces = "application/json;char-set=UTF-8")
    public List<QuestionInfo> getQuestionsByLanguageId(@PathVariable("languageId") Integer languageId) {
        List<QuestionInfo> questions = questionService.getQuestionByLanguageId(languageId);
        return questions;
    }
}
