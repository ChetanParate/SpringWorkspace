package com.nt.bo;

public class EmployeeBO {
	
	private int eno;
	private String eName;
	private String job;
	private int Salary;
	
	public EmployeeBO() {
		
	}

	public EmployeeBO(int eno, String eName, String job, int salary) {
		super();
		this.eno = eno;
		this.eName = eName;
		this.job = job;
		Salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eno=" + eno + ", eName=" + eName + ", Job=" + job + ", Salary=" + Salary + "]";
	}

	

}
