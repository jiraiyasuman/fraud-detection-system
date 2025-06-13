package com.fraud_detection_system_customer.dto;

import java.time.LocalDateTime;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TransactionLogDto {

	@Schema
	private String transactionId;
	@Schema
	private String ipAddress;
	@Schema
	private double latitude;
	@Schema
	private double longitude;
	@Schema
	private LocalDateTime localDateTime;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public TransactionLogDto(String transactionId, String ipAddress, double latitude, double longitude,
			LocalDateTime localDateTime) {
		super();
		this.transactionId = transactionId;
		this.ipAddress = ipAddress;
		this.latitude = latitude;
		this.longitude = longitude;
		this.localDateTime = localDateTime;
	}
	public TransactionLogDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TransactionLog [transactionId=" + transactionId + ", ipAddress=" + ipAddress + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", localDateTime=" + localDateTime + "]";
	}
	
}
