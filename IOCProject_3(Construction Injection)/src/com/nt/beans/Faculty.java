package com.nt.beans;

public class Faculty {
	
	private int id;
	private String fname,subject;
	
	public Faculty(int id, String fname, String subject) {
		System.out.println("Faculty contsructor called");
		this.id = id;
		this.fname = fname;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + fname + ", subject=" + subject + "]";
	}
	
	
	

}
