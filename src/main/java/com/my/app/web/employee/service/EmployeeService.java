package com.my.app.web.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.app.web.employee.dao.EmployeeDao;
import com.my.app.web.employee.vo.DepartmentVo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<DepartmentVo> getEmployeeList() {
		return this.employeeDao.getEmployeeList();
	}
	
}
