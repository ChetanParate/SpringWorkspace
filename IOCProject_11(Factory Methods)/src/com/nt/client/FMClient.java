package com.nt.client;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class FMClient {

	public static void main(String[] args) {
		
	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	
	@SuppressWarnings("rawtypes")
	Class c1 = factory.getBean("c1", Class.class);
	System.out.println("C1 Data :"+c1+" ::C1 class Name :"+c1.getClass());
	
	Calendar c2 = factory.getBean("c2", Calendar.class);
	System.out.println("C2 Data "+c2+"C2 class Name "+c2.getClass());
	
	String s2 = factory.getBean("s2", String.class);
	System.out.println("s2 Data "+s2+"s2 class Name "+s2.getClass());
	
	String s3 = factory.getBean("s3", String.class);
	System.out.println("s3 Data "+s3+"s1 class Name "+s3.getClass());
	}

}
