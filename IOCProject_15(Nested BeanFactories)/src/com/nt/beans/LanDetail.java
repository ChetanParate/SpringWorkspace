package com.nt.beans;

public class LanDetail {

	private int loanId;
	private String loanType;
	private String customer;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "LanDetail [loanId=" + loanId + ", loanType=" + loanType + ", customer=" + customer + "]";
	}
	
	
}
