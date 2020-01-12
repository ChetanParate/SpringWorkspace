package com.chetan.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chetan.mvc.bo.UserBO;

@Repository
public class LoginDAOImplement implements LoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String AUTH_QRY = "select count(*) from userlist where uname = ? and pwd = ?";
	
	@Override
	public int validate(UserBO uBo) {
		
		@SuppressWarnings("deprecation")
		int cnt = jdbcTemplate.queryForInt(AUTH_QRY,uBo.getUser(),uBo.getPassword());
		return cnt;
	}

}
