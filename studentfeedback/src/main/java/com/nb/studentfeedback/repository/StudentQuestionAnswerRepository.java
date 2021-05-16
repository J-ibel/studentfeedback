package com.nb.studentfeedback.repository;

import com.nb.studentfeedback.model.StudentQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentQuestionAnswerRepository extends JpaRepository<StudentQuestionAnswer, Long> {
}
