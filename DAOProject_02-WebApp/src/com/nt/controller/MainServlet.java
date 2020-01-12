package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmpService;

public class MainServlet extends HttpServlet {
	  ApplicationContext ctx;
	  EmpService service;
	  public void init(){
		   //create IOC container
		   ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		   // get Service class bean
		    service=(EmpService)ctx.getBean("service");
	  }
	  
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		  //read form data
		  String jobs[]=req.getParameterValues("job");
		  //use Service class
		  List<Map<String,Object>> list=service.search(jobs);
		  // keep results in request attribute
		  req.setAttribute("result",list);
		  //forward the request to result page
		  RequestDispatcher rd=req.getRequestDispatcher("/Result.jsp");
		  rd.forward(req,resp);
	}//doGet(-,-)
	  
	  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		  doGet(req,res);
	}//doPost(-,-)
}//class

