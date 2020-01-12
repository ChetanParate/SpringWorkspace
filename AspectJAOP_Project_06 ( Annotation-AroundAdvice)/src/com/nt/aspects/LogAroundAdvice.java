package com.nt.aspects;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class LogAroundAdvice {

	long start,end;
	
	@Around(value = "execution(* com.nt.service.IntrAmtCalculator.*(..))")
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
