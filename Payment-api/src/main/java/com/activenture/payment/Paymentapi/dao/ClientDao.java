package com.activenture.payment.Paymentapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.payment.Paymentapi.entity.Client;
import com.activenture.payment.Paymentapi.repository.ClientRepository;

@Service
public class ClientDao {
	
	@Autowired
	ClientRepository clientRepo;
	
	//SAVE A CLIENT
	public Client saveClient(Client client){
		return clientRepo.save(client);
	}
	
	
	public List<Client> getAllClient(){
		return clientRepo.findAll();
	}
}
