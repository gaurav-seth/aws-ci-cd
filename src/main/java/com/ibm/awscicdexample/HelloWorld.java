package com.ibm.awscicdexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World"; 
	}
}
