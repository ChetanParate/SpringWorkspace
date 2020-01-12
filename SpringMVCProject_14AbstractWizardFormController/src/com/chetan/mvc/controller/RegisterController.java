package com.chetan.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.chetan.mvc.command.RegisterBean;

@SuppressWarnings("deprecation")
public class RegisterController extends AbstractWizardFormController {

	@Override
	protected Object formBackingObject(HttpServletRequest request){
		System.out.println("Register controller: formBackingObject()");
		return new RegisterBean();
	}
	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException be) throws Exception {
		System.out.println("Register controller: processFinish(-,-,-,-)");
		RegisterBean registerBean = (RegisterBean)command;
		System.out.println(registerBean);
		
		return new ModelAndView("resultform","registerBean",registerBean);
	}
	
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException be) throws Exception {
		System.out.println("Register controller: processCancel(-,-,-,-)");
		return new ModelAndView("welcomepage");
	}
	

}
