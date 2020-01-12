package com.nt.beans;

import java.util.List;

public class Student {
	
	private List<String> names;

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Student [names=" + names + "]";
	}
	
	

}
