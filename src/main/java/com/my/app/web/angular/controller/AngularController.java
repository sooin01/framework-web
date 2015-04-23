package com.my.app.web.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AngularController {

	@RequestMapping(value = "/angular/angular", method = RequestMethod.GET)
	public String angular() {
		return "angular/angular";
	}
	
}
