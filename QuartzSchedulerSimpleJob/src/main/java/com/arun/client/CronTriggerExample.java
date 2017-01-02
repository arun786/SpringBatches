package com.arun.client;

import java.text.ParseException;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import com.arun.job.HelloJob;

public class CronTriggerExample {
	public static void main(String[] args) {

		JobDetail job = new JobDetail();
		job.setName("Hello World using CronTrigger....");
		job.setJobClass(HelloJob.class);

		CronTrigger cron = new CronTrigger();
		cron.setName("cron trigger");
		try {
			cron.setCronExpression("0/30 * * * * ?");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			Scheduler schedule = new StdSchedulerFactory().getScheduler();
			schedule.start();
			schedule.scheduleJob(job, cron);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
}
