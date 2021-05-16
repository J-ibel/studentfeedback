package com.nb.studentfeedback.service;

import com.nb.studentfeedback.model.QuestionAnswer;
import com.nb.studentfeedback.repository.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionAnswerService {

    private QuestionAnswerRepository questionAnswerRepository;

    @Autowired
    public QuestionAnswerService(QuestionAnswerRepository questionAnswerRepository) {
        this.questionAnswerRepository = questionAnswerRepository;
    }
    public List<QuestionAnswer> getAllQuestionAnswer() {
        return  questionAnswerRepository.findAll();

    }
    public void createQuestion(QuestionAnswer questionAnswer) {
        this.questionAnswerRepository.saveAndFlush(questionAnswer);

    }
    public QuestionAnswer getQuestionAnswerById(long id) {
        Optional<QuestionAnswer> optional = questionAnswerRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        else {
            throw new RuntimeException(" Question not found for id:: " + id);
        }
    }

    public void deleteQuestionAnswerbyId(Long id) {
        this.questionAnswerRepository.deleteById(id);


    }


}
