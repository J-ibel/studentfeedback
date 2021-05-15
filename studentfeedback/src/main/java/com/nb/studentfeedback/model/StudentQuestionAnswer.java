package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class StudentQuestionAnswer {
    private String questionName;
    private String questionDescription;
    private String answer;
    private Date answerDate;
    private int rating;
}
