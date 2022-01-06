package com.guircai.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Description：
 * Author: Guir
 * Create: 2022/1/6 21:28
 **/

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// 容器就应该给Cat再创建一个对象
//@Scope(value = "prototype")
@Component
public class Cat {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}
