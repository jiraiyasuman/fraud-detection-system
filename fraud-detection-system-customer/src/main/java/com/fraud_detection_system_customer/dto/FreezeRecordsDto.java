package com.fraud_detection_system_customer.dto;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class FreezeRecordsDto {

	@Schema(description = "Account Number")
	@NotNull(message = "account number cannot be null")
	private String acountNumber;
	@Schema(description="Freeze Type")
	@NotNull(message="Freeze type cannot be null")
	private String freezeType;
	@Schema(description="Description")
	@NotNull(message="description")
	private String description;
	@Schema(description="Local Date")
	@NotNull(message="Local Date cannot be null")
	private LocalDate localDate;
	@Schema(description = "notes")
	@NotNull
	private String notes;
	
	public String getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}
	public String getFreezeType() {
		return freezeType;
	}
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "FreezeRecordsDto [acountNumber=" + acountNumber + ", freezeType=" + freezeType + ", description="
				+ description + ", localDate=" + localDate + ", notes=" + notes + "]";
	}
	public FreezeRecordsDto(String acountNumber, String freezeType, String description, LocalDate localDate,
			String notes) {
		super();
		this.acountNumber = acountNumber;
		this.freezeType = freezeType;
		this.description = description;
		this.localDate = localDate;
		this.notes = notes;
	}
	public FreezeRecordsDto() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
