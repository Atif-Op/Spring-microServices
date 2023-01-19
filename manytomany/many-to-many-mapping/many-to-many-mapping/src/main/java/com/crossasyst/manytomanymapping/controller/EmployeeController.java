package com.crossasyst.manytomanymapping.controller;

import com.crossasyst.manytomanymapping.entity.EmployeeEntity;
import com.crossasyst.manytomanymapping.model.EmployeeRequest;
import com.crossasyst.manytomanymapping.model.EmployeeResponse;
import com.crossasyst.manytomanymapping.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @PostMapping("/employees")
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequest employeeRequest)
    {
        EmployeeResponse employeeResponse=employeeService.createEmployee(employeeRequest);
        return new ResponseEntity<>(employeeResponse, HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeEntity>> findAll(){
        List<EmployeeEntity> employeeRequest=employeeService.findAll();
        return new ResponseEntity<>(employeeRequest,HttpStatus.OK);

    }
    @GetMapping(path = "/employees/{employeeId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeRequest>getEmployee( @PathVariable Long employeeId ){
        return new ResponseEntity<>(employeeService.getEmployee(employeeId),HttpStatus.OK);
    }

    @DeleteMapping(path = "/employees/{employeeId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void>deleteEmployee(@PathVariable Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/employees/{empId}/department/{deptId}")
    public ResponseEntity<EmployeeRequest> assignDepartmentToEmployee(@PathVariable Long empId,@PathVariable Long deptId)
    {
        EmployeeRequest employeeRequest=employeeService.assignDepartmentToEmployee(empId,deptId);
        return new ResponseEntity<>(employeeRequest,HttpStatus.OK);
    }


}
