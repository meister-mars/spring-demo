package com.abyss.quartz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Slf4j
@Component
@Repository
public class MyJob1 {
    @Scheduled(cron = "${quartz.job1.cronExpression}")
    public void execute(){
        log.info("MyJob1");
    }

}
