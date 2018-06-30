package com.activenture.payment.Paymentapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@OneToOne
	@JoinColumn(name="m_user")
	private User createdBy;
	
	@OneToOne
	@JoinColumn(name="m_client")
	private Client client;
	
	

}
