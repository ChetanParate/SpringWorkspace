package com.chetan.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.chetan.mvc.bo.SearchBO;
import com.chetan.mvc.bo.SearchResultBO;
import com.chetan.mvc.dao.EmpSearchDAOImplement;
import com.chetan.mvc.dto.SearchDTO;
import com.chetan.mvc.dto.SearchResultDTO;

public class EmpSearchServiceImplement implements EmpSearchService {

	private EmpSearchDAOImplement dao; 
	
	public void setDao(EmpSearchDAOImplement dao) {
		this.dao = dao;
	}
	@Override
	public List<SearchResultDTO> process(SearchDTO searchDto) {
		
		//converting DTO To BO object
		SearchBO searchBo = new SearchBO();
		searchBo.setEmployeeNumber(searchDto.getEmployeeNumber());
		searchBo.setEmployeeName(searchDto.getEmployeeName());
		searchBo.setDeptNumber(searchDto.getDeptNumber());
		searchBo.setCity(searchDto.getCity());
		
		List<SearchResultBO> searchResultBoList = dao.search(searchBo);
		
		//converting RBOList to DTOList
		List<SearchResultDTO> searchResultDtoList = new ArrayList<SearchResultDTO>();
		
		if(searchResultBoList.size()>0){
			for(SearchResultBO srbo:searchResultBoList){
				
				SearchResultDTO searchResultDto = new SearchResultDTO();
				searchResultDto.setEmployeeNumber(srbo.getEmployeeNumber());
				searchResultDto.setEmployeeName(srbo.getEmployeeName());
				searchResultDto.setEmployeeSalary(srbo.getEmployeeSalary());
				searchResultDto.setDeptNumber(srbo.getDeptNumber());
				searchResultDto.setCity(srbo.getCity());
				searchResultDtoList.add(searchResultDto);
				
			}
		}
		return searchResultDtoList;
	}

}
