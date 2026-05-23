package com.telusko.JobListing.controller;

import com.telusko.JobListing.repository.PostRepository;
import com.telusko.JobListing.model.Post;
import com.telusko.JobListing.repository.SearchRepository;
import com.telusko.JobListing.repository.deleteRepository;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository sRepo;

    @Autowired
    deleteRepository drepo;

    @Hidden
    @RequestMapping(value = "/")
    public void redirectToSwagger(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts(){

        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return sRepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return  repo.save(post);
    }

    @DeleteMapping("/posts/{id}")
    public ResponseEntity<String> deletePost(@PathVariable String id){
        boolean deleted = drepo.deleteJob(id);
        if (deleted){
           return ResponseEntity.ok("Successfully deleted!");
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }






}