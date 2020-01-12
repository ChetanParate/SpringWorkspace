package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		System.out.println("WishController :handlerRequest");
		String msg = "";
		Calendar calender = Calendar.getInstance();
		int h =calender.get(Calendar.HOUR_OF_DAY);
		if(h<=12)
			msg = "Good Morning chetan..!";
		else if(h<=16)
		msg = "Good Afternoon chetan..!";
		else if(h<=20)
		msg = "Good Evening chetan..!";
		else
			msg = "Good Night chetan..!";
		return new ModelAndView("result","wmsg",msg);
	}

}
