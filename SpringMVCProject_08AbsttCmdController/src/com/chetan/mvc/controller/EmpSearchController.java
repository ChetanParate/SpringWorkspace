package com.chetan.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.chetan.mvc.command.SearchCommand;
import com.chetan.mvc.dto.SearchDTO;
import com.chetan.mvc.dto.SearchResultDTO;
import com.chetan.mvc.service.EmpSearchServiceImplement;

@SuppressWarnings("deprecation")
public class EmpSearchController extends AbstractCommandController{

	private EmpSearchServiceImplement service;
	
	public void setService(EmpSearchServiceImplement service) {
		this.service = service;
	}
	
//	public ModelAndView handlerRequest(HttpServletRequest req,HttpServletResponse res){
//		return new ModelAndView("listemps");
//	}
	@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object command, BindException be)
			throws Exception {
		
		SearchCommand searchCommand = (SearchCommand)command;
		
		//converting command obj to DTO object
		SearchDTO searchDto = new SearchDTO();
		searchDto.setEmployeeNumber(searchCommand.getEno());
		searchDto.setEmployeeName(searchCommand.getEname());
		searchDto.setDeptNumber(searchCommand.getDept());
		searchDto.setCity(searchCommand.getCity());
		
		//calling service class Method
		List<SearchResultDTO> searchResultDtoList = service.process(searchDto);
		
		
		return new ModelAndView("listemps","searchresult",searchResultDtoList);
	}

}
