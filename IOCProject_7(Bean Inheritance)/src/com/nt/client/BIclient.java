package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Bike;

@SuppressWarnings("deprecation")
public class BIclient {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		Bike bikeOne = factory.getBean("pulsorOne", Bike.class);
		System.out.println(bikeOne);
		
		Bike bikeTwo = factory.getBean("pulsorTwo", Bike.class);
		System.out.println(bikeTwo);
	}

}
