package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.StudentService;

public class SJCClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		StudentService service = ctx.getBean("service",StudentService.class);
		System.out.println("Student Details :"+service.getStudentInfo(777));
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
