package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public class CustStudDAO {
	
	public void insertData(StudentBO stbo) {
		System.out.println("Student Data Is : ");
		System.out.println(stbo.getId()+" "+stbo.getName()+" "+stbo.getCourse());
	}
	public void insertData(CustomerBO custbo) {
		System.out.println("Student Data Is : ");
		System.out.println(custbo.getId()+" "+custbo.getName()+" "+custbo.getBillAmt());
	}

}
