package com.spring.springsecurity.controller;

import com.spring.springsecurity.model.Student;
import com.spring.springsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student =studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }
}
