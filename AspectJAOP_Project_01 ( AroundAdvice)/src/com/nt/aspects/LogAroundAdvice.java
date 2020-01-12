package com.nt.aspects;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAroundAdvice {

	long start,end;
	
	public Object logging(ProceedingJoinPoint pjp)throws Throwable {
		
		System.out.println("Enterining into "+pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs()));
		Object args[] = pjp.getArgs();
		
		if((Float) args[0]>=10000)
			args[2]=(Float)args[2]-0.5f;
		Object retValue = pjp.proceed(args);//calls target method
		System.out.println("Leaving from "+pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs()));
		return retValue;
	}

}
