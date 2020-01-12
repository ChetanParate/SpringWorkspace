package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EnggCourse;

@SuppressWarnings("deprecation")
public class CMClient {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		EnggCourse eng = factory.getBean("CT1stYear", EnggCourse.class);
		System.out.println(eng);

	}

}
