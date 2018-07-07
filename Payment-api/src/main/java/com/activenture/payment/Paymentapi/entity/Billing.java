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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="op_billing")
public class Billing {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="created_at")
	private Date createdAt=new Date();
	
	
	@Column(name="is_active")
	private boolean isActive=true;
	
	
	@Column(name="created_user_fk")
	Long createdUserId;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="created_user_fk", referencedColumnName="id", insertable=false, updatable=false)
	private User createdBy;
	
	
	@OneToOne
	@JoinColumn(name="client_fk", referencedColumnName="id")
	private Client client;
	
	
	@Column(name="order_details_fk")
	Long orderInfoId;
	@OneToMany(mappedBy="billingId", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<OrderInfo> orderInfo;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Long getCreatedUserId() {
		return createdUserId;
	}
	public void setCreatedUserId(Long createdUserId) {
		this.createdUserId = createdUserId;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Long getOrderInfoId() {
		return orderInfoId;
	}
	public void setOrderInfoId(Long orderInfoId) {
		this.orderInfoId = orderInfoId;
	}
	public List<OrderInfo> getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(List<OrderInfo> orderInfo) {
		this.orderInfo = orderInfo;
	}
	
	
}
