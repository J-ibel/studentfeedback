package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.model.Person;
import com.nb.studentfeedback.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/person")
//@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getPersons(){
        return personService.findAll();
    }

//    @PostMapping
//    public ResponseEntity<?> createPerson(@RequestParam Person person) {
//        personService.save(person);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
////                  THERE IS SOMEKIND OF A PROBLEM WITH THIS METHOD

    @GetMapping("/{id}")
    public ResponseEntity<?> findPerson(@PathVariable Long id) {
        Person person = personService.findById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void restorePerson(@PathVariable Long id){
        personService.restoreById(id);
    }


}
