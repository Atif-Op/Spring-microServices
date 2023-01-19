package com.spring.data.service;

import com.spring.data.entity.PersonEntity;
import com.spring.data.model.Person;
import com.spring.data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personrepository;

    public Person savePerson(Person person) {
        PersonEntity pentity = new PersonEntity();
       pentity.setId(person.getId());
        pentity.setFirstName(person.getFirstName());
       pentity.setLastName(person.getLastName());
        personrepository.save(pentity);
        return person;
    }
}
