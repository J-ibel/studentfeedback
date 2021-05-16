package com.nb.studentfeedback.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    private List<Course> courses;


}
