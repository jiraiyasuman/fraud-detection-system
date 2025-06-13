package com.fraud_detection_system_customer.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class UserLoginDetailsDto {

	@Schema
	@NotNull
	private String customerId;
	@Schema
	@NotNull
	private String password;
	@Schema
	private String otp;
	@Schema
	private String verifyPassword;
}
