package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class QuestionAnswer {
    private List question;
    private int questionNumber;
    private List answer;
    private Date eventDate;
    private int rating;
}
