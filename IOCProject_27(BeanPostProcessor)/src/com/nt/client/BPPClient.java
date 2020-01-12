package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.CustStudService;

public class BPPClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		CustStudService service = ctx.getBean("service",CustStudService.class);
		
		service.processStudent(101,"Chetan","Java");
		service.processCustomer(010,"Chetan",20000.0f);
		
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
