package com.chetan.mvc.dto;

import java.io.Serializable;

public class SearchDTO implements Serializable {
	
	
	private static final long serialVersionUID = 3601138293217418707L;

	private int employeeNumber;
	private String employeeName;
	private int deptNumber;
	private String city;
	
	public SearchDTO() {
		
	}

	public SearchDTO(int employeeNumber, String employeeName, int deptNumber, String city) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.deptNumber = deptNumber;
		this.city = city;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
