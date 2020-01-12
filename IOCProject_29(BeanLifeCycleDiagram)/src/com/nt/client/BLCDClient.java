package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Vehicle;

public class BLCDClient {

	public static void main(String[] args) {
	   // Activate BF container
		ApplicationContext  ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Vehicle vh=(Vehicle)ctx.getBean("vc");
		vh.move();
		((FileSystemXmlApplicationContext) ctx).close();
	}
}
