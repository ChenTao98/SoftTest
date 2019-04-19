package com.softtest.softtest.service.impl;

import com.softtest.softtest.entity.*;
import com.softtest.softtest.service.QuestionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceImplTest {
    @Autowired
    private QuestionService questionService;

    @Test
    public void getQuestionType() {
        List<QuestionType> questionTypes = questionService.getQuestionType();
        assertEquals(5, questionTypes.size());
    }

    @Test
    public void getKnowledgePoint() {
        List<KnowledgePoint> knowledgePoints = questionService.getKnowledgePoint();
        assertEquals(187, knowledgePoints.size());
    }

    @Test
    public void getProject() {
        List<Project> projects = questionService.getProject();
        assertEquals(7, projects.size());
    }

    @Test
    public void getUser() {
        List<User> users = questionService.getUser();
        assertEquals(8, users.size());
    }

    @Test
    public void getLanguage() {
        List<QuestionLanguage> list = questionService.getLanguage();
        assertEquals(2, list.size());
    }

    @Test
    public void getQuestionByType() {
        List<QuestionInfo> list = questionService.getQuestionByType(17);
        assertEquals(3, list.size());
    }

    @Test
    public void getQuestionByKnowledgePoint() {
        List<QuestionInfo> list = questionService.getQuestionByKnowledgePoint(1);
        assertEquals(3, list.size());
    }

    @Test
    public void getQuestionByProjectId() {
        List<QuestionInfo> list = questionService.getQuestionByProjectId(71);
        assertEquals(2, list.size());
    }

    @Test
    public void getQuestionByAuthorId() {
        List<QuestionInfo> list = questionService.getQuestionByAuthorId(72);
        assertEquals(7, list.size());
    }

    @Test
    public void getQuestionByLanguageId() {
        List<QuestionInfo> list = questionService.getQuestionByLanguageId(1);
        assertEquals(8, list.size());
        list = questionService.getQuestionByLanguageId(2);
        assertEquals(1, list.size());
    }

    @Test
    public void getQuestionByQuestionId() {
        List<QuestionInfo> list = questionService.getQuestionByQuestionId(101);
        assertEquals(1, list.size());
    }
}