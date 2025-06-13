package com.fraud_detection_system_customer.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name="transaction_log")
public class TransactionLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="transaction_id")
	private String transactionId;
	@Column(name="ip_address")
	private String ipAddress;
	@Column(name="latitude")
	private double latitude;
	@Column(name="longitude")
	private double longitude;
	@Column(name="local_date_time")
	private LocalDateTime localDateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public TransactionLog(int id, String transactionId, String ipAddress, double latitude, double longitude,
			LocalDateTime localDateTime) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.ipAddress = ipAddress;
		this.latitude = latitude;
		this.longitude = longitude;
		this.localDateTime = localDateTime;
	}
	public TransactionLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TransactionLog [id=" + id + ", transactionId=" + transactionId + ", ipAddress=" + ipAddress
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", localDateTime=" + localDateTime + "]";
	}
	
}
