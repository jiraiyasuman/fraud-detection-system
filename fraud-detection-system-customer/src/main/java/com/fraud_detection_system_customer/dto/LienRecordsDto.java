package com.fraud_detection_system_customer.dto;
import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class LienRecordsDto {

	@Schema
	@NotNull
	private String accountNumber;
	@Schema
	@NotNull
	private String records;
	@Schema
	@NotNull
	private String description;
	@Schema
	@NotNull
	private LocalDate localDate;
	@Schema
	@NotNull
	private double amount;
	@Schema
	@NotNull
	private String notes;
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
	public LienRecordsDto(@NotNull String accountNumber, @NotNull String records, @NotNull String description,
			@NotNull LocalDate localDate, @NotNull double amount, @NotNull String notes) {
		super();
		this.accountNumber = accountNumber;
		this.records = records;
		this.description = description;
		this.localDate = localDate;
		this.amount = amount;
		this.notes = notes;
	}
	public LienRecordsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LienRecords [accountNumber=" + accountNumber + ", records=" + records + ", description=" + description
				+ ", localDate=" + localDate + ", amount=" + amount + ", notes=" + notes + "]";
	}
	
}
