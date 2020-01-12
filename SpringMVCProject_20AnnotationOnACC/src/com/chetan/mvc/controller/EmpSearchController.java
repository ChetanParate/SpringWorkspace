package com.chetan.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chetan.mvc.command.SearchCommand;
import com.chetan.mvc.dto.EmployeeDTO;

@Controller
public class EmpSearchController {
	
	@RequestMapping("/performsearch.htm")
	public ModelAndView search(ModelMap map,@ModelAttribute SearchCommand sCommand, BindingResult bResult){
		
		List<EmployeeDTO> elist = new ArrayList<EmployeeDTO>();
		elist.add(new EmployeeDTO(1011, "chetan", "javaDeveloper", 28000));
		elist.add(new EmployeeDTO(1011, "Roshan", "Software Engg", 22000));
		elist.add(new EmployeeDTO(1011, "Vivek", "Tester", 25000));
		elist.add(new EmployeeDTO(1011, "Priya", "programmer", 30000));
		return new ModelAndView("emplist","empresult",elist);
	}

}
