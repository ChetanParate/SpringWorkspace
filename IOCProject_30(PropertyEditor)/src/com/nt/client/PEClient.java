package com.nt.client;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.PE.CustomIntrAmtEditor;
import com.nt.bean.IntrAmtCalculator;
import com.nt.bean.IntrAmtDetails;


@SuppressWarnings("deprecation")
public class PEClient {

	public static void main(String[] args) {
		
XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		//register CustomPropertyEditor
		factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar()
		{
			@Override
			public void registerCustomEditors(PropertyEditorRegistry registry) {
		     registry.registerCustomEditor(IntrAmtDetails.class,new CustomIntrAmtEditor());
			}			
		});
		//Get Bean object
		IntrAmtCalculator intrCalculator=(IntrAmtCalculator)factory.getBean("intrCalculator");
		System.out.println(intrCalculator.calcIntrAmt());	
	}//main
}//class

 
