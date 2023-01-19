package com.userdetail.userdetail.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDetail {
    private String firstName;
    private String lastName;
    private String emailId;
    private Long phone;
    private Date dob;

}
