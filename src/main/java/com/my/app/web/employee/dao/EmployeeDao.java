package com.my.app.web.employee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.app.web.employee.vo.DataVo;
import com.my.app.web.employee.vo.DepartmentVo;

@Repository
public class EmployeeDao {

	@Autowired
	SqlSession sqlSession;
	
	public List<DepartmentVo> getEmployeeList() {
		return this.sqlSession.selectList("EmployeeDao.getEmployeeList");
	}
	
	public String getData(DataVo vo) {
		return this.sqlSession.selectOne("EmployeeDao.getData", vo);
	}
	
}
