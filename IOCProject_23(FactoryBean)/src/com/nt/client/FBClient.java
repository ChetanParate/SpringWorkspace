package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.ScheduleReminder;

public class FBClient {
	public static void main(String[] args) {
		 //create IOC Container
		@SuppressWarnings("resource")
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		 // get Bean
		ScheduleReminder reminder=ctx.getBean("reminder",ScheduleReminder.class);
		System.out.println(reminder);
	}

}
