package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculatorInterface;

public class PIClient {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		IntrAmtCalculatorInterface proxy = ctx.getBean("proxyFactoryBean",IntrAmtCalculatorInterface.class);
		float resultOne = proxy.calcIntrAmt(8000, 2, 10);
		System.out.println("Intrest Amoount Is :"+resultOne);
		float resultTwo = proxy.calcIntrAmt(4000, 2, 10);
		System.out.println("Intrest Amoount Is :"+resultTwo);
		float resultThree = proxy.calcIntrAmt(7000, 2, 10);
		System.out.println("Intrest Amoount Is :"+resultThree);
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
