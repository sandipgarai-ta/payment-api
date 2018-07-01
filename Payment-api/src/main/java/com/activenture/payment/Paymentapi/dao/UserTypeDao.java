package com.activenture.payment.Paymentapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.payment.Paymentapi.entity.User;
import com.activenture.payment.Paymentapi.entity.UserType;
import com.activenture.payment.Paymentapi.repository.UserTypeRepository;

@Service
public class UserTypeDao {
	@Autowired
	UserTypeRepository userTypeRepo;
	
	//SAVE USER TYPE
	public UserType saveUserInfo(UserType userType){
		return userTypeRepo.save(userType);
	}
	
	
	public List<UserType> getAllUserType(){
		return userTypeRepo.findAll();
	}
}
