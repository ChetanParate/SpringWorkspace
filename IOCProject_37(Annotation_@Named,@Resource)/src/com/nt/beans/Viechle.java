package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("viechle")
//@Scope("Singleton")
public class Viechle {
	
	//@Resource//Perform ByType mode autowiring
	@Resource(name = "eng1")
	private Engine engg;

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	

}