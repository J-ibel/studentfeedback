package com.nb.studentfeedback.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class QuestionAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String question;

    private String answer;

    private LocalDate eventDate;

    private int rating;

    private boolean isActive;

    @ManyToOne
    @JoinColumn(
            name = "quiz_id",
            referencedColumnName = "id"
    )
    private Quiz quiz;




}
