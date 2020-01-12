package com.nt.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class SecurityCheckAdvice {
	
	private AuthenticationServiceManager authMan;

	public void setAuthMan(AuthenticationServiceManager authMan) {
		this.authMan = authMan;
	}
	
	public void securityChecking(JoinPoint joinPoint) {
		System.out.println("Entering into"+joinPoint.getSignature()+" with args "+Arrays.toString(joinPoint.getArgs()));
		if(!authMan.isAuthenticated())
			throw new IllegalArgumentException("Invalid Credentials");
		}

}
