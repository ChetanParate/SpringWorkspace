package com.nt.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@SuppressWarnings("rawtypes")
public class IOCPMListener implements ApplicationListener{
	 private long end;
	 private long start;

	@Override
	public void onApplicationEvent(ApplicationEvent ae) {
		
		if(ae.toString().indexOf("Refreshed")!=-1){
			start=System.currentTimeMillis();
		}
		else{
			end=System.currentTimeMillis();
			System.out.println(" Cotainer Active time"+(end-start)+"  ms");
		}
	}//onApplicationEvent
}//class

