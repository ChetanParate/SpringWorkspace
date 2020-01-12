package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AnRClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationcontext.xml");
		
		Viechle viechle =ctx.getBean("viechle",Viechle.class);
		System.out.println(viechle);
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
