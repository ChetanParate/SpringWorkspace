package com.chetan.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.chetan.mvc.dto.StudentDTO;
import com.chetan.mvc.service.StudentService;

public class StudentsListController extends AbstractController {

	private StudentService service;
	
	public void setService(StudentService service) {
		this.service = service;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		List<StudentDTO> listDto = service.studentsList();
		
		return new ModelAndView("list_students","studlist",listDto);
	}

}
