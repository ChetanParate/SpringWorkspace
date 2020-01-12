package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Bank;

public class MRClient {
 public static void main(String[] args) {
	 //create IOC Container
		@SuppressWarnings("resource")
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		Bank bank=ctx.getBean("bank",Bank.class);
		System.out.println(bank.getClass());
		System.out.println("Intr Amt"+bank.calcIntrAmt(80000,20));
}
}
