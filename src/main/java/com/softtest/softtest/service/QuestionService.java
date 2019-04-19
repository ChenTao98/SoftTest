package com.softtest.softtest.service;

import com.softtest.softtest.entity.*;

import java.util.List;

//question的查询函数，返回值为对应类型，QuestionInfo是question的实体类，里面的必要信息已经从id 转为对应的信息
public interface QuestionService {
    List<QuestionType> getQuestionType();

    List<KnowledgePoint> getKnowledgePoint();

    List<Project> getProject();

    List<User> getUser();

    List<QuestionLanguage> getLanguage();

    List<QuestionInfo> getQuestionByType(Integer typeId);

    List<QuestionInfo> getQuestionByKnowledgePoint(Integer knowledgePoint);

    List<QuestionInfo> getQuestionByProjectId(Integer projectId);

    List<QuestionInfo> getQuestionByAuthorId(Integer authorId);

    List<QuestionInfo> getQuestionByLanguageId(Integer languageId);

    List<QuestionInfo> getQuestionByQuestionId(Integer questionId);
}
