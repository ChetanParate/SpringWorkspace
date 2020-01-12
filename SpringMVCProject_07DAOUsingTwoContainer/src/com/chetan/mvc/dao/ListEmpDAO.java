package com.chetan.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.chetan.mvc.bo.EmpBO;

public class ListEmpDAO {
	
	private JdbcTemplate jdbcTemplate;

	private static final String GET_ALLEMP_QRY = "SELECT * FROM emp";
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<EmpBO> retriveEmps(){
		
		List<EmpBO> ebo = jdbcTemplate.query(GET_ALLEMP_QRY, new MyRowMapper());	
		return ebo;
	}
	private class MyRowMapper implements RowMapper<EmpBO>{

		@Override
		public EmpBO mapRow(ResultSet rs, int position) throws SQLException {
			
			EmpBO empBo = new EmpBO();
			empBo.setEno(rs.getInt(1));
			empBo.setEname(rs.getString(2));
			empBo.setSalary(rs.getInt(3));
			empBo.setCity(rs.getString(4));
			
			return empBo;
		}
	}
}
