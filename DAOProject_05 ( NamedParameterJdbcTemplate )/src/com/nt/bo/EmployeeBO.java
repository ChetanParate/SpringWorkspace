package com.nt.bo;

public class EmployeeBO {
	
	private int eid;
	private String ename;
	private String job;
	private float salary;
	
	public EmployeeBO(int eid, String ename, String job, float salary) {
		this.eid = eid;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
}
