package com.activenture.payment.Paymentapi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="op_order_info")
public class OrderInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="item_id_fk")
	Long itemId;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="item_id_fk", referencedColumnName="id", insertable=false, updatable=false)
	private Item item;
	
	@Column(name="item_desc")
	private String itemDesc;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private int totalItemPrice;
	
	@ManyToOne
	@JoinColumn(name="billing_id")
	private Billing billingId;

	
	
	
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalItemPrice() {
		return totalItemPrice;
	}

	public void setTotalItemPrice(int totalItemPrice) {
		this.totalItemPrice = totalItemPrice;
	}

	public Billing getBillingId() {
		return billingId;
	}

	public void setBillingId(Billing billingId) {
		this.billingId = billingId;
	}

}
