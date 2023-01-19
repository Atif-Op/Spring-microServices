package com.crossasyst.manytomanymapping.controller;

import com.crossasyst.manytomanymapping.entity.DepartmentEntity;
import com.crossasyst.manytomanymapping.entity.EmployeeEntity;
import com.crossasyst.manytomanymapping.model.DepartmentRequest;
import com.crossasyst.manytomanymapping.model.DepartmentResponse;
import com.crossasyst.manytomanymapping.model.EmployeeRequest;
import com.crossasyst.manytomanymapping.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @PostMapping("/departments")
    public ResponseEntity<DepartmentResponse> createDepartment(@RequestBody DepartmentRequest departmentRequest)
    {
        DepartmentResponse departmentResponse=departmentService.createDepartment(departmentRequest);
        return new ResponseEntity<>(departmentResponse, HttpStatus.CREATED);
    }


    @GetMapping("/departments")
    public ResponseEntity<List<DepartmentEntity>> findAll(){
        List<DepartmentEntity> departmentEntities=departmentService.findAll();
        return new ResponseEntity<>(departmentEntities,HttpStatus.OK);

    }

    @GetMapping(path = "/departments/{departmentId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DepartmentRequest>getDepartment(@PathVariable Long departmentId ){
        DepartmentRequest departmentRequest=departmentService.getDepartment(departmentId);
        return new ResponseEntity<>(departmentRequest,HttpStatus.OK);
    }
}
