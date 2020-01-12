package com.nt.beans;

import java.util.Date;

public class Machine {
	
	private int id;
	private String name;
	private Date date;
	
	public Machine(int id, String name, Date date) {
	System.out.println("Machine contstructor called");
		this.id = id;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	
	

}
