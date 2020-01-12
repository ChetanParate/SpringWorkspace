package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AIClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Viechle viechle=ctx.getBean("viechle",Viechle.class);
	viechle.move();
	((FileSystemXmlApplicationContext)ctx).close();
		  
	}

}
