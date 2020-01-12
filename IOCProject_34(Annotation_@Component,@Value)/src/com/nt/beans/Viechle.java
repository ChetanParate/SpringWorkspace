package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Viechle {
	
	@Autowired
	private Engine engg;

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	

}
