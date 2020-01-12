package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.MathCalInterface;


public class TAClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		try{
		MathCalInterface proxy = ctx.getBean("target",MathCalInterface.class);
		System.out.println("Result :" + proxy.div(10, 2));
		System.out.println("...............................");
		System.out.println("Result :" + proxy.div(10, 0));
		
		((FileSystemXmlApplicationContext)ctx).close();
		}catch(ArithmeticException ae){
			System.out.println("Arthmatic exception is genrated :"+ae.getMessage());
		}
	}

}
