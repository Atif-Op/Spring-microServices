package com.manytomany.employeedepartment.enitity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee")
public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(
            name = "Employee_Department",
            joinColumns = {@JoinColumn(name = "empId")},
            inverseJoinColumns = {@JoinColumn(name = "deptId")}
    )
    private List<DepartmentEntity> departmentEntities;
}
