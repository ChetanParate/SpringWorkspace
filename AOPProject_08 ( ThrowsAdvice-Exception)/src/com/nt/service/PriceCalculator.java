package com.nt.service;

public class PriceCalculator {
	
	public float calcBillAmt(int qty,float price){
		if( qty==0 || price==0.0f){
			throw new IllegalArgumentException("Price and Qty must not be zero ");
		}
		return qty*price;
	}

}
