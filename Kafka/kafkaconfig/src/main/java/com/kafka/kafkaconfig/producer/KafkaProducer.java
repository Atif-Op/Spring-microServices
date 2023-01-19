package com.kafka.kafkaconfig.producer;

import com.kafka.kafkaconfig.model.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;

    public void addPerson(Person person) {
        Message<Person> message = MessageBuilder
                .withPayload(person)
                .setHeader(KafkaHeaders.TOPIC, "finaltopic").build();
        kafkaTemplate.send(message);
        log.info("message sent" + person.toString());
    }
}
