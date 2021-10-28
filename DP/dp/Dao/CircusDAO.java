package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.CircusDTO;

public class CircusDAO {
	
	private CircusDTO[] circusDTOs = new CircusDTO[10];
	private int counter = 0;

	public CircusDTO[] getWalletDTOs() {
		return circusDTOs;
	}

	public void create(CircusDTO dto) {
		if (dto != null && this.counter < this.circusDTOs.length) {
			this.circusDTOs[counter++] = dto;
			System.out.println("Invoked create dto method : ".concat(String.valueOf(dto.getOwner())));
		} else {
			System.out.println("invoked create");

		}
	}

	public void create(CircusDTO dto, int indexvalue) {
		System.out.println("invoked overloaded const");
		if (dto != null && indexvalue < this.circusDTOs.length && indexvalue > 0) {
			this.circusDTOs[indexvalue] = dto;
		}
		System.out.println("Either the array is full or potinting to null");
	}

	public void delete(int index) {
		if (index >= 0 && index < circusDTOs.length) {
			this.circusDTOs[index] = null;
			System.out.println("delete index is".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(CircusDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < circusDTOs.length) {
				this.circusDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < circusDTOs.length; i++) {
			CircusDTO reference = circusDTOs[i];
			if (reference != null) {
				System.out.println("index is".concat(String.valueOf(i)));
				System.out.println(reference);
				System.out.println(reference.getOwner());
				System.out.println(reference.getTicketPrice());
				System.out.println(reference.getNoOfAnimals());
				System.out.println(reference.getNoOfShows());
				System.out.println(reference.getDuration());
			} else {
				System.err.println("it is pointing to null");
			}
		}
	}
	
	public void fetch(int index)
	{
		if(index>=0 && index<circusDTOs.length && this.circusDTOs[index]!=null)
		{
			System.out.println("--------");
			System.out.print(this.circusDTOs[index].getOwner());
		}
		else {
			System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
		}
	}
	
	public boolean matchIplByName(String owner) {
		System.out.println("invoked matchIplByName");
		System.out.println("team name passed".concat(owner));
		for (int index = 0; index  < this.circusDTOs.length; index ++) {
			CircusDTO ref = this.circusDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(index)));
				String owner1 = ref.getOwner();
				System.out.println("matching".concat(owner1));
				if (owner1.equals(owner1)) {
					System.out.println("team name found");
					return true;
				}
			}
		}
		return false;
	}
}
	



