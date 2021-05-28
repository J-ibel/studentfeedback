package com.nb.studentfeedback.service;

import com.nb.studentfeedback.model.QuestionAnswer;
import com.nb.studentfeedback.model.Quiz;
import com.nb.studentfeedback.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> findAllQuizes(){
        return quizRepository.findAll();
    }

    public void createQuiz(Quiz quiz){
        this.quizRepository.saveAndFlush(quiz);
    }

    public Quiz getQuizById(Long id){
        Optional<Quiz> optional = quizRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        else{
            throw new RuntimeException("Quiz not found for id:: " + id);
        }
    }

    public void deleteQuizById(Long id){
        this.quizRepository.deleteById(id);
    }

    public void addQuestionAnswerToQuizById(Long id){};
    /**
        How to add question to quiz???
     **/


}
