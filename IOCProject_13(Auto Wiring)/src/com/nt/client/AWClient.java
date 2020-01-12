package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.TravelAgent;

@SuppressWarnings("deprecation")
public class AWClient {
	
	public static void main(String[] args){
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		TravelAgent agent =factory.getBean("tagent", TravelAgent.class);
		System.out.println(agent);
	}

}
