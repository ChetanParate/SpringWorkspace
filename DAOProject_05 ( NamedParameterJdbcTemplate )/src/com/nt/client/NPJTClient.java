package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.EmployeeService;

public class NPJTClient {

	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Service class obj
		EmployeeService service=ctx.getBean("service",EmployeeService.class);
		//Call B.methods
		System.out.println(" 7070 Emp Name is :"+service.getEmpName(7070));
		System.out.println(" 7777 Emp Detail is :"+service.getEmpDetails(7777));
		//System.out.println("Employee inserted?"+service.registerEmp( 3456, "Sanju","Clark",70000.0f));
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
