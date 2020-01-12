package com.nt.bean;

public class Clerk {
	
	private String name;
	private String work;
	
	public Clerk() {
		System.out.println("Clerk : 0-param Constructor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	public String getName() {
		return name;
	}

	public String getWork() {
		return work;
	}

	public void show() {
		System.out.println("Name : "+name+" Work : "+work);
	}
	

}
