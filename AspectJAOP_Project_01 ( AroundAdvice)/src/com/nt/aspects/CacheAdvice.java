package com.nt.aspects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAdvice{

	Map<String,Object> cache = new HashMap<String,Object>();
	
	
	public Object caching(ProceedingJoinPoint pjp) throws Throwable {
		
		String key = pjp.getSignature()+Arrays.toString(pjp.getArgs());
		if(!cache.containsKey(key)){
			System.out.println("from target Method"+pjp.getSignature());
			Object retValue = pjp.proceed();
			cache.put(key, retValue);
			return retValue;
		}
		else{
			
			System.out.println("from cache ");
			return cache.get(key);
		}
	}

}
