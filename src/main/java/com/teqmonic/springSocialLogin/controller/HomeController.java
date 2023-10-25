package com.teqmonic.springSocialLogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcome User!</h1>";
	}
	
	@GetMapping("/secure")
	public String secure() {
		return "<h1>Welcome to the secured page</h1>";
	}

}
