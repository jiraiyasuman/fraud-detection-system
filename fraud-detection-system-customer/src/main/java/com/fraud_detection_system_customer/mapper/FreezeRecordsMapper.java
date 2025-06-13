package com.fraud_detection_system_customer.mapper;

import com.fraud_detection_system_customer.dto.FreezeRecordsDto;
import com.fraud_detection_system_customer.entity.FreezeRecords;

public class FreezeRecordsMapper {

	public FreezeRecords mapToFreezeRecords(FreezeRecordsDto freezeRecordsDto) {
		FreezeRecords freezeRecords = new FreezeRecords();
		freezeRecords.setAcountNumber(freezeRecordsDto.getAcountNumber());
		freezeRecords.setDescription(freezeRecordsDto.getDescription());
		freezeRecords.setFreezeType(freezeRecordsDto.getFreezeType());
		freezeRecords.setNotes(freezeRecordsDto.getNotes());
		freezeRecords.setLocalDate(freezeRecordsDto.getLocalDate());
		return freezeRecords;
	}
	public FreezeRecordsDto mapToFreezeRecordsDto(FreezeRecords freezeRecords) {
		FreezeRecordsDto freezeRecordsDto = new FreezeRecordsDto();
		freezeRecordsDto.setAcountNumber(freezeRecords.getAcountNumber());
		freezeRecordsDto.setDescription(freezeRecordsDto.getFreezeType());
		freezeRecordsDto.setLocalDate(freezeRecordsDto.getLocalDate());
		freezeRecordsDto.setNotes(freezeRecords.getNotes());
		freezeRecordsDto.setFreezeType(freezeRecords.getFreezeType());
		return freezeRecordsDto;
	}
	
	
}
