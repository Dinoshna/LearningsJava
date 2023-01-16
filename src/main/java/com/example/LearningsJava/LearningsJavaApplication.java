package com.example.LearningsJava;

import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableScheduling
public class LearningsJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningsJavaApplication.class, args);
    }

//	/**
//	 *  scheduled time every 6 sec it will run
//	 */
//	@Scheduled(fixedDelay = 6000)
//    public void cronRun() {
//        System.out.println("Inside cron run:" + new Date());
//    }

	/**
	 *  scheduled time every 30 sec it will run
	 */
	@Scheduled(fixedDelay = 30000)
//	@SchedulerLock(name="scheduletest", lockAtLeastFor = 31000, lockAtMostFor = 35000 )
	public void cronRun() throws Exception{
		TimeUnit.SECONDS.sleep(30);
		System.out.println("Inside cron run:" + new Date());
	}
}
