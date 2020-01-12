package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspects.AuthenticationServiceManager;
import com.nt.service.IntrAmtCalculator;

public class BAClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		AuthenticationServiceManager authMan = ctx.getBean("asManager",AuthenticationServiceManager.class);
		
		authMan.singIn("chet","mishty");
		IntrAmtCalculator proxy = ctx.getBean("target",IntrAmtCalculator.class);
		System.out.println("Intr Amt : "+proxy.calcIntrAmt(10000, 20, 2));
		
		authMan.signOut();
		System.out.println(authMan.getClass());
		System.out.println(proxy.getClass());
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
