package com.nt.beans;

public class Viechle {
	
	private int id;
	private Engine engin;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setEngin(Engine engin) {
		this.engin = engin;
	}
	@Override
	public String toString() {
		return "Viechle [id=" + id + ", engin=" + engin + "]";
	}
	
	
	

}
