package com.nt.aspects;

import com.nt.dao.AuthenticateDAO;

public class AuthenticateManager {
	
	private AuthenticateDAO dao;
	
	private static final ThreadLocal <UserDetails> threadLocal = new ThreadLocal<UserDetails>();
	
	public void setDao(AuthenticateDAO dao){
		this.dao = dao;
	}
	
	public void singIn(String user, String pwd) {
		UserDetails details = new UserDetails(user, pwd);
		threadLocal.set(details);
	}
	
	public void signOut(){
		
		threadLocal.remove();
	}
	
	public boolean isAuthonticated(){
		
		UserDetails details = threadLocal.get();
		boolean flag = dao.authenticate(details);
		return flag;
	}

}
