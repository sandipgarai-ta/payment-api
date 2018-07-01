package com.activenture.payment.Paymentapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.payment.Paymentapi.entity.Billing;
import com.activenture.payment.Paymentapi.repository.BillingRepository;

@Service
public class BillingDao {
	
	@Autowired
	BillingRepository billingRepo;
	
	// TO SAVE A BILLING
	public Billing saveBilling(Billing billing){
		return billingRepo.save(billing);
	}
	
	
	// TO GET ALL BILLINGS
	public List<Billing> getAllBilling(){
		return billingRepo.findAll();
	}

}
