package com.guircai.web.controller;

import com.guircai.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guircai
 **/
//@Controller；如果有父子容器 @Component，默认是在父容器中，还找不到
//@Component+@RequestMapping
@RestController
public class HelloController {

	public HelloController() {
		System.out.println("HelloController...");
	}

	@Autowired
	HelloService service;

	/**
	 * RequestMappingHandlerAdapter：怎么反射执行到这个方法。确定每一个参数的值，以及处理返回值等等
	 *
	 * @param name
	 * @return
	 */
	@GetMapping("/hello") // 所有的xxxMapping都是RequestMapping
	public String SayHello(String name) {
		String msg = service.SayHello("MVC");
		return msg;
	}
}
