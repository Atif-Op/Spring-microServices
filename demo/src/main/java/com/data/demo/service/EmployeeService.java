package com.data.demo.service;

import com.data.demo.entity.EmployeeEntity;
import com.data.demo.entity.EmployeeResponse;
import com.data.demo.mapper.PersonMapper;
import com.data.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class EmployeeService {

    private List<EmployeeEntity> emplist;

    public EmployeeService() {
        emplist = new ArrayList<>();
        emplist.add(new EmployeeEntity(1, "atif", "khan"));
        emplist.add(new EmployeeEntity(2, "adika", "dome"));
        emplist.add(new EmployeeEntity(3, "usman", "khan"));

    }

    //Get Employee...
    public EmployeeEntity getEmployee(Long employeeId) {
        EmployeeEntity ee = null;
        for (EmployeeEntity emp : emplist) {
            if (emp.getId() == employeeId) {
                ee = emp;
                break;
            }
        }
        return ee;
    }

    public List<EmployeeEntity> getAllEmployee() {

        return emplist;
    }

    //Put Employee...
    public Employee updateEmployee(Long employeeId, Employee employee) {
        for (EmployeeEntity e : emplist) {
            if (employeeId == e.getId()) {
                e.setFirstName(employee.getFirstName());
                e.setLastName(employee.getLastName());
            }
        }
        return employee;
    }


    public EmployeeResponse createEmployee(Employee employee) {

        Long newId = new Random().nextLong() * (-20);
        EmployeeResponse empresponse = new EmployeeResponse();
        empresponse.setEmployeeId(newId);


        return empresponse;
    }
}
