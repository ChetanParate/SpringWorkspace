package com.nt.bean;

public abstract class Manager {

	private String name;
	public abstract Clerk getClerk();
	
	public Manager() {
		System.out.println("Manager : 0-param Constructor");		
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public void showDetails(){
		System.out.println("Manager name : "+name);
		Clerk clrk = getClerk();
		clrk.show();
	}
	
}
