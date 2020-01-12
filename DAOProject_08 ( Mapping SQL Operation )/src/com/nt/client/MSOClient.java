package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentService;

public class MSOClient {

	public static void main(String[] args) {
		// start IOC
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/persistence-beans.xml");
		// get Service class obj
		StudentService service=ctx.getBean("service",StudentService.class);
		//Call B.methods
		System.out.println("567 student details Updated?"+service.modifyStudentDetails(777,"hyd10"));
		System.out.println("Student Detaisl beloging to hyd"+service.findStudDetailsByAddress("hyd"));
	}//main
}//class

