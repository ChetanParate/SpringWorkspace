package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value("111")
	private int id;
	@Value("DDITv")
	private String type;
	
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
