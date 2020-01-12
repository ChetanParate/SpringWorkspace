package com.nt.beans;

public class BankLoanApprover {
	
	private LanDetail details;

	public void setDetails(LanDetail details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "BankLoanApprover [details=" + details + "]";
	}
	
	public String approveLoan() {
		if(details.getLoanType().equals("Tow-wheeler")){
			return "Loan is approver...";
		}
		else{
			return "Loan is Rejected.";
		}
		
	}
	

}
