package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("viechle")
public class Viechle {
	
	@Inject
	@Named("eng2")
	private Engine engg;

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	

}
