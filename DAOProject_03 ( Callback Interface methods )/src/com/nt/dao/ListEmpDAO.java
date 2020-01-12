package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface ListEmpDAO {
	
	public EmployeeBO findEmployeeByNo(int no);
	public List<EmployeeBO> findEmployeesByDesg(String job);

}
