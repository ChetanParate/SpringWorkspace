package com.nt.beans;

public class Bike {
	private String id;
	private String make;
	private String enginCC;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setEnginCC(String enginCC) {
		this.enginCC = enginCC;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", make=" + make + ", enginCC=" + enginCC + "]";
	}
	

}
