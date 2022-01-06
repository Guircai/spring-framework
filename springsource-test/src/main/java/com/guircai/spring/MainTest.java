package com.guircai.spring;

import com.guircai.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description：
 * Author: Guir
 * Create: 2022/1/6 14:53
 **/

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}
