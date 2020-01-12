package com.chetan.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.chetan.mvc.bo.StudentBO;
import com.chetan.mvc.dao.StudentDAO;
import com.chetan.mvc.dto.StudentDTO;

public class StudentServiceImplement implements StudentService {
	
	public StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDTO> studentsList() {
		
		List<StudentBO> listBo =  dao.getAllStudent();
		
		//convert BO to DTO Object...
		List<StudentDTO> listDto = new ArrayList<StudentDTO>();
		
		if(listBo.size()!= 0){
			for(StudentBO stBo:listBo){
				
				StudentDTO stDto = new StudentDTO();
				stDto.setRollno(stBo.getRollno());
				stDto.setSname(stBo.getSname());
				stDto.setSadd(stBo.getSadd());
				stDto.setMarks(stBo.getMarks());
				stDto.setPer(stBo.getPer());
				listDto.add(stDto);
			}
		}
		return listDto;
	}

	@Override
	public StudentDTO searchStudentByRollno(int rollno) {
		
		StudentBO sbo = dao.getStudent(rollno);
		
		//convert SBO To DTO
		StudentDTO sdto = new StudentDTO();
		sdto.setRollno(sbo.getRollno());
		sdto.setSname(sbo.getSname());
		sdto.setSadd(sbo.getSadd());
		sdto.setMarks(sbo.getMarks());
		sdto.setPer(sbo.getPer());
		
		return sdto;
	}

	@Override
	public String UpdateStudentByRollno(StudentDTO sdto) {
		
		//convert DTO to BO
		StudentBO sbo = new StudentBO();
		sbo.setRollno(sdto.getRollno());
		sbo.setSname(sdto.getSname());
		sbo.setSadd(sdto.getSadd());
		sbo.setMarks(sdto.getMarks());
		sbo.setPer(sdto.getPer());
		
		//Call DAO Method
		int cnt = dao.update(sbo);
		
		if(cnt==0)
			return sdto.getRollno()+" Student Details are Not Updated.....! ";
		else
			return sdto.getRollno()+" Student Details are Updated...!";
	}

	@Override
	public String registerStudent(StudentDTO sdto) {
		
		//convert DTO to BO
		StudentBO sbo = new StudentBO();
		sbo.setRollno(sdto.getRollno());
		sbo.setSname(sdto.getSname());
		sbo.setSadd(sdto.getSadd());
		sbo.setMarks(sdto.getMarks());
		sbo.setPer(sdto.getPer());
		
		//call DAO Method
		int cnt = dao.insert(sbo);
		
		if(cnt==0)
			return sdto.getRollno()+" Student Registration Failed....! ";
		else
			return sdto.getRollno()+" Student Registration Succesfully Done and Details are Updated...!";
	}
}
