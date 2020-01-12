package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Faculty;
import com.nt.beans.Machine;
import com.nt.beans.Marks;
import com.nt.beans.Student;

@SuppressWarnings("deprecation")
public class CICLient {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		Student studBean = factory.getBean("st", Student.class);
		System.out.println(studBean);
		System.out.println("=============================================");
		
		Marks markBean = factory.getBean("mk", Marks.class);
		System.out.println(markBean);
		System.out.println("=============================================");
		
		Faculty facBean = factory.getBean("fty", Faculty.class);
		System.out.println(facBean);
		System.out.println("=============================================");
		
		Machine machBean = factory.getBean("mn", Machine.class);
		System.out.println(machBean);
		
	}

}
