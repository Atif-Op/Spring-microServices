package com.spring.jpa.service;

import com.spring.jpa.entities.PersonEntity;
import com.spring.jpa.model.Person;
import com.spring.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personrepository;

    public Person savePerson(Person person) {
        PersonEntity pentity = new PersonEntity();
//        pentity.setId(person.getId());
//        pentity.setFirstName(person.getFirstName());
//        pentity.setLastName(person.getLastName());
        personrepository.save(pentity);
        return person;
    }
}
