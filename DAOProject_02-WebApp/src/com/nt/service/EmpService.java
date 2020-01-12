package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmpDao;

public class EmpService {
	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	} 
	
	public List search(String job[]){
		//prepare condition
		StringBuffer sb=new StringBuffer("(");
		for(int i=0;i<job.length;++i){
			if(i==job.length-1){
				sb.append("'"+job[i]+"'");
			}
			else{
				sb.append("'"+job[i]+"',");
			}
		}//for
		sb.append(")");
		String condition=sb.toString();
		//Use DAO class persistence logic
		List<Map<String,Object>> list=dao.getEmpDetails(condition);
		return list;
	}//search
}//class

