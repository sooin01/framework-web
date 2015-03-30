package com.my.app.web.employee.vo;

import java.util.List;

import com.my.app.web.common.vo.CommonVO;

public class DepartmentVo extends CommonVO {

	private static final long serialVersionUID = 9030061294147917245L;
	
	private Integer managerId;
	private Integer departmentId;
	private List<EmployeeVo> employeeList;

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public List<EmployeeVo> getEmployeeList() {
		return this.employeeList;
	}

	public void setEmployeeList(List<EmployeeVo> employeeList) {
		this.employeeList = employeeList;
	}

}
