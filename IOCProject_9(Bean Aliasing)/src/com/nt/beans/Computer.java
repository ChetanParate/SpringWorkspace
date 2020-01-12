package com.nt.beans;

import java.util.List;

public class Computer {
	private List<String> pc;

	public void setPc(List<String> pc) {
		this.pc = pc;
	}

	@Override
	public String toString() {
		return "Computer [pc=" + pc + "]";
	}
	

}
