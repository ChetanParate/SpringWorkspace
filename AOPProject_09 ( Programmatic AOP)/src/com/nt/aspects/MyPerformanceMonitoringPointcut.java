package com.nt.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class MyPerformanceMonitoringPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz) {
		if(method.getName().equals("sum"))
			return true;
		else
			return false;
	}
}
