package com.nt.aspects;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	long start,end;
	@Override
	public Object invoke(MethodInvocation invocation)throws Throwable {
		System.out.println("Entered into "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments()));
		 Object args[] = invocation.getArguments();
		 if((Float)args[0]<5000){
			 args[1]=(Float)args[1]-0.5f;		 
		 }
		start =System.currentTimeMillis();
		System.out.println("Executing "+invocation.getMethod().getName());
		
		Object retValue = null; 
		if((Float)args[0]<=0 ||(Float)args[1]<=0 ||(Float)args[2]<0 ){
			return 0.0f;
		}
		else {
			retValue = invocation.proceed();
		}
			end = System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" with args "+ Arrays.toString(invocation.getArguments())+" is executed for "+(end-start)+"ms");
		System.out.println("Leaving from "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments()));
		retValue = (Float)retValue-((Float)retValue*0.05f);
		
		return retValue;
	}

}
