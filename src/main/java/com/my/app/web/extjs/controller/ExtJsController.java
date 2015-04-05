package com.my.app.web.extjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExtJsController {

	@RequestMapping
	public String extjs() {
		return "extjs/extjs";
	}
	
}
