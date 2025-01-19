package com.example.JobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class loggingAspect {

    private static final Logger Logger = LoggerFactory.getLogger(loggingAspect.class);

    //return type, package-name.class-name.method-name(args)

    //It is always before the any service method called

    //@Before is Advice and in Bracket which is present is know as point cut mention the many method also
    @Before("execution(* com.example.JobApp.service.JobService.getJob(...)) || execution(* com.example.JobApp.service.JobService.updateJob(...))")
    public void logMethodCall(JoinPoint jp){
        Logger.info("Method Called" + jp.getSignature().getName());
    }

    //Work As a finally its means it is always executed at last
    @After("execution(* com.example.JobApp.service.JobService.getJob(...)) || execution(* com.example.JobApp.service.JobService.updateJob(...))")
    public void logMethodExecuted(JoinPoint jp){
        Logger.info("Method Executed" + jp.getSignature().getName());
    }

    //This is executed when the mentioned method has any exception
    @AfterThrowing("execution(* com.example.JobApp.service.JobService.getJob(...)) || execution(* com.example.JobApp.service.JobService.updateJob(...))")
    public void logMethodCrash(JoinPoint jp){
        Logger.info("Method has Some issues" + jp.getSignature().getName());
    }

    //This is executed when the method is successfully executed and before returning
    @AfterReturning("execution(* com.example.JobApp.service.JobService.getJob(...)) || execution(* com.example.JobApp.service.JobService.updateJob(...))")
    public void logMethodBeforeReturn(JoinPoint jp){
        Logger.info("Before returning from method" + jp.getSignature().getName());
    }
}
