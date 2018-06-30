package com.activenture.payment.Paymentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activenture.payment.Paymentapi.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
