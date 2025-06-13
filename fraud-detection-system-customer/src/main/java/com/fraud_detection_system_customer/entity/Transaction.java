package com.fraud_detection_system_customer.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name="transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="cust_id")
	private int custId;
	@Column(name="amount")
	private double amount;
	@Id
	@Column(name="transaction_id",unique=true)
	private String transactionId;
	@Column(name="debit_account_number")
	private long debitAccountNumber;
	@Column(name="credit_account_number")
	private long creditAccountNumber;
	@Column(name="currency")
	private String currency;
	@Column(name="local_date_time")
	private LocalDateTime localDateTime;
	@Column(name="merchant_risk")
	private boolean merchantRisk;
	@Column(name="time_since_last_transaction")
	private LocalDateTime timeSinceLastTransaction;
	@Column(name="is_night")
	private boolean isNight;
	@Column(name="is_day")
	private boolean isDay;
	@Column(name="user_activity_last_24_hours")
	private boolean userActivityLast24Hours;
	@Column(name="is_merchant")
	private boolean isMerchant;
	@Column(name="naration")
	private String naration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public long getDebitAccountNumber() {
		return debitAccountNumber;
	}
	public void setDebitAccountNumber(long debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}
	public long getCreditAccountNumber() {
		return creditAccountNumber;
	}
	public void setCreditAccountNumber(long creditAccountNumber) {
		this.creditAccountNumber = creditAccountNumber;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public boolean isMerchantRisk() {
		return merchantRisk;
	}
	public void setMerchantRisk(boolean merchantRisk) {
		this.merchantRisk = merchantRisk;
	}
	public LocalDateTime getTimeSinceLastTransaction() {
		return timeSinceLastTransaction;
	}
	public void setTimeSinceLastTransaction(LocalDateTime timeSinceLastTransaction) {
		this.timeSinceLastTransaction = timeSinceLastTransaction;
	}
	public boolean isNight() {
		return isNight;
	}
	public void setNight(boolean isNight) {
		this.isNight = isNight;
	}
	public boolean isDay() {
		return isDay;
	}
	public void setDay(boolean isDay) {
		this.isDay = isDay;
	}
	public boolean isUserActivityLast24Hours() {
		return userActivityLast24Hours;
	}
	public void setUserActivityLast24Hours(boolean userActivityLast24Hours) {
		this.userActivityLast24Hours = userActivityLast24Hours;
	}
	public boolean isMerchant() {
		return isMerchant;
	}
	public void setMerchant(boolean isMerchant) {
		this.isMerchant = isMerchant;
	}
	public String getNaration() {
		return naration;
	}
	public void setNaration(String naration) {
		this.naration = naration;
	}
	public Transaction(int id, int custId, double amount, String transactionId, long debitAccountNumber,
			long creditAccountNumber, String currency, LocalDateTime localDateTime, boolean merchantRisk,
			LocalDateTime timeSinceLastTransaction, boolean isNight, boolean isDay, boolean userActivityLast24Hours,
			boolean isMerchant, String naration) {
		super();
		this.id = id;
		this.custId = custId;
		this.amount = amount;
		this.transactionId = transactionId;
		this.debitAccountNumber = debitAccountNumber;
		this.creditAccountNumber = creditAccountNumber;
		this.currency = currency;
		this.localDateTime = localDateTime;
		this.merchantRisk = merchantRisk;
		this.timeSinceLastTransaction = timeSinceLastTransaction;
		this.isNight = isNight;
		this.isDay = isDay;
		this.userActivityLast24Hours = userActivityLast24Hours;
		this.isMerchant = isMerchant;
		this.naration = naration;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", custId=" + custId + ", amount=" + amount + ", transactionId="
				+ transactionId + ", debitAccountNumber=" + debitAccountNumber + ", creditAccountNumber="
				+ creditAccountNumber + ", currency=" + currency + ", localDateTime=" + localDateTime
				+ ", merchantRisk=" + merchantRisk + ", timeSinceLastTransaction=" + timeSinceLastTransaction
				+ ", isNight=" + isNight + ", isDay=" + isDay + ", userActivityLast24Hours=" + userActivityLast24Hours
				+ ", isMerchant=" + isMerchant + ", naration=" + naration + "]";
	}
	
}
