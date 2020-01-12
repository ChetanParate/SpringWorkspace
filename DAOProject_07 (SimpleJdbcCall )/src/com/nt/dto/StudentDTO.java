package com.nt.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int sno;
	private String sName;
	private String sadd;
	private int marks;
	private int per;
	
	public StudentDTO() {
	}

	public StudentDTO(int sno, String sName, String sadd, int marks, int per) {
		super();
		this.sno = sno;
		this.sName = sName;
		this.sadd = sadd;
		this.marks = marks;
		this.per = per;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
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

	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sName=" + sName + ", sadd=" + sadd + ", marks=" + marks + ", per=" + per
				+ "]";
	}
	

}
