package com.spring.newjpa.service;

import com.spring.newjpa.entity.PersonEntity;
import com.spring.newjpa.mapper.PersonMapper;
import com.spring.newjpa.model.Person;
import com.spring.newjpa.repository.PersonRepository;
import com.spring.newjpa.model.PersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private PersonRepository personRepository;


    public PersonResponse createPerson(Person person) {
        PersonResponse personResponse = new PersonResponse();
        PersonEntity personEntity;
        personEntity = personMapper.modelToEntity(person);
        personRepository.save(personEntity);
        personResponse.setPersonId(personEntity.getPersonId());
        return personResponse;
    }

    public List<PersonEntity> getPerson() {
    List<PersonEntity> personEntity=personRepository.findAll();

      return personEntity;
    }
}
