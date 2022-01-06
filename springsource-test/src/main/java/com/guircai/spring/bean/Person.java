package com.guircai.spring.bean;

/**
 * Description：
 * Author: Guir
 * Create: 2022/1/6 14:54
 **/

public class Person {
	String mame;

	public void setMame(String mame) {
		this.mame = mame;
	}

	public String getMame() {
		return mame;
	}

	@Override
	public String toString() {
		return "Person{" +
				"mame='" + mame + '\'' +
				'}';
	}
}
