package com.nb.studentfeedback.service;

import com.nb.studentfeedback.repository.StudentQuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentQuestionAnswerService {

    private StudentQuestionAnswerRepository studentQuestionAnswerRepository;

    @Autowired
    public StudentQuestionAnswerService(StudentQuestionAnswerRepository studentQuestionAnswerRepository) {
        this.studentQuestionAnswerRepository = studentQuestionAnswerRepository;
    }
}
