package com.nt.aspects;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggerAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Exception iae){
		System.out.println("1111");
		System.out.println("Exception that is raised "+iae.getClass());
		System.out.println("Exception Message "+iae.getMessage());
	}
	public void afterThrowing(Object target, Exception iae){
		System.out.println("4444");
		System.out.println(iae.getClass()+" is raised on the class"+target.getClass());
	}
	
	public void afterThrowing(Method method, Object args[],Object target,Throwable iae){
		System.out.println("5555");
		System.out.println(iae.getClass()+" is raised on "+method.getName()+" with args "+Arrays.toString(args));
	}
	public void afterThrowing(Throwable iae){
		System.out.println("3333");
		System.out.println("Exception that is raised "+iae.getClass());
		System.out.println("Exception Message "+iae.getMessage());
	}
}
