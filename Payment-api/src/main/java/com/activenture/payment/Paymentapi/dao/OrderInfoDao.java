package com.activenture.payment.Paymentapi.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.activenture.payment.Paymentapi.entity.OrderInfo;
import com.activenture.payment.Paymentapi.repository.OrderInfoRepository;

@Service
public class OrderInfoDao {
	OrderInfoRepository orderInfoRepo;
	
	//SAVE ORDER-INFO
	public OrderInfo saveOrderInfo(OrderInfo orderInfo){
		return orderInfoRepo.save(orderInfo);
	}
	
	//FETCH ALL ORDER-INFO
	public List<OrderInfo> getAllOrderInfo(){
		return orderInfoRepo.findAll();
	}
}
