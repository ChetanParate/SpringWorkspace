package com.nt.aspects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor{

	Map<String,Object> cache = new HashMap<String,Object>();
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		String key = invocation.getMethod()+Arrays.toString(invocation.getArguments());
		if(cache.containsKey(key)){
			System.out.println("from Cache");
			return cache.get(key);
		}
		else{
			Object retvalue = invocation.proceed();
			System.out.println("from taget method");
			cache.put(key, retvalue);
			return retvalue;
		}
	}

}
