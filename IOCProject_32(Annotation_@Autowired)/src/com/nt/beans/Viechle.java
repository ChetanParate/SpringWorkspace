package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Viechle {
	
	//@Autowired
	private Engine engg;

	//@Autowired
	public void setEngg(Engine engg){
		this.engg = engg;
	}
	
	@Autowired (required = true)
	 public Viechle( Engine engg) {
		this.engg = engg;
		
	}
	
	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	

}
