package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class QuestionAnswerController {

    private QuestionAnswerService questionAnswerService;

    @Autowired
    public QuestionAnswerController(QuestionAnswerService questionAnswerService) {
        this.questionAnswerService = questionAnswerService;
    }


}
