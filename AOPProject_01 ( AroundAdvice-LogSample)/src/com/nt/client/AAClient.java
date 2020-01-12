package com.nt.client;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;

public class AAClient {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		IntrAmtCalculator proxy = ctx.getBean("proxyFactoryBean",IntrAmtCalculator.class);
		float resultOne = proxy.calcIntAmt(4000, 2, 10);
		System.out.println("Intrest Amoount Is :"+resultOne);
		float resultTwo = proxy.calcIntAmt(4000, 2, 10);
		System.out.println("Intrest Amoount Is :"+resultTwo);
		float resultThree = proxy.calcIntAmt(4000, 2, 10);
		System.out.println("Intrest Amoount Is :"+resultThree);
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
