package com.example.Studentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.example.Studentdemo", "com.xyz.demo.service"})
public class StudentdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentdemoApplication.class, args);
    }

}
