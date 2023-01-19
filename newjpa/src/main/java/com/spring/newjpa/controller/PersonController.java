package com.spring.newjpa.controller;

import com.spring.newjpa.entity.PersonEntity;
import com.spring.newjpa.model.Person;
import com.spring.newjpa.model.PersonResponse;
import com.spring.newjpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = "/persons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponse> createPerson(@RequestBody Person person) {
        PersonResponse p = personService.createPerson(person);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping(path = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <List<PersonEntity>> getPerson() {
        List<PersonEntity> personEntity=personService.getPerson();
        return new ResponseEntity<>(personEntity, HttpStatus.OK);
    }
}

