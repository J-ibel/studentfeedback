package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surname;

    private String ssn;

    private Date dateOfBirth;

    @OneToOne
    private Group group;

    @Enumerated (EnumType.STRING)
    private PersonType personType;

    private String countryCode;

    private String password;

    private String email;

    private boolean isActive;







}
