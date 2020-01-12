package com.nt.aspects;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityCheckAdvice implements MethodBeforeAdvice {

	private AuthenticateManager authManager;
	
	public void setAuthManager(AuthenticateManager authManager) {
		this.authManager = authManager;
	}
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		if(!authManager.isAuthonticated()){
			throw new IllegalAccessException("Authentication Failed (Invalid username or Password)");
		}
		else{
			System.out.println(method.getName()+" with args "+Arrays.toString(args)+" call has comple");
		}
			
	}

}
