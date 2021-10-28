package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.*;

public class ClubDAO {
	
	private ClubDTO[] clubDTOs = new ClubDTO[10];
	private int count = 0;

	public void save(ClubDTO ref) {

		if (this.count < clubDTOs.length && ref != null) {
			this.clubDTOs[count++] = ref;
		} else {
			System.err.println("Either container is full or passed reference is null");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < clubDTOs.length) {
			clubDTOs[index] = null;
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(ClubDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < clubDTOs.length) {
				this.clubDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < clubDTOs.length; i++) {
			ClubDTO reference = clubDTOs[i];
			if (reference != null) {
				System.out.println(reference);
				System.out.println(reference.getNoOfPeople());
				System.out.println(reference.getNoOfBottle());
				System.out.println(reference.getRatings());
				System.out.println(reference.getEntryPrice());
				System.out.println(reference.getNoOfStaff());
				
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(i)));
			}
		}
	}
}



