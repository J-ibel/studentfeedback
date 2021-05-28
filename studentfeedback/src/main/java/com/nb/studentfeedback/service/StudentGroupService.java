package com.nb.studentfeedback.service;

import com.nb.studentfeedback.model.StudentGroup;
import com.nb.studentfeedback.repository.StudentGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentGroupService {

    @Autowired
    private StudentGroupRepository studentGroupRepository;

    public List<StudentGroup> findAllStudentGroups(){
        return studentGroupRepository.findAll();
    }

    public void createStudentGroup(StudentGroup studentGroup){
        this.studentGroupRepository.saveAndFlush(studentGroup);
    }

    public StudentGroup getStudentGroupById(Long id){
        Optional<StudentGroup> optional = studentGroupRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        else{
            throw new RuntimeException("Student group not found for id:: " + id);
        }
    }

    public void deleteStudentGroupById(Long id){
        this.studentGroupRepository.deleteById(id);
    }


}
