package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.model.Course;
import com.nb.studentfeedback.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<?> createCourse(@RequestParam Course course){
        courseService.saveCourse(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
