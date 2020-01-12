package com.chetan.mvc.command;

public class SearchCommand {
	private int eno;
	private String ename;
	private int dept;
	private String city;
	
	public SearchCommand() {
		
	}
	
	public SearchCommand(int eno, String ename, int dept, String city) {
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
		this.city = city;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
