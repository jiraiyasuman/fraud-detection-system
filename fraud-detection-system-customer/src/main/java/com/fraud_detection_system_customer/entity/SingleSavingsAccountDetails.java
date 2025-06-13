package com.fraud_detection_system_customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity(name="single_savings_account_details")
public class SingleSavingsAccountDetails {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="first_account_holder_name")
	private String firstAccountHolderName;
	@Column(name="address")
	private String address;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="email",unique=true)
	private String email;
	@Column(name="father_name")
	private String fatherName;
	@Column(name="mother_name")
	private String motherName;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="nominee_name")
	private String nomineeName;
	@Column(name="nominee_address")
	private String nomineeAddress;
	@Column(name="nominee_date_of_birth")
	private String nomineeDateOfBirth;
	@Column(name="nominee_relation")
	private String nomineeRelation;
	@Column(name="adhaar_card_number",unique=true)
	private String adhaarCardNumber;
	@Column(name="pan_card_number",unique=true)
	private String panCardNumber;
	@Column(name="account_number",unique=true)
	private String accountNumber;
	@Column(name="ifsc_code")
	private String ifscCode;
	@Column(name="customer_id",unique=true)
	private String customerId;
	@Column(name="salary_range")
	private String salaryRange;
	@Column(name="employment")
	private String employment;
	@Column(name="education")
	private String education;
	@Column(name="id_proof")
	private String idproof;
	@Column(name="address_proof")
	private String addressProof;
	@Column(name="balance")
	private double balance;
	@Column(name="is_lien")
	private boolean isLien;
	@Column(name="is_freeze")
	private boolean isFreeze;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public SingleSavingsAccountDetails(int id, String firstAccountHolderName, String address, String mobileNumber,
			String email, String fatherName, String motherName, String dateOfBirth, String nomineeName,
			String nomineeAddress, String nomineeDateOfBirth, String nomineeRelation, String adhaarCardNumber,
			String panCardNumber, String accountNumber, String ifscCode, String customerId, String salaryRange,
			String employment, String education, String idproof, String addressProof, double balance, boolean isLien,
			boolean isFreeze) {
		super();
		this.id = id;
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
	public SingleSavingsAccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SingleSavingsAccountDetails [id=" + id + ", firstAccountHolderName=" + firstAccountHolderName
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", dateOfBirth=" + dateOfBirth + ", nomineeName="
				+ nomineeName + ", nomineeAddress=" + nomineeAddress + ", nomineeDateOfBirth=" + nomineeDateOfBirth
				+ ", nomineeRelation=" + nomineeRelation + ", adhaarCardNumber=" + adhaarCardNumber + ", panCardNumber="
				+ panCardNumber + ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", customerId="
				+ customerId + ", salaryRange=" + salaryRange + ", employment=" + employment + ", education="
				+ education + ", idproof=" + idproof + ", addressProof=" + addressProof + ", balance=" + balance
				+ ", isLien=" + isLien + ", isFreeze=" + isFreeze + "]";
	}
	
}
