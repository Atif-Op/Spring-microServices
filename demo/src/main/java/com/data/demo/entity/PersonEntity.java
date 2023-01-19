package com.data.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonEntity {
    private Long id;
    private String firstName;
    private String lastName;
}
