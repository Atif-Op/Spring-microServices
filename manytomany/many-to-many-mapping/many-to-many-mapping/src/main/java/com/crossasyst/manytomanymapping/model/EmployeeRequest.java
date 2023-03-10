package com.crossasyst.manytomanymapping.model;

import com.crossasyst.manytomanymapping.entity.DepartmentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    private String firstName;
    private String lastName;

    private List<DepartmentEntity> departmentEntities;

}
