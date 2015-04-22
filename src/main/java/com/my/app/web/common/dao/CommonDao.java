package com.my.app.web.common.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDao {

	@Autowired
	SqlSession sqlSession;
	
	public <E> List<E> selectList(String statement, Object parameter) {
		return this.sqlSession.selectList(statement, parameter);
	}
	
}
