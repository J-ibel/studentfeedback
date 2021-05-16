package com.nb.studentfeedback.service;

import com.nb.studentfeedback.repository.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionAnswerService {

    private QuestionAnswerRepository questionAnswerRepository;

    @Autowired
    public QuestionAnswerService(QuestionAnswerRepository questionAnswerRepository) {
        this.questionAnswerRepository = questionAnswerRepository;
    }
}
