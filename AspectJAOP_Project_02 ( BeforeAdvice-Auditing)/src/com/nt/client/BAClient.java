package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.OrderApprover;

public class BAClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		OrderApprover proxy = (OrderApprover)ctx.getBean("target");
		System.out.println("Order is Approved ?" + proxy.approveOrder(120));
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
