package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController("/questionAnswer")
public class QuestionAnswerController {
    @Autowired
    private QuestionAnswerService questionAnswerService;

}
