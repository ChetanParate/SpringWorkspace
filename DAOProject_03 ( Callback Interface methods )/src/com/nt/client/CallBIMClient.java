package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ListEmpService;

public class CallBIMClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		ListEmpService service = (ListEmpService)ctx.getBean("service");
		
		System.out.println("7499 Emp Details"+service.searchEmpByNo(7878));
		System.out.println("All CLERKS Details"+service.getEmpsByDesg("Clerk"));
		
		((FileSystemXmlApplicationContext)ctx).close();
		

	}

}
