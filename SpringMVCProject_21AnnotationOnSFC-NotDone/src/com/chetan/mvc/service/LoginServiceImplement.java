package com.chetan.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetan.mvc.bo.UserBO;
import com.chetan.mvc.dao.LoginDAO;
import com.chetan.mvc.dto.UserDTO;

@Service("loginService")
public class LoginServiceImplement implements LoginService {

	@Autowired
	public LoginDAO dao;
	
	@Override
	public String authentication(UserDTO uDto) {
		
		UserBO uBo = new UserBO();
		uBo.setUser(uDto.getUser());
		uBo.setPassword(uDto.getPassword());
		
		int cnt = dao.validate(uBo);
		
		if(cnt ==0)
			return "Invalid User ID and Password.";
		else
			return "valid User ID and Password.";
	}

}
