package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Viechle {
	
	private String engId;
	
	public Viechle() {
		System.out.println("Viechle : 0-param Constructor Called");
	}
	public void setEngId(String engId) {
		this.engId = engId;
	}
	
	public void move() {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		Engine engine = factory.getBean(engId, Engine.class);
		engine.start();
		
		System.out.println("Viechle moved for Journcy..");
		
	}

}
