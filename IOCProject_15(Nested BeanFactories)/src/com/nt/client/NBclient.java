package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.BankLoanApprover;

@SuppressWarnings("deprecation")
public class NBclient {

	public static void main(String[] args) {
		
		BeanFactory pfactory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/loan-beans.xml"));
		BeanFactory cfactory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/approver-beans.xml"),pfactory);
		
		BankLoanApprover bla = cfactory.getBean("bla", BankLoanApprover.class);
		System.out.println(bla);
		String msg =bla.approveLoan();
		System.out.println(msg);
	}

}
