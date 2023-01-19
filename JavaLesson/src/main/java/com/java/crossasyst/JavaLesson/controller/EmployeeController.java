package com.java.crossasyst.JavaLesson.controller;


import com.java.crossasyst.JavaLesson.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(path ="/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Employee>getEmployee(@PathVariable Long employeeId) {
        Employee obj = new Employee("atif", "khan");
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }


}
