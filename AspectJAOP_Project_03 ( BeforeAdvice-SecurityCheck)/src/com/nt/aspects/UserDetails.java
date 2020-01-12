package com.nt.aspects;

public class UserDetails {

	private String user,pwd;

	public UserDetails() {
		
	}

	public UserDetails(String user, String pwd) {
		
		this.user = user;
		this.pwd = pwd;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
