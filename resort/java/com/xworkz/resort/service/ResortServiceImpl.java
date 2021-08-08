package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {

	private ResortDAO dao;

	public ResortServiceImpl(ResortDAO dao) {
		this.dao = dao;
	}

	boolean valid = false;

	@Override
	public void validateAndSave(ResortDTO dto) {
		System.out.println("invoked validateAndSave");
		System.out.println("arg1 " + dto);
		if (dto != null) {
			String name = dto.getName();
			if (name != null && name.length() >= 3 && !name.contains(" ") && !name.isEmpty()) {
				valid = true;
				System.out.println("The name is valid,now validating the location...");
				String location = dto.getLocation();
				if (location != null && location.length() >= 3 && !location.contains(" ") && !location.isEmpty()) {
					valid = true;
					for (int i = 0; i < location.length(); i++) {
						int var = (int) location.charAt(i);
						if (var > 96 && var < 123 || var > 64 && var < 91) {
							valid = true;
							continue;

						} else {
							System.out.println("The location can not contain any special characters");
							valid = false;
							break;
						}
					}
					if (valid) {
						System.out.println("The location is valid,now validating the Manager name...");
						String managerName = dto.getManagerName();
						if (managerName != null && managerName.length() >= 3 && !managerName.contains(" ")
								&& !managerName.isEmpty()) {
							valid = true;
							System.out.println("The Manager name is valid,now validating the number of Employees..");
							int noOfEmployess = dto.getNoOfEmployees();
							if (noOfEmployess > 0 && noOfEmployess <= 100) {
								valid = true;
								System.out.println(
										"The number of Employees is valid,now validating the number of Rooms..");
								int noOfRooms = dto.getNoOfRooms();
								if (noOfRooms > 10 && noOfRooms < 101) {
									valid = true;
									System.out
											.println("The number of rooms is valid,now validating the Phone number..");
									long phoneNo = dto.getPhoneNo();
									if (phoneNo > 5999999999l && phoneNo < 10000000000l) {
										valid = true;
										System.out.println(
												"The Phone number is valid,now validating the Price per head..");
										double pricePerHead = dto.getPricePerHead();
										if (pricePerHead >= 1000 && pricePerHead < 10001) {
											valid = true;
											System.out
													.println("The price per head is valid,now validating the ratings");
											double rating = dto.getRating();
											if (rating > 0 && rating <= 5) {
												valid = true;
												System.out.println("The ratings are valid,invoking the DAO to save the DTO");
												dao.save(dto);
											} else {
												valid = false;
												System.out.println("The ratings are invalid");
											}

										} else {
											valid = false;
											System.out.println("The price per head is invalid");
										}
									} else {
										valid = false;
										System.out.println("The Phone number is invalid");
									}

								} else {
									valid = false;
									System.out.println("The number of rooms is invalid");
								}

							} else {
								valid = false;
								System.out.println("The number of Employees is invalid");
							}

						} else {
							valid = false;
							System.out.println("The Manager name is invalid");
						}

					} else {
						valid = false;
						System.out.println("The location is invalid");
					}
				}
			} else {
				valid = false;
				System.out.println("The name is invalid");
			}

		}

		else {
			System.out.println("dto is null");
		}

	}

	@Override
	public boolean validateAndupdateLocationByName(String location, String name) {

		if (valid) {

			if (location != null && location.length() >= 3 && !location.isEmpty() && !location.contains(" ")) {

				valid = true;
				System.out.println("Location is valid,validating name....");
				if (name != null && name.length() >= 3 && !name.isEmpty() && !name.contains(" ")) {
					valid = true;
					System.out.println("The name is also valid ,invoking 'updateLocationByName dao...'");
					dao.updateLocationByName(location, name);
					return valid;
				} else {
					valid = false;
					System.out.println("The name is not valid, can not update");
					return valid;
				}

			} else {

				valid = false;
				System.out.println("invalid location, can not update");
				return false;

			}

		}

		return false;
	}

	@Override
	public boolean validateAndupdateLocationByNameandRating(String location, String name, double rating) {

		if (location != null && location.length() >= 3 && !location.isEmpty() && !location.contains(" ")) {

			valid = true;
			System.out.println("Location is valid,validating name....");
			if (name != null && name.length() >= 3 && !name.isEmpty() && !name.contains(" ")) {
				valid = true;
				System.out.println("The name is also valid ,validating ratings...");
				if (rating > 0 && rating < 5) {
					System.out.println("The rating is also valid,invoking updateLocationByNameandRating DAO..");
					dao.updateLocationByNameandRating(location, name, rating);
					valid = true;
					return valid;
				} else {
					System.out.println("invalid rating,can not update");
					valid = false;
					return valid;
				}

			} else {
				valid = false;
				System.out.println("The name is not valid, can not update");
				return valid;
			}

		} else {

			valid = false;
			System.out.println("invalid location, can not update");
			return false;

		}

	}

	@Override
	public boolean validateAnddeleteByNameAndLocation(String name, String location) {

		if (location != null && location.length() >= 3 && !location.isEmpty() && !location.contains(" ")) {

			valid = true;
			System.out.println("Location is valid,validating name....");
			if (name != null && name.length() >= 3 && !name.isEmpty() && !name.contains(" ")) {
				valid = true;
				System.out.println("The name is also valid ,invoking deleteByNameAndLocation DAO");
				dao.deleteByNameAndLocation(name, location);
				return true;
			} else {
				System.out.println("The name is not valid, can not delete");
				valid = false;
				return valid;
			}
		} else {
			System.out.println("The Location is not valid,can not delete");
			return false;
		}

	}

	@Override
	public boolean validateAndaddMultipleResorts(List<ResortDTO> dtos) {

		if (dtos != null) {
			if (dtos.size() != 0) {

				System.out.println("Data is valid,trying to add...");

				for (ResortDTO resortDTO : dtos) {
					validateAndSave(resortDTO);
				}
				System.out.println("Added the multiple dtos passed.");

				return true;

			} else {
				System.out.println("Can not add an empty list");
				return false;
			}

		} else {
			System.out.println("Cannot add null");
			return false;
		}

	}

	@Override
	public int validateAndFindtotalResortSize() {

		return dao.totalResortSize();
	}

	@Override
	public List<ResortDTO> validateAndgetAll() {

		return dao.getAll();
	}

}