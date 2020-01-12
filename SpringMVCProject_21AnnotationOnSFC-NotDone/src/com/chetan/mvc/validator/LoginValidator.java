package com.chetan.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.chetan.mvc.command.UserCommand;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz == UserCommand.class;
	}

	@Override
	public void validate(Object command, Errors errors) {
		
		UserCommand stCommand=(UserCommand)command;
		//Form validation logic
		
		if(stCommand.getUser()==null || stCommand.getUser().equals("")){
			errors.rejectValue("user","user.required");
		}
		
		if(stCommand.getPassword()==null || stCommand.getPassword().equals("")){
			errors.rejectValue("password","password.required");
		}
		
	}

}
