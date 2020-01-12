package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVoting implements InitializingBean, DisposableBean {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		System.out.println("setName(-)");		
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("setAge(-)");
		this.age = age;
	}

	public void  check(){
		System.out.println("Bean:custom-init()");
		if(name==null || age<=0)
			throw new IllegalArgumentException("name, age must set with values");
	}
	
	public  String  checkVotingElgibility(){
		 if(age>=18){
			 return name+"  u r  elgible to vote ";
		 }
		 else{
			 return name+" u r not elgible vote";
		 }
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean:destroy()");
		name=null;
		age=0;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
	 System.out.println("Bean:AfterPropertiesSet()");
	 
		if(name==null || age<=0)
			throw new IllegalArgumentException("name, age must set with values");
	}
	
	public void myDestroy(){
		System.out.println("Bean:custom Destroy()");
		name=null;
		age=0;
	}
}
