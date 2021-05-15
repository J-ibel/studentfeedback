package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Admin {
    private String name;
    private String surname;
    private String ssn;
    private Date dateOfBirth;
    private String groupId;
    private boolean isTeacher;
    private String country;
    private String username;
    private String password;
    private String email;
}
