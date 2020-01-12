package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.nt.bo.StudentBO;

public class StudentDAO {
	private SimpleJdbcCall simpleJdbcCall;

	public StudentDAO(SimpleJdbcCall simpleJdbcCall) {
		this.simpleJdbcCall = simpleJdbcCall;
	}
	
	public StudentBO getStudentDetails(int no){
		 simpleJdbcCall.setProcedureName("getDetails");
		 
		 Map<String,Object> params = new HashMap<String,Object>();
		 params.put("no",no);
		 Map<String,Object> outParams = simpleJdbcCall.execute(params);
		 System.out.println(outParams);
		 StudentBO studentBo = new StudentBO();
		 studentBo.setSno(no);
		 studentBo.setsName((String)outParams.get("sname"));
		 studentBo.setSadd((String)outParams.get("sadd"));
		 
		 return studentBo;
	}
}
