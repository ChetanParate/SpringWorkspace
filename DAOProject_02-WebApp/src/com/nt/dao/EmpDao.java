package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public List getEmpDetails(String condition){
		List<Map<String,Object>> list=jt.queryForList("select empno,ename,job,sal from emp where job in "+condition, new Object[]{});
		return list;
	}
	
	

}
