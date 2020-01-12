package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
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
