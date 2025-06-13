package com.fraud_detection_system_customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity(name="user_login_details")
public class UserLoginDetails {

	@Id
	@Column(name="customer_id")
	private String customerId;
	@Column(name="password")
	private String password;
	@Column(name="otp")
	private String otp;
	@Column(name="verify_password")
	private String verifyPassword;
}
