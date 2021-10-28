package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.*;

public class TempleDAO {

	private TempleDTO[] templeDTOs = new TempleDTO[10];
	private int count = 0;

	public void save(TempleDTO ref) {

		if (this.count < templeDTOs.length && ref != null) {
			this.templeDTOs[count++] = ref;
		} else {
			System.err.println("Either container is full or passed reference is null");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < templeDTOs.length) {
			templeDTOs[index] = null;
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(TempleDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < templeDTOs.length) {
				this.templeDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < templeDTOs.length; i++) {
			TempleDTO reference = templeDTOs[i];
			
			if (reference != null) {
				System.out.println(reference);
				System.out.println(reference.getName());
				System.out.println(reference.getLocation());
				System.out.println(reference.getMainGod());
				System.out.println(reference.getPrasada());
				System.out.println(reference.getYestGante());
				
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(i)));
			}
		}
	}
}
