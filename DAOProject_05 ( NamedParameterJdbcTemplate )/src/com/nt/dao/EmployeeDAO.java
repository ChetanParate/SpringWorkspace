package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nt.bo.EmployeeBO;

public class EmployeeDAO {

	
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	private static final String GET_EMP_NAME_QRY = "SELECT ename FROM emp_info WHERE empno=:id";
	private static final String GET_EMP_DETAILS_QRY = "SELECT empno,ename,job,salary FROM emp_info WHERE empno=:id";
	private static final String INSERT_EMP_QRY = "INSERT INTO emp_info(empno,ename,job,salary)values(:no,:name,:desg,:salary)";

	public EmployeeDAO() {

	}
	public void setNpJdbcTemplate(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}
	
	public String findName(int no){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id",no);
		String name = npJdbcTemplate.queryForObject(GET_EMP_NAME_QRY, map, String.class);
		return name;		
	}
	public EmployeeBO findEmpDetails(int no){
		
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("id", no);
		EmployeeBO emp =(EmployeeBO)npJdbcTemplate.queryForObject(GET_EMP_DETAILS_QRY, map,new RowMapper<EmployeeBO>(){
														@Override
														public EmployeeBO mapRow(ResultSet rs,int index)throws SQLException {
														EmployeeBO emp=new EmployeeBO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4));
														return emp;
															}//mapRow(-,-)
														}//anomous inner class
														);//method
		return emp;
	}//method
public int insertRecord(EmployeeBO emp){
	
		int cnt=npJdbcTemplate.update(INSERT_EMP_QRY,new BeanPropertySqlParameterSource(emp));
		return cnt;
		
	}
}
