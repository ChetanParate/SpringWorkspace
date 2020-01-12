package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Computer;

@SuppressWarnings("deprecation")
public class BAClient {

	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		Computer com = factory.getBean("box",Computer.class);
		
		System.out.println(com);

	}

}
