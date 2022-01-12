package com.guircai.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Description：
 * Author: Guir
 * Create: 2022/1/6 21:28
 **/

// 容器就应该给Cat再创建一个对象
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Component
public class Cat implements InitializingBean {
	public String name;

	public Cat(){
		System.out.println("Cat被创建了...");
	}

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}") // 自动赋值功能
	public void setName(String name) {
		System.out.println("cat...setName正在赋值调用...");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Cat...afterPropertiesSet...");
	}
}
