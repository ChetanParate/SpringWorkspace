package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class AFAClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		ShoppingStore proxy = ctx.getBean("target",ShoppingStore.class);
		System.out.println("Bill Amt :" + proxy.generateBillAmt(new String[]{"item1","item2"}, 3000, 30));
		System.out.println("Pls collect the Discount Cupon..........");
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
