package com.nt.aspects;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AuditingAdvice {

	public void auditing(JoinPoint joinPoint,int oId) throws Throwable{
		System.out.println("Target Class :"+ joinPoint.getSourceLocation().getClass());
		System.out.println("Target Method :"+ joinPoint.getSignature());
		System.out.println("Target Method args :"+ Arrays.toString(joinPoint.getArgs()));
		System.out.println("Target Method args Value :"+ oId);
		
		Object args[]= joinPoint.getArgs();
		if((Integer)args[0]<0)
			args[0] = (Integer)args[0]*-1;
		//performing auditing in file
		FileWriter fileWriter = new FileWriter("F:\\Chetan\\Java\\SpringWorkspace\\AOPModule\\audit.log");
		
		fileWriter.write("\n Order ID :"+joinPoint.getArgs()[0]);
		fileWriter.write("\n Approached time for Approval :"+new Date());
		
		fileWriter.flush();
		fileWriter.close();
	}
}
