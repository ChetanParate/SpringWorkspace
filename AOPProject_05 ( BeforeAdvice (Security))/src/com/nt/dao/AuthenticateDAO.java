package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.aspects.UserDetails;

public class AuthenticateDAO {
	private static final String AUTH_QRY = "select count(*) from userlist where uname =? and pwd =?";
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean authenticate(UserDetails details){
		@SuppressWarnings("deprecation")
		int count =jdbcTemplate.queryForInt(AUTH_QRY,details.getUser(),details.getPwd());
		if(count == 0)
			return false;
		else
			return true;
	}
	
}
