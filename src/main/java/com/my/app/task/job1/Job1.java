package com.my.app.task.job1;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.support.GenericXmlApplicationContext;
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
	
	@Scheduled(fixedRate = 1000)
	public void run1() {
		MDC.put("ID", UUID.randomUUID().toString());
		
		try {
			logger.info("Job1 :: run1");
			task1();
		} catch (Exception e) {
		}
		
		MDC.remove("ID");
	}
	
	public void task1() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				logger.info(">> task");
			}
		}).start();
	}
	
	@Scheduled(fixedRate = 1000)
	public void run2() {
		MDC.put("ID", UUID.randomUUID().toString());
		
		try {
			task1();
			logger.info("Job1 :: run2");
		} catch (Exception e) {
		}
		
		MDC.remove("ID");
	}
	
}
