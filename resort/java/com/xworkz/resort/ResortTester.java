package com.xworkz.resort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.ResortServiceImpl;

public class ResortTester {

	public static void main(String[] args) {

		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);

		ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("Kanti", "Bagalkot", "Manish", 15);

		dto.setNoOfRooms(50);
		dto.setOffers(true);
		dto.setPoolExist(true);
		dto.setPhoneNo(552154545);
		dto.setRating(4.50);
		dto.setNoOfEmployees(10);
		dto.setPricePerHead(2000);

		resortService.validateAndSave(dto);
//		resortService.validateAndupdateLocationByName("Bangalore", "Shillandara");
//		resortService.validateAndupdateLocationByNameandRating("Bangalore", "Shillandara", 4.5);
//		// resortService.validateAnddeleteByNameAndLocation("Shillandara", "Bangalore");
//		// resortService.validateAndSave(dto);
//		List<ResortDTO> list2 = new ArrayList<ResortDTO>();
//
//		ResortDTO dto2 = new ResortDTO("Ramanagara", "Shillandara2", "Sharana", 15);
//
//		// dto.setNoOfRooms(50);
//		dto2.setOffers(true);
//		dto2.setPoolExist(true);
//		dto2.setPhoneNo(9986447145l);
//		dto2.setRating(4.50);
//		dto2.setNoOfEmployees(10);
//		dto2.setPricePerHead(2000);
//		list2.add(dto2);
//		resortService.validateAndaddMultipleResorts(list2);
//		
//		System.out.println("Total resort size: "+resortService.validateAndFindtotalResortSize());
		resortService.validateAndgetAll();

	}

}
