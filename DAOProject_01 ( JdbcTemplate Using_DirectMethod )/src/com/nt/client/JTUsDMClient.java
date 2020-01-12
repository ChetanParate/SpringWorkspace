package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dao.DBOperations;
import com.nt.service.DBOperationsService;

public class JTUsDMClient {
	public static void main(String[] args) {
		ApplicationContext atx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		DBOperations dbOperationsService = (DBOperationsService)atx.getBean("service");
		
		//System.out.println("'7777' Employee Salary is :"+dbOperationsService.getSal(7777));
		
		//System.out.println("'7777' Employee Detail :"+dbOperationsService.getEmpDetails(7777));
		//System.out.println("'7777' Employee Salary Hike Is :"+dbOperationsService.updateSalary(7777,10));
		System.out.println("All Employee Details :"+dbOperationsService.getAllEmpDetails());
		//System.out.println("Register New Emp "+dbOperationsService.registerEmp(7007,"Jonson", "Engg", 60000));
		//System.out.println("7007 Emp is Fired :"+dbOperationsService.fireEmp(7007));
		
		((FileSystemXmlApplicationContext)atx).close();
		
		
	}

}
