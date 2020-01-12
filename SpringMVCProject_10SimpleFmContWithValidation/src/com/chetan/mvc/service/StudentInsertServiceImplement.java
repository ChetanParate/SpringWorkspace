package com.chetan.mvc.service;

import com.chetan.mvc.bo.StudentBO;
import com.chetan.mvc.dao.StudentInsertDAOImplement;
import com.chetan.mvc.dto.StudentDTO;

public class StudentInsertServiceImplement implements StudentInsertService {

	StudentInsertDAOImplement dao;
	
	public void setDao(StudentInsertDAOImplement dao) {
		this.dao = dao;
	}
	@Override
	public String register(StudentDTO sDto) {
		
		//converting DTO to BO object
		StudentBO sBo = new StudentBO();
		sBo.setSno(sDto.getSno());
		sBo.setSname(sDto.getSname());
		sBo.setSadd(sDto.getSadd());
		sBo.setSchool(sDto.getSchool());
		
		//Calling DAO class method
		int cnt = dao.insert(sBo);
		if(cnt==0){
			return "Registration Failed";
		}
			return "Registration Succeded with no :"+sDto.getSno();
	}

}
