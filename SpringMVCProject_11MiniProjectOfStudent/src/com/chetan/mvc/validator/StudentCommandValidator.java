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
		if(stCommand.getRollno()<=0){
			errors.rejectValue("sname","rollno.required");
		}
		if(stCommand.getSname()==null || stCommand.getSname().equals("")){
			errors.rejectValue("sname","sname.required");
		}
		
		if(stCommand.getSadd()==null || stCommand.getSadd().equals("")){
			errors.rejectValue("sadd","sadd.required");
		}
		
		if(stCommand.getMarks()<=0){
			errors.rejectValue("marks","marks.required");
		}
		if(stCommand.getPer()<=0){
			errors.rejectValue("per","per.required");
		}
		else {
			if(stCommand.getSadd().length()<3){
				errors.rejectValue("sadd","sadd.minlength");
			}
			if(stCommand.getPer()>100){
					errors.rejectValue("per","per.minlength");
			}
			
		}
		
	}

}
