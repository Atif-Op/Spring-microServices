package com.crossasyst.manytomanymapping.service;

import com.crossasyst.manytomanymapping.entity.DepartmentEntity;
import com.crossasyst.manytomanymapping.entity.EmployeeEntity;
import com.crossasyst.manytomanymapping.mapper.EmployeeMapper;
import com.crossasyst.manytomanymapping.model.DepartmentRequest;
import com.crossasyst.manytomanymapping.model.DepartmentResponse;
import com.crossasyst.manytomanymapping.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final EmployeeMapper employeeMapper;
    private final DepartmentRepository departmentRepository;

    public DepartmentService(EmployeeMapper employeeMapper, DepartmentRepository departmentRepository) {
        this.employeeMapper = employeeMapper;
        this.departmentRepository = departmentRepository;
    }

    public DepartmentResponse createDepartment(DepartmentRequest departmentRequest) {
        DepartmentEntity departmentEntity = employeeMapper.modelToEntity1(departmentRequest);
        departmentRepository.save(departmentEntity);
        DepartmentResponse departmentResponse = new DepartmentResponse();
        departmentResponse.setDeptId(departmentEntity.getDeptId());
        return departmentResponse;

    }

    public List<DepartmentEntity> findAll() {
        List<DepartmentEntity> departmentEntities = departmentRepository.findAll();
        return departmentEntities;
    }

    public DepartmentRequest getDepartment(Long departmentId) {

        DepartmentEntity departmentEntity=departmentRepository.findById(departmentId).get();
        return employeeMapper.entityToModel1(departmentEntity);
    }
}


