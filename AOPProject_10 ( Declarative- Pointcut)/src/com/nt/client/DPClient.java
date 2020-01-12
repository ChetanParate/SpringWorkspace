package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ArithmeticService;

public class DPClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		ArithmeticService proxy = ctx.getBean("proxyFactoryBean",ArithmeticService.class);
		
		System.out.println("add :"+ proxy.sum(10,20));
		System.out.println("add :"+ proxy.sum(10,20));
		System.out.println("------------------------");
		System.out.println("sub :"+ proxy.sub(3000,2000));
		System.out.println("sub :"+ proxy.sub(3000,2000));
		System.out.println("------------------------");
		System.out.println("mul :"+ proxy.mul(10,20));
		System.out.println("mul :"+ proxy.mul(10,20));
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
