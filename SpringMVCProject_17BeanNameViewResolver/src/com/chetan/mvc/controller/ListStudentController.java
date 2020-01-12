package com.chetan.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ListStudentController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Vivek");
		list.add("Chetan");
		list.add("Roshan");
		list.add("Rosh");
		list.add("Chet");
		
		if(request.getServletPath().equals("/excel.htm")){
			return new ModelAndView("excelview","stresult",list);
		}else {
			return new ModelAndView("pdfview","stresult",list);
		}
		
	}

}
