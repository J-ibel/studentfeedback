package com.nb.studentfeedback.model;

import lombok.Data;

import java.util.Date;

@Data
public class Search {
    private String studentName;
    private String studentSsn;
    private String studentGroupId;
    private String studentSurname;
    private String studentCountry;
    private Date studentDateOfBirth;


}
