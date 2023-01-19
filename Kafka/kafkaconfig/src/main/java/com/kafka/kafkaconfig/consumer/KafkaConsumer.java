package com.kafka.kafkaconfig.consumer;

import com.kafka.kafkaconfig.model.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaConsumer {

    @KafkaListener(topics = "finaltopic", groupId = "myGroup")

    public void getMessage(Person person) {
        log.info("message received" + person.toString());
    }
}
