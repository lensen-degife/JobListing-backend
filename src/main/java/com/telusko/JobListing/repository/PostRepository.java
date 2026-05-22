package com.telusko.JobListing.repository;

import com.telusko.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post, String>
{

}
