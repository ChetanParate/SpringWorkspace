package com.nt.bo;

public class StudentBO {
	
	private int sno;
	private String sname;
	private String sadd;
	private int marks;
	private float per;
	
	
	public StudentBO() {
	
	}
	public StudentBO(int sno, String sname, String sadd, int marks, float per) {
		super();
		this.sno = sno;
		this.sname = sname;
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "StudentBO [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", marks=" + marks + ", per=" + per
				+ "]";
	}
	
}
