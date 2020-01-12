package com.nt.beans;

import java.util.Properties;

public class EmployeeProfile {
	
	private Properties empDesgs;

	public void setEmpDesgs(Properties empDesgs) {
		this.empDesgs = empDesgs;
	}

	@Override
	public String toString() {
		return "EmployeeProfile [empDesgs=" + empDesgs + "]";
	}
	

}
