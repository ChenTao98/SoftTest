package com.softtest.softtest.controller;

import com.softtest.softtest.entity.Question;
import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.entity.QuestionType;
import com.softtest.softtest.service.QuestionService;
import com.softtest.softtest.util.ApiResult;
import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.sub.QuestionAlreadyAddedException;
import com.softtest.softtest.util.errCode.sub.QuestionAlreadyDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping(value = "/api")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    private static Map<String, List<QuestionInfo>> questionMap = null;

    private void initQuestionMap() {
        questionMap = Collections.synchronizedMap(new HashMap<>());
        List<QuestionType> types = questionService.getQuestionType();
        for (QuestionType type: types) {
            questionMap.put(type.getName(), new ArrayList<>());
        }
    }

//    /**
//     * 每种题型不能超过5个
//     * */
//    private static List<QuestionInfo> questionsForTest = new ArrayList<>();
//
//    @RequestMapping(value = "/add/{questionId}", produces = "application/json;charset=UTF-8")
//    public Map<String, String> addQuestionByQuestionId(@PathVariable("questionId") Integer questionId) {
//        Map<String , String> msgMap = new HashMap<>();
//        List<QuestionInfo> questionList = questionService.getQuestionByQuestionId(questionId);
//        if (questionList.size() == 0) {
//            msgMap.put("msg", "No such question!");
//            return msgMap;
//        }
//
//        msgMap.put("msg", "success");
//        return msgMap;
//    }

    // 添加题目
    @RequestMapping(value = "/addQuestion/{questionId}", produces = "application/json;charset=UTF-8")
    public String addQuestionByQuestionId(@PathVariable("questionId") Integer questionId) {
        if (questionMap == null) {
            initQuestionMap();
        }
        if (questionId < 0) {
            return ApiResult.writeError(ErrorCode.WRONG_QUESTION_ID);
        }
        List<QuestionInfo> questionList = questionService.getQuestionByQuestionId(questionId);
        if (questionList.size() == 0) {
            return ApiResult.writeError(ErrorCode.NO_SUCH_QUESTION);
        }
        QuestionInfo questionInfo = questionList.get(0);
        try {
            addQuestion(questionInfo);
        } catch (QuestionAlreadyAddedException e) {
            return ApiResult.writeError(e);
        }
        return ApiResult.writeSuccess();
    }

    private static synchronized void addQuestion(QuestionInfo questionInfo) throws QuestionAlreadyAddedException {
        List<QuestionInfo> list = questionMap.get(questionInfo.getType());
        for (QuestionInfo question: list) {
            if (question.getQuestionId() == questionInfo.getQuestionId()) {
                throw new QuestionAlreadyAddedException("问题ID为"+questionInfo.getQuestionId());
            }
        }
        list.add(questionInfo);
    }

    @RequestMapping(value = "/deleteQuestion/{questionId}", produces = "application/json;charset=UTF-8")
    public String deleteQuestionByQuestionId(@PathVariable("questionId") Integer questionId) {
        if (questionMap == null) {
            initQuestionMap();
        }
        if (questionId < 0) {
            return ApiResult.writeError(ErrorCode.WRONG_QUESTION_ID);
        }
        List<QuestionInfo> questionList = questionService.getQuestionByQuestionId(questionId);
        if (questionList.size() == 0) {
            return ApiResult.writeError(ErrorCode.NO_SUCH_QUESTION);
        }
        QuestionInfo questionInfo = questionList.get(0);
        try {
            deleteQuestion(questionInfo);
        } catch (QuestionAlreadyDeletedException e) {
            return ApiResult.writeError(e);
        }
        return ApiResult.writeSuccess();
    }

    private static synchronized void deleteQuestion(QuestionInfo questionInfo) throws QuestionAlreadyDeletedException {
        List<QuestionInfo> list = questionMap.get(questionInfo.getType());
        for (QuestionInfo question: list) {
            if (question.getQuestionId() == questionInfo.getQuestionId()) {
                list.remove(question);
                return;
            }
        }
        throw new QuestionAlreadyDeletedException("题号为"+questionInfo.getQuestionId());
    }

    @RequestMapping(value = "/getTest", produces = "application/json;charset=UTF-8")
    public String getTest() {
        if (questionMap == null) {
            initQuestionMap();
        }
        return ApiResult.writeData(questionMap);
    }

    @RequestMapping(value = "/question/{questionId}", produces = "application/json;charset=UTF-8")
    public QuestionInfo getQuestionByQuestionId(@PathVariable("questionId") Integer questionId) {
        if (questionId < 0) {
            return null;
        }
        List<QuestionInfo> questionList = questionService.getQuestionByQuestionId(questionId);
        if (questionList.size() == 0) {
            return null;
        }
        return questionList.get(0);
    }

    @RequestMapping(value = "/type/getAllTypes", produces = "application/json;charset=UTF-8")
    public List<QuestionType> getQuestionByQuestionId() {
        if (questionMap == null) {
            initQuestionMap();
        }
        List<QuestionType> types = questionService.getQuestionType();
        return types;
    }


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
