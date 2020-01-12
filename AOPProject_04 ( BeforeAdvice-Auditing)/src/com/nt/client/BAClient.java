package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.OrderApprover;



public class BAClient {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		OrderApprover proxy = ctx.getBean("proxyFactoryBean",OrderApprover.class);
		System.out.println("Order is Approved ? "+ proxy.approveOrder(10));
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
