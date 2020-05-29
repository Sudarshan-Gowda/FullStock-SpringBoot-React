package com.star.sud.restservices.helloworld.contoller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.star.sud.restservices.helloworld.bean.HelloWorld;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("Hello World Bean");
	}

	@GetMapping("/hello-world-bean/path-variable/{user}")
	public HelloWorld helloWorldBeanPathVariable(@PathVariable String user) {
		return new HelloWorld(String.format("Welcome to Spring Boot %s", user));
	}

}
