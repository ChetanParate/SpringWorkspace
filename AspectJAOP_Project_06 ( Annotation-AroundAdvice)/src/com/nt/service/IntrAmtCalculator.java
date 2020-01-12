package com.nt.service;

import org.springframework.stereotype.Service;

@Service("target")
public class IntrAmtCalculator {
	
	public float calSimpleIntrAmt(float p ,float t, float r){
		return (p*t*r)/100.0f;
	}
	public float calCompoundIntrAmt(float p ,float t, float r){
		return (float)(p*Math.pow((1+r/100.0f),t)-p);
	}
}
