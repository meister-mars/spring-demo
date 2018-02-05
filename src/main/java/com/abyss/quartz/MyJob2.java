package com.abyss.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@Component
public class MyJob2 {

    @Scheduled(cron = "${quartz.job2.cronExpression}")
    public void execute() {
        log.info("MyJob2:{}", LocalDateTime.now());
    }
}
