package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.vo.StudentVO;

public class StudentService {
	private StudentDAO dao;

	public StudentService(StudentDAO dao) {
		this.dao = dao;
	}
	
	public boolean registerStudent(int sno,String sName,String sadd,int marks,int per){
		
		StudentVO studentVo = new StudentVO(sno, sName, sadd, marks, per);
		StudentBO studentBo = new StudentBO();
		studentBo.setSno(studentVo.getSno());
		studentBo.setsName(studentVo.getsName());
		studentBo.setSadd(studentVo.getSadd());
		studentBo.setMarks(studentVo.getMarks());
		studentBo.setPer(studentVo.getPer());
		
		int cnt = dao.insertRecord(studentBo);
		
		if(cnt == 0)
			return false;
		else
			return true;	
	}
}
