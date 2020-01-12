package com.nt.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class MyDynamicPMPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz, Object[] args) {
		if(method.getName().equals("sub")&&(Integer)args[0]>1000 && (Integer)args[1]>1000){
			return true;
		}
		
		return false;
	}

}
