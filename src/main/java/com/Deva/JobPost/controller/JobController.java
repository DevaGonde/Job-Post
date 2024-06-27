package com.Deva.JobPost.controller;

import com.Deva.JobPost.model.Job;
import com.Deva.JobPost.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;


    @GetMapping("/GetAll")
    public ResponseEntity<List<Job>> getAllPosts(){
        return  new ResponseEntity<List<Job>>(service.getAllPosts(), HttpStatus.FOUND);
    }

    @GetMapping("/Search/{searchedText}")
    public ResponseEntity<List<Job>> getBySearch(@PathVariable String searchedText){
        return  new ResponseEntity<List<Job>>(service.searchJob(searchedText),HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getById(@PathVariable String id){
        return new ResponseEntity<Job>(service.getById(id),HttpStatus.FOUND);
    }

    @PostMapping("/AddJob")
    public Job addJob(@RequestBody Job newJob){
        return service.addJob(newJob);
    }

}
