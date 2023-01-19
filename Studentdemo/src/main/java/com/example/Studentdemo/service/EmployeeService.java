package com.example.Studentdemo.service;

import com.example.Studentdemo.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private List<EmployeeEntity> emplist;

    public EmployeeService() {
        emplist = List.of(new EmployeeEntity(1, "atif", "khan"),
                new EmployeeEntity(2, "adika", "aniket"),
                new EmployeeEntity(3, "usman", "khan"));

    }

    public EmployeeEntity getEmployee(Long emplyeeId) throws Exception {
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



