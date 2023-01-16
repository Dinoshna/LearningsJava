package com.example.LearningsJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class LearningsJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningsJavaApplication.class, args);
    }

	/**
	 *  scheduled time every 6 sec it will run
	 */
	@Scheduled(fixedDelay = 6000)
    public void cronRun() {
        System.out.println("Inside cron run:" + new Date());
    }
}
