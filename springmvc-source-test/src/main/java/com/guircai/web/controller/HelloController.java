package com.guircai.web.controller;

import com.guircai.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Guircai
 **/
//@Controller；如果有父子容器 @Component，默认是在父容器中，还找不到
//@Component+@RequestMapping
//@RestController
@Controller
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
	 * @return		请求数据到自定义Object属性的映射需要用到
	 * 					（WebDataBinder【数据类型转换，绑定错误处理】）Factory
	 */
	@GetMapping("/hello") // 所有的xxxMapping都是RequestMapping
	public String SayHello(String name, // 可以从请求参数中得到
						   @RequestParam("user")String user, // 可以从请求参数中得到
						   HttpSession session, HttpServletRequest request,
						   @RequestHeader("User-Agent")String ua) { // 原生的session对象
		// @RequestHeader("User-Agent") String ua 获取指定请求头的值
		String header = request.getHeader("User-Agent");
		// 方法的签名，到底能写哪些
		String msg = service.SayHello(user+"MVC"+name);
		session.setAttribute("msg", "处理成功");
		// SpringMVC的目标方法能写哪些返回值
		return "index.jsp";
	}
}
