package com.chetan.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.chetan.mvc.bo.SearchBO;
import com.chetan.mvc.bo.SearchResultBO;

public class EmpSearchDAOImplement implements EmpSearchDAO {

	private JdbcTemplate jdbcTemplate;
	
	private static final String EMP_SEARCH_QRY = "SELECT * FROM employee_info "
				+ "WHERE (employeenumber IS NOT NULL AND employeenumber = ?)"
				+ "OR (employeename IS NOT NULL AND employeename LIKE ?) "
				+ "OR (deptnumber IS NOT NULL AND deptnumber = ?) "
				+ "OR (city IS NOT NULL AND city LIKE ?)";
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<SearchResultBO> search(SearchBO searchBo) {
		
		List<SearchResultBO> srboList = jdbcTemplate.query(EMP_SEARCH_QRY, new EmpRowMapper(),searchBo.getEmployeeNumber(),searchBo.getEmployeeName(),searchBo.getDeptNumber(),searchBo.getCity());
		return srboList;
	}
	
	private class EmpRowMapper implements RowMapper<SearchResultBO>{

		@Override
		public SearchResultBO mapRow(ResultSet resultSet, int position) throws SQLException {
			
			SearchResultBO searchResultBo = new SearchResultBO();
			searchResultBo.setEmployeeNumber(resultSet.getInt(1));
			searchResultBo.setEmployeeName(resultSet.getString(2));
			searchResultBo.setEmployeeSalary(resultSet.getInt(3));
			searchResultBo.setDeptNumber(resultSet.getInt(4));
			searchResultBo.setCity(resultSet.getString(5));
			
			return searchResultBo ;
		}
		
	}

}
