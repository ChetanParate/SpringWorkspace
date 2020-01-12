package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;

public class StudentService {
	
	private StudentDAO dao;

	public StudentService(StudentDAO dao) {
		this.dao = dao;
	}
	
	public StudentBO getStudentInfo(int no){
		
	return dao.getStudentDetails(no);

	}
}
