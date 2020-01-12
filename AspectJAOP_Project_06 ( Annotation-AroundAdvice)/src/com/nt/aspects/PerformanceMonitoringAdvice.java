package com.nt.aspects;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(3)
@Component
public class PerformanceMonitoringAdvice {

	long start ,end;
	@Around(value = "execution(* com.nt.service.IntrAmtCalculator.*(..))")
	public Object monitoring(ProceedingJoinPoint pjp) throws Throwable{
		start = System.currentTimeMillis();
		Object retValue = pjp.proceed();
		end = System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" wiht args"+ Arrays.toString(pjp.getArgs()));
		return retValue;
	}
}
