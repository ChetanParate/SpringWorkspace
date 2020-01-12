package com.chetan.mvc.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int rollno;
	private String sname;
	private String sadd;
	private int marks;
	private int per;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
