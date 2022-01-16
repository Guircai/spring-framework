package com.guircai.web.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Guircai
 **/
public class MyExceptionHandler {

	@ResponseBody
	@ExceptionHandler
	// @GuircaiExceptionHandler
	public String handlerZeroException() {
		// 异常处理器功能怎么增强出来的【参数解析器，返回值处理器】
		return "Error";
	}
}
