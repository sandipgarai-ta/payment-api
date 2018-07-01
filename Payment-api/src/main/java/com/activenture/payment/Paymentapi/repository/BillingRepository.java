package com.activenture.payment.Paymentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activenture.payment.Paymentapi.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
