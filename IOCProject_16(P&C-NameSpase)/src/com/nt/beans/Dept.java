package com.nt.beans;

import java.util.Date;

public class Dept {
	private int deptno;
	private String deptname;
	private Date dop;
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public void setdop(Date dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptname=" + deptname + ", date=" + dop + "]";
	}
	
	
	

}
