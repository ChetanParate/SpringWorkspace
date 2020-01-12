package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class DCClient {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		ShoppingStore proxy = ctx.getBean("proxyFactoryBean",ShoppingStore.class);
		System.out.println("Bill amount : "+proxy.generateBillAmount("Shirt",900,80));
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
