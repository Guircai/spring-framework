package com.guircai.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author Guircai
 **/
@Component
public class MyInstantiationAwareBean implements InstantiationAwareBeanPostProcessor {

	public MyInstantiationAwareBean() {
		System.out.println("MyInstantiationAwareBean...");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBean...postProcessBeforeInstantiation...");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBean...postProcessAfterInstantiation...");
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBean...postProcessProperties...");
		return null;
	}

//	@Override
//	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//		System.out.println("MyInstantiationAwareBean...postProcessPropertyValues...");
//		return pvs;
//	}
}
