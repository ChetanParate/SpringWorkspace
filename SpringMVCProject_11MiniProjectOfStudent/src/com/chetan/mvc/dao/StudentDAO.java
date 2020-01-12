package com.chetan.mvc.dao;

import java.util.List;

import com.chetan.mvc.bo.StudentBO;

public interface StudentDAO {
	
	public List<StudentBO> getAllStudent();
	public int insert(StudentBO sbo);
	public StudentBO getStudent(int rollno);
	public int update(StudentBO sbo);

}
