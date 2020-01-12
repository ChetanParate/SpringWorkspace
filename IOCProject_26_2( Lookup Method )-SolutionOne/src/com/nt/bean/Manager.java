package com.nt.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Manager implements BeanFactoryAware {

	private String name;
	public BeanFactory factory;
	
	public Manager() {
		System.out.println("Manager : 0-param Constructor");		
	}
	
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory = factory;
		
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public void showDetails(){
		System.out.println("Manager name : "+name);
		Clerk clrk =(Clerk)factory.getBean("clrk");
		clrk.show();
	}
	
}
