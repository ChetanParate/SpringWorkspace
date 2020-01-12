package com.chetan.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.chetan.mvc.command.StudentCommand;

public class StudentCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz == StudentCommand.class;
	}

	@Override
	public void validate(Object command, Errors errors) {
		
		StudentCommand stCommand=(StudentCommand)command;
		//Form validation logic
		
		if(stCommand.getSno()<=0){
			errors.rejectValue("sno","sno.required");
		}
			
		if(stCommand.getSname()==null || stCommand.getSname().equals("")){
			errors.rejectValue("sname","sname.required");
		}
		
		if(stCommand.getSadd()==null || stCommand.getSadd().equals("")){
			errors.rejectValue("sadd","sadd.required");
		}
		
		if(stCommand.getSchool()==null || stCommand.getSchool().equals("")){
			errors.rejectValue("school","school.required");
		}
		
	}

}
