package com.nt.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BOPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
		
		System.out.println("postProcessBeforeInitialization(-,-)");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
		
		System.out.println("postProcessAfterInitialization(-,-)");
		return bean;
	}

}