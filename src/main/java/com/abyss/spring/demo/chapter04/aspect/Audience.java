package com.abyss.spring.demo.chapter04.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
    @Before("execution(* com.abyss.spring.demo.chapter04.aspect.Performance.perform(..))")
    public void silenceCellPhone(){
        System.out.println("Silencing cell phones");
    }
    @Before("execution(* com.abyss.spring.demo.chapter04.aspect.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking Seats");
    }
    @AfterReturning("execution(* com.abyss.spring.demo.chapter04.aspect.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }
    @AfterThrowing("execution(* com.abyss.spring.demo.chapter04.aspect.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
