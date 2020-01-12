package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.LoanDAO;

public class LoadService {
	
	private LoanDAO dao;
	
	public void setDao(LoanDAO dao) {
		 this.dao = dao;
	 }
	
	public float calcIntramt(int cno,String cname,float pamt,int rate,int time) {
		
		float intramt =pamt*rate*time/100.0f;
		CustomerBO cbo = new CustomerBO();
		cbo.setPamt(pamt);
		cbo.setCno(cno);
		cbo.setCname(cname);
		cbo.setIntramt(intramt);
		
		dao.insert(cbo);
			return intramt;
	}
		
}
