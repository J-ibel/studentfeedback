package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.model.Person;
import com.nb.studentfeedback.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;


@RestController("/person")
public class PersonController {
    @Autowired
    private PersonService personService;


    @PostMapping
    public ResponseEntity<?> createPerson(@RequestParam Person person) {
        personService.save(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findPerson(@PathVariable Long id) {

        Person person = personService.findById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);

    }


}
