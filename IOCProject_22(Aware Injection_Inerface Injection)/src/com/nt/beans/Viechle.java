package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Viechle implements ApplicationContextAware {
	
	private  String enggId;
	private ApplicationContext ctx;
	 

	public void setApplicationContext(ApplicationContext ctx)throws BeansException {
		System.out.println("Viechle:setApplicationContext(-)");
	 	this.ctx=ctx;
	 }
	
	public Viechle(){
		 System.out.println("Viechle:0-param constructor");
	 }
	 
	public void setEnggId(String enggId){
		System.out.println("Viechle:setEnggId");
		this.enggId=enggId;
	 }


	 public void move(){
	   Engine engine=ctx.getBean(enggId,Engine.class);
	   engine.start();
	   System.out.println("Viechle  moved for journey");
	  }


}
