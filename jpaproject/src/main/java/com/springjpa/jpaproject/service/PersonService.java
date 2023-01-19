package com.springjpa.jpaproject.service;

import com.springjpa.jpaproject.entity.PersonEntity;
import com.springjpa.jpaproject.mapper.PersonMapper;
import com.springjpa.jpaproject.model.Person;
import com.springjpa.jpaproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
//    private  PersonMapper personMapper;





    public Person savePerson(Person person) {


        PersonEntity pentity=new PersonEntity();
        pentity.setId(person.getId());
        pentity.setFirstName(person.getFirstName());
        pentity.setLastName(person.getLastName());
//        pentity = personMapper.modelToEntity(person);
        personRepository.save(pentity);
        return person;
    }

}
