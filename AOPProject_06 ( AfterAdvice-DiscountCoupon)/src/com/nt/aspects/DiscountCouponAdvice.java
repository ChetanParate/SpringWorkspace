package com.nt.aspects;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCouponAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Target class name :"+target.getClass());
		System.out.println("Target class Method :"+method.getName());
		System.out.println("Target Mathod args :"+Arrays.toString(args));
		
		returnValue = (Float)returnValue+1000;
		
		String couponMsg = null;
		if((Float)returnValue>=50000)
			couponMsg = "Avail 30% Discount on next Purchese";
		else if((Float)returnValue>=30000)
			couponMsg = "Avail 20% Discount on next Purchese";
		else
			couponMsg = "Avail 5% Discount on next Purchese";
		FileWriter fw = new FileWriter("F:\\Chetan\\Java\\Frameworks\\discount.txt");
		fw.write(couponMsg);
		fw.flush();
		fw.close();
	}
}
