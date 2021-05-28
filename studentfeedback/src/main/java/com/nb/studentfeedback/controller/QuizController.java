package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;
}
