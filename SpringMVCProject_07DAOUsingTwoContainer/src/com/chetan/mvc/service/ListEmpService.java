package com.chetan.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.chetan.mvc.bo.EmpBO;
import com.chetan.mvc.dao.ListEmpDAO;
import com.chetan.mvc.dto.EmpDTO;

public class ListEmpService {
	
	private ListEmpDAO dao;

	public void setDao(ListEmpDAO dao) {
		this.dao = dao;
	}
	 public List<EmpDTO> getAllEmps(){
		 
		 
		 List<EmpBO> listEbo = dao.retriveEmps();
		List<EmpDTO> listDto = new ArrayList<EmpDTO>();
		if(listEbo.size()>0){ 
		for( EmpBO empBo:listEbo){
			 EmpDTO empDto = new EmpDTO(empBo.getEno(),empBo.getEname(),empBo.getSalary(),empBo.getCity());
			 listDto.add(empDto);	 
		 }
		} 	
		 return listDto;	
	}

}
