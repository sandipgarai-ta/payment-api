package com.activenture.payment.Paymentapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.payment.Paymentapi.entity.Billing;

@RestController
@RequestMapping("/billing")
public class BillingController {

	@PostMapping("/save")
	public String saveBilling(@RequestBody Billing billing){
		return "Hello Billing";
	}
}
