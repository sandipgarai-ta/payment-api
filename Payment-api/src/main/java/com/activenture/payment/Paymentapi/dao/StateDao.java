package com.activenture.payment.Paymentapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.payment.Paymentapi.entity.State;
import com.activenture.payment.Paymentapi.repository.StateRepository;

@Service
public class StateDao {
	@Autowired
	StateRepository stateRepo;
	
	public State saveState(State state){
		return stateRepo.save(state);
	}
	
	
	public List<State> getAllState(){
		return stateRepo.findAll();
	}

}
