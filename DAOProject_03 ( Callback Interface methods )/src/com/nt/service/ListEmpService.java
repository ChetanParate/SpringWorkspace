package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.dao.ListEmpDAOImpl;
import com.nt.dto.EmployeeDTO;

public class ListEmpService {
	
	public ListEmpService() {
	}

	ListEmpDAOImpl dao;

	public void setDao(ListEmpDAOImpl dao) {
		this.dao = dao;
	}

	public ListEmpService(ListEmpDAOImpl dao) {
		
		this.dao = dao;
	}
	
	@SuppressWarnings("unused")
	public EmployeeDTO  searchEmpByNo(int no){
		EmployeeBO emp=dao.findEmployeeByNo(no);
		
		EmployeeDTO empdto = new EmployeeDTO(emp.getEno(),emp.geteName(),emp.getJob(),emp.getSalary());
		
		if(empdto!=null)
		   return empdto;
		else
			return null;
	}
	
	@SuppressWarnings("unused")
	public List<EmployeeDTO> getEmpsByDesg(String desg){
		List <EmployeeBO> empList=dao.findEmployeesByDesg(desg);
		
		List<EmployeeDTO> listdto=new ArrayList<EmployeeDTO>();
		for(EmployeeBO bo:empList){
			EmployeeDTO dto=new EmployeeDTO(bo.getEno(),bo.geteName(),bo.getJob(),bo.getSalary());
			listdto.add(dto);
		}//for
		if(listdto!=null)
		   return listdto;
		else
			return null;
	}

	

}
