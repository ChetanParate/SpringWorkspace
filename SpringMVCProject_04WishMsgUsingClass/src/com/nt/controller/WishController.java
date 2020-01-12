package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nt.service.WishService;

public class WishController implements Controller {

	private WishService service;
	
	public void setService(WishService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		String msg = service.generateWishMsg();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("wmsg",msg);
		return mav;
	}

}
