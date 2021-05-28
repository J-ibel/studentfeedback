package com.nb.studentfeedback.service;

import com.nb.studentfeedback.model.Course;
import com.nb.studentfeedback.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAllCourses(){
        return courseRepository.findAll();
    }

    public void saveCourse(Course course){
        this.courseRepository.saveAndFlush(course);
    }

    public Course getCourseById(Long id){
        Optional<Course> optional = courseRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        else{
            throw new RuntimeException("Course not found for id:: " + id);
        }
    }

    public void deleteCourseById(Long id){
        this.courseRepository.deleteById(id);
    }
}
