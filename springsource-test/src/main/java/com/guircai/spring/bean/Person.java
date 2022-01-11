package com.guircai.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * Aware接口：帮我们装配Spring底层的一些组件
 * 1、Bean的功能增强全部都是有 BeanPostProcessor+InitializingBean	（合起来完成的）
 * 2、骚操作就是 BeanPostProcessor+InitializingBean
 *
 * @author Guircai
 **/

@Component
public class Person implements ApplicationContextAware, MessageSourceAware {

//	@Autowired
	ApplicationContext context; // 可以要到ioc容器
	MessageSource messageSource;

	public String mame;

//	@Autowired 依赖的组件是多实例就不能Autowired
	public Cat cat;

	public Person() {
		System.out.println("Person创建了...");
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setMame(String mame) {
		this.mame = mame;
	}

	public String getMame() {
		return mame;
	}

	@Lookup // 去容器中找 @Bean的这种方式注册的Person @Lookup不生效
	public Cat getCat() {
		return cat;
	}

	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person{" +
				"mame='" + mame + '\'' +
				", cat=" + cat +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
