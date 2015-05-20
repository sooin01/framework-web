package com.my.app.web.simple.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

	public void simple1() {
		try {
			Thread.sleep(3000);
			System.out.println("Simple1 service.");
		} catch (InterruptedException e) {
		}
	}
	
}
