package com.nt.bo;

import java.util.Date;

public abstract class BaseBO {
	
	private int id;
	private String name;
	private Date doj;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getDoj() {
		return doj;
	}
	

}
