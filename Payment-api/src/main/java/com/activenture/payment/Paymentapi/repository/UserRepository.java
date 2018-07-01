package com.activenture.payment.Paymentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activenture.payment.Paymentapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
