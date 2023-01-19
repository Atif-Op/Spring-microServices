package com.demo.crossasyst.project.service;


import com.demo.crossasyst.project.entity.EmployeeEntity;
import com.demo.crossasyst.project.model.Employee;
import com.demo.crossasyst.project.model.EmployeeResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Random;


@Service
public class EmployeeService {


    public Employee getEmployee(Long employeeId) {
        Employee emp = new Employee("atif", "khan");
        return emp;
    }

    public EmployeeResponse createEmployee(Employee employee) {
        int employeeId = new Random().nextInt();
        EmployeeResponse response = new EmployeeResponse();
        response.setEmployeeId(employeeId);
        return response;


    }

    private List<EmployeeEntity> emplist;

    public EmployeeService() {
        emplist = List.of(new EmployeeEntity(1, "atif", "khan"),
                new EmployeeEntity(2, "adika", "aniket"),
                new EmployeeEntity(3, "usman", "khan"));

    }

    public EmployeeEntity updateEmployee(Long emplyeeId) throws Exception {
        EmployeeEntity ee = null;
        for (EmployeeEntity emp : emplist) {
            if (emp != null) {
                if (emp.getId() == emplyeeId) {
                    ee = emp;
                    break;
                } else {
                    throw new Exception("Not found");
                }
            }
        }
        return ee;
    }

}


