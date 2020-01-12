package com.nt.aspects;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	long start,end;
	@Override
	public Object invoke(MethodInvocation invocation)throws Throwable {
		System.out.println("Entered into "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments()));
		
		start =System.currentTimeMillis();
		System.out.println("Executing "+invocation.getMethod().getName());
		Object retValue = invocation.proceed();
		end = System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" with args "+ Arrays.toString(invocation.getArguments())+" is executed for "+(end-start)+"ms");
		System.out.println("Leaving from "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments()));
		return retValue;
	}

}
