package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	private float rate;

	

	public IntrRateReplacer() {
		System.out.println("IntrReteReplacer:0-param constructor");
	}


	public void setRate(float rate) {
		this.rate = rate;
	}


	@Override
	public Object reimplement(Object bean, Method method, Object[] args)
			throws Throwable {
		System.out.println("IntrRateReplacer:reimplement(-,-,-)");
		System.out.println("bean class"+bean.getClass());
		System.out.println("Method name"+method.getName());
		System.out.println("Method args"+Arrays.toString(args));
		if(method.getName().equals("calcIntrAmt")){
			float pamt=(Float)args[0];
			float time =(Float)args[1];
			return pamt*time*rate/100.0f;
		}
		else{
			return  0.0f;
		}
	}//reimplement
}//class

