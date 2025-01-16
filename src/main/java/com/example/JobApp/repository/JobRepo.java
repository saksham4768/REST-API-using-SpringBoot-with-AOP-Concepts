package com.example.JobApp.repository;

import com.example.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {


}

//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//public void addJobPost(JobPost jobPost) {
//    jobs.add(jobPost);
//}
//
//public JobPost getJob(int postId) {
//
//    for(JobPost jobPost : jobs){
//        if(jobPost.getPostId() == postId){
//            return jobPost;
//        }
//    }
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1 : jobs){
//        if(jobPost1.getPostId() == jobPost.getPostId()){
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for (JobPost jobPost : jobs) {
//        if (jobPost.getPostId() == postId) {
//            jobs.remove(jobPost);
//            return;
//        }
//    }
//}
