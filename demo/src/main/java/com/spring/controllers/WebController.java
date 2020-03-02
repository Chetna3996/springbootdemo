package com.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class WebController {

	@GetMapping(value = "/SignUpPage")
	   public String index() {
	      return "SignUpPage.html";
	   }
}
