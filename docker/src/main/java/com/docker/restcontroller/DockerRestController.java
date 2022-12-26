package com.docker.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController{

    @GetMapping("/greet")
	public String greet(){
		System.out.println("Hello-World !!");
		return "Welcome to the Docker Learning Course !!";
	}
}