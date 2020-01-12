package com.nt.client;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import com.nt.aspects.MyDynamicPMPointcut;
import com.nt.aspects.MyPerformanceMonitoringPointcut;
import com.nt.aspects.PerformanceMonintoringAdvice;
import com.nt.service.ArithmeticService;

public class PAOPClient {

	public static void main(String[] args) {
		
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new ArithmeticService());
		//create Advisor Object (Static PointCut)
		DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(new MyPerformanceMonitoringPointcut(),new PerformanceMonintoringAdvice());
		factory.addAdvisor(advisor);
		
		//Static PointCut
		NameMatchMethodPointcutAdvisor nmAdvisor = new NameMatchMethodPointcutAdvisor();
		nmAdvisor.setAdvice(new PerformanceMonintoringAdvice());
		nmAdvisor.setMappedName("sum");
		factory.addAdvisor(nmAdvisor);
		
		//Dynamic PointCut
		DefaultPointcutAdvisor dAdvisor = new DefaultPointcutAdvisor(new MyDynamicPMPointcut(), new PerformanceMonintoringAdvice());
		factory.addAdvisor(dAdvisor);
		
		ArithmeticService proxy = (ArithmeticService)factory.getProxy();
		System.out.println("Add : "+proxy.sum(10, 20));
		System.out.println("Add : "+proxy.sum(1001, 2001));
		System.out.println("Mul : "+proxy.mul(10, 20));
		System.out.println("Sub : "+proxy.sub(10, 20));
		
	}

}
