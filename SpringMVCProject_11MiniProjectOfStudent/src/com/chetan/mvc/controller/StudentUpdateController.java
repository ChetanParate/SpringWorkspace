package com.chetan.mvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.chetan.mvc.command.StudentCommand;
import com.chetan.mvc.dto.StudentDTO;
import com.chetan.mvc.service.StudentService;

@SuppressWarnings("deprecation")
public class StudentUpdateController extends SimpleFormController {

	private StudentService service;

	public void setService(StudentService service) {
		this.service = service;
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)throws Exception{
		
		//Read Rollno
		int no = Integer.parseInt(request.getParameter("id"));
		
		//use Service Class
		StudentDTO sdto = service.searchStudentByRollno(no);
		//create Command class Object
		StudentCommand stCommand = new StudentCommand();
		stCommand.setRollno(sdto.getRollno());
		stCommand.setSname(sdto.getSname());
		stCommand.setSadd(sdto.getSadd());
		stCommand.setMarks(sdto.getMarks());
		stCommand.setPer(sdto.getPer());
		
		return stCommand;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		//Convert command to StudentCommand
		StudentCommand stCommand =(StudentCommand)command;
		StudentDTO sdto = new StudentDTO();
		sdto.setRollno(stCommand.getRollno());
		sdto.setSname(stCommand.getSname());
		sdto.setSadd(stCommand.getSadd());
		sdto.setMarks(stCommand.getMarks());
		sdto.setPer(stCommand.getPer());
		
		//Use Service class
		
		String updateMsg = service.UpdateStudentByRollno(sdto);
		
		return new ModelAndView(getSuccessView(), "updateResult", updateMsg);
	}
	
	
}
