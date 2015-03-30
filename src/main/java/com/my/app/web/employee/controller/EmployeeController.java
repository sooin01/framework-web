package com.my.app.web.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.app.web.employee.service.EmployeeService;
import com.my.app.web.employee.vo.DepartmentVo;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/employee/employee", method = RequestMethod.GET)
	public String getEmployeeList(ModelMap model) {
		List<DepartmentVo> employeeList = this.employeeService.getEmployeeList();
		model.addAttribute("employeeList", employeeList);
		return "employee/employee";
	}
	
}
