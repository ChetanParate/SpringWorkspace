package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.LoadService;

public class DsInjectClient {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
		ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml"); 
		
		LoadService service = ctx.getBean("service", LoadService.class);
		
		Float intramt = service.calcIntramt(1001, "Chetan", 14000, 2, 20);
		System.out.println("Intrarest Amount :"+ intramt);
	}

}
