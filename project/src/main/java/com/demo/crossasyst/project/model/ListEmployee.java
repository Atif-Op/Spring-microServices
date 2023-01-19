package com.demo.crossasyst.project.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListEmployee {

    public List<Employee> getEmployee(Long employeeId) {
        List<Employee> li = new ArrayList<Employee>();
        li.add(new Employee("usman", "khan"));
        li.add(new Employee("atif", "khan"));
        li.add(new Employee("istiyak", "khan"));
        return li;
    }
}