package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class StudentQuestionAnswer {

    @Id
    private Long id;

    @Column(nullable = false)
    private String questionName;

    @Column(nullable = false)
    private String questionDescription;

    @Column(nullable = false)
    private String answer;

    @Column(nullable = false)
    private Date answerDate;

    @Column(nullable = false)
    private int rating;
}
