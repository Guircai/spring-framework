package com.guircai.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guircai
 **/
@RestController
public class HelloController {

	@GetMapping("/hello666")
	public String Hello() {
		return "66666666666666~~~~~~~~~~";
	}
}
