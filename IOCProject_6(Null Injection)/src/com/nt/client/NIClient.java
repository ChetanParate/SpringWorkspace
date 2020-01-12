package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.User;

@SuppressWarnings("deprecation")
public class NIClient {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		User user = factory.getBean("user", User.class);
		
		System.out.println(user);
	}

}
