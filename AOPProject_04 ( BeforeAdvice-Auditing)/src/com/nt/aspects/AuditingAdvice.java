package com.nt.aspects;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Target CLass "+target.getClass());
		System.out.println("Target Method "+method.getName());
		System.out.println("Target Method arguments "+Arrays.toString(args));
		
		if((Integer) args[0]<0){
			args[0] = (Integer)args[0]*-1;
		}
		
		FileWriter fw = new FileWriter("F:\\Chetan\\Java\\Frameworks\\Audit.log",true);
		fw.write("\n Order ID:"+args[0]);
		fw.write("\n Approached time for Approval :"+ new Date());
		fw.flush();
		fw.close();
	}

}
