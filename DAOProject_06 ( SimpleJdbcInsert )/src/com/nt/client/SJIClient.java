package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.StudentService;

public class SJIClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		StudentService service = ctx.getBean("service",StudentService.class);
		System.out.println("Student Registerd ? :"+service.registerStudent(102,"Kanchan","Nagpur",800,78));
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
