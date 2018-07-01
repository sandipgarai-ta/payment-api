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
@Table(name="m_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="user_id", nullable=false, unique=true)
	private String loginId;
	
	@Column(name="user_password", nullable=false)
	private String userPassword;
	
	@OneToOne
	@JoinColumn(name="user_type_fk")
	private UserType userType;
	
	@Column(name="created_at")
	private Date createdAt=new Date();
	
	@Column(name="is_active")
	private boolean isActive=true;
	
	
}
