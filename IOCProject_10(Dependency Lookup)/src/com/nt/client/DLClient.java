package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Viechle;

@SuppressWarnings("deprecation")
public class DLClient {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		Viechle viechle = factory.getBean("viechle", Viechle.class);
		
		viechle.move();
	}

}
