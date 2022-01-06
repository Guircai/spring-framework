package com.guircai.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * Description：
 * Author: Guir
 * Create: 2022/1/6 14:54
 **/

@Component
public class Person {
	public String mame;

//	@Autowired 依赖的组件是多实例就不能Autowired
	public Cat cat;

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
}
