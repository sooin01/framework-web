package com.my.app.task.job1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job1 {
	
	private static final Logger logger = LoggerFactory.getLogger(Job1.class);
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("task/task-context.xml");
		ctx.refresh();
		
		while (true) {
			try {
				Thread.sleep(60 * 10 * 1000);
				break;
			} catch (InterruptedException e) {
			}
		}
		ctx.close();
	}
	
	@Scheduled(fixedRate = 100)
	public void run1() {
		MDC.put("ID", "Hello1");
		
		try {
			task1();
			logger.info("Job1 :: run1");
		} catch (Exception e) {
		}
		
		MDC.remove("ID");
	}
	
	@Async
	public void task1() {
		logger.info(">> task");
	}
	
	@Scheduled(fixedRate = 100)
	public void run2() {
		MDC.put("ID", "Hello2");
		
		try {
			task1();
			logger.info("Job1 :: run2");
		} catch (Exception e) {
		}
		
		MDC.remove("ID");
	}
	
}
