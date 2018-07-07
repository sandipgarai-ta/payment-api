package com.activenture.payment.Paymentapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.payment.Paymentapi.dao.BillingDao;
import com.activenture.payment.Paymentapi.entity.Billing;

@RestController
@RequestMapping("/billing")
public class BillingController {
	
	@Autowired
	BillingDao billingDao;
	

	@PostMapping("/save")
	public Billing saveBilling(@RequestBody Billing billing){
		return billingDao.saveBilling(billing);
	}
}
