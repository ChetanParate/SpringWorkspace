package com.nt.service;

public class IntrAmtCalculator implements IntrAmtCalculatorInterface {
	
	@Override
	public float calcIntrAmt(float p, float r, float t) {
		return (p*t*r/100.0f);
		
	}

}
