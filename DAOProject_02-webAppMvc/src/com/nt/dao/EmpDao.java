package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Map<String,Object>> getEmpDetails(String condition){
		List<Map<String, Object>> details = jdbcTemplate.queryForList("SELECT empno,ename,job,Salary FROM emp_info WHERE job in "+condition+"order by job");
		return details;
	}
}
