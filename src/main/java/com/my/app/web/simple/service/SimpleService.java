package com.my.app.web.simple.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@EnableAsync
public class SimpleService {
	
	static final Logger logger = LoggerFactory.getLogger(SimpleService.class);

	@Async
	public void simple1() {
		try {
			logger.info("Start simple1 service.");
			Thread.sleep(3000);
			logger.info("End simple1 service.");
		} catch (InterruptedException e) {
		}
	}
	
}
