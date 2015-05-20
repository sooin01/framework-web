package com.my.app.web.simple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.app.web.simple.service.SimpleService;

@Controller
public class SimpleController {
	
	static final Logger logger = LoggerFactory.getLogger(SimpleController.class);

	@Autowired
	SimpleService simpleService;
	
	@RequestMapping(value = "/simple1", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> simple1() {
		simpleService.simple1();
		logger.info("Simple1 controller.");
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
