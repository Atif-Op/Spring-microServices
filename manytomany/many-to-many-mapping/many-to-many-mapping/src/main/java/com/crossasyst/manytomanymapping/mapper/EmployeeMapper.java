package com.crossasyst.manytomanymapping.mapper;


import com.crossasyst.manytomanymapping.entity.DepartmentEntity;
import com.crossasyst.manytomanymapping.entity.EmployeeEntity;
import com.crossasyst.manytomanymapping.model.DepartmentRequest;
import com.crossasyst.manytomanymapping.model.EmployeeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    public EmployeeEntity modelToEntity(EmployeeRequest employeeRequest);

    public EmployeeRequest entityToModel(EmployeeEntity employeeEntity);


    public DepartmentEntity modelToEntity1(DepartmentRequest departmentRequest);

    public DepartmentRequest entityToModel1(DepartmentEntity departmentEntity);


}
