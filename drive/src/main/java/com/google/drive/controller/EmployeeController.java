package com.google.drive.controller;


import com.google.drive.entity.EmployeeEntity;
import com.google.drive.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService emp;

    @GetMapping(path = "/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeEntity>getEmployee(Long employeeId) {
        EmployeeEntity employee=emp.getEmployee(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }
}
