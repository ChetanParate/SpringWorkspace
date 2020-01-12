package com.nt.aspects;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class DiscountCuponAdvice {

	public void generateCupon(JoinPoint joinPoint, float billAmt) throws Throwable{
		
		System.out.println("Exited from "+joinPoint.getSignature());
		String cuponMsg = null;
		if(billAmt>=50000)
			cuponMsg = "Avilable 30% Discount on next Perchase";
		else if (billAmt>=30000)
			cuponMsg = "Avilable 20% Discount on next Perchase";
		else
			cuponMsg = "Avilable 10% Discount on next Perchase";
			
		//write Cupon msg into the txt File
		
		FileWriter fileWriter = new FileWriter("F:\\Chetan\\Java\\SpringWorkspace\\AOPModule\\AspectJAOP_Project_04 ( AfterAdvice-DiscountCupon)\\cupon.txt");
		fileWriter.write(cuponMsg);
		fileWriter.flush();
		fileWriter.close();
	}
}
