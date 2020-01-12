package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeService {
	
	private EmployeeDAO dao;
	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	public String getEmpName(int no){
		String name=dao.findName(no);
		return name;
	}
	
	public  EmployeeBO getEmpDetails(int no){
		EmployeeBO emp=dao.findEmpDetails(no);
		return emp;
	}
	
	public String registerEmp(int no,String name,String desg,float salary){
		
		EmployeeDTO empdto=new EmployeeDTO(no,name,desg,salary);
	
		EmployeeBO empbo=new EmployeeBO(empdto.getEid(),empdto.getEname(),empdto.getJob(),empdto.getSalary());
		int cnt=dao.insertRecord(empbo);
		if(cnt==0)
			return "Registeration unsuccesfully Done";
		else 
			return "Registeration succesful";
	}
}
