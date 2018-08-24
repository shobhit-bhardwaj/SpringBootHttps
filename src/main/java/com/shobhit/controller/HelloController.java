package com.shobhit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello From Spring Boot HTTPS";
	}
}