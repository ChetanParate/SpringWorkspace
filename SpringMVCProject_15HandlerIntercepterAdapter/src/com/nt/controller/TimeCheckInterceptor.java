package com.nt.controller;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object Handler) throws Exception{
		System.out.println("TimeCheckInterceptorController :handlerRequest");
		Calendar calendar= Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour>=9 && hour<=17){
			return true;
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/timeout.jsp");
			rd.forward(request, response);
			return false;
		}
	}

}
