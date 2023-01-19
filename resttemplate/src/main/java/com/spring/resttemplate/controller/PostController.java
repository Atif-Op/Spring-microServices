package com.spring.resttemplate.controller;

import com.spring.resttemplate.model.Post;

import com.spring.resttemplate.model.PostResponse;
import com.spring.resttemplate.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PostController {

    @Autowired
    private PostService postService;


    @PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PostResponse> createPost(@RequestBody Post post) {
        PostResponse postResponse = postService.createPost(post);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);


    }

    @PutMapping(path = "/posts/{userId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post post) {
        Post updatePost = postService.getPost(id);
        return new ResponseEntity<>(updatePost, HttpStatus.OK);
    }


    @DeleteMapping(path = "/posts/{postId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteById(@PathVariable Long postId) {
        postService.deleteRequest(postId);
        return ResponseEntity.ok().build();
    }


}

