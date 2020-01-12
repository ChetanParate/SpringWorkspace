package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class ListEmpDAOImpl implements ListEmpDAO {

	private static final String GET_EMP_DETAIL_BY_NO="Select empno,ename,job,salary from emp_info where empno=?";
	private static final String GET_EMP_DETAIL_BY_DESG="Select empno,ename,job,salary from emp_info where job=?";
	
	JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public EmployeeBO findEmployeeByNo(int no) {
		
		EmployeeBO emp=jdbcTemplate.queryForObject(GET_EMP_DETAIL_BY_NO,new Object[]{no},new EmpRowMapper());
		  return emp;	 
	}
	//Inner class
		private class EmpRowMapper implements RowMapper<EmployeeBO>
		{

			@Override
			public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
	            //copy ResultSet record to EmployeeBO class obj
				
				EmployeeBO emp= new EmployeeBO();
					emp.setEno(rs.getInt(1));
					emp.seteName(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getInt(4));
				return emp;
			}//mapRow
		}//inner class

	@Override
	public List<EmployeeBO> findEmployeesByDesg(String desg) {
		
		List<EmployeeBO> emplist=jdbcTemplate.query(GET_EMP_DETAIL_BY_DESG,new Object[]{desg},new ResultSetExtractor<List<EmployeeBO>>(){

			@Override
			public List<EmployeeBO> extractData(ResultSet rs)throws SQLException,DataAccessException {
			System.out.println("extract Data");			
			List<EmployeeBO> list=new ArrayList<EmployeeBO>();
			while(rs.next()){
				EmployeeBO ebo=new EmployeeBO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				list.add(ebo);
				}//while
			return list;
				}//extractData(-)
				}//anymous inner class
			);//method call
		return emplist;
		}//method
	}//class
