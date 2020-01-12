package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Emp;

public class PnCClient {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
		ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Emp e =ctx.getBean("emp",Emp.class);
		System.out.println(e);
		
	}

}
