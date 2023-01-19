package com.manytomany.employee.service;

import com.manytomany.employee.entity.EmployeeEntity;
import com.manytomany.employee.mapper.EmployeeMapper;
import com.manytomany.employee.model.Employee;
import com.manytomany.employee.model.EmployeeResponse;
import com.manytomany.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    private EmployeeRepository employeeRepository;

    public EmployeeResponse createEmployee(Employee employee) {
        EmployeeEntity employeeEntity;
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeEntity = employeeMapper.ModelToEntity(employee);
        employeeRepository.save(employeeEntity);
        employeeResponse.setEmpId(employeeResponse.getEmpId());


        return employeeResponse;
    }
}
