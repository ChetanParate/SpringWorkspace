package com.chetan.mvc.service;

import java.util.List;

import com.chetan.mvc.dto.StudentDTO;

public interface StudentService {
	
	public List<StudentDTO> studentsList();
	public StudentDTO searchStudentByRollno(int rollno);
	public String UpdateStudentByRollno(StudentDTO sdto);
	public String registerStudent(StudentDTO sdto);
	

}
