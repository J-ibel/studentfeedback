package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class QuestionAnswer {
    private String questionName;
    private String questionDescription;
    private int questionNumber;
    private String answer;
    private Date answerDate;
    private int rating;
    private List questionList;


}
