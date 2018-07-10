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
	private int isActive=1;
	
	@Column(name="created_user_fk")
	Long createdUserId;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="created_user_fk", referencedColumnName="id", insertable=false, updatable=false)
	private User createdBy;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="client_fk", referencedColumnName="id")
	private Client client;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<OrderInfo> orderInfo;
	
	@Column(name="total_bill_amt")
	private String totalBillingAmt;
	
	@Column(name="tax_cgst")
	private String cgst;
	
	@Column(name="tax_sgst")
	private String sgst;
	
	@Column(name="tax_igst")
	private String igst;
	
	@Column(name="gross_total")
	private String grossTotal;
	
	
	
	
	
	
	
	
	
	
	
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
	public int isActive() {
		return isActive;
	}
	public void setActive(int isActive) {
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
	public List<OrderInfo> getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(List<OrderInfo> orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getTotalBillingAmt() {
		return totalBillingAmt;
	}
	public void setTotalBillingAmt(String totalBillingAmt) {
		this.totalBillingAmt = totalBillingAmt;
	}
	public String getCgst() {
		return cgst;
	}
	public void setCgst(String cgst) {
		this.cgst = cgst;
	}
	public String getSgst() {
		return sgst;
	}
	public void setSgst(String sgst) {
		this.sgst = sgst;
	}
	public String getIgst() {
		return igst;
	}
	public void setIgst(String igst) {
		this.igst = igst;
	}
	public String getGrossTotal() {
		return grossTotal;
	}
	public void setGrossTotal(String grossTotal) {
		this.grossTotal = grossTotal;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
	
}
