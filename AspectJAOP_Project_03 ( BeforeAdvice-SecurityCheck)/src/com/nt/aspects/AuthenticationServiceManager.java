package com.nt.aspects;

import com.nt.dao.AuthenticationDAO;

public class AuthenticationServiceManager {
	private AuthenticationDAO dao;
	private static final ThreadLocal<UserDetails> threadLocal = new ThreadLocal<UserDetails>();
	
	public void setDao(AuthenticationDAO dao) {
		this.dao = dao;
	}
	
	public void singIn(String user,String pwd) {
		//place login details inThreadLocal object
		UserDetails details = new UserDetails(user,pwd);
		threadLocal .set(details);		
	}
	
	public void signOut() {
		threadLocal.remove();
		
	}
	
	public boolean isAuthenticated() {
		UserDetails details = threadLocal.get();
		boolean flag = dao.authenticate(details);
		return flag;
		
	}
}
