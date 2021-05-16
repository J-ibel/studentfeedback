package com.nb.studentfeedback.repository;

import com.nb.studentfeedback.model.Course;
import com.nb.studentfeedback.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}