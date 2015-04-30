package com.my.app.web.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
	public String main() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		this.logger.info("User info : {}", user);
		return "main/main";
	}
	
}
