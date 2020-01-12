package com.chetan.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.chetan.mvc.bo.StudentBO;

public class StudentDAOImplement implements StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	private static final String SELECT_ALLSTUDNET_QRY = "SELECT ROLLNO,SNAME,SADD,MARKS,PER FROM STUDENT";
	private static final String GET_STUDNET_BY_ROLLNO_QRY = "SELECT ROLLNO,SNAME,SADD,MARKS,PER FROM STUDENT WHERE ROLLNO=?";
	private static final String UPDATE_STUDNET_BY_ROLLNO_QRY = "UPDATE STUDENT SET SNAME=?, SADD=?, MARKS=?, PER=? WHERE ROLLNO=?";
	private static final String INSERT_STUDNET_QRY = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<StudentBO> getAllStudent() {
		List<StudentBO> listBo = jdbcTemplate.query(SELECT_ALLSTUDNET_QRY, new MyRowMapper());
		return listBo;
	}
	
	private class MyRowMapper implements RowMapper<StudentBO>{

		@Override
		public StudentBO mapRow(ResultSet resultSet, int position) throws SQLException {
			
			StudentBO stBo = new StudentBO();
			
			stBo.setRollno(resultSet.getInt(1));
			stBo.setSname(resultSet.getString(2));
			stBo.setSadd(resultSet.getString(3));
			stBo.setMarks(resultSet.getInt(4));
			stBo.setPer(resultSet.getInt(5));
			
			return stBo;
		}
		
	}

	@Override
	public int insert(StudentBO sbo) {
		int cnt = jdbcTemplate.update(INSERT_STUDNET_QRY, sbo.getRollno(),sbo.getSname(),sbo.getSadd(),sbo.getMarks(),sbo.getPer());
		return cnt;
	}

	@Override
	public StudentBO getStudent(int rollno) {
		
		StudentBO sbo = jdbcTemplate.queryForObject(GET_STUDNET_BY_ROLLNO_QRY, new MyRowMapper(), rollno);
		return sbo;
	}

	@Override
	public int update(StudentBO sbo) {
		
		int cnt = jdbcTemplate.update(UPDATE_STUDNET_BY_ROLLNO_QRY,sbo.getSname(),sbo.getSadd(),sbo.getMarks(),sbo.getPer(),sbo.getRollno());
		return cnt;
	}

}
