package com.nt.PE;

import java.beans.PropertyEditorSupport;

import com.nt.bean.IntrAmtDetails;

public class CustomIntrAmtEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String value) throws IllegalArgumentException {
		System.out.println("CPE:setAsText(-)");
		
		//splitting the given value
		float p = Float.parseFloat(value.substring(0, value.indexOf(",")));
		float t = Float.parseFloat(value.substring(value.indexOf(",")+1, value.lastIndexOf(",")));
		float r = Float.parseFloat(value.substring(value.lastIndexOf(",")+1, value.length()));
		
		//create IntrAmtdetails class Obj
		IntrAmtDetails iac = new IntrAmtDetails(p, t, r);
		
		//sets Value to property
		setValue(iac);
	}
	

	
}
