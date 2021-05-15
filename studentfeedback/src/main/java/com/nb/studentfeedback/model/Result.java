package com.nb.studentfeedback.model;

import lombok.Data;

import java.util.Date;

@Data
public class Result {
    private int rating;
    private Date answerDate;
    private String result;

}
