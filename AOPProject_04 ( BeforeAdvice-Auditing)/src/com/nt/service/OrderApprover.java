package com.nt.service;

import java.util.Calendar;

public class OrderApprover {
	
	public boolean approveOrder(int orderId){
		
		Calendar cl = Calendar.getInstance();
		int month = cl.get(Calendar.MONTH);
		
		if(orderId>=100 && orderId<=200){
			if( month>=2 && month<=5){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
