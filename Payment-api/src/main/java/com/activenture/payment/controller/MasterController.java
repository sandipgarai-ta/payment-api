package com.activenture.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/master")
@RestController
public class MasterController {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Payment API";
	}
}
