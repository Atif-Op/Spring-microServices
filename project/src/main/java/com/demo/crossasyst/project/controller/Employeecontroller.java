package com.demo.crossasyst.project.controller;

import com.demo.crossasyst.project.entity.EmployeeEntity;
import com.demo.crossasyst.project.model.Employee;
import com.demo.crossasyst.project.model.EmployeeResponse;
import com.demo.crossasyst.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Employeecontroller {
    @Autowired
    private EmployeeService employeeService;


    /* private ListEmployee li;
     private EmployeeService empservice;
 
     @GetMapping(path = "/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
     ResponseEntity<List<Employee>> GetEmployee(@PathVariable Long employeeId) {
         //Employee emp = employeeService.getEmployee(1L);
         List<Employee> emp1 = li.getEmployee(2L);
 
 
         return new ResponseEntity<>(emp1, HttpStatus.OK);
 
     }
 */
//    @PostMapping(path = "/employees", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    ResponseEntity<EmployeeResponse> createEmployee(@RequestBody Employee employee) {
//        EmployeeResponse res = employeeService.createEmployee(employee);
//        return new ResponseEntity<>(res, HttpStatus.OK);
//    }



    @GetMapping(path = "/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<EmployeeEntity>> GetEmployee(@PathVariable Long employeeId) {
        //Employee emp = employeeService.getEmployee(1L);
        List<EmployeeEntity> emp=employeeService.getEmployee(1L);


    }