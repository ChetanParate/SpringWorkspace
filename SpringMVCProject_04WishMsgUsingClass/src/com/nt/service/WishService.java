package com.nt.service;

import java.util.Calendar;

public class WishService {
	public String generateWishMsg(){
		
		Calendar calender = Calendar.getInstance();
		int h =calender.get(Calendar.HOUR_OF_DAY);
		if(h<=12)
			return "Good Morning chetan..!";
		else if(h<=16)
			return "Good Afternoon chetan..!";
		else if(h<=20)
			return "Good Evening chetan..!";
		else
			return "Good Night chetan..!";
	}

}
