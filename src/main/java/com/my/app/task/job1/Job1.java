package com.my.app.task.job1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job1 {
	
	private static final Logger logger = LoggerFactory.getLogger(Job1.class);
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring/task-context.xml");
		ctx.refresh();
		
		while (true) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run1() {
		try {
			Thread.sleep(2000);
			logger.info("Job1 :: run1");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run2() {
		try {
			Thread.sleep(2000);
			logger.info("Job1 :: run2");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run3() {
		try {
			Thread.sleep(2000);
			logger.info("Job1 :: run3");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run4() {
		try {
			Thread.sleep(2000);
			logger.info("Job1 :: run4");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run5() {
		try {
			Thread.sleep(2000);
			logger.info("Job1 :: run5");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run6() {
		try {
			Thread.sleep(2000);
			logger.info("Job1 :: run6");
		} catch (Exception e) {
		}
	}
	
}
