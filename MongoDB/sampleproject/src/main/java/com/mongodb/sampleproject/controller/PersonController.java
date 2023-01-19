package com.mongodb.sampleproject.controller;

import com.mongodb.sampleproject.model.Person;
import com.mongodb.sampleproject.model.PersonResponse;
import com.mongodb.sampleproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/persons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponse> createResource(@RequestBody Person person) {
        PersonResponse personResponse = personService.createResource(person);
        return new ResponseEntity<>(personResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> getResource(@PathVariable Long personId) {
        Person person = personService.getResource(personId);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
