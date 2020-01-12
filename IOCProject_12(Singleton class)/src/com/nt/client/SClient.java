package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Viechle;

@SuppressWarnings("deprecation")
public class SClient {

	public static void main(String[] args) {
	
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		Viechle v1 = factory.getBean("v1",Viechle.class);
		
		Viechle v2 = factory.getBean("v1",Viechle.class);
		System.out.println(v1.hashCode()+" "+v2.hashCode());
	}

}
