package com.Deva.JobPost.repository;

import com.Deva.JobPost.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JobRepo extends MongoRepository<Job,String> {

}
