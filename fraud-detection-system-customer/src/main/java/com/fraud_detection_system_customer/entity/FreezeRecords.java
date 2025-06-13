package com.fraud_detection_system_customer.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="freeze_records")
public class FreezeRecords {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="account_number")
	private String acountNumber;
	@Column(name="freeze_type")
	private String freezeType;
	@Column(name="description")
	private String description;
	@Column(name="local_date")
	private LocalDate localDate;
	@Column(name="notes")
	private String notes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public FreezeRecords(int id, String acountNumber, String freezeType, String description, LocalDate localDate,
			String notes) {
		super();
		this.id = id;
		this.acountNumber = acountNumber;
		this.freezeType = freezeType;
		this.description = description;
		this.localDate = localDate;
		this.notes = notes;
	}
	public FreezeRecords() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FreezeRecords [id=" + id + ", acountNumber=" + acountNumber + ", freezeType=" + freezeType
				+ ", description=" + description + ", localDate=" + localDate + ", notes=" + notes + "]";
	}
		
}
