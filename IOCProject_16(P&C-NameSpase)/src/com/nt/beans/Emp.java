package com.nt.beans;

public class Emp {
	
	private String ename;
	private Dept dept;
	
	public Emp(String ename, Dept dept) {
		super();
		this.ename = ename;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", dept=" + dept + "]";
	}
	

}
