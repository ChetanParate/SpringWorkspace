package com.nt.beans;

import java.util.Map;

public class College {

	private Map<String,String> facultySub;
	private Map<?, ?> facultyPhones;

	public void setFacultySub(Map<String, String> facultySub) {
		this.facultySub = facultySub;
	}

	public void setFacultyPhones(Map<?, ?> facultyPhones) {
		this.facultyPhones = facultyPhones;
	}

	@Override
	public String toString() {
		return "College [facultySub=" + facultySub + ", facultyPhones=" + facultyPhones + "]";
	}	
}
