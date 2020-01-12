package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DBOperations {
	
	public int getSal(int eno);
	public boolean updateSalary(int eno, int newSal);
	public boolean fireEmp(int eno);
	public List<Map<String,Object>> getAllEmpDetails();
	public Map<String,Object> getEmpDetails(int eno);
	public boolean registerEmp(int eno,String name,String desg,int sal);
	
}

