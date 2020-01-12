package com.nt.bean;

public class IntrAmtCalculator {
	private IntrAmtDetails details;
	
	//setter method
	public void setDetails(IntrAmtDetails details) {
		this.details = details;
	}
	
	public float calcIntrAmt(){
		
		return(details.getP()*details.getT()*details.getR()/100.0f);
	}

}
