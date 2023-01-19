package com.crossasyst.manytomanymapping.model;

import com.crossasyst.manytomanymapping.entity.EmployeeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {
    private String deptName;
    private List<EmployeeEntity> employeeEntities;
}
