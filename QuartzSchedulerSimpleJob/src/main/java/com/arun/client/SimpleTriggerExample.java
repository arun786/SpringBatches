package com.arun.client;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

import com.arun.job.HelloJob;

public class SimpleTriggerExample {

	public static void main(String[] args) {
		JobDetail job = new JobDetail();
		job.setName("Hello World");
		job.setJobClass(HelloJob.class);
		
		SimpleTrigger trigger = new SimpleTrigger();
		trigger.setStartTime(new Date(System.currentTimeMillis() + 1000));
		trigger.setRepeatInterval(30000);
		trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
		trigger.setName("Hello World with Simple Trigger...");
		
		try {
			Scheduler schedule = new StdSchedulerFactory().getScheduler();
			schedule.start();
			schedule.scheduleJob(job, trigger);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		
		
	}

}
