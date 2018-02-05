package com.abyss.quartz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;

public class App {

    @PostConstruct
    public void init(){

    }
    public static void main(String[] a) throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.start();
        while (true){
            Thread.sleep(5000);
        }
    }
}
