package com.activenture.payment.Paymentapi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="op_order_info")
public class OrderInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToMany
	@JoinColumn(name="item_fk")
	private List<Item> item;
	
	@Column(name="item_desc")
	private String itemDesc;
	
	@Column(name="quantity")
	private int quantity;
	
	
	
	
}
