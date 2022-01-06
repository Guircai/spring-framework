package com.guircai.spring.config;

import com.guircai.spring.bean.Cat;
import com.guircai.spring.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Description：这是一个配置类
 * Author: Guir
 * Create: 2022/1/6 15:29
 **/

/**
 * 		BeanDefinitionRegistry：Bean定义信息注册中心：图纸中心
 * 				它里面都是BeanDefinition
 */
//@Import({Person.class, MainConfig.MyImportRegistrar.class})
@ComponentScan("com.guircai.spring.bean")
@Configuration
public class MainConfig {

//	@Bean
	public Person getPerson() {
		Person person = new Person();
		person.setMame("李四");
		return person;
	}

	static class MyImportRegistrar 	implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
			// BeanDefinition
			RootBeanDefinition catDefinition = new RootBeanDefinition();
			catDefinition.setBeanClass(Cat.class);
			// Spring 这个实例的类型，名字
			registry.registerBeanDefinition("tomCat", catDefinition);
		}
	}
}

