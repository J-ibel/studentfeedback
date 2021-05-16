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


    private String question;


    private int questionNumber;


    private String answer;


    private Date eventDate;


    private int rating;
}
