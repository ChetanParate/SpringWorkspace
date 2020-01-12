package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmpDao;

public class EmpService {
	
	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	public List<Map<String,Object>> search(String[] jobs){
		
		StringBuffer sb = new StringBuffer("(");
		for( int i = 0;i<= jobs.length;i++){
			if(i==(jobs.length-1))
				sb.append("'"+jobs[i]+"'");
			else
				sb.append("'"+jobs[i]+"',");
		}
		
		sb.append(")");
		String condition = sb.toString();
		
		List<Map<String,Object>> list = dao.getEmpDetails(condition);
		return list;
	}
	
}
