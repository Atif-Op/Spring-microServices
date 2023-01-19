package com.kafka.kafkaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaconfigApplication.class, args);
	}

}
