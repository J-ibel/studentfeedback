package com.nb.studentfeedback.model;

import lombok.Data;

import java.util.Date;

@Data
public class Search {
    private String name;
    private String ssn;
    private String groupId;
    private String surname;
    private String country;
    private Date dateOfBirth;


}
