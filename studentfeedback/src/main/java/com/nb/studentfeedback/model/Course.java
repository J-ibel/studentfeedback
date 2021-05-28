package com.nb.studentfeedback.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private boolean isActive;

    @ManyToOne
    @JoinColumn(
            name = "student_group_id",
            referencedColumnName = "id"
    )
    private StudentGroup studentGroup;


}
