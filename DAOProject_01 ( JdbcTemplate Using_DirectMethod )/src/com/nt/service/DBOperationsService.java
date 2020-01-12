package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.DBOperations;
import com.nt.dao.DBOperationsDAO;

public class DBOperationsService implements DBOperations {
	
	private DBOperationsDAO dao;

	public void setDao(DBOperationsDAO dao) {
		this.dao = dao;
	}

	@Override
	public int getSal(int eno) {
		int sal = dao.getSalary(eno);
		return sal;
	}

	@Override
	public boolean updateSalary(int eno, int newSal) {
		int sal = dao.getSalary(eno);
		float nsal = (float)sal+(sal*newSal/100.0f);
		int newSalary = Math.round(nsal);
		int flag = dao.updateSalary(eno, newSalary);
	  	
		if(flag ==0)
			return false;
		else
			return true;
	}

	@Override
	public boolean fireEmp(int eno) {
		int delete = dao.deleteRecord(eno);
		
		if(delete ==0)
			return false;
		else
			return true;
	}

	@Override
	public List<Map<String,Object>> getAllEmpDetails() {
		List<Map<String,Object>> list = dao.getAllRecords();
		return list;
	}

	@Override
	public Map<String, Object> getEmpDetails(int eno) {
		Map<String, Object> map = dao.getEmpRecords(eno);
		return map;
	}

	@Override
	public boolean registerEmp(int eno, String name, String desg, int sal) {
		int reg = dao.insertRecord(eno, name, desg, sal);
		
		if(reg ==0)
			return false;
		else
			return true;
	}
}
