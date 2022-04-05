package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloImrna {
	
	@RequestMapping("/hello/imran")
	public String hello() {
		return "Hello Imran, Welcome to my docker hub";
	}

}
