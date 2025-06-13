package com.fraud_detection_system_customer.mapper;

import com.fraud_detection_system_customer.dto.LienRecordsDto;
import com.fraud_detection_system_customer.entity.LienRecords;

public class LienRecordsMapper {

	public LienRecords mapToLienRecords(LienRecordsDto lienRecordsDto) {
		LienRecords lienRecords = new LienRecords();
		lienRecords.setAccountNumber(lienRecordsDto.getAccountNumber());
		lienRecords.setAmount(lienRecordsDto.getAmount());
		lienRecords.setDescription(lienRecordsDto.getDescription());
		lienRecords.setLocalDate(lienRecordsDto.getLocalDate());
		lienRecords.setNotes(lienRecordsDto.getNotes());
		lienRecords.setRecords(lienRecordsDto.getRecords());
		return lienRecords;
	}
	
	public LienRecordsDto mapToLienRecordsDto(LienRecords lienRecords) {
		LienRecordsDto lienRecordsDto = new LienRecordsDto();
		lienRecordsDto.setAccountNumber(lienRecords.getAccountNumber());
		lienRecordsDto.setAmount(lienRecords.getAmount());
		lienRecordsDto.setDescription(lienRecords.getDescription());
		lienRecordsDto.setLocalDate(lienRecords.getLocalDate());
		lienRecordsDto.setNotes(lienRecords.getNotes());
		lienRecordsDto.setRecords(lienRecords.getRecords());
		return lienRecordsDto;
	}
}
