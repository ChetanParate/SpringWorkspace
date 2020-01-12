package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.FlipKart;

@SuppressWarnings("deprecation")
public class LCTestApp {

	public static void main(String[] args) {
		
		//create Bean Factory object to start create IOC Container
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		//to Get Bean Object
		FlipKart bean = factory.getBean("fpk",FlipKart.class);
		
		String billMsg = bean.purchase(new String[]{"shirts","Mobile","Books"});
		
		System.out.println(billMsg);

	}// main method

}//class
