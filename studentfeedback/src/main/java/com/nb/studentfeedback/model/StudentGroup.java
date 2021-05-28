package com.nb.studentfeedback.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "studentGroup")
    private List<Course> courses;

    private boolean isActive;

    @OneToOne
    @JoinColumn(
            name = "person_id",
            referencedColumnName = "id"
    )
    private Person person;



}
