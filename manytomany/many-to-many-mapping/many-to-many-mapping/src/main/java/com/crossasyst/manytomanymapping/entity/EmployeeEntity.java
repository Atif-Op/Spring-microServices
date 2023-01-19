package com.crossasyst.manytomanymapping.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
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
//    @JsonManagedReference

    private List<DepartmentEntity> departmentEntities;



}
