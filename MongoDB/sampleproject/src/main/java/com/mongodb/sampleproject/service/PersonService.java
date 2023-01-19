package com.mongodb.sampleproject.service;

import com.mongodb.sampleproject.document.PersonDocument;
import com.mongodb.sampleproject.model.Person;
import com.mongodb.sampleproject.model.PersonResponse;
import com.mongodb.sampleproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {


    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonResponse createResource(Person person) {
        PersonDocument personDocument = new PersonDocument();
        PersonResponse personResponse = new PersonResponse();
        personDocument.setId(person.getId());
        personDocument.setFirstName(person.getFirstName());
        personDocument.setLastName(person.getLastName());
        personRepository.save(personDocument);
        personResponse.setPersonId(personDocument.getId());
        return personResponse;
    }

    public Person getResource(Long personId) {
        Person person = new Person();
        PersonDocument personDocument = new PersonDocument();
        Optional<PersonDocument> getPerson = personRepository.findById(personId);
        if (getPerson.isPresent()) {
            PersonDocument person1 = getPerson.get();
            person.setId(person1.getId());
            person.setFirstName(person1.getFirstName());
            person.setLastName(person1.getLastName());
        }
        return person;
    }
}
