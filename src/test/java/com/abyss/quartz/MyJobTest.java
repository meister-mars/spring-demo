package com.abyss.quartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MyJobTest {
    @Test
    public void test() {
//        System.out.println("true = " + true);
//        SchedulerFactory sf;
//        Scheduler scheduler;
//        JobDetail job;
//        Trigger trigger;
//        try {
//            sf = new StdSchedulerFactory();
//            scheduler = sf.getScheduler();
//            job = JobBuilder.newJob(MyJob1.class).withIdentity("myJob").build();
//            trigger = TriggerBuilder.newTrigger()
//                    .withIdentity("trigger1", "group1").startNow()
//                    .withSchedule(SimpleScheduleBuilder.simpleSchedule()
//                            .withIntervalInSeconds(1).withRepeatCount(10)).build();
//            scheduler.scheduleJob(job, trigger);
//            scheduler.start();
//            while (true){
//                Thread.sleep(3000);
//            }
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
