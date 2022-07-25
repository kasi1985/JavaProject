package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class ProjectGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGitApplication.class, args);
	}
	
	@GetMapping("/kasi")
	public String hello() {
		return "Hello..... Kasi!!";
	}
	
	@GetMapping("/prasanna")
	public String helloP() {
		return "Hello..... Prasanna!!";
	}

}
