package com.activenture.payment.Paymentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activenture.payment.Paymentapi.entity.OrderInfo;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {

}
