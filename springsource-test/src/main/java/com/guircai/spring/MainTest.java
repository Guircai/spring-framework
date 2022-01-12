package com.guircai.spring;

import com.guircai.spring.bean.Cat;
import com.guircai.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guircai
 **/

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}

	public static void test01(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Cat cat = context.getBean(Cat.class);
		System.out.println(cat);
	}
}
