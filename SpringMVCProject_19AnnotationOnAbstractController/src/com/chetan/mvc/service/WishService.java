package com.chetan.mvc.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("ws")
public class WishService {
	
	public String generateWishMsg(){
		
		Calendar cal = Calendar.getInstance();
		int h = cal.get(Calendar.HOUR_OF_DAY);
		if(h<=12)
			return "Good Morning Chetan...";
		else if (h<=6)
			return "Good After noon Chetan....";
		else if(h<=20)
			return "Good Evening Chetan......";
		else
			return "Good Night Chet.... :)";
		
	}

}
