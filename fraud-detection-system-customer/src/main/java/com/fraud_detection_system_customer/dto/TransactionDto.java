package com.fraud_detection_system_customer.dto;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class TransactionDto {

	
	@Schema
	private int custId;
	@Schema
	@NotNull
	private double amount;
	@Schema
	@NotNull
	private String transactionId;
	@Schema
	@NotNull
	private long debitAccountNumber;
	@Schema
	@NotNull
	private long creditAccountNumber;
	@Schema
	
	private String currency;
	@Schema
	private LocalDateTime localDateTime;
	
	@Schema
	private boolean merchantRisk;
	@Schema
	private LocalDateTime timeSinceLastTransaction;
	@Schema
	private boolean isNight;
	@Schema
	private boolean isDay;
	@Schema
	private boolean userActivityLast24Hours;
	@Schema
	private boolean isMerchant;
	@Schema
	@NotNull
	private String naration;
		
}
