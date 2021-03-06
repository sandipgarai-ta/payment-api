package com.activenture.payment.Paymentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.payment.Paymentapi.dao.ItemDao;
import com.activenture.payment.Paymentapi.dao.StateDao;
import com.activenture.payment.Paymentapi.dao.UserDao;
import com.activenture.payment.Paymentapi.dao.UserTypeDao;
import com.activenture.payment.Paymentapi.entity.Item;
import com.activenture.payment.Paymentapi.entity.State;
import com.activenture.payment.Paymentapi.entity.User;
import com.activenture.payment.Paymentapi.entity.UserType;
import com.activenture.payment.Paymentapi.response.MasterResponse;

@RestController
@RequestMapping("/master")
public class MasterController {
	
	@Autowired
	ItemDao itemDao;
	
	@Autowired
	StateDao stateDao;
	
	MasterResponse masterResponse;
	
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@RequestMapping("/master/item")
	public List<Item> getAllItem() {
		return itemDao.getAllItem();
	}
	
	
	@RequestMapping("/fetchall")
	public MasterResponse getAllMasterData() {
		masterResponse=new MasterResponse();
		masterResponse.setItemList(itemDao.getAllItem());
		masterResponse.setStateList(stateDao.getAllState());
		return masterResponse;
	}
	
	
	@RequestMapping("/saveitem")
	public Item saveItem(@RequestBody Item item) {
		return itemDao.saveItem(item);
	}
	
	@RequestMapping("/save-state")
	public State saveState(@RequestBody State state) {
		return stateDao.saveState(state);
	}
	
	// ====================================================
	@Autowired
	UserTypeDao userTypeDao;
	
	@PostMapping("/save-usertype")
	public UserType saveUserType(@RequestBody UserType userType){
		System.out.println(userType);
		return userTypeDao.saveUserInfo(userType);
	}
	
	
	@Autowired
	UserDao userDao;
	
	
	@PostMapping("/save-user")
	public User saveUser(@RequestBody User user) {
		return userDao.saveUser(user);
	}
	
	@GetMapping("/getusers")
	public List<User> getAllUser(){
		return userDao.getAllUser();
	}

}
