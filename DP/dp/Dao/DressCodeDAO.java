package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.*;

public class DressCodeDAO {

	private DressCodeDTO[] dresscodeDTOs = new DressCodeDTO[10];
	private int count = 0;

	public void save(DressCodeDTO ref) {

		if (this.count < dresscodeDTOs.length && ref != null) {
			this.dresscodeDTOs[count++] = ref;
		} else {
			System.err.println("Either container is full or passed reference is null");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < dresscodeDTOs.length) {
			dresscodeDTOs[index] = null;
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(DressCodeDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < dresscodeDTOs.length) {
				this.dresscodeDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < dresscodeDTOs.length; i++) {
			DressCodeDTO reference = dresscodeDTOs[i];
			if (reference != null) {
				System.out.println(reference);
				System.out.println(reference.getSize());
				System.out.println(reference.getMaterial());
				System.out.println(reference.getColor());
				System.out.println(reference.getPrice());
				System.out.println(reference.getGender());

			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(i)));
			}
		}
	}
}
