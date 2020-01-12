package com.chetan.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

@SuppressWarnings("deprecation")
public class StudentRegistrationController extends SimpleFormController {

	@SuppressWarnings("rawtypes")
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		
		System.out.println("SRC:ReferenceData(-)");
		Map<String,List> map = new HashMap<String,List>();
		List<String> courses = new ArrayList<String>();
		courses.add("Spring");
		courses.add("Hibernate");
		courses.add("Jsp");
		courses.add("JDBC");
		courses.add("WebServices");
		courses.add("core Java");
		map.put("courseList", courses);
		
		return map;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		return new ModelAndView("register_result");
	}
	
	

}
