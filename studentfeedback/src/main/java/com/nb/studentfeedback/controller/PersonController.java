package com.nb.studentfeedback.controller;

import com.nb.studentfeedback.model.Person;
import com.nb.studentfeedback.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }




    @PostMapping
    public String addPerson(@ModelAttribute("person") Person person){
        personService.savePerson(person);
        return "redirect:/";
    }






}
