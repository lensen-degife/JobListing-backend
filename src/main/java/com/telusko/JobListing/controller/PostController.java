package com.telusko.JobListing.controller;

import com.telusko.JobListing.PostRepository;
import com.telusko.JobListing.model.Post;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Hidden
    @RequestMapping(value = "/")
    public void redirectToSwagger(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){

        return repo.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return  repo.save(post);
    }


}