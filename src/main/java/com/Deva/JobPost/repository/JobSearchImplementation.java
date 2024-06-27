package com.Deva.JobPost.repository;

import com.Deva.JobPost.model.Job;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class JobSearchImplementation implements JobSearch{

    @Autowired
    private MongoClient mongoClient;

    @Autowired
    MongoConverter converter;

    @Override
    public List<Job> searchByText(String text) {
        List<Job> jobs=new ArrayList<>();

        MongoDatabase database = mongoClient.getDatabase("DevaGonde");
        MongoCollection<Document> collection = database.getCollection("JobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("index", "default")
                        .append("text",
                        new Document("query", text)
                        .append("path", Arrays.asList("desc", "profile", "techs")))),
                        new Document("$sort",
                        new Document("exp", 1L))));

        result.forEach((doc)->jobs.add(converter.read(Job.class,doc)));

        return jobs;
    }
}
