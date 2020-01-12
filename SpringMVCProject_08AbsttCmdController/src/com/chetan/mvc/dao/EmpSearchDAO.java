package com.chetan.mvc.dao;

import java.util.List;

import com.chetan.mvc.bo.SearchBO;
import com.chetan.mvc.bo.SearchResultBO;

public interface EmpSearchDAO {

	public List<SearchResultBO> search(SearchBO searchBo);
}
