package com.chetan.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.chetan.mvc.dto.EmpDTO;
import com.chetan.mvc.service.ListEmpService;

public class ListEmpController extends AbstractController  {
	
	ListEmpService service;
	
	public void setService(ListEmpService service) {
		this.service = service;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		List<EmpDTO> listDto = service.getAllEmps();
		
		return new ModelAndView("listempresult","emplist",listDto);
	}

}
