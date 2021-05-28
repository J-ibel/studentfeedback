package com.nb.studentfeedback.service;

import com.nb.studentfeedback.model.Person;
import com.nb.studentfeedback.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void save(Person person) {
        personRepository.saveAndFlush(person);
    }

    public Person findById(Long id) {
        Optional<Person> optional = personRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException(" Person not found for id: " + id);
        }
    }

    public void deleteById(Long id) {
        Person person = findById(id);
        person.setActive(false);
        save(person);
    }

    public void restoreById(Long id) {
        Person person = findById(id);
        person.setActive(true);
        save(person);
    }
}
