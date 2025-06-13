package com.fraud_detection_system_customer.entity;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name="lien_records")
public class LienRecords {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="account_number")
	private String accountNumber;
	@Column(name="records")
	private String records;
	@Column(name="description")
	private String description;
	@Column(name="local_date")
	private LocalDate localDate;
	@Column(name="amount")
	private double amount;
	@Column(name="notes")
	private String notes;
	public LienRecords(int id, String accountNumber, String records, String description, LocalDate localDate,
			double amount, String notes) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.records = records;
		this.description = description;
		this.localDate = localDate;
		this.amount = amount;
		this.notes = notes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getRecords() {
		return records;
	}
	public void setRecords(String records) {
		this.records = records;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public LienRecords() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LienRecords [id=" + id + ", accountNumber=" + accountNumber + ", records=" + records + ", description="
				+ description + ", localDate=" + localDate + ", amount=" + amount + ", notes=" + notes + "]";
	}
	
}
