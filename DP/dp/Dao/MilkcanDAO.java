package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.MilkcanDTO;

public class MilkcanDAO {
	
	private MilkcanDTO[] milkcanDTOs = new MilkcanDTO[10];
	private int octopus = 0;

	public MilkcanDTO[] getWalletDTOs() {
		return milkcanDTOs;
	}

	public void create(MilkcanDTO dto) {
		if (dto != null && this.octopus < this.milkcanDTOs.length) {
			this.milkcanDTOs[octopus++] = dto;
			System.out.println("Invoked create dto method : ".concat(String.valueOf(dto.getQuantity())));
		} else {
			System.out.println("invoked create");

		}
	}

	public void create(MilkcanDTO dto, int indexvalue) {
		System.out.println("invoked overloaded const");
		if (dto != null && indexvalue < this.milkcanDTOs.length && indexvalue > 0) {
			this.milkcanDTOs[indexvalue] = dto;
		}
		System.out.println("Either the array is full or potinting to null");
	}

	public void delete(int index) {
		if (index >= 0 && index < milkcanDTOs.length) {
			this.milkcanDTOs[index] = null;
			System.out.println("delete index is".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(MilkcanDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < milkcanDTOs.length) {
				this.milkcanDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < milkcanDTOs.length; i++) {
			MilkcanDTO reference = milkcanDTOs[i];
			if (reference != null) {
				System.out.println("index is".concat(String.valueOf(i)));
				System.out.println(reference);
				System.out.println(reference.getQuantity());
				System.out.println(reference.getShape());
				System.out.println(reference.getQuality());
				System.out.println(reference.getColor());
				System.out.println(reference.getPrice());
			} else {
				System.err.println("it is pointing to null");
			}
		}
	}
	
	public void fetch(int index)
	{
		if(index>=0 && index<milkcanDTOs.length && this.milkcanDTOs[index]!=null)
		{
			System.out.println("--------");
			System.out.print(this.milkcanDTOs[index].getPrice());
		}
		else {
			System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
		}
	}
	
	public boolean matchIplByName(String quantity) {
		System.out.println("invoked matchIplByName");
		System.out.println("team name passed".concat(quantity));
		for (int index = 0; index  < this.milkcanDTOs.length; index ++) {
			MilkcanDTO ref = this.milkcanDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(index)));
				String quantity1 = ref.getQuantity();
				System.out.println("matching".concat(quantity1));
				if (quantity1.equals(quantity1)) {
					System.out.println("quantity found");
					return true;
				}
			}
		}
		return false;
	}
}


