package com.nt.beans;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Vehicle implements BeanFactoryAware,BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean{
 
  private String beanId;
  
  public Vehicle(){
		System.out.println("Vehicle:0-param constructor");
	}
	
  
  public void setAge(int age){
	  System.out.println("Vehicle:setAge(-)");
  }
  
  public void myInit(){
	  System.out.println("Vehicle:myInit()");
  }
  
  public void myDestroy(){
	  System.out.println("Vehicle:myDestroy()");
  }
  
	
	
	BeanFactory bf;
	@Override
	public void setBeanFactory(BeanFactory bf) throws BeansException {
		System.out.println("Vehicle:setBeanFactory(-)");
		this.bf=bf;
	}
	
	String bname;
	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName(-)");
		bname=name;
		
	}

	
	 
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	 
	
	public  void move(){
		 // Get Engine class obj 
		Engine engg=(Engine)bf.getBean(beanId);
		engg.startEngg();
		System.out.println("Vehicle is moving/running");
		System.out.println("Vehicle is singleton bean"+ctx.isSingleton(bname));
		System.out.println("All bean ids maintained by container");
		FileSystemXmlApplicationContext ctx1=(FileSystemXmlApplicationContext)ctx;
		String id[]=ctx1.getBeanDefinitionNames();
		System.out.println(Arrays.toString(id));
		System.out.println("Bean Defination Count"+ctx1.getBeanDefinitionCount());
	}




	 ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		System.out.println("Vehicle:setApplicationContext(-)");
		this.ctx=ctx;
		
	}


	@Override
	public void destroy() throws Exception {
	  System.out.println("Vehicle:destroy()");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
    System.out.println("Vehicel:afterPropertiesSet()");
		
	}




	
	

}
