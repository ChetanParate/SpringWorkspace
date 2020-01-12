package com.nt.beans;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
@Component("viechle")
public class Viechle {
	
	@Inject
	private Engine engg;

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	

}
