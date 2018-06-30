package com.activenture.payment.Paymentapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="op_order_info")
public class OrderInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
}
