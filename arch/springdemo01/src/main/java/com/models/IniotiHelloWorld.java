package com.models;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;
public class IniotiHelloWorld implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
	
		System.out.println("After inititalization "+beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before inititalization "+beanName);
		return bean;
	}

}
