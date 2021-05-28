package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.service.StudentGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/studentGroup")
public class StudentGroupController {
    @Autowired
    private StudentGroupService studentGroupService;
}
