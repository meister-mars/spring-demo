package com.abyss.quartz;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

@PropertySource("classpath:quartz.properties")
//@ImportResource("classpath:quartz-*.xml")
@Configuration
@ComponentScan
@EnableScheduling
public class AppConfig {

}
