package com.nb.studentfeedback.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(
            mappedBy = "quiz"
    )
    private List<QuestionAnswer> defaultQuestions;

//    @OneToMany
//    private List<QuestionAnswer> additionalQuestions;


    @OneToOne(
            mappedBy = "quiz"
    )
    private Person createdBy;

//    @OneToOne
//    private Person answeredBy;

    private LocalDateTime createdDate;

    private LocalDateTime answeredDate;

    private boolean isActive;


}
