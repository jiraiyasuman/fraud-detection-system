package com.fraud_detection_system_customer.mapper;

import com.fraud_detection_system_customer.dto.SingleSavingsAccountDetailsDto;
import com.fraud_detection_system_customer.entity.SingleSavingsAccountDetails;

public class SingleSavingsAccountDetailsMapper {

	public SingleSavingsAccountDetails mapToSingleSavingsAccountDetails(SingleSavingsAccountDetailsDto singleSavingsAccountDetailsDto) {
		SingleSavingsAccountDetails singleSavingsAccountDetails = new SingleSavingsAccountDetails();
		singleSavingsAccountDetails.setAccountNumber(singleSavingsAccountDetailsDto.getAccountNumber());
		singleSavingsAccountDetails.setAddress(singleSavingsAccountDetailsDto.getAddress());
		singleSavingsAccountDetails.setAddressProof(singleSavingsAccountDetailsDto.getAddressProof());
		singleSavingsAccountDetails.setAdhaarCardNumber(singleSavingsAccountDetailsDto.getAdhaarCardNumber());
		singleSavingsAccountDetails.setBalance(singleSavingsAccountDetailsDto.getBalance());
		singleSavingsAccountDetails.setCustomerId(singleSavingsAccountDetailsDto.getCustomerId());
		singleSavingsAccountDetails.setDateOfBirth(singleSavingsAccountDetailsDto.getDateOfBirth());
		singleSavingsAccountDetails.setEducation(singleSavingsAccountDetailsDto.getEducation());
		singleSavingsAccountDetails.setEmail(singleSavingsAccountDetailsDto.getEmail());
		singleSavingsAccountDetails.setEmployment(singleSavingsAccountDetailsDto.getEmployment());
		singleSavingsAccountDetails.setFatherName(singleSavingsAccountDetailsDto.getFatherName());
		singleSavingsAccountDetails.setFirstAccountHolderName(singleSavingsAccountDetailsDto.getFirstAccountHolderName());
		singleSavingsAccountDetails.setFreeze(singleSavingsAccountDetailsDto.isFreeze());
		singleSavingsAccountDetails.setIdproof(singleSavingsAccountDetailsDto.getIdproof());
		singleSavingsAccountDetails.setIfscCode(singleSavingsAccountDetailsDto.getIfscCode());
		singleSavingsAccountDetails.setLien(singleSavingsAccountDetailsDto.isLien());
		singleSavingsAccountDetails.setMobileNumber(singleSavingsAccountDetailsDto.getMobileNumber());
		singleSavingsAccountDetails.setMotherName(singleSavingsAccountDetailsDto.getMotherName());
		singleSavingsAccountDetails.setNomineeAddress(singleSavingsAccountDetailsDto.getNomineeAddress());  
		singleSavingsAccountDetails.setNomineeDateOfBirth(singleSavingsAccountDetailsDto.getNomineeDateOfBirth());
		singleSavingsAccountDetails.setNomineeName(singleSavingsAccountDetailsDto.getNomineeName());
		singleSavingsAccountDetails.setNomineeRelation(singleSavingsAccountDetailsDto.getNomineeRelation());
		singleSavingsAccountDetails.setPanCardNumber(singleSavingsAccountDetailsDto.getPanCardNumber());
		singleSavingsAccountDetails.setSalaryRange(singleSavingsAccountDetailsDto.getSalaryRange());
		return singleSavingsAccountDetails;
	}
	
	
}
