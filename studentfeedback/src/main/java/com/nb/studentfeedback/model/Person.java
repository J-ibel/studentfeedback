package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String ssn;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private String groupId;

    @Column(nullable = false)
    private boolean isTeacher;

    @Column(nullable = false)
    private boolean isAdmin;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

}
