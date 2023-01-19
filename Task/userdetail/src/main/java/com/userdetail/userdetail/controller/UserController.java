package com.userdetail.userdetail.controller;


import com.userdetail.userdetail.model.UserResponse;
import com.userdetail.userdetail.model.UserDetail;
import com.userdetail.userdetail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/userdetails", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponse> createUser(@RequestBody UserDetail userDetail) {
       UserResponse userResponse= userService.createUser(userDetail);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

}
