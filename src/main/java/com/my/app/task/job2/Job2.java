package com.my.app.task.job2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job2 {
	
	private static final Logger logger = LoggerFactory.getLogger(Job2.class);
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring/task2-context.xml");
		ctx.refresh();
		
		while (true) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run1() {
		try {
			Thread.sleep(2000);
			logger.info("Job2 :: run1");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run2() {
		try {
			Thread.sleep(2000);
			logger.info("Job2 :: run2");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run3() {
		try {
			Thread.sleep(2000);
			logger.info("Job2 :: run3");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run4() {
		try {
			Thread.sleep(2000);
			logger.info("Job2 :: run4");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run5() {
		try {
			Thread.sleep(2000);
			logger.info("Job2 :: run5");
		} catch (Exception e) {
		}
	}
	
	@Scheduled(fixedRate = 1000)
	public void run6() {
		try {
			Thread.sleep(2000);
			logger.info("Job2 :: run6");
		} catch (Exception e) {
		}
	}
	
}
