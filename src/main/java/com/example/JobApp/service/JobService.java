package com.example.JobApp.service;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost job) {
        jobRepo.save(job);
    }
    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public JobPost getJob(int postId) {
        return jobRepo.findById(postId).orElse(null);
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteById(postId);
    }

    public void loadPage() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(101, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"),2, "Must have good experience n core Java and advanced JAVA","Java Developer"),
                new JobPost(201, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"),2, "Must have good experience n core Java and advanced JAVA","Java Developer")
        ));
        jobRepo.saveAll(jobs);
    }
}
