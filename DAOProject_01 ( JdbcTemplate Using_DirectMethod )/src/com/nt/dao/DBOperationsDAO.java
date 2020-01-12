package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationsDAO {

	private JdbcTemplate jdbcTemplate;
	
	private static final String EMP_GET_SAL_QRY = "SELECT salary FROM emp_info WHERE empno =?";
	private static final String EMP_UPDATE_SAL_QRY = "UPDATE emp_info SET salary =? WHERE empno =?";
	private static final String EMP_DELETE_QRY = "DELETE FROM emp_info WHERE empno = ?";
	private static final String EMP_INSERT_QRY = "INSERT INTO emp_info(empno,ename,job,salary) values(?,?,?,?)";
	private static final String EMP_GETDETAIL_QRY = "SELECT empno,ename,job,salary FROM emp_info WHERE empno = ?";
	private static final String EMP_GETALL_QRY = "SELECT * FROM emp_info";

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getSalary(int eno){
		@SuppressWarnings("deprecation")
		int sal = jdbcTemplate.queryForInt(EMP_GET_SAL_QRY,+eno);
		return sal;
	}
	
	public int updateSalary(int eno, int newSal){
		int update = jdbcTemplate.update(EMP_UPDATE_SAL_QRY,+ newSal,eno);
		return update;
	}
	
	public int deleteRecord(int eno){
		int delete = jdbcTemplate.update(EMP_DELETE_QRY,eno);
		return delete;
	}
	
	public int insertRecord(int eno ,String name, String desg, int sal){
		int insert = jdbcTemplate.update(EMP_INSERT_QRY,eno,name,desg,sal);
		return insert;
	}
	public Map<String,Object> getEmpRecords(int eno){
		Map<String, Object> record = jdbcTemplate.queryForMap(EMP_GETDETAIL_QRY,eno);
		return record;
	}
	
	public List<Map<String, Object>> getAllRecords(){
		List<Map<String, Object>> allRecord = jdbcTemplate.queryForList(EMP_GETALL_QRY);
		return allRecord;
	}
	
}
