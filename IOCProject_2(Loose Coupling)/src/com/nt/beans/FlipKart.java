package com.nt.beans;

import java.util.Random;

public class FlipKart {
	
	private Courier courier;
	
	//setter method for setter injection
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String purchase(String item[]) {
		
		//generate order id
		Random random = new Random();
		int orderid = random.nextInt(700000);
		
		String status = courier.deliver(orderid);
		
		return status+" Bill Amount for "+orderid+" id is 7000";
		
	}//method
}//class
