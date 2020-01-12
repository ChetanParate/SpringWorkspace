package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.College;
import com.nt.beans.EmployeeProfile;
import com.nt.beans.Student;
import com.nt.beans.User;

@SuppressWarnings("deprecation")
public class CIClient {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		Student stud = factory.getBean("st", Student.class);
		System.out.println(stud);
		
		User user = factory.getBean("user",User.class);
		System.out.println(user);
		
		College clg = factory.getBean("clg", College.class);
		System.out.println(clg);
		
		EmployeeProfile emp = factory.getBean("emp", EmployeeProfile.class);
		System.out.println(emp);

	}

}
