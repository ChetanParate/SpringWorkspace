package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.MathOne;

public class AJClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		MathOne proxy = ctx.getBean("target",MathOne.class);
		
		System.out.println("Simple Intr Amt ? "+proxy.add(10,20));
		System.out.println("-----------------------------------------------------------");
		System.out.println("Simple Intr Amt ? "+proxy.sub(10,20));
		System.out.println("-----------------------------------------------------------");
		System.out.println("Simple Intr Amt ? "+proxy.mul(10,20));
		System.out.println("-----------------------------------------------------------");
		System.out.println("Simple Intr Amt ? "+proxy.div(10,20));
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
