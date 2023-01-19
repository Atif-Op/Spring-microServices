package com.spring.resttemplate.service;

import com.spring.resttemplate.model.Post;
import com.spring.resttemplate.model.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PostService {
    @Value("${test.url}")
    private String fakeURL;
    @Autowired
    private RestTemplate restTemplate;
    private HttpEntity<?> Post;

    public PostResponse createPost(Post post) {
        PostResponse postResponse = restTemplate.exchange(fakeURL + "/posts", HttpMethod.POST, Post, PostResponse.class).getBody();
        return postResponse;

    }

    public Post getPost(Long postId) {
        Post post = restTemplate.getForObject(fakeURL + "/posts/{postId}", Post.class, postId);
        return post;
    }

    public PostResponse updatePost(Long postId, Post post) {
        HttpEntity http = new HttpEntity<>(post);
        ResponseEntity<PostResponse> putResponce = restTemplate.exchange(fakeURL.concat("/posts"), HttpMethod.PUT, http, PostResponse.class);
        return putResponce.getBody();
    }


    public void deleteRequest(Long postId) {
        restTemplate.delete(fakeURL + "/posts/{postId}", postId);

    }

}
