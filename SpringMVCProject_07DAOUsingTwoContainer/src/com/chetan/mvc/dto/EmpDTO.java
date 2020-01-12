package com.chetan.mvc.dto;

import java.io.Serializable;

public class EmpDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int eno;
	private String ename;
	private int salary;
	private String city;
	
	public EmpDTO() {
		
	}
	public EmpDTO(int eno, String ename, int salary, String city) {
		
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.city =city;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
