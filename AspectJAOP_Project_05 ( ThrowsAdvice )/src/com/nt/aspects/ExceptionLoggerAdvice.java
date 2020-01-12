package com.nt.aspects;

import org.aspectj.lang.JoinPoint;

public class ExceptionLoggerAdvice {
	
	public void exceptionLogging(JoinPoint joinPoint,ArithmeticException ae) {
		
		System.out.println("Exception is raised in class "+ joinPoint.getTarget().getClass()+" method "+joinPoint.getSignature());
		System.out.println("The Exception details are "+ae.getMessage());
		
	}

}
