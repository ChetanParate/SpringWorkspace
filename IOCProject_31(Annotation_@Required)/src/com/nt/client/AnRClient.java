package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Robot;

public class AnRClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationcontext.xml");
		
		Robot robot =ctx.getBean("robot",Robot.class);
		System.out.println(robot);
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
