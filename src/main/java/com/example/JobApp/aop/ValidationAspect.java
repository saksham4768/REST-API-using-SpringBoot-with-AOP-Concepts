package com.example.JobApp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    public static final Logger Logger = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.example.JobApp.service.JobService.getJob(...)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint jp, int postId) throws Throwable {
        if(postId < 0){
            Logger.info("Post Id is Negative updating it");
            postId = -postId;
            Logger.info("New Value" + postId);
        }

        Object obj = jp.proceed(new Object[]{postId});
        return obj;
    }
}
