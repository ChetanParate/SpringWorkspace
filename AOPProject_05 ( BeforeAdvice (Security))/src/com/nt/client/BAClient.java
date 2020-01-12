package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspects.AuthenticateManager;
import com.nt.service.IntrAmtCalculator;



public class BAClient {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		AuthenticateManager authentication = ctx.getBean("asManager",AuthenticateManager.class);
		authentication.singIn("chet","mishty");
		
		IntrAmtCalculator proxy =ctx.getBean("proxyFactoryBean",IntrAmtCalculator.class);
		System.out.println("Intr Amt :"+proxy.calcIntAmt(10000, 24, 2));
		
	
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
