package com.guircai.web.service;

import org.springframework.stereotype.Service;

/**
 * @author Guircai
 **/
@Service
public class HelloService {

	public HelloService() {
		System.out.println("HelloService...");
	}

	public String SayHello(String name) {
		return "Hello," + name;
	}
}
