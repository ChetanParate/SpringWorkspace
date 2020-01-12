package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Select;

public class PFClient {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("sb");
		Select select = (Select)obj;
		
		System.out.println("7900 emp name is "+select.fetchName(7900));
		System.out.println("7900 emp name is "+select.fetchSalary(7900));
	}

}
