package com.my.app.web.init;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class InitComponent {

	private static final Logger logger = LoggerFactory.getLogger(InitComponent.class);
	
	@Autowired
	Environment env;
	
	@PostConstruct
	public void init() {
		logger.info("### init. => {}", Arrays.toString(env.getActiveProfiles()));
	}
	
}
