package com.nt.bean;

public class Manager {

	private String name;
	public Clerk clrk;
	
	public Manager() {
		System.out.println("Manager : 0-param Constructor");		
	}
	
	public void setClrk(Clerk clrk) {
		this.clrk = clrk;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public void showDetails(){
		System.out.println("Manager name : "+name);
		clrk.show();
	}
	
}
