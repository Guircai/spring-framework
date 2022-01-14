package com.guircai.web.Controller;

import com.guircai.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guircai
 **/
@RestController
public class HelloController {

	@Autowired
	HelloService service;

	@GetMapping("/hello")
	public String SayHello() {
		String msg = service.SayHello("MVC");
		return msg;
	}
}
