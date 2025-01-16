package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("JobPosts")
    @ResponseBody
    public List<JobPost>getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("JobPosts/{postId}")
    @ResponseBody
    public JobPost getJob(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping("JobPosts")
    @ResponseBody
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("JobPosts")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("JobPosts/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("LoadPage")
    public String LoadPage() {
        service.loadPage();
        return "success";
    }
}
