package com.template.rest.contoller;

import com.template.rest.model.Request;
import com.template.rest.service.RestTemplateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplateController {
    @Autowired
    private RestTemplateServices restTemplateServices;

    @PostMapping(value = "/posts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Request> createPost(@RequestBody Request request) {
        restTemplateServices.createPost(request);
        return new ResponseEntity<Request>(request, HttpStatus.OK);
    }

}
