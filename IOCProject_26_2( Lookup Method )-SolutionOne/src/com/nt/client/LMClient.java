package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.bean.Manager;

public class LMClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Manager mgr = (Manager)ctx.getBean("mgr");
		mgr.showDetails();
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
