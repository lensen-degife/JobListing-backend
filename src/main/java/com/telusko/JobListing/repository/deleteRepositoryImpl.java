package com.telusko.JobListing.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class deleteRepositoryImpl implements deleteRepository{

    @Autowired
    PostRepository repo;

    @Override
    public boolean deleteJob(String id) {
        if (repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        else return false;
    }
}
