package com.manytomany.employee.mapper;

import com.manytomany.employee.entity.EmployeeEntity;
import com.manytomany.employee.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeEntity ModelToEntity(Employee employee);
}
