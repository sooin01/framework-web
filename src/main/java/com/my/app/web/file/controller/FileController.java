package com.my.app.web.file.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.app.web.file.vo.FileVo;

@Controller
public class FileController {
	
	@RequestMapping(value = "/file/view", method = RequestMethod.GET)
	public String view() {
		return "file/view";
	}
	
	@RequestMapping(value = "/file/upload", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> upload(@Validated(FileVo.Create.class) FileVo vo, Errors errors) {
		System.out.println("==> vo : " + vo);
		Map<String, Object> result = new HashMap<>();
		
		if (errors.hasErrors()) {
			for (FieldError fieldError : errors.getFieldErrors()) {
				result.put("result", fieldError.getDefaultMessage());
				break;
			}
		} else {
			result.put("result", "success");
		}
		
		return result;
	}
	
	@RequestMapping(value = "/file/update", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> update(@Validated(FileVo.Modify.class) FileVo vo, Errors errors) {
		System.out.println("==> vo : " + vo);
		Map<String, Object> result = new HashMap<>();
		
		if (errors.hasErrors()) {
			for (FieldError fieldError : errors.getFieldErrors()) {
				result.put("result", fieldError.getDefaultMessage());
				break;
			}
		} else {
			result.put("result", "success");
		}
		
		return result;
	}
	
}
