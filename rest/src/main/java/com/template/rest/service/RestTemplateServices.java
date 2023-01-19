package com.template.rest.service;

import com.template.rest.model.Request;
import com.template.rest.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class RestTemplateServices {
    @Value("${test.url}")
    private String fakeURL;
    private final RestTemplate restTemplate;

    public RestTemplateServices(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Response createPost(Request request) {
        HttpEntity httpMethod = new HttpEntity(request);
        Response response = restTemplate.exchange(fakeURL + "/posts", HttpMethod.POST, httpMethod, Response.class).getBody();
        return response;
    }
}