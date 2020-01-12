package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.nt.bo.StudentBO;

public class StudentDAO {
	
	private SimpleJdbcInsert simpleInsert;

	public StudentDAO(SimpleJdbcInsert simpleInsert) {
		this.simpleInsert = simpleInsert;
	}
	
	public int insertRecord(StudentBO student){
		simpleInsert.setTableName("Student");
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("rollno",student.getSno());
		params.put("sname",student.getsName());
		params.put("sadd",student.getSadd());
		params.put("marks",student.getMarks());
		params.put("per",student.getPer());
		
		int cnt = simpleInsert.execute(params);
		return cnt;
		
	}
}
