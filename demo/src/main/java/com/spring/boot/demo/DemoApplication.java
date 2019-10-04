package com.spring.boot.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.controllers.BookController;

@SpringBootApplication
@RestController
public class DemoApplication {
	
 @RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World from Tomcat";
	   }

	public static void main(String[] args) {
		SpringApplication.run(BookController.class, args);
	}
	

}
