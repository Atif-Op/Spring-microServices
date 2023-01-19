package com.google.drive.service;

import com.google.drive.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<EmployeeEntity> li;

    public List<EmployeeEntity> getEmployees() {
        li = new ArrayList();
        li = List.of(new EmployeeEntity(1L, "atif", "khan"),
                (new EmployeeEntity(2L, "adika", "dome")),
                (new EmployeeEntity(3L, "vishal", "pandey")));

        return li;
    }

public EmployeeEntity getEmployee(Long employeeId){
        EmployeeEntity newEmployee=null;
    for (EmployeeEntity e:li) {
        if(e.getEmployeeId()==employeeId){
          newEmployee=e;
            break;
        }
    }
    return newEmployee;
}

}
