package com.chetan.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.chetan.mvc.command.StudentCommand;
import com.chetan.mvc.dto.StudentDTO;
import com.chetan.mvc.service.StudentInsertService;

@SuppressWarnings("deprecation")
public class StudentInsertController extends SimpleFormController {
	
	private StudentInsertService service;

	public void setService(StudentInsertService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		StudentCommand stCommand = (StudentCommand)command;
		
		//Converting Command Class object to DTO Object
		StudentDTO sDto = new StudentDTO();
		
		sDto.setSno(stCommand.getSno());
		sDto.setSname(stCommand.getSname());
		sDto.setSadd(stCommand.getSadd());
		sDto.setSchool(stCommand.getSchool());
		
		//call service class method
		String msg = service.register(sDto);
		
		return new ModelAndView("result","resultMsg",msg); 
	}
	
	

}
