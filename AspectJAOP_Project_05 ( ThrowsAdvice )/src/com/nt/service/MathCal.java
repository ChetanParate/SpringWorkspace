package com.nt.service;

public class MathCal implements MathCalInterface {

	@Override
	public float div(int x, int y) throws ArithmeticException {
		if(y==0)
			throw new ArithmeticException("We Can not divided with zero...");
		else
			return (float)x/y;
	}

}
