package com.nb.studentfeedback.service;

import com.nb.studentfeedback.model.Person;
import com.nb.studentfeedback.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }


    public void savePerson(Person person) {
        this.personRepository.save(person);
    }
    public Person getPersonById(Long id) {
        Optional<Person> optional = personRepository.findById(id);
        if (optional.isPresent()) {
          return  optional.get();
        } else  {
            throw new RuntimeException( " Person not found for id: " + id);

        }


    }
    public void deletePersonById(Long id) {this.personRepository.deleteById(id);}


}
