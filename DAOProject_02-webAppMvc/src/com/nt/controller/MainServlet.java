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
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.EmpService;


public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmpService service = null;
	
	public void init(){
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		service =(EmpService)applicationContext.getBean("service");	
	 }
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
	   String desg[] = request.getParameterValues("job");
	   List<Map<String, Object>> list = service.search(desg);
	   request.setAttribute("result",list);
	   RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
	   rd.forward(request,response);	   
   }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	public void destroy(){
		service = null;
		
	}

}
