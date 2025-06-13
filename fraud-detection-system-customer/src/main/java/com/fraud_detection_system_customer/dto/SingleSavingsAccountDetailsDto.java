package com.fraud_detection_system_customer.dto;

import java.lang.annotation.Native;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class SingleSavingsAccountDetailsDto {

	@Schema
	@NotNull
	private String firstAccountHolderName;
	@Schema
	@NotNull
	private String address;
	@Schema
	@NotNull
	private String mobileNumber;
	@Schema
	@Email
	@NotNull
	private String email;
	@Schema
	@NotNull
	private String fatherName;
	@Schema
	@NotNull
	private String motherName;
	@Schema
	@NotNull
	private String dateOfBirth;
	@Schema
	@NotNull
	private String nomineeName;
	@Schema
	@NotNull
	private String nomineeAddress;
	@Schema
	@NotNull
	private String nomineeDateOfBirth;
	@Schema
	@NotNull
	private String nomineeRelation;
	@Schema
	@NotNull
	private String adhaarCardNumber;
	@Schema
	@NotNull
	private String panCardNumber;
	@Schema
	private String accountNumber;
	@Schema
	private String ifscCode;
	@Schema
	private String customerId;
	@Schema
	@NotNull
	private String salaryRange;
	@Schema
	@NotNull
	private String employment;
	@Schema
	@NotNull
	private String education;
	@Schema
	@NotNull
	private String idproof;
	@Schema
	@NotNull
	private String addressProof;
	@Schema
	@NotNull
	private double balance;
	@Schema
	@NotNull
	private boolean isLien;
	@Schema
	@NotNull
	private boolean isFreeze;
	public String getFirstAccountHolderName() {
		return firstAccountHolderName;
	}
	public void setFirstAccountHolderName(String firstAccountHolderName) {
		this.firstAccountHolderName = firstAccountHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeAddress() {
		return nomineeAddress;
	}
	public void setNomineeAddress(String nomineeAddress) {
		this.nomineeAddress = nomineeAddress;
	}
	public String getNomineeDateOfBirth() {
		return nomineeDateOfBirth;
	}
	public void setNomineeDateOfBirth(String nomineeDateOfBirth) {
		this.nomineeDateOfBirth = nomineeDateOfBirth;
	}
	public String getNomineeRelation() {
		return nomineeRelation;
	}
	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}
	public String getAdhaarCardNumber() {
		return adhaarCardNumber;
	}
	public void setAdhaarCardNumber(String adhaarCardNumber) {
		this.adhaarCardNumber = adhaarCardNumber;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getSalaryRange() {
		return salaryRange;
	}
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}
	public String getEmployment() {
		return employment;
	}
	public void setEmployment(String employment) {
		this.employment = employment;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isLien() {
		return isLien;
	}
	public void setLien(boolean isLien) {
		this.isLien = isLien;
	}
	public boolean isFreeze() {
		return isFreeze;
	}
	public void setFreeze(boolean isFreeze) {
		this.isFreeze = isFreeze;
	}
	public SingleSavingsAccountDetailsDto(@NotNull String firstAccountHolderName, @NotNull String address,
			@NotNull String mobileNumber, @Email @NotNull String email, @NotNull String fatherName,
			@NotNull String motherName, @NotNull String dateOfBirth, @NotNull String nomineeName,
			@NotNull String nomineeAddress, @NotNull String nomineeDateOfBirth, @NotNull String nomineeRelation,
			@NotNull String adhaarCardNumber, @NotNull String panCardNumber, @NotNull String accountNumber,
			@NotNull String ifscCode, @NotNull String customerId, @NotNull String salaryRange,
			@NotNull String employment, @NotNull String education, @NotNull String idproof,
			@NotNull String addressProof, @NotNull double balance, @NotNull boolean isLien, @NotNull boolean isFreeze) {
		super();
		this.firstAccountHolderName = firstAccountHolderName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dateOfBirth = dateOfBirth;
		this.nomineeName = nomineeName;
		this.nomineeAddress = nomineeAddress;
		this.nomineeDateOfBirth = nomineeDateOfBirth;
		this.nomineeRelation = nomineeRelation;
		this.adhaarCardNumber = adhaarCardNumber;
		this.panCardNumber = panCardNumber;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.customerId = customerId;
		this.salaryRange = salaryRange;
		this.employment = employment;
		this.education = education;
		this.idproof = idproof;
		this.addressProof = addressProof;
		this.balance = balance;
		this.isLien = isLien;
		this.isFreeze = isFreeze;
	}
	public SingleSavingsAccountDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SingleSavingsAccountDetails [firstAccountHolderName=" + firstAccountHolderName + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", dateOfBirth=" + dateOfBirth + ", nomineeName=" + nomineeName + ", nomineeAddress="
				+ nomineeAddress + ", nomineeDateOfBirth=" + nomineeDateOfBirth + ", nomineeRelation=" + nomineeRelation
				+ ", adhaarCardNumber=" + adhaarCardNumber + ", panCardNumber=" + panCardNumber + ", accountNumber="
				+ accountNumber + ", ifscCode=" + ifscCode + ", customerId=" + customerId + ", salaryRange="
				+ salaryRange + ", employment=" + employment + ", education=" + education + ", idproof=" + idproof
				+ ", addressProof=" + addressProof + ", balance=" + balance + ", isLien=" + isLien + ", isFreeze="
				+ isFreeze + "]";
	}
	
}
