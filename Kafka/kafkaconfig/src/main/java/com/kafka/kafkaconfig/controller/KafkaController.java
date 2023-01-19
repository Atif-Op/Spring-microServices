package com.kafka.kafkaconfig.controller;

import com.kafka.kafkaconfig.model.Person;
import com.kafka.kafkaconfig.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("api/kafka")
public class KafkaController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping(value = "/persons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addPerson(@RequestBody Person person) {
        kafkaProducer.addPerson(person);
        return ResponseEntity.ok("data sent");
    }

}
