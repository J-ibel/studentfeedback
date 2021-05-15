package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {
    private String name;
    private String surname;
    private String groupId;
    private String ssn;
    private String username;
    private String password;
    private String email;



}
