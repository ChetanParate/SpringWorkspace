package com.nt.beans;

import java.util.Date;

public class User {
	
	private int id;
	private String name;
	private Date date;
	
	public User(int id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	

}
