package com.telusko.JobListing;

import com.telusko.JobListing.model.Post;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document(collection = "JobPost")
public interface PostRepository extends MongoRepository<Post, String>
{

}
