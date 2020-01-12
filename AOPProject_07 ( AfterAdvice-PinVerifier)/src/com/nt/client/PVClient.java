package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.PinGenerator;

public class PVClient {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		PinGenerator proxy = ctx.getBean("proxyFactoryBean",PinGenerator.class);
		System.out.println("Generated ATM Pin : "+proxy.generatorPin()+" is Valid");
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
