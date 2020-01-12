package com.chetan.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chetan.mvc.service.WishService;

@Controller
public class WishController {

	@Autowired
	private WishService service;
	
	@RequestMapping("/wish.htm")
	public ModelAndView process(){
		String msg = service.generateWishMsg();
		return new ModelAndView("result","wmsg",msg);
	}
	
}
