package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.ClassA;
import com.nt.beans.ClassB;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		ClassA beanA =factory.getBean("a", ClassA.class);
		System.out.println(beanA.hashCode());
		
		ClassB beanB =factory.getBean("b", ClassB.class);
		System.out.println(beanB.hashCode());
		

	}

}
