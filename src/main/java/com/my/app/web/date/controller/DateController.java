package com.my.app.web.date.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nhncorp.lucy.security.xss.XssFilter;
import com.nhncorp.lucy.security.xss.XssPreventer;
import com.nhncorp.lucy.security.xss.XssSaxFilter;

@Controller
public class DateController {
	
	@RequestMapping(value = "/date")
	public String date(HttpServletRequest request, Model model) {
		Object obj = request.getSession().getAttribute("aaa");
		
		model.addAttribute("a", request.getParameter("a"));
		
		return "date/date";
	}
	
	@RequestMapping(value = "/ajax/date")
	@ResponseBody
	public String ajaxDate(@RequestBody Map<String, Object> map) throws Exception {
		String content = map.get("content").toString();
		
		System.out.println("### 1: " + content.getBytes().length);
		
		return "success";
	}
	
	public static void main(String[] args) {
		/*XssPreventer*/
		String dirty1 = "\"><script>alert('xss');</script>";
		String clean1 = XssPreventer.escape(dirty1);
		
		System.out.println("XssPreventer = "+dirty1);
		System.out.println("XssPreventer = "+clean1);
		
		/*XssFilter : DOM*/
		XssFilter filter = XssFilter.getInstance("lucy/lucy-xss-superset.xml", true);
		
	    String dirty2 = "<img src=\"<img src=1\\ onerror=alert(1234)>\" onerror=\"alert('XSS')\">";
	    
	    String clean2 = filter.doFilter(dirty2);
	    System.out.println("XssFilter : DOM = "+clean2);

	    dirty2 = "<img src='<img src=1\\ onerror=alert(1234)>\" onerror=\"alert('XSS')\">";
	    clean2 = filter.doFilter(dirty2);
	    System.out.println("XssFilter : DOM = "+clean2);
	    
	    /*XssFilter : SAX*/
	    XssSaxFilter filter1 = XssSaxFilter.getInstance("lucy-xss.xml");
	    String clean3 = "<TABLE class=\"NHN_Layout_Main\" style=\"TABLE-LAYOUT: fixed\" cellSpacing=\"0\" cellPadding=\"0\" width=\"743\">" + "</TABLE>" + "<SPAN style=\"COLOR: #66cc99\"></SPAN>";
	    String filtered = filter1.doFilter(clean3);
	    System.out.println("XssFilter : SAX = "+filtered);
	}
	
}
