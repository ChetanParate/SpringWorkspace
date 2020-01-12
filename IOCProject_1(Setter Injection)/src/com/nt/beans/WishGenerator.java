package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	
	//beans properties 
	private String name;
	private Date date;

	//setter methods for setter injections
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateWishMsg() {
		return "Good Morning Mr."+name+" Date : "+date;
	}

}
