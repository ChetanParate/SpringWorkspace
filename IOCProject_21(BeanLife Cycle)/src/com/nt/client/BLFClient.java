package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.CheckVoting;

public class BLFClient {

	public static void main(String[] args) {
		// Create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		CheckVoting cv=(CheckVoting)ctx.getBean("cv");
		System.out.println(cv.checkVotingElgibility());
		((FileSystemXmlApplicationContext)ctx).close(); 
		
		
		/*BeanFactory factory=new XmlBeanFactory
		 * (new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		 * CheckVoting cv = (CheckVoting)factory.getBean("cv");
		 * System.out.println(cv.checkVotingElgibility());
		 * ((XmlBeanFactory)factory).destroySingletons();*/

	}

}
