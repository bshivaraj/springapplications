package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	private String msg="welcome to AWS world!";
	
	@GetMapping("/")
	public String hello() {
		return msg;
	}
	
	
	@GetMapping("hello")
	public String sayHello(@RequestParam String name) {
		if(name==null || name=="") {
			name="Shivaraj";
		}
		return "Hello "+name+" "+msg;
		
	}

}
