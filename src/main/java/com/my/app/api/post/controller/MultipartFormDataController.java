package com.my.app.api.post.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.app.api.common.dto.res.Response;

@Controller
public class MultipartFormDataController {

	@RequestMapping(value = "/multipartFormData")
	@ResponseBody
	public Response multipartFormData() {
		return new Response();
	}
	
}
