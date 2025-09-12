package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
	@GetMapping("/greet")
	public String greet() {
		return "Welcome to java world";
	}

	@GetMapping("/a")
	public String hello(){
        return "This is my first git repository";
	}	
	
	@GetMapping("/b")
	public String sample() {
		return "This is a sample end point";
	}
	
	@GetMapping("/c")
	public String getDetails() {
		return "Student details are up to the mark";
	}
	
	@GetMapping("/d")
	public String xyz() {
		return "Xyz method invoked";
	}
	
}
