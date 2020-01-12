package com.nt.service;

import java.util.List;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;

public class StudentService {
	private StudentDAO dao;

	public StudentService(StudentDAO dao) {
		this.dao = dao;
	}
	
	public boolean modifyStudentDetails(int no,String address){
		int cnt=dao.updateStudent(no, address);
		if(cnt==0)
			return false;
		else
			return true;
		
	}
	
	public  List<StudentBO> findStudDetailsByAddress(String addrs){
	  return dao.findStudentsByAddress(addrs);
	}
}
