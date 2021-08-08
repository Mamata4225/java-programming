package com.xworkz.resort.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.ResortServiceImpl;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortDTOs) {
		System.out.println("Created ResortDAOImpl");
		this.resortList = resortDTOs;
	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("invoked save in dao");
		if(!this.resortList.contains(dto)) {
		boolean added = this.resortList.add(dto);
		System.out.println("added " + added);
		return added;
		}
		else {
			System.out.println("The DTO "+dto.getName()+" is already present!!");
			return false;
		}
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		for (ResortDTO resortDTO : resortList) {
			if(resortDTO.getName().equals(name)) {
				resortDTO.setLocation(location);
				System.out.println("The location updated to : "+resortDTO.getLocation());
				return true;
			}
		}
	    System.out.println("DTO with name : "+name+" not available,can not update");
		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, double rating) {
		
		for (ResortDTO resortDTO : resortList) {
			if(resortDTO.getName().equals(name) && resortDTO.getRating()==rating) {
				resortDTO.setLocation(location);
				System.out.println("The location updated to : "+resortDTO.getLocation());
				return true;
			}
		}
	    System.out.println("DTO with name : "+name+" and Rating: "+rating+" not available,can not update");
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		Iterator<ResortDTO> iterator = resortList.iterator();
		while(iterator.hasNext()) {
			ResortDTO resortDTO = iterator.next();
			if(resortDTO.getName().equals(name) && resortDTO.getLocation().equals(location)) {
				iterator.remove();
				System.out.println("DTO deletion succefull!!");
				return true;
			}
		}
		System.out.println("DTO matching the name: "+name+" and location: "+location+" was not found.Can not delete");
		return false;
	}

	

	@Override
	public int totalResortSize() {
		System.out.println("Invoked totalResortSize");
		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> getAll() {
		System.out.println("Invoked getAll");
		return this.resortList;
	}

}
