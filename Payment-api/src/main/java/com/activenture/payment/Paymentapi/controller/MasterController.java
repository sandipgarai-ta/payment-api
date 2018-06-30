package com.activenture.payment.Paymentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.payment.Paymentapi.dao.ItemDao;
import com.activenture.payment.Paymentapi.entity.Item;
import com.activenture.payment.Paymentapi.response.MasterResponse;

@RestController
@RequestMapping("/master")
public class MasterController {
	
	@Autowired
	ItemDao itemDao;
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
		return masterResponse;
	}
	
	
	@RequestMapping("/master/saveitem")
	public Item saveItem(@RequestBody Item item) {
		return itemDao.saveItem(item);
	}

}
