package com.chetan.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.chetan.mvc.command.UserCommand;

public class PerformOperationsController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request,HttpServletResponse response, UserCommand userCommand){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("cammand", userCommand);
		mav.addObject("result", "InsertOpertion");
		return mav;
	}
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response, UserCommand userCommand){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("cammand", userCommand);
		mav.addObject("result", "UpdateOpertion");
		return mav;
	}
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response, UserCommand userCommand){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("cammand", userCommand);
		mav.addObject("result", "DeleteOpertion");
		return mav;
	}
	public ModelAndView view(HttpServletRequest request,HttpServletResponse response, UserCommand userCommand){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("cammand", userCommand);
		mav.addObject("result", "viewOpertion");
		return mav;
	}
	public ModelAndView invalid(HttpServletRequest request,HttpServletResponse response, UserCommand userCommand){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("cammand", userCommand);
		mav.addObject("result", "InvalidOpertion");
		return mav;
	}
}
