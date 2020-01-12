package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;
import com.nt.dao.CustStudDAO;

public abstract class CustStudService {

		
	private CustStudDAO dao;
	
	public void setDao(CustStudDAO dao) {
		this.dao = dao;
	}
	public abstract StudentBO getStudentBO();
	public abstract CustomerBO getCustomerBO();
	
	public void processStudent(int id, String name, String course) {
		
		StudentBO stbo = getStudentBO();
		stbo.setId(id);
		stbo.setName(name);
		stbo.setCourse(course);
		dao.insertData(stbo);	
	}
	public void processCustomer(int id, String name, float billAmt) {
		
		CustomerBO custbo = getCustomerBO();
		custbo.setId(id);
		custbo.setName(name);
		custbo.setBillAmt(billAmt);
		dao.insertData(custbo);
		
	}
	

}
