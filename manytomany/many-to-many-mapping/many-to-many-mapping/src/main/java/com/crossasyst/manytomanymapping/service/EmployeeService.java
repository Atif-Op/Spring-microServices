package com.crossasyst.manytomanymapping.service;

import com.crossasyst.manytomanymapping.entity.DepartmentEntity;
import com.crossasyst.manytomanymapping.entity.EmployeeEntity;
import com.crossasyst.manytomanymapping.mapper.EmployeeMapper;
import com.crossasyst.manytomanymapping.model.EmployeeRequest;
import com.crossasyst.manytomanymapping.model.EmployeeResponse;
import com.crossasyst.manytomanymapping.repository.DepartmentRepository;
import com.crossasyst.manytomanymapping.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class
EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.employeeMapper = employeeMapper;
    }
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        EmployeeEntity employeeEntity = employeeMapper.modelToEntity(employeeRequest);
        employeeRepository.save(employeeEntity);
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setEmpId(employeeEntity.getEmpId());
        return employeeResponse;

    }
    public List<EmployeeEntity> findAll() {
        List<EmployeeEntity> employeeEntity = employeeRepository.findAll();
        return employeeEntity;

    }

    public EmployeeRequest getEmployee(Long employeeId) {
        EmployeeEntity employeeEntity = employeeRepository.findById(employeeId).get();
        return employeeMapper.entityToModel(employeeEntity);
    }




    public void deleteEmployee(Long employeeId) {
        EmployeeEntity employeeEntity = employeeRepository.findById(employeeId).get();
        if (employeeEntity != null) {
            employeeRepository.deleteById(employeeEntity.getEmpId());
        }
    }

    public EmployeeRequest assignDepartmentToEmployee(Long empId, Long deptId) {

        List<DepartmentEntity> departmentEntities=null;
        EmployeeEntity employeeEntity=employeeRepository.findById(empId).get();
        DepartmentEntity departmentEntity=departmentRepository.findById(deptId).get();
          departmentEntities=employeeEntity.getDepartmentEntities();
        departmentEntities.add(departmentEntity);
        employeeEntity.setDepartmentEntities(departmentEntities);
        employeeRepository.save(employeeEntity);

        EmployeeRequest employeeRequest=employeeMapper.entityToModel(employeeEntity);
        return employeeRequest;


    }
}
