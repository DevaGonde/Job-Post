package com.Deva.JobPost.service;

import com.Deva.JobPost.model.Job;
import com.Deva.JobPost.repository.JobRepo;
import com.Deva.JobPost.repository.JobSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    private JobRepo repo ;

    @Autowired
    private JobSearch search;


    public List<Job> getAllPosts() {
        return repo.findAll();
    }

    public List<Job> searchJob(String text) {
        return search.searchByText(text);
    }

    public Job getById(String text) {
        return repo.findById(text).orElseThrow(() -> new RuntimeException("not found"));
    }

    public Job addJob(Job newJob) {
        return repo.save(newJob);
    }

}
