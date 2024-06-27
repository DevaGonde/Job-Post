package com.Deva.JobPost.repository;

import com.Deva.JobPost.model.Job;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JobSearch {
    public List<Job> searchByText(String text);
}
