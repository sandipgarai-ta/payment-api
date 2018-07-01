package com.activenture.payment.Paymentapi.response;

import java.util.List;

import com.activenture.payment.Paymentapi.entity.*;

public class MasterResponse {
	
	public List<Item> itemList;
	public List<State> stateList;
	
	
	
	
	
	
	

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public List<State> getStateList() {
		return stateList;
	}

	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}

}
