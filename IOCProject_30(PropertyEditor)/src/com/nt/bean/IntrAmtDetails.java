package com.nt.bean;

public class IntrAmtDetails {
	private float p;
	private float t;
	private float r;
	//3 param constructor
	public IntrAmtDetails(float p, float t, float r) {
		System.out.println("IntrAmtDetails : 3-param Constructor");
		this.p = p;
		this.t = t;
		this.r = r;
	}
	//setter-getter
	public float getP() {
		return p;
	}

	public void setP(float p) {
		this.p = p;
	}

	public float getT() {
		return t;
	}

	public void setT(float t) {
		this.t = t;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}
	

}
