package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {

	void validateAndSave(ResortDTO dto);

	boolean validateAndupdateLocationByName(String location, String name);

	boolean validateAndupdateLocationByNameandRating(String location, String name, double ratings);

	boolean validateAnddeleteByNameAndLocation(String name, String location);

	boolean validateAndaddMultipleResorts(List<ResortDTO> dtos);

	int validateAndFindtotalResortSize();

	List<ResortDTO> validateAndgetAll();

}

