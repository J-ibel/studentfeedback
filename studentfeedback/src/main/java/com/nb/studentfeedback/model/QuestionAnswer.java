package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class QuestionAnswer {

    @Id
    private Long id;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private int questionNumber;

    @Column(nullable = false)
    private String answer;

    @Column(nullable = false)
    private Date eventDate;

    @Column(nullable = false)
    private int rating;
}
