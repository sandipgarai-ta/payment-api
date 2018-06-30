package com.activenture.payment.Paymentapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.payment.Paymentapi.repository.ItemRepository;
import com.activenture.payment.Paymentapi.entity.*;

@Service
public class ItemDao {
	
	@Autowired
	ItemRepository itemRepo;
	
	
	//SAVE an ITEM
	public Item saveItem(Item item) {
		return itemRepo.save(item);
	}
	
	
	// fetch all item
	public List<Item> getAllItem() {
		return itemRepo.findAll();
	}
	
	
	// get an item
	public Item getItem(Long itemId) {
		return itemRepo.getOne(itemId);
	}
	
	
	// delete an item
	public void deleteItemById(Long itemId) {
		itemRepo.deleteById(itemId);
	}

}
