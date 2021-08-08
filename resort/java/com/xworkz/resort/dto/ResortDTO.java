package com.xworkz.resort.dto;
public class ResortDTO {

	private String location;
	private String name;
	private double pricePerHead;
	private double rating;
	private long phoneNo;
	private boolean offers;
	private String managerName;
	private int noOfEmployees;
	private boolean poolExist;
	private int noOfRooms;

	public ResortDTO() {

	}

	/**
	 * @param location
	 * @param name
	 * @param managerName
	 * @param noOfRooms
	 */
	public ResortDTO(String location, String name, String managerName, int noOfRooms) {
		super();
		this.location = location;
		this.name = name;
		this.managerName = managerName;
		this.noOfRooms = noOfRooms;
	}

	@Override
	public String toString() {
		return "ResortDTO [location=" + location + ", name=" + name + ", pricePerHead=" + pricePerHead + ", rating="
				+ rating + ", phoneNo=" + phoneNo + ", offers=" + offers + ", managerName=" + managerName
				+ ", noOfEmployees=" + noOfEmployees + ", poolExist=" + poolExist + ", noOfRooms=" + noOfRooms + "]";
	}

	public double getPricePerHead() {
		return pricePerHead;
	}

	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double d) {
		this.rating = d;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isOffers() {
		return offers;
	}

	public void setOffers(boolean offers) {
		this.offers = offers;
	}

	public boolean isPoolExist() {
		return poolExist;
	}

	public void setPoolExist(boolean poolExist) {
		this.poolExist = poolExist;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public String getManagerName() {
		return managerName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");
		ResortDTO dto = (ResortDTO)obj;
		if(this.getName().equals(dto.getName())) {
			return true;
		}
		return false;
	}

}