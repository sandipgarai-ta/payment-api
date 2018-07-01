package com.activenture.payment.Paymentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activenture.payment.Paymentapi.entity.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
