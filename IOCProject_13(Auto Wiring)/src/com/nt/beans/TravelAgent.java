package com.nt.beans;

public class TravelAgent {
	
	private TourPlan tp;
	
	public TravelAgent() {	
		System.out.println("TravelAgent :0 param constructro");
	}
	
	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent :1 param constructro");
		this.tp = tp;
	}

	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent :setXxx(-) Method");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + "]";
	}
	
	

}
