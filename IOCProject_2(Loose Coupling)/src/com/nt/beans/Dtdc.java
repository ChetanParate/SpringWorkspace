package com.nt.beans;

public class Dtdc implements Courier {
	
	public String deliver(int orderid) {
		return "DTDC is ready to deliver products Of "+orderid;
	}

}
