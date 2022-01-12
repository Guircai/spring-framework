package com.guircai.spring;

import com.guircai.spring.bean.Cat;
import com.guircai.spring.bean.Person;
import com.guircai.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description：
 * Author: Guir
 * Create: 2022/1/6 14:53
 **/

public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MainConfig.class);

//		Person bean = applicationContext.getBean(Person.class);
//		System.out.println(bean);

//		Person bean1 = applicationContext1.getBean(Person.class);
//		System.out.println(bean1);

//		Cat cat = applicationContext1.getBean(Cat.class);
//		System.out.println(cat);

//		String[] names = applicationContext1.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}

//		Cat cat1 = applicationContext1.getBean(Cat.class);
//		Cat cat2 = applicationContext1.getBean(Cat.class);
//		System.out.println(cat1 == cat2);

//		Person person1 = applicationContext1.getBean(Person.class);
//		Cat cat3 = person1.getCat();
//
//		Person person2 = applicationContext1.getBean(Person.class);
//		Cat cat4 = person2.getCat();
//
//		System.out.println(cat3 == cat4);

		Person bean = applicationContext1.getBean(Person.class);
		ApplicationContext context = bean.getContext();
		System.out.println(applicationContext1 == context);
	}
}
