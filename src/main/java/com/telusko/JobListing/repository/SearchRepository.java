package com.telusko.JobListing.repository;

import com.telusko.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {

     List<Post> findByText(String text);

}
