package com.my.app.web.redirect.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.app.web.redirect.vo.RedirectVo;

@Controller
public class RedirectController {
	
	private final static Logger logger = LoggerFactory.getLogger(RedirectController.class);
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String common(RedirectVo vo) {
		logger.info("RedirectVo : {}", vo);
		return "redirect/redirect";
	}
	
	@RequestMapping(value = "/redirect1", method = RequestMethod.GET)
	public String redirect() throws UnsupportedEncodingException {
		String name = URLEncoder.encode("한글", "UTF-8");
		return "redirect:/redirect?name=" + name;
	}
	
}
