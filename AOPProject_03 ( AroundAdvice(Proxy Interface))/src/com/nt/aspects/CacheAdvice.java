package com.nt.aspects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
	Map<String,Object> cache = new HashMap<String,Object>();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		String key = invocation.getMethod()+Arrays.toString(invocation.getArguments());
		if(cache.containsKey(key)){
			System.out.println("From Cache :");
			return cache.get(key);
		}
		else{
			Object retval =invocation.proceed();
			System.out.println("From target Method");
			cache.put(key,retval);
			return retval;
			
		}
	}
}