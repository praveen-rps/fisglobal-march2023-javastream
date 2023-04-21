package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/display")
	public String display() {
		return "user details are displayed";
		
	}
	@GetMapping("/balance")
	public String getBalance() {
		return "user balance is displayed";
		
	}
	@GetMapping("/contact")
	public String contact() {
		return "bank contact details are displayed...";
		
	}
	@GetMapping("/delete")
	public String delete() {
		return "user account is deleted...";
		
	}

}
