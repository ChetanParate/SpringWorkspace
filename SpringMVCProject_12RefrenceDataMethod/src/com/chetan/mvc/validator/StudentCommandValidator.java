package com.chetan.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.chetan.mvc.command.RegistrationCommand;

public class StudentCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(RegistrationCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		
	RegistrationCommand regCommand=(RegistrationCommand)command;
		
		//Form validation logic
		if(regCommand.getSno()<=0){
			errors.rejectValue("no","sno.invalid");
		}
		if(regCommand.getName()==null || regCommand.getName().equals("")){
			errors.rejectValue("name","name.invalid");
		}
		
	}

}
