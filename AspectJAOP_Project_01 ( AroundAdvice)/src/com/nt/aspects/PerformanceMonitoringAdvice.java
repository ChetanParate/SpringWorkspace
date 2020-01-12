package com.nt.aspects;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAdvice {

	long start ,end;
	
	public Object monitoring(ProceedingJoinPoint pjp) throws Throwable{
		start = System.currentTimeMillis();
		Object retValue = pjp.proceed();
		end = System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" wiht args"+ Arrays.toString(pjp.getArgs()));
		return retValue;
	}
}
