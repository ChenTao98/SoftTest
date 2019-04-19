package com.softtest.softtest.service.impl;

import com.softtest.softtest.dao.*;
import com.softtest.softtest.entity.*;
import com.softtest.softtest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionTypeMapper questionTypeMapper;
    @Autowired
    private KnowledgePointMapper knowledgePointMapper;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionLanguageMapper questionLanguageMapper;
    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<QuestionType> getQuestionType() {
        return questionTypeMapper.selectByExample(new QuestionTypeExample());
    }

    @Override
    public List<KnowledgePoint> getKnowledgePoint() {
        return knowledgePointMapper.selectByExample(new KnowledgePointExample());
    }

    @Override
    public List<Project> getProject() {
        return projectMapper.selectByExample(new ProjectExample());
    }

    @Override
    public List<User> getUser() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public List<QuestionLanguage> getLanguage() {
        return questionLanguageMapper.selectByExample(new QuestionLanguageExample());
    }

    @Override
    public List<QuestionInfo> getQuestionByType(Integer typeId) {
        if (typeId == null) {
            return new ArrayList<>();
        }
        QuestionInfoExample questionInfoExample = new QuestionInfoExample();
        questionInfoExample.setTypeId(typeId);
        return questionMapper.selectQuestionInfo(questionInfoExample);
    }

    @Override
    public List<QuestionInfo> getQuestionByKnowledgePoint(Integer knowledgePoint) {
        if (knowledgePoint == null) {
            return new ArrayList<>();
        }
        QuestionInfoExample questionInfoExample = new QuestionInfoExample();
        questionInfoExample.setKnowledgePoint(knowledgePoint);
        return questionMapper.selectQuestionInfo(questionInfoExample);
    }

    @Override
    public List<QuestionInfo> getQuestionByProjectId(Integer projectId) {
        if (projectId == null) {
            return new ArrayList<>();
        }
        QuestionInfoExample questionInfoExample = new QuestionInfoExample();
        questionInfoExample.setProjectId(projectId);
        return questionMapper.selectQuestionInfo(questionInfoExample);
    }

    @Override
    public List<QuestionInfo> getQuestionByAuthorId(Integer authorId) {
        if (authorId == null) {
            return new ArrayList<>();
        }
        QuestionInfoExample questionInfoExample = new QuestionInfoExample();
        questionInfoExample.setAuthorId(authorId);
        return questionMapper.selectQuestionInfo(questionInfoExample);
    }

    @Override
    public List<QuestionInfo> getQuestionByLanguageId(Integer languageId) {
        if (languageId == null) {
            return new ArrayList<>();
        }
        QuestionInfoExample questionInfoExample = new QuestionInfoExample();
        questionInfoExample.setLanguageId(languageId);
        return questionMapper.selectQuestionInfo(questionInfoExample);
    }

    @Override
    public List<QuestionInfo> getQuestionByQuestionId(Integer questionId) {
        if (questionId == null) {
            return new ArrayList<>();
        }
        QuestionInfoExample questionInfoExample = new QuestionInfoExample();
        questionInfoExample.setQuestionId(questionId);
        return questionMapper.selectQuestionInfo(questionInfoExample);
    }
}
