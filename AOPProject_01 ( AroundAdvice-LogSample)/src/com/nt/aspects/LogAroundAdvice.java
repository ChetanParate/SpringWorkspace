package com.nt.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation)throws Throwable {
		
		System.out.println("before Invocation of calcIntAmt() Method..");
		Object retValue = invocation.proceed();
		System.out.println("After Invocation of calcIntAmt() Method..");
		return retValue;
	}

}
