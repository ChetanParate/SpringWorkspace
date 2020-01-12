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
public class StudentInsertController extends SimpleFormController {
	
	private StudentService service;

	public void setService(StudentService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		//convert command class into StCommand
		StudentCommand stCommand = (StudentCommand)command;
		//convert stCommand into DTO Object
		StudentDTO sdto = new StudentDTO();
		sdto.setRollno(stCommand.getRollno());
		sdto.setSname(stCommand.getSname());
		sdto.setSadd(stCommand.getSadd());
		sdto.setMarks(stCommand.getMarks());
		sdto.setPer(stCommand.getPer());
		
		//use service Class
		String MsgResult = service.registerStudent(sdto); 
		
		return new ModelAndView("insert_result", "resultMsg", MsgResult);
	}
	
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request,HttpServletResponse response)throws Exception{
		return new ModelAndView("dblpost");
	}
	

}
