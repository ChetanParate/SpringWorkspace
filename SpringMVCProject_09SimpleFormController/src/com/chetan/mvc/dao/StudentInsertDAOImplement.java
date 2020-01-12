package com.chetan.mvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.chetan.mvc.bo.StudentBO;

public class StudentInsertDAOImplement implements StudentInsertDAO {

	JdbcTemplate jdbcTemplate;
	private static final String INSERT_QRY = "INSERT INTO Stud_info VALUES(?,?,?,?)";
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(StudentBO sBo) {
		
		int result =jdbcTemplate.update(INSERT_QRY,sBo.getSno(),sBo.getSname(),sBo.getSadd(),sBo.getSchool());
		return result;
	}

}
