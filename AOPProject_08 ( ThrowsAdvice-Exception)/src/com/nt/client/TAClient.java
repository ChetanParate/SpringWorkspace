package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.PriceCalculator;

public class TAClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		PriceCalculator proxy = ctx.getBean("proxyFactoryBean",PriceCalculator.class);
		
		System.out.println("Bill Amt "+ proxy.calcBillAmt(0, 40000));
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
