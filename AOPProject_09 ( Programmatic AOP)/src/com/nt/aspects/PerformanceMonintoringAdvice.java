package com.nt.aspects;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonintoringAdvice implements MethodInterceptor {

	long start,end;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		start = System.currentTimeMillis();
		Object retvalue = invocation.proceed();
		end = System.currentTimeMillis();
		System.out.println(invocation.getMethod()+ " with args "+Arrays.toString(invocation.getArguments())+" has taken "+(end-start)+" ms time");
		return retvalue;
	}

}
