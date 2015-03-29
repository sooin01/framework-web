package com.my.app.web.employee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.app.web.employee.vo.EmployeeVo;

@Repository
public class EmployeeDao {

	@Autowired
	SqlSession sqlSession;
	
	public List<EmployeeVo> getEmployeeList() {
		return this.sqlSession.selectList("");
	}
	
}
