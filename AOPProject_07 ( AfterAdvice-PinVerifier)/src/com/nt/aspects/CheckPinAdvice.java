package com.nt.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CheckPinAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Target class name :"+target.getClass());
		System.out.println("Target class Method :"+method.getName());
		System.out.println("Pin Number :"+returnValue);
		if((Integer)returnValue<=999)
			throw new IllegalArgumentException("Weak Pin Generated so it is Rejected....");
	}
}
