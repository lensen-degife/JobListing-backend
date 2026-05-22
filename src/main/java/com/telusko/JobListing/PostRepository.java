package com.telusko.JobListing;

import com.telusko.JobListing.model.Post;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post, String>
{

}
