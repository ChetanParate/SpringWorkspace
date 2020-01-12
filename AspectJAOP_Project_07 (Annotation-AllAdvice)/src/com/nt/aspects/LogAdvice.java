package com.nt.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class LogAdvice {
	
	@Pointcut(value ="execution(* com.nt.service.MathOne.*(..))")
	public void myPointcut(){
		
	}
	@Around(value = "myPintcut")
	public Object log(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("Enterining into "+pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs()));
		Object retValue = pjp.proceed();
		System.out.println("Leaving from "+pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs()));
		return retValue;
	}
	@Before(value = "myPintcut")
	public void checkInputs(JoinPoint jp){
		System.out.println("Enterining into "+jp.getSignature()+" with args "+Arrays.toString(jp.getArgs()));
		Object args[] =jp.getArgs();
		if((Integer) args[0]<0||(Integer)args[1]<0)
			throw new IllegalArgumentException("Wrong Input...");		
	}
	
	@AfterReturning(value = "myPintcut",returning = "result")
	public void checkResult(JoinPoint jp, int result)throws Throwable{
		System.out.println("Existing From "+jp.getSignature()+" with args "+Arrays.toString(jp.getArgs()));
		if(result<0)
			throw new IllegalArgumentException("Unexpected results");		
	}
	
	@AfterThrowing(value = "myPintcut",throwing = "e")
	public void exceptionLogger(JoinPoint jp,Exception e){
		System.out.println("Exception is Raised in "+jp.getSignature()+" with args "+Arrays.toString(jp.getArgs()));
		System.out.println("The Exception is "+e.getMessage());
	}

}
