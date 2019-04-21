package com.softtest.softtest.controller;

import com.softtest.softtest.entity.*;
import com.softtest.softtest.service.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ExamController {
    private static Logger LOGGER = LoggerFactory.getLogger(ExamController.class);
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = {"/exam", "", "/"})
    public String getExam(Model model) {
        List<QuestionType> typeList = questionService.getQuestionType();
        model.addAttribute("typeList", typeList);
        List<KnowledgePoint> knowledgePointList = questionService.getKnowledgePoint();
        model.addAttribute("knowledgePointList", knowledgePointList);
        List<Project> projectList = questionService.getProject();
        model.addAttribute("projectList", projectList);
        List<User> userList = questionService.getUser();
        model.addAttribute("authorList", userList);
        List<QuestionLanguage> languageList = questionService.getLanguage();
        model.addAttribute("languageList" , languageList);

        return "exam";
    }
}