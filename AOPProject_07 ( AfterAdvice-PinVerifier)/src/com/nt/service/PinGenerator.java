package com.nt.service;

import java.util.Random;

public class PinGenerator {
	
	public int generatorPin(){
		
		Random random = new Random();
		int pin = random.nextInt(9999);
		return pin;
	}

}
