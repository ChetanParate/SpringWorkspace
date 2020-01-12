package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;

public class AJClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		IntrAmtCalculator proxy = ctx.getBean("target",IntrAmtCalculator.class);
		
		System.out.println("Simple Intr Amt ? "+proxy.calSimpleIntrAmt(10000, 20, 2));
		System.out.println("-----------------------------------------------------------");
		System.out.println("Simple Intr Amt ? "+proxy.calSimpleIntrAmt(10000, 20, 2));
		System.out.println("-----------------------------------------------------------");
		System.out.println("Compound Intr Amt ? "+proxy.calCompoundIntrAmt(10000, 20, 2));
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
