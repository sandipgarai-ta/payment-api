package com.activenture.payment.Paymentapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.payment.Paymentapi.entity.User;
import com.activenture.payment.Paymentapi.repository.UserRepository;

@Service
public class UserDao {
	
	@Autowired
	UserRepository userRepo;
	
	//TO SAVE A USER
	public User saveUser(User user){
		return userRepo.save(user); 
	}
	
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}

}
