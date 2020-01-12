package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private int id;
	private String type;
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + "]";
	}
	

}
