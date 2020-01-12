package com.nt.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishGenerator;

@SuppressWarnings("deprecation")
public class ClientApp {

	public static void main(String[] args) {
		
		//locate Spring bean cfg file
		FileSystemResource res= new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//activate Bean factory Container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//Get BeanCLass object
		WishGenerator bean =factory.getBean("msg",WishGenerator.class);
		//WishGenerator bean = (WishGenerator)factory.getBean("msg");
		
		//call Bean Method
		String result= bean.generateWishMsg();
		System.out.println(result);
	}

}
