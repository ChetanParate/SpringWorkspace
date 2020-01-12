package com.chetan.mvc.service;

import java.util.List;

import com.chetan.mvc.dto.SearchDTO;
import com.chetan.mvc.dto.SearchResultDTO;

public interface EmpSearchService {
	
	public List<SearchResultDTO> process(SearchDTO searchDto);

}
