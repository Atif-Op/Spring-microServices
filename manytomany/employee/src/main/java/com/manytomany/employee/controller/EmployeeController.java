package com.manytomany.employee.controller;


import com.manytomany.employee.model.Employee;
import com.manytomany.employee.model.EmployeeResponse;
import com.manytomany.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody Employee employeee) {
        EmployeeResponse employeeResponse = employeeService.createEmployee(employeee);
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }
}
